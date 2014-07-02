package org.csu.slicing.evaluation;

import java.io.FileInputStream;
import java.io.InputStream;
import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.csu.slicing.util.EMFHelper;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageRegistryImpl;
import org.eclipse.ocl.OCL;
import org.eclipse.ocl.OCLInput;
import org.eclipse.ocl.Query;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.EcoreEnvironmentFactory;
import org.eclipse.ocl.expressions.OCLExpression;
import org.eclipse.ocl.helper.OCLHelper;

/**
 * http://help.eclipse.org/juno/index.jsp?topic=%2Forg.eclipse.ocl.doc%2Fhelp%2FEvaluatingConstraints.html&cp=49_5_1
 * @author sun
 *
 */
public class Evaluator {
	
	public Evaluator() {
	}
	
	private List<Object> check(EPackage ePkg, List<EObject> eObjs, String oclFilePath, Set<String> selectedInvs) {
		EPackage.Registry registry = new EPackageRegistryImpl();
		
		if (ePkg == null)
			return null;
		
		registry.put(ePkg.getNsURI(), ePkg);
		
		EcoreEnvironmentFactory environmentFactory = new EcoreEnvironmentFactory(registry);
		OCL ocl = OCL.newInstance(environmentFactory);
		
		Map<String, Constraint> constraintMap = new HashMap<String, Constraint>();
		
		// parse the contents as an OCL document
		try {
			InputStream in = new FileInputStream(oclFilePath);	
			OCLInput input = new OCLInput(in);
			List<Constraint> constraints = ocl.parse(input);
		    
		    for (Constraint next : constraints) {
		    	
		    	if (selectedInvs == null || selectedInvs.size() == 0 ||
		    			selectedInvs.contains(next.getName())) {
		    		constraintMap.put(next.getName(), next);
		    	}
		       
		        //OCLExpression<EClassifier> body = next.getSpecification().getBodyExpression();
		        //System.out.printf("%s: %s%n", next.getName(), body);
		        //for (EObject eObj : next.getConstrainedElements()) {
		        //	System.out.println(eObj);
		        //}
		    }   
		    in.close();
		} catch(Exception e) {
			e.printStackTrace();
		}	
		
		
		long startTime = System.currentTimeMillis();
		
		//Map<String, Map<EObject, Boolean>> result = new HashMap<String, Map<EObject, Boolean>>();
		
		// Class name <--> objects mapping
		// Cannot use class <--> objects mapping for .oclxmi file because reading ocl from .oclxmi file cannot binding the 
		// class model with the ocl constraint
		Map<EClass, Set<EObject>> clsObjs = new HashMap<EClass, Set<EObject>>(); 
		
		for (EClassifier eClsf : ePkg.getEClassifiers()) {
			if (eClsf instanceof EClass) {
				EClass eCls = (EClass) eClsf;
				clsObjs.put(eCls, new HashSet<EObject>());
			}
		}
		
		for (EObject eObj : eObjs) {
			if (clsObjs.containsKey(eObj.eClass())) {
				clsObjs.get(eObj.eClass()).add(eObj);
			} 
		}
		/*
		for (EObject eObj : eObjs) {
			if (clsObjs.containsKey(eObj.eClass())) {
				clsObjs.get(eObj.eClass()).add(eObj);
			} else {
				Set<EObject> instances = new HashSet<EObject>();
				instances.add(eObj);
				clsObjs.put(eObj.eClass(), instances);
			}
		}*/
		Map<String, Map<EObject, Boolean>> result = new HashMap<String, Map<EObject, Boolean>>();
		OCLHelper<EClassifier, ?, ?, Constraint> helper = ocl.createOCLHelper();
		for (Constraint constraint : constraintMap.values()) {
			Map<EObject, Boolean> resultPerInv = new HashMap<EObject, Boolean>();
			result.put(constraint.getName(), resultPerInv);
			//System.out.println("Checking Invariant " + constraint.getName() + " on ");
			
			for (EObject eObj : constraint.getConstrainedElements()) {
		        if (eObj instanceof EClass) {
		        	EClass eContextCls = (EClass)eObj;
		        	helper.setContext(eContextCls);
		        	
		        	Query constraintEval = ocl.createQuery(constraint);
		        	if (clsObjs.containsKey(eContextCls)) {
		        		evaluate(eContextCls, clsObjs, constraintEval, resultPerInv);
		        	}
		        	for (EClass eSubCls : clsObjs.keySet()) {
		        		if (eSubCls.getEAllSuperTypes().contains(eContextCls)) {
		        			evaluate(eSubCls, clsObjs, constraintEval, resultPerInv);
		        		}
		        	}
		        }
		    }
			
			
		}
		
		long estimatedTime = System.currentTimeMillis() - startTime;
		List<Object> res = new ArrayList<Object>();
		res.add(estimatedTime);
		res.add(result);
		return res;
	}
	
	private void evaluate(EClass eCls, Map<EClass, Set<EObject>> clsObjs, 
			Query constraintEval, Map<EObject, Boolean> resultPerInv) {
		for (EObject ins : clsObjs.get(eCls)) {
			boolean result = constraintEval.check(ins);
    		resultPerInv.put(ins, result);
    		//System.out.println("--------" + ins);
    		//System.out.println("--------Result is " + result);	
    	}
	}
	
	
	public List<Object> checkUnslicedInput(String ecoreFilePath, String xmiFilePath, String oclFilePath, Set<String> invNames) {
		long startTime = System.currentTimeMillis();
		
		EPackage ePkg = EMFHelper.loadModel(ecoreFilePath);
		List<EObject> eObjs = EMFHelper.loadInstance(xmiFilePath, ePkg);			
		List<Object> res = check(ePkg, eObjs, oclFilePath, invNames);
		
		long estimatedTime = System.currentTimeMillis() - startTime;
		res.add(estimatedTime);
		return res;
	}
	public List<Object> checkSlicedInput(String slicedModelPath, String slicedInstancePath, String slicedOclFilePath, String temp) {
		long startTime = System.currentTimeMillis();
		
		slicedModelPath = slicedModelPath.replace(".ecore", temp  + ".ecore");
		slicedOclFilePath = slicedOclFilePath.replace(".ocl", temp + ".ocl");
		slicedInstancePath = slicedInstancePath.replace(".xmi", temp + ".xmi");
		
		EPackage ePkg = EMFHelper.loadModel(slicedModelPath);
		List<EObject> eObjs = EMFHelper.loadInstance(slicedInstancePath, ePkg);
		List<Object> res = check(ePkg, eObjs, slicedOclFilePath, null);
				
		long estimatedTime = System.currentTimeMillis() - startTime;
		res.add(estimatedTime);
		return res;
	}
	
	public void print(List<Object> res) {
		System.out.println("---------------------------------------");
		System.out.println("Checking time without loading time: " + res.get(0));
		System.out.println("Checking time including loading time: " + res.get(2));
		Map<String, Map<EObject, Boolean>> result = (Map<String, Map<EObject, Boolean>>) res.get(1);
		int totalCount = 0, invalidCount = 0;
		for (String key : result.keySet()) {
			System.out.println(key);
			Map<EObject, Boolean> temp = result.get(key);
			for (EObject eObj : temp.keySet()) {
				totalCount++;
				if (temp.get(eObj) == false)
					invalidCount++;
			}
		}
		System.out.println("Total checking relevant objects : " + totalCount);
		System.out.println("Total invalid objects : " + invalidCount);
		System.out.println("---------------------------------------");
		System.out.println();
	}
	public static void main(String[] args) {
		
		String basePath = "D:\\EclipseWorkspaceForSlicing\\ClassModelSlicing\\";
		String ecoreFileName = "UML2.ecore";
		String ecorePath = basePath + "ecores\\";
		String ecoreFilePath = ecorePath + ecoreFileName;
		String xmiPath = basePath + "xmis\\";
		String xmiFileName = "UML2InsDataSet1.xmi";//ecoreFileName.replace(".ecore", ".xmi");
		String xmiFilePath = xmiPath + xmiFileName;
		String oclFileName = ecoreFileName.replace(".ecore", ".ocl");
		String oclFilePath = basePath + "ocls\\" + oclFileName;
		
		String slicedModelPath = basePath + "slices\\" + "Sliced" + xmiFileName.replace(".xmi", ".ecore");
		String slicedOclFilePath = basePath + "slices\\" + "Sliced" + xmiFileName.replace(".xmi", ".ocl");
		String slicedInstancePath = basePath + "slices\\" + "Sliced" + xmiFileName;
		
		Set<String> invNames = new HashSet<String>();
		String temp = "onlyBinaryAssociationCanBeAggregations";
		invNames.add(temp);
		Evaluator eval = new Evaluator();
		long totalTime1 = 0, totalTime2 = 0, totalTime3 = 0, totalTime4 = 0;
		int times = 4;
		for (int i = 0; i < times; i++) {
			System.out.println("Check unsliced input ... ");
			List<Object> res = eval.checkUnslicedInput(ecoreFilePath, xmiFilePath, oclFilePath, invNames);
			eval.print(res);
			totalTime1 += (Long) res.get(0);
			totalTime2 += (Long) res.get(2);
			
			System.out.println("Check sliced input ... ");	
			res = eval.checkSlicedInput(slicedModelPath, slicedInstancePath, slicedOclFilePath, temp);
			eval.print(res);
			totalTime3 += (Long) res.get(0);
			totalTime4 += (Long) res.get(2);
			
			System.out.println();
		}		
		System.out.println("Checking time without loading time for unsliced input: " + totalTime1 * 1.0 / times);
		System.out.println("Checking time including loading time for unsliced input: " + totalTime2 * 1.0 / times);
		
		System.out.println("Checking time without loading time for sliced input: " + totalTime3 * 1.0 / times);
		System.out.println("Checking time including loading time for sliced input: " + totalTime4 * 1.0 / times);
		
		System.out.println("Checking done!");
		System.out.println();
		
	}
}

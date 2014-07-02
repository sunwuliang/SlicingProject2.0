package org.csu.slicing.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.csu.slicing.util.EMFHelper;
import org.csu.slicing.util.InvPrePostAnalyzer;
import org.csu.slicing.util.UML2Invs;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.expressions.OCLExpression;

public class OCSlicer extends Footprinter {

	private Map<String, Set<Object>> refModelElmtsPerInv;
	private Set<Object> refModelElmts;
	private List<EObject> eObjs;
	private SlicingMode slicingMode;
	private Set<String> selectedInvNames;
	
	public OCSlicer() {
	}
	
	public Set<String> getSelectedInvs() {
		return this.selectedInvNames;
	}
	public Set<Object> getRefModelElmts() {
		return this.refModelElmts;
	}
	private void modeSetup() {
		
		this.refModelElmts = new HashSet<Object>();
			
		if (this.slicingMode.equals(SlicingMode.MultipleInvariants)) {
			
			Set<EClass> insRefClss = new HashSet<EClass>();
			for (EObject eObj : this.eObjs) {
				EClass eCls = eObj.eClass();
				insRefClss.add(eCls);
				insRefClss.addAll(eCls.getEAllSuperTypes());
			} 
			
			if (this.selectedInvNames == null) {
				selectedInvNames = this.refModelElmtsPerInv.keySet();
			} 
			
			Set<String> rmInvs = new HashSet<String>();
			for (String invName : this.selectedInvNames) {
				boolean isRm = true;
				for (Object obj : this.refModelElmtsPerInv.get(invName)) {
					if (obj instanceof EClass) {
						EClass eCls = (EClass)obj;
						if (insRefClss.contains(eCls)) {
							isRm = false;
							break;
						}
					}
				}
				if (isRm == true)
					rmInvs.add(invName);
			}
			
			this.selectedInvNames.removeAll(rmInvs);
		
		}
		
		for (String invName : this.selectedInvNames) {
			//System.out.println(invName);
			//System.out.println(this.refModelElmtsPerInv.get(invName));
			this.refModelElmts.addAll(this.refModelElmtsPerInv.get(invName));
		}
		
		this.refModelElmts = super.addSubclss2RefClss(this.refModelElmts);
		
		//for (Object obj : this.refModelElmts)
		//	System.out.println("101 " + obj);
	} 

	private Set<EObject> sliceObjectConf(EPackage slicedPkg) {
		
		Set<EObject> slicedObjs = new HashSet<EObject>();
		EFactory eFactory = slicedPkg.getEFactoryInstance();
		Map<String, EClass> clssMap = new HashMap<String, EClass>();
		Map<EObject, EObject> objCopy = new HashMap<EObject, EObject>();
		
		for (EClassifier eClsf : slicedPkg.getEClassifiers()) {
			if (eClsf instanceof EClass) {
				EClass eCls = (EClass)eClsf;
				//System.out.println(eCls.getName());
				clssMap.put(eCls.getName(), eCls);
			}
		}
		/*
		for (EObject eObj : eObjs) {
			
			EClass eCls = eObj.eClass();
			//System.out.println(eCls);
			for (EStructuralFeature eStf : eCls.getEStructuralFeatures()) {
				if (eObj.eGet(eStf) == null)
					System.out.println(eStf.getName());
				else
					System.out.println(eObj.eGet(eStf));
			}
			
			List<EClass> eClss = eCls.getEAllSuperTypes();
			
			for (EClass cls : eClss) {
				System.out.println("super class name: " + cls.getName());
				for (EStructuralFeature eStf : cls.getEStructuralFeatures()) {
					System.out.println(eStf);
					if (eObj.eGet(eStf) == null)
						System.out.println(eStf.getName());
					else
						System.out.println(eObj.eGet(eStf));
				}
			}
			
			System.out.println("");
		}*/
	
		
		for (EObject eObj : this.eObjs) {
			
			// Cannot use this.refModelElmts.contains(eObj.eClass())
			// Because sliced class model is different from the unsliced model and 
			// eObj.eClass returns a class in the unsliced model
			if (clssMap.keySet().contains(eObj.eClass().getName())) {
				
				EClass slicedCls = clssMap.get(eObj.eClass().getName());
				EObject slicedObj = null;
				if (objCopy.containsKey(eObj))
					slicedObj = objCopy.get(eObj);
				else {
					slicedObj = eFactory.create(slicedCls);
					slicedObjs.add(slicedObj);
					objCopy.put(eObj, slicedObj);
				}
				
				for (EStructuralFeature slicedStf : slicedCls.getEAllStructuralFeatures()) {
					Object featureValue = eObj.eGet(eObj.eClass().getEStructuralFeature(slicedStf.getName()));
					/*System.out.println(eObj);
					System.out.println(eObj.eClass());
					System.out.println(slicedStf.getName());
					System.out.println(eObj.eClass().getEStructuralFeature(slicedStf.getName()));
					System.out.println(eObj.eCrossReferences());*/
					if (featureValue == null)
						continue;
					if (slicedStf instanceof EAttribute) {
						if (slicedStf.getEType() instanceof EEnum) {
							EEnum eNum = (EEnum)slicedStf.getEType();
							Object slicedFeatureValue = eFactory.createFromString(eNum, featureValue.toString());
							slicedObj.eSet(slicedStf, slicedFeatureValue);
						} else {
							//System.out.println("origin" + featureValue);
							slicedObj.eSet(slicedStf, featureValue);
							//System.out.println("      " + slicedObj.eGet(slicedStf));
						}
					}
					else {
						// Reference value
						// Multiplicity: 0..*
						if (featureValue instanceof List) {
							//System.out.println("EList " + featureValue);
							List<EObject> slicedRefObjs = new ArrayList<EObject>();
							for (EObject refObj : (List<EObject>)featureValue) {
								EObject slicedRefObj = null;
								if (objCopy.containsKey(refObj)) {
									slicedRefObj = objCopy.get(refObj);
								} else {
									slicedRefObj = eFactory.create(clssMap.get(refObj.eClass().getName()));
									slicedObjs.add(slicedRefObj);
									objCopy.put(refObj, slicedRefObj);
								}
								slicedRefObjs.add(slicedRefObj);
							}
							
							slicedObj.eSet(slicedStf, slicedRefObjs);
						} else {
							// Multiplicity: 1
							//System.out.println(featureValue);
							EObject slicedRefObj = null;
							EObject refObj = (EObject)featureValue;
							if (objCopy.containsKey(refObj)) {
								slicedRefObj = objCopy.get(refObj);
							} else {
								//eFactory.create
								//System.out.println(refObj.eClass().getName());
								slicedRefObj = eFactory.create(clssMap.get(refObj.eClass().getName()));
								slicedObjs.add(slicedRefObj);
								objCopy.put(refObj, slicedRefObj);
							}
							slicedObj.eSet(slicedStf, slicedRefObj);
							
						}
						//EObject slicedRefObj = eFactory.create(clssMap.get(((EObject)featureValue).eClass().getName()));
						//slicedObj.eSet(slicedStf, slicedRefObj);
						//slicedObjs.add(slicedRefObj);
						//objCopy.put((EObject)featureValue, slicedRefObj);
					}
				}
			} 
		}
			
		return slicedObjs;
	}

	public List<Object> slice(String basePath, String ecoreFilePath, String xmiFilePath, String oclFilePath, String xmiFileName, String mark, Set<String> invNames, 
			SlicingMode slicingMode) {
		String slicedModelPath = basePath + "slices\\" + "Sliced" + xmiFileName.replace(".xmi", mark + ".ecore");
		String slicedInstancePath = basePath + "slices\\" + "Sliced" + xmiFileName.replace(".xmi", mark + ".xmi");
		String slicedOclPath = basePath + "slices\\" + "Sliced" + xmiFileName.replace(".xmi", mark + ".ocl"); 
		
		long startTime2 = System.currentTimeMillis();
		
		EPackage ePkg = EMFHelper.loadModel(ecoreFilePath);
		List<EObject> eObjs = EMFHelper.loadInstance(xmiFilePath, ePkg);
		
		InvPrePostAnalyzer iParser = new InvPrePostAnalyzer(ePkg, oclFilePath);
		/*(for (Object obj : iParser.getRefModelElmts(oclFilePath)) {
			System.out.println(obj);
		}*/
		
		//OCSlicer st = new OCSlicer(ePkg, eObjs, refModelElmts, SlicingMode.SingleInvariant, invNames);
		//Coslicer st = new Coslicer(ePkg, eObjs, refModelElmts, SlicingMode.MultipleInvariants, null);
				
		super.setEPackge(ePkg);
		this.refModelElmtsPerInv = iParser.getRefModelElmtsPerInv();
		this.eObjs = eObjs;
		this.slicingMode = slicingMode;
		this.selectedInvNames = invNames;
		this.modeSetup();

		
		long startTime1 = System.currentTimeMillis();
		
		
		EPackage slicedPkg = sliceModel(this.refModelElmts);
		Set<EObject> slicedObjs = sliceObjectConf(slicedPkg);
		
		List<Object> res = new ArrayList<Object>();
		long cur = System.currentTimeMillis();
		res.add(cur - startTime1);
		res.add(cur - startTime2);
	
		EMFHelper.saveModel(slicedModelPath, slicedPkg);
		EMFHelper.saveInstance(slicedInstancePath, slicedObjs);
			
		Map<String, String> constraintMap = UML2Invs.getConsMap();
		Set<String> consToSave = new HashSet<String>();
		
		//System.out.println("A list of selected invariants : ");
		for (String invName : selectedInvNames) {
			//System.out.println(invName);
			if (constraintMap.containsKey(invName)) {
				consToSave.add(constraintMap.get(invName));
			}
		}
		EMFHelper.saveOCL(slicedOclPath, consToSave, "Sliced" + xmiFileName.replace(".xmi", mark + ".ecore"), slicedPkg);
		
		return res;
	}
	
	public void print(List<Object> res) {
		System.out.println("---------------------------------------");
		System.out.println("Slicing time without loading time: " + res.get(0));
		System.out.println("Slicing time including loading time: " + res.get(1));
		System.out.println("---------------------------------------");
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		String basePath = "D:\\EclipseWorkspaceForSlicing\\ClassModelSlicing\\";
		String ecoreFileName = "UML2.ecore";
		//String ecoreFileName = "CoachBus.ecore";
		String ecorePath = basePath + "ecores\\";
		String ecoreFilePath = ecorePath + ecoreFileName;
		String xmiPath = basePath + "xmis\\";
		String xmiFileName = "UML2InsER2MOF.xmi";
		//String xmiFileName = "CoachBus.xmi";
		String xmiFilePath = xmiPath + xmiFileName;
		String oclFileName = ecoreFileName.replace(".ecore", ".ocl");
		String oclFilePath = basePath + "ocls\\" + oclFileName;
		Set<String> invNames = new HashSet<String>();
		String mark = "class1";
		//String mark = "";
		invNames.add(mark);
		OCSlicer slicer = new OCSlicer();
		
		long totalTime1 = 0, totalTime2 = 0;
		int times = 4;
		for (int i = 0; i < times; i++) {
			System.out.println("Slicing input ... ");
			List<Object> res = slicer.slice(basePath, ecoreFilePath, xmiFilePath, oclFilePath, xmiFileName, mark, invNames, SlicingMode.SingleInvariant);
			slicer.print(res);
			totalTime1 += (Long) res.get(0);
			totalTime2 += (Long) res.get(1);
			
			System.out.println();
		}		
		System.out.println("Slicing time without loading time : " + totalTime1 * 1.0 / times);
		System.out.println("Slicing time including loading time : " + totalTime2 * 1.0 / times);
		
		System.out.println("Slicing done!");
		System.out.println();

		/*for (EObject eObj : eObjs) {
			System.out.println(eObj);
			EClass eCls = eObj.eClass();
			
			for (EStructuralFeature eStf : eCls.getEStructuralFeatures()) {
				System.out.println(eObj.eGet(eStf));
			}
			
			List<EClass> eClss = eCls.getEAllSuperTypes();
			
			for (EClass cls : eClss) {
				for (EStructuralFeature eStf : cls.getEStructuralFeatures()) {
					System.out.println(eObj.eGet(eStf));
				}
			}
			
			System.out.println("");
		}*/
		
		/* 
		 * Deprecated
		 * 
		Map<String, Constraint> constraintMap = iParser.getConstraintMap();
		Set<Constraint> consToSave = new HashSet<Constraint>();
		for (String invName : st.selectedInvs) {
			System.out.println(invName);
			if (constraintMap.containsKey(invName)) {
				consToSave.add(constraintMap.get(invName));
			}
		}
		EMFHelper.saveOCLinXMI(slicedOclPath, consToSave);
		
		List<EObject> objs = EMFHelper.loadOCLinXMI(slicedOclPath, slicedPkg);
		for (EObject obj: objs) {
			if (obj instanceof Constraint)
				System.out.println(obj);
		}*/
				
	}
}
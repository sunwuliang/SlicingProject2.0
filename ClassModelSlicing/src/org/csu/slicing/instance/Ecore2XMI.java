package org.csu.slicing.instance;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.csu.slicing.UML2.Association;
import org.csu.slicing.UML2.Classifier;
import org.csu.slicing.UML2.DataType;
import org.csu.slicing.UML2.Enumeration;
import org.csu.slicing.UML2.EnumerationLiteral;
import org.csu.slicing.UML2.Operation;
import org.csu.slicing.UML2.Parameter;
import org.csu.slicing.UML2.PrimitiveType;
import org.csu.slicing.UML2.Property;
import org.csu.slicing.UML2.StringExpression;
import org.csu.slicing.UML2.UML2Factory;
import org.csu.slicing.UML2.Package;
import org.csu.slicing.UML2.Class;
import org.csu.slicing.util.EMFHelper;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * 	1. Create automatic ecore-to-ins transformer
 * @author sun
 *
 */
public class Ecore2XMI {
	public static Set<EObject> transform(EPackage insPkg) {
		
		Set<EObject> objs = new HashSet<EObject>();
		Package pkg = UML2Factory.eINSTANCE.createPackage();
		pkg.setName(insPkg.getName());
		objs.add(pkg);
		
		Map<EClass, Class> clsMap = new HashMap<EClass, Class>();
		Map<String, Classifier> typeMap = new HashMap<String, Classifier>();
		Map<EReference, Property> assoMap = new HashMap<EReference, Property>();
		
		PrimitiveType string = UML2Factory.eINSTANCE.createPrimitiveType();
		string.setName("EString");
		pkg.getOwnedType().add(string);
		objs.add(string);
		
		PrimitiveType integer = UML2Factory.eINSTANCE.createPrimitiveType();
		integer.setName("EInt");
		pkg.getOwnedType().add(integer);
		objs.add(integer);
		
		PrimitiveType bool = UML2Factory.eINSTANCE.createPrimitiveType();
		bool.setName("EBoolean");
		pkg.getOwnedType().add(bool);
		objs.add(bool);
		
		PrimitiveType doub = UML2Factory.eINSTANCE.createPrimitiveType();
		doub.setName("EDouble");
		pkg.getOwnedType().add(doub);
		objs.add(doub);
		
		typeMap.put(string.getName(), string);
		typeMap.put(integer.getName(), integer);
		typeMap.put(bool.getName(), bool);
		typeMap.put(doub.getName(), doub);
		
		// Deal with enumerations, data types
		for (EClassifier eClsf : insPkg.getEClassifiers()) {
			if (eClsf instanceof EEnum) {
				EEnum eNum = (EEnum) eClsf;
				Enumeration num = UML2Factory.eINSTANCE.createEnumeration();
				num.setName(eNum.getName());
				
				pkg.getMember().add(num);
				objs.add(num);
				
				typeMap.put(num.getName(), num);
				
				for (EEnumLiteral eLit : eNum.getELiterals()) {
					EnumerationLiteral lit = UML2Factory.eINSTANCE.createEnumerationLiteral();
					lit.setName(eLit.getName());
					
					num.getOwnedLiteral().add(lit);
					objs.add(num);
				}
			} else {
				if (eClsf instanceof EDataType) {
					EDataType eDt = (EDataType) eClsf;
					DataType dt = UML2Factory.eINSTANCE.createDataType();
					dt.setName(eDt.getName());
					
					pkg.getOwnedElement().add(dt);
					objs.add(dt);
					
					typeMap.put(dt.getName(), dt);
				}
			}
		}
		
		// Deal with classes
		for (EClassifier eClsf : insPkg.getEClassifiers()) {
			if (eClsf instanceof EClass) {
				EClass eCls = (EClass) eClsf;
				Class cls = null;
				if (typeMap.containsKey(eCls.getName())) {
					cls = (Class)typeMap.get(eCls.getName());
				} else {
					cls = UML2Factory.eINSTANCE.createClass();
					cls.setName(eCls.getName());
					
					typeMap.put(cls.getName(), cls);
				}

				cls.setIsAbstract(eCls.isAbstract());
				
				clsMap.put(eCls,  cls);
				pkg.getMember().add(cls);
				objs.add(cls);
				
				// Deal with attributes
				for (EAttribute eAttr : eCls.getEAttributes()) {
					Property property = UML2Factory.eINSTANCE.createProperty();
					property.setName(eAttr.getName());
					property.setType(typeMap.get(eAttr.getEType().getName()));
					
					cls.getOwnedElement().add(property);
					objs.add(property);
				}
				
				// Deal with references
				for (EReference eRef : eCls.getEReferences()) {
					Property property = UML2Factory.eINSTANCE.createProperty();
					property.setName(eRef.getName());
					
					if (typeMap.containsKey(eRef.getEType().getName())) {
						property.setType(typeMap.get(eRef.getEType().getName()));
					} else {
						Class typeCls = UML2Factory.eINSTANCE.createClass();
						typeCls.setName(eRef.getEType().getName());
						property.setType(typeCls);
						
						typeMap.put(typeCls.getName(), typeCls);
								
					}
					
					if (eRef.getEOpposite() != null) {
						assoMap.put(eRef, property);
					} 
					
					cls.getOwnedElement().add(property);
					objs.add(property);
				
				}
				
				// Deal with operations
				for (EOperation eOper : eCls.getEOperations()) {
					Operation oper = UML2Factory.eINSTANCE.createOperation();
					oper.setName(eOper.getName());
					
					if (eOper.getEType() == null) {
						oper.setType(null);
					} else {
						if (typeMap.containsKey(eOper.getEType().getName())) {
							oper.setType(typeMap.get(eOper.getEType().getName()));
						} else {
							// Assume that all primitive types have been created in
							// the beginning of the method
							Class typeCls = UML2Factory.eINSTANCE.createClass();
							typeCls.setName(eOper.getEType().getName());
							oper.setType(typeCls);
							
							typeMap.put(typeCls.getName(), typeCls);
						}
					}
					
					cls.getOwnedOperation().add(oper);
					objs.add(oper);
					
					for (EParameter ePara : eOper.getEParameters()) {
						Parameter para = UML2Factory.eINSTANCE.createParameter();
						para.setName(ePara.getName());
						
						if (typeMap.containsKey(ePara.getEType().getName())) {
							para.setType(typeMap.get(ePara.getEType().getName()));
						} else {
							// Assume that all primitive types have been created in
							// the beginning of the method
							Class typeCls = UML2Factory.eINSTANCE.createClass();
							typeCls.setName(ePara.getEType().getName());
							para.setType(typeCls);
							
							typeMap.put(typeCls.getName(), typeCls);
						}
						
						oper.getOwnedParameter().add(para);
						objs.add(para);
					}
					
				}
			}
		}
		
		// Deal with association
		Set<EReference> eRefFlag = new HashSet<EReference>();
		for (EReference eRef : assoMap.keySet()) {
			if (eRefFlag.contains(eRef) || eRefFlag.contains(eRef.getEOpposite()))
				continue;
			Association asso = UML2Factory.eINSTANCE.createAssociation();
			asso.setName(eRef.getName() + eRef.getEOpposite().getName());
			asso.getMemberEnd().add(assoMap.get(eRef));
			asso.getMemberEnd().add(assoMap.get(eRef.getEOpposite()));
			
			eRefFlag.add(eRef);
			eRefFlag.add(eRef.getEOpposite());
			
			//System.out.println(asso.getName());
			
			pkg.getOwnedElement().add(asso);
			objs.add(asso);
		}
		
		// Deal with inheritance
		Set<EClass> eClss = clsMap.keySet();
		for (EClass eCls : eClss) {
			for (EClass eSuperCls : eCls.getESuperTypes()) {
				if (eClss.contains(eSuperCls)) {
					clsMap.get(eCls).getSuperClass().add(clsMap.get(eSuperCls));
				}
			}
		}
		return objs;
	}
	public static void main(String[] args) {
		String basePath = "D:\\EclipseWorkspaceForSlicing\\ClassModelSlicing\\";
		String modelName = "UML2.ecore";
		String insName = "Library.ecore";
		
		String ecorePath = basePath + "ecores\\";
		String modelPath = ecorePath + modelName;
		String insPath = ecorePath + insName;
		
		String xmiPath = basePath + "xmis\\";
		String xmiFilePath = xmiPath + modelName.replace(".ecore", "Ins" + 
				insName.replace(".ecore", ".xmi")) ;
		
		EPackage insPkg = EMFHelper.loadModel(insPath);
		
		Set<EObject> objs = Ecore2XMI.transform(insPkg);
		EMFHelper.saveInstance(xmiFilePath, objs);
		
		// Test the generated instance file
		
		EPackage ePkg = EMFHelper.loadModel(modelPath);
		List<EObject> eObjs = EMFHelper.loadInstance(xmiFilePath, ePkg);
		for (EObject eObj : eObjs) {
		
			//if (eObj.eClass().getName().equals("Association"))
				System.out.println(eObj);
			
			//EClass eCls = eObj.eClass();
			
			//for (EStructuralFeature eStrf : eCls.getEStructuralFeatures()) {
			//	System.out.println(eObj.eGet(eStrf));
			//} 
		}
	}
}

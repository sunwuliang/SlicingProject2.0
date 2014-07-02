package org.csu.slicing.instance;

import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.UUID;

import org.csu.slicing.util.EMFHelper;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;

import org.csu.slicing.UML2.*;
import org.csu.slicing.UML2.Class;

/**
 * Need to import org.csu.slicing.UML2 project
 * 1. Go to org.csu.slicing.uml2->MANIFEST.MF->Runtime->ExportedPackage->Add 
 * 	org.csu.slicing.UML2, org.csu.slicing.UML2.impl;
 * 2. Go to ClassModelingSlcing->MANIFEST.MF->Dependencies->ImportedPackage->Add
 * 	org.csu.slicing.UML2;
 * @author sun
 *
 */
public class UML2InsLRBACGenerator {
	
	public static Set<EObject> generateInstance() {
		
		Set<EObject> objs = new HashSet<EObject>();
		
		PrimitiveType string = UML2Factory.eINSTANCE.createPrimitiveType();
		string.setName("String");
		objs.add(string);
		
		PrimitiveType integer = UML2Factory.eINSTANCE.createPrimitiveType();
		integer.setName("Integer");
		objs.add(integer);
		
		PrimitiveType bool = UML2Factory.eINSTANCE.createPrimitiveType();
		bool.setName("Boolean");
		objs.add(bool);
		
		Class user = UML2Factory.eINSTANCE.createClass();
		user.setName("User");
		objs.add(user);
		
		Class session = UML2Factory.eINSTANCE.createClass();
		session.setName("Session");
		objs.add(session);
		
		Class role = UML2Factory.eINSTANCE.createClass();
		role.setName("Role");
		objs.add(role);
		
		Class location = UML2Factory.eINSTANCE.createClass();
		location.setName("Location");
		objs.add(location);
		
		Class permission = UML2Factory.eINSTANCE.createClass();
		permission.setName("Permission");
		objs.add(permission);
				
		Class object = UML2Factory.eINSTANCE.createClass();
		object.setName("Object");
		objs.add(object);
		
		Class operation = UML2Factory.eINSTANCE.createClass();
		operation.setName("Operation");
		objs.add(operation);

		Class read = UML2Factory.eINSTANCE.createClass();
		read.setName("Read");
		read.getSuperClass().add(operation);
		objs.add(read);
		
		Property userID = UML2Factory.eINSTANCE.createProperty();
		userID.setName("UserID");
		userID.setType(string);
		userID.setClass_(user);
		objs.add(userID);
		
		Property age = UML2Factory.eINSTANCE.createProperty();
		age.setName("Age");
		age.setType(integer);
		age.setClass_(user);
		objs.add(age);
		
		Property userName = UML2Factory.eINSTANCE.createProperty();
		userName.setName("UserName");
		userName.setType(string);
		userName.setClass_(user);
		objs.add(userName);
		
		Operation assignRole = UML2Factory.eINSTANCE.createOperation();
		assignRole.setName("AssingRole");
		assignRole.setClass_(user);
		assignRole.setType(null);
		objs.add(assignRole);
		
		Parameter r = UML2Factory.eINSTANCE.createParameter();
		r.setName("r");
		r.setType(role);
		assignRole.getParameter().add(r);
		objs.add(r);
		
		//Association asso = UML2Factory.eINSTANCE.createAssociation();
		//asso.setName("UserSes");
		//objs.add(asso);
		
		Property sessionsP = UML2Factory.eINSTANCE.createProperty();
		sessionsP.setName("sessions");
		sessionsP.setType(session);
		sessionsP.setClass_(user);
		sessionsP.setAggregation(AggregationKind.NONE);
		//asso.getMemberEnd().add(sessionsP);
		objs.add(sessionsP);

		Property userP = UML2Factory.eINSTANCE.createProperty();
		userP.setName("user");
		userP.setType(user);
		userP.setClass_(session);
		userP.setAggregation(AggregationKind.NONE);
		//asso.getMemberEnd().add(userP);
		objs.add(userP);

		return objs;
	}
	
	public static void main(String[] args) {
		String basePath = "D:\\EclipseWorkspaceForSlicing\\ClassModelSlicing\\";
		String ecoreFileName = "UML2.ecore";
		String ecorePath = basePath + "ecores\\";
		String ecoreFilePath = ecorePath + ecoreFileName;
		String xmiPath = basePath + "xmis\\";
		String xmiFilePath = xmiPath + ecoreFileName.replace(".ecore", "InsLRBAC.xmi") ;
		
		Set<EObject> objs = UML2InsLRBACGenerator.generateInstance();
		EMFHelper.saveInstance(xmiFilePath, objs);
		
		// Test the generated instance file
		
		EPackage ePkg = EMFHelper.loadModel(ecoreFilePath);
		List<EObject> eObjs = EMFHelper.loadInstance(xmiFilePath, ePkg);
		for (EObject eObj : eObjs) {
			System.out.println(eObj);
			
			//EClass eCls = eObj.eClass();
			
			//for (EStructuralFeature eStrf : eCls.getEStructuralFeatures()) {
			//	System.out.println(eObj.eGet(eStrf));
			//} 
		}
	}

}

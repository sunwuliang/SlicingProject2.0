package org.csu.slicing.test;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.csu.slicing.evaluation.Evaluator;
import org.csu.slicing.main.OCSlicer;
import org.csu.slicing.util.EMFHelper;
import org.csu.slicing.util.InvPrePostAnalyzer;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class UML2InsEvaluator {
	
	private String basePath = "D:\\EclipseWorkspaceForSlicing\\ClassModelSlicing\\";
	private String modelPath = basePath + "ecores\\UML2.ecore";
	private String oclPath = basePath + "ocls\\UML2.ocl";
	private String instancePath = basePath + "xmis\\UML2InsRoyalAndLoyal.xmi";
	
	private String baseSlicePath = basePath + "slices\\";
	private String mark = "UML2InsRoyalAndLoyal";
	private String slicedModelPath = baseSlicePath + mark + ".ecore";
	private String slicedOclPath = baseSlicePath + mark + ".ocl"; 
	private String slicedInstancePath = baseSlicePath + mark + ".xmi";

		
	private void checkInvariant(String temp) {
		Set<String> invNames = new HashSet<String>();
		invNames.add(temp);
		
		Evaluator eval = new Evaluator();
		long startTime1 = System.currentTimeMillis();
		eval.checkUnslicedInput(modelPath, instancePath, oclPath, invNames);
		long estimatedTime1 = System.currentTimeMillis() - startTime1;
		System.out.println(temp + " Evaluation estimated time including file loading is " + estimatedTime1);
		
		long startTime2 = System.currentTimeMillis();				
		eval.checkSlicedInput(slicedModelPath, slicedInstancePath, slicedOclPath, temp);
		long estimatedTime2 = System.currentTimeMillis() - startTime2;
		System.out.println(temp + " Evaluation estimated time including file laoding is " + estimatedTime2);	

	}
	@After
	public void clearnUp() throws Exception {
		System.gc();
	}
	@Test
	public void test_MultipleInvariants() {
		
		Set<String> invNames = new HashSet<String>();
		
		long startTime1 = System.currentTimeMillis();
		Evaluator eval = new Evaluator();
		eval.checkUnslicedInput(modelPath, instancePath, oclPath, invNames);
		long estimatedTime1 = System.currentTimeMillis() - startTime1;
		System.out.println("Evaluation estimated time including file laoding is " + estimatedTime1);

		long startTime2 = System.currentTimeMillis();
		eval.checkSlicedInput(slicedModelPath, slicedInstancePath, slicedOclPath, null);
		long estimatedTime2 = System.currentTimeMillis() - startTime2;
		System.out.println("Evaluation estimated time including file laoding is " + estimatedTime2);	
	}

	@Test
	public void testInvariant_class1() {
		String temp = "class1";
		checkInvariant(temp);
	}
	
	@Test
	public void testInvariant_bc1() {
		String temp = "bc1";
		checkInvariant(temp);
	}
	
	@Test
	public void testInvariant_onlyBinaryAssociationCanBeAggregations() {
		
		String temp = "onlyBinaryAssociationCanBeAggregations";
		checkInvariant(temp);
	}
	
	@Test
	public void testInvariant_specializedAssociationsHasSameNumberOfEnds() {
		
		String temp = "specializedAssociationsHasSameNumberOfEnds";
		checkInvariant(temp);
	}
	
	@Test
	public void testInvariant_operationHasOnlyOneReturnParameter() {
		String temp = "operationHasOnlyOneReturnParameter";
		checkInvariant(temp);
	}
	
	@Test
	public final void testInvariant_ownedElementHasVisibility() {
		
		String temp = "ownedElementHasVisibility";
		checkInvariant(temp);
	}
	
	@Test
	public void testInvariant_mustBeOwnedHasOwner() {
		String temp = "mustBeOwnedHasOwner";
		checkInvariant(temp);
	}
	
	@Test
	public void testInvariant_nAryAssociationsOwnTheirEnds() {
		String temp = "nAryAssociationsOwnTheirEnds";
		checkInvariant(temp);
	}
	
	@Test
	public void testInvariant_inheritedMemberIsValid() {
		String temp = "inheritedMemberIsValid";
		checkInvariant(temp);;
	}
	
	@Test
	public void testInvariant_isAbstractDefined() {
		String temp = "isAbstractDefined";
		checkInvariant(temp);
	}
	
	@Test
	public void testInvariant_derivedUnionIsDerived() {
		String temp = "derivedUnionIsDerived";
		checkInvariant(temp);
	}
	
	@Test
	public void testInvariant_subsetRequiresDifferentName() {
		String temp = "subsetRequiresDifferentName";
		checkInvariant(temp);
	}

	@Test
	public void testInvariant_derivedUnionIsReadOnly() {
		String temp = "derivedUnionIsReadOnly";
		checkInvariant(temp);
	}
	
	@Test
	public void testInvariant_isCompositeIsValid() {
		String temp = "isCompositeIsValid";
		checkInvariant(temp);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/**
	 * No objects
	 
	
	@Test
	public final void testInvariant_tia1() {
		String temp = "tia1";
		checkInvariant(temp);
	}
	
	@Test
	public final void testInvariant_upperIsValid() {
		String temp = "upperIsValid";
		checkInvariant(temp);
	}
	
	
	
	@Test
	public void testInvariant_oe1() {
		String temp = "oe1";
		checkInvariant(temp);
	}
	
	@Test
	public void testInvariant_oe2() {
		String temp = "oe2";
		checkInvariant(temp);
	}
	
	@Test
	public void testInvariant_isUniqueIsValid() {
		String temp = "isUniqueIsValid";
		checkInvariant(temp);
	}
	
	@Test
	public void testInvariant_coa1() {
		String temp = "coa1";
		checkInvariant(temp);
	}
	
	
	
	@Test
	public void testInvariant_led3() {
		String temp = "led3";
		checkInvariant(temp);
	}
	
	@Test
	public void testInvariant_coa2() {
		String temp = "coa2";
		checkInvariant(temp);
	}
	

	@Test
	public void testInvariant_sfa2() {
		String temp = "sfa2";
		checkInvariant(temp);
	}
	
	@Test
	public void testInvariant_coa3() {
		String temp = "coa3";
		checkInvariant(temp);
	}
	
	@Test
	public void testInvariant_sfa1() {
		String temp = "sfa1";
		checkInvariant(temp);
	}
	
	
	
	@Test
	public void testInvariant_importedVisibilityValid() {
		String temp = "importedVisibilityValid";
		checkInvariant(temp);
	}
	
	@Test
	public void testInvariant_typeIsValid() {
		String temp = "typeIsValid";
		checkInvariant(temp);
	}
	
	@Test
	public void testInvariant_bodyConditionOnlyIfIsQuery() {
		String temp = "bodyConditionOnlyIfIsQuery";
		checkInvariant(temp);
	}
	
	@Test
	public void testInvariant_rsa1() {
		String temp = "rsa1";
		checkInvariant(temp);
	}
	
	@Test
	public void testInvariant_definingFeaturIsFeatureOfClassifier() {
		String temp = "definingFeaturIsFeatureOfClassifier";
		checkInvariant(temp);
	}
	
	@Test
	public void testInvariant_led2() {
		String temp = "led2";
		checkInvariant(temp);
	}
	
	@Test
	public void testInvariant_rsa2() {
		String temp = "rsa2";
		checkInvariant(temp);
	}
	
	@Test
	public void testInvariant_noNestedClassifiers() {
		String temp = "noNestedClassifiers";
		checkInvariant(temp);
	}
	
	@Test
	public void testInvariant_led1() {
		String temp = "led1";
		checkInvariant(temp);
	}
	
	
	@Test
	public void testInvariant_oneStructuralFeatureDefinesAtMostOneSlotPerInstance() {
		String temp = "oneStructuralFeatureDefinesAtMostOneSlotPerInstance";
		checkInvariant(temp);
	}
	
	@Test
	public void testInvariant_languageAndBodiesAreValid() {
		String temp = "languageAndBodiesAreValid";
		checkInvariant(temp);
	}
	
	@Test
	public void testInvariant_packageVisibilityValid() {
		String temp = "packageVisibilityValid";
		checkInvariant(temp);
	}
	
	@Test
	public void testInvariant_lowerIsValid() {
		String temp = "lowerIsValid";
		checkInvariant(temp);
	}
	
	@Test
	public void testInvariant_notConstrainingSelf() {
		String temp = "notConstrainingSelf";
		checkInvariant(temp);
	}
	
	
	
	@Test
	public void testInvariant_visibilityValid() {
		String temp = "visibilityValid";
		checkInvariant(temp);
	}
	
	@Test
	public void testInvariant_sameGeneralClassifier() {
		String temp = "sameGeneralClassifier";
		checkInvariant(temp);
	}
	
	
	@Test
	public void testInvariant_isOrderedIsValid() {
		String temp = "isOrderedIsValid";
		checkInvariant(temp);
	}
	
	@Test
	public void testInvariant_doa1() {
		String temp = "doa1";
		checkInvariant(temp);
	}
	
	@Test
	public void testInvariant_interfaceFeaturesArePublic() {
		String temp = "interfaceFeaturesArePublic";
		checkInvariant(temp);
	}
	
	@Test
	public void testInvariant_wsfa1() {
		String temp = "wsfa1";
		checkInvariant(temp);
	}
	*/
	
}

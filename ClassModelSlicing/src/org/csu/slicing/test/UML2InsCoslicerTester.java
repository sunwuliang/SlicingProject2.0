package org.csu.slicing.test;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.csu.slicing.main.OCSlicer;
import org.csu.slicing.main.SlicingMode;
import org.csu.slicing.util.EMFHelper;
import org.csu.slicing.util.InvPrePostAnalyzer;
import org.csu.slicing.util.UML2Invs;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.ocl.ecore.Constraint;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class UML2InsCoslicerTester {
	
	private String basePath = "D:\\EclipseWorkspaceForSlicing\\ClassModelSlicing\\";
	private String ecoreFileName = "UML2.ecore";
	private String ecorePath = basePath + "ecores\\";
	private String ecoreFilePath = ecorePath + ecoreFileName;
	private String oclFileName = ecoreFileName.replace(".ecore", ".ocl");
	private String oclFilePath = basePath + "ocls\\" + oclFileName;
	
	private String xmiPath = basePath + "xmis\\";
	private String xmiFileName = "UML2InsRoyalAndLoyal.xmi";
	private String xmiFilePath = xmiPath + xmiFileName;
	
	private String slicedModelPath = basePath + "slices\\" + "Sliced" + xmiFileName.replace("xmi", "ecore");
	private String slicedInstancePath = basePath + "slices\\" + "Sliced" + xmiFileName;
	private String slicedOclPath = basePath + "slices\\" + "Sliced" + xmiFileName.replace("xmi", "ocl");; 
	private EPackage ePkg;
	private List<EObject> eObjs;
	private Map<String, Set<Object>> refModelElmts;
	private InvPrePostAnalyzer iParser;
	private EPackage slicedPkg;
	private Set<EObject> slicedObjs;
	private OCSlicer st;
	private String invName;
	
	@Before
	public void setUp() throws Exception {
		st = new OCSlicer();	
	}
	
	@After
	public void clearnUp() throws Exception {
		/*EMFHelper.saveModel(slicedModelPath, slicedPkg);
		EMFHelper.saveInstance(slicedInstancePath, slicedObjs);
		
		Map<String, String> constraintMap = UML2Invs.getConsMap();
		
		Set<String> consToSave = new HashSet<String>();
		//System.out.println("A list of selected invariants : ");
		for (String invName : st.getSelectedInvs()) {
			//System.out.println(invName);
			if (constraintMap.containsKey(invName)) {
				consToSave.add(constraintMap.get(invName));
			}
			 
		}
		EMFHelper.saveOCL(slicedOclPath, consToSave, 
				"Sliced" + xmiFileName.replace(".xmi", invName + ".ecore"), slicedPkg);*/
	}

	private void sliceByInvariant() {
		Set<String> invNames = new HashSet<String>();
		invNames.add(invName);
		
		List<Object> res = st.slice(basePath, ecoreFilePath, xmiFilePath, oclFilePath, xmiFileName, invName, invNames, SlicingMode.SingleInvariant);
		st.print(res);
		
		this.slicedModelPath = this.slicedModelPath.replace(".ecore", invName + ".ecore");
		this.slicedInstancePath = this.slicedInstancePath.replace(".xmi", invName +  ".xmi");
		this.slicedOclPath = this.slicedOclPath.replace(".ocl", invName + ".ocl");

	}
	@Test
	public void testMultipleInvariants() {
		
		invName = "";
		
		List<Object> res = st.slice(basePath, ecoreFilePath, xmiFilePath, oclFilePath, xmiFileName, invName, null, SlicingMode.MultipleInvariants);
		st.print(res);
		
	}
	
	@Test
	public void testInvariant_inheritedMemberIsValid() {
		invName = "inheritedMemberIsValid";
		sliceByInvariant();
	}
	
	@Test
	public void testInvariant_class1() {
		invName = "class1";
		sliceByInvariant();
	}

	@Test
	public void testInvariant_bc1() {
		invName = "bc1";
		sliceByInvariant();
	}
	
	@Test
	public void testInvariant_onlyBinaryAssociationCanBeAggregations() {
		invName = "onlyBinaryAssociationCanBeAggregations";
		sliceByInvariant();
	}
	
	@Test
	public void testInvariant_specializedAssociationsHasSameNumberOfEnds() {
		invName = "specializedAssociationsHasSameNumberOfEnds";
		sliceByInvariant();
	}
	
	@Test
	public void testInvariant_operationHasOnlyOneReturnParameter() {
		invName = "operationHasOnlyOneReturnParameter";
		sliceByInvariant();
	}
	
	@Test
	public void testInvariant_ownedElementHasVisibility() {
		invName = "ownedElementHasVisibility";
		sliceByInvariant();
	}
	
	@Test
	public void testInvariant_mustBeOwnedHasOwner() {
		invName = "mustBeOwnedHasOwner";
		sliceByInvariant();
	}
	
	@Test
	public void testInvariant_nAryAssociationsOwnTheirEnds() {
		invName = "nAryAssociationsOwnTheirEnds";
		sliceByInvariant();
	}
	
	@Test
	public void testInvariant_isAbstractDefined() {
		invName = "isAbstractDefined";
		sliceByInvariant();
	}
	
	@Test
	public void testInvariant_derivedUnionIsDerived() {
		invName = "derivedUnionIsDerived";
		sliceByInvariant();
	}
	

	@Test
	public void testInvariant_subsetRequiresDifferentName() {
		invName = "subsetRequiresDifferentName";
		sliceByInvariant();
	}
	
	@Test
	public void testInvariant_derivedUnionIsReadOnly() {
		invName = "derivedUnionIsReadOnly";
		sliceByInvariant();
	}

	@Test
	public void testInvariant_isCompositeIsValid() {
		invName = "isCompositeIsValid";
		sliceByInvariant();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	 
	// * No objects
	 
	@Test
	public void testInvariant_tia1() {
		invName = "tia1";
		sliceByInvariant();
	}
	
	@Test
	public void testInvariant_upperIsValid() {
		invName = "upperIsValid";
		sliceByInvariant();
	}
	
	
	
	@Test
	public void testInvariant_oe1() {
		invName = "oe1";
		sliceByInvariant();
	}
	
	@Test
	public void testInvariant_oe2() {
		invName = "oe2";
		sliceByInvariant();
	}
	
	@Test
	public void testInvariant_isUniqueIsValid() {
		invName = "isUniqueIsValid";
		sliceByInvariant();
	}
	
	@Test
	public void testInvariant_coa1() {
		invName = "coa1";
		sliceByInvariant();
	}
	
	
	
	@Test
	public void testInvariant_led3() {
		invName = "led3";
		sliceByInvariant();
	}
	
	@Test
	public void testInvariant_coa2() {
		invName = "coa2";
		sliceByInvariant();
	}
	
	@Test
	public void testInvariant_sfa2() {
		invName = "sfa2";
		sliceByInvariant();
	}
	
	@Test
	public void testInvariant_coa3() {
		invName = "coa3";
		sliceByInvariant();
	}
	
	@Test
	public void testInvariant_sfa1() {
		invName = "sfa1";
		sliceByInvariant();
	}
	
	@Test
	public void testInvariant_importedVisibilityValid() {
		invName = "importedVisibilityValid";
		sliceByInvariant();
	}
	
	@Test
	public void testInvariant_typeIsValid() {
		invName = "typeIsValid";
		sliceByInvariant();
	}
	
	@Test
	public void testInvariant_bodyConditionOnlyIfIsQuery() {
		invName = "bodyConditionOnlyIfIsQuery";
		sliceByInvariant();
	}
	
	@Test
	public void testInvariant_rsa1() {
		invName = "rsa1";
		sliceByInvariant();
	}
	
	@Test
	public void testInvariant_definingFeaturIsFeatureOfClassifier() {
		invName = "definingFeaturIsFeatureOfClassifier";
		sliceByInvariant();
	}
	
	@Test
	public void testInvariant_led2() {
		invName = "led2";
		sliceByInvariant();
	}
	
	@Test
	public void testInvariant_rsa2() {
		invName = "rsa2";
		sliceByInvariant();
	}
	
	@Test
	public void testInvariant_noNestedClassifiers() {
		invName = "noNestedClassifiers";
		sliceByInvariant();
	}
	
	@Test
	public void testInvariant_led1() {
		invName = "led1";
		sliceByInvariant();
	}
	
	@Test
	public void testInvariant_oneStructuralFeatureDefinesAtMostOneSlotPerInstance() {
		invName = "oneStructuralFeatureDefinesAtMostOneSlotPerInstance";
		sliceByInvariant();
	}
	
	@Test
	public void testInvariant_languageAndBodiesAreValid() {
		invName = "languageAndBodiesAreValid";
		sliceByInvariant();
	}
	
	@Test
	public void testInvariant_packageVisibilityValid() {
		invName = "packageVisibilityValid";
		sliceByInvariant();
	}
	
	@Test
	public void testInvariant_lowerIsValid() {
		invName = "lowerIsValid";
		sliceByInvariant();
	}
	
	@Test
	public void testInvariant_notConstrainingSelf() {
		invName = "notConstrainingSelf";
		sliceByInvariant();
	}
	
	
	
	@Test
	public void testInvariant_visibilityValid() {
		invName = "visibilityValid";
		sliceByInvariant();
	}
	
	@Test
	public void testInvariant_sameGeneralClassifier() {
		invName = "sameGeneralClassifier";
		sliceByInvariant();
	}

	
	@Test
	public void testInvariant_isOrderedIsValid() {
		invName = "isOrderedIsValid";
		sliceByInvariant();
	}
	
	@Test
	public void testInvariant_doa1() {
		invName = "doa1";
		sliceByInvariant();
	}
	
	@Test
	public void testInvariant_interfaceFeaturesArePublic() {
		invName = "interfaceFeaturesArePublic";
		sliceByInvariant();
	}
	
	@Test
	public void testInvariant_wsfa1() {
		invName = "wsfa1";
		sliceByInvariant();
	}
	
	
}

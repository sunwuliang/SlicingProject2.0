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

public class CoachBusWithEDataTypeInsCoslicerTester {
	
	private String basePath = "D:\\EclipseWorkspaceForSlicing\\ClassModelSlicing\\";
	private String ecoreFileName = "CoachBusWithEDataType.ecore";
	private String ecorePath = basePath + "ecores\\";
	private String ecoreFilePath = ecorePath + ecoreFileName;
	private String xmiPath = basePath + "xmis\\";
	private String xmiFileName = ecoreFileName.replace(".ecore", ".xmi");
	private String xmiFilePath = xmiPath + xmiFileName;
	private String oclFileName = ecoreFileName.replace(".ecore", ".ocl");
	private String oclFilePath = basePath + "ocls\\" + oclFileName;
	private String slicedModelPath = basePath + "slices\\" + "Sliced" + ecoreFileName;
	private String slicedInstancePath = basePath + "slices\\" + "Sliced" + xmiFileName;
	private String slicedOclPath = basePath + "slices\\" + "Sliced" + oclFileName; 
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
		ePkg = EMFHelper.loadModel(ecoreFilePath);
		eObjs = EMFHelper.loadInstance(xmiFilePath, ePkg);
		
		iParser = new InvPrePostAnalyzer(ePkg, oclFilePath);
		/*(for (Object obj : iParser.getRefModelElmts(oclFilePath)) {
			System.out.println(obj);
		}*/
		
		refModelElmts = iParser.getRefModelElmtsPerInv();
		
	}
	
	@After
	public void clearnUp() throws Exception {
		
		EMFHelper.saveModel(slicedModelPath, slicedPkg);
		EMFHelper.saveInstance(slicedInstancePath, slicedObjs);
		
		Map<String, Constraint> constraintMap = iParser.getConstraintMap();	
		Set<Constraint> consToSave = new HashSet<Constraint>();
		
		//System.out.println("A list of selected invariants : ");
		for (String invName : st.getSelectedInvs()) {
			//System.out.println(invName);
			if (constraintMap.containsKey(invName)) {
				consToSave.add(constraintMap.get(invName));
			}
			 
		}
		EMFHelper.saveOCLbyModification(slicedOclPath, consToSave, 
				"Sliced" + ecoreFileName.replace(".ecore", invName + ".ecore"), slicedPkg);
	}

	@Test
	public void testInvariantMaxCoachSize() {
		
		invName = "MaxCoachSize";
		Set<String> invNames = new HashSet<String>();
		invNames.add(invName);
		
		List<Object> res = st.slice(basePath, ecoreFilePath, xmiFilePath, oclFilePath, xmiFileName, invName, invNames, SlicingMode.SingleInvariant);
		st.print(res);
		
		this.slicedModelPath = this.slicedModelPath.replace(".ecore", invName + ".ecore");
		this.slicedInstancePath = this.slicedInstancePath.replace(".xmi", invName +  ".xmi");
		this.slicedOclPath = this.slicedOclPath.replace(".ocl", invName + ".ocl");
	}
	
	@Test
	public void testInvariantMinCoachSize() {
		
		invName = "MinCoachSize";
		Set<String> invNames = new HashSet<String>();
		invNames.add(invName);
		
		List<Object> res = st.slice(basePath, ecoreFilePath, xmiFilePath, oclFilePath, xmiFileName, invName, invNames, SlicingMode.SingleInvariant);
		st.print(res);
		
		this.slicedModelPath = this.slicedModelPath.replace(".ecore", invName + ".ecore");
		this.slicedInstancePath = this.slicedInstancePath.replace(".xmi", invName +  ".xmi");
		this.slicedOclPath = this.slicedOclPath.replace(".ocl", invName + ".ocl");
	}
	
	@Test
	public void testUniqueTicketNumber() {
		
		invName = "UniqueTicketNumber";
		Set<String> invNames = new HashSet<String>();
		invNames.add(invName);
		
		List<Object> res = st.slice(basePath, ecoreFilePath, xmiFilePath, oclFilePath, xmiFileName, invName, invNames, SlicingMode.SingleInvariant);
		st.print(res);
		
		this.slicedModelPath = this.slicedModelPath.replace(".ecore", invName + ".ecore");
		this.slicedInstancePath = this.slicedInstancePath.replace(".xmi", invName +  ".xmi");
		this.slicedOclPath = this.slicedOclPath.replace(".ocl", invName + ".ocl");
	}
	
	@Test
	public void testNonNegativeAge() {
		
		invName = "NonNegativeAge";
		Set<String> invNames = new HashSet<String>();
		invNames.add(invName);
		
		List<Object> res = st.slice(basePath, ecoreFilePath, xmiFilePath, oclFilePath, xmiFileName, invName, invNames, SlicingMode.SingleInvariant);
		st.print(res);
		
		this.slicedModelPath = this.slicedModelPath.replace(".ecore", invName + ".ecore");
		this.slicedInstancePath = this.slicedInstancePath.replace(".xmi", invName +  ".xmi");
		this.slicedOclPath = this.slicedOclPath.replace(".ocl", invName + ".ocl");
	}
	
	@Test
	public void testMaleOrFemale() {
		
		invName = "MaleOrFemale";
		Set<String> invNames = new HashSet<String>();
		invNames.add(invName);
		
		List<Object> res = st.slice(basePath, ecoreFilePath, xmiFilePath, oclFilePath, xmiFileName, invName, invNames, SlicingMode.SingleInvariant);
		st.print(res);
		
		this.slicedModelPath = this.slicedModelPath.replace(".ecore", invName + ".ecore");
		this.slicedInstancePath = this.slicedInstancePath.replace(".xmi", invName +  ".xmi");
		this.slicedOclPath = this.slicedOclPath.replace(".ocl", invName + ".ocl");
	}
	
	@Test
	public void testTripType() {
		
		invName = "TripType";
		Set<String> invNames = new HashSet<String>();
		invNames.add(invName);
		
		List<Object> res = st.slice(basePath, ecoreFilePath, xmiFilePath, oclFilePath, xmiFileName, invName, invNames, SlicingMode.SingleInvariant);
		st.print(res);
		
		this.slicedModelPath = this.slicedModelPath.replace(".ecore", invName + ".ecore");
		this.slicedInstancePath = this.slicedInstancePath.replace(".xmi", invName +  ".xmi");
		this.slicedOclPath = this.slicedOclPath.replace(".ocl", invName + ".ocl");
	}
	
	@Test
	public void testUniqueEmployeeID() {
		
		invName = "UniqueEmployeeID";
		Set<String> invNames = new HashSet<String>();
		invNames.add(invName);
		
		List<Object> res = st.slice(basePath, ecoreFilePath, xmiFilePath, oclFilePath, xmiFileName, invName, invNames, SlicingMode.SingleInvariant);
		st.print(res);
		
		this.slicedModelPath = this.slicedModelPath.replace(".ecore", invName + ".ecore");
		this.slicedInstancePath = this.slicedInstancePath.replace(".xmi", invName +  ".xmi");
		this.slicedOclPath = this.slicedOclPath.replace(".ocl", invName + ".ocl");
	}
	
	@Test
	public void testBaseSalaryConstraint() {
		
		invName = "BaseSalaryConstraint";
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

}

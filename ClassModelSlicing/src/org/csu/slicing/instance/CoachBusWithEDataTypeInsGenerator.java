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

import org.csu.slicing.CoachBusWithEDataType.*;
import org.csu.slicing.CoachBusWithEDataType.impl.CoachBusWithEDataTypeFactoryImpl;
import org.csu.slicing.CoachBusWithEDataType.impl.CoachBusWithEDataTypePackageImpl;

/**
 * Need to import org.csu.slicing.coachbuswithedatatype project
 * @author sun
 *
 */
public class CoachBusWithEDataTypeInsGenerator {
	
	public static Set<EObject> generateInstance() {
		
		Set<EObject> objs = new HashSet<EObject>();
		
		Coach coach1 = CoachBusWithEDataTypeFactory.eINSTANCE.createCoach();
		coach1.setId(1);
		coach1.setName("coach1");
		coach1.setModel("Benz");
		coach1.setNoOfSeats(20);
		
		objs.add(coach1);
		
		/**
		 * Cannot successfully create an instance of EDataType
		 */
		//EDataType tripType = (EDataType)CoachBusWithEDataTypeFactory.eINSTANCE.createFromString(
		//		CoachBusWithEDataTypePackage.eINSTANCE.getTType(), "TType");
		//EDataType tripType = CoachBusWithEDataTypePackage.eINSTANCE.getTType();
		//objs.add(tripType);
		
		RegularTrip rtrip1 = CoachBusWithEDataTypeFactory.eINSTANCE.createRegularTrip();
		rtrip1.setName("LasVegasTrip");
		rtrip1.setOrigin("Denver");
		rtrip1.setDestination("LasVegas");
		rtrip1.setNumber(1);
		//rtrip1.setType(tripType);
		
		objs.add(rtrip1);
		
		Passenger p1 = CoachBusWithEDataTypeFactory.eINSTANCE.createPassenger();
		p1.setName("Peter");
		p1.setAge(24);
		p1.setSex(Sex.MALE);
		p1.setIdCard("AB67823");
		
		objs.add(p1);
		
		Passenger p2 = CoachBusWithEDataTypeFactory.eINSTANCE.createPassenger();
		p2.setName("Tom");
		p2.setAge(65);
		p2.setSex(Sex.MALE);
		p2.setIdCard("AB2342");
		
		objs.add(p2);
		
		Passenger p3 = CoachBusWithEDataTypeFactory.eINSTANCE.createPassenger();
		p3.setName("Emily");
		p3.setAge(12);
		p3.setSex(Sex.FEMALE);
		p3.setIdCard("AB1212");
		
		objs.add(p3);
		
		AdultTicket t1 = CoachBusWithEDataTypeFactory.eINSTANCE.createAdultTicket();
		t1.setNumber(1);
		t1.setPrice(24);
		t1.setIsRoundTrip(false);
		t1.setIsElderlyDiscount(false);
		
		objs.add(t1);
		
		AdultTicket t2 = CoachBusWithEDataTypeFactory.eINSTANCE.createAdultTicket();
		t2.setNumber(2);
		t2.setPrice(16);
		t2.setIsRoundTrip(false);
		t2.setIsElderlyDiscount(true);
		
		objs.add(t2);
		
		ChildTicket t3 = CoachBusWithEDataTypeFactory.eINSTANCE.createChildTicket();
		t3.setNumber(3);
		t3.setPrice(12);
		t3.setIsRoundTrip(false);
		t3.setIsSchoolTrip(false);
		
		objs.add(t3);
		
		BookingOffice bo1 = CoachBusWithEDataTypeFactory.eINSTANCE.createBookingOffice();
		bo1.setName("DenverOffice");
		bo1.setLocation("Denver");
		bo1.setOfficeID(1);
		
		objs.add(bo1);
		
		VendingMachine vm1 = CoachBusWithEDataTypeFactory.eINSTANCE.createVendingMachine();
		vm1.setNumber(1);
		
		objs.add(vm1);
		
		coach1.getTrips().add(rtrip1);
		coach1.getOffices().add(bo1);
		rtrip1.getPassengers().add(p1);
		rtrip1.getPassengers().add(p2);
		rtrip1.getPassengers().add(p3);
		rtrip1.getCoaches().add(coach1);
		p1.getTrips().add(rtrip1);
		p1.getTickets().add(t1);
		p2.getTrips().add(rtrip1);
		p2.getTickets().add(t2);
		p3.getTrips().add(rtrip1);
		p3.getTickets().add(t3);
		t1.setPsg(p1);
		t1.setVm(vm1);
		t2.setPsg(p2);
		t2.setVm(vm1);
		t3.setPsg(p3);
		t3.setVm(vm1);
		bo1.getCoaches().add(coach1);
		bo1.getVms().add(vm1);
		vm1.getTickets().add(t1);
		vm1.getTickets().add(t2);
		vm1.getTickets().add(t3);
		vm1.setOffice(bo1);
		
		return objs;
	}
	
	public static void main(String[] args) {
		String basePath = "D:\\EclipseWorkspaceForSlicing\\ClassModelSlicing\\";
		String ecoreFileName = "CoachBusWithEDataType.ecore";
		String ecorePath = basePath + "ecores\\";
		String ecoreFilePath = ecorePath + ecoreFileName;
		String xmiPath = basePath + "xmis\\";
		String xmiFilePath = xmiPath + ecoreFileName.replace(".ecore", ".xmi") ;
		
		
		Set<EObject> objs = CoachBusWithEDataTypeInsGenerator.generateInstance();
		EMFHelper.saveInstance(xmiFilePath, objs);
		
		// Test the generated instance file
		EPackage ePkg = EMFHelper.loadModel(ecoreFilePath);
		List<EObject> eObjs = EMFHelper.loadInstance(xmiFilePath, ePkg);
		for (EObject eObj : eObjs) {
			System.out.println(eObj.eClass().getName());
		}
	}

}

/**
 */
package org.csu.slicing.CoachBusWithEDataType.impl;

import org.csu.slicing.CoachBusWithEDataType.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CoachBusWithEDataTypeFactoryImpl extends EFactoryImpl implements CoachBusWithEDataTypeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CoachBusWithEDataTypeFactory init() {
		try {
			CoachBusWithEDataTypeFactory theCoachBusWithEDataTypeFactory = (CoachBusWithEDataTypeFactory)EPackage.Registry.INSTANCE.getEFactory("http:///CoachBusWithEDataType.ecore"); 
			if (theCoachBusWithEDataTypeFactory != null) {
				return theCoachBusWithEDataTypeFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CoachBusWithEDataTypeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoachBusWithEDataTypeFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CoachBusWithEDataTypePackage.TRIP: return createTrip();
			case CoachBusWithEDataTypePackage.REGULAR_TRIP: return createRegularTrip();
			case CoachBusWithEDataTypePackage.PRIVATE_TRIP: return createPrivateTrip();
			case CoachBusWithEDataTypePackage.COACH: return createCoach();
			case CoachBusWithEDataTypePackage.PASSENGER: return createPassenger();
			case CoachBusWithEDataTypePackage.EMPLOYEE: return createEmployee();
			case CoachBusWithEDataTypePackage.SECURITY_GUARD: return createSecurityGuard();
			case CoachBusWithEDataTypePackage.MANAGER: return createManager();
			case CoachBusWithEDataTypePackage.BOOKING_OFFICE: return createBookingOffice();
			case CoachBusWithEDataTypePackage.TICKET: return createTicket();
			case CoachBusWithEDataTypePackage.VENDING_MACHINE: return createVendingMachine();
			case CoachBusWithEDataTypePackage.ADULT_TICKET: return createAdultTicket();
			case CoachBusWithEDataTypePackage.CHILD_TICKET: return createChildTicket();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case CoachBusWithEDataTypePackage.SEX:
				return createSexFromString(eDataType, initialValue);
			case CoachBusWithEDataTypePackage.TTYPE:
				return createTTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case CoachBusWithEDataTypePackage.SEX:
				return convertSexToString(eDataType, instanceValue);
			case CoachBusWithEDataTypePackage.TTYPE:
				return convertTTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trip createTrip() {
		TripImpl trip = new TripImpl();
		return trip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegularTrip createRegularTrip() {
		RegularTripImpl regularTrip = new RegularTripImpl();
		return regularTrip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrivateTrip createPrivateTrip() {
		PrivateTripImpl privateTrip = new PrivateTripImpl();
		return privateTrip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coach createCoach() {
		CoachImpl coach = new CoachImpl();
		return coach;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Passenger createPassenger() {
		PassengerImpl passenger = new PassengerImpl();
		return passenger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Employee createEmployee() {
		EmployeeImpl employee = new EmployeeImpl();
		return employee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityGuard createSecurityGuard() {
		SecurityGuardImpl securityGuard = new SecurityGuardImpl();
		return securityGuard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Manager createManager() {
		ManagerImpl manager = new ManagerImpl();
		return manager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookingOffice createBookingOffice() {
		BookingOfficeImpl bookingOffice = new BookingOfficeImpl();
		return bookingOffice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ticket createTicket() {
		TicketImpl ticket = new TicketImpl();
		return ticket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VendingMachine createVendingMachine() {
		VendingMachineImpl vendingMachine = new VendingMachineImpl();
		return vendingMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdultTicket createAdultTicket() {
		AdultTicketImpl adultTicket = new AdultTicketImpl();
		return adultTicket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChildTicket createChildTicket() {
		ChildTicketImpl childTicket = new ChildTicketImpl();
		return childTicket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sex createSexFromString(EDataType eDataType, String initialValue) {
		Sex result = Sex.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSexToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createTTypeFromString(EDataType eDataType, String initialValue) {
		return super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTTypeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoachBusWithEDataTypePackage getCoachBusWithEDataTypePackage() {
		return (CoachBusWithEDataTypePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CoachBusWithEDataTypePackage getPackage() {
		return CoachBusWithEDataTypePackage.eINSTANCE;
	}

} //CoachBusWithEDataTypeFactoryImpl

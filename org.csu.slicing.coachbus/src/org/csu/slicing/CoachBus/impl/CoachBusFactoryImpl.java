/**
 */
package org.csu.slicing.CoachBus.impl;

import org.csu.slicing.CoachBus.*;

import org.eclipse.emf.ecore.EClass;
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
public class CoachBusFactoryImpl extends EFactoryImpl implements CoachBusWithEDataTypeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CoachBusWithEDataTypeFactory init() {
		try {
			CoachBusWithEDataTypeFactory theCoachBusFactory = (CoachBusWithEDataTypeFactory)EPackage.Registry.INSTANCE.getEFactory("http:///CoachBus.ecore"); 
			if (theCoachBusFactory != null) {
				return theCoachBusFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CoachBusFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoachBusFactoryImpl() {
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
			case CoachBusPackage.TRIP: return createTrip();
			case CoachBusPackage.REGULAR_TRIP: return createRegularTrip();
			case CoachBusPackage.PRIVATE_TRIP: return createPrivateTrip();
			case CoachBusPackage.COACH: return createCoach();
			case CoachBusPackage.PASSENGER: return createPassenger();
			case CoachBusPackage.EMPLOYEE: return createEmployee();
			case CoachBusPackage.SECURITY_GUARD: return createSecurityGuard();
			case CoachBusPackage.MANAGER: return createManager();
			case CoachBusPackage.BOOKING_OFFICE: return createBookingOffice();
			case CoachBusPackage.TICKET: return createTicket();
			case CoachBusPackage.VENDING_MACHINE: return createVendingMachine();
			case CoachBusPackage.ADULT_TICKET: return createAdultTicket();
			case CoachBusPackage.CHILD_TICKET: return createChildTicket();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
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
	public CoachBusPackage getCoachBusPackage() {
		return (CoachBusPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CoachBusPackage getPackage() {
		return CoachBusPackage.eINSTANCE;
	}

} //CoachBusFactoryImpl

/**
 */
package org.csu.slicing.CoachBus;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.csu.slicing.CoachBus.CoachBusWithEDataTypeFactory
 * @model kind="package"
 * @generated
 */
public interface CoachBusPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "CoachBus";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///CoachBus.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "CoachBus";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CoachBusPackage eINSTANCE = org.csu.slicing.CoachBus.impl.CoachBusPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.csu.slicing.CoachBus.impl.TripImpl <em>Trip</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.csu.slicing.CoachBus.impl.TripImpl
	 * @see org.csu.slicing.CoachBus.impl.CoachBusPackageImpl#getTrip()
	 * @generated
	 */
	int TRIP = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP__NAME = 0;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP__ORIGIN = 1;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP__DESTINATION = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP__TYPE = 3;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP__NUMBER = 4;

	/**
	 * The feature id for the '<em><b>Coaches</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP__COACHES = 5;

	/**
	 * The feature id for the '<em><b>Passengers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP__PASSENGERS = 6;

	/**
	 * The number of structural features of the '<em>Trip</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.csu.slicing.CoachBus.impl.RegularTripImpl <em>Regular Trip</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.csu.slicing.CoachBus.impl.RegularTripImpl
	 * @see org.csu.slicing.CoachBus.impl.CoachBusPackageImpl#getRegularTrip()
	 * @generated
	 */
	int REGULAR_TRIP = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_TRIP__NAME = TRIP__NAME;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_TRIP__ORIGIN = TRIP__ORIGIN;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_TRIP__DESTINATION = TRIP__DESTINATION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_TRIP__TYPE = TRIP__TYPE;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_TRIP__NUMBER = TRIP__NUMBER;

	/**
	 * The feature id for the '<em><b>Coaches</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_TRIP__COACHES = TRIP__COACHES;

	/**
	 * The feature id for the '<em><b>Passengers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_TRIP__PASSENGERS = TRIP__PASSENGERS;

	/**
	 * The number of structural features of the '<em>Regular Trip</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_TRIP_FEATURE_COUNT = TRIP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.csu.slicing.CoachBus.impl.PrivateTripImpl <em>Private Trip</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.csu.slicing.CoachBus.impl.PrivateTripImpl
	 * @see org.csu.slicing.CoachBus.impl.CoachBusPackageImpl#getPrivateTrip()
	 * @generated
	 */
	int PRIVATE_TRIP = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_TRIP__NAME = TRIP__NAME;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_TRIP__ORIGIN = TRIP__ORIGIN;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_TRIP__DESTINATION = TRIP__DESTINATION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_TRIP__TYPE = TRIP__TYPE;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_TRIP__NUMBER = TRIP__NUMBER;

	/**
	 * The feature id for the '<em><b>Coaches</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_TRIP__COACHES = TRIP__COACHES;

	/**
	 * The feature id for the '<em><b>Passengers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_TRIP__PASSENGERS = TRIP__PASSENGERS;

	/**
	 * The feature id for the '<em><b>Extras</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_TRIP__EXTRAS = TRIP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Private Trip</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_TRIP_FEATURE_COUNT = TRIP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.csu.slicing.CoachBus.impl.CoachImpl <em>Coach</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.csu.slicing.CoachBus.impl.CoachImpl
	 * @see org.csu.slicing.CoachBus.impl.CoachBusPackageImpl#getCoach()
	 * @generated
	 */
	int COACH = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COACH__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COACH__NAME = 1;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COACH__MODEL = 2;

	/**
	 * The feature id for the '<em><b>No Of Seats</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COACH__NO_OF_SEATS = 3;

	/**
	 * The feature id for the '<em><b>Trips</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COACH__TRIPS = 4;

	/**
	 * The feature id for the '<em><b>Guards</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COACH__GUARDS = 5;

	/**
	 * The feature id for the '<em><b>Offices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COACH__OFFICES = 6;

	/**
	 * The number of structural features of the '<em>Coach</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COACH_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.csu.slicing.CoachBus.impl.PassengerImpl <em>Passenger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.csu.slicing.CoachBus.impl.PassengerImpl
	 * @see org.csu.slicing.CoachBus.impl.CoachBusPackageImpl#getPassenger()
	 * @generated
	 */
	int PASSENGER = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER__AGE = 1;

	/**
	 * The feature id for the '<em><b>Id Card</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER__ID_CARD = 2;

	/**
	 * The feature id for the '<em><b>Trips</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER__TRIPS = 3;

	/**
	 * The feature id for the '<em><b>Tickets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER__TICKETS = 4;

	/**
	 * The number of structural features of the '<em>Passenger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.csu.slicing.CoachBus.impl.EmployeeImpl <em>Employee</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.csu.slicing.CoachBus.impl.EmployeeImpl
	 * @see org.csu.slicing.CoachBus.impl.CoachBusPackageImpl#getEmployee()
	 * @generated
	 */
	int EMPLOYEE = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__ID = 0;

	/**
	 * The feature id for the '<em><b>Base Salary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__BASE_SALARY = 1;

	/**
	 * The number of structural features of the '<em>Employee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.csu.slicing.CoachBus.impl.SecurityGuardImpl <em>Security Guard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.csu.slicing.CoachBus.impl.SecurityGuardImpl
	 * @see org.csu.slicing.CoachBus.impl.CoachBusPackageImpl#getSecurityGuard()
	 * @generated
	 */
	int SECURITY_GUARD = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_GUARD__ID = EMPLOYEE__ID;

	/**
	 * The feature id for the '<em><b>Base Salary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_GUARD__BASE_SALARY = EMPLOYEE__BASE_SALARY;

	/**
	 * The feature id for the '<em><b>Shift</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_GUARD__SHIFT = EMPLOYEE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Coach</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_GUARD__COACH = EMPLOYEE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Security Guard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_GUARD_FEATURE_COUNT = EMPLOYEE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.csu.slicing.CoachBus.impl.ManagerImpl <em>Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.csu.slicing.CoachBus.impl.ManagerImpl
	 * @see org.csu.slicing.CoachBus.impl.CoachBusPackageImpl#getManager()
	 * @generated
	 */
	int MANAGER = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER__ID = EMPLOYEE__ID;

	/**
	 * The feature id for the '<em><b>Base Salary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER__BASE_SALARY = EMPLOYEE__BASE_SALARY;

	/**
	 * The feature id for the '<em><b>Has MBA</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER__HAS_MBA = EMPLOYEE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Office</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER__OFFICE = EMPLOYEE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_FEATURE_COUNT = EMPLOYEE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.csu.slicing.CoachBus.impl.BookingOfficeImpl <em>Booking Office</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.csu.slicing.CoachBus.impl.BookingOfficeImpl
	 * @see org.csu.slicing.CoachBus.impl.CoachBusPackageImpl#getBookingOffice()
	 * @generated
	 */
	int BOOKING_OFFICE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_OFFICE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_OFFICE__LOCATION = 1;

	/**
	 * The feature id for the '<em><b>Office ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_OFFICE__OFFICE_ID = 2;

	/**
	 * The feature id for the '<em><b>Coaches</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_OFFICE__COACHES = 3;

	/**
	 * The feature id for the '<em><b>Manager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_OFFICE__MANAGER = 4;

	/**
	 * The feature id for the '<em><b>Vms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_OFFICE__VMS = 5;

	/**
	 * The number of structural features of the '<em>Booking Office</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_OFFICE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.csu.slicing.CoachBus.impl.TicketImpl <em>Ticket</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.csu.slicing.CoachBus.impl.TicketImpl
	 * @see org.csu.slicing.CoachBus.impl.CoachBusPackageImpl#getTicket()
	 * @generated
	 */
	int TICKET = 9;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TICKET__NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TICKET__PRICE = 1;

	/**
	 * The feature id for the '<em><b>Is Round Trip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TICKET__IS_ROUND_TRIP = 2;

	/**
	 * The feature id for the '<em><b>Psg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TICKET__PSG = 3;

	/**
	 * The feature id for the '<em><b>Vm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TICKET__VM = 4;

	/**
	 * The number of structural features of the '<em>Ticket</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TICKET_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.csu.slicing.CoachBus.impl.VendingMachineImpl <em>Vending Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.csu.slicing.CoachBus.impl.VendingMachineImpl
	 * @see org.csu.slicing.CoachBus.impl.CoachBusPackageImpl#getVendingMachine()
	 * @generated
	 */
	int VENDING_MACHINE = 10;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDING_MACHINE__NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Tickets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDING_MACHINE__TICKETS = 1;

	/**
	 * The feature id for the '<em><b>Office</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDING_MACHINE__OFFICE = 2;

	/**
	 * The number of structural features of the '<em>Vending Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDING_MACHINE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.csu.slicing.CoachBus.impl.AdultTicketImpl <em>Adult Ticket</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.csu.slicing.CoachBus.impl.AdultTicketImpl
	 * @see org.csu.slicing.CoachBus.impl.CoachBusPackageImpl#getAdultTicket()
	 * @generated
	 */
	int ADULT_TICKET = 11;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADULT_TICKET__NUMBER = TICKET__NUMBER;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADULT_TICKET__PRICE = TICKET__PRICE;

	/**
	 * The feature id for the '<em><b>Is Round Trip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADULT_TICKET__IS_ROUND_TRIP = TICKET__IS_ROUND_TRIP;

	/**
	 * The feature id for the '<em><b>Psg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADULT_TICKET__PSG = TICKET__PSG;

	/**
	 * The feature id for the '<em><b>Vm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADULT_TICKET__VM = TICKET__VM;

	/**
	 * The feature id for the '<em><b>Is Elderly Discount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADULT_TICKET__IS_ELDERLY_DISCOUNT = TICKET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Adult Ticket</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADULT_TICKET_FEATURE_COUNT = TICKET_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.csu.slicing.CoachBus.impl.ChildTicketImpl <em>Child Ticket</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.csu.slicing.CoachBus.impl.ChildTicketImpl
	 * @see org.csu.slicing.CoachBus.impl.CoachBusPackageImpl#getChildTicket()
	 * @generated
	 */
	int CHILD_TICKET = 12;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_TICKET__NUMBER = TICKET__NUMBER;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_TICKET__PRICE = TICKET__PRICE;

	/**
	 * The feature id for the '<em><b>Is Round Trip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_TICKET__IS_ROUND_TRIP = TICKET__IS_ROUND_TRIP;

	/**
	 * The feature id for the '<em><b>Psg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_TICKET__PSG = TICKET__PSG;

	/**
	 * The feature id for the '<em><b>Vm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_TICKET__VM = TICKET__VM;

	/**
	 * The feature id for the '<em><b>Is School Trip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_TICKET__IS_SCHOOL_TRIP = TICKET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Child Ticket</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_TICKET_FEATURE_COUNT = TICKET_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link org.csu.slicing.CoachBus.Trip <em>Trip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trip</em>'.
	 * @see org.csu.slicing.CoachBus.Trip
	 * @generated
	 */
	EClass getTrip();

	/**
	 * Returns the meta object for the attribute '{@link org.csu.slicing.CoachBus.Trip#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.csu.slicing.CoachBus.Trip#getName()
	 * @see #getTrip()
	 * @generated
	 */
	EAttribute getTrip_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.csu.slicing.CoachBus.Trip#getOrigin <em>Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Origin</em>'.
	 * @see org.csu.slicing.CoachBus.Trip#getOrigin()
	 * @see #getTrip()
	 * @generated
	 */
	EAttribute getTrip_Origin();

	/**
	 * Returns the meta object for the attribute '{@link org.csu.slicing.CoachBus.Trip#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Destination</em>'.
	 * @see org.csu.slicing.CoachBus.Trip#getDestination()
	 * @see #getTrip()
	 * @generated
	 */
	EAttribute getTrip_Destination();

	/**
	 * Returns the meta object for the attribute '{@link org.csu.slicing.CoachBus.Trip#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.csu.slicing.CoachBus.Trip#getType()
	 * @see #getTrip()
	 * @generated
	 */
	EAttribute getTrip_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.csu.slicing.CoachBus.Trip#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see org.csu.slicing.CoachBus.Trip#getNumber()
	 * @see #getTrip()
	 * @generated
	 */
	EAttribute getTrip_Number();

	/**
	 * Returns the meta object for the reference list '{@link org.csu.slicing.CoachBus.Trip#getCoaches <em>Coaches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Coaches</em>'.
	 * @see org.csu.slicing.CoachBus.Trip#getCoaches()
	 * @see #getTrip()
	 * @generated
	 */
	EReference getTrip_Coaches();

	/**
	 * Returns the meta object for the reference list '{@link org.csu.slicing.CoachBus.Trip#getPassengers <em>Passengers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Passengers</em>'.
	 * @see org.csu.slicing.CoachBus.Trip#getPassengers()
	 * @see #getTrip()
	 * @generated
	 */
	EReference getTrip_Passengers();

	/**
	 * Returns the meta object for class '{@link org.csu.slicing.CoachBus.RegularTrip <em>Regular Trip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Regular Trip</em>'.
	 * @see org.csu.slicing.CoachBus.RegularTrip
	 * @generated
	 */
	EClass getRegularTrip();

	/**
	 * Returns the meta object for class '{@link org.csu.slicing.CoachBus.PrivateTrip <em>Private Trip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Private Trip</em>'.
	 * @see org.csu.slicing.CoachBus.PrivateTrip
	 * @generated
	 */
	EClass getPrivateTrip();

	/**
	 * Returns the meta object for the attribute '{@link org.csu.slicing.CoachBus.PrivateTrip#getExtras <em>Extras</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extras</em>'.
	 * @see org.csu.slicing.CoachBus.PrivateTrip#getExtras()
	 * @see #getPrivateTrip()
	 * @generated
	 */
	EAttribute getPrivateTrip_Extras();

	/**
	 * Returns the meta object for class '{@link org.csu.slicing.CoachBus.Coach <em>Coach</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coach</em>'.
	 * @see org.csu.slicing.CoachBus.Coach
	 * @generated
	 */
	EClass getCoach();

	/**
	 * Returns the meta object for the attribute '{@link org.csu.slicing.CoachBus.Coach#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.csu.slicing.CoachBus.Coach#getId()
	 * @see #getCoach()
	 * @generated
	 */
	EAttribute getCoach_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.csu.slicing.CoachBus.Coach#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.csu.slicing.CoachBus.Coach#getName()
	 * @see #getCoach()
	 * @generated
	 */
	EAttribute getCoach_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.csu.slicing.CoachBus.Coach#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model</em>'.
	 * @see org.csu.slicing.CoachBus.Coach#getModel()
	 * @see #getCoach()
	 * @generated
	 */
	EAttribute getCoach_Model();

	/**
	 * Returns the meta object for the attribute '{@link org.csu.slicing.CoachBus.Coach#getNoOfSeats <em>No Of Seats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>No Of Seats</em>'.
	 * @see org.csu.slicing.CoachBus.Coach#getNoOfSeats()
	 * @see #getCoach()
	 * @generated
	 */
	EAttribute getCoach_NoOfSeats();

	/**
	 * Returns the meta object for the reference list '{@link org.csu.slicing.CoachBus.Coach#getTrips <em>Trips</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Trips</em>'.
	 * @see org.csu.slicing.CoachBus.Coach#getTrips()
	 * @see #getCoach()
	 * @generated
	 */
	EReference getCoach_Trips();

	/**
	 * Returns the meta object for the reference list '{@link org.csu.slicing.CoachBus.Coach#getGuards <em>Guards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Guards</em>'.
	 * @see org.csu.slicing.CoachBus.Coach#getGuards()
	 * @see #getCoach()
	 * @generated
	 */
	EReference getCoach_Guards();

	/**
	 * Returns the meta object for the reference list '{@link org.csu.slicing.CoachBus.Coach#getOffices <em>Offices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Offices</em>'.
	 * @see org.csu.slicing.CoachBus.Coach#getOffices()
	 * @see #getCoach()
	 * @generated
	 */
	EReference getCoach_Offices();

	/**
	 * Returns the meta object for class '{@link org.csu.slicing.CoachBus.Passenger <em>Passenger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Passenger</em>'.
	 * @see org.csu.slicing.CoachBus.Passenger
	 * @generated
	 */
	EClass getPassenger();

	/**
	 * Returns the meta object for the attribute '{@link org.csu.slicing.CoachBus.Passenger#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.csu.slicing.CoachBus.Passenger#getName()
	 * @see #getPassenger()
	 * @generated
	 */
	EAttribute getPassenger_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.csu.slicing.CoachBus.Passenger#getAge <em>Age</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Age</em>'.
	 * @see org.csu.slicing.CoachBus.Passenger#getAge()
	 * @see #getPassenger()
	 * @generated
	 */
	EAttribute getPassenger_Age();

	/**
	 * Returns the meta object for the attribute '{@link org.csu.slicing.CoachBus.Passenger#getIdCard <em>Id Card</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Card</em>'.
	 * @see org.csu.slicing.CoachBus.Passenger#getIdCard()
	 * @see #getPassenger()
	 * @generated
	 */
	EAttribute getPassenger_IdCard();

	/**
	 * Returns the meta object for the reference list '{@link org.csu.slicing.CoachBus.Passenger#getTrips <em>Trips</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Trips</em>'.
	 * @see org.csu.slicing.CoachBus.Passenger#getTrips()
	 * @see #getPassenger()
	 * @generated
	 */
	EReference getPassenger_Trips();

	/**
	 * Returns the meta object for the reference list '{@link org.csu.slicing.CoachBus.Passenger#getTickets <em>Tickets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tickets</em>'.
	 * @see org.csu.slicing.CoachBus.Passenger#getTickets()
	 * @see #getPassenger()
	 * @generated
	 */
	EReference getPassenger_Tickets();

	/**
	 * Returns the meta object for class '{@link org.csu.slicing.CoachBus.Employee <em>Employee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Employee</em>'.
	 * @see org.csu.slicing.CoachBus.Employee
	 * @generated
	 */
	EClass getEmployee();

	/**
	 * Returns the meta object for the attribute '{@link org.csu.slicing.CoachBus.Employee#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.csu.slicing.CoachBus.Employee#getId()
	 * @see #getEmployee()
	 * @generated
	 */
	EAttribute getEmployee_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.csu.slicing.CoachBus.Employee#getBaseSalary <em>Base Salary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Salary</em>'.
	 * @see org.csu.slicing.CoachBus.Employee#getBaseSalary()
	 * @see #getEmployee()
	 * @generated
	 */
	EAttribute getEmployee_BaseSalary();

	/**
	 * Returns the meta object for class '{@link org.csu.slicing.CoachBus.SecurityGuard <em>Security Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Guard</em>'.
	 * @see org.csu.slicing.CoachBus.SecurityGuard
	 * @generated
	 */
	EClass getSecurityGuard();

	/**
	 * Returns the meta object for the attribute '{@link org.csu.slicing.CoachBus.SecurityGuard#getShift <em>Shift</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shift</em>'.
	 * @see org.csu.slicing.CoachBus.SecurityGuard#getShift()
	 * @see #getSecurityGuard()
	 * @generated
	 */
	EAttribute getSecurityGuard_Shift();

	/**
	 * Returns the meta object for the reference '{@link org.csu.slicing.CoachBus.SecurityGuard#getCoach <em>Coach</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Coach</em>'.
	 * @see org.csu.slicing.CoachBus.SecurityGuard#getCoach()
	 * @see #getSecurityGuard()
	 * @generated
	 */
	EReference getSecurityGuard_Coach();

	/**
	 * Returns the meta object for class '{@link org.csu.slicing.CoachBus.Manager <em>Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Manager</em>'.
	 * @see org.csu.slicing.CoachBus.Manager
	 * @generated
	 */
	EClass getManager();

	/**
	 * Returns the meta object for the attribute '{@link org.csu.slicing.CoachBus.Manager#isHasMBA <em>Has MBA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has MBA</em>'.
	 * @see org.csu.slicing.CoachBus.Manager#isHasMBA()
	 * @see #getManager()
	 * @generated
	 */
	EAttribute getManager_HasMBA();

	/**
	 * Returns the meta object for the reference '{@link org.csu.slicing.CoachBus.Manager#getOffice <em>Office</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Office</em>'.
	 * @see org.csu.slicing.CoachBus.Manager#getOffice()
	 * @see #getManager()
	 * @generated
	 */
	EReference getManager_Office();

	/**
	 * Returns the meta object for class '{@link org.csu.slicing.CoachBus.BookingOffice <em>Booking Office</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Booking Office</em>'.
	 * @see org.csu.slicing.CoachBus.BookingOffice
	 * @generated
	 */
	EClass getBookingOffice();

	/**
	 * Returns the meta object for the attribute '{@link org.csu.slicing.CoachBus.BookingOffice#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.csu.slicing.CoachBus.BookingOffice#getName()
	 * @see #getBookingOffice()
	 * @generated
	 */
	EAttribute getBookingOffice_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.csu.slicing.CoachBus.BookingOffice#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see org.csu.slicing.CoachBus.BookingOffice#getLocation()
	 * @see #getBookingOffice()
	 * @generated
	 */
	EAttribute getBookingOffice_Location();

	/**
	 * Returns the meta object for the attribute '{@link org.csu.slicing.CoachBus.BookingOffice#getOfficeID <em>Office ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Office ID</em>'.
	 * @see org.csu.slicing.CoachBus.BookingOffice#getOfficeID()
	 * @see #getBookingOffice()
	 * @generated
	 */
	EAttribute getBookingOffice_OfficeID();

	/**
	 * Returns the meta object for the reference list '{@link org.csu.slicing.CoachBus.BookingOffice#getCoaches <em>Coaches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Coaches</em>'.
	 * @see org.csu.slicing.CoachBus.BookingOffice#getCoaches()
	 * @see #getBookingOffice()
	 * @generated
	 */
	EReference getBookingOffice_Coaches();

	/**
	 * Returns the meta object for the reference '{@link org.csu.slicing.CoachBus.BookingOffice#getManager <em>Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Manager</em>'.
	 * @see org.csu.slicing.CoachBus.BookingOffice#getManager()
	 * @see #getBookingOffice()
	 * @generated
	 */
	EReference getBookingOffice_Manager();

	/**
	 * Returns the meta object for the reference list '{@link org.csu.slicing.CoachBus.BookingOffice#getVms <em>Vms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Vms</em>'.
	 * @see org.csu.slicing.CoachBus.BookingOffice#getVms()
	 * @see #getBookingOffice()
	 * @generated
	 */
	EReference getBookingOffice_Vms();

	/**
	 * Returns the meta object for class '{@link org.csu.slicing.CoachBus.Ticket <em>Ticket</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ticket</em>'.
	 * @see org.csu.slicing.CoachBus.Ticket
	 * @generated
	 */
	EClass getTicket();

	/**
	 * Returns the meta object for the attribute '{@link org.csu.slicing.CoachBus.Ticket#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see org.csu.slicing.CoachBus.Ticket#getNumber()
	 * @see #getTicket()
	 * @generated
	 */
	EAttribute getTicket_Number();

	/**
	 * Returns the meta object for the attribute '{@link org.csu.slicing.CoachBus.Ticket#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see org.csu.slicing.CoachBus.Ticket#getPrice()
	 * @see #getTicket()
	 * @generated
	 */
	EAttribute getTicket_Price();

	/**
	 * Returns the meta object for the attribute '{@link org.csu.slicing.CoachBus.Ticket#isIsRoundTrip <em>Is Round Trip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Round Trip</em>'.
	 * @see org.csu.slicing.CoachBus.Ticket#isIsRoundTrip()
	 * @see #getTicket()
	 * @generated
	 */
	EAttribute getTicket_IsRoundTrip();

	/**
	 * Returns the meta object for the reference '{@link org.csu.slicing.CoachBus.Ticket#getPsg <em>Psg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Psg</em>'.
	 * @see org.csu.slicing.CoachBus.Ticket#getPsg()
	 * @see #getTicket()
	 * @generated
	 */
	EReference getTicket_Psg();

	/**
	 * Returns the meta object for the reference '{@link org.csu.slicing.CoachBus.Ticket#getVm <em>Vm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Vm</em>'.
	 * @see org.csu.slicing.CoachBus.Ticket#getVm()
	 * @see #getTicket()
	 * @generated
	 */
	EReference getTicket_Vm();

	/**
	 * Returns the meta object for class '{@link org.csu.slicing.CoachBus.VendingMachine <em>Vending Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vending Machine</em>'.
	 * @see org.csu.slicing.CoachBus.VendingMachine
	 * @generated
	 */
	EClass getVendingMachine();

	/**
	 * Returns the meta object for the attribute '{@link org.csu.slicing.CoachBus.VendingMachine#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see org.csu.slicing.CoachBus.VendingMachine#getNumber()
	 * @see #getVendingMachine()
	 * @generated
	 */
	EAttribute getVendingMachine_Number();

	/**
	 * Returns the meta object for the reference list '{@link org.csu.slicing.CoachBus.VendingMachine#getTickets <em>Tickets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tickets</em>'.
	 * @see org.csu.slicing.CoachBus.VendingMachine#getTickets()
	 * @see #getVendingMachine()
	 * @generated
	 */
	EReference getVendingMachine_Tickets();

	/**
	 * Returns the meta object for the reference '{@link org.csu.slicing.CoachBus.VendingMachine#getOffice <em>Office</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Office</em>'.
	 * @see org.csu.slicing.CoachBus.VendingMachine#getOffice()
	 * @see #getVendingMachine()
	 * @generated
	 */
	EReference getVendingMachine_Office();

	/**
	 * Returns the meta object for class '{@link org.csu.slicing.CoachBus.AdultTicket <em>Adult Ticket</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adult Ticket</em>'.
	 * @see org.csu.slicing.CoachBus.AdultTicket
	 * @generated
	 */
	EClass getAdultTicket();

	/**
	 * Returns the meta object for the attribute '{@link org.csu.slicing.CoachBus.AdultTicket#isIsElderlyDiscount <em>Is Elderly Discount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Elderly Discount</em>'.
	 * @see org.csu.slicing.CoachBus.AdultTicket#isIsElderlyDiscount()
	 * @see #getAdultTicket()
	 * @generated
	 */
	EAttribute getAdultTicket_IsElderlyDiscount();

	/**
	 * Returns the meta object for class '{@link org.csu.slicing.CoachBus.ChildTicket <em>Child Ticket</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Child Ticket</em>'.
	 * @see org.csu.slicing.CoachBus.ChildTicket
	 * @generated
	 */
	EClass getChildTicket();

	/**
	 * Returns the meta object for the attribute '{@link org.csu.slicing.CoachBus.ChildTicket#isIsSchoolTrip <em>Is School Trip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is School Trip</em>'.
	 * @see org.csu.slicing.CoachBus.ChildTicket#isIsSchoolTrip()
	 * @see #getChildTicket()
	 * @generated
	 */
	EAttribute getChildTicket_IsSchoolTrip();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CoachBusWithEDataTypeFactory getCoachBusFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.csu.slicing.CoachBus.impl.TripImpl <em>Trip</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.csu.slicing.CoachBus.impl.TripImpl
		 * @see org.csu.slicing.CoachBus.impl.CoachBusPackageImpl#getTrip()
		 * @generated
		 */
		EClass TRIP = eINSTANCE.getTrip();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIP__NAME = eINSTANCE.getTrip_Name();

		/**
		 * The meta object literal for the '<em><b>Origin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIP__ORIGIN = eINSTANCE.getTrip_Origin();

		/**
		 * The meta object literal for the '<em><b>Destination</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIP__DESTINATION = eINSTANCE.getTrip_Destination();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIP__TYPE = eINSTANCE.getTrip_Type();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIP__NUMBER = eINSTANCE.getTrip_Number();

		/**
		 * The meta object literal for the '<em><b>Coaches</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIP__COACHES = eINSTANCE.getTrip_Coaches();

		/**
		 * The meta object literal for the '<em><b>Passengers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIP__PASSENGERS = eINSTANCE.getTrip_Passengers();

		/**
		 * The meta object literal for the '{@link org.csu.slicing.CoachBus.impl.RegularTripImpl <em>Regular Trip</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.csu.slicing.CoachBus.impl.RegularTripImpl
		 * @see org.csu.slicing.CoachBus.impl.CoachBusPackageImpl#getRegularTrip()
		 * @generated
		 */
		EClass REGULAR_TRIP = eINSTANCE.getRegularTrip();

		/**
		 * The meta object literal for the '{@link org.csu.slicing.CoachBus.impl.PrivateTripImpl <em>Private Trip</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.csu.slicing.CoachBus.impl.PrivateTripImpl
		 * @see org.csu.slicing.CoachBus.impl.CoachBusPackageImpl#getPrivateTrip()
		 * @generated
		 */
		EClass PRIVATE_TRIP = eINSTANCE.getPrivateTrip();

		/**
		 * The meta object literal for the '<em><b>Extras</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIVATE_TRIP__EXTRAS = eINSTANCE.getPrivateTrip_Extras();

		/**
		 * The meta object literal for the '{@link org.csu.slicing.CoachBus.impl.CoachImpl <em>Coach</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.csu.slicing.CoachBus.impl.CoachImpl
		 * @see org.csu.slicing.CoachBus.impl.CoachBusPackageImpl#getCoach()
		 * @generated
		 */
		EClass COACH = eINSTANCE.getCoach();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COACH__ID = eINSTANCE.getCoach_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COACH__NAME = eINSTANCE.getCoach_Name();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COACH__MODEL = eINSTANCE.getCoach_Model();

		/**
		 * The meta object literal for the '<em><b>No Of Seats</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COACH__NO_OF_SEATS = eINSTANCE.getCoach_NoOfSeats();

		/**
		 * The meta object literal for the '<em><b>Trips</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COACH__TRIPS = eINSTANCE.getCoach_Trips();

		/**
		 * The meta object literal for the '<em><b>Guards</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COACH__GUARDS = eINSTANCE.getCoach_Guards();

		/**
		 * The meta object literal for the '<em><b>Offices</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COACH__OFFICES = eINSTANCE.getCoach_Offices();

		/**
		 * The meta object literal for the '{@link org.csu.slicing.CoachBus.impl.PassengerImpl <em>Passenger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.csu.slicing.CoachBus.impl.PassengerImpl
		 * @see org.csu.slicing.CoachBus.impl.CoachBusPackageImpl#getPassenger()
		 * @generated
		 */
		EClass PASSENGER = eINSTANCE.getPassenger();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER__NAME = eINSTANCE.getPassenger_Name();

		/**
		 * The meta object literal for the '<em><b>Age</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER__AGE = eINSTANCE.getPassenger_Age();

		/**
		 * The meta object literal for the '<em><b>Id Card</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER__ID_CARD = eINSTANCE.getPassenger_IdCard();

		/**
		 * The meta object literal for the '<em><b>Trips</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PASSENGER__TRIPS = eINSTANCE.getPassenger_Trips();

		/**
		 * The meta object literal for the '<em><b>Tickets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PASSENGER__TICKETS = eINSTANCE.getPassenger_Tickets();

		/**
		 * The meta object literal for the '{@link org.csu.slicing.CoachBus.impl.EmployeeImpl <em>Employee</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.csu.slicing.CoachBus.impl.EmployeeImpl
		 * @see org.csu.slicing.CoachBus.impl.CoachBusPackageImpl#getEmployee()
		 * @generated
		 */
		EClass EMPLOYEE = eINSTANCE.getEmployee();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYEE__ID = eINSTANCE.getEmployee_Id();

		/**
		 * The meta object literal for the '<em><b>Base Salary</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYEE__BASE_SALARY = eINSTANCE.getEmployee_BaseSalary();

		/**
		 * The meta object literal for the '{@link org.csu.slicing.CoachBus.impl.SecurityGuardImpl <em>Security Guard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.csu.slicing.CoachBus.impl.SecurityGuardImpl
		 * @see org.csu.slicing.CoachBus.impl.CoachBusPackageImpl#getSecurityGuard()
		 * @generated
		 */
		EClass SECURITY_GUARD = eINSTANCE.getSecurityGuard();

		/**
		 * The meta object literal for the '<em><b>Shift</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_GUARD__SHIFT = eINSTANCE.getSecurityGuard_Shift();

		/**
		 * The meta object literal for the '<em><b>Coach</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_GUARD__COACH = eINSTANCE.getSecurityGuard_Coach();

		/**
		 * The meta object literal for the '{@link org.csu.slicing.CoachBus.impl.ManagerImpl <em>Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.csu.slicing.CoachBus.impl.ManagerImpl
		 * @see org.csu.slicing.CoachBus.impl.CoachBusPackageImpl#getManager()
		 * @generated
		 */
		EClass MANAGER = eINSTANCE.getManager();

		/**
		 * The meta object literal for the '<em><b>Has MBA</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANAGER__HAS_MBA = eINSTANCE.getManager_HasMBA();

		/**
		 * The meta object literal for the '<em><b>Office</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANAGER__OFFICE = eINSTANCE.getManager_Office();

		/**
		 * The meta object literal for the '{@link org.csu.slicing.CoachBus.impl.BookingOfficeImpl <em>Booking Office</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.csu.slicing.CoachBus.impl.BookingOfficeImpl
		 * @see org.csu.slicing.CoachBus.impl.CoachBusPackageImpl#getBookingOffice()
		 * @generated
		 */
		EClass BOOKING_OFFICE = eINSTANCE.getBookingOffice();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING_OFFICE__NAME = eINSTANCE.getBookingOffice_Name();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING_OFFICE__LOCATION = eINSTANCE.getBookingOffice_Location();

		/**
		 * The meta object literal for the '<em><b>Office ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING_OFFICE__OFFICE_ID = eINSTANCE.getBookingOffice_OfficeID();

		/**
		 * The meta object literal for the '<em><b>Coaches</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKING_OFFICE__COACHES = eINSTANCE.getBookingOffice_Coaches();

		/**
		 * The meta object literal for the '<em><b>Manager</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKING_OFFICE__MANAGER = eINSTANCE.getBookingOffice_Manager();

		/**
		 * The meta object literal for the '<em><b>Vms</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKING_OFFICE__VMS = eINSTANCE.getBookingOffice_Vms();

		/**
		 * The meta object literal for the '{@link org.csu.slicing.CoachBus.impl.TicketImpl <em>Ticket</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.csu.slicing.CoachBus.impl.TicketImpl
		 * @see org.csu.slicing.CoachBus.impl.CoachBusPackageImpl#getTicket()
		 * @generated
		 */
		EClass TICKET = eINSTANCE.getTicket();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TICKET__NUMBER = eINSTANCE.getTicket_Number();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TICKET__PRICE = eINSTANCE.getTicket_Price();

		/**
		 * The meta object literal for the '<em><b>Is Round Trip</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TICKET__IS_ROUND_TRIP = eINSTANCE.getTicket_IsRoundTrip();

		/**
		 * The meta object literal for the '<em><b>Psg</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TICKET__PSG = eINSTANCE.getTicket_Psg();

		/**
		 * The meta object literal for the '<em><b>Vm</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TICKET__VM = eINSTANCE.getTicket_Vm();

		/**
		 * The meta object literal for the '{@link org.csu.slicing.CoachBus.impl.VendingMachineImpl <em>Vending Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.csu.slicing.CoachBus.impl.VendingMachineImpl
		 * @see org.csu.slicing.CoachBus.impl.CoachBusPackageImpl#getVendingMachine()
		 * @generated
		 */
		EClass VENDING_MACHINE = eINSTANCE.getVendingMachine();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VENDING_MACHINE__NUMBER = eINSTANCE.getVendingMachine_Number();

		/**
		 * The meta object literal for the '<em><b>Tickets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VENDING_MACHINE__TICKETS = eINSTANCE.getVendingMachine_Tickets();

		/**
		 * The meta object literal for the '<em><b>Office</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VENDING_MACHINE__OFFICE = eINSTANCE.getVendingMachine_Office();

		/**
		 * The meta object literal for the '{@link org.csu.slicing.CoachBus.impl.AdultTicketImpl <em>Adult Ticket</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.csu.slicing.CoachBus.impl.AdultTicketImpl
		 * @see org.csu.slicing.CoachBus.impl.CoachBusPackageImpl#getAdultTicket()
		 * @generated
		 */
		EClass ADULT_TICKET = eINSTANCE.getAdultTicket();

		/**
		 * The meta object literal for the '<em><b>Is Elderly Discount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADULT_TICKET__IS_ELDERLY_DISCOUNT = eINSTANCE.getAdultTicket_IsElderlyDiscount();

		/**
		 * The meta object literal for the '{@link org.csu.slicing.CoachBus.impl.ChildTicketImpl <em>Child Ticket</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.csu.slicing.CoachBus.impl.ChildTicketImpl
		 * @see org.csu.slicing.CoachBus.impl.CoachBusPackageImpl#getChildTicket()
		 * @generated
		 */
		EClass CHILD_TICKET = eINSTANCE.getChildTicket();

		/**
		 * The meta object literal for the '<em><b>Is School Trip</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHILD_TICKET__IS_SCHOOL_TRIP = eINSTANCE.getChildTicket_IsSchoolTrip();

	}

} //CoachBusPackage

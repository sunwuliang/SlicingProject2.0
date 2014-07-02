/**
 */
package org.csu.slicing.CoachBusWithEDataType;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
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
 * @see org.csu.slicing.CoachBusWithEDataType.CoachBusWithEDataTypeFactory
 * @model kind="package"
 * @generated
 */
public interface CoachBusWithEDataTypePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "CoachBusWithEDataType";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///CoachBusWithEDataType.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "CoachBusWithEDataType";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CoachBusWithEDataTypePackage eINSTANCE = org.csu.slicing.CoachBusWithEDataType.impl.CoachBusWithEDataTypePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.csu.slicing.CoachBusWithEDataType.impl.TripImpl <em>Trip</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.csu.slicing.CoachBusWithEDataType.impl.TripImpl
	 * @see org.csu.slicing.CoachBusWithEDataType.impl.CoachBusWithEDataTypePackageImpl#getTrip()
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
	 * The meta object id for the '{@link org.csu.slicing.CoachBusWithEDataType.impl.RegularTripImpl <em>Regular Trip</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.csu.slicing.CoachBusWithEDataType.impl.RegularTripImpl
	 * @see org.csu.slicing.CoachBusWithEDataType.impl.CoachBusWithEDataTypePackageImpl#getRegularTrip()
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
	 * The meta object id for the '{@link org.csu.slicing.CoachBusWithEDataType.impl.PrivateTripImpl <em>Private Trip</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.csu.slicing.CoachBusWithEDataType.impl.PrivateTripImpl
	 * @see org.csu.slicing.CoachBusWithEDataType.impl.CoachBusWithEDataTypePackageImpl#getPrivateTrip()
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
	 * The meta object id for the '{@link org.csu.slicing.CoachBusWithEDataType.impl.CoachImpl <em>Coach</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.csu.slicing.CoachBusWithEDataType.impl.CoachImpl
	 * @see org.csu.slicing.CoachBusWithEDataType.impl.CoachBusWithEDataTypePackageImpl#getCoach()
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
	 * The meta object id for the '{@link org.csu.slicing.CoachBusWithEDataType.impl.PassengerImpl <em>Passenger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.csu.slicing.CoachBusWithEDataType.impl.PassengerImpl
	 * @see org.csu.slicing.CoachBusWithEDataType.impl.CoachBusWithEDataTypePackageImpl#getPassenger()
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
	 * The feature id for the '<em><b>Sex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER__SEX = 5;

	/**
	 * The number of structural features of the '<em>Passenger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.csu.slicing.CoachBusWithEDataType.impl.EmployeeImpl <em>Employee</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.csu.slicing.CoachBusWithEDataType.impl.EmployeeImpl
	 * @see org.csu.slicing.CoachBusWithEDataType.impl.CoachBusWithEDataTypePackageImpl#getEmployee()
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
	 * The meta object id for the '{@link org.csu.slicing.CoachBusWithEDataType.impl.SecurityGuardImpl <em>Security Guard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.csu.slicing.CoachBusWithEDataType.impl.SecurityGuardImpl
	 * @see org.csu.slicing.CoachBusWithEDataType.impl.CoachBusWithEDataTypePackageImpl#getSecurityGuard()
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
	 * The meta object id for the '{@link org.csu.slicing.CoachBusWithEDataType.impl.ManagerImpl <em>Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.csu.slicing.CoachBusWithEDataType.impl.ManagerImpl
	 * @see org.csu.slicing.CoachBusWithEDataType.impl.CoachBusWithEDataTypePackageImpl#getManager()
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
	 * The meta object id for the '{@link org.csu.slicing.CoachBusWithEDataType.impl.BookingOfficeImpl <em>Booking Office</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.csu.slicing.CoachBusWithEDataType.impl.BookingOfficeImpl
	 * @see org.csu.slicing.CoachBusWithEDataType.impl.CoachBusWithEDataTypePackageImpl#getBookingOffice()
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
	 * The meta object id for the '{@link org.csu.slicing.CoachBusWithEDataType.impl.TicketImpl <em>Ticket</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.csu.slicing.CoachBusWithEDataType.impl.TicketImpl
	 * @see org.csu.slicing.CoachBusWithEDataType.impl.CoachBusWithEDataTypePackageImpl#getTicket()
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
	 * The meta object id for the '{@link org.csu.slicing.CoachBusWithEDataType.impl.VendingMachineImpl <em>Vending Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.csu.slicing.CoachBusWithEDataType.impl.VendingMachineImpl
	 * @see org.csu.slicing.CoachBusWithEDataType.impl.CoachBusWithEDataTypePackageImpl#getVendingMachine()
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
	 * The meta object id for the '{@link org.csu.slicing.CoachBusWithEDataType.impl.AdultTicketImpl <em>Adult Ticket</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.csu.slicing.CoachBusWithEDataType.impl.AdultTicketImpl
	 * @see org.csu.slicing.CoachBusWithEDataType.impl.CoachBusWithEDataTypePackageImpl#getAdultTicket()
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
	 * The meta object id for the '{@link org.csu.slicing.CoachBusWithEDataType.impl.ChildTicketImpl <em>Child Ticket</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.csu.slicing.CoachBusWithEDataType.impl.ChildTicketImpl
	 * @see org.csu.slicing.CoachBusWithEDataType.impl.CoachBusWithEDataTypePackageImpl#getChildTicket()
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
	 * The meta object id for the '{@link org.csu.slicing.CoachBusWithEDataType.Sex <em>Sex</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.csu.slicing.CoachBusWithEDataType.Sex
	 * @see org.csu.slicing.CoachBusWithEDataType.impl.CoachBusWithEDataTypePackageImpl#getSex()
	 * @generated
	 */
	int SEX = 13;

	/**
	 * The meta object id for the '<em>TType</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.csu.slicing.CoachBusWithEDataType.impl.CoachBusWithEDataTypePackageImpl#getTType()
	 * @generated
	 */
	int TTYPE = 14;

	/**
	 * Returns the meta object for class '{@link org.csu.slicing.CoachBusWithEDataType.Trip <em>Trip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trip</em>'.
	 * @see org.csu.slicing.CoachBusWithEDataType.Trip
	 * @generated
	 */
	EClass getTrip();

	/**
	 * Returns the meta object for the attribute '{@link org.csu.slicing.CoachBusWithEDataType.Trip#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.csu.slicing.CoachBusWithEDataType.Trip#getName()
	 * @see #getTrip()
	 * @generated
	 */
	EAttribute getTrip_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.csu.slicing.CoachBusWithEDataType.Trip#getOrigin <em>Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Origin</em>'.
	 * @see org.csu.slicing.CoachBusWithEDataType.Trip#getOrigin()
	 * @see #getTrip()
	 * @generated
	 */
	EAttribute getTrip_Origin();

	/**
	 * Returns the meta object for the attribute '{@link org.csu.slicing.CoachBusWithEDataType.Trip#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Destination</em>'.
	 * @see org.csu.slicing.CoachBusWithEDataType.Trip#getDestination()
	 * @see #getTrip()
	 * @generated
	 */
	EAttribute getTrip_Destination();

	/**
	 * Returns the meta object for the attribute '{@link org.csu.slicing.CoachBusWithEDataType.Trip#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.csu.slicing.CoachBusWithEDataType.Trip#getType()
	 * @see #getTrip()
	 * @generated
	 */
	EAttribute getTrip_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.csu.slicing.CoachBusWithEDataType.Trip#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see org.csu.slicing.CoachBusWithEDataType.Trip#getNumber()
	 * @see #getTrip()
	 * @generated
	 */
	EAttribute getTrip_Number();

	/**
	 * Returns the meta object for the reference list '{@link org.csu.slicing.CoachBusWithEDataType.Trip#getCoaches <em>Coaches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Coaches</em>'.
	 * @see org.csu.slicing.CoachBusWithEDataType.Trip#getCoaches()
	 * @see #getTrip()
	 * @generated
	 */
	EReference getTrip_Coaches();

	/**
	 * Returns the meta object for the reference list '{@link org.csu.slicing.CoachBusWithEDataType.Trip#getPassengers <em>Passengers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Passengers</em>'.
	 * @see org.csu.slicing.CoachBusWithEDataType.Trip#getPassengers()
	 * @see #getTrip()
	 * @generated
	 */
	EReference getTrip_Passengers();

	/**
	 * Returns the meta object for class '{@link org.csu.slicing.CoachBusWithEDataType.RegularTrip <em>Regular Trip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Regular Trip</em>'.
	 * @see org.csu.slicing.CoachBusWithEDataType.RegularTrip
	 * @generated
	 */
	EClass getRegularTrip();

	/**
	 * Returns the meta object for class '{@link org.csu.slicing.CoachBusWithEDataType.PrivateTrip <em>Private Trip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Private Trip</em>'.
	 * @see org.csu.slicing.CoachBusWithEDataType.PrivateTrip
	 * @generated
	 */
	EClass getPrivateTrip();

	/**
	 * Returns the meta object for the attribute '{@link org.csu.slicing.CoachBusWithEDataType.PrivateTrip#getExtras <em>Extras</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extras</em>'.
	 * @see org.csu.slicing.CoachBusWithEDataType.PrivateTrip#getExtras()
	 * @see #getPrivateTrip()
	 * @generated
	 */
	EAttribute getPrivateTrip_Extras();

	/**
	 * Returns the meta object for class '{@link org.csu.slicing.CoachBusWithEDataType.Coach <em>Coach</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coach</em>'.
	 * @see org.csu.slicing.CoachBusWithEDataType.Coach
	 * @generated
	 */
	EClass getCoach();

	/**
	 * Returns the meta object for the attribute '{@link org.csu.slicing.CoachBusWithEDataType.Coach#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.csu.slicing.CoachBusWithEDataType.Coach#getId()
	 * @see #getCoach()
	 * @generated
	 */
	EAttribute getCoach_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.csu.slicing.CoachBusWithEDataType.Coach#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.csu.slicing.CoachBusWithEDataType.Coach#getName()
	 * @see #getCoach()
	 * @generated
	 */
	EAttribute getCoach_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.csu.slicing.CoachBusWithEDataType.Coach#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model</em>'.
	 * @see org.csu.slicing.CoachBusWithEDataType.Coach#getModel()
	 * @see #getCoach()
	 * @generated
	 */
	EAttribute getCoach_Model();

	/**
	 * Returns the meta object for the attribute '{@link org.csu.slicing.CoachBusWithEDataType.Coach#getNoOfSeats <em>No Of Seats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>No Of Seats</em>'.
	 * @see org.csu.slicing.CoachBusWithEDataType.Coach#getNoOfSeats()
	 * @see #getCoach()
	 * @generated
	 */
	EAttribute getCoach_NoOfSeats();

	/**
	 * Returns the meta object for the reference list '{@link org.csu.slicing.CoachBusWithEDataType.Coach#getTrips <em>Trips</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Trips</em>'.
	 * @see org.csu.slicing.CoachBusWithEDataType.Coach#getTrips()
	 * @see #getCoach()
	 * @generated
	 */
	EReference getCoach_Trips();

	/**
	 * Returns the meta object for the reference list '{@link org.csu.slicing.CoachBusWithEDataType.Coach#getGuards <em>Guards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Guards</em>'.
	 * @see org.csu.slicing.CoachBusWithEDataType.Coach#getGuards()
	 * @see #getCoach()
	 * @generated
	 */
	EReference getCoach_Guards();

	/**
	 * Returns the meta object for the reference list '{@link org.csu.slicing.CoachBusWithEDataType.Coach#getOffices <em>Offices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Offices</em>'.
	 * @see org.csu.slicing.CoachBusWithEDataType.Coach#getOffices()
	 * @see #getCoach()
	 * @generated
	 */
	EReference getCoach_Offices();

	/**
	 * Returns the meta object for class '{@link org.csu.slicing.CoachBusWithEDataType.Passenger <em>Passenger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Passenger</em>'.
	 * @see org.csu.slicing.CoachBusWithEDataType.Passenger
	 * @generated
	 */
	EClass getPassenger();

	/**
	 * Returns the meta object for the attribute '{@link org.csu.slicing.CoachBusWithEDataType.Passenger#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.csu.slicing.CoachBusWithEDataType.Passenger#getName()
	 * @see #getPassenger()
	 * @generated
	 */
	EAttribute getPassenger_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.csu.slicing.CoachBusWithEDataType.Passenger#getAge <em>Age</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Age</em>'.
	 * @see org.csu.slicing.CoachBusWithEDataType.Passenger#getAge()
	 * @see #getPassenger()
	 * @generated
	 */
	EAttribute getPassenger_Age();

	/**
	 * Returns the meta object for the attribute '{@link org.csu.slicing.CoachBusWithEDataType.Passenger#getIdCard <em>Id Card</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Card</em>'.
	 * @see org.csu.slicing.CoachBusWithEDataType.Passenger#getIdCard()
	 * @see #getPassenger()
	 * @generated
	 */
	EAttribute getPassenger_IdCard();

	/**
	 * Returns the meta object for the reference list '{@link org.csu.slicing.CoachBusWithEDataType.Passenger#getTrips <em>Trips</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Trips</em>'.
	 * @see org.csu.slicing.CoachBusWithEDataType.Passenger#getTrips()
	 * @see #getPassenger()
	 * @generated
	 */
	EReference getPassenger_Trips();

	/**
	 * Returns the meta object for the reference list '{@link org.csu.slicing.CoachBusWithEDataType.Passenger#getTickets <em>Tickets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tickets</em>'.
	 * @see org.csu.slicing.CoachBusWithEDataType.Passenger#getTickets()
	 * @see #getPassenger()
	 * @generated
	 */
	EReference getPassenger_Tickets();

	/**
	 * Returns the meta object for the attribute '{@link org.csu.slicing.CoachBusWithEDataType.Passenger#getSex <em>Sex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sex</em>'.
	 * @see org.csu.slicing.CoachBusWithEDataType.Passenger#getSex()
	 * @see #getPassenger()
	 * @generated
	 */
	EAttribute getPassenger_Sex();

	/**
	 * Returns the meta object for class '{@link org.csu.slicing.CoachBusWithEDataType.Employee <em>Employee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Employee</em>'.
	 * @see org.csu.slicing.CoachBusWithEDataType.Employee
	 * @generated
	 */
	EClass getEmployee();

	/**
	 * Returns the meta object for the attribute '{@link org.csu.slicing.CoachBusWithEDataType.Employee#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.csu.slicing.CoachBusWithEDataType.Employee#getId()
	 * @see #getEmployee()
	 * @generated
	 */
	EAttribute getEmployee_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.csu.slicing.CoachBusWithEDataType.Employee#getBaseSalary <em>Base Salary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Salary</em>'.
	 * @see org.csu.slicing.CoachBusWithEDataType.Employee#getBaseSalary()
	 * @see #getEmployee()
	 * @generated
	 */
	EAttribute getEmployee_BaseSalary();

	/**
	 * Returns the meta object for class '{@link org.csu.slicing.CoachBusWithEDataType.SecurityGuard <em>Security Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Guard</em>'.
	 * @see org.csu.slicing.CoachBusWithEDataType.SecurityGuard
	 * @generated
	 */
	EClass getSecurityGuard();

	/**
	 * Returns the meta object for the attribute '{@link org.csu.slicing.CoachBusWithEDataType.SecurityGuard#getShift <em>Shift</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shift</em>'.
	 * @see org.csu.slicing.CoachBusWithEDataType.SecurityGuard#getShift()
	 * @see #getSecurityGuard()
	 * @generated
	 */
	EAttribute getSecurityGuard_Shift();

	/**
	 * Returns the meta object for the reference '{@link org.csu.slicing.CoachBusWithEDataType.SecurityGuard#getCoach <em>Coach</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Coach</em>'.
	 * @see org.csu.slicing.CoachBusWithEDataType.SecurityGuard#getCoach()
	 * @see #getSecurityGuard()
	 * @generated
	 */
	EReference getSecurityGuard_Coach();

	/**
	 * Returns the meta object for class '{@link org.csu.slicing.CoachBusWithEDataType.Manager <em>Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Manager</em>'.
	 * @see org.csu.slicing.CoachBusWithEDataType.Manager
	 * @generated
	 */
	EClass getManager();

	/**
	 * Returns the meta object for the attribute '{@link org.csu.slicing.CoachBusWithEDataType.Manager#isHasMBA <em>Has MBA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has MBA</em>'.
	 * @see org.csu.slicing.CoachBusWithEDataType.Manager#isHasMBA()
	 * @see #getManager()
	 * @generated
	 */
	EAttribute getManager_HasMBA();

	/**
	 * Returns the meta object for the reference '{@link org.csu.slicing.CoachBusWithEDataType.Manager#getOffice <em>Office</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Office</em>'.
	 * @see org.csu.slicing.CoachBusWithEDataType.Manager#getOffice()
	 * @see #getManager()
	 * @generated
	 */
	EReference getManager_Office();

	/**
	 * Returns the meta object for class '{@link org.csu.slicing.CoachBusWithEDataType.BookingOffice <em>Booking Office</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Booking Office</em>'.
	 * @see org.csu.slicing.CoachBusWithEDataType.BookingOffice
	 * @generated
	 */
	EClass getBookingOffice();

	/**
	 * Returns the meta object for the attribute '{@link org.csu.slicing.CoachBusWithEDataType.BookingOffice#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.csu.slicing.CoachBusWithEDataType.BookingOffice#getName()
	 * @see #getBookingOffice()
	 * @generated
	 */
	EAttribute getBookingOffice_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.csu.slicing.CoachBusWithEDataType.BookingOffice#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see org.csu.slicing.CoachBusWithEDataType.BookingOffice#getLocation()
	 * @see #getBookingOffice()
	 * @generated
	 */
	EAttribute getBookingOffice_Location();

	/**
	 * Returns the meta object for the attribute '{@link org.csu.slicing.CoachBusWithEDataType.BookingOffice#getOfficeID <em>Office ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Office ID</em>'.
	 * @see org.csu.slicing.CoachBusWithEDataType.BookingOffice#getOfficeID()
	 * @see #getBookingOffice()
	 * @generated
	 */
	EAttribute getBookingOffice_OfficeID();

	/**
	 * Returns the meta object for the reference list '{@link org.csu.slicing.CoachBusWithEDataType.BookingOffice#getCoaches <em>Coaches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Coaches</em>'.
	 * @see org.csu.slicing.CoachBusWithEDataType.BookingOffice#getCoaches()
	 * @see #getBookingOffice()
	 * @generated
	 */
	EReference getBookingOffice_Coaches();

	/**
	 * Returns the meta object for the reference '{@link org.csu.slicing.CoachBusWithEDataType.BookingOffice#getManager <em>Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Manager</em>'.
	 * @see org.csu.slicing.CoachBusWithEDataType.BookingOffice#getManager()
	 * @see #getBookingOffice()
	 * @generated
	 */
	EReference getBookingOffice_Manager();

	/**
	 * Returns the meta object for the reference list '{@link org.csu.slicing.CoachBusWithEDataType.BookingOffice#getVms <em>Vms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Vms</em>'.
	 * @see org.csu.slicing.CoachBusWithEDataType.BookingOffice#getVms()
	 * @see #getBookingOffice()
	 * @generated
	 */
	EReference getBookingOffice_Vms();

	/**
	 * Returns the meta object for class '{@link org.csu.slicing.CoachBusWithEDataType.Ticket <em>Ticket</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ticket</em>'.
	 * @see org.csu.slicing.CoachBusWithEDataType.Ticket
	 * @generated
	 */
	EClass getTicket();

	/**
	 * Returns the meta object for the attribute '{@link org.csu.slicing.CoachBusWithEDataType.Ticket#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see org.csu.slicing.CoachBusWithEDataType.Ticket#getNumber()
	 * @see #getTicket()
	 * @generated
	 */
	EAttribute getTicket_Number();

	/**
	 * Returns the meta object for the attribute '{@link org.csu.slicing.CoachBusWithEDataType.Ticket#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see org.csu.slicing.CoachBusWithEDataType.Ticket#getPrice()
	 * @see #getTicket()
	 * @generated
	 */
	EAttribute getTicket_Price();

	/**
	 * Returns the meta object for the attribute '{@link org.csu.slicing.CoachBusWithEDataType.Ticket#isIsRoundTrip <em>Is Round Trip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Round Trip</em>'.
	 * @see org.csu.slicing.CoachBusWithEDataType.Ticket#isIsRoundTrip()
	 * @see #getTicket()
	 * @generated
	 */
	EAttribute getTicket_IsRoundTrip();

	/**
	 * Returns the meta object for the reference '{@link org.csu.slicing.CoachBusWithEDataType.Ticket#getPsg <em>Psg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Psg</em>'.
	 * @see org.csu.slicing.CoachBusWithEDataType.Ticket#getPsg()
	 * @see #getTicket()
	 * @generated
	 */
	EReference getTicket_Psg();

	/**
	 * Returns the meta object for the reference '{@link org.csu.slicing.CoachBusWithEDataType.Ticket#getVm <em>Vm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Vm</em>'.
	 * @see org.csu.slicing.CoachBusWithEDataType.Ticket#getVm()
	 * @see #getTicket()
	 * @generated
	 */
	EReference getTicket_Vm();

	/**
	 * Returns the meta object for class '{@link org.csu.slicing.CoachBusWithEDataType.VendingMachine <em>Vending Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vending Machine</em>'.
	 * @see org.csu.slicing.CoachBusWithEDataType.VendingMachine
	 * @generated
	 */
	EClass getVendingMachine();

	/**
	 * Returns the meta object for the attribute '{@link org.csu.slicing.CoachBusWithEDataType.VendingMachine#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see org.csu.slicing.CoachBusWithEDataType.VendingMachine#getNumber()
	 * @see #getVendingMachine()
	 * @generated
	 */
	EAttribute getVendingMachine_Number();

	/**
	 * Returns the meta object for the reference list '{@link org.csu.slicing.CoachBusWithEDataType.VendingMachine#getTickets <em>Tickets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tickets</em>'.
	 * @see org.csu.slicing.CoachBusWithEDataType.VendingMachine#getTickets()
	 * @see #getVendingMachine()
	 * @generated
	 */
	EReference getVendingMachine_Tickets();

	/**
	 * Returns the meta object for the reference '{@link org.csu.slicing.CoachBusWithEDataType.VendingMachine#getOffice <em>Office</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Office</em>'.
	 * @see org.csu.slicing.CoachBusWithEDataType.VendingMachine#getOffice()
	 * @see #getVendingMachine()
	 * @generated
	 */
	EReference getVendingMachine_Office();

	/**
	 * Returns the meta object for class '{@link org.csu.slicing.CoachBusWithEDataType.AdultTicket <em>Adult Ticket</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adult Ticket</em>'.
	 * @see org.csu.slicing.CoachBusWithEDataType.AdultTicket
	 * @generated
	 */
	EClass getAdultTicket();

	/**
	 * Returns the meta object for the attribute '{@link org.csu.slicing.CoachBusWithEDataType.AdultTicket#isIsElderlyDiscount <em>Is Elderly Discount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Elderly Discount</em>'.
	 * @see org.csu.slicing.CoachBusWithEDataType.AdultTicket#isIsElderlyDiscount()
	 * @see #getAdultTicket()
	 * @generated
	 */
	EAttribute getAdultTicket_IsElderlyDiscount();

	/**
	 * Returns the meta object for class '{@link org.csu.slicing.CoachBusWithEDataType.ChildTicket <em>Child Ticket</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Child Ticket</em>'.
	 * @see org.csu.slicing.CoachBusWithEDataType.ChildTicket
	 * @generated
	 */
	EClass getChildTicket();

	/**
	 * Returns the meta object for the attribute '{@link org.csu.slicing.CoachBusWithEDataType.ChildTicket#isIsSchoolTrip <em>Is School Trip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is School Trip</em>'.
	 * @see org.csu.slicing.CoachBusWithEDataType.ChildTicket#isIsSchoolTrip()
	 * @see #getChildTicket()
	 * @generated
	 */
	EAttribute getChildTicket_IsSchoolTrip();

	/**
	 * Returns the meta object for enum '{@link org.csu.slicing.CoachBusWithEDataType.Sex <em>Sex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sex</em>'.
	 * @see org.csu.slicing.CoachBusWithEDataType.Sex
	 * @generated
	 */
	EEnum getSex();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>TType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TType</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	EDataType getTType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CoachBusWithEDataTypeFactory getCoachBusWithEDataTypeFactory();

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
		 * The meta object literal for the '{@link org.csu.slicing.CoachBusWithEDataType.impl.TripImpl <em>Trip</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.csu.slicing.CoachBusWithEDataType.impl.TripImpl
		 * @see org.csu.slicing.CoachBusWithEDataType.impl.CoachBusWithEDataTypePackageImpl#getTrip()
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
		 * The meta object literal for the '{@link org.csu.slicing.CoachBusWithEDataType.impl.RegularTripImpl <em>Regular Trip</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.csu.slicing.CoachBusWithEDataType.impl.RegularTripImpl
		 * @see org.csu.slicing.CoachBusWithEDataType.impl.CoachBusWithEDataTypePackageImpl#getRegularTrip()
		 * @generated
		 */
		EClass REGULAR_TRIP = eINSTANCE.getRegularTrip();

		/**
		 * The meta object literal for the '{@link org.csu.slicing.CoachBusWithEDataType.impl.PrivateTripImpl <em>Private Trip</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.csu.slicing.CoachBusWithEDataType.impl.PrivateTripImpl
		 * @see org.csu.slicing.CoachBusWithEDataType.impl.CoachBusWithEDataTypePackageImpl#getPrivateTrip()
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
		 * The meta object literal for the '{@link org.csu.slicing.CoachBusWithEDataType.impl.CoachImpl <em>Coach</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.csu.slicing.CoachBusWithEDataType.impl.CoachImpl
		 * @see org.csu.slicing.CoachBusWithEDataType.impl.CoachBusWithEDataTypePackageImpl#getCoach()
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
		 * The meta object literal for the '{@link org.csu.slicing.CoachBusWithEDataType.impl.PassengerImpl <em>Passenger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.csu.slicing.CoachBusWithEDataType.impl.PassengerImpl
		 * @see org.csu.slicing.CoachBusWithEDataType.impl.CoachBusWithEDataTypePackageImpl#getPassenger()
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
		 * The meta object literal for the '<em><b>Sex</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER__SEX = eINSTANCE.getPassenger_Sex();

		/**
		 * The meta object literal for the '{@link org.csu.slicing.CoachBusWithEDataType.impl.EmployeeImpl <em>Employee</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.csu.slicing.CoachBusWithEDataType.impl.EmployeeImpl
		 * @see org.csu.slicing.CoachBusWithEDataType.impl.CoachBusWithEDataTypePackageImpl#getEmployee()
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
		 * The meta object literal for the '{@link org.csu.slicing.CoachBusWithEDataType.impl.SecurityGuardImpl <em>Security Guard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.csu.slicing.CoachBusWithEDataType.impl.SecurityGuardImpl
		 * @see org.csu.slicing.CoachBusWithEDataType.impl.CoachBusWithEDataTypePackageImpl#getSecurityGuard()
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
		 * The meta object literal for the '{@link org.csu.slicing.CoachBusWithEDataType.impl.ManagerImpl <em>Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.csu.slicing.CoachBusWithEDataType.impl.ManagerImpl
		 * @see org.csu.slicing.CoachBusWithEDataType.impl.CoachBusWithEDataTypePackageImpl#getManager()
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
		 * The meta object literal for the '{@link org.csu.slicing.CoachBusWithEDataType.impl.BookingOfficeImpl <em>Booking Office</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.csu.slicing.CoachBusWithEDataType.impl.BookingOfficeImpl
		 * @see org.csu.slicing.CoachBusWithEDataType.impl.CoachBusWithEDataTypePackageImpl#getBookingOffice()
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
		 * The meta object literal for the '{@link org.csu.slicing.CoachBusWithEDataType.impl.TicketImpl <em>Ticket</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.csu.slicing.CoachBusWithEDataType.impl.TicketImpl
		 * @see org.csu.slicing.CoachBusWithEDataType.impl.CoachBusWithEDataTypePackageImpl#getTicket()
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
		 * The meta object literal for the '{@link org.csu.slicing.CoachBusWithEDataType.impl.VendingMachineImpl <em>Vending Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.csu.slicing.CoachBusWithEDataType.impl.VendingMachineImpl
		 * @see org.csu.slicing.CoachBusWithEDataType.impl.CoachBusWithEDataTypePackageImpl#getVendingMachine()
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
		 * The meta object literal for the '{@link org.csu.slicing.CoachBusWithEDataType.impl.AdultTicketImpl <em>Adult Ticket</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.csu.slicing.CoachBusWithEDataType.impl.AdultTicketImpl
		 * @see org.csu.slicing.CoachBusWithEDataType.impl.CoachBusWithEDataTypePackageImpl#getAdultTicket()
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
		 * The meta object literal for the '{@link org.csu.slicing.CoachBusWithEDataType.impl.ChildTicketImpl <em>Child Ticket</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.csu.slicing.CoachBusWithEDataType.impl.ChildTicketImpl
		 * @see org.csu.slicing.CoachBusWithEDataType.impl.CoachBusWithEDataTypePackageImpl#getChildTicket()
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

		/**
		 * The meta object literal for the '{@link org.csu.slicing.CoachBusWithEDataType.Sex <em>Sex</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.csu.slicing.CoachBusWithEDataType.Sex
		 * @see org.csu.slicing.CoachBusWithEDataType.impl.CoachBusWithEDataTypePackageImpl#getSex()
		 * @generated
		 */
		EEnum SEX = eINSTANCE.getSex();

		/**
		 * The meta object literal for the '<em>TType</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see org.csu.slicing.CoachBusWithEDataType.impl.CoachBusWithEDataTypePackageImpl#getTType()
		 * @generated
		 */
		EDataType TTYPE = eINSTANCE.getTType();

	}

} //CoachBusWithEDataTypePackage

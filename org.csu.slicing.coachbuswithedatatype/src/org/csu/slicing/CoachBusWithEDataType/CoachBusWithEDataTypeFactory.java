/**
 */
package org.csu.slicing.CoachBusWithEDataType;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.csu.slicing.CoachBusWithEDataType.CoachBusWithEDataTypePackage
 * @generated
 */
public interface CoachBusWithEDataTypeFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CoachBusWithEDataTypeFactory eINSTANCE = org.csu.slicing.CoachBusWithEDataType.impl.CoachBusWithEDataTypeFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Trip</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trip</em>'.
	 * @generated
	 */
	Trip createTrip();

	/**
	 * Returns a new object of class '<em>Regular Trip</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Regular Trip</em>'.
	 * @generated
	 */
	RegularTrip createRegularTrip();

	/**
	 * Returns a new object of class '<em>Private Trip</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Private Trip</em>'.
	 * @generated
	 */
	PrivateTrip createPrivateTrip();

	/**
	 * Returns a new object of class '<em>Coach</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Coach</em>'.
	 * @generated
	 */
	Coach createCoach();

	/**
	 * Returns a new object of class '<em>Passenger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Passenger</em>'.
	 * @generated
	 */
	Passenger createPassenger();

	/**
	 * Returns a new object of class '<em>Employee</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Employee</em>'.
	 * @generated
	 */
	Employee createEmployee();

	/**
	 * Returns a new object of class '<em>Security Guard</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Security Guard</em>'.
	 * @generated
	 */
	SecurityGuard createSecurityGuard();

	/**
	 * Returns a new object of class '<em>Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Manager</em>'.
	 * @generated
	 */
	Manager createManager();

	/**
	 * Returns a new object of class '<em>Booking Office</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Booking Office</em>'.
	 * @generated
	 */
	BookingOffice createBookingOffice();

	/**
	 * Returns a new object of class '<em>Ticket</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ticket</em>'.
	 * @generated
	 */
	Ticket createTicket();

	/**
	 * Returns a new object of class '<em>Vending Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vending Machine</em>'.
	 * @generated
	 */
	VendingMachine createVendingMachine();

	/**
	 * Returns a new object of class '<em>Adult Ticket</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Adult Ticket</em>'.
	 * @generated
	 */
	AdultTicket createAdultTicket();

	/**
	 * Returns a new object of class '<em>Child Ticket</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Child Ticket</em>'.
	 * @generated
	 */
	ChildTicket createChildTicket();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CoachBusWithEDataTypePackage getCoachBusWithEDataTypePackage();

} //CoachBusWithEDataTypeFactory

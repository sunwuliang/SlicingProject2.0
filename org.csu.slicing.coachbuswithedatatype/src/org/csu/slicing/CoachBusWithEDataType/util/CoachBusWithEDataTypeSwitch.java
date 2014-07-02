/**
 */
package org.csu.slicing.CoachBusWithEDataType.util;

import org.csu.slicing.CoachBusWithEDataType.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.csu.slicing.CoachBusWithEDataType.CoachBusWithEDataTypePackage
 * @generated
 */
public class CoachBusWithEDataTypeSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CoachBusWithEDataTypePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoachBusWithEDataTypeSwitch() {
		if (modelPackage == null) {
			modelPackage = CoachBusWithEDataTypePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case CoachBusWithEDataTypePackage.TRIP: {
				Trip trip = (Trip)theEObject;
				T result = caseTrip(trip);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoachBusWithEDataTypePackage.REGULAR_TRIP: {
				RegularTrip regularTrip = (RegularTrip)theEObject;
				T result = caseRegularTrip(regularTrip);
				if (result == null) result = caseTrip(regularTrip);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoachBusWithEDataTypePackage.PRIVATE_TRIP: {
				PrivateTrip privateTrip = (PrivateTrip)theEObject;
				T result = casePrivateTrip(privateTrip);
				if (result == null) result = caseTrip(privateTrip);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoachBusWithEDataTypePackage.COACH: {
				Coach coach = (Coach)theEObject;
				T result = caseCoach(coach);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoachBusWithEDataTypePackage.PASSENGER: {
				Passenger passenger = (Passenger)theEObject;
				T result = casePassenger(passenger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoachBusWithEDataTypePackage.EMPLOYEE: {
				Employee employee = (Employee)theEObject;
				T result = caseEmployee(employee);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoachBusWithEDataTypePackage.SECURITY_GUARD: {
				SecurityGuard securityGuard = (SecurityGuard)theEObject;
				T result = caseSecurityGuard(securityGuard);
				if (result == null) result = caseEmployee(securityGuard);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoachBusWithEDataTypePackage.MANAGER: {
				Manager manager = (Manager)theEObject;
				T result = caseManager(manager);
				if (result == null) result = caseEmployee(manager);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoachBusWithEDataTypePackage.BOOKING_OFFICE: {
				BookingOffice bookingOffice = (BookingOffice)theEObject;
				T result = caseBookingOffice(bookingOffice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoachBusWithEDataTypePackage.TICKET: {
				Ticket ticket = (Ticket)theEObject;
				T result = caseTicket(ticket);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoachBusWithEDataTypePackage.VENDING_MACHINE: {
				VendingMachine vendingMachine = (VendingMachine)theEObject;
				T result = caseVendingMachine(vendingMachine);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoachBusWithEDataTypePackage.ADULT_TICKET: {
				AdultTicket adultTicket = (AdultTicket)theEObject;
				T result = caseAdultTicket(adultTicket);
				if (result == null) result = caseTicket(adultTicket);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoachBusWithEDataTypePackage.CHILD_TICKET: {
				ChildTicket childTicket = (ChildTicket)theEObject;
				T result = caseChildTicket(childTicket);
				if (result == null) result = caseTicket(childTicket);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trip</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trip</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrip(Trip object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Regular Trip</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Regular Trip</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegularTrip(RegularTrip object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Private Trip</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Private Trip</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrivateTrip(PrivateTrip object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coach</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coach</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoach(Coach object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Passenger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Passenger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePassenger(Passenger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Employee</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Employee</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEmployee(Employee object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Security Guard</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security Guard</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurityGuard(SecurityGuard object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Manager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Manager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseManager(Manager object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Booking Office</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Booking Office</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBookingOffice(BookingOffice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ticket</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ticket</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTicket(Ticket object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vending Machine</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vending Machine</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVendingMachine(VendingMachine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Adult Ticket</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Adult Ticket</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdultTicket(AdultTicket object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Child Ticket</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Child Ticket</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChildTicket(ChildTicket object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //CoachBusWithEDataTypeSwitch

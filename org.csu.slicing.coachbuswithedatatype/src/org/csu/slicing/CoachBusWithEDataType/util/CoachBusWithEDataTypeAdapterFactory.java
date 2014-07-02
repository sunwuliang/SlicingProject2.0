/**
 */
package org.csu.slicing.CoachBusWithEDataType.util;

import org.csu.slicing.CoachBusWithEDataType.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.csu.slicing.CoachBusWithEDataType.CoachBusWithEDataTypePackage
 * @generated
 */
public class CoachBusWithEDataTypeAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CoachBusWithEDataTypePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoachBusWithEDataTypeAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CoachBusWithEDataTypePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoachBusWithEDataTypeSwitch<Adapter> modelSwitch =
		new CoachBusWithEDataTypeSwitch<Adapter>() {
			@Override
			public Adapter caseTrip(Trip object) {
				return createTripAdapter();
			}
			@Override
			public Adapter caseRegularTrip(RegularTrip object) {
				return createRegularTripAdapter();
			}
			@Override
			public Adapter casePrivateTrip(PrivateTrip object) {
				return createPrivateTripAdapter();
			}
			@Override
			public Adapter caseCoach(Coach object) {
				return createCoachAdapter();
			}
			@Override
			public Adapter casePassenger(Passenger object) {
				return createPassengerAdapter();
			}
			@Override
			public Adapter caseEmployee(Employee object) {
				return createEmployeeAdapter();
			}
			@Override
			public Adapter caseSecurityGuard(SecurityGuard object) {
				return createSecurityGuardAdapter();
			}
			@Override
			public Adapter caseManager(Manager object) {
				return createManagerAdapter();
			}
			@Override
			public Adapter caseBookingOffice(BookingOffice object) {
				return createBookingOfficeAdapter();
			}
			@Override
			public Adapter caseTicket(Ticket object) {
				return createTicketAdapter();
			}
			@Override
			public Adapter caseVendingMachine(VendingMachine object) {
				return createVendingMachineAdapter();
			}
			@Override
			public Adapter caseAdultTicket(AdultTicket object) {
				return createAdultTicketAdapter();
			}
			@Override
			public Adapter caseChildTicket(ChildTicket object) {
				return createChildTicketAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.CoachBusWithEDataType.Trip <em>Trip</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.CoachBusWithEDataType.Trip
	 * @generated
	 */
	public Adapter createTripAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.CoachBusWithEDataType.RegularTrip <em>Regular Trip</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.CoachBusWithEDataType.RegularTrip
	 * @generated
	 */
	public Adapter createRegularTripAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.CoachBusWithEDataType.PrivateTrip <em>Private Trip</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.CoachBusWithEDataType.PrivateTrip
	 * @generated
	 */
	public Adapter createPrivateTripAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.CoachBusWithEDataType.Coach <em>Coach</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.CoachBusWithEDataType.Coach
	 * @generated
	 */
	public Adapter createCoachAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.CoachBusWithEDataType.Passenger <em>Passenger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.CoachBusWithEDataType.Passenger
	 * @generated
	 */
	public Adapter createPassengerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.CoachBusWithEDataType.Employee <em>Employee</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.CoachBusWithEDataType.Employee
	 * @generated
	 */
	public Adapter createEmployeeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.CoachBusWithEDataType.SecurityGuard <em>Security Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.CoachBusWithEDataType.SecurityGuard
	 * @generated
	 */
	public Adapter createSecurityGuardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.CoachBusWithEDataType.Manager <em>Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.CoachBusWithEDataType.Manager
	 * @generated
	 */
	public Adapter createManagerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.CoachBusWithEDataType.BookingOffice <em>Booking Office</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.CoachBusWithEDataType.BookingOffice
	 * @generated
	 */
	public Adapter createBookingOfficeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.CoachBusWithEDataType.Ticket <em>Ticket</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.CoachBusWithEDataType.Ticket
	 * @generated
	 */
	public Adapter createTicketAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.CoachBusWithEDataType.VendingMachine <em>Vending Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.CoachBusWithEDataType.VendingMachine
	 * @generated
	 */
	public Adapter createVendingMachineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.CoachBusWithEDataType.AdultTicket <em>Adult Ticket</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.CoachBusWithEDataType.AdultTicket
	 * @generated
	 */
	public Adapter createAdultTicketAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.CoachBusWithEDataType.ChildTicket <em>Child Ticket</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.CoachBusWithEDataType.ChildTicket
	 * @generated
	 */
	public Adapter createChildTicketAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //CoachBusWithEDataTypeAdapterFactory

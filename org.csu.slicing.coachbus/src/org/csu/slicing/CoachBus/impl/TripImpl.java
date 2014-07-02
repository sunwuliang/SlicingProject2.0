/**
 */
package org.csu.slicing.CoachBus.impl;

import java.util.Collection;

import org.csu.slicing.CoachBus.Coach;
import org.csu.slicing.CoachBus.CoachBusPackage;
import org.csu.slicing.CoachBus.Passenger;
import org.csu.slicing.CoachBus.Trip;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trip</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.csu.slicing.CoachBus.impl.TripImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.csu.slicing.CoachBus.impl.TripImpl#getOrigin <em>Origin</em>}</li>
 *   <li>{@link org.csu.slicing.CoachBus.impl.TripImpl#getDestination <em>Destination</em>}</li>
 *   <li>{@link org.csu.slicing.CoachBus.impl.TripImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.csu.slicing.CoachBus.impl.TripImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link org.csu.slicing.CoachBus.impl.TripImpl#getCoaches <em>Coaches</em>}</li>
 *   <li>{@link org.csu.slicing.CoachBus.impl.TripImpl#getPassengers <em>Passengers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TripImpl extends EObjectImpl implements Trip {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrigin() <em>Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigin()
	 * @generated
	 * @ordered
	 */
	protected static final String ORIGIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrigin() <em>Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigin()
	 * @generated
	 * @ordered
	 */
	protected String origin = ORIGIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getDestination() <em>Destination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestination()
	 * @generated
	 * @ordered
	 */
	protected static final String DESTINATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDestination() <em>Destination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestination()
	 * @generated
	 * @ordered
	 */
	protected String destination = DESTINATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected int number = NUMBER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCoaches() <em>Coaches</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoaches()
	 * @generated
	 * @ordered
	 */
	protected EList<Coach> coaches;

	/**
	 * The cached value of the '{@link #getPassengers() <em>Passengers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengers()
	 * @generated
	 * @ordered
	 */
	protected EList<Passenger> passengers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TripImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoachBusPackage.Literals.TRIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoachBusPackage.TRIP__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOrigin() {
		return origin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrigin(String newOrigin) {
		String oldOrigin = origin;
		origin = newOrigin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoachBusPackage.TRIP__ORIGIN, oldOrigin, origin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDestination() {
		return destination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestination(String newDestination) {
		String oldDestination = destination;
		destination = newDestination;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoachBusPackage.TRIP__DESTINATION, oldDestination, destination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoachBusPackage.TRIP__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumber(int newNumber) {
		int oldNumber = number;
		number = newNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoachBusPackage.TRIP__NUMBER, oldNumber, number));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Coach> getCoaches() {
		if (coaches == null) {
			coaches = new EObjectWithInverseResolvingEList.ManyInverse<Coach>(Coach.class, this, CoachBusPackage.TRIP__COACHES, CoachBusPackage.COACH__TRIPS);
		}
		return coaches;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Passenger> getPassengers() {
		if (passengers == null) {
			passengers = new EObjectWithInverseResolvingEList.ManyInverse<Passenger>(Passenger.class, this, CoachBusPackage.TRIP__PASSENGERS, CoachBusPackage.PASSENGER__TRIPS);
		}
		return passengers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CoachBusPackage.TRIP__COACHES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCoaches()).basicAdd(otherEnd, msgs);
			case CoachBusPackage.TRIP__PASSENGERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPassengers()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CoachBusPackage.TRIP__COACHES:
				return ((InternalEList<?>)getCoaches()).basicRemove(otherEnd, msgs);
			case CoachBusPackage.TRIP__PASSENGERS:
				return ((InternalEList<?>)getPassengers()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CoachBusPackage.TRIP__NAME:
				return getName();
			case CoachBusPackage.TRIP__ORIGIN:
				return getOrigin();
			case CoachBusPackage.TRIP__DESTINATION:
				return getDestination();
			case CoachBusPackage.TRIP__TYPE:
				return getType();
			case CoachBusPackage.TRIP__NUMBER:
				return getNumber();
			case CoachBusPackage.TRIP__COACHES:
				return getCoaches();
			case CoachBusPackage.TRIP__PASSENGERS:
				return getPassengers();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CoachBusPackage.TRIP__NAME:
				setName((String)newValue);
				return;
			case CoachBusPackage.TRIP__ORIGIN:
				setOrigin((String)newValue);
				return;
			case CoachBusPackage.TRIP__DESTINATION:
				setDestination((String)newValue);
				return;
			case CoachBusPackage.TRIP__TYPE:
				setType((String)newValue);
				return;
			case CoachBusPackage.TRIP__NUMBER:
				setNumber((Integer)newValue);
				return;
			case CoachBusPackage.TRIP__COACHES:
				getCoaches().clear();
				getCoaches().addAll((Collection<? extends Coach>)newValue);
				return;
			case CoachBusPackage.TRIP__PASSENGERS:
				getPassengers().clear();
				getPassengers().addAll((Collection<? extends Passenger>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CoachBusPackage.TRIP__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CoachBusPackage.TRIP__ORIGIN:
				setOrigin(ORIGIN_EDEFAULT);
				return;
			case CoachBusPackage.TRIP__DESTINATION:
				setDestination(DESTINATION_EDEFAULT);
				return;
			case CoachBusPackage.TRIP__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case CoachBusPackage.TRIP__NUMBER:
				setNumber(NUMBER_EDEFAULT);
				return;
			case CoachBusPackage.TRIP__COACHES:
				getCoaches().clear();
				return;
			case CoachBusPackage.TRIP__PASSENGERS:
				getPassengers().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CoachBusPackage.TRIP__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CoachBusPackage.TRIP__ORIGIN:
				return ORIGIN_EDEFAULT == null ? origin != null : !ORIGIN_EDEFAULT.equals(origin);
			case CoachBusPackage.TRIP__DESTINATION:
				return DESTINATION_EDEFAULT == null ? destination != null : !DESTINATION_EDEFAULT.equals(destination);
			case CoachBusPackage.TRIP__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case CoachBusPackage.TRIP__NUMBER:
				return number != NUMBER_EDEFAULT;
			case CoachBusPackage.TRIP__COACHES:
				return coaches != null && !coaches.isEmpty();
			case CoachBusPackage.TRIP__PASSENGERS:
				return passengers != null && !passengers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", origin: ");
		result.append(origin);
		result.append(", destination: ");
		result.append(destination);
		result.append(", type: ");
		result.append(type);
		result.append(", number: ");
		result.append(number);
		result.append(')');
		return result.toString();
	}

} //TripImpl

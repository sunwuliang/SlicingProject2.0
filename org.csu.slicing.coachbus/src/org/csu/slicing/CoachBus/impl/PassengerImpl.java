/**
 */
package org.csu.slicing.CoachBus.impl;

import java.util.Collection;

import org.csu.slicing.CoachBus.CoachBusPackage;
import org.csu.slicing.CoachBus.Passenger;
import org.csu.slicing.CoachBus.Ticket;
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
 * An implementation of the model object '<em><b>Passenger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.csu.slicing.CoachBus.impl.PassengerImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.csu.slicing.CoachBus.impl.PassengerImpl#getAge <em>Age</em>}</li>
 *   <li>{@link org.csu.slicing.CoachBus.impl.PassengerImpl#getIdCard <em>Id Card</em>}</li>
 *   <li>{@link org.csu.slicing.CoachBus.impl.PassengerImpl#getTrips <em>Trips</em>}</li>
 *   <li>{@link org.csu.slicing.CoachBus.impl.PassengerImpl#getTickets <em>Tickets</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PassengerImpl extends EObjectImpl implements Passenger {
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
	 * The default value of the '{@link #getAge() <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAge()
	 * @generated
	 * @ordered
	 */
	protected static final int AGE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAge() <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAge()
	 * @generated
	 * @ordered
	 */
	protected int age = AGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIdCard() <em>Id Card</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdCard()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_CARD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdCard() <em>Id Card</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdCard()
	 * @generated
	 * @ordered
	 */
	protected String idCard = ID_CARD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTrips() <em>Trips</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrips()
	 * @generated
	 * @ordered
	 */
	protected EList<Trip> trips;

	/**
	 * The cached value of the '{@link #getTickets() <em>Tickets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTickets()
	 * @generated
	 * @ordered
	 */
	protected EList<Ticket> tickets;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PassengerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoachBusPackage.Literals.PASSENGER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CoachBusPackage.PASSENGER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAge() {
		return age;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAge(int newAge) {
		int oldAge = age;
		age = newAge;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoachBusPackage.PASSENGER__AGE, oldAge, age));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdCard() {
		return idCard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdCard(String newIdCard) {
		String oldIdCard = idCard;
		idCard = newIdCard;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoachBusPackage.PASSENGER__ID_CARD, oldIdCard, idCard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Trip> getTrips() {
		if (trips == null) {
			trips = new EObjectWithInverseResolvingEList.ManyInverse<Trip>(Trip.class, this, CoachBusPackage.PASSENGER__TRIPS, CoachBusPackage.TRIP__PASSENGERS);
		}
		return trips;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Ticket> getTickets() {
		if (tickets == null) {
			tickets = new EObjectWithInverseResolvingEList<Ticket>(Ticket.class, this, CoachBusPackage.PASSENGER__TICKETS, CoachBusPackage.TICKET__PSG);
		}
		return tickets;
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
			case CoachBusPackage.PASSENGER__TRIPS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTrips()).basicAdd(otherEnd, msgs);
			case CoachBusPackage.PASSENGER__TICKETS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTickets()).basicAdd(otherEnd, msgs);
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
			case CoachBusPackage.PASSENGER__TRIPS:
				return ((InternalEList<?>)getTrips()).basicRemove(otherEnd, msgs);
			case CoachBusPackage.PASSENGER__TICKETS:
				return ((InternalEList<?>)getTickets()).basicRemove(otherEnd, msgs);
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
			case CoachBusPackage.PASSENGER__NAME:
				return getName();
			case CoachBusPackage.PASSENGER__AGE:
				return getAge();
			case CoachBusPackage.PASSENGER__ID_CARD:
				return getIdCard();
			case CoachBusPackage.PASSENGER__TRIPS:
				return getTrips();
			case CoachBusPackage.PASSENGER__TICKETS:
				return getTickets();
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
			case CoachBusPackage.PASSENGER__NAME:
				setName((String)newValue);
				return;
			case CoachBusPackage.PASSENGER__AGE:
				setAge((Integer)newValue);
				return;
			case CoachBusPackage.PASSENGER__ID_CARD:
				setIdCard((String)newValue);
				return;
			case CoachBusPackage.PASSENGER__TRIPS:
				getTrips().clear();
				getTrips().addAll((Collection<? extends Trip>)newValue);
				return;
			case CoachBusPackage.PASSENGER__TICKETS:
				getTickets().clear();
				getTickets().addAll((Collection<? extends Ticket>)newValue);
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
			case CoachBusPackage.PASSENGER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CoachBusPackage.PASSENGER__AGE:
				setAge(AGE_EDEFAULT);
				return;
			case CoachBusPackage.PASSENGER__ID_CARD:
				setIdCard(ID_CARD_EDEFAULT);
				return;
			case CoachBusPackage.PASSENGER__TRIPS:
				getTrips().clear();
				return;
			case CoachBusPackage.PASSENGER__TICKETS:
				getTickets().clear();
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
			case CoachBusPackage.PASSENGER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CoachBusPackage.PASSENGER__AGE:
				return age != AGE_EDEFAULT;
			case CoachBusPackage.PASSENGER__ID_CARD:
				return ID_CARD_EDEFAULT == null ? idCard != null : !ID_CARD_EDEFAULT.equals(idCard);
			case CoachBusPackage.PASSENGER__TRIPS:
				return trips != null && !trips.isEmpty();
			case CoachBusPackage.PASSENGER__TICKETS:
				return tickets != null && !tickets.isEmpty();
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
		result.append(", age: ");
		result.append(age);
		result.append(", idCard: ");
		result.append(idCard);
		result.append(')');
		return result.toString();
	}

} //PassengerImpl

/**
 */
package org.csu.slicing.CoachBus.impl;

import java.util.Collection;

import org.csu.slicing.CoachBus.BookingOffice;
import org.csu.slicing.CoachBus.Coach;
import org.csu.slicing.CoachBus.CoachBusPackage;
import org.csu.slicing.CoachBus.SecurityGuard;
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
 * An implementation of the model object '<em><b>Coach</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.csu.slicing.CoachBus.impl.CoachImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.csu.slicing.CoachBus.impl.CoachImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.csu.slicing.CoachBus.impl.CoachImpl#getModel <em>Model</em>}</li>
 *   <li>{@link org.csu.slicing.CoachBus.impl.CoachImpl#getNoOfSeats <em>No Of Seats</em>}</li>
 *   <li>{@link org.csu.slicing.CoachBus.impl.CoachImpl#getTrips <em>Trips</em>}</li>
 *   <li>{@link org.csu.slicing.CoachBus.impl.CoachImpl#getGuards <em>Guards</em>}</li>
 *   <li>{@link org.csu.slicing.CoachBus.impl.CoachImpl#getOffices <em>Offices</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CoachImpl extends EObjectImpl implements Coach {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

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
	 * The default value of the '{@link #getModel() <em>Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected static final String MODEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModel() <em>Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected String model = MODEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getNoOfSeats() <em>No Of Seats</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoOfSeats()
	 * @generated
	 * @ordered
	 */
	protected static final int NO_OF_SEATS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNoOfSeats() <em>No Of Seats</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoOfSeats()
	 * @generated
	 * @ordered
	 */
	protected int noOfSeats = NO_OF_SEATS_EDEFAULT;

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
	 * The cached value of the '{@link #getGuards() <em>Guards</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuards()
	 * @generated
	 * @ordered
	 */
	protected EList<SecurityGuard> guards;

	/**
	 * The cached value of the '{@link #getOffices() <em>Offices</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffices()
	 * @generated
	 * @ordered
	 */
	protected EList<BookingOffice> offices;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoachImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoachBusPackage.Literals.COACH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoachBusPackage.COACH__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CoachBusPackage.COACH__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModel() {
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModel(String newModel) {
		String oldModel = model;
		model = newModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoachBusPackage.COACH__MODEL, oldModel, model));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNoOfSeats() {
		return noOfSeats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNoOfSeats(int newNoOfSeats) {
		int oldNoOfSeats = noOfSeats;
		noOfSeats = newNoOfSeats;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoachBusPackage.COACH__NO_OF_SEATS, oldNoOfSeats, noOfSeats));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Trip> getTrips() {
		if (trips == null) {
			trips = new EObjectWithInverseResolvingEList.ManyInverse<Trip>(Trip.class, this, CoachBusPackage.COACH__TRIPS, CoachBusPackage.TRIP__COACHES);
		}
		return trips;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SecurityGuard> getGuards() {
		if (guards == null) {
			guards = new EObjectWithInverseResolvingEList<SecurityGuard>(SecurityGuard.class, this, CoachBusPackage.COACH__GUARDS, CoachBusPackage.SECURITY_GUARD__COACH);
		}
		return guards;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BookingOffice> getOffices() {
		if (offices == null) {
			offices = new EObjectWithInverseResolvingEList.ManyInverse<BookingOffice>(BookingOffice.class, this, CoachBusPackage.COACH__OFFICES, CoachBusPackage.BOOKING_OFFICE__COACHES);
		}
		return offices;
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
			case CoachBusPackage.COACH__TRIPS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTrips()).basicAdd(otherEnd, msgs);
			case CoachBusPackage.COACH__GUARDS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGuards()).basicAdd(otherEnd, msgs);
			case CoachBusPackage.COACH__OFFICES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOffices()).basicAdd(otherEnd, msgs);
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
			case CoachBusPackage.COACH__TRIPS:
				return ((InternalEList<?>)getTrips()).basicRemove(otherEnd, msgs);
			case CoachBusPackage.COACH__GUARDS:
				return ((InternalEList<?>)getGuards()).basicRemove(otherEnd, msgs);
			case CoachBusPackage.COACH__OFFICES:
				return ((InternalEList<?>)getOffices()).basicRemove(otherEnd, msgs);
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
			case CoachBusPackage.COACH__ID:
				return getId();
			case CoachBusPackage.COACH__NAME:
				return getName();
			case CoachBusPackage.COACH__MODEL:
				return getModel();
			case CoachBusPackage.COACH__NO_OF_SEATS:
				return getNoOfSeats();
			case CoachBusPackage.COACH__TRIPS:
				return getTrips();
			case CoachBusPackage.COACH__GUARDS:
				return getGuards();
			case CoachBusPackage.COACH__OFFICES:
				return getOffices();
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
			case CoachBusPackage.COACH__ID:
				setId((Integer)newValue);
				return;
			case CoachBusPackage.COACH__NAME:
				setName((String)newValue);
				return;
			case CoachBusPackage.COACH__MODEL:
				setModel((String)newValue);
				return;
			case CoachBusPackage.COACH__NO_OF_SEATS:
				setNoOfSeats((Integer)newValue);
				return;
			case CoachBusPackage.COACH__TRIPS:
				getTrips().clear();
				getTrips().addAll((Collection<? extends Trip>)newValue);
				return;
			case CoachBusPackage.COACH__GUARDS:
				getGuards().clear();
				getGuards().addAll((Collection<? extends SecurityGuard>)newValue);
				return;
			case CoachBusPackage.COACH__OFFICES:
				getOffices().clear();
				getOffices().addAll((Collection<? extends BookingOffice>)newValue);
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
			case CoachBusPackage.COACH__ID:
				setId(ID_EDEFAULT);
				return;
			case CoachBusPackage.COACH__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CoachBusPackage.COACH__MODEL:
				setModel(MODEL_EDEFAULT);
				return;
			case CoachBusPackage.COACH__NO_OF_SEATS:
				setNoOfSeats(NO_OF_SEATS_EDEFAULT);
				return;
			case CoachBusPackage.COACH__TRIPS:
				getTrips().clear();
				return;
			case CoachBusPackage.COACH__GUARDS:
				getGuards().clear();
				return;
			case CoachBusPackage.COACH__OFFICES:
				getOffices().clear();
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
			case CoachBusPackage.COACH__ID:
				return id != ID_EDEFAULT;
			case CoachBusPackage.COACH__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CoachBusPackage.COACH__MODEL:
				return MODEL_EDEFAULT == null ? model != null : !MODEL_EDEFAULT.equals(model);
			case CoachBusPackage.COACH__NO_OF_SEATS:
				return noOfSeats != NO_OF_SEATS_EDEFAULT;
			case CoachBusPackage.COACH__TRIPS:
				return trips != null && !trips.isEmpty();
			case CoachBusPackage.COACH__GUARDS:
				return guards != null && !guards.isEmpty();
			case CoachBusPackage.COACH__OFFICES:
				return offices != null && !offices.isEmpty();
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
		result.append(" (id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(", model: ");
		result.append(model);
		result.append(", noOfSeats: ");
		result.append(noOfSeats);
		result.append(')');
		return result.toString();
	}

} //CoachImpl

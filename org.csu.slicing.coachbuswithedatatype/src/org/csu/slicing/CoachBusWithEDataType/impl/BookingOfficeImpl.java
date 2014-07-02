/**
 */
package org.csu.slicing.CoachBusWithEDataType.impl;

import java.util.Collection;

import org.csu.slicing.CoachBusWithEDataType.BookingOffice;
import org.csu.slicing.CoachBusWithEDataType.Coach;
import org.csu.slicing.CoachBusWithEDataType.CoachBusWithEDataTypePackage;
import org.csu.slicing.CoachBusWithEDataType.Manager;
import org.csu.slicing.CoachBusWithEDataType.VendingMachine;

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
 * An implementation of the model object '<em><b>Booking Office</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.csu.slicing.CoachBusWithEDataType.impl.BookingOfficeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.csu.slicing.CoachBusWithEDataType.impl.BookingOfficeImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.csu.slicing.CoachBusWithEDataType.impl.BookingOfficeImpl#getOfficeID <em>Office ID</em>}</li>
 *   <li>{@link org.csu.slicing.CoachBusWithEDataType.impl.BookingOfficeImpl#getCoaches <em>Coaches</em>}</li>
 *   <li>{@link org.csu.slicing.CoachBusWithEDataType.impl.BookingOfficeImpl#getManager <em>Manager</em>}</li>
 *   <li>{@link org.csu.slicing.CoachBusWithEDataType.impl.BookingOfficeImpl#getVms <em>Vms</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BookingOfficeImpl extends EObjectImpl implements BookingOffice {
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
	 * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected String location = LOCATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getOfficeID() <em>Office ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOfficeID()
	 * @generated
	 * @ordered
	 */
	protected static final int OFFICE_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOfficeID() <em>Office ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOfficeID()
	 * @generated
	 * @ordered
	 */
	protected int officeID = OFFICE_ID_EDEFAULT;

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
	 * The cached value of the '{@link #getManager() <em>Manager</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManager()
	 * @generated
	 * @ordered
	 */
	protected Manager manager;

	/**
	 * The cached value of the '{@link #getVms() <em>Vms</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVms()
	 * @generated
	 * @ordered
	 */
	protected EList<VendingMachine> vms;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BookingOfficeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoachBusWithEDataTypePackage.Literals.BOOKING_OFFICE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CoachBusWithEDataTypePackage.BOOKING_OFFICE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(String newLocation) {
		String oldLocation = location;
		location = newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoachBusWithEDataTypePackage.BOOKING_OFFICE__LOCATION, oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOfficeID() {
		return officeID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOfficeID(int newOfficeID) {
		int oldOfficeID = officeID;
		officeID = newOfficeID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoachBusWithEDataTypePackage.BOOKING_OFFICE__OFFICE_ID, oldOfficeID, officeID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Coach> getCoaches() {
		if (coaches == null) {
			coaches = new EObjectWithInverseResolvingEList.ManyInverse<Coach>(Coach.class, this, CoachBusWithEDataTypePackage.BOOKING_OFFICE__COACHES, CoachBusWithEDataTypePackage.COACH__OFFICES);
		}
		return coaches;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Manager getManager() {
		if (manager != null && manager.eIsProxy()) {
			InternalEObject oldManager = (InternalEObject)manager;
			manager = (Manager)eResolveProxy(oldManager);
			if (manager != oldManager) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CoachBusWithEDataTypePackage.BOOKING_OFFICE__MANAGER, oldManager, manager));
			}
		}
		return manager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Manager basicGetManager() {
		return manager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetManager(Manager newManager, NotificationChain msgs) {
		Manager oldManager = manager;
		manager = newManager;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CoachBusWithEDataTypePackage.BOOKING_OFFICE__MANAGER, oldManager, newManager);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManager(Manager newManager) {
		if (newManager != manager) {
			NotificationChain msgs = null;
			if (manager != null)
				msgs = ((InternalEObject)manager).eInverseRemove(this, CoachBusWithEDataTypePackage.MANAGER__OFFICE, Manager.class, msgs);
			if (newManager != null)
				msgs = ((InternalEObject)newManager).eInverseAdd(this, CoachBusWithEDataTypePackage.MANAGER__OFFICE, Manager.class, msgs);
			msgs = basicSetManager(newManager, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoachBusWithEDataTypePackage.BOOKING_OFFICE__MANAGER, newManager, newManager));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VendingMachine> getVms() {
		if (vms == null) {
			vms = new EObjectWithInverseResolvingEList<VendingMachine>(VendingMachine.class, this, CoachBusWithEDataTypePackage.BOOKING_OFFICE__VMS, CoachBusWithEDataTypePackage.VENDING_MACHINE__OFFICE);
		}
		return vms;
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
			case CoachBusWithEDataTypePackage.BOOKING_OFFICE__COACHES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCoaches()).basicAdd(otherEnd, msgs);
			case CoachBusWithEDataTypePackage.BOOKING_OFFICE__MANAGER:
				if (manager != null)
					msgs = ((InternalEObject)manager).eInverseRemove(this, CoachBusWithEDataTypePackage.MANAGER__OFFICE, Manager.class, msgs);
				return basicSetManager((Manager)otherEnd, msgs);
			case CoachBusWithEDataTypePackage.BOOKING_OFFICE__VMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getVms()).basicAdd(otherEnd, msgs);
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
			case CoachBusWithEDataTypePackage.BOOKING_OFFICE__COACHES:
				return ((InternalEList<?>)getCoaches()).basicRemove(otherEnd, msgs);
			case CoachBusWithEDataTypePackage.BOOKING_OFFICE__MANAGER:
				return basicSetManager(null, msgs);
			case CoachBusWithEDataTypePackage.BOOKING_OFFICE__VMS:
				return ((InternalEList<?>)getVms()).basicRemove(otherEnd, msgs);
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
			case CoachBusWithEDataTypePackage.BOOKING_OFFICE__NAME:
				return getName();
			case CoachBusWithEDataTypePackage.BOOKING_OFFICE__LOCATION:
				return getLocation();
			case CoachBusWithEDataTypePackage.BOOKING_OFFICE__OFFICE_ID:
				return getOfficeID();
			case CoachBusWithEDataTypePackage.BOOKING_OFFICE__COACHES:
				return getCoaches();
			case CoachBusWithEDataTypePackage.BOOKING_OFFICE__MANAGER:
				if (resolve) return getManager();
				return basicGetManager();
			case CoachBusWithEDataTypePackage.BOOKING_OFFICE__VMS:
				return getVms();
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
			case CoachBusWithEDataTypePackage.BOOKING_OFFICE__NAME:
				setName((String)newValue);
				return;
			case CoachBusWithEDataTypePackage.BOOKING_OFFICE__LOCATION:
				setLocation((String)newValue);
				return;
			case CoachBusWithEDataTypePackage.BOOKING_OFFICE__OFFICE_ID:
				setOfficeID((Integer)newValue);
				return;
			case CoachBusWithEDataTypePackage.BOOKING_OFFICE__COACHES:
				getCoaches().clear();
				getCoaches().addAll((Collection<? extends Coach>)newValue);
				return;
			case CoachBusWithEDataTypePackage.BOOKING_OFFICE__MANAGER:
				setManager((Manager)newValue);
				return;
			case CoachBusWithEDataTypePackage.BOOKING_OFFICE__VMS:
				getVms().clear();
				getVms().addAll((Collection<? extends VendingMachine>)newValue);
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
			case CoachBusWithEDataTypePackage.BOOKING_OFFICE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CoachBusWithEDataTypePackage.BOOKING_OFFICE__LOCATION:
				setLocation(LOCATION_EDEFAULT);
				return;
			case CoachBusWithEDataTypePackage.BOOKING_OFFICE__OFFICE_ID:
				setOfficeID(OFFICE_ID_EDEFAULT);
				return;
			case CoachBusWithEDataTypePackage.BOOKING_OFFICE__COACHES:
				getCoaches().clear();
				return;
			case CoachBusWithEDataTypePackage.BOOKING_OFFICE__MANAGER:
				setManager((Manager)null);
				return;
			case CoachBusWithEDataTypePackage.BOOKING_OFFICE__VMS:
				getVms().clear();
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
			case CoachBusWithEDataTypePackage.BOOKING_OFFICE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CoachBusWithEDataTypePackage.BOOKING_OFFICE__LOCATION:
				return LOCATION_EDEFAULT == null ? location != null : !LOCATION_EDEFAULT.equals(location);
			case CoachBusWithEDataTypePackage.BOOKING_OFFICE__OFFICE_ID:
				return officeID != OFFICE_ID_EDEFAULT;
			case CoachBusWithEDataTypePackage.BOOKING_OFFICE__COACHES:
				return coaches != null && !coaches.isEmpty();
			case CoachBusWithEDataTypePackage.BOOKING_OFFICE__MANAGER:
				return manager != null;
			case CoachBusWithEDataTypePackage.BOOKING_OFFICE__VMS:
				return vms != null && !vms.isEmpty();
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
		result.append(", location: ");
		result.append(location);
		result.append(", officeID: ");
		result.append(officeID);
		result.append(')');
		return result.toString();
	}

} //BookingOfficeImpl

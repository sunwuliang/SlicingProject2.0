/**
 */
package org.csu.slicing.CoachBusWithEDataType.impl;

import org.csu.slicing.CoachBusWithEDataType.BookingOffice;
import org.csu.slicing.CoachBusWithEDataType.CoachBusWithEDataTypePackage;
import org.csu.slicing.CoachBusWithEDataType.Manager;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.csu.slicing.CoachBusWithEDataType.impl.ManagerImpl#isHasMBA <em>Has MBA</em>}</li>
 *   <li>{@link org.csu.slicing.CoachBusWithEDataType.impl.ManagerImpl#getOffice <em>Office</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ManagerImpl extends EmployeeImpl implements Manager {
	/**
	 * The default value of the '{@link #isHasMBA() <em>Has MBA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasMBA()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HAS_MBA_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHasMBA() <em>Has MBA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasMBA()
	 * @generated
	 * @ordered
	 */
	protected boolean hasMBA = HAS_MBA_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOffice() <em>Office</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffice()
	 * @generated
	 * @ordered
	 */
	protected BookingOffice office;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ManagerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoachBusWithEDataTypePackage.Literals.MANAGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHasMBA() {
		return hasMBA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasMBA(boolean newHasMBA) {
		boolean oldHasMBA = hasMBA;
		hasMBA = newHasMBA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoachBusWithEDataTypePackage.MANAGER__HAS_MBA, oldHasMBA, hasMBA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookingOffice getOffice() {
		if (office != null && office.eIsProxy()) {
			InternalEObject oldOffice = (InternalEObject)office;
			office = (BookingOffice)eResolveProxy(oldOffice);
			if (office != oldOffice) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CoachBusWithEDataTypePackage.MANAGER__OFFICE, oldOffice, office));
			}
		}
		return office;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookingOffice basicGetOffice() {
		return office;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOffice(BookingOffice newOffice, NotificationChain msgs) {
		BookingOffice oldOffice = office;
		office = newOffice;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CoachBusWithEDataTypePackage.MANAGER__OFFICE, oldOffice, newOffice);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOffice(BookingOffice newOffice) {
		if (newOffice != office) {
			NotificationChain msgs = null;
			if (office != null)
				msgs = ((InternalEObject)office).eInverseRemove(this, CoachBusWithEDataTypePackage.BOOKING_OFFICE__MANAGER, BookingOffice.class, msgs);
			if (newOffice != null)
				msgs = ((InternalEObject)newOffice).eInverseAdd(this, CoachBusWithEDataTypePackage.BOOKING_OFFICE__MANAGER, BookingOffice.class, msgs);
			msgs = basicSetOffice(newOffice, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoachBusWithEDataTypePackage.MANAGER__OFFICE, newOffice, newOffice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CoachBusWithEDataTypePackage.MANAGER__OFFICE:
				if (office != null)
					msgs = ((InternalEObject)office).eInverseRemove(this, CoachBusWithEDataTypePackage.BOOKING_OFFICE__MANAGER, BookingOffice.class, msgs);
				return basicSetOffice((BookingOffice)otherEnd, msgs);
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
			case CoachBusWithEDataTypePackage.MANAGER__OFFICE:
				return basicSetOffice(null, msgs);
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
			case CoachBusWithEDataTypePackage.MANAGER__HAS_MBA:
				return isHasMBA();
			case CoachBusWithEDataTypePackage.MANAGER__OFFICE:
				if (resolve) return getOffice();
				return basicGetOffice();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CoachBusWithEDataTypePackage.MANAGER__HAS_MBA:
				setHasMBA((Boolean)newValue);
				return;
			case CoachBusWithEDataTypePackage.MANAGER__OFFICE:
				setOffice((BookingOffice)newValue);
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
			case CoachBusWithEDataTypePackage.MANAGER__HAS_MBA:
				setHasMBA(HAS_MBA_EDEFAULT);
				return;
			case CoachBusWithEDataTypePackage.MANAGER__OFFICE:
				setOffice((BookingOffice)null);
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
			case CoachBusWithEDataTypePackage.MANAGER__HAS_MBA:
				return hasMBA != HAS_MBA_EDEFAULT;
			case CoachBusWithEDataTypePackage.MANAGER__OFFICE:
				return office != null;
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
		result.append(" (hasMBA: ");
		result.append(hasMBA);
		result.append(')');
		return result.toString();
	}

} //ManagerImpl

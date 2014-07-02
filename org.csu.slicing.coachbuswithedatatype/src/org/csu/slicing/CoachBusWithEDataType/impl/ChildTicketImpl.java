/**
 */
package org.csu.slicing.CoachBusWithEDataType.impl;

import org.csu.slicing.CoachBusWithEDataType.ChildTicket;
import org.csu.slicing.CoachBusWithEDataType.CoachBusWithEDataTypePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Child Ticket</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.csu.slicing.CoachBusWithEDataType.impl.ChildTicketImpl#isIsSchoolTrip <em>Is School Trip</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChildTicketImpl extends TicketImpl implements ChildTicket {
	/**
	 * The default value of the '{@link #isIsSchoolTrip() <em>Is School Trip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSchoolTrip()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_SCHOOL_TRIP_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsSchoolTrip() <em>Is School Trip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSchoolTrip()
	 * @generated
	 * @ordered
	 */
	protected boolean isSchoolTrip = IS_SCHOOL_TRIP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChildTicketImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoachBusWithEDataTypePackage.Literals.CHILD_TICKET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsSchoolTrip() {
		return isSchoolTrip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsSchoolTrip(boolean newIsSchoolTrip) {
		boolean oldIsSchoolTrip = isSchoolTrip;
		isSchoolTrip = newIsSchoolTrip;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoachBusWithEDataTypePackage.CHILD_TICKET__IS_SCHOOL_TRIP, oldIsSchoolTrip, isSchoolTrip));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CoachBusWithEDataTypePackage.CHILD_TICKET__IS_SCHOOL_TRIP:
				return isIsSchoolTrip();
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
			case CoachBusWithEDataTypePackage.CHILD_TICKET__IS_SCHOOL_TRIP:
				setIsSchoolTrip((Boolean)newValue);
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
			case CoachBusWithEDataTypePackage.CHILD_TICKET__IS_SCHOOL_TRIP:
				setIsSchoolTrip(IS_SCHOOL_TRIP_EDEFAULT);
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
			case CoachBusWithEDataTypePackage.CHILD_TICKET__IS_SCHOOL_TRIP:
				return isSchoolTrip != IS_SCHOOL_TRIP_EDEFAULT;
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
		result.append(" (isSchoolTrip: ");
		result.append(isSchoolTrip);
		result.append(')');
		return result.toString();
	}

} //ChildTicketImpl

/**
 */
package org.csu.slicing.CoachBus.impl;

import org.csu.slicing.CoachBus.AdultTicket;
import org.csu.slicing.CoachBus.CoachBusPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Adult Ticket</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.csu.slicing.CoachBus.impl.AdultTicketImpl#isIsElderlyDiscount <em>Is Elderly Discount</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AdultTicketImpl extends TicketImpl implements AdultTicket {
	/**
	 * The default value of the '{@link #isIsElderlyDiscount() <em>Is Elderly Discount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsElderlyDiscount()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ELDERLY_DISCOUNT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsElderlyDiscount() <em>Is Elderly Discount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsElderlyDiscount()
	 * @generated
	 * @ordered
	 */
	protected boolean isElderlyDiscount = IS_ELDERLY_DISCOUNT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdultTicketImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoachBusPackage.Literals.ADULT_TICKET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsElderlyDiscount() {
		return isElderlyDiscount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsElderlyDiscount(boolean newIsElderlyDiscount) {
		boolean oldIsElderlyDiscount = isElderlyDiscount;
		isElderlyDiscount = newIsElderlyDiscount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoachBusPackage.ADULT_TICKET__IS_ELDERLY_DISCOUNT, oldIsElderlyDiscount, isElderlyDiscount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CoachBusPackage.ADULT_TICKET__IS_ELDERLY_DISCOUNT:
				return isIsElderlyDiscount();
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
			case CoachBusPackage.ADULT_TICKET__IS_ELDERLY_DISCOUNT:
				setIsElderlyDiscount((Boolean)newValue);
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
			case CoachBusPackage.ADULT_TICKET__IS_ELDERLY_DISCOUNT:
				setIsElderlyDiscount(IS_ELDERLY_DISCOUNT_EDEFAULT);
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
			case CoachBusPackage.ADULT_TICKET__IS_ELDERLY_DISCOUNT:
				return isElderlyDiscount != IS_ELDERLY_DISCOUNT_EDEFAULT;
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
		result.append(" (isElderlyDiscount: ");
		result.append(isElderlyDiscount);
		result.append(')');
		return result.toString();
	}

} //AdultTicketImpl

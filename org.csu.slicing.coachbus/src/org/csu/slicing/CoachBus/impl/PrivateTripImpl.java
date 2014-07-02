/**
 */
package org.csu.slicing.CoachBus.impl;

import org.csu.slicing.CoachBus.CoachBusPackage;
import org.csu.slicing.CoachBus.PrivateTrip;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Private Trip</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.csu.slicing.CoachBus.impl.PrivateTripImpl#getExtras <em>Extras</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PrivateTripImpl extends TripImpl implements PrivateTrip {
	/**
	 * The default value of the '{@link #getExtras() <em>Extras</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtras()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTRAS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExtras() <em>Extras</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtras()
	 * @generated
	 * @ordered
	 */
	protected String extras = EXTRAS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrivateTripImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoachBusPackage.Literals.PRIVATE_TRIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExtras() {
		return extras;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtras(String newExtras) {
		String oldExtras = extras;
		extras = newExtras;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoachBusPackage.PRIVATE_TRIP__EXTRAS, oldExtras, extras));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CoachBusPackage.PRIVATE_TRIP__EXTRAS:
				return getExtras();
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
			case CoachBusPackage.PRIVATE_TRIP__EXTRAS:
				setExtras((String)newValue);
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
			case CoachBusPackage.PRIVATE_TRIP__EXTRAS:
				setExtras(EXTRAS_EDEFAULT);
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
			case CoachBusPackage.PRIVATE_TRIP__EXTRAS:
				return EXTRAS_EDEFAULT == null ? extras != null : !EXTRAS_EDEFAULT.equals(extras);
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
		result.append(" (extras: ");
		result.append(extras);
		result.append(')');
		return result.toString();
	}

} //PrivateTripImpl

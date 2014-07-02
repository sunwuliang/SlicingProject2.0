/**
 */
package org.csu.slicing.CoachBus.impl;

import org.csu.slicing.CoachBus.Coach;
import org.csu.slicing.CoachBus.CoachBusPackage;
import org.csu.slicing.CoachBus.SecurityGuard;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Security Guard</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.csu.slicing.CoachBus.impl.SecurityGuardImpl#getShift <em>Shift</em>}</li>
 *   <li>{@link org.csu.slicing.CoachBus.impl.SecurityGuardImpl#getCoach <em>Coach</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SecurityGuardImpl extends EmployeeImpl implements SecurityGuard {
	/**
	 * The default value of the '{@link #getShift() <em>Shift</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShift()
	 * @generated
	 * @ordered
	 */
	protected static final String SHIFT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShift() <em>Shift</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShift()
	 * @generated
	 * @ordered
	 */
	protected String shift = SHIFT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCoach() <em>Coach</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoach()
	 * @generated
	 * @ordered
	 */
	protected Coach coach;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecurityGuardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoachBusPackage.Literals.SECURITY_GUARD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getShift() {
		return shift;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShift(String newShift) {
		String oldShift = shift;
		shift = newShift;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoachBusPackage.SECURITY_GUARD__SHIFT, oldShift, shift));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coach getCoach() {
		if (coach != null && coach.eIsProxy()) {
			InternalEObject oldCoach = (InternalEObject)coach;
			coach = (Coach)eResolveProxy(oldCoach);
			if (coach != oldCoach) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CoachBusPackage.SECURITY_GUARD__COACH, oldCoach, coach));
			}
		}
		return coach;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coach basicGetCoach() {
		return coach;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCoach(Coach newCoach, NotificationChain msgs) {
		Coach oldCoach = coach;
		coach = newCoach;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CoachBusPackage.SECURITY_GUARD__COACH, oldCoach, newCoach);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoach(Coach newCoach) {
		if (newCoach != coach) {
			NotificationChain msgs = null;
			if (coach != null)
				msgs = ((InternalEObject)coach).eInverseRemove(this, CoachBusPackage.COACH__GUARDS, Coach.class, msgs);
			if (newCoach != null)
				msgs = ((InternalEObject)newCoach).eInverseAdd(this, CoachBusPackage.COACH__GUARDS, Coach.class, msgs);
			msgs = basicSetCoach(newCoach, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoachBusPackage.SECURITY_GUARD__COACH, newCoach, newCoach));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CoachBusPackage.SECURITY_GUARD__COACH:
				if (coach != null)
					msgs = ((InternalEObject)coach).eInverseRemove(this, CoachBusPackage.COACH__GUARDS, Coach.class, msgs);
				return basicSetCoach((Coach)otherEnd, msgs);
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
			case CoachBusPackage.SECURITY_GUARD__COACH:
				return basicSetCoach(null, msgs);
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
			case CoachBusPackage.SECURITY_GUARD__SHIFT:
				return getShift();
			case CoachBusPackage.SECURITY_GUARD__COACH:
				if (resolve) return getCoach();
				return basicGetCoach();
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
			case CoachBusPackage.SECURITY_GUARD__SHIFT:
				setShift((String)newValue);
				return;
			case CoachBusPackage.SECURITY_GUARD__COACH:
				setCoach((Coach)newValue);
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
			case CoachBusPackage.SECURITY_GUARD__SHIFT:
				setShift(SHIFT_EDEFAULT);
				return;
			case CoachBusPackage.SECURITY_GUARD__COACH:
				setCoach((Coach)null);
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
			case CoachBusPackage.SECURITY_GUARD__SHIFT:
				return SHIFT_EDEFAULT == null ? shift != null : !SHIFT_EDEFAULT.equals(shift);
			case CoachBusPackage.SECURITY_GUARD__COACH:
				return coach != null;
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
		result.append(" (shift: ");
		result.append(shift);
		result.append(')');
		return result.toString();
	}

} //SecurityGuardImpl

/**
 */
package org.csu.slicing.UML2.impl;

import org.csu.slicing.UML2.EventOccurrence;
import org.csu.slicing.UML2.GeneralOrdering;
import org.csu.slicing.UML2.UML2Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>General Ordering</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2.impl.GeneralOrderingImpl#getBefore <em>Before</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.GeneralOrderingImpl#getAfter <em>After</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GeneralOrderingImpl extends NamedElementImpl implements GeneralOrdering {
	/**
	 * The cached value of the '{@link #getBefore() <em>Before</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBefore()
	 * @generated
	 * @ordered
	 */
	protected EventOccurrence before;

	/**
	 * The cached value of the '{@link #getAfter() <em>After</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAfter()
	 * @generated
	 * @ordered
	 */
	protected EventOccurrence after;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneralOrderingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UML2Package.eINSTANCE.getGeneralOrdering();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventOccurrence getBefore() {
		if (before != null && before.eIsProxy()) {
			InternalEObject oldBefore = (InternalEObject)before;
			before = (EventOccurrence)eResolveProxy(oldBefore);
			if (before != oldBefore) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2Package.GENERAL_ORDERING__BEFORE, oldBefore, before));
			}
		}
		return before;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventOccurrence basicGetBefore() {
		return before;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBefore(EventOccurrence newBefore, NotificationChain msgs) {
		EventOccurrence oldBefore = before;
		before = newBefore;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UML2Package.GENERAL_ORDERING__BEFORE, oldBefore, newBefore);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBefore(EventOccurrence newBefore) {
		if (newBefore != before) {
			NotificationChain msgs = null;
			if (before != null)
				msgs = ((InternalEObject)before).eInverseRemove(this, UML2Package.EVENT_OCCURRENCE__TO_AFTER, EventOccurrence.class, msgs);
			if (newBefore != null)
				msgs = ((InternalEObject)newBefore).eInverseAdd(this, UML2Package.EVENT_OCCURRENCE__TO_AFTER, EventOccurrence.class, msgs);
			msgs = basicSetBefore(newBefore, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.GENERAL_ORDERING__BEFORE, newBefore, newBefore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventOccurrence getAfter() {
		if (after != null && after.eIsProxy()) {
			InternalEObject oldAfter = (InternalEObject)after;
			after = (EventOccurrence)eResolveProxy(oldAfter);
			if (after != oldAfter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2Package.GENERAL_ORDERING__AFTER, oldAfter, after));
			}
		}
		return after;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventOccurrence basicGetAfter() {
		return after;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAfter(EventOccurrence newAfter, NotificationChain msgs) {
		EventOccurrence oldAfter = after;
		after = newAfter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UML2Package.GENERAL_ORDERING__AFTER, oldAfter, newAfter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAfter(EventOccurrence newAfter) {
		if (newAfter != after) {
			NotificationChain msgs = null;
			if (after != null)
				msgs = ((InternalEObject)after).eInverseRemove(this, UML2Package.EVENT_OCCURRENCE__TO_BEFORE, EventOccurrence.class, msgs);
			if (newAfter != null)
				msgs = ((InternalEObject)newAfter).eInverseAdd(this, UML2Package.EVENT_OCCURRENCE__TO_BEFORE, EventOccurrence.class, msgs);
			msgs = basicSetAfter(newAfter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.GENERAL_ORDERING__AFTER, newAfter, newAfter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UML2Package.GENERAL_ORDERING__BEFORE:
				if (before != null)
					msgs = ((InternalEObject)before).eInverseRemove(this, UML2Package.EVENT_OCCURRENCE__TO_AFTER, EventOccurrence.class, msgs);
				return basicSetBefore((EventOccurrence)otherEnd, msgs);
			case UML2Package.GENERAL_ORDERING__AFTER:
				if (after != null)
					msgs = ((InternalEObject)after).eInverseRemove(this, UML2Package.EVENT_OCCURRENCE__TO_BEFORE, EventOccurrence.class, msgs);
				return basicSetAfter((EventOccurrence)otherEnd, msgs);
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
			case UML2Package.GENERAL_ORDERING__BEFORE:
				return basicSetBefore(null, msgs);
			case UML2Package.GENERAL_ORDERING__AFTER:
				return basicSetAfter(null, msgs);
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
			case UML2Package.GENERAL_ORDERING__BEFORE:
				if (resolve) return getBefore();
				return basicGetBefore();
			case UML2Package.GENERAL_ORDERING__AFTER:
				if (resolve) return getAfter();
				return basicGetAfter();
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
			case UML2Package.GENERAL_ORDERING__BEFORE:
				setBefore((EventOccurrence)newValue);
				return;
			case UML2Package.GENERAL_ORDERING__AFTER:
				setAfter((EventOccurrence)newValue);
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
			case UML2Package.GENERAL_ORDERING__BEFORE:
				setBefore((EventOccurrence)null);
				return;
			case UML2Package.GENERAL_ORDERING__AFTER:
				setAfter((EventOccurrence)null);
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
			case UML2Package.GENERAL_ORDERING__BEFORE:
				return before != null;
			case UML2Package.GENERAL_ORDERING__AFTER:
				return after != null;
		}
		return super.eIsSet(featureID);
	}

} //GeneralOrderingImpl

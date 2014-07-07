/**
 */
package org.csu.slicing.UML2WithID.impl;

import org.csu.slicing.UML2WithID.ChangeTrigger;
import org.csu.slicing.UML2WithID.UML2WithIDPackage;
import org.csu.slicing.UML2WithID.ValueSpecification;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Change Trigger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.ChangeTriggerImpl#getChangeExpression <em>Change Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChangeTriggerImpl extends TriggerImpl implements ChangeTrigger {
	/**
	 * The cached value of the '{@link #getChangeExpression() <em>Change Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeExpression()
	 * @generated
	 * @ordered
	 */
	protected ValueSpecification changeExpression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChangeTriggerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UML2WithIDPackage.eINSTANCE.getChangeTrigger();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getChangeExpression() {
		return changeExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChangeExpression(ValueSpecification newChangeExpression, NotificationChain msgs) {
		ValueSpecification oldChangeExpression = changeExpression;
		changeExpression = newChangeExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UML2WithIDPackage.CHANGE_TRIGGER__CHANGE_EXPRESSION, oldChangeExpression, newChangeExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChangeExpression(ValueSpecification newChangeExpression) {
		if (newChangeExpression != changeExpression) {
			NotificationChain msgs = null;
			if (changeExpression != null)
				msgs = ((InternalEObject)changeExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2WithIDPackage.CHANGE_TRIGGER__CHANGE_EXPRESSION, null, msgs);
			if (newChangeExpression != null)
				msgs = ((InternalEObject)newChangeExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UML2WithIDPackage.CHANGE_TRIGGER__CHANGE_EXPRESSION, null, msgs);
			msgs = basicSetChangeExpression(newChangeExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2WithIDPackage.CHANGE_TRIGGER__CHANGE_EXPRESSION, newChangeExpression, newChangeExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UML2WithIDPackage.CHANGE_TRIGGER__CHANGE_EXPRESSION:
				return basicSetChangeExpression(null, msgs);
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
			case UML2WithIDPackage.CHANGE_TRIGGER__CHANGE_EXPRESSION:
				return getChangeExpression();
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
			case UML2WithIDPackage.CHANGE_TRIGGER__CHANGE_EXPRESSION:
				setChangeExpression((ValueSpecification)newValue);
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
			case UML2WithIDPackage.CHANGE_TRIGGER__CHANGE_EXPRESSION:
				setChangeExpression((ValueSpecification)null);
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
			case UML2WithIDPackage.CHANGE_TRIGGER__CHANGE_EXPRESSION:
				return changeExpression != null;
		}
		return super.eIsSet(featureID);
	}

} //ChangeTriggerImpl

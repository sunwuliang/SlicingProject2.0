/**
 */
package org.csu.slicing.UML2.impl;

import org.csu.slicing.UML2.InputPin;
import org.csu.slicing.UML2.RaiseExceptionAction;
import org.csu.slicing.UML2.UML2Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Raise Exception Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2.impl.RaiseExceptionActionImpl#getException <em>Exception</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RaiseExceptionActionImpl extends ActionImpl implements RaiseExceptionAction {
	/**
	 * The cached value of the '{@link #getException() <em>Exception</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getException()
	 * @generated
	 * @ordered
	 */
	protected InputPin exception;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RaiseExceptionActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UML2Package.eINSTANCE.getRaiseExceptionAction();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin getException() {
		if (exception != null && exception.eIsProxy()) {
			InternalEObject oldException = (InternalEObject)exception;
			exception = (InputPin)eResolveProxy(oldException);
			if (exception != oldException) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2Package.RAISE_EXCEPTION_ACTION__EXCEPTION, oldException, exception));
			}
		}
		return exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin basicGetException() {
		return exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setException(InputPin newException) {
		InputPin oldException = exception;
		exception = newException;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.RAISE_EXCEPTION_ACTION__EXCEPTION, oldException, exception));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UML2Package.RAISE_EXCEPTION_ACTION__EXCEPTION:
				if (resolve) return getException();
				return basicGetException();
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
			case UML2Package.RAISE_EXCEPTION_ACTION__EXCEPTION:
				setException((InputPin)newValue);
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
			case UML2Package.RAISE_EXCEPTION_ACTION__EXCEPTION:
				setException((InputPin)null);
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
			case UML2Package.RAISE_EXCEPTION_ACTION__EXCEPTION:
				return exception != null;
		}
		return super.eIsSet(featureID);
	}

} //RaiseExceptionActionImpl

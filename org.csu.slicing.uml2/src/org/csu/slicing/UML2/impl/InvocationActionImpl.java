/**
 */
package org.csu.slicing.UML2.impl;

import java.util.Collection;

import org.csu.slicing.UML2.InputPin;
import org.csu.slicing.UML2.InvocationAction;
import org.csu.slicing.UML2.Port;
import org.csu.slicing.UML2.UML2Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Invocation Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2.impl.InvocationActionImpl#getArgument <em>Argument</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.InvocationActionImpl#getOnPort <em>On Port</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class InvocationActionImpl extends ActionImpl implements InvocationAction {
	/**
	 * The cached value of the '{@link #getArgument() <em>Argument</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgument()
	 * @generated
	 * @ordered
	 */
	protected EList<InputPin> argument;

	/**
	 * The cached value of the '{@link #getOnPort() <em>On Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnPort()
	 * @generated
	 * @ordered
	 */
	protected Port onPort;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InvocationActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UML2Package.eINSTANCE.getInvocationAction();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputPin> getArgument() {
		if (argument == null) {
			argument = new EObjectContainmentEList<InputPin>(InputPin.class, this, UML2Package.INVOCATION_ACTION__ARGUMENT);
		}
		return argument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port getOnPort() {
		if (onPort != null && onPort.eIsProxy()) {
			InternalEObject oldOnPort = (InternalEObject)onPort;
			onPort = (Port)eResolveProxy(oldOnPort);
			if (onPort != oldOnPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2Package.INVOCATION_ACTION__ON_PORT, oldOnPort, onPort));
			}
		}
		return onPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port basicGetOnPort() {
		return onPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnPort(Port newOnPort) {
		Port oldOnPort = onPort;
		onPort = newOnPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.INVOCATION_ACTION__ON_PORT, oldOnPort, onPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UML2Package.INVOCATION_ACTION__ARGUMENT:
				return ((InternalEList<?>)getArgument()).basicRemove(otherEnd, msgs);
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
			case UML2Package.INVOCATION_ACTION__ARGUMENT:
				return getArgument();
			case UML2Package.INVOCATION_ACTION__ON_PORT:
				if (resolve) return getOnPort();
				return basicGetOnPort();
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
			case UML2Package.INVOCATION_ACTION__ARGUMENT:
				getArgument().clear();
				getArgument().addAll((Collection<? extends InputPin>)newValue);
				return;
			case UML2Package.INVOCATION_ACTION__ON_PORT:
				setOnPort((Port)newValue);
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
			case UML2Package.INVOCATION_ACTION__ARGUMENT:
				getArgument().clear();
				return;
			case UML2Package.INVOCATION_ACTION__ON_PORT:
				setOnPort((Port)null);
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
			case UML2Package.INVOCATION_ACTION__ARGUMENT:
				return argument != null && !argument.isEmpty();
			case UML2Package.INVOCATION_ACTION__ON_PORT:
				return onPort != null;
		}
		return super.eIsSet(featureID);
	}

} //InvocationActionImpl

/**
 */
package org.csu.slicing.UML2.impl;

import java.util.Collection;

import org.csu.slicing.UML2.EncapsulatedClassifier;
import org.csu.slicing.UML2.Port;
import org.csu.slicing.UML2.UML2Package;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Encapsulated Classifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2.impl.EncapsulatedClassifierImpl#getOwnedPort <em>Owned Port</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class EncapsulatedClassifierImpl extends StructuredClassifierImpl implements EncapsulatedClassifier {
	/**
	 * The cached value of the '{@link #getOwnedPort() <em>Owned Port</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedPort()
	 * @generated
	 * @ordered
	 */
	protected EList<Port> ownedPort;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EncapsulatedClassifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UML2Package.eINSTANCE.getEncapsulatedClassifier();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Port> getOwnedPort() {
		if (ownedPort == null) {
			ownedPort = new EObjectContainmentEList<Port>(Port.class, this, UML2Package.ENCAPSULATED_CLASSIFIER__OWNED_PORT);
		}
		return ownedPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UML2Package.ENCAPSULATED_CLASSIFIER__OWNED_PORT:
				return ((InternalEList<?>)getOwnedPort()).basicRemove(otherEnd, msgs);
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
			case UML2Package.ENCAPSULATED_CLASSIFIER__OWNED_PORT:
				return getOwnedPort();
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
			case UML2Package.ENCAPSULATED_CLASSIFIER__OWNED_PORT:
				getOwnedPort().clear();
				getOwnedPort().addAll((Collection<? extends Port>)newValue);
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
			case UML2Package.ENCAPSULATED_CLASSIFIER__OWNED_PORT:
				getOwnedPort().clear();
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
			case UML2Package.ENCAPSULATED_CLASSIFIER__OWNED_PORT:
				return ownedPort != null && !ownedPort.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EncapsulatedClassifierImpl

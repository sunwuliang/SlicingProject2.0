/**
 */
package org.csu.slicing.UML2WithID.impl;

import java.util.Collection;

import org.csu.slicing.UML2WithID.Classifier;
import org.csu.slicing.UML2WithID.Interface;
import org.csu.slicing.UML2WithID.Operation;
import org.csu.slicing.UML2WithID.Property;
import org.csu.slicing.UML2WithID.ProtocolStateMachine;
import org.csu.slicing.UML2WithID.Reception;
import org.csu.slicing.UML2WithID.UML2WithIDPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.InterfaceImpl#getOwnedAttribute <em>Owned Attribute</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.InterfaceImpl#getOwnedOperation <em>Owned Operation</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.InterfaceImpl#getRedefinedInterface <em>Redefined Interface</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.InterfaceImpl#getNestedClassifier <em>Nested Classifier</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.InterfaceImpl#getOwnedReception <em>Owned Reception</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.InterfaceImpl#getProtocol <em>Protocol</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InterfaceImpl extends ClassifierImpl implements Interface {
	/**
	 * The cached value of the '{@link #getOwnedAttribute() <em>Owned Attribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> ownedAttribute;

	/**
	 * The cached value of the '{@link #getOwnedOperation() <em>Owned Operation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedOperation()
	 * @generated
	 * @ordered
	 */
	protected EList<Operation> ownedOperation;

	/**
	 * The cached value of the '{@link #getRedefinedInterface() <em>Redefined Interface</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinedInterface()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface> redefinedInterface;

	/**
	 * The cached value of the '{@link #getNestedClassifier() <em>Nested Classifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNestedClassifier()
	 * @generated
	 * @ordered
	 */
	protected EList<Classifier> nestedClassifier;

	/**
	 * The cached value of the '{@link #getOwnedReception() <em>Owned Reception</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedReception()
	 * @generated
	 * @ordered
	 */
	protected EList<Reception> ownedReception;

	/**
	 * The cached value of the '{@link #getProtocol() <em>Protocol</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected ProtocolStateMachine protocol;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UML2WithIDPackage.eINSTANCE.getInterface();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getOwnedAttribute() {
		if (ownedAttribute == null) {
			ownedAttribute = new EObjectContainmentEList<Property>(Property.class, this, UML2WithIDPackage.INTERFACE__OWNED_ATTRIBUTE);
		}
		return ownedAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getOwnedOperation() {
		if (ownedOperation == null) {
			ownedOperation = new EObjectContainmentEList<Operation>(Operation.class, this, UML2WithIDPackage.INTERFACE__OWNED_OPERATION);
		}
		return ownedOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> getRedefinedInterface() {
		if (redefinedInterface == null) {
			redefinedInterface = new EObjectResolvingEList<Interface>(Interface.class, this, UML2WithIDPackage.INTERFACE__REDEFINED_INTERFACE);
		}
		return redefinedInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Classifier> getNestedClassifier() {
		if (nestedClassifier == null) {
			nestedClassifier = new EObjectContainmentEList<Classifier>(Classifier.class, this, UML2WithIDPackage.INTERFACE__NESTED_CLASSIFIER);
		}
		return nestedClassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reception> getOwnedReception() {
		if (ownedReception == null) {
			ownedReception = new EObjectContainmentEList<Reception>(Reception.class, this, UML2WithIDPackage.INTERFACE__OWNED_RECEPTION);
		}
		return ownedReception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolStateMachine getProtocol() {
		return protocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProtocol(ProtocolStateMachine newProtocol, NotificationChain msgs) {
		ProtocolStateMachine oldProtocol = protocol;
		protocol = newProtocol;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UML2WithIDPackage.INTERFACE__PROTOCOL, oldProtocol, newProtocol);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtocol(ProtocolStateMachine newProtocol) {
		if (newProtocol != protocol) {
			NotificationChain msgs = null;
			if (protocol != null)
				msgs = ((InternalEObject)protocol).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2WithIDPackage.INTERFACE__PROTOCOL, null, msgs);
			if (newProtocol != null)
				msgs = ((InternalEObject)newProtocol).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UML2WithIDPackage.INTERFACE__PROTOCOL, null, msgs);
			msgs = basicSetProtocol(newProtocol, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2WithIDPackage.INTERFACE__PROTOCOL, newProtocol, newProtocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UML2WithIDPackage.INTERFACE__OWNED_ATTRIBUTE:
				return ((InternalEList<?>)getOwnedAttribute()).basicRemove(otherEnd, msgs);
			case UML2WithIDPackage.INTERFACE__OWNED_OPERATION:
				return ((InternalEList<?>)getOwnedOperation()).basicRemove(otherEnd, msgs);
			case UML2WithIDPackage.INTERFACE__NESTED_CLASSIFIER:
				return ((InternalEList<?>)getNestedClassifier()).basicRemove(otherEnd, msgs);
			case UML2WithIDPackage.INTERFACE__OWNED_RECEPTION:
				return ((InternalEList<?>)getOwnedReception()).basicRemove(otherEnd, msgs);
			case UML2WithIDPackage.INTERFACE__PROTOCOL:
				return basicSetProtocol(null, msgs);
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
			case UML2WithIDPackage.INTERFACE__OWNED_ATTRIBUTE:
				return getOwnedAttribute();
			case UML2WithIDPackage.INTERFACE__OWNED_OPERATION:
				return getOwnedOperation();
			case UML2WithIDPackage.INTERFACE__REDEFINED_INTERFACE:
				return getRedefinedInterface();
			case UML2WithIDPackage.INTERFACE__NESTED_CLASSIFIER:
				return getNestedClassifier();
			case UML2WithIDPackage.INTERFACE__OWNED_RECEPTION:
				return getOwnedReception();
			case UML2WithIDPackage.INTERFACE__PROTOCOL:
				return getProtocol();
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
			case UML2WithIDPackage.INTERFACE__OWNED_ATTRIBUTE:
				getOwnedAttribute().clear();
				getOwnedAttribute().addAll((Collection<? extends Property>)newValue);
				return;
			case UML2WithIDPackage.INTERFACE__OWNED_OPERATION:
				getOwnedOperation().clear();
				getOwnedOperation().addAll((Collection<? extends Operation>)newValue);
				return;
			case UML2WithIDPackage.INTERFACE__REDEFINED_INTERFACE:
				getRedefinedInterface().clear();
				getRedefinedInterface().addAll((Collection<? extends Interface>)newValue);
				return;
			case UML2WithIDPackage.INTERFACE__NESTED_CLASSIFIER:
				getNestedClassifier().clear();
				getNestedClassifier().addAll((Collection<? extends Classifier>)newValue);
				return;
			case UML2WithIDPackage.INTERFACE__OWNED_RECEPTION:
				getOwnedReception().clear();
				getOwnedReception().addAll((Collection<? extends Reception>)newValue);
				return;
			case UML2WithIDPackage.INTERFACE__PROTOCOL:
				setProtocol((ProtocolStateMachine)newValue);
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
			case UML2WithIDPackage.INTERFACE__OWNED_ATTRIBUTE:
				getOwnedAttribute().clear();
				return;
			case UML2WithIDPackage.INTERFACE__OWNED_OPERATION:
				getOwnedOperation().clear();
				return;
			case UML2WithIDPackage.INTERFACE__REDEFINED_INTERFACE:
				getRedefinedInterface().clear();
				return;
			case UML2WithIDPackage.INTERFACE__NESTED_CLASSIFIER:
				getNestedClassifier().clear();
				return;
			case UML2WithIDPackage.INTERFACE__OWNED_RECEPTION:
				getOwnedReception().clear();
				return;
			case UML2WithIDPackage.INTERFACE__PROTOCOL:
				setProtocol((ProtocolStateMachine)null);
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
			case UML2WithIDPackage.INTERFACE__OWNED_ATTRIBUTE:
				return ownedAttribute != null && !ownedAttribute.isEmpty();
			case UML2WithIDPackage.INTERFACE__OWNED_OPERATION:
				return ownedOperation != null && !ownedOperation.isEmpty();
			case UML2WithIDPackage.INTERFACE__REDEFINED_INTERFACE:
				return redefinedInterface != null && !redefinedInterface.isEmpty();
			case UML2WithIDPackage.INTERFACE__NESTED_CLASSIFIER:
				return nestedClassifier != null && !nestedClassifier.isEmpty();
			case UML2WithIDPackage.INTERFACE__OWNED_RECEPTION:
				return ownedReception != null && !ownedReception.isEmpty();
			case UML2WithIDPackage.INTERFACE__PROTOCOL:
				return protocol != null;
		}
		return super.eIsSet(featureID);
	}

} //InterfaceImpl

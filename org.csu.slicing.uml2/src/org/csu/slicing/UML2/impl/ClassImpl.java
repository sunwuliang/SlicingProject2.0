/**
 */
package org.csu.slicing.UML2.impl;

import java.util.Collection;

import org.csu.slicing.UML2.Classifier;
import org.csu.slicing.UML2.ConnectableElement;
import org.csu.slicing.UML2.Connector;
import org.csu.slicing.UML2.EncapsulatedClassifier;
import org.csu.slicing.UML2.Extension;
import org.csu.slicing.UML2.Operation;
import org.csu.slicing.UML2.Port;
import org.csu.slicing.UML2.Property;
import org.csu.slicing.UML2.Reception;
import org.csu.slicing.UML2.StructuredClassifier;
import org.csu.slicing.UML2.UML2Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2.impl.ClassImpl#getOwnedAttribute <em>Owned Attribute</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.ClassImpl#getPart <em>Part</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.ClassImpl#getRole <em>Role</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.ClassImpl#getOwnedConnector <em>Owned Connector</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.ClassImpl#getOwnedPort <em>Owned Port</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.ClassImpl#getOwnedOperation <em>Owned Operation</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.ClassImpl#getSuperClass <em>Super Class</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.ClassImpl#getExtension <em>Extension</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.ClassImpl#getNestedClassifier <em>Nested Classifier</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.ClassImpl#isIsActive <em>Is Active</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.ClassImpl#getOwnedReception <em>Owned Reception</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassImpl extends BehavioredClassifierImpl implements org.csu.slicing.UML2.Class {
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
	 * The cached value of the '{@link #getPart() <em>Part</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPart()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> part;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected EList<ConnectableElement> role;

	/**
	 * The cached value of the '{@link #getOwnedConnector() <em>Owned Connector</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedConnector()
	 * @generated
	 * @ordered
	 */
	protected EList<Connector> ownedConnector;

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
	 * The cached value of the '{@link #getOwnedOperation() <em>Owned Operation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedOperation()
	 * @generated
	 * @ordered
	 */
	protected EList<Operation> ownedOperation;

	/**
	 * The cached value of the '{@link #getSuperClass() <em>Super Class</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperClass()
	 * @generated
	 * @ordered
	 */
	protected EList<org.csu.slicing.UML2.Class> superClass;

	/**
	 * The cached value of the '{@link #getExtension() <em>Extension</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtension()
	 * @generated
	 * @ordered
	 */
	protected EList<Extension> extension;

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
	 * The default value of the '{@link #isIsActive() <em>Is Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsActive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ACTIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsActive() <em>Is Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsActive()
	 * @generated
	 * @ordered
	 */
	protected boolean isActive = IS_ACTIVE_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UML2Package.eINSTANCE.getClass_();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getOwnedAttribute() {
		if (ownedAttribute == null) {
			ownedAttribute = new EObjectContainmentEList<Property>(Property.class, this, UML2Package.CLASS__OWNED_ATTRIBUTE);
		}
		return ownedAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getPart() {
		if (part == null) {
			part = new EObjectResolvingEList<Property>(Property.class, this, UML2Package.CLASS__PART);
		}
		return part;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConnectableElement> getRole() {
		if (role == null) {
			role = new EObjectResolvingEList<ConnectableElement>(ConnectableElement.class, this, UML2Package.CLASS__ROLE);
		}
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connector> getOwnedConnector() {
		if (ownedConnector == null) {
			ownedConnector = new EObjectContainmentEList<Connector>(Connector.class, this, UML2Package.CLASS__OWNED_CONNECTOR);
		}
		return ownedConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Port> getOwnedPort() {
		if (ownedPort == null) {
			ownedPort = new EObjectContainmentEList<Port>(Port.class, this, UML2Package.CLASS__OWNED_PORT);
		}
		return ownedPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getOwnedOperation() {
		if (ownedOperation == null) {
			ownedOperation = new EObjectContainmentWithInverseEList<Operation>(Operation.class, this, UML2Package.CLASS__OWNED_OPERATION, UML2Package.OPERATION__CLASS_);
		}
		return ownedOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.csu.slicing.UML2.Class> getSuperClass() {
		if (superClass == null) {
			superClass = new EObjectResolvingEList<org.csu.slicing.UML2.Class>(org.csu.slicing.UML2.Class.class, this, UML2Package.CLASS__SUPER_CLASS);
		}
		return superClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Extension> getExtension() {
		if (extension == null) {
			extension = new EObjectWithInverseResolvingEList<Extension>(Extension.class, this, UML2Package.CLASS__EXTENSION, UML2Package.EXTENSION__METACLASS);
		}
		return extension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Classifier> getNestedClassifier() {
		if (nestedClassifier == null) {
			nestedClassifier = new EObjectContainmentEList<Classifier>(Classifier.class, this, UML2Package.CLASS__NESTED_CLASSIFIER);
		}
		return nestedClassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsActive() {
		return isActive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsActive(boolean newIsActive) {
		boolean oldIsActive = isActive;
		isActive = newIsActive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.CLASS__IS_ACTIVE, oldIsActive, isActive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reception> getOwnedReception() {
		if (ownedReception == null) {
			ownedReception = new EObjectContainmentEList<Reception>(Reception.class, this, UML2Package.CLASS__OWNED_RECEPTION);
		}
		return ownedReception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UML2Package.CLASS__OWNED_OPERATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedOperation()).basicAdd(otherEnd, msgs);
			case UML2Package.CLASS__EXTENSION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getExtension()).basicAdd(otherEnd, msgs);
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
			case UML2Package.CLASS__OWNED_ATTRIBUTE:
				return ((InternalEList<?>)getOwnedAttribute()).basicRemove(otherEnd, msgs);
			case UML2Package.CLASS__OWNED_CONNECTOR:
				return ((InternalEList<?>)getOwnedConnector()).basicRemove(otherEnd, msgs);
			case UML2Package.CLASS__OWNED_PORT:
				return ((InternalEList<?>)getOwnedPort()).basicRemove(otherEnd, msgs);
			case UML2Package.CLASS__OWNED_OPERATION:
				return ((InternalEList<?>)getOwnedOperation()).basicRemove(otherEnd, msgs);
			case UML2Package.CLASS__EXTENSION:
				return ((InternalEList<?>)getExtension()).basicRemove(otherEnd, msgs);
			case UML2Package.CLASS__NESTED_CLASSIFIER:
				return ((InternalEList<?>)getNestedClassifier()).basicRemove(otherEnd, msgs);
			case UML2Package.CLASS__OWNED_RECEPTION:
				return ((InternalEList<?>)getOwnedReception()).basicRemove(otherEnd, msgs);
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
			case UML2Package.CLASS__OWNED_ATTRIBUTE:
				return getOwnedAttribute();
			case UML2Package.CLASS__PART:
				return getPart();
			case UML2Package.CLASS__ROLE:
				return getRole();
			case UML2Package.CLASS__OWNED_CONNECTOR:
				return getOwnedConnector();
			case UML2Package.CLASS__OWNED_PORT:
				return getOwnedPort();
			case UML2Package.CLASS__OWNED_OPERATION:
				return getOwnedOperation();
			case UML2Package.CLASS__SUPER_CLASS:
				return getSuperClass();
			case UML2Package.CLASS__EXTENSION:
				return getExtension();
			case UML2Package.CLASS__NESTED_CLASSIFIER:
				return getNestedClassifier();
			case UML2Package.CLASS__IS_ACTIVE:
				return isIsActive();
			case UML2Package.CLASS__OWNED_RECEPTION:
				return getOwnedReception();
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
			case UML2Package.CLASS__OWNED_ATTRIBUTE:
				getOwnedAttribute().clear();
				getOwnedAttribute().addAll((Collection<? extends Property>)newValue);
				return;
			case UML2Package.CLASS__PART:
				getPart().clear();
				getPart().addAll((Collection<? extends Property>)newValue);
				return;
			case UML2Package.CLASS__ROLE:
				getRole().clear();
				getRole().addAll((Collection<? extends ConnectableElement>)newValue);
				return;
			case UML2Package.CLASS__OWNED_CONNECTOR:
				getOwnedConnector().clear();
				getOwnedConnector().addAll((Collection<? extends Connector>)newValue);
				return;
			case UML2Package.CLASS__OWNED_PORT:
				getOwnedPort().clear();
				getOwnedPort().addAll((Collection<? extends Port>)newValue);
				return;
			case UML2Package.CLASS__OWNED_OPERATION:
				getOwnedOperation().clear();
				getOwnedOperation().addAll((Collection<? extends Operation>)newValue);
				return;
			case UML2Package.CLASS__SUPER_CLASS:
				getSuperClass().clear();
				getSuperClass().addAll((Collection<? extends org.csu.slicing.UML2.Class>)newValue);
				return;
			case UML2Package.CLASS__EXTENSION:
				getExtension().clear();
				getExtension().addAll((Collection<? extends Extension>)newValue);
				return;
			case UML2Package.CLASS__NESTED_CLASSIFIER:
				getNestedClassifier().clear();
				getNestedClassifier().addAll((Collection<? extends Classifier>)newValue);
				return;
			case UML2Package.CLASS__IS_ACTIVE:
				setIsActive((Boolean)newValue);
				return;
			case UML2Package.CLASS__OWNED_RECEPTION:
				getOwnedReception().clear();
				getOwnedReception().addAll((Collection<? extends Reception>)newValue);
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
			case UML2Package.CLASS__OWNED_ATTRIBUTE:
				getOwnedAttribute().clear();
				return;
			case UML2Package.CLASS__PART:
				getPart().clear();
				return;
			case UML2Package.CLASS__ROLE:
				getRole().clear();
				return;
			case UML2Package.CLASS__OWNED_CONNECTOR:
				getOwnedConnector().clear();
				return;
			case UML2Package.CLASS__OWNED_PORT:
				getOwnedPort().clear();
				return;
			case UML2Package.CLASS__OWNED_OPERATION:
				getOwnedOperation().clear();
				return;
			case UML2Package.CLASS__SUPER_CLASS:
				getSuperClass().clear();
				return;
			case UML2Package.CLASS__EXTENSION:
				getExtension().clear();
				return;
			case UML2Package.CLASS__NESTED_CLASSIFIER:
				getNestedClassifier().clear();
				return;
			case UML2Package.CLASS__IS_ACTIVE:
				setIsActive(IS_ACTIVE_EDEFAULT);
				return;
			case UML2Package.CLASS__OWNED_RECEPTION:
				getOwnedReception().clear();
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
			case UML2Package.CLASS__OWNED_ATTRIBUTE:
				return ownedAttribute != null && !ownedAttribute.isEmpty();
			case UML2Package.CLASS__PART:
				return part != null && !part.isEmpty();
			case UML2Package.CLASS__ROLE:
				return role != null && !role.isEmpty();
			case UML2Package.CLASS__OWNED_CONNECTOR:
				return ownedConnector != null && !ownedConnector.isEmpty();
			case UML2Package.CLASS__OWNED_PORT:
				return ownedPort != null && !ownedPort.isEmpty();
			case UML2Package.CLASS__OWNED_OPERATION:
				return ownedOperation != null && !ownedOperation.isEmpty();
			case UML2Package.CLASS__SUPER_CLASS:
				return superClass != null && !superClass.isEmpty();
			case UML2Package.CLASS__EXTENSION:
				return extension != null && !extension.isEmpty();
			case UML2Package.CLASS__NESTED_CLASSIFIER:
				return nestedClassifier != null && !nestedClassifier.isEmpty();
			case UML2Package.CLASS__IS_ACTIVE:
				return isActive != IS_ACTIVE_EDEFAULT;
			case UML2Package.CLASS__OWNED_RECEPTION:
				return ownedReception != null && !ownedReception.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == StructuredClassifier.class) {
			switch (derivedFeatureID) {
				case UML2Package.CLASS__OWNED_ATTRIBUTE: return UML2Package.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE;
				case UML2Package.CLASS__PART: return UML2Package.STRUCTURED_CLASSIFIER__PART;
				case UML2Package.CLASS__ROLE: return UML2Package.STRUCTURED_CLASSIFIER__ROLE;
				case UML2Package.CLASS__OWNED_CONNECTOR: return UML2Package.STRUCTURED_CLASSIFIER__OWNED_CONNECTOR;
				default: return -1;
			}
		}
		if (baseClass == EncapsulatedClassifier.class) {
			switch (derivedFeatureID) {
				case UML2Package.CLASS__OWNED_PORT: return UML2Package.ENCAPSULATED_CLASSIFIER__OWNED_PORT;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == StructuredClassifier.class) {
			switch (baseFeatureID) {
				case UML2Package.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE: return UML2Package.CLASS__OWNED_ATTRIBUTE;
				case UML2Package.STRUCTURED_CLASSIFIER__PART: return UML2Package.CLASS__PART;
				case UML2Package.STRUCTURED_CLASSIFIER__ROLE: return UML2Package.CLASS__ROLE;
				case UML2Package.STRUCTURED_CLASSIFIER__OWNED_CONNECTOR: return UML2Package.CLASS__OWNED_CONNECTOR;
				default: return -1;
			}
		}
		if (baseClass == EncapsulatedClassifier.class) {
			switch (baseFeatureID) {
				case UML2Package.ENCAPSULATED_CLASSIFIER__OWNED_PORT: return UML2Package.CLASS__OWNED_PORT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (isActive: ");
		result.append(isActive);
		result.append(')');
		return result.toString();
	}

} //ClassImpl

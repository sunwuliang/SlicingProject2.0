/**
 */
package org.csu.slicing.UML2.impl;

import java.util.Collection;

import org.csu.slicing.UML2.ConnectableElement;
import org.csu.slicing.UML2.Connector;
import org.csu.slicing.UML2.Property;
import org.csu.slicing.UML2.StructuredClassifier;
import org.csu.slicing.UML2.UML2Package;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Structured Classifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2.impl.StructuredClassifierImpl#getOwnedAttribute <em>Owned Attribute</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.StructuredClassifierImpl#getPart <em>Part</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.StructuredClassifierImpl#getRole <em>Role</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.StructuredClassifierImpl#getOwnedConnector <em>Owned Connector</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class StructuredClassifierImpl extends ClassifierImpl implements StructuredClassifier {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructuredClassifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UML2Package.eINSTANCE.getStructuredClassifier();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getOwnedAttribute() {
		if (ownedAttribute == null) {
			ownedAttribute = new EObjectContainmentEList<Property>(Property.class, this, UML2Package.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE);
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
			part = new EObjectResolvingEList<Property>(Property.class, this, UML2Package.STRUCTURED_CLASSIFIER__PART);
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
			role = new EObjectResolvingEList<ConnectableElement>(ConnectableElement.class, this, UML2Package.STRUCTURED_CLASSIFIER__ROLE);
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
			ownedConnector = new EObjectContainmentEList<Connector>(Connector.class, this, UML2Package.STRUCTURED_CLASSIFIER__OWNED_CONNECTOR);
		}
		return ownedConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UML2Package.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE:
				return ((InternalEList<?>)getOwnedAttribute()).basicRemove(otherEnd, msgs);
			case UML2Package.STRUCTURED_CLASSIFIER__OWNED_CONNECTOR:
				return ((InternalEList<?>)getOwnedConnector()).basicRemove(otherEnd, msgs);
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
			case UML2Package.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE:
				return getOwnedAttribute();
			case UML2Package.STRUCTURED_CLASSIFIER__PART:
				return getPart();
			case UML2Package.STRUCTURED_CLASSIFIER__ROLE:
				return getRole();
			case UML2Package.STRUCTURED_CLASSIFIER__OWNED_CONNECTOR:
				return getOwnedConnector();
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
			case UML2Package.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE:
				getOwnedAttribute().clear();
				getOwnedAttribute().addAll((Collection<? extends Property>)newValue);
				return;
			case UML2Package.STRUCTURED_CLASSIFIER__PART:
				getPart().clear();
				getPart().addAll((Collection<? extends Property>)newValue);
				return;
			case UML2Package.STRUCTURED_CLASSIFIER__ROLE:
				getRole().clear();
				getRole().addAll((Collection<? extends ConnectableElement>)newValue);
				return;
			case UML2Package.STRUCTURED_CLASSIFIER__OWNED_CONNECTOR:
				getOwnedConnector().clear();
				getOwnedConnector().addAll((Collection<? extends Connector>)newValue);
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
			case UML2Package.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE:
				getOwnedAttribute().clear();
				return;
			case UML2Package.STRUCTURED_CLASSIFIER__PART:
				getPart().clear();
				return;
			case UML2Package.STRUCTURED_CLASSIFIER__ROLE:
				getRole().clear();
				return;
			case UML2Package.STRUCTURED_CLASSIFIER__OWNED_CONNECTOR:
				getOwnedConnector().clear();
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
			case UML2Package.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE:
				return ownedAttribute != null && !ownedAttribute.isEmpty();
			case UML2Package.STRUCTURED_CLASSIFIER__PART:
				return part != null && !part.isEmpty();
			case UML2Package.STRUCTURED_CLASSIFIER__ROLE:
				return role != null && !role.isEmpty();
			case UML2Package.STRUCTURED_CLASSIFIER__OWNED_CONNECTOR:
				return ownedConnector != null && !ownedConnector.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StructuredClassifierImpl

/**
 */
package org.csu.slicing.UML2WithID.impl;

import java.util.Collection;

import org.csu.slicing.UML2WithID.Collaboration;
import org.csu.slicing.UML2WithID.ConnectableElement;
import org.csu.slicing.UML2WithID.Connector;
import org.csu.slicing.UML2WithID.Property;
import org.csu.slicing.UML2WithID.StructuredClassifier;
import org.csu.slicing.UML2WithID.UML2WithIDPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Collaboration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.CollaborationImpl#getOwnedAttribute <em>Owned Attribute</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.CollaborationImpl#getPart <em>Part</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.CollaborationImpl#getRole <em>Role</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.CollaborationImpl#getOwnedConnector <em>Owned Connector</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.CollaborationImpl#getCollaborationRole <em>Collaboration Role</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CollaborationImpl extends BehavioredClassifierImpl implements Collaboration {
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
	 * The cached value of the '{@link #getCollaborationRole() <em>Collaboration Role</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollaborationRole()
	 * @generated
	 * @ordered
	 */
	protected EList<ConnectableElement> collaborationRole;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CollaborationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UML2WithIDPackage.eINSTANCE.getCollaboration();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getOwnedAttribute() {
		if (ownedAttribute == null) {
			ownedAttribute = new EObjectContainmentEList<Property>(Property.class, this, UML2WithIDPackage.COLLABORATION__OWNED_ATTRIBUTE);
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
			part = new EObjectResolvingEList<Property>(Property.class, this, UML2WithIDPackage.COLLABORATION__PART);
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
			role = new EObjectResolvingEList<ConnectableElement>(ConnectableElement.class, this, UML2WithIDPackage.COLLABORATION__ROLE);
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
			ownedConnector = new EObjectContainmentEList<Connector>(Connector.class, this, UML2WithIDPackage.COLLABORATION__OWNED_CONNECTOR);
		}
		return ownedConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConnectableElement> getCollaborationRole() {
		if (collaborationRole == null) {
			collaborationRole = new EObjectResolvingEList<ConnectableElement>(ConnectableElement.class, this, UML2WithIDPackage.COLLABORATION__COLLABORATION_ROLE);
		}
		return collaborationRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UML2WithIDPackage.COLLABORATION__OWNED_ATTRIBUTE:
				return ((InternalEList<?>)getOwnedAttribute()).basicRemove(otherEnd, msgs);
			case UML2WithIDPackage.COLLABORATION__OWNED_CONNECTOR:
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
			case UML2WithIDPackage.COLLABORATION__OWNED_ATTRIBUTE:
				return getOwnedAttribute();
			case UML2WithIDPackage.COLLABORATION__PART:
				return getPart();
			case UML2WithIDPackage.COLLABORATION__ROLE:
				return getRole();
			case UML2WithIDPackage.COLLABORATION__OWNED_CONNECTOR:
				return getOwnedConnector();
			case UML2WithIDPackage.COLLABORATION__COLLABORATION_ROLE:
				return getCollaborationRole();
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
			case UML2WithIDPackage.COLLABORATION__OWNED_ATTRIBUTE:
				getOwnedAttribute().clear();
				getOwnedAttribute().addAll((Collection<? extends Property>)newValue);
				return;
			case UML2WithIDPackage.COLLABORATION__PART:
				getPart().clear();
				getPart().addAll((Collection<? extends Property>)newValue);
				return;
			case UML2WithIDPackage.COLLABORATION__ROLE:
				getRole().clear();
				getRole().addAll((Collection<? extends ConnectableElement>)newValue);
				return;
			case UML2WithIDPackage.COLLABORATION__OWNED_CONNECTOR:
				getOwnedConnector().clear();
				getOwnedConnector().addAll((Collection<? extends Connector>)newValue);
				return;
			case UML2WithIDPackage.COLLABORATION__COLLABORATION_ROLE:
				getCollaborationRole().clear();
				getCollaborationRole().addAll((Collection<? extends ConnectableElement>)newValue);
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
			case UML2WithIDPackage.COLLABORATION__OWNED_ATTRIBUTE:
				getOwnedAttribute().clear();
				return;
			case UML2WithIDPackage.COLLABORATION__PART:
				getPart().clear();
				return;
			case UML2WithIDPackage.COLLABORATION__ROLE:
				getRole().clear();
				return;
			case UML2WithIDPackage.COLLABORATION__OWNED_CONNECTOR:
				getOwnedConnector().clear();
				return;
			case UML2WithIDPackage.COLLABORATION__COLLABORATION_ROLE:
				getCollaborationRole().clear();
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
			case UML2WithIDPackage.COLLABORATION__OWNED_ATTRIBUTE:
				return ownedAttribute != null && !ownedAttribute.isEmpty();
			case UML2WithIDPackage.COLLABORATION__PART:
				return part != null && !part.isEmpty();
			case UML2WithIDPackage.COLLABORATION__ROLE:
				return role != null && !role.isEmpty();
			case UML2WithIDPackage.COLLABORATION__OWNED_CONNECTOR:
				return ownedConnector != null && !ownedConnector.isEmpty();
			case UML2WithIDPackage.COLLABORATION__COLLABORATION_ROLE:
				return collaborationRole != null && !collaborationRole.isEmpty();
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
				case UML2WithIDPackage.COLLABORATION__OWNED_ATTRIBUTE: return UML2WithIDPackage.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE;
				case UML2WithIDPackage.COLLABORATION__PART: return UML2WithIDPackage.STRUCTURED_CLASSIFIER__PART;
				case UML2WithIDPackage.COLLABORATION__ROLE: return UML2WithIDPackage.STRUCTURED_CLASSIFIER__ROLE;
				case UML2WithIDPackage.COLLABORATION__OWNED_CONNECTOR: return UML2WithIDPackage.STRUCTURED_CLASSIFIER__OWNED_CONNECTOR;
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
				case UML2WithIDPackage.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE: return UML2WithIDPackage.COLLABORATION__OWNED_ATTRIBUTE;
				case UML2WithIDPackage.STRUCTURED_CLASSIFIER__PART: return UML2WithIDPackage.COLLABORATION__PART;
				case UML2WithIDPackage.STRUCTURED_CLASSIFIER__ROLE: return UML2WithIDPackage.COLLABORATION__ROLE;
				case UML2WithIDPackage.STRUCTURED_CLASSIFIER__OWNED_CONNECTOR: return UML2WithIDPackage.COLLABORATION__OWNED_CONNECTOR;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //CollaborationImpl

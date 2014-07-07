/**
 */
package org.csu.slicing.UML2WithID.impl;

import java.util.Collection;

import org.csu.slicing.UML2WithID.Collaboration;
import org.csu.slicing.UML2WithID.CollaborationOccurrence;
import org.csu.slicing.UML2WithID.Dependency;
import org.csu.slicing.UML2WithID.UML2WithIDPackage;

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
 * An implementation of the model object '<em><b>Collaboration Occurrence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.CollaborationOccurrenceImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.CollaborationOccurrenceImpl#getRoleBinding <em>Role Binding</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CollaborationOccurrenceImpl extends NamedElementImpl implements CollaborationOccurrence {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Collaboration type;

	/**
	 * The cached value of the '{@link #getRoleBinding() <em>Role Binding</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleBinding()
	 * @generated
	 * @ordered
	 */
	protected EList<Dependency> roleBinding;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CollaborationOccurrenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UML2WithIDPackage.eINSTANCE.getCollaborationOccurrence();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collaboration getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (Collaboration)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2WithIDPackage.COLLABORATION_OCCURRENCE__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collaboration basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Collaboration newType) {
		Collaboration oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2WithIDPackage.COLLABORATION_OCCURRENCE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Dependency> getRoleBinding() {
		if (roleBinding == null) {
			roleBinding = new EObjectContainmentEList<Dependency>(Dependency.class, this, UML2WithIDPackage.COLLABORATION_OCCURRENCE__ROLE_BINDING);
		}
		return roleBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UML2WithIDPackage.COLLABORATION_OCCURRENCE__ROLE_BINDING:
				return ((InternalEList<?>)getRoleBinding()).basicRemove(otherEnd, msgs);
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
			case UML2WithIDPackage.COLLABORATION_OCCURRENCE__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case UML2WithIDPackage.COLLABORATION_OCCURRENCE__ROLE_BINDING:
				return getRoleBinding();
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
			case UML2WithIDPackage.COLLABORATION_OCCURRENCE__TYPE:
				setType((Collaboration)newValue);
				return;
			case UML2WithIDPackage.COLLABORATION_OCCURRENCE__ROLE_BINDING:
				getRoleBinding().clear();
				getRoleBinding().addAll((Collection<? extends Dependency>)newValue);
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
			case UML2WithIDPackage.COLLABORATION_OCCURRENCE__TYPE:
				setType((Collaboration)null);
				return;
			case UML2WithIDPackage.COLLABORATION_OCCURRENCE__ROLE_BINDING:
				getRoleBinding().clear();
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
			case UML2WithIDPackage.COLLABORATION_OCCURRENCE__TYPE:
				return type != null;
			case UML2WithIDPackage.COLLABORATION_OCCURRENCE__ROLE_BINDING:
				return roleBinding != null && !roleBinding.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CollaborationOccurrenceImpl

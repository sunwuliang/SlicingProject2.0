/**
 */
package org.csu.slicing.UML2.impl;

import java.util.Collection;

import org.csu.slicing.UML2.Component;
import org.csu.slicing.UML2.Interface;
import org.csu.slicing.UML2.PackageableElement;
import org.csu.slicing.UML2.Realization;
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
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2.impl.ComponentImpl#isIsIndirectlyInstantiated <em>Is Indirectly Instantiated</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.ComponentImpl#getRequired <em>Required</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.ComponentImpl#getProvided <em>Provided</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.ComponentImpl#getRealization <em>Realization</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.ComponentImpl#getOwnedMember <em>Owned Member</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComponentImpl extends ClassImpl implements Component {
	/**
	 * The default value of the '{@link #isIsIndirectlyInstantiated() <em>Is Indirectly Instantiated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsIndirectlyInstantiated()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_INDIRECTLY_INSTANTIATED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsIndirectlyInstantiated() <em>Is Indirectly Instantiated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsIndirectlyInstantiated()
	 * @generated
	 * @ordered
	 */
	protected boolean isIndirectlyInstantiated = IS_INDIRECTLY_INSTANTIATED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRequired() <em>Required</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequired()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface> required;

	/**
	 * The cached value of the '{@link #getProvided() <em>Provided</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvided()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface> provided;

	/**
	 * The cached value of the '{@link #getRealization() <em>Realization</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealization()
	 * @generated
	 * @ordered
	 */
	protected EList<Realization> realization;

	/**
	 * The cached value of the '{@link #getOwnedMember() <em>Owned Member</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedMember()
	 * @generated
	 * @ordered
	 */
	protected EList<PackageableElement> ownedMember;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UML2Package.eINSTANCE.getComponent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsIndirectlyInstantiated() {
		return isIndirectlyInstantiated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsIndirectlyInstantiated(boolean newIsIndirectlyInstantiated) {
		boolean oldIsIndirectlyInstantiated = isIndirectlyInstantiated;
		isIndirectlyInstantiated = newIsIndirectlyInstantiated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.COMPONENT__IS_INDIRECTLY_INSTANTIATED, oldIsIndirectlyInstantiated, isIndirectlyInstantiated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> getRequired() {
		if (required == null) {
			required = new EObjectResolvingEList<Interface>(Interface.class, this, UML2Package.COMPONENT__REQUIRED);
		}
		return required;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> getProvided() {
		if (provided == null) {
			provided = new EObjectResolvingEList<Interface>(Interface.class, this, UML2Package.COMPONENT__PROVIDED);
		}
		return provided;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Realization> getRealization() {
		if (realization == null) {
			realization = new EObjectContainmentWithInverseEList<Realization>(Realization.class, this, UML2Package.COMPONENT__REALIZATION, UML2Package.REALIZATION__ABSTRACTION);
		}
		return realization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PackageableElement> getOwnedMember() {
		if (ownedMember == null) {
			ownedMember = new EObjectContainmentEList<PackageableElement>(PackageableElement.class, this, UML2Package.COMPONENT__OWNED_MEMBER);
		}
		return ownedMember;
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
			case UML2Package.COMPONENT__REALIZATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRealization()).basicAdd(otherEnd, msgs);
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
			case UML2Package.COMPONENT__REALIZATION:
				return ((InternalEList<?>)getRealization()).basicRemove(otherEnd, msgs);
			case UML2Package.COMPONENT__OWNED_MEMBER:
				return ((InternalEList<?>)getOwnedMember()).basicRemove(otherEnd, msgs);
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
			case UML2Package.COMPONENT__IS_INDIRECTLY_INSTANTIATED:
				return isIsIndirectlyInstantiated();
			case UML2Package.COMPONENT__REQUIRED:
				return getRequired();
			case UML2Package.COMPONENT__PROVIDED:
				return getProvided();
			case UML2Package.COMPONENT__REALIZATION:
				return getRealization();
			case UML2Package.COMPONENT__OWNED_MEMBER:
				return getOwnedMember();
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
			case UML2Package.COMPONENT__IS_INDIRECTLY_INSTANTIATED:
				setIsIndirectlyInstantiated((Boolean)newValue);
				return;
			case UML2Package.COMPONENT__REQUIRED:
				getRequired().clear();
				getRequired().addAll((Collection<? extends Interface>)newValue);
				return;
			case UML2Package.COMPONENT__PROVIDED:
				getProvided().clear();
				getProvided().addAll((Collection<? extends Interface>)newValue);
				return;
			case UML2Package.COMPONENT__REALIZATION:
				getRealization().clear();
				getRealization().addAll((Collection<? extends Realization>)newValue);
				return;
			case UML2Package.COMPONENT__OWNED_MEMBER:
				getOwnedMember().clear();
				getOwnedMember().addAll((Collection<? extends PackageableElement>)newValue);
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
			case UML2Package.COMPONENT__IS_INDIRECTLY_INSTANTIATED:
				setIsIndirectlyInstantiated(IS_INDIRECTLY_INSTANTIATED_EDEFAULT);
				return;
			case UML2Package.COMPONENT__REQUIRED:
				getRequired().clear();
				return;
			case UML2Package.COMPONENT__PROVIDED:
				getProvided().clear();
				return;
			case UML2Package.COMPONENT__REALIZATION:
				getRealization().clear();
				return;
			case UML2Package.COMPONENT__OWNED_MEMBER:
				getOwnedMember().clear();
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
			case UML2Package.COMPONENT__IS_INDIRECTLY_INSTANTIATED:
				return isIndirectlyInstantiated != IS_INDIRECTLY_INSTANTIATED_EDEFAULT;
			case UML2Package.COMPONENT__REQUIRED:
				return required != null && !required.isEmpty();
			case UML2Package.COMPONENT__PROVIDED:
				return provided != null && !provided.isEmpty();
			case UML2Package.COMPONENT__REALIZATION:
				return realization != null && !realization.isEmpty();
			case UML2Package.COMPONENT__OWNED_MEMBER:
				return ownedMember != null && !ownedMember.isEmpty();
		}
		return super.eIsSet(featureID);
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
		result.append(" (isIndirectlyInstantiated: ");
		result.append(isIndirectlyInstantiated);
		result.append(')');
		return result.toString();
	}

} //ComponentImpl

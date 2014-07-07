/**
 */
package org.csu.slicing.UML2WithID.impl;

import java.util.Collection;

import org.csu.slicing.UML2WithID.Association;
import org.csu.slicing.UML2WithID.Element;
import org.csu.slicing.UML2WithID.Property;
import org.csu.slicing.UML2WithID.Relationship;
import org.csu.slicing.UML2WithID.Type;
import org.csu.slicing.UML2WithID.UML2WithIDPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.AssociationImpl#getRelatedElement <em>Related Element</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.AssociationImpl#isIsDerived <em>Is Derived</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.AssociationImpl#getOwnedEnd <em>Owned End</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.AssociationImpl#getEndType <em>End Type</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.AssociationImpl#getMemberEnd <em>Member End</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssociationImpl extends ClassifierImpl implements Association {
	/**
	 * The cached value of the '{@link #getRelatedElement() <em>Related Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedElement()
	 * @generated
	 * @ordered
	 */
	protected EList<Element> relatedElement;

	/**
	 * The default value of the '{@link #isIsDerived() <em>Is Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDerived()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DERIVED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsDerived() <em>Is Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDerived()
	 * @generated
	 * @ordered
	 */
	protected boolean isDerived = IS_DERIVED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwnedEnd() <em>Owned End</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedEnd()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> ownedEnd;

	/**
	 * The cached value of the '{@link #getEndType() <em>End Type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndType()
	 * @generated
	 * @ordered
	 */
	protected EList<Type> endType;

	/**
	 * The cached value of the '{@link #getMemberEnd() <em>Member End</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemberEnd()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> memberEnd;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssociationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UML2WithIDPackage.eINSTANCE.getAssociation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getRelatedElement() {
		if (relatedElement == null) {
			relatedElement = new EObjectResolvingEList<Element>(Element.class, this, UML2WithIDPackage.ASSOCIATION__RELATED_ELEMENT);
		}
		return relatedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsDerived() {
		return isDerived;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDerived(boolean newIsDerived) {
		boolean oldIsDerived = isDerived;
		isDerived = newIsDerived;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2WithIDPackage.ASSOCIATION__IS_DERIVED, oldIsDerived, isDerived));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getOwnedEnd() {
		if (ownedEnd == null) {
			ownedEnd = new EObjectContainmentWithInverseEList<Property>(Property.class, this, UML2WithIDPackage.ASSOCIATION__OWNED_END, UML2WithIDPackage.PROPERTY__OWNING_ASSOCIATION);
		}
		return ownedEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Type> getEndType() {
		if (endType == null) {
			endType = new EObjectResolvingEList<Type>(Type.class, this, UML2WithIDPackage.ASSOCIATION__END_TYPE);
		}
		return endType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getMemberEnd() {
		if (memberEnd == null) {
			memberEnd = new EObjectWithInverseResolvingEList<Property>(Property.class, this, UML2WithIDPackage.ASSOCIATION__MEMBER_END, UML2WithIDPackage.PROPERTY__ASSOCIATION);
		}
		return memberEnd;
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
			case UML2WithIDPackage.ASSOCIATION__OWNED_END:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedEnd()).basicAdd(otherEnd, msgs);
			case UML2WithIDPackage.ASSOCIATION__MEMBER_END:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMemberEnd()).basicAdd(otherEnd, msgs);
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
			case UML2WithIDPackage.ASSOCIATION__OWNED_END:
				return ((InternalEList<?>)getOwnedEnd()).basicRemove(otherEnd, msgs);
			case UML2WithIDPackage.ASSOCIATION__MEMBER_END:
				return ((InternalEList<?>)getMemberEnd()).basicRemove(otherEnd, msgs);
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
			case UML2WithIDPackage.ASSOCIATION__RELATED_ELEMENT:
				return getRelatedElement();
			case UML2WithIDPackage.ASSOCIATION__IS_DERIVED:
				return isIsDerived();
			case UML2WithIDPackage.ASSOCIATION__OWNED_END:
				return getOwnedEnd();
			case UML2WithIDPackage.ASSOCIATION__END_TYPE:
				return getEndType();
			case UML2WithIDPackage.ASSOCIATION__MEMBER_END:
				return getMemberEnd();
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
			case UML2WithIDPackage.ASSOCIATION__RELATED_ELEMENT:
				getRelatedElement().clear();
				getRelatedElement().addAll((Collection<? extends Element>)newValue);
				return;
			case UML2WithIDPackage.ASSOCIATION__IS_DERIVED:
				setIsDerived((Boolean)newValue);
				return;
			case UML2WithIDPackage.ASSOCIATION__OWNED_END:
				getOwnedEnd().clear();
				getOwnedEnd().addAll((Collection<? extends Property>)newValue);
				return;
			case UML2WithIDPackage.ASSOCIATION__END_TYPE:
				getEndType().clear();
				getEndType().addAll((Collection<? extends Type>)newValue);
				return;
			case UML2WithIDPackage.ASSOCIATION__MEMBER_END:
				getMemberEnd().clear();
				getMemberEnd().addAll((Collection<? extends Property>)newValue);
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
			case UML2WithIDPackage.ASSOCIATION__RELATED_ELEMENT:
				getRelatedElement().clear();
				return;
			case UML2WithIDPackage.ASSOCIATION__IS_DERIVED:
				setIsDerived(IS_DERIVED_EDEFAULT);
				return;
			case UML2WithIDPackage.ASSOCIATION__OWNED_END:
				getOwnedEnd().clear();
				return;
			case UML2WithIDPackage.ASSOCIATION__END_TYPE:
				getEndType().clear();
				return;
			case UML2WithIDPackage.ASSOCIATION__MEMBER_END:
				getMemberEnd().clear();
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
			case UML2WithIDPackage.ASSOCIATION__RELATED_ELEMENT:
				return relatedElement != null && !relatedElement.isEmpty();
			case UML2WithIDPackage.ASSOCIATION__IS_DERIVED:
				return isDerived != IS_DERIVED_EDEFAULT;
			case UML2WithIDPackage.ASSOCIATION__OWNED_END:
				return ownedEnd != null && !ownedEnd.isEmpty();
			case UML2WithIDPackage.ASSOCIATION__END_TYPE:
				return endType != null && !endType.isEmpty();
			case UML2WithIDPackage.ASSOCIATION__MEMBER_END:
				return memberEnd != null && !memberEnd.isEmpty();
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
		if (baseClass == Relationship.class) {
			switch (derivedFeatureID) {
				case UML2WithIDPackage.ASSOCIATION__RELATED_ELEMENT: return UML2WithIDPackage.RELATIONSHIP__RELATED_ELEMENT;
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
		if (baseClass == Relationship.class) {
			switch (baseFeatureID) {
				case UML2WithIDPackage.RELATIONSHIP__RELATED_ELEMENT: return UML2WithIDPackage.ASSOCIATION__RELATED_ELEMENT;
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
		result.append(" (isDerived: ");
		result.append(isDerived);
		result.append(')');
		return result.toString();
	}

} //AssociationImpl

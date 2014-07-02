/**
 */
package org.csu.slicing.UML2.impl;

import java.util.Collection;

import org.csu.slicing.UML2.Association;
import org.csu.slicing.UML2.AssociationClass;
import org.csu.slicing.UML2.Element;
import org.csu.slicing.UML2.Property;
import org.csu.slicing.UML2.Relationship;
import org.csu.slicing.UML2.Type;
import org.csu.slicing.UML2.UML2Package;

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
 * An implementation of the model object '<em><b>Association Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2.impl.AssociationClassImpl#getRelatedElement <em>Related Element</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.AssociationClassImpl#isIsDerived <em>Is Derived</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.AssociationClassImpl#getOwnedEnd <em>Owned End</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.AssociationClassImpl#getEndType <em>End Type</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.AssociationClassImpl#getMemberEnd <em>Member End</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssociationClassImpl extends ClassImpl implements AssociationClass {
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
	protected AssociationClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UML2Package.eINSTANCE.getAssociationClass();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getRelatedElement() {
		if (relatedElement == null) {
			relatedElement = new EObjectResolvingEList<Element>(Element.class, this, UML2Package.ASSOCIATION_CLASS__RELATED_ELEMENT);
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
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.ASSOCIATION_CLASS__IS_DERIVED, oldIsDerived, isDerived));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getOwnedEnd() {
		if (ownedEnd == null) {
			ownedEnd = new EObjectContainmentWithInverseEList<Property>(Property.class, this, UML2Package.ASSOCIATION_CLASS__OWNED_END, UML2Package.PROPERTY__OWNING_ASSOCIATION);
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
			endType = new EObjectResolvingEList<Type>(Type.class, this, UML2Package.ASSOCIATION_CLASS__END_TYPE);
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
			memberEnd = new EObjectWithInverseResolvingEList<Property>(Property.class, this, UML2Package.ASSOCIATION_CLASS__MEMBER_END, UML2Package.PROPERTY__ASSOCIATION);
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
			case UML2Package.ASSOCIATION_CLASS__OWNED_END:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedEnd()).basicAdd(otherEnd, msgs);
			case UML2Package.ASSOCIATION_CLASS__MEMBER_END:
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
			case UML2Package.ASSOCIATION_CLASS__OWNED_END:
				return ((InternalEList<?>)getOwnedEnd()).basicRemove(otherEnd, msgs);
			case UML2Package.ASSOCIATION_CLASS__MEMBER_END:
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
			case UML2Package.ASSOCIATION_CLASS__RELATED_ELEMENT:
				return getRelatedElement();
			case UML2Package.ASSOCIATION_CLASS__IS_DERIVED:
				return isIsDerived();
			case UML2Package.ASSOCIATION_CLASS__OWNED_END:
				return getOwnedEnd();
			case UML2Package.ASSOCIATION_CLASS__END_TYPE:
				return getEndType();
			case UML2Package.ASSOCIATION_CLASS__MEMBER_END:
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
			case UML2Package.ASSOCIATION_CLASS__RELATED_ELEMENT:
				getRelatedElement().clear();
				getRelatedElement().addAll((Collection<? extends Element>)newValue);
				return;
			case UML2Package.ASSOCIATION_CLASS__IS_DERIVED:
				setIsDerived((Boolean)newValue);
				return;
			case UML2Package.ASSOCIATION_CLASS__OWNED_END:
				getOwnedEnd().clear();
				getOwnedEnd().addAll((Collection<? extends Property>)newValue);
				return;
			case UML2Package.ASSOCIATION_CLASS__END_TYPE:
				getEndType().clear();
				getEndType().addAll((Collection<? extends Type>)newValue);
				return;
			case UML2Package.ASSOCIATION_CLASS__MEMBER_END:
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
			case UML2Package.ASSOCIATION_CLASS__RELATED_ELEMENT:
				getRelatedElement().clear();
				return;
			case UML2Package.ASSOCIATION_CLASS__IS_DERIVED:
				setIsDerived(IS_DERIVED_EDEFAULT);
				return;
			case UML2Package.ASSOCIATION_CLASS__OWNED_END:
				getOwnedEnd().clear();
				return;
			case UML2Package.ASSOCIATION_CLASS__END_TYPE:
				getEndType().clear();
				return;
			case UML2Package.ASSOCIATION_CLASS__MEMBER_END:
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
			case UML2Package.ASSOCIATION_CLASS__RELATED_ELEMENT:
				return relatedElement != null && !relatedElement.isEmpty();
			case UML2Package.ASSOCIATION_CLASS__IS_DERIVED:
				return isDerived != IS_DERIVED_EDEFAULT;
			case UML2Package.ASSOCIATION_CLASS__OWNED_END:
				return ownedEnd != null && !ownedEnd.isEmpty();
			case UML2Package.ASSOCIATION_CLASS__END_TYPE:
				return endType != null && !endType.isEmpty();
			case UML2Package.ASSOCIATION_CLASS__MEMBER_END:
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
				case UML2Package.ASSOCIATION_CLASS__RELATED_ELEMENT: return UML2Package.RELATIONSHIP__RELATED_ELEMENT;
				default: return -1;
			}
		}
		if (baseClass == Association.class) {
			switch (derivedFeatureID) {
				case UML2Package.ASSOCIATION_CLASS__IS_DERIVED: return UML2Package.ASSOCIATION__IS_DERIVED;
				case UML2Package.ASSOCIATION_CLASS__OWNED_END: return UML2Package.ASSOCIATION__OWNED_END;
				case UML2Package.ASSOCIATION_CLASS__END_TYPE: return UML2Package.ASSOCIATION__END_TYPE;
				case UML2Package.ASSOCIATION_CLASS__MEMBER_END: return UML2Package.ASSOCIATION__MEMBER_END;
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
				case UML2Package.RELATIONSHIP__RELATED_ELEMENT: return UML2Package.ASSOCIATION_CLASS__RELATED_ELEMENT;
				default: return -1;
			}
		}
		if (baseClass == Association.class) {
			switch (baseFeatureID) {
				case UML2Package.ASSOCIATION__IS_DERIVED: return UML2Package.ASSOCIATION_CLASS__IS_DERIVED;
				case UML2Package.ASSOCIATION__OWNED_END: return UML2Package.ASSOCIATION_CLASS__OWNED_END;
				case UML2Package.ASSOCIATION__END_TYPE: return UML2Package.ASSOCIATION_CLASS__END_TYPE;
				case UML2Package.ASSOCIATION__MEMBER_END: return UML2Package.ASSOCIATION_CLASS__MEMBER_END;
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

} //AssociationClassImpl

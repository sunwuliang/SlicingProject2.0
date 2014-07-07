/**
 */
package org.csu.slicing.UML2WithID.impl;

import java.util.Collection;

import org.csu.slicing.UML2WithID.DirectedRelationship;
import org.csu.slicing.UML2WithID.Element;
import org.csu.slicing.UML2WithID.Include;
import org.csu.slicing.UML2WithID.Relationship;
import org.csu.slicing.UML2WithID.UML2WithIDPackage;
import org.csu.slicing.UML2WithID.UseCase;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Include</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.IncludeImpl#getRelatedElement <em>Related Element</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.IncludeImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.IncludeImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.IncludeImpl#getIncludingCase <em>Including Case</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.IncludeImpl#getAddition <em>Addition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IncludeImpl extends NamedElementImpl implements Include {
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
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected EList<Element> source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected EList<Element> target;

	/**
	 * The cached value of the '{@link #getAddition() <em>Addition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddition()
	 * @generated
	 * @ordered
	 */
	protected UseCase addition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IncludeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UML2WithIDPackage.eINSTANCE.getInclude();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getRelatedElement() {
		if (relatedElement == null) {
			relatedElement = new EObjectResolvingEList<Element>(Element.class, this, UML2WithIDPackage.INCLUDE__RELATED_ELEMENT);
		}
		return relatedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getSource() {
		if (source == null) {
			source = new EObjectResolvingEList<Element>(Element.class, this, UML2WithIDPackage.INCLUDE__SOURCE);
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getTarget() {
		if (target == null) {
			target = new EObjectResolvingEList<Element>(Element.class, this, UML2WithIDPackage.INCLUDE__TARGET);
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCase getIncludingCase() {
		if (eContainerFeatureID() != UML2WithIDPackage.INCLUDE__INCLUDING_CASE) return null;
		return (UseCase)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIncludingCase(UseCase newIncludingCase, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newIncludingCase, UML2WithIDPackage.INCLUDE__INCLUDING_CASE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncludingCase(UseCase newIncludingCase) {
		if (newIncludingCase != eInternalContainer() || (eContainerFeatureID() != UML2WithIDPackage.INCLUDE__INCLUDING_CASE && newIncludingCase != null)) {
			if (EcoreUtil.isAncestor(this, newIncludingCase))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newIncludingCase != null)
				msgs = ((InternalEObject)newIncludingCase).eInverseAdd(this, UML2WithIDPackage.USE_CASE__INCLUDE, UseCase.class, msgs);
			msgs = basicSetIncludingCase(newIncludingCase, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2WithIDPackage.INCLUDE__INCLUDING_CASE, newIncludingCase, newIncludingCase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCase getAddition() {
		if (addition != null && addition.eIsProxy()) {
			InternalEObject oldAddition = (InternalEObject)addition;
			addition = (UseCase)eResolveProxy(oldAddition);
			if (addition != oldAddition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2WithIDPackage.INCLUDE__ADDITION, oldAddition, addition));
			}
		}
		return addition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCase basicGetAddition() {
		return addition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddition(UseCase newAddition) {
		UseCase oldAddition = addition;
		addition = newAddition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2WithIDPackage.INCLUDE__ADDITION, oldAddition, addition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UML2WithIDPackage.INCLUDE__INCLUDING_CASE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetIncludingCase((UseCase)otherEnd, msgs);
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
			case UML2WithIDPackage.INCLUDE__INCLUDING_CASE:
				return basicSetIncludingCase(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case UML2WithIDPackage.INCLUDE__INCLUDING_CASE:
				return eInternalContainer().eInverseRemove(this, UML2WithIDPackage.USE_CASE__INCLUDE, UseCase.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UML2WithIDPackage.INCLUDE__RELATED_ELEMENT:
				return getRelatedElement();
			case UML2WithIDPackage.INCLUDE__SOURCE:
				return getSource();
			case UML2WithIDPackage.INCLUDE__TARGET:
				return getTarget();
			case UML2WithIDPackage.INCLUDE__INCLUDING_CASE:
				return getIncludingCase();
			case UML2WithIDPackage.INCLUDE__ADDITION:
				if (resolve) return getAddition();
				return basicGetAddition();
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
			case UML2WithIDPackage.INCLUDE__RELATED_ELEMENT:
				getRelatedElement().clear();
				getRelatedElement().addAll((Collection<? extends Element>)newValue);
				return;
			case UML2WithIDPackage.INCLUDE__SOURCE:
				getSource().clear();
				getSource().addAll((Collection<? extends Element>)newValue);
				return;
			case UML2WithIDPackage.INCLUDE__TARGET:
				getTarget().clear();
				getTarget().addAll((Collection<? extends Element>)newValue);
				return;
			case UML2WithIDPackage.INCLUDE__INCLUDING_CASE:
				setIncludingCase((UseCase)newValue);
				return;
			case UML2WithIDPackage.INCLUDE__ADDITION:
				setAddition((UseCase)newValue);
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
			case UML2WithIDPackage.INCLUDE__RELATED_ELEMENT:
				getRelatedElement().clear();
				return;
			case UML2WithIDPackage.INCLUDE__SOURCE:
				getSource().clear();
				return;
			case UML2WithIDPackage.INCLUDE__TARGET:
				getTarget().clear();
				return;
			case UML2WithIDPackage.INCLUDE__INCLUDING_CASE:
				setIncludingCase((UseCase)null);
				return;
			case UML2WithIDPackage.INCLUDE__ADDITION:
				setAddition((UseCase)null);
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
			case UML2WithIDPackage.INCLUDE__RELATED_ELEMENT:
				return relatedElement != null && !relatedElement.isEmpty();
			case UML2WithIDPackage.INCLUDE__SOURCE:
				return source != null && !source.isEmpty();
			case UML2WithIDPackage.INCLUDE__TARGET:
				return target != null && !target.isEmpty();
			case UML2WithIDPackage.INCLUDE__INCLUDING_CASE:
				return getIncludingCase() != null;
			case UML2WithIDPackage.INCLUDE__ADDITION:
				return addition != null;
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
				case UML2WithIDPackage.INCLUDE__RELATED_ELEMENT: return UML2WithIDPackage.RELATIONSHIP__RELATED_ELEMENT;
				default: return -1;
			}
		}
		if (baseClass == DirectedRelationship.class) {
			switch (derivedFeatureID) {
				case UML2WithIDPackage.INCLUDE__SOURCE: return UML2WithIDPackage.DIRECTED_RELATIONSHIP__SOURCE;
				case UML2WithIDPackage.INCLUDE__TARGET: return UML2WithIDPackage.DIRECTED_RELATIONSHIP__TARGET;
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
				case UML2WithIDPackage.RELATIONSHIP__RELATED_ELEMENT: return UML2WithIDPackage.INCLUDE__RELATED_ELEMENT;
				default: return -1;
			}
		}
		if (baseClass == DirectedRelationship.class) {
			switch (baseFeatureID) {
				case UML2WithIDPackage.DIRECTED_RELATIONSHIP__SOURCE: return UML2WithIDPackage.INCLUDE__SOURCE;
				case UML2WithIDPackage.DIRECTED_RELATIONSHIP__TARGET: return UML2WithIDPackage.INCLUDE__TARGET;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //IncludeImpl

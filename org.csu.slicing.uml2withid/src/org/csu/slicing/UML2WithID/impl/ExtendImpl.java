/**
 */
package org.csu.slicing.UML2WithID.impl;

import java.util.Collection;

import org.csu.slicing.UML2WithID.Constraint;
import org.csu.slicing.UML2WithID.DirectedRelationship;
import org.csu.slicing.UML2WithID.Element;
import org.csu.slicing.UML2WithID.Extend;
import org.csu.slicing.UML2WithID.ExtensionPoint;
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
 * An implementation of the model object '<em><b>Extend</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.ExtendImpl#getRelatedElement <em>Related Element</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.ExtendImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.ExtendImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.ExtendImpl#getExtendedCase <em>Extended Case</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.ExtendImpl#getExtension <em>Extension</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.ExtendImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.ExtendImpl#getExtensionLocation <em>Extension Location</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExtendImpl extends NamedElementImpl implements Extend {
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
	 * The cached value of the '{@link #getExtendedCase() <em>Extended Case</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendedCase()
	 * @generated
	 * @ordered
	 */
	protected UseCase extendedCase;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected Constraint condition;

	/**
	 * The cached value of the '{@link #getExtensionLocation() <em>Extension Location</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensionLocation()
	 * @generated
	 * @ordered
	 */
	protected EList<ExtensionPoint> extensionLocation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtendImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UML2WithIDPackage.eINSTANCE.getExtend();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getRelatedElement() {
		if (relatedElement == null) {
			relatedElement = new EObjectResolvingEList<Element>(Element.class, this, UML2WithIDPackage.EXTEND__RELATED_ELEMENT);
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
			source = new EObjectResolvingEList<Element>(Element.class, this, UML2WithIDPackage.EXTEND__SOURCE);
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
			target = new EObjectResolvingEList<Element>(Element.class, this, UML2WithIDPackage.EXTEND__TARGET);
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCase getExtendedCase() {
		if (extendedCase != null && extendedCase.eIsProxy()) {
			InternalEObject oldExtendedCase = (InternalEObject)extendedCase;
			extendedCase = (UseCase)eResolveProxy(oldExtendedCase);
			if (extendedCase != oldExtendedCase) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2WithIDPackage.EXTEND__EXTENDED_CASE, oldExtendedCase, extendedCase));
			}
		}
		return extendedCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCase basicGetExtendedCase() {
		return extendedCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtendedCase(UseCase newExtendedCase) {
		UseCase oldExtendedCase = extendedCase;
		extendedCase = newExtendedCase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2WithIDPackage.EXTEND__EXTENDED_CASE, oldExtendedCase, extendedCase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCase getExtension() {
		if (eContainerFeatureID() != UML2WithIDPackage.EXTEND__EXTENSION) return null;
		return (UseCase)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtension(UseCase newExtension, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newExtension, UML2WithIDPackage.EXTEND__EXTENSION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtension(UseCase newExtension) {
		if (newExtension != eInternalContainer() || (eContainerFeatureID() != UML2WithIDPackage.EXTEND__EXTENSION && newExtension != null)) {
			if (EcoreUtil.isAncestor(this, newExtension))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newExtension != null)
				msgs = ((InternalEObject)newExtension).eInverseAdd(this, UML2WithIDPackage.USE_CASE__EXTEND, UseCase.class, msgs);
			msgs = basicSetExtension(newExtension, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2WithIDPackage.EXTEND__EXTENSION, newExtension, newExtension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(Constraint newCondition, NotificationChain msgs) {
		Constraint oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UML2WithIDPackage.EXTEND__CONDITION, oldCondition, newCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(Constraint newCondition) {
		if (newCondition != condition) {
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2WithIDPackage.EXTEND__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UML2WithIDPackage.EXTEND__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2WithIDPackage.EXTEND__CONDITION, newCondition, newCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExtensionPoint> getExtensionLocation() {
		if (extensionLocation == null) {
			extensionLocation = new EObjectResolvingEList<ExtensionPoint>(ExtensionPoint.class, this, UML2WithIDPackage.EXTEND__EXTENSION_LOCATION);
		}
		return extensionLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UML2WithIDPackage.EXTEND__EXTENSION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetExtension((UseCase)otherEnd, msgs);
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
			case UML2WithIDPackage.EXTEND__EXTENSION:
				return basicSetExtension(null, msgs);
			case UML2WithIDPackage.EXTEND__CONDITION:
				return basicSetCondition(null, msgs);
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
			case UML2WithIDPackage.EXTEND__EXTENSION:
				return eInternalContainer().eInverseRemove(this, UML2WithIDPackage.USE_CASE__EXTEND, UseCase.class, msgs);
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
			case UML2WithIDPackage.EXTEND__RELATED_ELEMENT:
				return getRelatedElement();
			case UML2WithIDPackage.EXTEND__SOURCE:
				return getSource();
			case UML2WithIDPackage.EXTEND__TARGET:
				return getTarget();
			case UML2WithIDPackage.EXTEND__EXTENDED_CASE:
				if (resolve) return getExtendedCase();
				return basicGetExtendedCase();
			case UML2WithIDPackage.EXTEND__EXTENSION:
				return getExtension();
			case UML2WithIDPackage.EXTEND__CONDITION:
				return getCondition();
			case UML2WithIDPackage.EXTEND__EXTENSION_LOCATION:
				return getExtensionLocation();
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
			case UML2WithIDPackage.EXTEND__RELATED_ELEMENT:
				getRelatedElement().clear();
				getRelatedElement().addAll((Collection<? extends Element>)newValue);
				return;
			case UML2WithIDPackage.EXTEND__SOURCE:
				getSource().clear();
				getSource().addAll((Collection<? extends Element>)newValue);
				return;
			case UML2WithIDPackage.EXTEND__TARGET:
				getTarget().clear();
				getTarget().addAll((Collection<? extends Element>)newValue);
				return;
			case UML2WithIDPackage.EXTEND__EXTENDED_CASE:
				setExtendedCase((UseCase)newValue);
				return;
			case UML2WithIDPackage.EXTEND__EXTENSION:
				setExtension((UseCase)newValue);
				return;
			case UML2WithIDPackage.EXTEND__CONDITION:
				setCondition((Constraint)newValue);
				return;
			case UML2WithIDPackage.EXTEND__EXTENSION_LOCATION:
				getExtensionLocation().clear();
				getExtensionLocation().addAll((Collection<? extends ExtensionPoint>)newValue);
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
			case UML2WithIDPackage.EXTEND__RELATED_ELEMENT:
				getRelatedElement().clear();
				return;
			case UML2WithIDPackage.EXTEND__SOURCE:
				getSource().clear();
				return;
			case UML2WithIDPackage.EXTEND__TARGET:
				getTarget().clear();
				return;
			case UML2WithIDPackage.EXTEND__EXTENDED_CASE:
				setExtendedCase((UseCase)null);
				return;
			case UML2WithIDPackage.EXTEND__EXTENSION:
				setExtension((UseCase)null);
				return;
			case UML2WithIDPackage.EXTEND__CONDITION:
				setCondition((Constraint)null);
				return;
			case UML2WithIDPackage.EXTEND__EXTENSION_LOCATION:
				getExtensionLocation().clear();
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
			case UML2WithIDPackage.EXTEND__RELATED_ELEMENT:
				return relatedElement != null && !relatedElement.isEmpty();
			case UML2WithIDPackage.EXTEND__SOURCE:
				return source != null && !source.isEmpty();
			case UML2WithIDPackage.EXTEND__TARGET:
				return target != null && !target.isEmpty();
			case UML2WithIDPackage.EXTEND__EXTENDED_CASE:
				return extendedCase != null;
			case UML2WithIDPackage.EXTEND__EXTENSION:
				return getExtension() != null;
			case UML2WithIDPackage.EXTEND__CONDITION:
				return condition != null;
			case UML2WithIDPackage.EXTEND__EXTENSION_LOCATION:
				return extensionLocation != null && !extensionLocation.isEmpty();
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
				case UML2WithIDPackage.EXTEND__RELATED_ELEMENT: return UML2WithIDPackage.RELATIONSHIP__RELATED_ELEMENT;
				default: return -1;
			}
		}
		if (baseClass == DirectedRelationship.class) {
			switch (derivedFeatureID) {
				case UML2WithIDPackage.EXTEND__SOURCE: return UML2WithIDPackage.DIRECTED_RELATIONSHIP__SOURCE;
				case UML2WithIDPackage.EXTEND__TARGET: return UML2WithIDPackage.DIRECTED_RELATIONSHIP__TARGET;
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
				case UML2WithIDPackage.RELATIONSHIP__RELATED_ELEMENT: return UML2WithIDPackage.EXTEND__RELATED_ELEMENT;
				default: return -1;
			}
		}
		if (baseClass == DirectedRelationship.class) {
			switch (baseFeatureID) {
				case UML2WithIDPackage.DIRECTED_RELATIONSHIP__SOURCE: return UML2WithIDPackage.EXTEND__SOURCE;
				case UML2WithIDPackage.DIRECTED_RELATIONSHIP__TARGET: return UML2WithIDPackage.EXTEND__TARGET;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ExtendImpl

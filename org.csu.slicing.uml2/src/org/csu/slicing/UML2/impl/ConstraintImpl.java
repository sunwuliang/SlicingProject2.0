/**
 */
package org.csu.slicing.UML2.impl;

import java.util.Collection;

import org.csu.slicing.UML2.Constraint;
import org.csu.slicing.UML2.Element;
import org.csu.slicing.UML2.Namespace;
import org.csu.slicing.UML2.UML2Package;
import org.csu.slicing.UML2.ValueSpecification;

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
 * An implementation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2.impl.ConstraintImpl#getContext <em>Context</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.ConstraintImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.ConstraintImpl#getSpecification <em>Specification</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.ConstraintImpl#getConstrainedElement <em>Constrained Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConstraintImpl extends PackageableElementImpl implements Constraint {
	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected Namespace context;

	/**
	 * The cached value of the '{@link #getSpecification() <em>Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecification()
	 * @generated
	 * @ordered
	 */
	protected ValueSpecification specification;

	/**
	 * The cached value of the '{@link #getConstrainedElement() <em>Constrained Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstrainedElement()
	 * @generated
	 * @ordered
	 */
	protected EList<Element> constrainedElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UML2Package.eINSTANCE.getConstraint();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace getContext() {
		if (context != null && context.eIsProxy()) {
			InternalEObject oldContext = (InternalEObject)context;
			context = (Namespace)eResolveProxy(oldContext);
			if (context != oldContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2Package.CONSTRAINT__CONTEXT, oldContext, context));
			}
		}
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace basicGetContext() {
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContext(Namespace newContext) {
		Namespace oldContext = context;
		context = newContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.CONSTRAINT__CONTEXT, oldContext, context));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace getNamespace() {
		if (eContainerFeatureID() != UML2Package.CONSTRAINT__NAMESPACE) return null;
		return (Namespace)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNamespace(Namespace newNamespace, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newNamespace, UML2Package.CONSTRAINT__NAMESPACE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNamespace(Namespace newNamespace) {
		if (newNamespace != eInternalContainer() || (eContainerFeatureID() != UML2Package.CONSTRAINT__NAMESPACE && newNamespace != null)) {
			if (EcoreUtil.isAncestor(this, newNamespace))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newNamespace != null)
				msgs = ((InternalEObject)newNamespace).eInverseAdd(this, UML2Package.NAMESPACE__OWNED_RULE, Namespace.class, msgs);
			msgs = basicSetNamespace(newNamespace, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.CONSTRAINT__NAMESPACE, newNamespace, newNamespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getSpecification() {
		return specification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecification(ValueSpecification newSpecification, NotificationChain msgs) {
		ValueSpecification oldSpecification = specification;
		specification = newSpecification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UML2Package.CONSTRAINT__SPECIFICATION, oldSpecification, newSpecification);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecification(ValueSpecification newSpecification) {
		if (newSpecification != specification) {
			NotificationChain msgs = null;
			if (specification != null)
				msgs = ((InternalEObject)specification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.CONSTRAINT__SPECIFICATION, null, msgs);
			if (newSpecification != null)
				msgs = ((InternalEObject)newSpecification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UML2Package.CONSTRAINT__SPECIFICATION, null, msgs);
			msgs = basicSetSpecification(newSpecification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.CONSTRAINT__SPECIFICATION, newSpecification, newSpecification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getConstrainedElement() {
		if (constrainedElement == null) {
			constrainedElement = new EObjectResolvingEList<Element>(Element.class, this, UML2Package.CONSTRAINT__CONSTRAINED_ELEMENT);
		}
		return constrainedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UML2Package.CONSTRAINT__NAMESPACE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetNamespace((Namespace)otherEnd, msgs);
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
			case UML2Package.CONSTRAINT__NAMESPACE:
				return basicSetNamespace(null, msgs);
			case UML2Package.CONSTRAINT__SPECIFICATION:
				return basicSetSpecification(null, msgs);
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
			case UML2Package.CONSTRAINT__NAMESPACE:
				return eInternalContainer().eInverseRemove(this, UML2Package.NAMESPACE__OWNED_RULE, Namespace.class, msgs);
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
			case UML2Package.CONSTRAINT__CONTEXT:
				if (resolve) return getContext();
				return basicGetContext();
			case UML2Package.CONSTRAINT__NAMESPACE:
				return getNamespace();
			case UML2Package.CONSTRAINT__SPECIFICATION:
				return getSpecification();
			case UML2Package.CONSTRAINT__CONSTRAINED_ELEMENT:
				return getConstrainedElement();
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
			case UML2Package.CONSTRAINT__CONTEXT:
				setContext((Namespace)newValue);
				return;
			case UML2Package.CONSTRAINT__NAMESPACE:
				setNamespace((Namespace)newValue);
				return;
			case UML2Package.CONSTRAINT__SPECIFICATION:
				setSpecification((ValueSpecification)newValue);
				return;
			case UML2Package.CONSTRAINT__CONSTRAINED_ELEMENT:
				getConstrainedElement().clear();
				getConstrainedElement().addAll((Collection<? extends Element>)newValue);
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
			case UML2Package.CONSTRAINT__CONTEXT:
				setContext((Namespace)null);
				return;
			case UML2Package.CONSTRAINT__NAMESPACE:
				setNamespace((Namespace)null);
				return;
			case UML2Package.CONSTRAINT__SPECIFICATION:
				setSpecification((ValueSpecification)null);
				return;
			case UML2Package.CONSTRAINT__CONSTRAINED_ELEMENT:
				getConstrainedElement().clear();
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
			case UML2Package.CONSTRAINT__CONTEXT:
				return context != null;
			case UML2Package.CONSTRAINT__NAMESPACE:
				return getNamespace() != null;
			case UML2Package.CONSTRAINT__SPECIFICATION:
				return specification != null;
			case UML2Package.CONSTRAINT__CONSTRAINED_ELEMENT:
				return constrainedElement != null && !constrainedElement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConstraintImpl

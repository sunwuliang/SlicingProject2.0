/**
 */
package org.csu.slicing.UML2WithID.impl;

import java.util.Collection;

import org.csu.slicing.UML2WithID.Behavior;
import org.csu.slicing.UML2WithID.BehavioralFeature;
import org.csu.slicing.UML2WithID.BehavioredClassifier;
import org.csu.slicing.UML2WithID.Constraint;
import org.csu.slicing.UML2WithID.Parameter;
import org.csu.slicing.UML2WithID.ParameterSet;
import org.csu.slicing.UML2WithID.UML2WithIDPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Behavior</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.BehaviorImpl#isIsReentrant <em>Is Reentrant</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.BehaviorImpl#getContext <em>Context</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.BehaviorImpl#getRedefinedBehavior <em>Redefined Behavior</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.BehaviorImpl#getSpecification <em>Specification</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.BehaviorImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.BehaviorImpl#getFormalParameter <em>Formal Parameter</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.BehaviorImpl#getReturnResult <em>Return Result</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.BehaviorImpl#getPrecondition <em>Precondition</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.BehaviorImpl#getPostcondition <em>Postcondition</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.BehaviorImpl#getOwnedParameterSet <em>Owned Parameter Set</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class BehaviorImpl extends ClassImpl implements Behavior {
	/**
	 * The default value of the '{@link #isIsReentrant() <em>Is Reentrant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsReentrant()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_REENTRANT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsReentrant() <em>Is Reentrant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsReentrant()
	 * @generated
	 * @ordered
	 */
	protected boolean isReentrant = IS_REENTRANT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRedefinedBehavior() <em>Redefined Behavior</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinedBehavior()
	 * @generated
	 * @ordered
	 */
	protected EList<Behavior> redefinedBehavior;

	/**
	 * The cached value of the '{@link #getSpecification() <em>Specification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecification()
	 * @generated
	 * @ordered
	 */
	protected BehavioralFeature specification;

	/**
	 * The cached value of the '{@link #getParameter() <em>Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> parameter;

	/**
	 * The cached value of the '{@link #getFormalParameter() <em>Formal Parameter</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormalParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> formalParameter;

	/**
	 * The cached value of the '{@link #getReturnResult() <em>Return Result</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnResult()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> returnResult;

	/**
	 * The cached value of the '{@link #getPrecondition() <em>Precondition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecondition()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> precondition;

	/**
	 * The cached value of the '{@link #getPostcondition() <em>Postcondition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostcondition()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> postcondition;

	/**
	 * The cached value of the '{@link #getOwnedParameterSet() <em>Owned Parameter Set</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedParameterSet()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterSet> ownedParameterSet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BehaviorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UML2WithIDPackage.eINSTANCE.getBehavior();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsReentrant() {
		return isReentrant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsReentrant(boolean newIsReentrant) {
		boolean oldIsReentrant = isReentrant;
		isReentrant = newIsReentrant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2WithIDPackage.BEHAVIOR__IS_REENTRANT, oldIsReentrant, isReentrant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehavioredClassifier getContext() {
		if (eContainerFeatureID() != UML2WithIDPackage.BEHAVIOR__CONTEXT) return null;
		return (BehavioredClassifier)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContext(BehavioredClassifier newContext, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newContext, UML2WithIDPackage.BEHAVIOR__CONTEXT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContext(BehavioredClassifier newContext) {
		if (newContext != eInternalContainer() || (eContainerFeatureID() != UML2WithIDPackage.BEHAVIOR__CONTEXT && newContext != null)) {
			if (EcoreUtil.isAncestor(this, newContext))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContext != null)
				msgs = ((InternalEObject)newContext).eInverseAdd(this, UML2WithIDPackage.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR, BehavioredClassifier.class, msgs);
			msgs = basicSetContext(newContext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2WithIDPackage.BEHAVIOR__CONTEXT, newContext, newContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Behavior> getRedefinedBehavior() {
		if (redefinedBehavior == null) {
			redefinedBehavior = new EObjectResolvingEList<Behavior>(Behavior.class, this, UML2WithIDPackage.BEHAVIOR__REDEFINED_BEHAVIOR);
		}
		return redefinedBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehavioralFeature getSpecification() {
		if (specification != null && specification.eIsProxy()) {
			InternalEObject oldSpecification = (InternalEObject)specification;
			specification = (BehavioralFeature)eResolveProxy(oldSpecification);
			if (specification != oldSpecification) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2WithIDPackage.BEHAVIOR__SPECIFICATION, oldSpecification, specification));
			}
		}
		return specification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehavioralFeature basicGetSpecification() {
		return specification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecification(BehavioralFeature newSpecification, NotificationChain msgs) {
		BehavioralFeature oldSpecification = specification;
		specification = newSpecification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UML2WithIDPackage.BEHAVIOR__SPECIFICATION, oldSpecification, newSpecification);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecification(BehavioralFeature newSpecification) {
		if (newSpecification != specification) {
			NotificationChain msgs = null;
			if (specification != null)
				msgs = ((InternalEObject)specification).eInverseRemove(this, UML2WithIDPackage.BEHAVIORAL_FEATURE__METHOD, BehavioralFeature.class, msgs);
			if (newSpecification != null)
				msgs = ((InternalEObject)newSpecification).eInverseAdd(this, UML2WithIDPackage.BEHAVIORAL_FEATURE__METHOD, BehavioralFeature.class, msgs);
			msgs = basicSetSpecification(newSpecification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2WithIDPackage.BEHAVIOR__SPECIFICATION, newSpecification, newSpecification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getParameter() {
		if (parameter == null) {
			parameter = new EObjectContainmentEList<Parameter>(Parameter.class, this, UML2WithIDPackage.BEHAVIOR__PARAMETER);
		}
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getFormalParameter() {
		if (formalParameter == null) {
			formalParameter = new EObjectResolvingEList<Parameter>(Parameter.class, this, UML2WithIDPackage.BEHAVIOR__FORMAL_PARAMETER);
		}
		return formalParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getReturnResult() {
		if (returnResult == null) {
			returnResult = new EObjectResolvingEList<Parameter>(Parameter.class, this, UML2WithIDPackage.BEHAVIOR__RETURN_RESULT);
		}
		return returnResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getPrecondition() {
		if (precondition == null) {
			precondition = new EObjectResolvingEList<Constraint>(Constraint.class, this, UML2WithIDPackage.BEHAVIOR__PRECONDITION);
		}
		return precondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getPostcondition() {
		if (postcondition == null) {
			postcondition = new EObjectResolvingEList<Constraint>(Constraint.class, this, UML2WithIDPackage.BEHAVIOR__POSTCONDITION);
		}
		return postcondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParameterSet> getOwnedParameterSet() {
		if (ownedParameterSet == null) {
			ownedParameterSet = new EObjectContainmentEList<ParameterSet>(ParameterSet.class, this, UML2WithIDPackage.BEHAVIOR__OWNED_PARAMETER_SET);
		}
		return ownedParameterSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UML2WithIDPackage.BEHAVIOR__CONTEXT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetContext((BehavioredClassifier)otherEnd, msgs);
			case UML2WithIDPackage.BEHAVIOR__SPECIFICATION:
				if (specification != null)
					msgs = ((InternalEObject)specification).eInverseRemove(this, UML2WithIDPackage.BEHAVIORAL_FEATURE__METHOD, BehavioralFeature.class, msgs);
				return basicSetSpecification((BehavioralFeature)otherEnd, msgs);
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
			case UML2WithIDPackage.BEHAVIOR__CONTEXT:
				return basicSetContext(null, msgs);
			case UML2WithIDPackage.BEHAVIOR__SPECIFICATION:
				return basicSetSpecification(null, msgs);
			case UML2WithIDPackage.BEHAVIOR__PARAMETER:
				return ((InternalEList<?>)getParameter()).basicRemove(otherEnd, msgs);
			case UML2WithIDPackage.BEHAVIOR__OWNED_PARAMETER_SET:
				return ((InternalEList<?>)getOwnedParameterSet()).basicRemove(otherEnd, msgs);
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
			case UML2WithIDPackage.BEHAVIOR__CONTEXT:
				return eInternalContainer().eInverseRemove(this, UML2WithIDPackage.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR, BehavioredClassifier.class, msgs);
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
			case UML2WithIDPackage.BEHAVIOR__IS_REENTRANT:
				return isIsReentrant();
			case UML2WithIDPackage.BEHAVIOR__CONTEXT:
				return getContext();
			case UML2WithIDPackage.BEHAVIOR__REDEFINED_BEHAVIOR:
				return getRedefinedBehavior();
			case UML2WithIDPackage.BEHAVIOR__SPECIFICATION:
				if (resolve) return getSpecification();
				return basicGetSpecification();
			case UML2WithIDPackage.BEHAVIOR__PARAMETER:
				return getParameter();
			case UML2WithIDPackage.BEHAVIOR__FORMAL_PARAMETER:
				return getFormalParameter();
			case UML2WithIDPackage.BEHAVIOR__RETURN_RESULT:
				return getReturnResult();
			case UML2WithIDPackage.BEHAVIOR__PRECONDITION:
				return getPrecondition();
			case UML2WithIDPackage.BEHAVIOR__POSTCONDITION:
				return getPostcondition();
			case UML2WithIDPackage.BEHAVIOR__OWNED_PARAMETER_SET:
				return getOwnedParameterSet();
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
			case UML2WithIDPackage.BEHAVIOR__IS_REENTRANT:
				setIsReentrant((Boolean)newValue);
				return;
			case UML2WithIDPackage.BEHAVIOR__CONTEXT:
				setContext((BehavioredClassifier)newValue);
				return;
			case UML2WithIDPackage.BEHAVIOR__REDEFINED_BEHAVIOR:
				getRedefinedBehavior().clear();
				getRedefinedBehavior().addAll((Collection<? extends Behavior>)newValue);
				return;
			case UML2WithIDPackage.BEHAVIOR__SPECIFICATION:
				setSpecification((BehavioralFeature)newValue);
				return;
			case UML2WithIDPackage.BEHAVIOR__PARAMETER:
				getParameter().clear();
				getParameter().addAll((Collection<? extends Parameter>)newValue);
				return;
			case UML2WithIDPackage.BEHAVIOR__FORMAL_PARAMETER:
				getFormalParameter().clear();
				getFormalParameter().addAll((Collection<? extends Parameter>)newValue);
				return;
			case UML2WithIDPackage.BEHAVIOR__RETURN_RESULT:
				getReturnResult().clear();
				getReturnResult().addAll((Collection<? extends Parameter>)newValue);
				return;
			case UML2WithIDPackage.BEHAVIOR__PRECONDITION:
				getPrecondition().clear();
				getPrecondition().addAll((Collection<? extends Constraint>)newValue);
				return;
			case UML2WithIDPackage.BEHAVIOR__POSTCONDITION:
				getPostcondition().clear();
				getPostcondition().addAll((Collection<? extends Constraint>)newValue);
				return;
			case UML2WithIDPackage.BEHAVIOR__OWNED_PARAMETER_SET:
				getOwnedParameterSet().clear();
				getOwnedParameterSet().addAll((Collection<? extends ParameterSet>)newValue);
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
			case UML2WithIDPackage.BEHAVIOR__IS_REENTRANT:
				setIsReentrant(IS_REENTRANT_EDEFAULT);
				return;
			case UML2WithIDPackage.BEHAVIOR__CONTEXT:
				setContext((BehavioredClassifier)null);
				return;
			case UML2WithIDPackage.BEHAVIOR__REDEFINED_BEHAVIOR:
				getRedefinedBehavior().clear();
				return;
			case UML2WithIDPackage.BEHAVIOR__SPECIFICATION:
				setSpecification((BehavioralFeature)null);
				return;
			case UML2WithIDPackage.BEHAVIOR__PARAMETER:
				getParameter().clear();
				return;
			case UML2WithIDPackage.BEHAVIOR__FORMAL_PARAMETER:
				getFormalParameter().clear();
				return;
			case UML2WithIDPackage.BEHAVIOR__RETURN_RESULT:
				getReturnResult().clear();
				return;
			case UML2WithIDPackage.BEHAVIOR__PRECONDITION:
				getPrecondition().clear();
				return;
			case UML2WithIDPackage.BEHAVIOR__POSTCONDITION:
				getPostcondition().clear();
				return;
			case UML2WithIDPackage.BEHAVIOR__OWNED_PARAMETER_SET:
				getOwnedParameterSet().clear();
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
			case UML2WithIDPackage.BEHAVIOR__IS_REENTRANT:
				return isReentrant != IS_REENTRANT_EDEFAULT;
			case UML2WithIDPackage.BEHAVIOR__CONTEXT:
				return getContext() != null;
			case UML2WithIDPackage.BEHAVIOR__REDEFINED_BEHAVIOR:
				return redefinedBehavior != null && !redefinedBehavior.isEmpty();
			case UML2WithIDPackage.BEHAVIOR__SPECIFICATION:
				return specification != null;
			case UML2WithIDPackage.BEHAVIOR__PARAMETER:
				return parameter != null && !parameter.isEmpty();
			case UML2WithIDPackage.BEHAVIOR__FORMAL_PARAMETER:
				return formalParameter != null && !formalParameter.isEmpty();
			case UML2WithIDPackage.BEHAVIOR__RETURN_RESULT:
				return returnResult != null && !returnResult.isEmpty();
			case UML2WithIDPackage.BEHAVIOR__PRECONDITION:
				return precondition != null && !precondition.isEmpty();
			case UML2WithIDPackage.BEHAVIOR__POSTCONDITION:
				return postcondition != null && !postcondition.isEmpty();
			case UML2WithIDPackage.BEHAVIOR__OWNED_PARAMETER_SET:
				return ownedParameterSet != null && !ownedParameterSet.isEmpty();
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
		result.append(" (isReentrant: ");
		result.append(isReentrant);
		result.append(')');
		return result.toString();
	}

} //BehaviorImpl

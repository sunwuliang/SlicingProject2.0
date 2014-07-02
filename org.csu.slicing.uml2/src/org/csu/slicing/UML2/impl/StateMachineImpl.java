/**
 */
package org.csu.slicing.UML2.impl;

import java.util.Collection;

import org.csu.slicing.UML2.BehavioredClassifier;
import org.csu.slicing.UML2.Pseudostate;
import org.csu.slicing.UML2.Region;
import org.csu.slicing.UML2.StateMachine;
import org.csu.slicing.UML2.UML2Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2.impl.StateMachineImpl#getRegion <em>Region</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.StateMachineImpl#getConnectionPoint <em>Connection Point</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.StateMachineImpl#getExtendedStateMachine <em>Extended State Machine</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.StateMachineImpl#getStateMachine_redefinitionContext <em>State Machine redefinition Context</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StateMachineImpl extends BehaviorImpl implements StateMachine {
	/**
	 * The cached value of the '{@link #getRegion() <em>Region</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegion()
	 * @generated
	 * @ordered
	 */
	protected EList<Region> region;

	/**
	 * The cached value of the '{@link #getConnectionPoint() <em>Connection Point</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionPoint()
	 * @generated
	 * @ordered
	 */
	protected EList<Pseudostate> connectionPoint;

	/**
	 * The cached value of the '{@link #getExtendedStateMachine() <em>Extended State Machine</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendedStateMachine()
	 * @generated
	 * @ordered
	 */
	protected StateMachine extendedStateMachine;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateMachineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UML2Package.eINSTANCE.getStateMachine();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Region> getRegion() {
		if (region == null) {
			region = new EObjectContainmentWithInverseEList<Region>(Region.class, this, UML2Package.STATE_MACHINE__REGION, UML2Package.REGION__STATE_MACHINE);
		}
		return region;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pseudostate> getConnectionPoint() {
		if (connectionPoint == null) {
			connectionPoint = new EObjectContainmentEList<Pseudostate>(Pseudostate.class, this, UML2Package.STATE_MACHINE__CONNECTION_POINT);
		}
		return connectionPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachine getExtendedStateMachine() {
		if (extendedStateMachine != null && extendedStateMachine.eIsProxy()) {
			InternalEObject oldExtendedStateMachine = (InternalEObject)extendedStateMachine;
			extendedStateMachine = (StateMachine)eResolveProxy(oldExtendedStateMachine);
			if (extendedStateMachine != oldExtendedStateMachine) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2Package.STATE_MACHINE__EXTENDED_STATE_MACHINE, oldExtendedStateMachine, extendedStateMachine));
			}
		}
		return extendedStateMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachine basicGetExtendedStateMachine() {
		return extendedStateMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtendedStateMachine(StateMachine newExtendedStateMachine) {
		StateMachine oldExtendedStateMachine = extendedStateMachine;
		extendedStateMachine = newExtendedStateMachine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.STATE_MACHINE__EXTENDED_STATE_MACHINE, oldExtendedStateMachine, extendedStateMachine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehavioredClassifier getStateMachine_redefinitionContext() {
		if (eContainerFeatureID() != UML2Package.STATE_MACHINE__STATE_MACHINE_REDEFINITION_CONTEXT) return null;
		return (BehavioredClassifier)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStateMachine_redefinitionContext(BehavioredClassifier newStateMachine_redefinitionContext, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newStateMachine_redefinitionContext, UML2Package.STATE_MACHINE__STATE_MACHINE_REDEFINITION_CONTEXT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStateMachine_redefinitionContext(BehavioredClassifier newStateMachine_redefinitionContext) {
		if (newStateMachine_redefinitionContext != eInternalContainer() || (eContainerFeatureID() != UML2Package.STATE_MACHINE__STATE_MACHINE_REDEFINITION_CONTEXT && newStateMachine_redefinitionContext != null)) {
			if (EcoreUtil.isAncestor(this, newStateMachine_redefinitionContext))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newStateMachine_redefinitionContext != null)
				msgs = ((InternalEObject)newStateMachine_redefinitionContext).eInverseAdd(this, UML2Package.BEHAVIORED_CLASSIFIER__OWNED_STATE_MACHINE, BehavioredClassifier.class, msgs);
			msgs = basicSetStateMachine_redefinitionContext(newStateMachine_redefinitionContext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.STATE_MACHINE__STATE_MACHINE_REDEFINITION_CONTEXT, newStateMachine_redefinitionContext, newStateMachine_redefinitionContext));
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
			case UML2Package.STATE_MACHINE__REGION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRegion()).basicAdd(otherEnd, msgs);
			case UML2Package.STATE_MACHINE__STATE_MACHINE_REDEFINITION_CONTEXT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetStateMachine_redefinitionContext((BehavioredClassifier)otherEnd, msgs);
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
			case UML2Package.STATE_MACHINE__REGION:
				return ((InternalEList<?>)getRegion()).basicRemove(otherEnd, msgs);
			case UML2Package.STATE_MACHINE__CONNECTION_POINT:
				return ((InternalEList<?>)getConnectionPoint()).basicRemove(otherEnd, msgs);
			case UML2Package.STATE_MACHINE__STATE_MACHINE_REDEFINITION_CONTEXT:
				return basicSetStateMachine_redefinitionContext(null, msgs);
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
			case UML2Package.STATE_MACHINE__STATE_MACHINE_REDEFINITION_CONTEXT:
				return eInternalContainer().eInverseRemove(this, UML2Package.BEHAVIORED_CLASSIFIER__OWNED_STATE_MACHINE, BehavioredClassifier.class, msgs);
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
			case UML2Package.STATE_MACHINE__REGION:
				return getRegion();
			case UML2Package.STATE_MACHINE__CONNECTION_POINT:
				return getConnectionPoint();
			case UML2Package.STATE_MACHINE__EXTENDED_STATE_MACHINE:
				if (resolve) return getExtendedStateMachine();
				return basicGetExtendedStateMachine();
			case UML2Package.STATE_MACHINE__STATE_MACHINE_REDEFINITION_CONTEXT:
				return getStateMachine_redefinitionContext();
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
			case UML2Package.STATE_MACHINE__REGION:
				getRegion().clear();
				getRegion().addAll((Collection<? extends Region>)newValue);
				return;
			case UML2Package.STATE_MACHINE__CONNECTION_POINT:
				getConnectionPoint().clear();
				getConnectionPoint().addAll((Collection<? extends Pseudostate>)newValue);
				return;
			case UML2Package.STATE_MACHINE__EXTENDED_STATE_MACHINE:
				setExtendedStateMachine((StateMachine)newValue);
				return;
			case UML2Package.STATE_MACHINE__STATE_MACHINE_REDEFINITION_CONTEXT:
				setStateMachine_redefinitionContext((BehavioredClassifier)newValue);
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
			case UML2Package.STATE_MACHINE__REGION:
				getRegion().clear();
				return;
			case UML2Package.STATE_MACHINE__CONNECTION_POINT:
				getConnectionPoint().clear();
				return;
			case UML2Package.STATE_MACHINE__EXTENDED_STATE_MACHINE:
				setExtendedStateMachine((StateMachine)null);
				return;
			case UML2Package.STATE_MACHINE__STATE_MACHINE_REDEFINITION_CONTEXT:
				setStateMachine_redefinitionContext((BehavioredClassifier)null);
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
			case UML2Package.STATE_MACHINE__REGION:
				return region != null && !region.isEmpty();
			case UML2Package.STATE_MACHINE__CONNECTION_POINT:
				return connectionPoint != null && !connectionPoint.isEmpty();
			case UML2Package.STATE_MACHINE__EXTENDED_STATE_MACHINE:
				return extendedStateMachine != null;
			case UML2Package.STATE_MACHINE__STATE_MACHINE_REDEFINITION_CONTEXT:
				return getStateMachine_redefinitionContext() != null;
		}
		return super.eIsSet(featureID);
	}

} //StateMachineImpl

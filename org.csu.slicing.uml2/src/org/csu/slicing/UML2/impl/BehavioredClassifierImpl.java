/**
 */
package org.csu.slicing.UML2.impl;

import java.util.Collection;

import org.csu.slicing.UML2.Behavior;
import org.csu.slicing.UML2.BehavioredClassifier;
import org.csu.slicing.UML2.Implementation;
import org.csu.slicing.UML2.StateMachine;
import org.csu.slicing.UML2.Trigger;
import org.csu.slicing.UML2.UML2Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Behaviored Classifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2.impl.BehavioredClassifierImpl#getOwnedBehavior <em>Owned Behavior</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.BehavioredClassifierImpl#getClassifierBehavior <em>Classifier Behavior</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.BehavioredClassifierImpl#getImplementation <em>Implementation</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.BehavioredClassifierImpl#getOwnedTrigger <em>Owned Trigger</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.BehavioredClassifierImpl#getOwnedStateMachine <em>Owned State Machine</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class BehavioredClassifierImpl extends ClassifierImpl implements BehavioredClassifier {
	/**
	 * The cached value of the '{@link #getOwnedBehavior() <em>Owned Behavior</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedBehavior()
	 * @generated
	 * @ordered
	 */
	protected EList<Behavior> ownedBehavior;

	/**
	 * The cached value of the '{@link #getClassifierBehavior() <em>Classifier Behavior</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifierBehavior()
	 * @generated
	 * @ordered
	 */
	protected Behavior classifierBehavior;

	/**
	 * The cached value of the '{@link #getImplementation() <em>Implementation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementation()
	 * @generated
	 * @ordered
	 */
	protected EList<Implementation> implementation;

	/**
	 * The cached value of the '{@link #getOwnedTrigger() <em>Owned Trigger</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedTrigger()
	 * @generated
	 * @ordered
	 */
	protected EList<Trigger> ownedTrigger;

	/**
	 * The cached value of the '{@link #getOwnedStateMachine() <em>Owned State Machine</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedStateMachine()
	 * @generated
	 * @ordered
	 */
	protected EList<StateMachine> ownedStateMachine;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BehavioredClassifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UML2Package.eINSTANCE.getBehavioredClassifier();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Behavior> getOwnedBehavior() {
		if (ownedBehavior == null) {
			ownedBehavior = new EObjectContainmentWithInverseEList<Behavior>(Behavior.class, this, UML2Package.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR, UML2Package.BEHAVIOR__CONTEXT);
		}
		return ownedBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior getClassifierBehavior() {
		if (classifierBehavior != null && classifierBehavior.eIsProxy()) {
			InternalEObject oldClassifierBehavior = (InternalEObject)classifierBehavior;
			classifierBehavior = (Behavior)eResolveProxy(oldClassifierBehavior);
			if (classifierBehavior != oldClassifierBehavior) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2Package.BEHAVIORED_CLASSIFIER__CLASSIFIER_BEHAVIOR, oldClassifierBehavior, classifierBehavior));
			}
		}
		return classifierBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior basicGetClassifierBehavior() {
		return classifierBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassifierBehavior(Behavior newClassifierBehavior) {
		Behavior oldClassifierBehavior = classifierBehavior;
		classifierBehavior = newClassifierBehavior;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.BEHAVIORED_CLASSIFIER__CLASSIFIER_BEHAVIOR, oldClassifierBehavior, classifierBehavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Implementation> getImplementation() {
		if (implementation == null) {
			implementation = new EObjectContainmentWithInverseEList<Implementation>(Implementation.class, this, UML2Package.BEHAVIORED_CLASSIFIER__IMPLEMENTATION, UML2Package.IMPLEMENTATION__IMPLEMENTING_CLASSIFIER);
		}
		return implementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Trigger> getOwnedTrigger() {
		if (ownedTrigger == null) {
			ownedTrigger = new EObjectContainmentEList<Trigger>(Trigger.class, this, UML2Package.BEHAVIORED_CLASSIFIER__OWNED_TRIGGER);
		}
		return ownedTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StateMachine> getOwnedStateMachine() {
		if (ownedStateMachine == null) {
			ownedStateMachine = new EObjectContainmentWithInverseEList<StateMachine>(StateMachine.class, this, UML2Package.BEHAVIORED_CLASSIFIER__OWNED_STATE_MACHINE, UML2Package.STATE_MACHINE__STATE_MACHINE_REDEFINITION_CONTEXT);
		}
		return ownedStateMachine;
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
			case UML2Package.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedBehavior()).basicAdd(otherEnd, msgs);
			case UML2Package.BEHAVIORED_CLASSIFIER__IMPLEMENTATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getImplementation()).basicAdd(otherEnd, msgs);
			case UML2Package.BEHAVIORED_CLASSIFIER__OWNED_STATE_MACHINE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedStateMachine()).basicAdd(otherEnd, msgs);
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
			case UML2Package.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR:
				return ((InternalEList<?>)getOwnedBehavior()).basicRemove(otherEnd, msgs);
			case UML2Package.BEHAVIORED_CLASSIFIER__IMPLEMENTATION:
				return ((InternalEList<?>)getImplementation()).basicRemove(otherEnd, msgs);
			case UML2Package.BEHAVIORED_CLASSIFIER__OWNED_TRIGGER:
				return ((InternalEList<?>)getOwnedTrigger()).basicRemove(otherEnd, msgs);
			case UML2Package.BEHAVIORED_CLASSIFIER__OWNED_STATE_MACHINE:
				return ((InternalEList<?>)getOwnedStateMachine()).basicRemove(otherEnd, msgs);
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
			case UML2Package.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR:
				return getOwnedBehavior();
			case UML2Package.BEHAVIORED_CLASSIFIER__CLASSIFIER_BEHAVIOR:
				if (resolve) return getClassifierBehavior();
				return basicGetClassifierBehavior();
			case UML2Package.BEHAVIORED_CLASSIFIER__IMPLEMENTATION:
				return getImplementation();
			case UML2Package.BEHAVIORED_CLASSIFIER__OWNED_TRIGGER:
				return getOwnedTrigger();
			case UML2Package.BEHAVIORED_CLASSIFIER__OWNED_STATE_MACHINE:
				return getOwnedStateMachine();
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
			case UML2Package.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR:
				getOwnedBehavior().clear();
				getOwnedBehavior().addAll((Collection<? extends Behavior>)newValue);
				return;
			case UML2Package.BEHAVIORED_CLASSIFIER__CLASSIFIER_BEHAVIOR:
				setClassifierBehavior((Behavior)newValue);
				return;
			case UML2Package.BEHAVIORED_CLASSIFIER__IMPLEMENTATION:
				getImplementation().clear();
				getImplementation().addAll((Collection<? extends Implementation>)newValue);
				return;
			case UML2Package.BEHAVIORED_CLASSIFIER__OWNED_TRIGGER:
				getOwnedTrigger().clear();
				getOwnedTrigger().addAll((Collection<? extends Trigger>)newValue);
				return;
			case UML2Package.BEHAVIORED_CLASSIFIER__OWNED_STATE_MACHINE:
				getOwnedStateMachine().clear();
				getOwnedStateMachine().addAll((Collection<? extends StateMachine>)newValue);
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
			case UML2Package.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR:
				getOwnedBehavior().clear();
				return;
			case UML2Package.BEHAVIORED_CLASSIFIER__CLASSIFIER_BEHAVIOR:
				setClassifierBehavior((Behavior)null);
				return;
			case UML2Package.BEHAVIORED_CLASSIFIER__IMPLEMENTATION:
				getImplementation().clear();
				return;
			case UML2Package.BEHAVIORED_CLASSIFIER__OWNED_TRIGGER:
				getOwnedTrigger().clear();
				return;
			case UML2Package.BEHAVIORED_CLASSIFIER__OWNED_STATE_MACHINE:
				getOwnedStateMachine().clear();
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
			case UML2Package.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR:
				return ownedBehavior != null && !ownedBehavior.isEmpty();
			case UML2Package.BEHAVIORED_CLASSIFIER__CLASSIFIER_BEHAVIOR:
				return classifierBehavior != null;
			case UML2Package.BEHAVIORED_CLASSIFIER__IMPLEMENTATION:
				return implementation != null && !implementation.isEmpty();
			case UML2Package.BEHAVIORED_CLASSIFIER__OWNED_TRIGGER:
				return ownedTrigger != null && !ownedTrigger.isEmpty();
			case UML2Package.BEHAVIORED_CLASSIFIER__OWNED_STATE_MACHINE:
				return ownedStateMachine != null && !ownedStateMachine.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BehavioredClassifierImpl

/**
 */
package org.csu.slicing.UML2.impl;

import java.util.Collection;

import org.csu.slicing.UML2.Classifier;
import org.csu.slicing.UML2.RedefinableElement;
import org.csu.slicing.UML2.Region;
import org.csu.slicing.UML2.State;
import org.csu.slicing.UML2.StateMachine;
import org.csu.slicing.UML2.Transition;
import org.csu.slicing.UML2.UML2Package;
import org.csu.slicing.UML2.Vertex;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Region</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2.impl.RegionImpl#getRedefinitionContext <em>Redefinition Context</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.RegionImpl#isIsLeaf <em>Is Leaf</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.RegionImpl#getSubvertex <em>Subvertex</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.RegionImpl#getTransition <em>Transition</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.RegionImpl#getStateMachine <em>State Machine</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.RegionImpl#getState <em>State</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.RegionImpl#getExtendedRegion <em>Extended Region</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RegionImpl extends NamespaceImpl implements Region {
	/**
	 * The cached value of the '{@link #getRedefinitionContext() <em>Redefinition Context</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinitionContext()
	 * @generated
	 * @ordered
	 */
	protected EList<Classifier> redefinitionContext;

	/**
	 * The default value of the '{@link #isIsLeaf() <em>Is Leaf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsLeaf()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_LEAF_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsLeaf() <em>Is Leaf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsLeaf()
	 * @generated
	 * @ordered
	 */
	protected boolean isLeaf = IS_LEAF_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSubvertex() <em>Subvertex</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubvertex()
	 * @generated
	 * @ordered
	 */
	protected EList<Vertex> subvertex;

	/**
	 * The cached value of the '{@link #getTransition() <em>Transition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransition()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> transition;

	/**
	 * The cached value of the '{@link #getExtendedRegion() <em>Extended Region</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendedRegion()
	 * @generated
	 * @ordered
	 */
	protected Region extendedRegion;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UML2Package.eINSTANCE.getRegion();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Classifier> getRedefinitionContext() {
		if (redefinitionContext == null) {
			redefinitionContext = new EObjectResolvingEList<Classifier>(Classifier.class, this, UML2Package.REGION__REDEFINITION_CONTEXT);
		}
		return redefinitionContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsLeaf() {
		return isLeaf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsLeaf(boolean newIsLeaf) {
		boolean oldIsLeaf = isLeaf;
		isLeaf = newIsLeaf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.REGION__IS_LEAF, oldIsLeaf, isLeaf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Vertex> getSubvertex() {
		if (subvertex == null) {
			subvertex = new EObjectContainmentWithInverseEList<Vertex>(Vertex.class, this, UML2Package.REGION__SUBVERTEX, UML2Package.VERTEX__CONTAINER);
		}
		return subvertex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getTransition() {
		if (transition == null) {
			transition = new EObjectContainmentWithInverseEList<Transition>(Transition.class, this, UML2Package.REGION__TRANSITION, UML2Package.TRANSITION__CONTAINER);
		}
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachine getStateMachine() {
		if (eContainerFeatureID() != UML2Package.REGION__STATE_MACHINE) return null;
		return (StateMachine)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStateMachine(StateMachine newStateMachine, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newStateMachine, UML2Package.REGION__STATE_MACHINE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStateMachine(StateMachine newStateMachine) {
		if (newStateMachine != eInternalContainer() || (eContainerFeatureID() != UML2Package.REGION__STATE_MACHINE && newStateMachine != null)) {
			if (EcoreUtil.isAncestor(this, newStateMachine))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newStateMachine != null)
				msgs = ((InternalEObject)newStateMachine).eInverseAdd(this, UML2Package.STATE_MACHINE__REGION, StateMachine.class, msgs);
			msgs = basicSetStateMachine(newStateMachine, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.REGION__STATE_MACHINE, newStateMachine, newStateMachine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getState() {
		if (eContainerFeatureID() != UML2Package.REGION__STATE) return null;
		return (State)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetState(State newState, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newState, UML2Package.REGION__STATE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(State newState) {
		if (newState != eInternalContainer() || (eContainerFeatureID() != UML2Package.REGION__STATE && newState != null)) {
			if (EcoreUtil.isAncestor(this, newState))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newState != null)
				msgs = ((InternalEObject)newState).eInverseAdd(this, UML2Package.STATE__REGION, State.class, msgs);
			msgs = basicSetState(newState, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.REGION__STATE, newState, newState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Region getExtendedRegion() {
		if (extendedRegion != null && extendedRegion.eIsProxy()) {
			InternalEObject oldExtendedRegion = (InternalEObject)extendedRegion;
			extendedRegion = (Region)eResolveProxy(oldExtendedRegion);
			if (extendedRegion != oldExtendedRegion) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2Package.REGION__EXTENDED_REGION, oldExtendedRegion, extendedRegion));
			}
		}
		return extendedRegion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Region basicGetExtendedRegion() {
		return extendedRegion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtendedRegion(Region newExtendedRegion) {
		Region oldExtendedRegion = extendedRegion;
		extendedRegion = newExtendedRegion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.REGION__EXTENDED_REGION, oldExtendedRegion, extendedRegion));
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
			case UML2Package.REGION__SUBVERTEX:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubvertex()).basicAdd(otherEnd, msgs);
			case UML2Package.REGION__TRANSITION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTransition()).basicAdd(otherEnd, msgs);
			case UML2Package.REGION__STATE_MACHINE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetStateMachine((StateMachine)otherEnd, msgs);
			case UML2Package.REGION__STATE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetState((State)otherEnd, msgs);
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
			case UML2Package.REGION__SUBVERTEX:
				return ((InternalEList<?>)getSubvertex()).basicRemove(otherEnd, msgs);
			case UML2Package.REGION__TRANSITION:
				return ((InternalEList<?>)getTransition()).basicRemove(otherEnd, msgs);
			case UML2Package.REGION__STATE_MACHINE:
				return basicSetStateMachine(null, msgs);
			case UML2Package.REGION__STATE:
				return basicSetState(null, msgs);
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
			case UML2Package.REGION__STATE_MACHINE:
				return eInternalContainer().eInverseRemove(this, UML2Package.STATE_MACHINE__REGION, StateMachine.class, msgs);
			case UML2Package.REGION__STATE:
				return eInternalContainer().eInverseRemove(this, UML2Package.STATE__REGION, State.class, msgs);
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
			case UML2Package.REGION__REDEFINITION_CONTEXT:
				return getRedefinitionContext();
			case UML2Package.REGION__IS_LEAF:
				return isIsLeaf();
			case UML2Package.REGION__SUBVERTEX:
				return getSubvertex();
			case UML2Package.REGION__TRANSITION:
				return getTransition();
			case UML2Package.REGION__STATE_MACHINE:
				return getStateMachine();
			case UML2Package.REGION__STATE:
				return getState();
			case UML2Package.REGION__EXTENDED_REGION:
				if (resolve) return getExtendedRegion();
				return basicGetExtendedRegion();
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
			case UML2Package.REGION__REDEFINITION_CONTEXT:
				getRedefinitionContext().clear();
				getRedefinitionContext().addAll((Collection<? extends Classifier>)newValue);
				return;
			case UML2Package.REGION__IS_LEAF:
				setIsLeaf((Boolean)newValue);
				return;
			case UML2Package.REGION__SUBVERTEX:
				getSubvertex().clear();
				getSubvertex().addAll((Collection<? extends Vertex>)newValue);
				return;
			case UML2Package.REGION__TRANSITION:
				getTransition().clear();
				getTransition().addAll((Collection<? extends Transition>)newValue);
				return;
			case UML2Package.REGION__STATE_MACHINE:
				setStateMachine((StateMachine)newValue);
				return;
			case UML2Package.REGION__STATE:
				setState((State)newValue);
				return;
			case UML2Package.REGION__EXTENDED_REGION:
				setExtendedRegion((Region)newValue);
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
			case UML2Package.REGION__REDEFINITION_CONTEXT:
				getRedefinitionContext().clear();
				return;
			case UML2Package.REGION__IS_LEAF:
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UML2Package.REGION__SUBVERTEX:
				getSubvertex().clear();
				return;
			case UML2Package.REGION__TRANSITION:
				getTransition().clear();
				return;
			case UML2Package.REGION__STATE_MACHINE:
				setStateMachine((StateMachine)null);
				return;
			case UML2Package.REGION__STATE:
				setState((State)null);
				return;
			case UML2Package.REGION__EXTENDED_REGION:
				setExtendedRegion((Region)null);
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
			case UML2Package.REGION__REDEFINITION_CONTEXT:
				return redefinitionContext != null && !redefinitionContext.isEmpty();
			case UML2Package.REGION__IS_LEAF:
				return isLeaf != IS_LEAF_EDEFAULT;
			case UML2Package.REGION__SUBVERTEX:
				return subvertex != null && !subvertex.isEmpty();
			case UML2Package.REGION__TRANSITION:
				return transition != null && !transition.isEmpty();
			case UML2Package.REGION__STATE_MACHINE:
				return getStateMachine() != null;
			case UML2Package.REGION__STATE:
				return getState() != null;
			case UML2Package.REGION__EXTENDED_REGION:
				return extendedRegion != null;
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
		if (baseClass == RedefinableElement.class) {
			switch (derivedFeatureID) {
				case UML2Package.REGION__REDEFINITION_CONTEXT: return UML2Package.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT;
				case UML2Package.REGION__IS_LEAF: return UML2Package.REDEFINABLE_ELEMENT__IS_LEAF;
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
		if (baseClass == RedefinableElement.class) {
			switch (baseFeatureID) {
				case UML2Package.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT: return UML2Package.REGION__REDEFINITION_CONTEXT;
				case UML2Package.REDEFINABLE_ELEMENT__IS_LEAF: return UML2Package.REGION__IS_LEAF;
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
		result.append(" (isLeaf: ");
		result.append(isLeaf);
		result.append(')');
		return result.toString();
	}

} //RegionImpl

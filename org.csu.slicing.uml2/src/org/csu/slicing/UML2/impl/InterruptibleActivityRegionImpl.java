/**
 */
package org.csu.slicing.UML2.impl;

import java.util.Collection;

import org.csu.slicing.UML2.ActivityEdge;
import org.csu.slicing.UML2.ActivityNode;
import org.csu.slicing.UML2.InterruptibleActivityRegion;
import org.csu.slicing.UML2.UML2Package;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interruptible Activity Region</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2.impl.InterruptibleActivityRegionImpl#getInterruptingEdge <em>Interrupting Edge</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.InterruptibleActivityRegionImpl#getContainedNode <em>Contained Node</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InterruptibleActivityRegionImpl extends ActivityGroupImpl implements InterruptibleActivityRegion {
	/**
	 * The cached value of the '{@link #getInterruptingEdge() <em>Interrupting Edge</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterruptingEdge()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityEdge> interruptingEdge;

	/**
	 * The cached value of the '{@link #getContainedNode() <em>Contained Node</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedNode()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityNode> containedNode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterruptibleActivityRegionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UML2Package.eINSTANCE.getInterruptibleActivityRegion();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityEdge> getInterruptingEdge() {
		if (interruptingEdge == null) {
			interruptingEdge = new EObjectWithInverseResolvingEList<ActivityEdge>(ActivityEdge.class, this, UML2Package.INTERRUPTIBLE_ACTIVITY_REGION__INTERRUPTING_EDGE, UML2Package.ACTIVITY_EDGE__INTERRUPTS);
		}
		return interruptingEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityNode> getContainedNode() {
		if (containedNode == null) {
			containedNode = new EObjectWithInverseResolvingEList.ManyInverse<ActivityNode>(ActivityNode.class, this, UML2Package.INTERRUPTIBLE_ACTIVITY_REGION__CONTAINED_NODE, UML2Package.ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION);
		}
		return containedNode;
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
			case UML2Package.INTERRUPTIBLE_ACTIVITY_REGION__INTERRUPTING_EDGE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInterruptingEdge()).basicAdd(otherEnd, msgs);
			case UML2Package.INTERRUPTIBLE_ACTIVITY_REGION__CONTAINED_NODE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getContainedNode()).basicAdd(otherEnd, msgs);
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
			case UML2Package.INTERRUPTIBLE_ACTIVITY_REGION__INTERRUPTING_EDGE:
				return ((InternalEList<?>)getInterruptingEdge()).basicRemove(otherEnd, msgs);
			case UML2Package.INTERRUPTIBLE_ACTIVITY_REGION__CONTAINED_NODE:
				return ((InternalEList<?>)getContainedNode()).basicRemove(otherEnd, msgs);
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
			case UML2Package.INTERRUPTIBLE_ACTIVITY_REGION__INTERRUPTING_EDGE:
				return getInterruptingEdge();
			case UML2Package.INTERRUPTIBLE_ACTIVITY_REGION__CONTAINED_NODE:
				return getContainedNode();
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
			case UML2Package.INTERRUPTIBLE_ACTIVITY_REGION__INTERRUPTING_EDGE:
				getInterruptingEdge().clear();
				getInterruptingEdge().addAll((Collection<? extends ActivityEdge>)newValue);
				return;
			case UML2Package.INTERRUPTIBLE_ACTIVITY_REGION__CONTAINED_NODE:
				getContainedNode().clear();
				getContainedNode().addAll((Collection<? extends ActivityNode>)newValue);
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
			case UML2Package.INTERRUPTIBLE_ACTIVITY_REGION__INTERRUPTING_EDGE:
				getInterruptingEdge().clear();
				return;
			case UML2Package.INTERRUPTIBLE_ACTIVITY_REGION__CONTAINED_NODE:
				getContainedNode().clear();
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
			case UML2Package.INTERRUPTIBLE_ACTIVITY_REGION__INTERRUPTING_EDGE:
				return interruptingEdge != null && !interruptingEdge.isEmpty();
			case UML2Package.INTERRUPTIBLE_ACTIVITY_REGION__CONTAINED_NODE:
				return containedNode != null && !containedNode.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InterruptibleActivityRegionImpl

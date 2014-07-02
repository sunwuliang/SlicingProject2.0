/**
 */
package org.csu.slicing.UML2.impl;

import java.util.Collection;

import org.csu.slicing.UML2.Activity;
import org.csu.slicing.UML2.ActivityEdge;
import org.csu.slicing.UML2.ActivityGroup;
import org.csu.slicing.UML2.ActivityNode;
import org.csu.slicing.UML2.ActivityPartition;
import org.csu.slicing.UML2.InterruptibleActivityRegion;
import org.csu.slicing.UML2.StructuredActivityNode;
import org.csu.slicing.UML2.UML2Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2.impl.ActivityNodeImpl#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.ActivityNodeImpl#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.ActivityNodeImpl#getInGroup <em>In Group</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.ActivityNodeImpl#getActivity <em>Activity</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.ActivityNodeImpl#getRedefinedElement <em>Redefined Element</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.ActivityNodeImpl#getInStructuredNode <em>In Structured Node</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.ActivityNodeImpl#getInPartition <em>In Partition</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.ActivityNodeImpl#getInInterruptibleRegion <em>In Interruptible Region</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ActivityNodeImpl extends RedefinableElementImpl implements ActivityNode {
	/**
	 * The cached value of the '{@link #getOutgoing() <em>Outgoing</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoing()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityEdge> outgoing;

	/**
	 * The cached value of the '{@link #getIncoming() <em>Incoming</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncoming()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityEdge> incoming;

	/**
	 * The cached value of the '{@link #getInGroup() <em>In Group</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityGroup> inGroup;

	/**
	 * The cached value of the '{@link #getRedefinedElement() <em>Redefined Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinedElement()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityNode> redefinedElement;

	/**
	 * The cached value of the '{@link #getInPartition() <em>In Partition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInPartition()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityPartition> inPartition;

	/**
	 * The cached value of the '{@link #getInInterruptibleRegion() <em>In Interruptible Region</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInInterruptibleRegion()
	 * @generated
	 * @ordered
	 */
	protected EList<InterruptibleActivityRegion> inInterruptibleRegion;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UML2Package.eINSTANCE.getActivityNode();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityEdge> getOutgoing() {
		if (outgoing == null) {
			outgoing = new EObjectWithInverseResolvingEList<ActivityEdge>(ActivityEdge.class, this, UML2Package.ACTIVITY_NODE__OUTGOING, UML2Package.ACTIVITY_EDGE__SOURCE);
		}
		return outgoing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityEdge> getIncoming() {
		if (incoming == null) {
			incoming = new EObjectWithInverseResolvingEList<ActivityEdge>(ActivityEdge.class, this, UML2Package.ACTIVITY_NODE__INCOMING, UML2Package.ACTIVITY_EDGE__TARGET);
		}
		return incoming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityGroup> getInGroup() {
		if (inGroup == null) {
			inGroup = new EObjectResolvingEList<ActivityGroup>(ActivityGroup.class, this, UML2Package.ACTIVITY_NODE__IN_GROUP);
		}
		return inGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity getActivity() {
		if (eContainerFeatureID() != UML2Package.ACTIVITY_NODE__ACTIVITY) return null;
		return (Activity)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActivity(Activity newActivity, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newActivity, UML2Package.ACTIVITY_NODE__ACTIVITY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivity(Activity newActivity) {
		if (newActivity != eInternalContainer() || (eContainerFeatureID() != UML2Package.ACTIVITY_NODE__ACTIVITY && newActivity != null)) {
			if (EcoreUtil.isAncestor(this, newActivity))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newActivity != null)
				msgs = ((InternalEObject)newActivity).eInverseAdd(this, UML2Package.ACTIVITY__NODE, Activity.class, msgs);
			msgs = basicSetActivity(newActivity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.ACTIVITY_NODE__ACTIVITY, newActivity, newActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityNode> getRedefinedElement() {
		if (redefinedElement == null) {
			redefinedElement = new EObjectResolvingEList<ActivityNode>(ActivityNode.class, this, UML2Package.ACTIVITY_NODE__REDEFINED_ELEMENT);
		}
		return redefinedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredActivityNode getInStructuredNode() {
		if (eContainerFeatureID() != UML2Package.ACTIVITY_NODE__IN_STRUCTURED_NODE) return null;
		return (StructuredActivityNode)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInStructuredNode(StructuredActivityNode newInStructuredNode, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newInStructuredNode, UML2Package.ACTIVITY_NODE__IN_STRUCTURED_NODE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInStructuredNode(StructuredActivityNode newInStructuredNode) {
		if (newInStructuredNode != eInternalContainer() || (eContainerFeatureID() != UML2Package.ACTIVITY_NODE__IN_STRUCTURED_NODE && newInStructuredNode != null)) {
			if (EcoreUtil.isAncestor(this, newInStructuredNode))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newInStructuredNode != null)
				msgs = ((InternalEObject)newInStructuredNode).eInverseAdd(this, UML2Package.STRUCTURED_ACTIVITY_NODE__CONTAINED_NODE, StructuredActivityNode.class, msgs);
			msgs = basicSetInStructuredNode(newInStructuredNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.ACTIVITY_NODE__IN_STRUCTURED_NODE, newInStructuredNode, newInStructuredNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityPartition> getInPartition() {
		if (inPartition == null) {
			inPartition = new EObjectWithInverseResolvingEList.ManyInverse<ActivityPartition>(ActivityPartition.class, this, UML2Package.ACTIVITY_NODE__IN_PARTITION, UML2Package.ACTIVITY_PARTITION__CONTAINED_NODE);
		}
		return inPartition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterruptibleActivityRegion> getInInterruptibleRegion() {
		if (inInterruptibleRegion == null) {
			inInterruptibleRegion = new EObjectWithInverseResolvingEList.ManyInverse<InterruptibleActivityRegion>(InterruptibleActivityRegion.class, this, UML2Package.ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION, UML2Package.INTERRUPTIBLE_ACTIVITY_REGION__CONTAINED_NODE);
		}
		return inInterruptibleRegion;
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
			case UML2Package.ACTIVITY_NODE__OUTGOING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoing()).basicAdd(otherEnd, msgs);
			case UML2Package.ACTIVITY_NODE__INCOMING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncoming()).basicAdd(otherEnd, msgs);
			case UML2Package.ACTIVITY_NODE__ACTIVITY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetActivity((Activity)otherEnd, msgs);
			case UML2Package.ACTIVITY_NODE__IN_STRUCTURED_NODE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetInStructuredNode((StructuredActivityNode)otherEnd, msgs);
			case UML2Package.ACTIVITY_NODE__IN_PARTITION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInPartition()).basicAdd(otherEnd, msgs);
			case UML2Package.ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInInterruptibleRegion()).basicAdd(otherEnd, msgs);
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
			case UML2Package.ACTIVITY_NODE__OUTGOING:
				return ((InternalEList<?>)getOutgoing()).basicRemove(otherEnd, msgs);
			case UML2Package.ACTIVITY_NODE__INCOMING:
				return ((InternalEList<?>)getIncoming()).basicRemove(otherEnd, msgs);
			case UML2Package.ACTIVITY_NODE__ACTIVITY:
				return basicSetActivity(null, msgs);
			case UML2Package.ACTIVITY_NODE__IN_STRUCTURED_NODE:
				return basicSetInStructuredNode(null, msgs);
			case UML2Package.ACTIVITY_NODE__IN_PARTITION:
				return ((InternalEList<?>)getInPartition()).basicRemove(otherEnd, msgs);
			case UML2Package.ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION:
				return ((InternalEList<?>)getInInterruptibleRegion()).basicRemove(otherEnd, msgs);
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
			case UML2Package.ACTIVITY_NODE__ACTIVITY:
				return eInternalContainer().eInverseRemove(this, UML2Package.ACTIVITY__NODE, Activity.class, msgs);
			case UML2Package.ACTIVITY_NODE__IN_STRUCTURED_NODE:
				return eInternalContainer().eInverseRemove(this, UML2Package.STRUCTURED_ACTIVITY_NODE__CONTAINED_NODE, StructuredActivityNode.class, msgs);
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
			case UML2Package.ACTIVITY_NODE__OUTGOING:
				return getOutgoing();
			case UML2Package.ACTIVITY_NODE__INCOMING:
				return getIncoming();
			case UML2Package.ACTIVITY_NODE__IN_GROUP:
				return getInGroup();
			case UML2Package.ACTIVITY_NODE__ACTIVITY:
				return getActivity();
			case UML2Package.ACTIVITY_NODE__REDEFINED_ELEMENT:
				return getRedefinedElement();
			case UML2Package.ACTIVITY_NODE__IN_STRUCTURED_NODE:
				return getInStructuredNode();
			case UML2Package.ACTIVITY_NODE__IN_PARTITION:
				return getInPartition();
			case UML2Package.ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION:
				return getInInterruptibleRegion();
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
			case UML2Package.ACTIVITY_NODE__OUTGOING:
				getOutgoing().clear();
				getOutgoing().addAll((Collection<? extends ActivityEdge>)newValue);
				return;
			case UML2Package.ACTIVITY_NODE__INCOMING:
				getIncoming().clear();
				getIncoming().addAll((Collection<? extends ActivityEdge>)newValue);
				return;
			case UML2Package.ACTIVITY_NODE__IN_GROUP:
				getInGroup().clear();
				getInGroup().addAll((Collection<? extends ActivityGroup>)newValue);
				return;
			case UML2Package.ACTIVITY_NODE__ACTIVITY:
				setActivity((Activity)newValue);
				return;
			case UML2Package.ACTIVITY_NODE__REDEFINED_ELEMENT:
				getRedefinedElement().clear();
				getRedefinedElement().addAll((Collection<? extends ActivityNode>)newValue);
				return;
			case UML2Package.ACTIVITY_NODE__IN_STRUCTURED_NODE:
				setInStructuredNode((StructuredActivityNode)newValue);
				return;
			case UML2Package.ACTIVITY_NODE__IN_PARTITION:
				getInPartition().clear();
				getInPartition().addAll((Collection<? extends ActivityPartition>)newValue);
				return;
			case UML2Package.ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION:
				getInInterruptibleRegion().clear();
				getInInterruptibleRegion().addAll((Collection<? extends InterruptibleActivityRegion>)newValue);
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
			case UML2Package.ACTIVITY_NODE__OUTGOING:
				getOutgoing().clear();
				return;
			case UML2Package.ACTIVITY_NODE__INCOMING:
				getIncoming().clear();
				return;
			case UML2Package.ACTIVITY_NODE__IN_GROUP:
				getInGroup().clear();
				return;
			case UML2Package.ACTIVITY_NODE__ACTIVITY:
				setActivity((Activity)null);
				return;
			case UML2Package.ACTIVITY_NODE__REDEFINED_ELEMENT:
				getRedefinedElement().clear();
				return;
			case UML2Package.ACTIVITY_NODE__IN_STRUCTURED_NODE:
				setInStructuredNode((StructuredActivityNode)null);
				return;
			case UML2Package.ACTIVITY_NODE__IN_PARTITION:
				getInPartition().clear();
				return;
			case UML2Package.ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION:
				getInInterruptibleRegion().clear();
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
			case UML2Package.ACTIVITY_NODE__OUTGOING:
				return outgoing != null && !outgoing.isEmpty();
			case UML2Package.ACTIVITY_NODE__INCOMING:
				return incoming != null && !incoming.isEmpty();
			case UML2Package.ACTIVITY_NODE__IN_GROUP:
				return inGroup != null && !inGroup.isEmpty();
			case UML2Package.ACTIVITY_NODE__ACTIVITY:
				return getActivity() != null;
			case UML2Package.ACTIVITY_NODE__REDEFINED_ELEMENT:
				return redefinedElement != null && !redefinedElement.isEmpty();
			case UML2Package.ACTIVITY_NODE__IN_STRUCTURED_NODE:
				return getInStructuredNode() != null;
			case UML2Package.ACTIVITY_NODE__IN_PARTITION:
				return inPartition != null && !inPartition.isEmpty();
			case UML2Package.ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION:
				return inInterruptibleRegion != null && !inInterruptibleRegion.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ActivityNodeImpl

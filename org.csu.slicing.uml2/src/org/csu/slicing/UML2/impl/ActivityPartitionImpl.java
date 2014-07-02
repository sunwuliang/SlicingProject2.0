/**
 */
package org.csu.slicing.UML2.impl;

import java.util.Collection;

import org.csu.slicing.UML2.Activity;
import org.csu.slicing.UML2.ActivityEdge;
import org.csu.slicing.UML2.ActivityGroup;
import org.csu.slicing.UML2.ActivityNode;
import org.csu.slicing.UML2.ActivityPartition;
import org.csu.slicing.UML2.Element;
import org.csu.slicing.UML2.UML2Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity Partition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2.impl.ActivityPartitionImpl#getSuperGroup <em>Super Group</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.ActivityPartitionImpl#getActivityGroup_activity <em>Activity Group activity</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.ActivityPartitionImpl#isIsDimension <em>Is Dimension</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.ActivityPartitionImpl#isIsExternal <em>Is External</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.ActivityPartitionImpl#getContainedEdge <em>Contained Edge</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.ActivityPartitionImpl#getContainedNode <em>Contained Node</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.ActivityPartitionImpl#getSubgroup <em>Subgroup</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.ActivityPartitionImpl#getSuperPartition <em>Super Partition</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.ActivityPartitionImpl#getRepresents <em>Represents</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActivityPartitionImpl extends NamedElementImpl implements ActivityPartition {
	/**
	 * The cached value of the '{@link #getSuperGroup() <em>Super Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperGroup()
	 * @generated
	 * @ordered
	 */
	protected ActivityGroup superGroup;

	/**
	 * The default value of the '{@link #isIsDimension() <em>Is Dimension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDimension()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DIMENSION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsDimension() <em>Is Dimension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDimension()
	 * @generated
	 * @ordered
	 */
	protected boolean isDimension = IS_DIMENSION_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsExternal() <em>Is External</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsExternal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_EXTERNAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsExternal() <em>Is External</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsExternal()
	 * @generated
	 * @ordered
	 */
	protected boolean isExternal = IS_EXTERNAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContainedEdge() <em>Contained Edge</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedEdge()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityEdge> containedEdge;

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
	 * The cached value of the '{@link #getSubgroup() <em>Subgroup</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubgroup()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityPartition> subgroup;

	/**
	 * The cached value of the '{@link #getRepresents() <em>Represents</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresents()
	 * @generated
	 * @ordered
	 */
	protected Element represents;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityPartitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UML2Package.eINSTANCE.getActivityPartition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityGroup getSuperGroup() {
		if (superGroup != null && superGroup.eIsProxy()) {
			InternalEObject oldSuperGroup = (InternalEObject)superGroup;
			superGroup = (ActivityGroup)eResolveProxy(oldSuperGroup);
			if (superGroup != oldSuperGroup) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2Package.ACTIVITY_PARTITION__SUPER_GROUP, oldSuperGroup, superGroup));
			}
		}
		return superGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityGroup basicGetSuperGroup() {
		return superGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuperGroup(ActivityGroup newSuperGroup) {
		ActivityGroup oldSuperGroup = superGroup;
		superGroup = newSuperGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.ACTIVITY_PARTITION__SUPER_GROUP, oldSuperGroup, superGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity getActivityGroup_activity() {
		if (eContainerFeatureID() != UML2Package.ACTIVITY_PARTITION__ACTIVITY_GROUP_ACTIVITY) return null;
		return (Activity)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActivityGroup_activity(Activity newActivityGroup_activity, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newActivityGroup_activity, UML2Package.ACTIVITY_PARTITION__ACTIVITY_GROUP_ACTIVITY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivityGroup_activity(Activity newActivityGroup_activity) {
		if (newActivityGroup_activity != eInternalContainer() || (eContainerFeatureID() != UML2Package.ACTIVITY_PARTITION__ACTIVITY_GROUP_ACTIVITY && newActivityGroup_activity != null)) {
			if (EcoreUtil.isAncestor(this, newActivityGroup_activity))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newActivityGroup_activity != null)
				msgs = ((InternalEObject)newActivityGroup_activity).eInverseAdd(this, UML2Package.ACTIVITY__GROUP, Activity.class, msgs);
			msgs = basicSetActivityGroup_activity(newActivityGroup_activity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.ACTIVITY_PARTITION__ACTIVITY_GROUP_ACTIVITY, newActivityGroup_activity, newActivityGroup_activity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsDimension() {
		return isDimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDimension(boolean newIsDimension) {
		boolean oldIsDimension = isDimension;
		isDimension = newIsDimension;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.ACTIVITY_PARTITION__IS_DIMENSION, oldIsDimension, isDimension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsExternal() {
		return isExternal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsExternal(boolean newIsExternal) {
		boolean oldIsExternal = isExternal;
		isExternal = newIsExternal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.ACTIVITY_PARTITION__IS_EXTERNAL, oldIsExternal, isExternal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityEdge> getContainedEdge() {
		if (containedEdge == null) {
			containedEdge = new EObjectWithInverseResolvingEList.ManyInverse<ActivityEdge>(ActivityEdge.class, this, UML2Package.ACTIVITY_PARTITION__CONTAINED_EDGE, UML2Package.ACTIVITY_EDGE__IN_PARTITION);
		}
		return containedEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityNode> getContainedNode() {
		if (containedNode == null) {
			containedNode = new EObjectWithInverseResolvingEList.ManyInverse<ActivityNode>(ActivityNode.class, this, UML2Package.ACTIVITY_PARTITION__CONTAINED_NODE, UML2Package.ACTIVITY_NODE__IN_PARTITION);
		}
		return containedNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityPartition> getSubgroup() {
		if (subgroup == null) {
			subgroup = new EObjectContainmentWithInverseEList<ActivityPartition>(ActivityPartition.class, this, UML2Package.ACTIVITY_PARTITION__SUBGROUP, UML2Package.ACTIVITY_PARTITION__SUPER_PARTITION);
		}
		return subgroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityPartition getSuperPartition() {
		if (eContainerFeatureID() != UML2Package.ACTIVITY_PARTITION__SUPER_PARTITION) return null;
		return (ActivityPartition)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSuperPartition(ActivityPartition newSuperPartition, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSuperPartition, UML2Package.ACTIVITY_PARTITION__SUPER_PARTITION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuperPartition(ActivityPartition newSuperPartition) {
		if (newSuperPartition != eInternalContainer() || (eContainerFeatureID() != UML2Package.ACTIVITY_PARTITION__SUPER_PARTITION && newSuperPartition != null)) {
			if (EcoreUtil.isAncestor(this, newSuperPartition))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSuperPartition != null)
				msgs = ((InternalEObject)newSuperPartition).eInverseAdd(this, UML2Package.ACTIVITY_PARTITION__SUBGROUP, ActivityPartition.class, msgs);
			msgs = basicSetSuperPartition(newSuperPartition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.ACTIVITY_PARTITION__SUPER_PARTITION, newSuperPartition, newSuperPartition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getRepresents() {
		if (represents != null && represents.eIsProxy()) {
			InternalEObject oldRepresents = (InternalEObject)represents;
			represents = (Element)eResolveProxy(oldRepresents);
			if (represents != oldRepresents) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2Package.ACTIVITY_PARTITION__REPRESENTS, oldRepresents, represents));
			}
		}
		return represents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetRepresents() {
		return represents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepresents(Element newRepresents) {
		Element oldRepresents = represents;
		represents = newRepresents;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.ACTIVITY_PARTITION__REPRESENTS, oldRepresents, represents));
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
			case UML2Package.ACTIVITY_PARTITION__ACTIVITY_GROUP_ACTIVITY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetActivityGroup_activity((Activity)otherEnd, msgs);
			case UML2Package.ACTIVITY_PARTITION__CONTAINED_EDGE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getContainedEdge()).basicAdd(otherEnd, msgs);
			case UML2Package.ACTIVITY_PARTITION__CONTAINED_NODE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getContainedNode()).basicAdd(otherEnd, msgs);
			case UML2Package.ACTIVITY_PARTITION__SUBGROUP:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubgroup()).basicAdd(otherEnd, msgs);
			case UML2Package.ACTIVITY_PARTITION__SUPER_PARTITION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSuperPartition((ActivityPartition)otherEnd, msgs);
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
			case UML2Package.ACTIVITY_PARTITION__ACTIVITY_GROUP_ACTIVITY:
				return basicSetActivityGroup_activity(null, msgs);
			case UML2Package.ACTIVITY_PARTITION__CONTAINED_EDGE:
				return ((InternalEList<?>)getContainedEdge()).basicRemove(otherEnd, msgs);
			case UML2Package.ACTIVITY_PARTITION__CONTAINED_NODE:
				return ((InternalEList<?>)getContainedNode()).basicRemove(otherEnd, msgs);
			case UML2Package.ACTIVITY_PARTITION__SUBGROUP:
				return ((InternalEList<?>)getSubgroup()).basicRemove(otherEnd, msgs);
			case UML2Package.ACTIVITY_PARTITION__SUPER_PARTITION:
				return basicSetSuperPartition(null, msgs);
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
			case UML2Package.ACTIVITY_PARTITION__ACTIVITY_GROUP_ACTIVITY:
				return eInternalContainer().eInverseRemove(this, UML2Package.ACTIVITY__GROUP, Activity.class, msgs);
			case UML2Package.ACTIVITY_PARTITION__SUPER_PARTITION:
				return eInternalContainer().eInverseRemove(this, UML2Package.ACTIVITY_PARTITION__SUBGROUP, ActivityPartition.class, msgs);
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
			case UML2Package.ACTIVITY_PARTITION__SUPER_GROUP:
				if (resolve) return getSuperGroup();
				return basicGetSuperGroup();
			case UML2Package.ACTIVITY_PARTITION__ACTIVITY_GROUP_ACTIVITY:
				return getActivityGroup_activity();
			case UML2Package.ACTIVITY_PARTITION__IS_DIMENSION:
				return isIsDimension();
			case UML2Package.ACTIVITY_PARTITION__IS_EXTERNAL:
				return isIsExternal();
			case UML2Package.ACTIVITY_PARTITION__CONTAINED_EDGE:
				return getContainedEdge();
			case UML2Package.ACTIVITY_PARTITION__CONTAINED_NODE:
				return getContainedNode();
			case UML2Package.ACTIVITY_PARTITION__SUBGROUP:
				return getSubgroup();
			case UML2Package.ACTIVITY_PARTITION__SUPER_PARTITION:
				return getSuperPartition();
			case UML2Package.ACTIVITY_PARTITION__REPRESENTS:
				if (resolve) return getRepresents();
				return basicGetRepresents();
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
			case UML2Package.ACTIVITY_PARTITION__SUPER_GROUP:
				setSuperGroup((ActivityGroup)newValue);
				return;
			case UML2Package.ACTIVITY_PARTITION__ACTIVITY_GROUP_ACTIVITY:
				setActivityGroup_activity((Activity)newValue);
				return;
			case UML2Package.ACTIVITY_PARTITION__IS_DIMENSION:
				setIsDimension((Boolean)newValue);
				return;
			case UML2Package.ACTIVITY_PARTITION__IS_EXTERNAL:
				setIsExternal((Boolean)newValue);
				return;
			case UML2Package.ACTIVITY_PARTITION__CONTAINED_EDGE:
				getContainedEdge().clear();
				getContainedEdge().addAll((Collection<? extends ActivityEdge>)newValue);
				return;
			case UML2Package.ACTIVITY_PARTITION__CONTAINED_NODE:
				getContainedNode().clear();
				getContainedNode().addAll((Collection<? extends ActivityNode>)newValue);
				return;
			case UML2Package.ACTIVITY_PARTITION__SUBGROUP:
				getSubgroup().clear();
				getSubgroup().addAll((Collection<? extends ActivityPartition>)newValue);
				return;
			case UML2Package.ACTIVITY_PARTITION__SUPER_PARTITION:
				setSuperPartition((ActivityPartition)newValue);
				return;
			case UML2Package.ACTIVITY_PARTITION__REPRESENTS:
				setRepresents((Element)newValue);
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
			case UML2Package.ACTIVITY_PARTITION__SUPER_GROUP:
				setSuperGroup((ActivityGroup)null);
				return;
			case UML2Package.ACTIVITY_PARTITION__ACTIVITY_GROUP_ACTIVITY:
				setActivityGroup_activity((Activity)null);
				return;
			case UML2Package.ACTIVITY_PARTITION__IS_DIMENSION:
				setIsDimension(IS_DIMENSION_EDEFAULT);
				return;
			case UML2Package.ACTIVITY_PARTITION__IS_EXTERNAL:
				setIsExternal(IS_EXTERNAL_EDEFAULT);
				return;
			case UML2Package.ACTIVITY_PARTITION__CONTAINED_EDGE:
				getContainedEdge().clear();
				return;
			case UML2Package.ACTIVITY_PARTITION__CONTAINED_NODE:
				getContainedNode().clear();
				return;
			case UML2Package.ACTIVITY_PARTITION__SUBGROUP:
				getSubgroup().clear();
				return;
			case UML2Package.ACTIVITY_PARTITION__SUPER_PARTITION:
				setSuperPartition((ActivityPartition)null);
				return;
			case UML2Package.ACTIVITY_PARTITION__REPRESENTS:
				setRepresents((Element)null);
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
			case UML2Package.ACTIVITY_PARTITION__SUPER_GROUP:
				return superGroup != null;
			case UML2Package.ACTIVITY_PARTITION__ACTIVITY_GROUP_ACTIVITY:
				return getActivityGroup_activity() != null;
			case UML2Package.ACTIVITY_PARTITION__IS_DIMENSION:
				return isDimension != IS_DIMENSION_EDEFAULT;
			case UML2Package.ACTIVITY_PARTITION__IS_EXTERNAL:
				return isExternal != IS_EXTERNAL_EDEFAULT;
			case UML2Package.ACTIVITY_PARTITION__CONTAINED_EDGE:
				return containedEdge != null && !containedEdge.isEmpty();
			case UML2Package.ACTIVITY_PARTITION__CONTAINED_NODE:
				return containedNode != null && !containedNode.isEmpty();
			case UML2Package.ACTIVITY_PARTITION__SUBGROUP:
				return subgroup != null && !subgroup.isEmpty();
			case UML2Package.ACTIVITY_PARTITION__SUPER_PARTITION:
				return getSuperPartition() != null;
			case UML2Package.ACTIVITY_PARTITION__REPRESENTS:
				return represents != null;
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
		if (baseClass == ActivityGroup.class) {
			switch (derivedFeatureID) {
				case UML2Package.ACTIVITY_PARTITION__SUPER_GROUP: return UML2Package.ACTIVITY_GROUP__SUPER_GROUP;
				case UML2Package.ACTIVITY_PARTITION__ACTIVITY_GROUP_ACTIVITY: return UML2Package.ACTIVITY_GROUP__ACTIVITY_GROUP_ACTIVITY;
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
		if (baseClass == ActivityGroup.class) {
			switch (baseFeatureID) {
				case UML2Package.ACTIVITY_GROUP__SUPER_GROUP: return UML2Package.ACTIVITY_PARTITION__SUPER_GROUP;
				case UML2Package.ACTIVITY_GROUP__ACTIVITY_GROUP_ACTIVITY: return UML2Package.ACTIVITY_PARTITION__ACTIVITY_GROUP_ACTIVITY;
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
		result.append(" (isDimension: ");
		result.append(isDimension);
		result.append(", isExternal: ");
		result.append(isExternal);
		result.append(')');
		return result.toString();
	}

} //ActivityPartitionImpl

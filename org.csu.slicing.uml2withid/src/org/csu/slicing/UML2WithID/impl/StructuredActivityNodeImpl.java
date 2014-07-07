/**
 */
package org.csu.slicing.UML2WithID.impl;

import java.util.Collection;

import org.csu.slicing.UML2WithID.Activity;
import org.csu.slicing.UML2WithID.ActivityEdge;
import org.csu.slicing.UML2WithID.ActivityGroup;
import org.csu.slicing.UML2WithID.ActivityNode;
import org.csu.slicing.UML2WithID.Constraint;
import org.csu.slicing.UML2WithID.ElementImport;
import org.csu.slicing.UML2WithID.NamedElement;
import org.csu.slicing.UML2WithID.Namespace;
import org.csu.slicing.UML2WithID.PackageImport;
import org.csu.slicing.UML2WithID.PackageableElement;
import org.csu.slicing.UML2WithID.StructuredActivityNode;
import org.csu.slicing.UML2WithID.UML2WithIDPackage;
import org.csu.slicing.UML2WithID.Variable;

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
 * An implementation of the model object '<em><b>Structured Activity Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.StructuredActivityNodeImpl#getMember <em>Member</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.StructuredActivityNodeImpl#getOwnedRule <em>Owned Rule</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.StructuredActivityNodeImpl#getImportedMember <em>Imported Member</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.StructuredActivityNodeImpl#getElementImport <em>Element Import</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.StructuredActivityNodeImpl#getPackageImport <em>Package Import</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.StructuredActivityNodeImpl#getSuperGroup <em>Super Group</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.StructuredActivityNodeImpl#getActivityGroup_activity <em>Activity Group activity</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.StructuredActivityNodeImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.StructuredActivityNodeImpl#getContainedNode <em>Contained Node</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.StructuredActivityNodeImpl#getContainedEdge <em>Contained Edge</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.StructuredActivityNodeImpl#isMustIsolate <em>Must Isolate</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StructuredActivityNodeImpl extends ActionImpl implements StructuredActivityNode {
	/**
	 * The cached value of the '{@link #getMember() <em>Member</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMember()
	 * @generated
	 * @ordered
	 */
	protected EList<NamedElement> member;

	/**
	 * The cached value of the '{@link #getOwnedRule() <em>Owned Rule</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedRule()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> ownedRule;

	/**
	 * The cached value of the '{@link #getImportedMember() <em>Imported Member</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportedMember()
	 * @generated
	 * @ordered
	 */
	protected EList<PackageableElement> importedMember;

	/**
	 * The cached value of the '{@link #getElementImport() <em>Element Import</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementImport()
	 * @generated
	 * @ordered
	 */
	protected EList<ElementImport> elementImport;

	/**
	 * The cached value of the '{@link #getPackageImport() <em>Package Import</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageImport()
	 * @generated
	 * @ordered
	 */
	protected EList<PackageImport> packageImport;

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
	 * The cached value of the '{@link #getVariable() <em>Variable</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariable()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> variable;

	/**
	 * The cached value of the '{@link #getContainedNode() <em>Contained Node</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedNode()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityNode> containedNode;

	/**
	 * The cached value of the '{@link #getContainedEdge() <em>Contained Edge</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedEdge()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityEdge> containedEdge;

	/**
	 * The default value of the '{@link #isMustIsolate() <em>Must Isolate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMustIsolate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MUST_ISOLATE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMustIsolate() <em>Must Isolate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMustIsolate()
	 * @generated
	 * @ordered
	 */
	protected boolean mustIsolate = MUST_ISOLATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructuredActivityNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UML2WithIDPackage.eINSTANCE.getStructuredActivityNode();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NamedElement> getMember() {
		if (member == null) {
			member = new EObjectResolvingEList<NamedElement>(NamedElement.class, this, UML2WithIDPackage.STRUCTURED_ACTIVITY_NODE__MEMBER);
		}
		return member;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getOwnedRule() {
		if (ownedRule == null) {
			ownedRule = new EObjectContainmentWithInverseEList<Constraint>(Constraint.class, this, UML2WithIDPackage.STRUCTURED_ACTIVITY_NODE__OWNED_RULE, UML2WithIDPackage.CONSTRAINT__NAMESPACE);
		}
		return ownedRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PackageableElement> getImportedMember() {
		if (importedMember == null) {
			importedMember = new EObjectResolvingEList<PackageableElement>(PackageableElement.class, this, UML2WithIDPackage.STRUCTURED_ACTIVITY_NODE__IMPORTED_MEMBER);
		}
		return importedMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ElementImport> getElementImport() {
		if (elementImport == null) {
			elementImport = new EObjectContainmentWithInverseEList<ElementImport>(ElementImport.class, this, UML2WithIDPackage.STRUCTURED_ACTIVITY_NODE__ELEMENT_IMPORT, UML2WithIDPackage.ELEMENT_IMPORT__IMPORTING_NAMESPACE);
		}
		return elementImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PackageImport> getPackageImport() {
		if (packageImport == null) {
			packageImport = new EObjectContainmentWithInverseEList<PackageImport>(PackageImport.class, this, UML2WithIDPackage.STRUCTURED_ACTIVITY_NODE__PACKAGE_IMPORT, UML2WithIDPackage.PACKAGE_IMPORT__IMPORTING_NAMESPACE);
		}
		return packageImport;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2WithIDPackage.STRUCTURED_ACTIVITY_NODE__SUPER_GROUP, oldSuperGroup, superGroup));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UML2WithIDPackage.STRUCTURED_ACTIVITY_NODE__SUPER_GROUP, oldSuperGroup, superGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity getActivityGroup_activity() {
		if (eContainerFeatureID() != UML2WithIDPackage.STRUCTURED_ACTIVITY_NODE__ACTIVITY_GROUP_ACTIVITY) return null;
		return (Activity)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActivityGroup_activity(Activity newActivityGroup_activity, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newActivityGroup_activity, UML2WithIDPackage.STRUCTURED_ACTIVITY_NODE__ACTIVITY_GROUP_ACTIVITY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivityGroup_activity(Activity newActivityGroup_activity) {
		if (newActivityGroup_activity != eInternalContainer() || (eContainerFeatureID() != UML2WithIDPackage.STRUCTURED_ACTIVITY_NODE__ACTIVITY_GROUP_ACTIVITY && newActivityGroup_activity != null)) {
			if (EcoreUtil.isAncestor(this, newActivityGroup_activity))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newActivityGroup_activity != null)
				msgs = ((InternalEObject)newActivityGroup_activity).eInverseAdd(this, UML2WithIDPackage.ACTIVITY__GROUP, Activity.class, msgs);
			msgs = basicSetActivityGroup_activity(newActivityGroup_activity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2WithIDPackage.STRUCTURED_ACTIVITY_NODE__ACTIVITY_GROUP_ACTIVITY, newActivityGroup_activity, newActivityGroup_activity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getVariable() {
		if (variable == null) {
			variable = new EObjectContainmentWithInverseEList<Variable>(Variable.class, this, UML2WithIDPackage.STRUCTURED_ACTIVITY_NODE__VARIABLE, UML2WithIDPackage.VARIABLE__SCOPE);
		}
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityNode> getContainedNode() {
		if (containedNode == null) {
			containedNode = new EObjectContainmentWithInverseEList<ActivityNode>(ActivityNode.class, this, UML2WithIDPackage.STRUCTURED_ACTIVITY_NODE__CONTAINED_NODE, UML2WithIDPackage.ACTIVITY_NODE__IN_STRUCTURED_NODE);
		}
		return containedNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityEdge> getContainedEdge() {
		if (containedEdge == null) {
			containedEdge = new EObjectContainmentWithInverseEList<ActivityEdge>(ActivityEdge.class, this, UML2WithIDPackage.STRUCTURED_ACTIVITY_NODE__CONTAINED_EDGE, UML2WithIDPackage.ACTIVITY_EDGE__IN_STRUCTURED_NODE);
		}
		return containedEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMustIsolate() {
		return mustIsolate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMustIsolate(boolean newMustIsolate) {
		boolean oldMustIsolate = mustIsolate;
		mustIsolate = newMustIsolate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2WithIDPackage.STRUCTURED_ACTIVITY_NODE__MUST_ISOLATE, oldMustIsolate, mustIsolate));
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
			case UML2WithIDPackage.STRUCTURED_ACTIVITY_NODE__OWNED_RULE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedRule()).basicAdd(otherEnd, msgs);
			case UML2WithIDPackage.STRUCTURED_ACTIVITY_NODE__ELEMENT_IMPORT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getElementImport()).basicAdd(otherEnd, msgs);
			case UML2WithIDPackage.STRUCTURED_ACTIVITY_NODE__PACKAGE_IMPORT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPackageImport()).basicAdd(otherEnd, msgs);
			case UML2WithIDPackage.STRUCTURED_ACTIVITY_NODE__ACTIVITY_GROUP_ACTIVITY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetActivityGroup_activity((Activity)otherEnd, msgs);
			case UML2WithIDPackage.STRUCTURED_ACTIVITY_NODE__VARIABLE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getVariable()).basicAdd(otherEnd, msgs);
			case UML2WithIDPackage.STRUCTURED_ACTIVITY_NODE__CONTAINED_NODE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getContainedNode()).basicAdd(otherEnd, msgs);
			case UML2WithIDPackage.STRUCTURED_ACTIVITY_NODE__CONTAINED_EDGE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getContainedEdge()).basicAdd(otherEnd, msgs);
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
			case UML2WithIDPackage.STRUCTURED_ACTIVITY_NODE__OWNED_RULE:
				return ((InternalEList<?>)getOwnedRule()).basicRemove(otherEnd, msgs);
			case UML2WithIDPackage.STRUCTURED_ACTIVITY_NODE__ELEMENT_IMPORT:
				return ((InternalEList<?>)getElementImport()).basicRemove(otherEnd, msgs);
			case UML2WithIDPackage.STRUCTURED_ACTIVITY_NODE__PACKAGE_IMPORT:
				return ((InternalEList<?>)getPackageImport()).basicRemove(otherEnd, msgs);
			case UML2WithIDPackage.STRUCTURED_ACTIVITY_NODE__ACTIVITY_GROUP_ACTIVITY:
				return basicSetActivityGroup_activity(null, msgs);
			case UML2WithIDPackage.STRUCTURED_ACTIVITY_NODE__VARIABLE:
				return ((InternalEList<?>)getVariable()).basicRemove(otherEnd, msgs);
			case UML2WithIDPackage.STRUCTURED_ACTIVITY_NODE__CONTAINED_NODE:
				return ((InternalEList<?>)getContainedNode()).basicRemove(otherEnd, msgs);
			case UML2WithIDPackage.STRUCTURED_ACTIVITY_NODE__CONTAINED_EDGE:
				return ((InternalEList<?>)getContainedEdge()).basicRemove(otherEnd, msgs);
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
			case UML2WithIDPackage.STRUCTURED_ACTIVITY_NODE__ACTIVITY_GROUP_ACTIVITY:
				return eInternalContainer().eInverseRemove(this, UML2WithIDPackage.ACTIVITY__GROUP, Activity.class, msgs);
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
			case UML2WithIDPackage.STRUCTURED_ACTIVITY_NODE__MEMBER:
				return getMember();
			case UML2WithIDPackage.STRUCTURED_ACTIVITY_NODE__OWNED_RULE:
				return getOwnedRule();
			case UML2WithIDPackage.STRUCTURED_ACTIVITY_NODE__IMPORTED_MEMBER:
				return getImportedMember();
			case UML2WithIDPackage.STRUCTURED_ACTIVITY_NODE__ELEMENT_IMPORT:
				return getElementImport();
			case UML2WithIDPackage.STRUCTURED_ACTIVITY_NODE__PACKAGE_IMPORT:
				return getPackageImport();
			case UML2WithIDPackage.STRUCTURED_ACTIVITY_NODE__SUPER_GROUP:
				if (resolve) return getSuperGroup();
				return basicGetSuperGroup();
			case UML2WithIDPackage.STRUCTURED_ACTIVITY_NODE__ACTIVITY_GROUP_ACTIVITY:
				return getActivityGroup_activity();
			case UML2WithIDPackage.STRUCTURED_ACTIVITY_NODE__VARIABLE:
				return getVariable();
			case UML2WithIDPackage.STRUCTURED_ACTIVITY_NODE__CONTAINED_NODE:
				return getContainedNode();
			case UML2WithIDPackage.STRUCTURED_ACTIVITY_NODE__CONTAINED_EDGE:
				return getContainedEdge();
			case UML2WithIDPackage.STRUCTURED_ACTIVITY_NODE__MUST_ISOLATE:
				return isMustIsolate();
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
			case UML2WithIDPackage.STRUCTURED_ACTIVITY_NODE__MEMBER:
				getMember().clear();
				getMember().addAll((Collection<? extends NamedElement>)newValue);
				return;
			case UML2WithIDPackage.STRUCTURED_ACTIVITY_NODE__OWNED_RULE:
				getOwnedRule().clear();
				getOwnedRule().addAll((Collection<? extends Constraint>)newValue);
				return;
			case UML2WithIDPackage.STRUCTURED_ACTIVITY_NODE__IMPORTED_MEMBER:
				getImportedMember().clear();
				getImportedMember().addAll((Collection<? extends PackageableElement>)newValue);
				return;
			case UML2WithIDPackage.STRUCTURED_ACTIVITY_NODE__ELEMENT_IMPORT:
				getElementImport().clear();
				getElementImport().addAll((Collection<? extends ElementImport>)newValue);
				return;
			case UML2WithIDPackage.STRUCTURED_ACTIVITY_NODE__PACKAGE_IMPORT:
				getPackageImport().clear();
				getPackageImport().addAll((Collection<? extends PackageImport>)newValue);
				return;
			case UML2WithIDPackage.STRUCTURED_ACTIVITY_NODE__SUPER_GROUP:
				setSuperGroup((ActivityGroup)newValue);
				return;
			case UML2WithIDPackage.STRUCTURED_ACTIVITY_NODE__ACTIVITY_GROUP_ACTIVITY:
				setActivityGroup_activity((Activity)newValue);
				return;
			case UML2WithIDPackage.STRUCTURED_ACTIVITY_NODE__VARIABLE:
				getVariable().clear();
				getVariable().addAll((Collection<? extends Variable>)newValue);
				return;
			case UML2WithIDPackage.STRUCTURED_ACTIVITY_NODE__CONTAINED_NODE:
				getContainedNode().clear();
				getContainedNode().addAll((Collection<? extends ActivityNode>)newValue);
				return;
			case UML2WithIDPackage.STRUCTURED_ACTIVITY_NODE__CONTAINED_EDGE:
				getContainedEdge().clear();
				getContainedEdge().addAll((Collection<? extends ActivityEdge>)newValue);
				return;
			case UML2WithIDPackage.STRUCTURED_ACTIVITY_NODE__MUST_ISOLATE:
				setMustIsolate((Boolean)newValue);
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
			case UML2WithIDPackage.STRUCTURED_ACTIVITY_NODE__MEMBER:
				getMember().clear();
				return;
			case UML2WithIDPackage.STRUCTURED_ACTIVITY_NODE__OWNED_RULE:
				getOwnedRule().clear();
				return;
			case UML2WithIDPackage.STRUCTURED_ACTIVITY_NODE__IMPORTED_MEMBER:
				getImportedMember().clear();
				return;
			case UML2WithIDPackage.STRUCTURED_ACTIVITY_NODE__ELEMENT_IMPORT:
				getElementImport().clear();
				return;
			case UML2WithIDPackage.STRUCTURED_ACTIVITY_NODE__PACKAGE_IMPORT:
				getPackageImport().clear();
				return;
			case UML2WithIDPackage.STRUCTURED_ACTIVITY_NODE__SUPER_GROUP:
				setSuperGroup((ActivityGroup)null);
				return;
			case UML2WithIDPackage.STRUCTURED_ACTIVITY_NODE__ACTIVITY_GROUP_ACTIVITY:
				setActivityGroup_activity((Activity)null);
				return;
			case UML2WithIDPackage.STRUCTURED_ACTIVITY_NODE__VARIABLE:
				getVariable().clear();
				return;
			case UML2WithIDPackage.STRUCTURED_ACTIVITY_NODE__CONTAINED_NODE:
				getContainedNode().clear();
				return;
			case UML2WithIDPackage.STRUCTURED_ACTIVITY_NODE__CONTAINED_EDGE:
				getContainedEdge().clear();
				return;
			case UML2WithIDPackage.STRUCTURED_ACTIVITY_NODE__MUST_ISOLATE:
				setMustIsolate(MUST_ISOLATE_EDEFAULT);
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
			case UML2WithIDPackage.STRUCTURED_ACTIVITY_NODE__MEMBER:
				return member != null && !member.isEmpty();
			case UML2WithIDPackage.STRUCTURED_ACTIVITY_NODE__OWNED_RULE:
				return ownedRule != null && !ownedRule.isEmpty();
			case UML2WithIDPackage.STRUCTURED_ACTIVITY_NODE__IMPORTED_MEMBER:
				return importedMember != null && !importedMember.isEmpty();
			case UML2WithIDPackage.STRUCTURED_ACTIVITY_NODE__ELEMENT_IMPORT:
				return elementImport != null && !elementImport.isEmpty();
			case UML2WithIDPackage.STRUCTURED_ACTIVITY_NODE__PACKAGE_IMPORT:
				return packageImport != null && !packageImport.isEmpty();
			case UML2WithIDPackage.STRUCTURED_ACTIVITY_NODE__SUPER_GROUP:
				return superGroup != null;
			case UML2WithIDPackage.STRUCTURED_ACTIVITY_NODE__ACTIVITY_GROUP_ACTIVITY:
				return getActivityGroup_activity() != null;
			case UML2WithIDPackage.STRUCTURED_ACTIVITY_NODE__VARIABLE:
				return variable != null && !variable.isEmpty();
			case UML2WithIDPackage.STRUCTURED_ACTIVITY_NODE__CONTAINED_NODE:
				return containedNode != null && !containedNode.isEmpty();
			case UML2WithIDPackage.STRUCTURED_ACTIVITY_NODE__CONTAINED_EDGE:
				return containedEdge != null && !containedEdge.isEmpty();
			case UML2WithIDPackage.STRUCTURED_ACTIVITY_NODE__MUST_ISOLATE:
				return mustIsolate != MUST_ISOLATE_EDEFAULT;
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
		if (baseClass == Namespace.class) {
			switch (derivedFeatureID) {
				case UML2WithIDPackage.STRUCTURED_ACTIVITY_NODE__MEMBER: return UML2WithIDPackage.NAMESPACE__MEMBER;
				case UML2WithIDPackage.STRUCTURED_ACTIVITY_NODE__OWNED_RULE: return UML2WithIDPackage.NAMESPACE__OWNED_RULE;
				case UML2WithIDPackage.STRUCTURED_ACTIVITY_NODE__IMPORTED_MEMBER: return UML2WithIDPackage.NAMESPACE__IMPORTED_MEMBER;
				case UML2WithIDPackage.STRUCTURED_ACTIVITY_NODE__ELEMENT_IMPORT: return UML2WithIDPackage.NAMESPACE__ELEMENT_IMPORT;
				case UML2WithIDPackage.STRUCTURED_ACTIVITY_NODE__PACKAGE_IMPORT: return UML2WithIDPackage.NAMESPACE__PACKAGE_IMPORT;
				default: return -1;
			}
		}
		if (baseClass == ActivityGroup.class) {
			switch (derivedFeatureID) {
				case UML2WithIDPackage.STRUCTURED_ACTIVITY_NODE__SUPER_GROUP: return UML2WithIDPackage.ACTIVITY_GROUP__SUPER_GROUP;
				case UML2WithIDPackage.STRUCTURED_ACTIVITY_NODE__ACTIVITY_GROUP_ACTIVITY: return UML2WithIDPackage.ACTIVITY_GROUP__ACTIVITY_GROUP_ACTIVITY;
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
		if (baseClass == Namespace.class) {
			switch (baseFeatureID) {
				case UML2WithIDPackage.NAMESPACE__MEMBER: return UML2WithIDPackage.STRUCTURED_ACTIVITY_NODE__MEMBER;
				case UML2WithIDPackage.NAMESPACE__OWNED_RULE: return UML2WithIDPackage.STRUCTURED_ACTIVITY_NODE__OWNED_RULE;
				case UML2WithIDPackage.NAMESPACE__IMPORTED_MEMBER: return UML2WithIDPackage.STRUCTURED_ACTIVITY_NODE__IMPORTED_MEMBER;
				case UML2WithIDPackage.NAMESPACE__ELEMENT_IMPORT: return UML2WithIDPackage.STRUCTURED_ACTIVITY_NODE__ELEMENT_IMPORT;
				case UML2WithIDPackage.NAMESPACE__PACKAGE_IMPORT: return UML2WithIDPackage.STRUCTURED_ACTIVITY_NODE__PACKAGE_IMPORT;
				default: return -1;
			}
		}
		if (baseClass == ActivityGroup.class) {
			switch (baseFeatureID) {
				case UML2WithIDPackage.ACTIVITY_GROUP__SUPER_GROUP: return UML2WithIDPackage.STRUCTURED_ACTIVITY_NODE__SUPER_GROUP;
				case UML2WithIDPackage.ACTIVITY_GROUP__ACTIVITY_GROUP_ACTIVITY: return UML2WithIDPackage.STRUCTURED_ACTIVITY_NODE__ACTIVITY_GROUP_ACTIVITY;
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
		result.append(" (mustIsolate: ");
		result.append(mustIsolate);
		result.append(')');
		return result.toString();
	}

} //StructuredActivityNodeImpl

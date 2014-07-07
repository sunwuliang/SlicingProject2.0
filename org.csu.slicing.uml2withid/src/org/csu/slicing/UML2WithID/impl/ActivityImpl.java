/**
 */
package org.csu.slicing.UML2WithID.impl;

import java.util.Collection;

import org.csu.slicing.UML2WithID.Action;
import org.csu.slicing.UML2WithID.Activity;
import org.csu.slicing.UML2WithID.ActivityEdge;
import org.csu.slicing.UML2WithID.ActivityGroup;
import org.csu.slicing.UML2WithID.ActivityNode;
import org.csu.slicing.UML2WithID.StructuredActivityNode;
import org.csu.slicing.UML2WithID.UML2WithIDPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.ActivityImpl#getBody <em>Body</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.ActivityImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.ActivityImpl#getEdge <em>Edge</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.ActivityImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.ActivityImpl#getNode <em>Node</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.ActivityImpl#getAction <em>Action</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.ActivityImpl#getStructuredNode <em>Structured Node</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.ActivityImpl#isIsSingleExecution <em>Is Single Execution</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.ActivityImpl#isIsReadOnly <em>Is Read Only</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActivityImpl extends BehaviorImpl implements Activity {
	/**
	 * The default value of the '{@link #getBody() <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected static final String BODY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected String body = BODY_EDEFAULT;

	/**
	 * The default value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final String LANGUAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected String language = LANGUAGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEdge() <em>Edge</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdge()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityEdge> edge;

	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityGroup> group;

	/**
	 * The cached value of the '{@link #getNode() <em>Node</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNode()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityNode> node;

	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> action;

	/**
	 * The cached value of the '{@link #getStructuredNode() <em>Structured Node</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructuredNode()
	 * @generated
	 * @ordered
	 */
	protected EList<StructuredActivityNode> structuredNode;

	/**
	 * The default value of the '{@link #isIsSingleExecution() <em>Is Single Execution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSingleExecution()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_SINGLE_EXECUTION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsSingleExecution() <em>Is Single Execution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSingleExecution()
	 * @generated
	 * @ordered
	 */
	protected boolean isSingleExecution = IS_SINGLE_EXECUTION_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsReadOnly() <em>Is Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsReadOnly()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_READ_ONLY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsReadOnly() <em>Is Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsReadOnly()
	 * @generated
	 * @ordered
	 */
	protected boolean isReadOnly = IS_READ_ONLY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UML2WithIDPackage.eINSTANCE.getActivity();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBody() {
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBody(String newBody) {
		String oldBody = body;
		body = newBody;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2WithIDPackage.ACTIVITY__BODY, oldBody, body));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLanguage(String newLanguage) {
		String oldLanguage = language;
		language = newLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2WithIDPackage.ACTIVITY__LANGUAGE, oldLanguage, language));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityEdge> getEdge() {
		if (edge == null) {
			edge = new EObjectContainmentWithInverseEList<ActivityEdge>(ActivityEdge.class, this, UML2WithIDPackage.ACTIVITY__EDGE, UML2WithIDPackage.ACTIVITY_EDGE__ACTIVITY);
		}
		return edge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityGroup> getGroup() {
		if (group == null) {
			group = new EObjectContainmentWithInverseEList<ActivityGroup>(ActivityGroup.class, this, UML2WithIDPackage.ACTIVITY__GROUP, UML2WithIDPackage.ACTIVITY_GROUP__ACTIVITY_GROUP_ACTIVITY);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityNode> getNode() {
		if (node == null) {
			node = new EObjectContainmentWithInverseEList<ActivityNode>(ActivityNode.class, this, UML2WithIDPackage.ACTIVITY__NODE, UML2WithIDPackage.ACTIVITY_NODE__ACTIVITY);
		}
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Action> getAction() {
		if (action == null) {
			action = new EObjectResolvingEList<Action>(Action.class, this, UML2WithIDPackage.ACTIVITY__ACTION);
		}
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StructuredActivityNode> getStructuredNode() {
		if (structuredNode == null) {
			structuredNode = new EObjectResolvingEList<StructuredActivityNode>(StructuredActivityNode.class, this, UML2WithIDPackage.ACTIVITY__STRUCTURED_NODE);
		}
		return structuredNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsSingleExecution() {
		return isSingleExecution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsSingleExecution(boolean newIsSingleExecution) {
		boolean oldIsSingleExecution = isSingleExecution;
		isSingleExecution = newIsSingleExecution;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2WithIDPackage.ACTIVITY__IS_SINGLE_EXECUTION, oldIsSingleExecution, isSingleExecution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsReadOnly() {
		return isReadOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsReadOnly(boolean newIsReadOnly) {
		boolean oldIsReadOnly = isReadOnly;
		isReadOnly = newIsReadOnly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2WithIDPackage.ACTIVITY__IS_READ_ONLY, oldIsReadOnly, isReadOnly));
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
			case UML2WithIDPackage.ACTIVITY__EDGE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEdge()).basicAdd(otherEnd, msgs);
			case UML2WithIDPackage.ACTIVITY__GROUP:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGroup()).basicAdd(otherEnd, msgs);
			case UML2WithIDPackage.ACTIVITY__NODE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getNode()).basicAdd(otherEnd, msgs);
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
			case UML2WithIDPackage.ACTIVITY__EDGE:
				return ((InternalEList<?>)getEdge()).basicRemove(otherEnd, msgs);
			case UML2WithIDPackage.ACTIVITY__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case UML2WithIDPackage.ACTIVITY__NODE:
				return ((InternalEList<?>)getNode()).basicRemove(otherEnd, msgs);
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
			case UML2WithIDPackage.ACTIVITY__BODY:
				return getBody();
			case UML2WithIDPackage.ACTIVITY__LANGUAGE:
				return getLanguage();
			case UML2WithIDPackage.ACTIVITY__EDGE:
				return getEdge();
			case UML2WithIDPackage.ACTIVITY__GROUP:
				return getGroup();
			case UML2WithIDPackage.ACTIVITY__NODE:
				return getNode();
			case UML2WithIDPackage.ACTIVITY__ACTION:
				return getAction();
			case UML2WithIDPackage.ACTIVITY__STRUCTURED_NODE:
				return getStructuredNode();
			case UML2WithIDPackage.ACTIVITY__IS_SINGLE_EXECUTION:
				return isIsSingleExecution();
			case UML2WithIDPackage.ACTIVITY__IS_READ_ONLY:
				return isIsReadOnly();
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
			case UML2WithIDPackage.ACTIVITY__BODY:
				setBody((String)newValue);
				return;
			case UML2WithIDPackage.ACTIVITY__LANGUAGE:
				setLanguage((String)newValue);
				return;
			case UML2WithIDPackage.ACTIVITY__EDGE:
				getEdge().clear();
				getEdge().addAll((Collection<? extends ActivityEdge>)newValue);
				return;
			case UML2WithIDPackage.ACTIVITY__GROUP:
				getGroup().clear();
				getGroup().addAll((Collection<? extends ActivityGroup>)newValue);
				return;
			case UML2WithIDPackage.ACTIVITY__NODE:
				getNode().clear();
				getNode().addAll((Collection<? extends ActivityNode>)newValue);
				return;
			case UML2WithIDPackage.ACTIVITY__ACTION:
				getAction().clear();
				getAction().addAll((Collection<? extends Action>)newValue);
				return;
			case UML2WithIDPackage.ACTIVITY__STRUCTURED_NODE:
				getStructuredNode().clear();
				getStructuredNode().addAll((Collection<? extends StructuredActivityNode>)newValue);
				return;
			case UML2WithIDPackage.ACTIVITY__IS_SINGLE_EXECUTION:
				setIsSingleExecution((Boolean)newValue);
				return;
			case UML2WithIDPackage.ACTIVITY__IS_READ_ONLY:
				setIsReadOnly((Boolean)newValue);
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
			case UML2WithIDPackage.ACTIVITY__BODY:
				setBody(BODY_EDEFAULT);
				return;
			case UML2WithIDPackage.ACTIVITY__LANGUAGE:
				setLanguage(LANGUAGE_EDEFAULT);
				return;
			case UML2WithIDPackage.ACTIVITY__EDGE:
				getEdge().clear();
				return;
			case UML2WithIDPackage.ACTIVITY__GROUP:
				getGroup().clear();
				return;
			case UML2WithIDPackage.ACTIVITY__NODE:
				getNode().clear();
				return;
			case UML2WithIDPackage.ACTIVITY__ACTION:
				getAction().clear();
				return;
			case UML2WithIDPackage.ACTIVITY__STRUCTURED_NODE:
				getStructuredNode().clear();
				return;
			case UML2WithIDPackage.ACTIVITY__IS_SINGLE_EXECUTION:
				setIsSingleExecution(IS_SINGLE_EXECUTION_EDEFAULT);
				return;
			case UML2WithIDPackage.ACTIVITY__IS_READ_ONLY:
				setIsReadOnly(IS_READ_ONLY_EDEFAULT);
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
			case UML2WithIDPackage.ACTIVITY__BODY:
				return BODY_EDEFAULT == null ? body != null : !BODY_EDEFAULT.equals(body);
			case UML2WithIDPackage.ACTIVITY__LANGUAGE:
				return LANGUAGE_EDEFAULT == null ? language != null : !LANGUAGE_EDEFAULT.equals(language);
			case UML2WithIDPackage.ACTIVITY__EDGE:
				return edge != null && !edge.isEmpty();
			case UML2WithIDPackage.ACTIVITY__GROUP:
				return group != null && !group.isEmpty();
			case UML2WithIDPackage.ACTIVITY__NODE:
				return node != null && !node.isEmpty();
			case UML2WithIDPackage.ACTIVITY__ACTION:
				return action != null && !action.isEmpty();
			case UML2WithIDPackage.ACTIVITY__STRUCTURED_NODE:
				return structuredNode != null && !structuredNode.isEmpty();
			case UML2WithIDPackage.ACTIVITY__IS_SINGLE_EXECUTION:
				return isSingleExecution != IS_SINGLE_EXECUTION_EDEFAULT;
			case UML2WithIDPackage.ACTIVITY__IS_READ_ONLY:
				return isReadOnly != IS_READ_ONLY_EDEFAULT;
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
		result.append(" (body: ");
		result.append(body);
		result.append(", language: ");
		result.append(language);
		result.append(", isSingleExecution: ");
		result.append(isSingleExecution);
		result.append(", isReadOnly: ");
		result.append(isReadOnly);
		result.append(')');
		return result.toString();
	}

} //ActivityImpl

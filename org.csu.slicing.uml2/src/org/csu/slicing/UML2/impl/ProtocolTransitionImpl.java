/**
 */
package org.csu.slicing.UML2.impl;

import java.util.Collection;

import org.csu.slicing.UML2.Constraint;
import org.csu.slicing.UML2.Operation;
import org.csu.slicing.UML2.ProtocolTransition;
import org.csu.slicing.UML2.UML2Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Protocol Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2.impl.ProtocolTransitionImpl#getPostCondition <em>Post Condition</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.ProtocolTransitionImpl#getReferred <em>Referred</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.ProtocolTransitionImpl#getPreCondition <em>Pre Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProtocolTransitionImpl extends TransitionImpl implements ProtocolTransition {
	/**
	 * The cached value of the '{@link #getPostCondition() <em>Post Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostCondition()
	 * @generated
	 * @ordered
	 */
	protected Constraint postCondition;

	/**
	 * The cached value of the '{@link #getReferred() <em>Referred</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferred()
	 * @generated
	 * @ordered
	 */
	protected EList<Operation> referred;

	/**
	 * The cached value of the '{@link #getPreCondition() <em>Pre Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreCondition()
	 * @generated
	 * @ordered
	 */
	protected Constraint preCondition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProtocolTransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UML2Package.eINSTANCE.getProtocolTransition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint getPostCondition() {
		return postCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPostCondition(Constraint newPostCondition, NotificationChain msgs) {
		Constraint oldPostCondition = postCondition;
		postCondition = newPostCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UML2Package.PROTOCOL_TRANSITION__POST_CONDITION, oldPostCondition, newPostCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostCondition(Constraint newPostCondition) {
		if (newPostCondition != postCondition) {
			NotificationChain msgs = null;
			if (postCondition != null)
				msgs = ((InternalEObject)postCondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.PROTOCOL_TRANSITION__POST_CONDITION, null, msgs);
			if (newPostCondition != null)
				msgs = ((InternalEObject)newPostCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UML2Package.PROTOCOL_TRANSITION__POST_CONDITION, null, msgs);
			msgs = basicSetPostCondition(newPostCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.PROTOCOL_TRANSITION__POST_CONDITION, newPostCondition, newPostCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getReferred() {
		if (referred == null) {
			referred = new EObjectResolvingEList<Operation>(Operation.class, this, UML2Package.PROTOCOL_TRANSITION__REFERRED);
		}
		return referred;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint getPreCondition() {
		if (preCondition != null && preCondition.eIsProxy()) {
			InternalEObject oldPreCondition = (InternalEObject)preCondition;
			preCondition = (Constraint)eResolveProxy(oldPreCondition);
			if (preCondition != oldPreCondition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2Package.PROTOCOL_TRANSITION__PRE_CONDITION, oldPreCondition, preCondition));
			}
		}
		return preCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint basicGetPreCondition() {
		return preCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreCondition(Constraint newPreCondition) {
		Constraint oldPreCondition = preCondition;
		preCondition = newPreCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.PROTOCOL_TRANSITION__PRE_CONDITION, oldPreCondition, preCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UML2Package.PROTOCOL_TRANSITION__POST_CONDITION:
				return basicSetPostCondition(null, msgs);
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
			case UML2Package.PROTOCOL_TRANSITION__POST_CONDITION:
				return getPostCondition();
			case UML2Package.PROTOCOL_TRANSITION__REFERRED:
				return getReferred();
			case UML2Package.PROTOCOL_TRANSITION__PRE_CONDITION:
				if (resolve) return getPreCondition();
				return basicGetPreCondition();
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
			case UML2Package.PROTOCOL_TRANSITION__POST_CONDITION:
				setPostCondition((Constraint)newValue);
				return;
			case UML2Package.PROTOCOL_TRANSITION__REFERRED:
				getReferred().clear();
				getReferred().addAll((Collection<? extends Operation>)newValue);
				return;
			case UML2Package.PROTOCOL_TRANSITION__PRE_CONDITION:
				setPreCondition((Constraint)newValue);
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
			case UML2Package.PROTOCOL_TRANSITION__POST_CONDITION:
				setPostCondition((Constraint)null);
				return;
			case UML2Package.PROTOCOL_TRANSITION__REFERRED:
				getReferred().clear();
				return;
			case UML2Package.PROTOCOL_TRANSITION__PRE_CONDITION:
				setPreCondition((Constraint)null);
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
			case UML2Package.PROTOCOL_TRANSITION__POST_CONDITION:
				return postCondition != null;
			case UML2Package.PROTOCOL_TRANSITION__REFERRED:
				return referred != null && !referred.isEmpty();
			case UML2Package.PROTOCOL_TRANSITION__PRE_CONDITION:
				return preCondition != null;
		}
		return super.eIsSet(featureID);
	}

} //ProtocolTransitionImpl

/**
 */
package org.csu.slicing.UML2WithID.impl;

import java.util.Collection;

import org.csu.slicing.UML2WithID.CallTrigger;
import org.csu.slicing.UML2WithID.InputPin;
import org.csu.slicing.UML2WithID.ReplyAction;
import org.csu.slicing.UML2WithID.UML2WithIDPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reply Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.ReplyActionImpl#getReplyToCall <em>Reply To Call</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.ReplyActionImpl#getReplyValue <em>Reply Value</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.ReplyActionImpl#getReturnInformation <em>Return Information</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReplyActionImpl extends ActionImpl implements ReplyAction {
	/**
	 * The cached value of the '{@link #getReplyToCall() <em>Reply To Call</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplyToCall()
	 * @generated
	 * @ordered
	 */
	protected CallTrigger replyToCall;

	/**
	 * The cached value of the '{@link #getReplyValue() <em>Reply Value</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplyValue()
	 * @generated
	 * @ordered
	 */
	protected EList<InputPin> replyValue;

	/**
	 * The cached value of the '{@link #getReturnInformation() <em>Return Information</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnInformation()
	 * @generated
	 * @ordered
	 */
	protected InputPin returnInformation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReplyActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UML2WithIDPackage.eINSTANCE.getReplyAction();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallTrigger getReplyToCall() {
		if (replyToCall != null && replyToCall.eIsProxy()) {
			InternalEObject oldReplyToCall = (InternalEObject)replyToCall;
			replyToCall = (CallTrigger)eResolveProxy(oldReplyToCall);
			if (replyToCall != oldReplyToCall) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2WithIDPackage.REPLY_ACTION__REPLY_TO_CALL, oldReplyToCall, replyToCall));
			}
		}
		return replyToCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallTrigger basicGetReplyToCall() {
		return replyToCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReplyToCall(CallTrigger newReplyToCall) {
		CallTrigger oldReplyToCall = replyToCall;
		replyToCall = newReplyToCall;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2WithIDPackage.REPLY_ACTION__REPLY_TO_CALL, oldReplyToCall, replyToCall));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputPin> getReplyValue() {
		if (replyValue == null) {
			replyValue = new EObjectResolvingEList<InputPin>(InputPin.class, this, UML2WithIDPackage.REPLY_ACTION__REPLY_VALUE);
		}
		return replyValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin getReturnInformation() {
		if (returnInformation != null && returnInformation.eIsProxy()) {
			InternalEObject oldReturnInformation = (InternalEObject)returnInformation;
			returnInformation = (InputPin)eResolveProxy(oldReturnInformation);
			if (returnInformation != oldReturnInformation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2WithIDPackage.REPLY_ACTION__RETURN_INFORMATION, oldReturnInformation, returnInformation));
			}
		}
		return returnInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin basicGetReturnInformation() {
		return returnInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnInformation(InputPin newReturnInformation) {
		InputPin oldReturnInformation = returnInformation;
		returnInformation = newReturnInformation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2WithIDPackage.REPLY_ACTION__RETURN_INFORMATION, oldReturnInformation, returnInformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UML2WithIDPackage.REPLY_ACTION__REPLY_TO_CALL:
				if (resolve) return getReplyToCall();
				return basicGetReplyToCall();
			case UML2WithIDPackage.REPLY_ACTION__REPLY_VALUE:
				return getReplyValue();
			case UML2WithIDPackage.REPLY_ACTION__RETURN_INFORMATION:
				if (resolve) return getReturnInformation();
				return basicGetReturnInformation();
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
			case UML2WithIDPackage.REPLY_ACTION__REPLY_TO_CALL:
				setReplyToCall((CallTrigger)newValue);
				return;
			case UML2WithIDPackage.REPLY_ACTION__REPLY_VALUE:
				getReplyValue().clear();
				getReplyValue().addAll((Collection<? extends InputPin>)newValue);
				return;
			case UML2WithIDPackage.REPLY_ACTION__RETURN_INFORMATION:
				setReturnInformation((InputPin)newValue);
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
			case UML2WithIDPackage.REPLY_ACTION__REPLY_TO_CALL:
				setReplyToCall((CallTrigger)null);
				return;
			case UML2WithIDPackage.REPLY_ACTION__REPLY_VALUE:
				getReplyValue().clear();
				return;
			case UML2WithIDPackage.REPLY_ACTION__RETURN_INFORMATION:
				setReturnInformation((InputPin)null);
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
			case UML2WithIDPackage.REPLY_ACTION__REPLY_TO_CALL:
				return replyToCall != null;
			case UML2WithIDPackage.REPLY_ACTION__REPLY_VALUE:
				return replyValue != null && !replyValue.isEmpty();
			case UML2WithIDPackage.REPLY_ACTION__RETURN_INFORMATION:
				return returnInformation != null;
		}
		return super.eIsSet(featureID);
	}

} //ReplyActionImpl

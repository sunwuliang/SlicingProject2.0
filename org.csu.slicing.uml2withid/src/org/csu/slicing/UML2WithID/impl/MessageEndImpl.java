/**
 */
package org.csu.slicing.UML2WithID.impl;

import org.csu.slicing.UML2WithID.Message;
import org.csu.slicing.UML2WithID.MessageEnd;
import org.csu.slicing.UML2WithID.UML2WithIDPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message End</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.MessageEndImpl#getReceiveMessage <em>Receive Message</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.MessageEndImpl#getSendMessage <em>Send Message</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class MessageEndImpl extends NamedElementImpl implements MessageEnd {
	/**
	 * The cached value of the '{@link #getReceiveMessage() <em>Receive Message</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiveMessage()
	 * @generated
	 * @ordered
	 */
	protected Message receiveMessage;

	/**
	 * The cached value of the '{@link #getSendMessage() <em>Send Message</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSendMessage()
	 * @generated
	 * @ordered
	 */
	protected Message sendMessage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageEndImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UML2WithIDPackage.eINSTANCE.getMessageEnd();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message getReceiveMessage() {
		if (receiveMessage != null && receiveMessage.eIsProxy()) {
			InternalEObject oldReceiveMessage = (InternalEObject)receiveMessage;
			receiveMessage = (Message)eResolveProxy(oldReceiveMessage);
			if (receiveMessage != oldReceiveMessage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2WithIDPackage.MESSAGE_END__RECEIVE_MESSAGE, oldReceiveMessage, receiveMessage));
			}
		}
		return receiveMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message basicGetReceiveMessage() {
		return receiveMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReceiveMessage(Message newReceiveMessage, NotificationChain msgs) {
		Message oldReceiveMessage = receiveMessage;
		receiveMessage = newReceiveMessage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UML2WithIDPackage.MESSAGE_END__RECEIVE_MESSAGE, oldReceiveMessage, newReceiveMessage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReceiveMessage(Message newReceiveMessage) {
		if (newReceiveMessage != receiveMessage) {
			NotificationChain msgs = null;
			if (receiveMessage != null)
				msgs = ((InternalEObject)receiveMessage).eInverseRemove(this, UML2WithIDPackage.MESSAGE__RECEIVE_EVENT, Message.class, msgs);
			if (newReceiveMessage != null)
				msgs = ((InternalEObject)newReceiveMessage).eInverseAdd(this, UML2WithIDPackage.MESSAGE__RECEIVE_EVENT, Message.class, msgs);
			msgs = basicSetReceiveMessage(newReceiveMessage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2WithIDPackage.MESSAGE_END__RECEIVE_MESSAGE, newReceiveMessage, newReceiveMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message getSendMessage() {
		if (sendMessage != null && sendMessage.eIsProxy()) {
			InternalEObject oldSendMessage = (InternalEObject)sendMessage;
			sendMessage = (Message)eResolveProxy(oldSendMessage);
			if (sendMessage != oldSendMessage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2WithIDPackage.MESSAGE_END__SEND_MESSAGE, oldSendMessage, sendMessage));
			}
		}
		return sendMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message basicGetSendMessage() {
		return sendMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSendMessage(Message newSendMessage, NotificationChain msgs) {
		Message oldSendMessage = sendMessage;
		sendMessage = newSendMessage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UML2WithIDPackage.MESSAGE_END__SEND_MESSAGE, oldSendMessage, newSendMessage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSendMessage(Message newSendMessage) {
		if (newSendMessage != sendMessage) {
			NotificationChain msgs = null;
			if (sendMessage != null)
				msgs = ((InternalEObject)sendMessage).eInverseRemove(this, UML2WithIDPackage.MESSAGE__SEND_EVENT, Message.class, msgs);
			if (newSendMessage != null)
				msgs = ((InternalEObject)newSendMessage).eInverseAdd(this, UML2WithIDPackage.MESSAGE__SEND_EVENT, Message.class, msgs);
			msgs = basicSetSendMessage(newSendMessage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2WithIDPackage.MESSAGE_END__SEND_MESSAGE, newSendMessage, newSendMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UML2WithIDPackage.MESSAGE_END__RECEIVE_MESSAGE:
				if (receiveMessage != null)
					msgs = ((InternalEObject)receiveMessage).eInverseRemove(this, UML2WithIDPackage.MESSAGE__RECEIVE_EVENT, Message.class, msgs);
				return basicSetReceiveMessage((Message)otherEnd, msgs);
			case UML2WithIDPackage.MESSAGE_END__SEND_MESSAGE:
				if (sendMessage != null)
					msgs = ((InternalEObject)sendMessage).eInverseRemove(this, UML2WithIDPackage.MESSAGE__SEND_EVENT, Message.class, msgs);
				return basicSetSendMessage((Message)otherEnd, msgs);
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
			case UML2WithIDPackage.MESSAGE_END__RECEIVE_MESSAGE:
				return basicSetReceiveMessage(null, msgs);
			case UML2WithIDPackage.MESSAGE_END__SEND_MESSAGE:
				return basicSetSendMessage(null, msgs);
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
			case UML2WithIDPackage.MESSAGE_END__RECEIVE_MESSAGE:
				if (resolve) return getReceiveMessage();
				return basicGetReceiveMessage();
			case UML2WithIDPackage.MESSAGE_END__SEND_MESSAGE:
				if (resolve) return getSendMessage();
				return basicGetSendMessage();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UML2WithIDPackage.MESSAGE_END__RECEIVE_MESSAGE:
				setReceiveMessage((Message)newValue);
				return;
			case UML2WithIDPackage.MESSAGE_END__SEND_MESSAGE:
				setSendMessage((Message)newValue);
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
			case UML2WithIDPackage.MESSAGE_END__RECEIVE_MESSAGE:
				setReceiveMessage((Message)null);
				return;
			case UML2WithIDPackage.MESSAGE_END__SEND_MESSAGE:
				setSendMessage((Message)null);
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
			case UML2WithIDPackage.MESSAGE_END__RECEIVE_MESSAGE:
				return receiveMessage != null;
			case UML2WithIDPackage.MESSAGE_END__SEND_MESSAGE:
				return sendMessage != null;
		}
		return super.eIsSet(featureID);
	}

} //MessageEndImpl

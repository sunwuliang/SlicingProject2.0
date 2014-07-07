/**
 */
package org.csu.slicing.UML2WithID.impl;

import java.util.Collection;

import org.csu.slicing.UML2WithID.Connector;
import org.csu.slicing.UML2WithID.Interaction;
import org.csu.slicing.UML2WithID.Message;
import org.csu.slicing.UML2WithID.MessageEnd;
import org.csu.slicing.UML2WithID.MessageKind;
import org.csu.slicing.UML2WithID.MessageSort;
import org.csu.slicing.UML2WithID.NamedElement;
import org.csu.slicing.UML2WithID.UML2WithIDPackage;
import org.csu.slicing.UML2WithID.ValueSpecification;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.MessageImpl#getMessageKind <em>Message Kind</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.MessageImpl#getMessageSort <em>Message Sort</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.MessageImpl#getReceiveEvent <em>Receive Event</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.MessageImpl#getSendEvent <em>Send Event</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.MessageImpl#getConnector <em>Connector</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.MessageImpl#getInteraction <em>Interaction</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.MessageImpl#getSignature <em>Signature</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.MessageImpl#getArgument <em>Argument</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MessageImpl extends NamedElementImpl implements Message {
	/**
	 * The default value of the '{@link #getMessageKind() <em>Message Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageKind()
	 * @generated
	 * @ordered
	 */
	protected static final MessageKind MESSAGE_KIND_EDEFAULT = MessageKind.FOUND;

	/**
	 * The cached value of the '{@link #getMessageKind() <em>Message Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageKind()
	 * @generated
	 * @ordered
	 */
	protected MessageKind messageKind = MESSAGE_KIND_EDEFAULT;

	/**
	 * The default value of the '{@link #getMessageSort() <em>Message Sort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageSort()
	 * @generated
	 * @ordered
	 */
	protected static final MessageSort MESSAGE_SORT_EDEFAULT = MessageSort.SYNCH_SIGNAL;

	/**
	 * The cached value of the '{@link #getMessageSort() <em>Message Sort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageSort()
	 * @generated
	 * @ordered
	 */
	protected MessageSort messageSort = MESSAGE_SORT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReceiveEvent() <em>Receive Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiveEvent()
	 * @generated
	 * @ordered
	 */
	protected MessageEnd receiveEvent;

	/**
	 * The cached value of the '{@link #getSendEvent() <em>Send Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSendEvent()
	 * @generated
	 * @ordered
	 */
	protected MessageEnd sendEvent;

	/**
	 * The cached value of the '{@link #getConnector() <em>Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnector()
	 * @generated
	 * @ordered
	 */
	protected Connector connector;

	/**
	 * The cached value of the '{@link #getSignature() <em>Signature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignature()
	 * @generated
	 * @ordered
	 */
	protected NamedElement signature;

	/**
	 * The cached value of the '{@link #getArgument() <em>Argument</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgument()
	 * @generated
	 * @ordered
	 */
	protected EList<ValueSpecification> argument;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UML2WithIDPackage.eINSTANCE.getMessage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageKind getMessageKind() {
		return messageKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageKind(MessageKind newMessageKind) {
		MessageKind oldMessageKind = messageKind;
		messageKind = newMessageKind == null ? MESSAGE_KIND_EDEFAULT : newMessageKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2WithIDPackage.MESSAGE__MESSAGE_KIND, oldMessageKind, messageKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageSort getMessageSort() {
		return messageSort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageSort(MessageSort newMessageSort) {
		MessageSort oldMessageSort = messageSort;
		messageSort = newMessageSort == null ? MESSAGE_SORT_EDEFAULT : newMessageSort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2WithIDPackage.MESSAGE__MESSAGE_SORT, oldMessageSort, messageSort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageEnd getReceiveEvent() {
		if (receiveEvent != null && receiveEvent.eIsProxy()) {
			InternalEObject oldReceiveEvent = (InternalEObject)receiveEvent;
			receiveEvent = (MessageEnd)eResolveProxy(oldReceiveEvent);
			if (receiveEvent != oldReceiveEvent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2WithIDPackage.MESSAGE__RECEIVE_EVENT, oldReceiveEvent, receiveEvent));
			}
		}
		return receiveEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageEnd basicGetReceiveEvent() {
		return receiveEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReceiveEvent(MessageEnd newReceiveEvent, NotificationChain msgs) {
		MessageEnd oldReceiveEvent = receiveEvent;
		receiveEvent = newReceiveEvent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UML2WithIDPackage.MESSAGE__RECEIVE_EVENT, oldReceiveEvent, newReceiveEvent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReceiveEvent(MessageEnd newReceiveEvent) {
		if (newReceiveEvent != receiveEvent) {
			NotificationChain msgs = null;
			if (receiveEvent != null)
				msgs = ((InternalEObject)receiveEvent).eInverseRemove(this, UML2WithIDPackage.MESSAGE_END__RECEIVE_MESSAGE, MessageEnd.class, msgs);
			if (newReceiveEvent != null)
				msgs = ((InternalEObject)newReceiveEvent).eInverseAdd(this, UML2WithIDPackage.MESSAGE_END__RECEIVE_MESSAGE, MessageEnd.class, msgs);
			msgs = basicSetReceiveEvent(newReceiveEvent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2WithIDPackage.MESSAGE__RECEIVE_EVENT, newReceiveEvent, newReceiveEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageEnd getSendEvent() {
		if (sendEvent != null && sendEvent.eIsProxy()) {
			InternalEObject oldSendEvent = (InternalEObject)sendEvent;
			sendEvent = (MessageEnd)eResolveProxy(oldSendEvent);
			if (sendEvent != oldSendEvent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2WithIDPackage.MESSAGE__SEND_EVENT, oldSendEvent, sendEvent));
			}
		}
		return sendEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageEnd basicGetSendEvent() {
		return sendEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSendEvent(MessageEnd newSendEvent, NotificationChain msgs) {
		MessageEnd oldSendEvent = sendEvent;
		sendEvent = newSendEvent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UML2WithIDPackage.MESSAGE__SEND_EVENT, oldSendEvent, newSendEvent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSendEvent(MessageEnd newSendEvent) {
		if (newSendEvent != sendEvent) {
			NotificationChain msgs = null;
			if (sendEvent != null)
				msgs = ((InternalEObject)sendEvent).eInverseRemove(this, UML2WithIDPackage.MESSAGE_END__SEND_MESSAGE, MessageEnd.class, msgs);
			if (newSendEvent != null)
				msgs = ((InternalEObject)newSendEvent).eInverseAdd(this, UML2WithIDPackage.MESSAGE_END__SEND_MESSAGE, MessageEnd.class, msgs);
			msgs = basicSetSendEvent(newSendEvent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2WithIDPackage.MESSAGE__SEND_EVENT, newSendEvent, newSendEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector getConnector() {
		if (connector != null && connector.eIsProxy()) {
			InternalEObject oldConnector = (InternalEObject)connector;
			connector = (Connector)eResolveProxy(oldConnector);
			if (connector != oldConnector) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2WithIDPackage.MESSAGE__CONNECTOR, oldConnector, connector));
			}
		}
		return connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector basicGetConnector() {
		return connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnector(Connector newConnector) {
		Connector oldConnector = connector;
		connector = newConnector;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2WithIDPackage.MESSAGE__CONNECTOR, oldConnector, connector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interaction getInteraction() {
		if (eContainerFeatureID() != UML2WithIDPackage.MESSAGE__INTERACTION) return null;
		return (Interaction)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInteraction(Interaction newInteraction, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newInteraction, UML2WithIDPackage.MESSAGE__INTERACTION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInteraction(Interaction newInteraction) {
		if (newInteraction != eInternalContainer() || (eContainerFeatureID() != UML2WithIDPackage.MESSAGE__INTERACTION && newInteraction != null)) {
			if (EcoreUtil.isAncestor(this, newInteraction))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newInteraction != null)
				msgs = ((InternalEObject)newInteraction).eInverseAdd(this, UML2WithIDPackage.INTERACTION__MESSAGE, Interaction.class, msgs);
			msgs = basicSetInteraction(newInteraction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2WithIDPackage.MESSAGE__INTERACTION, newInteraction, newInteraction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement getSignature() {
		if (signature != null && signature.eIsProxy()) {
			InternalEObject oldSignature = (InternalEObject)signature;
			signature = (NamedElement)eResolveProxy(oldSignature);
			if (signature != oldSignature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2WithIDPackage.MESSAGE__SIGNATURE, oldSignature, signature));
			}
		}
		return signature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement basicGetSignature() {
		return signature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignature(NamedElement newSignature) {
		NamedElement oldSignature = signature;
		signature = newSignature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2WithIDPackage.MESSAGE__SIGNATURE, oldSignature, signature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValueSpecification> getArgument() {
		if (argument == null) {
			argument = new EObjectContainmentEList<ValueSpecification>(ValueSpecification.class, this, UML2WithIDPackage.MESSAGE__ARGUMENT);
		}
		return argument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UML2WithIDPackage.MESSAGE__RECEIVE_EVENT:
				if (receiveEvent != null)
					msgs = ((InternalEObject)receiveEvent).eInverseRemove(this, UML2WithIDPackage.MESSAGE_END__RECEIVE_MESSAGE, MessageEnd.class, msgs);
				return basicSetReceiveEvent((MessageEnd)otherEnd, msgs);
			case UML2WithIDPackage.MESSAGE__SEND_EVENT:
				if (sendEvent != null)
					msgs = ((InternalEObject)sendEvent).eInverseRemove(this, UML2WithIDPackage.MESSAGE_END__SEND_MESSAGE, MessageEnd.class, msgs);
				return basicSetSendEvent((MessageEnd)otherEnd, msgs);
			case UML2WithIDPackage.MESSAGE__INTERACTION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetInteraction((Interaction)otherEnd, msgs);
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
			case UML2WithIDPackage.MESSAGE__RECEIVE_EVENT:
				return basicSetReceiveEvent(null, msgs);
			case UML2WithIDPackage.MESSAGE__SEND_EVENT:
				return basicSetSendEvent(null, msgs);
			case UML2WithIDPackage.MESSAGE__INTERACTION:
				return basicSetInteraction(null, msgs);
			case UML2WithIDPackage.MESSAGE__ARGUMENT:
				return ((InternalEList<?>)getArgument()).basicRemove(otherEnd, msgs);
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
			case UML2WithIDPackage.MESSAGE__INTERACTION:
				return eInternalContainer().eInverseRemove(this, UML2WithIDPackage.INTERACTION__MESSAGE, Interaction.class, msgs);
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
			case UML2WithIDPackage.MESSAGE__MESSAGE_KIND:
				return getMessageKind();
			case UML2WithIDPackage.MESSAGE__MESSAGE_SORT:
				return getMessageSort();
			case UML2WithIDPackage.MESSAGE__RECEIVE_EVENT:
				if (resolve) return getReceiveEvent();
				return basicGetReceiveEvent();
			case UML2WithIDPackage.MESSAGE__SEND_EVENT:
				if (resolve) return getSendEvent();
				return basicGetSendEvent();
			case UML2WithIDPackage.MESSAGE__CONNECTOR:
				if (resolve) return getConnector();
				return basicGetConnector();
			case UML2WithIDPackage.MESSAGE__INTERACTION:
				return getInteraction();
			case UML2WithIDPackage.MESSAGE__SIGNATURE:
				if (resolve) return getSignature();
				return basicGetSignature();
			case UML2WithIDPackage.MESSAGE__ARGUMENT:
				return getArgument();
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
			case UML2WithIDPackage.MESSAGE__MESSAGE_KIND:
				setMessageKind((MessageKind)newValue);
				return;
			case UML2WithIDPackage.MESSAGE__MESSAGE_SORT:
				setMessageSort((MessageSort)newValue);
				return;
			case UML2WithIDPackage.MESSAGE__RECEIVE_EVENT:
				setReceiveEvent((MessageEnd)newValue);
				return;
			case UML2WithIDPackage.MESSAGE__SEND_EVENT:
				setSendEvent((MessageEnd)newValue);
				return;
			case UML2WithIDPackage.MESSAGE__CONNECTOR:
				setConnector((Connector)newValue);
				return;
			case UML2WithIDPackage.MESSAGE__INTERACTION:
				setInteraction((Interaction)newValue);
				return;
			case UML2WithIDPackage.MESSAGE__SIGNATURE:
				setSignature((NamedElement)newValue);
				return;
			case UML2WithIDPackage.MESSAGE__ARGUMENT:
				getArgument().clear();
				getArgument().addAll((Collection<? extends ValueSpecification>)newValue);
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
			case UML2WithIDPackage.MESSAGE__MESSAGE_KIND:
				setMessageKind(MESSAGE_KIND_EDEFAULT);
				return;
			case UML2WithIDPackage.MESSAGE__MESSAGE_SORT:
				setMessageSort(MESSAGE_SORT_EDEFAULT);
				return;
			case UML2WithIDPackage.MESSAGE__RECEIVE_EVENT:
				setReceiveEvent((MessageEnd)null);
				return;
			case UML2WithIDPackage.MESSAGE__SEND_EVENT:
				setSendEvent((MessageEnd)null);
				return;
			case UML2WithIDPackage.MESSAGE__CONNECTOR:
				setConnector((Connector)null);
				return;
			case UML2WithIDPackage.MESSAGE__INTERACTION:
				setInteraction((Interaction)null);
				return;
			case UML2WithIDPackage.MESSAGE__SIGNATURE:
				setSignature((NamedElement)null);
				return;
			case UML2WithIDPackage.MESSAGE__ARGUMENT:
				getArgument().clear();
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
			case UML2WithIDPackage.MESSAGE__MESSAGE_KIND:
				return messageKind != MESSAGE_KIND_EDEFAULT;
			case UML2WithIDPackage.MESSAGE__MESSAGE_SORT:
				return messageSort != MESSAGE_SORT_EDEFAULT;
			case UML2WithIDPackage.MESSAGE__RECEIVE_EVENT:
				return receiveEvent != null;
			case UML2WithIDPackage.MESSAGE__SEND_EVENT:
				return sendEvent != null;
			case UML2WithIDPackage.MESSAGE__CONNECTOR:
				return connector != null;
			case UML2WithIDPackage.MESSAGE__INTERACTION:
				return getInteraction() != null;
			case UML2WithIDPackage.MESSAGE__SIGNATURE:
				return signature != null;
			case UML2WithIDPackage.MESSAGE__ARGUMENT:
				return argument != null && !argument.isEmpty();
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
		result.append(" (messageKind: ");
		result.append(messageKind);
		result.append(", messageSort: ");
		result.append(messageSort);
		result.append(')');
		return result.toString();
	}

} //MessageImpl

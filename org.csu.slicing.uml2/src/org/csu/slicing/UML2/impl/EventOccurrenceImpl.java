/**
 */
package org.csu.slicing.UML2.impl;

import java.util.Collection;

import org.csu.slicing.UML2.EventOccurrence;
import org.csu.slicing.UML2.ExecutionOccurrence;
import org.csu.slicing.UML2.GeneralOrdering;
import org.csu.slicing.UML2.Message;
import org.csu.slicing.UML2.MessageEnd;
import org.csu.slicing.UML2.UML2Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Occurrence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2.impl.EventOccurrenceImpl#getReceiveMessage <em>Receive Message</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.EventOccurrenceImpl#getSendMessage <em>Send Message</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.EventOccurrenceImpl#getStartExec <em>Start Exec</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.EventOccurrenceImpl#getFinishExec <em>Finish Exec</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.EventOccurrenceImpl#getToAfter <em>To After</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.EventOccurrenceImpl#getToBefore <em>To Before</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EventOccurrenceImpl extends InteractionFragmentImpl implements EventOccurrence {
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
	 * The cached value of the '{@link #getStartExec() <em>Start Exec</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartExec()
	 * @generated
	 * @ordered
	 */
	protected EList<ExecutionOccurrence> startExec;

	/**
	 * The cached value of the '{@link #getFinishExec() <em>Finish Exec</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinishExec()
	 * @generated
	 * @ordered
	 */
	protected EList<ExecutionOccurrence> finishExec;

	/**
	 * The cached value of the '{@link #getToAfter() <em>To After</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToAfter()
	 * @generated
	 * @ordered
	 */
	protected EList<GeneralOrdering> toAfter;

	/**
	 * The cached value of the '{@link #getToBefore() <em>To Before</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToBefore()
	 * @generated
	 * @ordered
	 */
	protected EList<GeneralOrdering> toBefore;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventOccurrenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UML2Package.eINSTANCE.getEventOccurrence();
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2Package.EVENT_OCCURRENCE__RECEIVE_MESSAGE, oldReceiveMessage, receiveMessage));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UML2Package.EVENT_OCCURRENCE__RECEIVE_MESSAGE, oldReceiveMessage, newReceiveMessage);
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
				msgs = ((InternalEObject)receiveMessage).eInverseRemove(this, UML2Package.MESSAGE__RECEIVE_EVENT, Message.class, msgs);
			if (newReceiveMessage != null)
				msgs = ((InternalEObject)newReceiveMessage).eInverseAdd(this, UML2Package.MESSAGE__RECEIVE_EVENT, Message.class, msgs);
			msgs = basicSetReceiveMessage(newReceiveMessage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.EVENT_OCCURRENCE__RECEIVE_MESSAGE, newReceiveMessage, newReceiveMessage));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2Package.EVENT_OCCURRENCE__SEND_MESSAGE, oldSendMessage, sendMessage));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UML2Package.EVENT_OCCURRENCE__SEND_MESSAGE, oldSendMessage, newSendMessage);
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
				msgs = ((InternalEObject)sendMessage).eInverseRemove(this, UML2Package.MESSAGE__SEND_EVENT, Message.class, msgs);
			if (newSendMessage != null)
				msgs = ((InternalEObject)newSendMessage).eInverseAdd(this, UML2Package.MESSAGE__SEND_EVENT, Message.class, msgs);
			msgs = basicSetSendMessage(newSendMessage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.EVENT_OCCURRENCE__SEND_MESSAGE, newSendMessage, newSendMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExecutionOccurrence> getStartExec() {
		if (startExec == null) {
			startExec = new EObjectWithInverseResolvingEList<ExecutionOccurrence>(ExecutionOccurrence.class, this, UML2Package.EVENT_OCCURRENCE__START_EXEC, UML2Package.EXECUTION_OCCURRENCE__START);
		}
		return startExec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExecutionOccurrence> getFinishExec() {
		if (finishExec == null) {
			finishExec = new EObjectWithInverseResolvingEList<ExecutionOccurrence>(ExecutionOccurrence.class, this, UML2Package.EVENT_OCCURRENCE__FINISH_EXEC, UML2Package.EXECUTION_OCCURRENCE__FINISH);
		}
		return finishExec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GeneralOrdering> getToAfter() {
		if (toAfter == null) {
			toAfter = new EObjectWithInverseResolvingEList<GeneralOrdering>(GeneralOrdering.class, this, UML2Package.EVENT_OCCURRENCE__TO_AFTER, UML2Package.GENERAL_ORDERING__BEFORE);
		}
		return toAfter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GeneralOrdering> getToBefore() {
		if (toBefore == null) {
			toBefore = new EObjectWithInverseResolvingEList<GeneralOrdering>(GeneralOrdering.class, this, UML2Package.EVENT_OCCURRENCE__TO_BEFORE, UML2Package.GENERAL_ORDERING__AFTER);
		}
		return toBefore;
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
			case UML2Package.EVENT_OCCURRENCE__RECEIVE_MESSAGE:
				if (receiveMessage != null)
					msgs = ((InternalEObject)receiveMessage).eInverseRemove(this, UML2Package.MESSAGE__RECEIVE_EVENT, Message.class, msgs);
				return basicSetReceiveMessage((Message)otherEnd, msgs);
			case UML2Package.EVENT_OCCURRENCE__SEND_MESSAGE:
				if (sendMessage != null)
					msgs = ((InternalEObject)sendMessage).eInverseRemove(this, UML2Package.MESSAGE__SEND_EVENT, Message.class, msgs);
				return basicSetSendMessage((Message)otherEnd, msgs);
			case UML2Package.EVENT_OCCURRENCE__START_EXEC:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStartExec()).basicAdd(otherEnd, msgs);
			case UML2Package.EVENT_OCCURRENCE__FINISH_EXEC:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFinishExec()).basicAdd(otherEnd, msgs);
			case UML2Package.EVENT_OCCURRENCE__TO_AFTER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getToAfter()).basicAdd(otherEnd, msgs);
			case UML2Package.EVENT_OCCURRENCE__TO_BEFORE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getToBefore()).basicAdd(otherEnd, msgs);
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
			case UML2Package.EVENT_OCCURRENCE__RECEIVE_MESSAGE:
				return basicSetReceiveMessage(null, msgs);
			case UML2Package.EVENT_OCCURRENCE__SEND_MESSAGE:
				return basicSetSendMessage(null, msgs);
			case UML2Package.EVENT_OCCURRENCE__START_EXEC:
				return ((InternalEList<?>)getStartExec()).basicRemove(otherEnd, msgs);
			case UML2Package.EVENT_OCCURRENCE__FINISH_EXEC:
				return ((InternalEList<?>)getFinishExec()).basicRemove(otherEnd, msgs);
			case UML2Package.EVENT_OCCURRENCE__TO_AFTER:
				return ((InternalEList<?>)getToAfter()).basicRemove(otherEnd, msgs);
			case UML2Package.EVENT_OCCURRENCE__TO_BEFORE:
				return ((InternalEList<?>)getToBefore()).basicRemove(otherEnd, msgs);
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
			case UML2Package.EVENT_OCCURRENCE__RECEIVE_MESSAGE:
				if (resolve) return getReceiveMessage();
				return basicGetReceiveMessage();
			case UML2Package.EVENT_OCCURRENCE__SEND_MESSAGE:
				if (resolve) return getSendMessage();
				return basicGetSendMessage();
			case UML2Package.EVENT_OCCURRENCE__START_EXEC:
				return getStartExec();
			case UML2Package.EVENT_OCCURRENCE__FINISH_EXEC:
				return getFinishExec();
			case UML2Package.EVENT_OCCURRENCE__TO_AFTER:
				return getToAfter();
			case UML2Package.EVENT_OCCURRENCE__TO_BEFORE:
				return getToBefore();
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
			case UML2Package.EVENT_OCCURRENCE__RECEIVE_MESSAGE:
				setReceiveMessage((Message)newValue);
				return;
			case UML2Package.EVENT_OCCURRENCE__SEND_MESSAGE:
				setSendMessage((Message)newValue);
				return;
			case UML2Package.EVENT_OCCURRENCE__START_EXEC:
				getStartExec().clear();
				getStartExec().addAll((Collection<? extends ExecutionOccurrence>)newValue);
				return;
			case UML2Package.EVENT_OCCURRENCE__FINISH_EXEC:
				getFinishExec().clear();
				getFinishExec().addAll((Collection<? extends ExecutionOccurrence>)newValue);
				return;
			case UML2Package.EVENT_OCCURRENCE__TO_AFTER:
				getToAfter().clear();
				getToAfter().addAll((Collection<? extends GeneralOrdering>)newValue);
				return;
			case UML2Package.EVENT_OCCURRENCE__TO_BEFORE:
				getToBefore().clear();
				getToBefore().addAll((Collection<? extends GeneralOrdering>)newValue);
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
			case UML2Package.EVENT_OCCURRENCE__RECEIVE_MESSAGE:
				setReceiveMessage((Message)null);
				return;
			case UML2Package.EVENT_OCCURRENCE__SEND_MESSAGE:
				setSendMessage((Message)null);
				return;
			case UML2Package.EVENT_OCCURRENCE__START_EXEC:
				getStartExec().clear();
				return;
			case UML2Package.EVENT_OCCURRENCE__FINISH_EXEC:
				getFinishExec().clear();
				return;
			case UML2Package.EVENT_OCCURRENCE__TO_AFTER:
				getToAfter().clear();
				return;
			case UML2Package.EVENT_OCCURRENCE__TO_BEFORE:
				getToBefore().clear();
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
			case UML2Package.EVENT_OCCURRENCE__RECEIVE_MESSAGE:
				return receiveMessage != null;
			case UML2Package.EVENT_OCCURRENCE__SEND_MESSAGE:
				return sendMessage != null;
			case UML2Package.EVENT_OCCURRENCE__START_EXEC:
				return startExec != null && !startExec.isEmpty();
			case UML2Package.EVENT_OCCURRENCE__FINISH_EXEC:
				return finishExec != null && !finishExec.isEmpty();
			case UML2Package.EVENT_OCCURRENCE__TO_AFTER:
				return toAfter != null && !toAfter.isEmpty();
			case UML2Package.EVENT_OCCURRENCE__TO_BEFORE:
				return toBefore != null && !toBefore.isEmpty();
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
		if (baseClass == MessageEnd.class) {
			switch (derivedFeatureID) {
				case UML2Package.EVENT_OCCURRENCE__RECEIVE_MESSAGE: return UML2Package.MESSAGE_END__RECEIVE_MESSAGE;
				case UML2Package.EVENT_OCCURRENCE__SEND_MESSAGE: return UML2Package.MESSAGE_END__SEND_MESSAGE;
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
		if (baseClass == MessageEnd.class) {
			switch (baseFeatureID) {
				case UML2Package.MESSAGE_END__RECEIVE_MESSAGE: return UML2Package.EVENT_OCCURRENCE__RECEIVE_MESSAGE;
				case UML2Package.MESSAGE_END__SEND_MESSAGE: return UML2Package.EVENT_OCCURRENCE__SEND_MESSAGE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //EventOccurrenceImpl

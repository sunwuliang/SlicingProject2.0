/**
 */
package org.csu.slicing.UML2WithID;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message End</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2WithID.MessageEnd#getReceiveMessage <em>Receive Message</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.MessageEnd#getSendMessage <em>Send Message</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getMessageEnd()
 * @model abstract="true"
 * @generated
 */
public interface MessageEnd extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Receive Message</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2WithID.Message#getReceiveEvent <em>Receive Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receive Message</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receive Message</em>' reference.
	 * @see #setReceiveMessage(Message)
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getMessageEnd_ReceiveMessage()
	 * @see org.csu.slicing.UML2WithID.Message#getReceiveEvent
	 * @model opposite="receiveEvent" ordered="false"
	 * @generated
	 */
	Message getReceiveMessage();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.MessageEnd#getReceiveMessage <em>Receive Message</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receive Message</em>' reference.
	 * @see #getReceiveMessage()
	 * @generated
	 */
	void setReceiveMessage(Message value);

	/**
	 * Returns the value of the '<em><b>Send Message</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2WithID.Message#getSendEvent <em>Send Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Send Message</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Send Message</em>' reference.
	 * @see #setSendMessage(Message)
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getMessageEnd_SendMessage()
	 * @see org.csu.slicing.UML2WithID.Message#getSendEvent
	 * @model opposite="sendEvent" ordered="false"
	 * @generated
	 */
	Message getSendMessage();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.MessageEnd#getSendMessage <em>Send Message</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Send Message</em>' reference.
	 * @see #getSendMessage()
	 * @generated
	 */
	void setSendMessage(Message value);

} // MessageEnd

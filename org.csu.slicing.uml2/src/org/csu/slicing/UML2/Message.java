/**
 */
package org.csu.slicing.UML2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2.Message#getMessageKind <em>Message Kind</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.Message#getMessageSort <em>Message Sort</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.Message#getReceiveEvent <em>Receive Event</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.Message#getSendEvent <em>Send Event</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.Message#getConnector <em>Connector</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.Message#getInteraction <em>Interaction</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.Message#getSignature <em>Signature</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.Message#getArgument <em>Argument</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2.UML2Package#getMessage()
 * @model
 * @generated
 */
public interface Message extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Message Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.csu.slicing.UML2.MessageKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Kind</em>' attribute.
	 * @see org.csu.slicing.UML2.MessageKind
	 * @see #setMessageKind(MessageKind)
	 * @see org.csu.slicing.UML2.UML2Package#getMessage_MessageKind()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	MessageKind getMessageKind();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2.Message#getMessageKind <em>Message Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Kind</em>' attribute.
	 * @see org.csu.slicing.UML2.MessageKind
	 * @see #getMessageKind()
	 * @generated
	 */
	void setMessageKind(MessageKind value);

	/**
	 * Returns the value of the '<em><b>Message Sort</b></em>' attribute.
	 * The literals are from the enumeration {@link org.csu.slicing.UML2.MessageSort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Sort</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Sort</em>' attribute.
	 * @see org.csu.slicing.UML2.MessageSort
	 * @see #setMessageSort(MessageSort)
	 * @see org.csu.slicing.UML2.UML2Package#getMessage_MessageSort()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	MessageSort getMessageSort();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2.Message#getMessageSort <em>Message Sort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Sort</em>' attribute.
	 * @see org.csu.slicing.UML2.MessageSort
	 * @see #getMessageSort()
	 * @generated
	 */
	void setMessageSort(MessageSort value);

	/**
	 * Returns the value of the '<em><b>Receive Event</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2.MessageEnd#getReceiveMessage <em>Receive Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receive Event</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receive Event</em>' reference.
	 * @see #setReceiveEvent(MessageEnd)
	 * @see org.csu.slicing.UML2.UML2Package#getMessage_ReceiveEvent()
	 * @see org.csu.slicing.UML2.MessageEnd#getReceiveMessage
	 * @model opposite="receiveMessage" ordered="false"
	 * @generated
	 */
	MessageEnd getReceiveEvent();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2.Message#getReceiveEvent <em>Receive Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receive Event</em>' reference.
	 * @see #getReceiveEvent()
	 * @generated
	 */
	void setReceiveEvent(MessageEnd value);

	/**
	 * Returns the value of the '<em><b>Send Event</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2.MessageEnd#getSendMessage <em>Send Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Send Event</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Send Event</em>' reference.
	 * @see #setSendEvent(MessageEnd)
	 * @see org.csu.slicing.UML2.UML2Package#getMessage_SendEvent()
	 * @see org.csu.slicing.UML2.MessageEnd#getSendMessage
	 * @model opposite="sendMessage" ordered="false"
	 * @generated
	 */
	MessageEnd getSendEvent();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2.Message#getSendEvent <em>Send Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Send Event</em>' reference.
	 * @see #getSendEvent()
	 * @generated
	 */
	void setSendEvent(MessageEnd value);

	/**
	 * Returns the value of the '<em><b>Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connector</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connector</em>' reference.
	 * @see #setConnector(Connector)
	 * @see org.csu.slicing.UML2.UML2Package#getMessage_Connector()
	 * @model ordered="false"
	 * @generated
	 */
	Connector getConnector();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2.Message#getConnector <em>Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connector</em>' reference.
	 * @see #getConnector()
	 * @generated
	 */
	void setConnector(Connector value);

	/**
	 * Returns the value of the '<em><b>Interaction</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2.Interaction#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interaction</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interaction</em>' container reference.
	 * @see #setInteraction(Interaction)
	 * @see org.csu.slicing.UML2.UML2Package#getMessage_Interaction()
	 * @see org.csu.slicing.UML2.Interaction#getMessage
	 * @model opposite="message" required="true" transient="false" ordered="false"
	 * @generated
	 */
	Interaction getInteraction();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2.Message#getInteraction <em>Interaction</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interaction</em>' container reference.
	 * @see #getInteraction()
	 * @generated
	 */
	void setInteraction(Interaction value);

	/**
	 * Returns the value of the '<em><b>Signature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signature</em>' reference.
	 * @see #setSignature(NamedElement)
	 * @see org.csu.slicing.UML2.UML2Package#getMessage_Signature()
	 * @model ordered="false"
	 * @generated
	 */
	NamedElement getSignature();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2.Message#getSignature <em>Signature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signature</em>' reference.
	 * @see #getSignature()
	 * @generated
	 */
	void setSignature(NamedElement value);

	/**
	 * Returns the value of the '<em><b>Argument</b></em>' containment reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2.ValueSpecification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Argument</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument</em>' containment reference list.
	 * @see org.csu.slicing.UML2.UML2Package#getMessage_Argument()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<ValueSpecification> getArgument();

} // Message

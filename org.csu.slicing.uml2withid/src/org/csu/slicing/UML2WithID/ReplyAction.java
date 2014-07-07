/**
 */
package org.csu.slicing.UML2WithID;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reply Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2WithID.ReplyAction#getReplyToCall <em>Reply To Call</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.ReplyAction#getReplyValue <em>Reply Value</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.ReplyAction#getReturnInformation <em>Return Information</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getReplyAction()
 * @model
 * @generated
 */
public interface ReplyAction extends Action {
	/**
	 * Returns the value of the '<em><b>Reply To Call</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reply To Call</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reply To Call</em>' reference.
	 * @see #setReplyToCall(CallTrigger)
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getReplyAction_ReplyToCall()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	CallTrigger getReplyToCall();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.ReplyAction#getReplyToCall <em>Reply To Call</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reply To Call</em>' reference.
	 * @see #getReplyToCall()
	 * @generated
	 */
	void setReplyToCall(CallTrigger value);

	/**
	 * Returns the value of the '<em><b>Reply Value</b></em>' reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2WithID.InputPin}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reply Value</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reply Value</em>' reference list.
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getReplyAction_ReplyValue()
	 * @model ordered="false"
	 * @generated
	 */
	EList<InputPin> getReplyValue();

	/**
	 * Returns the value of the '<em><b>Return Information</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Information</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Information</em>' reference.
	 * @see #setReturnInformation(InputPin)
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getReplyAction_ReturnInformation()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	InputPin getReturnInformation();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.ReplyAction#getReturnInformation <em>Return Information</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Information</em>' reference.
	 * @see #getReturnInformation()
	 * @generated
	 */
	void setReturnInformation(InputPin value);

} // ReplyAction

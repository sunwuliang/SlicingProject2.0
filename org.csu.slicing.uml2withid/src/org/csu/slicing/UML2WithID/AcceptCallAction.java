/**
 */
package org.csu.slicing.UML2WithID;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Accept Call Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2WithID.AcceptCallAction#getReturnInformation <em>Return Information</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getAcceptCallAction()
 * @model
 * @generated
 */
public interface AcceptCallAction extends AcceptEventAction {
	/**
	 * Returns the value of the '<em><b>Return Information</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Information</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Information</em>' reference.
	 * @see #setReturnInformation(OutputPin)
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getAcceptCallAction_ReturnInformation()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	OutputPin getReturnInformation();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.AcceptCallAction#getReturnInformation <em>Return Information</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Information</em>' reference.
	 * @see #getReturnInformation()
	 * @generated
	 */
	void setReturnInformation(OutputPin value);

} // AcceptCallAction

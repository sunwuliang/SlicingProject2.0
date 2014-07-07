/**
 */
package org.csu.slicing.UML2WithID;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exception Handler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2WithID.ExceptionHandler#getProtectedNode <em>Protected Node</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.ExceptionHandler#getHandlerBody <em>Handler Body</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.ExceptionHandler#getExceptionInput <em>Exception Input</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.ExceptionHandler#getExceptionType <em>Exception Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getExceptionHandler()
 * @model
 * @generated
 */
public interface ExceptionHandler extends Element {
	/**
	 * Returns the value of the '<em><b>Protected Node</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2WithID.ExecutableNode#getHandler <em>Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protected Node</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protected Node</em>' container reference.
	 * @see #setProtectedNode(ExecutableNode)
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getExceptionHandler_ProtectedNode()
	 * @see org.csu.slicing.UML2WithID.ExecutableNode#getHandler
	 * @model opposite="handler" required="true" transient="false" ordered="false"
	 * @generated
	 */
	ExecutableNode getProtectedNode();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.ExceptionHandler#getProtectedNode <em>Protected Node</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protected Node</em>' container reference.
	 * @see #getProtectedNode()
	 * @generated
	 */
	void setProtectedNode(ExecutableNode value);

	/**
	 * Returns the value of the '<em><b>Handler Body</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Handler Body</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Handler Body</em>' reference.
	 * @see #setHandlerBody(ExecutableNode)
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getExceptionHandler_HandlerBody()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ExecutableNode getHandlerBody();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.ExceptionHandler#getHandlerBody <em>Handler Body</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Handler Body</em>' reference.
	 * @see #getHandlerBody()
	 * @generated
	 */
	void setHandlerBody(ExecutableNode value);

	/**
	 * Returns the value of the '<em><b>Exception Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exception Input</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exception Input</em>' reference.
	 * @see #setExceptionInput(ObjectNode)
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getExceptionHandler_ExceptionInput()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ObjectNode getExceptionInput();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.ExceptionHandler#getExceptionInput <em>Exception Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exception Input</em>' reference.
	 * @see #getExceptionInput()
	 * @generated
	 */
	void setExceptionInput(ObjectNode value);

	/**
	 * Returns the value of the '<em><b>Exception Type</b></em>' reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2WithID.Classifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exception Type</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exception Type</em>' reference list.
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getExceptionHandler_ExceptionType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<Classifier> getExceptionType();

} // ExceptionHandler

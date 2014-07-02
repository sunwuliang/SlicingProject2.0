/**
 */
package org.csu.slicing.UML2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Raise Exception Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2.RaiseExceptionAction#getException <em>Exception</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2.UML2Package#getRaiseExceptionAction()
 * @model
 * @generated
 */
public interface RaiseExceptionAction extends Action {
	/**
	 * Returns the value of the '<em><b>Exception</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exception</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exception</em>' reference.
	 * @see #setException(InputPin)
	 * @see org.csu.slicing.UML2.UML2Package#getRaiseExceptionAction_Exception()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	InputPin getException();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2.RaiseExceptionAction#getException <em>Exception</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exception</em>' reference.
	 * @see #getException()
	 * @generated
	 */
	void setException(InputPin value);

} // RaiseExceptionAction

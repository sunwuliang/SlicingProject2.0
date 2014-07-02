/**
 */
package org.csu.slicing.UML2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2.CallAction#isIsSynchronous <em>Is Synchronous</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.CallAction#getResult <em>Result</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2.UML2Package#getCallAction()
 * @model abstract="true"
 * @generated
 */
public interface CallAction extends InvocationAction {
	/**
	 * Returns the value of the '<em><b>Is Synchronous</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Synchronous</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Synchronous</em>' attribute.
	 * @see #setIsSynchronous(boolean)
	 * @see org.csu.slicing.UML2.UML2Package#getCallAction_IsSynchronous()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	boolean isIsSynchronous();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2.CallAction#isIsSynchronous <em>Is Synchronous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Synchronous</em>' attribute.
	 * @see #isIsSynchronous()
	 * @generated
	 */
	void setIsSynchronous(boolean value);

	/**
	 * Returns the value of the '<em><b>Result</b></em>' containment reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2.OutputPin}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result</em>' containment reference list.
	 * @see org.csu.slicing.UML2.UML2Package#getCallAction_Result()
	 * @model containment="true"
	 * @generated
	 */
	EList<OutputPin> getResult();

} // CallAction

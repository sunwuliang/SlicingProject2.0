/**
 */
package org.csu.slicing.UML2WithID;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Apply Function Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2WithID.ApplyFunctionAction#getFunction <em>Function</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.ApplyFunctionAction#getArgument <em>Argument</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.ApplyFunctionAction#getResult <em>Result</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getApplyFunctionAction()
 * @model
 * @generated
 */
public interface ApplyFunctionAction extends Action {
	/**
	 * Returns the value of the '<em><b>Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' reference.
	 * @see #setFunction(PrimitiveFunction)
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getApplyFunctionAction_Function()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	PrimitiveFunction getFunction();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.ApplyFunctionAction#getFunction <em>Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function</em>' reference.
	 * @see #getFunction()
	 * @generated
	 */
	void setFunction(PrimitiveFunction value);

	/**
	 * Returns the value of the '<em><b>Argument</b></em>' containment reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2WithID.InputPin}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Argument</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument</em>' containment reference list.
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getApplyFunctionAction_Argument()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<InputPin> getArgument();

	/**
	 * Returns the value of the '<em><b>Result</b></em>' containment reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2WithID.OutputPin}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result</em>' containment reference list.
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getApplyFunctionAction_Result()
	 * @model containment="true"
	 * @generated
	 */
	EList<OutputPin> getResult();

} // ApplyFunctionAction

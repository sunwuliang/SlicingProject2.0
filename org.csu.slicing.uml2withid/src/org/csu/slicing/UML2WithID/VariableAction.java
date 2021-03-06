/**
 */
package org.csu.slicing.UML2WithID;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2WithID.VariableAction#getVariable <em>Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getVariableAction()
 * @model abstract="true"
 * @generated
 */
public interface VariableAction extends Action {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' reference.
	 * @see #setVariable(Variable)
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getVariableAction_Variable()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Variable getVariable();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.VariableAction#getVariable <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(Variable value);

} // VariableAction

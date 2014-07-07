/**
 */
package org.csu.slicing.UML2WithID;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2WithID.Variable#getScope <em>Scope</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getVariable()
 * @model
 * @generated
 */
public interface Variable extends ConnectableElement, TypedElement, MultiplicityElement {
	/**
	 * Returns the value of the '<em><b>Scope</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2WithID.StructuredActivityNode#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scope</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scope</em>' container reference.
	 * @see #setScope(StructuredActivityNode)
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getVariable_Scope()
	 * @see org.csu.slicing.UML2WithID.StructuredActivityNode#getVariable
	 * @model opposite="variable" required="true" transient="false" ordered="false"
	 * @generated
	 */
	StructuredActivityNode getScope();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.Variable#getScope <em>Scope</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope</em>' container reference.
	 * @see #getScope()
	 * @generated
	 */
	void setScope(StructuredActivityNode value);

} // Variable

/**
 */
package org.csu.slicing.UML2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Change Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2.ChangeTrigger#getChangeExpression <em>Change Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2.UML2Package#getChangeTrigger()
 * @model
 * @generated
 */
public interface ChangeTrigger extends Trigger {
	/**
	 * Returns the value of the '<em><b>Change Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Expression</em>' containment reference.
	 * @see #setChangeExpression(ValueSpecification)
	 * @see org.csu.slicing.UML2.UML2Package#getChangeTrigger_ChangeExpression()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	ValueSpecification getChangeExpression();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2.ChangeTrigger#getChangeExpression <em>Change Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Expression</em>' containment reference.
	 * @see #getChangeExpression()
	 * @generated
	 */
	void setChangeExpression(ValueSpecification value);

} // ChangeTrigger

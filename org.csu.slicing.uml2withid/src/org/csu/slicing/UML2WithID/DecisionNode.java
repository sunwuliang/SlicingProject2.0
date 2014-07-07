/**
 */
package org.csu.slicing.UML2WithID;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decision Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2WithID.DecisionNode#getDecisionInput <em>Decision Input</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getDecisionNode()
 * @model
 * @generated
 */
public interface DecisionNode extends ControlNode {
	/**
	 * Returns the value of the '<em><b>Decision Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decision Input</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decision Input</em>' reference.
	 * @see #setDecisionInput(Behavior)
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getDecisionNode_DecisionInput()
	 * @model ordered="false"
	 * @generated
	 */
	Behavior getDecisionInput();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.DecisionNode#getDecisionInput <em>Decision Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decision Input</em>' reference.
	 * @see #getDecisionInput()
	 * @generated
	 */
	void setDecisionInput(Behavior value);

} // DecisionNode

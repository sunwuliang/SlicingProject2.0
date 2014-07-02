/**
 */
package org.csu.slicing.UML2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Join Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2.JoinNode#isIsCombineDuplicate <em>Is Combine Duplicate</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.JoinNode#getJoinSpec <em>Join Spec</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2.UML2Package#getJoinNode()
 * @model
 * @generated
 */
public interface JoinNode extends ControlNode {
	/**
	 * Returns the value of the '<em><b>Is Combine Duplicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Combine Duplicate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Combine Duplicate</em>' attribute.
	 * @see #setIsCombineDuplicate(boolean)
	 * @see org.csu.slicing.UML2.UML2Package#getJoinNode_IsCombineDuplicate()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	boolean isIsCombineDuplicate();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2.JoinNode#isIsCombineDuplicate <em>Is Combine Duplicate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Combine Duplicate</em>' attribute.
	 * @see #isIsCombineDuplicate()
	 * @generated
	 */
	void setIsCombineDuplicate(boolean value);

	/**
	 * Returns the value of the '<em><b>Join Spec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Join Spec</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Join Spec</em>' containment reference.
	 * @see #setJoinSpec(ValueSpecification)
	 * @see org.csu.slicing.UML2.UML2Package#getJoinNode_JoinSpec()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	ValueSpecification getJoinSpec();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2.JoinNode#getJoinSpec <em>Join Spec</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Join Spec</em>' containment reference.
	 * @see #getJoinSpec()
	 * @generated
	 */
	void setJoinSpec(ValueSpecification value);

} // JoinNode

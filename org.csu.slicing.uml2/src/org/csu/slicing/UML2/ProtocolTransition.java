/**
 */
package org.csu.slicing.UML2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Protocol Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2.ProtocolTransition#getPostCondition <em>Post Condition</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.ProtocolTransition#getReferred <em>Referred</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.ProtocolTransition#getPreCondition <em>Pre Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2.UML2Package#getProtocolTransition()
 * @model
 * @generated
 */
public interface ProtocolTransition extends Transition {
	/**
	 * Returns the value of the '<em><b>Post Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Post Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Post Condition</em>' containment reference.
	 * @see #setPostCondition(Constraint)
	 * @see org.csu.slicing.UML2.UML2Package#getProtocolTransition_PostCondition()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Constraint getPostCondition();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2.ProtocolTransition#getPostCondition <em>Post Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Post Condition</em>' containment reference.
	 * @see #getPostCondition()
	 * @generated
	 */
	void setPostCondition(Constraint value);

	/**
	 * Returns the value of the '<em><b>Referred</b></em>' reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2.Operation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referred</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referred</em>' reference list.
	 * @see org.csu.slicing.UML2.UML2Package#getProtocolTransition_Referred()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Operation> getReferred();

	/**
	 * Returns the value of the '<em><b>Pre Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pre Condition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pre Condition</em>' reference.
	 * @see #setPreCondition(Constraint)
	 * @see org.csu.slicing.UML2.UML2Package#getProtocolTransition_PreCondition()
	 * @model ordered="false"
	 * @generated
	 */
	Constraint getPreCondition();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2.ProtocolTransition#getPreCondition <em>Pre Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pre Condition</em>' reference.
	 * @see #getPreCondition()
	 * @generated
	 */
	void setPreCondition(Constraint value);

} // ProtocolTransition

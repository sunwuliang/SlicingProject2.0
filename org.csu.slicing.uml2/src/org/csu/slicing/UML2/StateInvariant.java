/**
 */
package org.csu.slicing.UML2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Invariant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2.StateInvariant#getInvariant <em>Invariant</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2.UML2Package#getStateInvariant()
 * @model
 * @generated
 */
public interface StateInvariant extends InteractionFragment {
	/**
	 * Returns the value of the '<em><b>Invariant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invariant</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invariant</em>' containment reference.
	 * @see #setInvariant(Constraint)
	 * @see org.csu.slicing.UML2.UML2Package#getStateInvariant_Invariant()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Constraint getInvariant();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2.StateInvariant#getInvariant <em>Invariant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invariant</em>' containment reference.
	 * @see #getInvariant()
	 * @generated
	 */
	void setInvariant(Constraint value);

} // StateInvariant

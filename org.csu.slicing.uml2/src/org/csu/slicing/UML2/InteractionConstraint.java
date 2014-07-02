/**
 */
package org.csu.slicing.UML2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interaction Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2.InteractionConstraint#getMinint <em>Minint</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.InteractionConstraint#getMaxint <em>Maxint</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2.UML2Package#getInteractionConstraint()
 * @model
 * @generated
 */
public interface InteractionConstraint extends Constraint {
	/**
	 * Returns the value of the '<em><b>Minint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minint</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minint</em>' containment reference.
	 * @see #setMinint(ValueSpecification)
	 * @see org.csu.slicing.UML2.UML2Package#getInteractionConstraint_Minint()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	ValueSpecification getMinint();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2.InteractionConstraint#getMinint <em>Minint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minint</em>' containment reference.
	 * @see #getMinint()
	 * @generated
	 */
	void setMinint(ValueSpecification value);

	/**
	 * Returns the value of the '<em><b>Maxint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maxint</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maxint</em>' containment reference.
	 * @see #setMaxint(ValueSpecification)
	 * @see org.csu.slicing.UML2.UML2Package#getInteractionConstraint_Maxint()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	ValueSpecification getMaxint();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2.InteractionConstraint#getMaxint <em>Maxint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maxint</em>' containment reference.
	 * @see #getMaxint()
	 * @generated
	 */
	void setMaxint(ValueSpecification value);

} // InteractionConstraint

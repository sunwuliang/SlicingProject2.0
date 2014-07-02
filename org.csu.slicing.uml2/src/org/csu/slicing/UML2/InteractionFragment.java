/**
 */
package org.csu.slicing.UML2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interaction Fragment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2.InteractionFragment#getCovered <em>Covered</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.InteractionFragment#getGeneralOrdering <em>General Ordering</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.InteractionFragment#getEnclosingInteraction <em>Enclosing Interaction</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.InteractionFragment#getEnclosingOperand <em>Enclosing Operand</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2.UML2Package#getInteractionFragment()
 * @model abstract="true"
 * @generated
 */
public interface InteractionFragment extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Covered</b></em>' reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2.Lifeline}.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2.Lifeline#getCoveredBy <em>Covered By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Covered</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Covered</em>' reference list.
	 * @see org.csu.slicing.UML2.UML2Package#getInteractionFragment_Covered()
	 * @see org.csu.slicing.UML2.Lifeline#getCoveredBy
	 * @model opposite="coveredBy"
	 * @generated
	 */
	EList<Lifeline> getCovered();

	/**
	 * Returns the value of the '<em><b>General Ordering</b></em>' containment reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2.GeneralOrdering}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>General Ordering</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>General Ordering</em>' containment reference list.
	 * @see org.csu.slicing.UML2.UML2Package#getInteractionFragment_GeneralOrdering()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<GeneralOrdering> getGeneralOrdering();

	/**
	 * Returns the value of the '<em><b>Enclosing Interaction</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2.Interaction#getFragment <em>Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enclosing Interaction</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enclosing Interaction</em>' container reference.
	 * @see #setEnclosingInteraction(Interaction)
	 * @see org.csu.slicing.UML2.UML2Package#getInteractionFragment_EnclosingInteraction()
	 * @see org.csu.slicing.UML2.Interaction#getFragment
	 * @model opposite="fragment" transient="false" ordered="false"
	 * @generated
	 */
	Interaction getEnclosingInteraction();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2.InteractionFragment#getEnclosingInteraction <em>Enclosing Interaction</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enclosing Interaction</em>' container reference.
	 * @see #getEnclosingInteraction()
	 * @generated
	 */
	void setEnclosingInteraction(Interaction value);

	/**
	 * Returns the value of the '<em><b>Enclosing Operand</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2.InteractionOperand#getFragment <em>Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enclosing Operand</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enclosing Operand</em>' container reference.
	 * @see #setEnclosingOperand(InteractionOperand)
	 * @see org.csu.slicing.UML2.UML2Package#getInteractionFragment_EnclosingOperand()
	 * @see org.csu.slicing.UML2.InteractionOperand#getFragment
	 * @model opposite="fragment" transient="false" ordered="false"
	 * @generated
	 */
	InteractionOperand getEnclosingOperand();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2.InteractionFragment#getEnclosingOperand <em>Enclosing Operand</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enclosing Operand</em>' container reference.
	 * @see #getEnclosingOperand()
	 * @generated
	 */
	void setEnclosingOperand(InteractionOperand value);

} // InteractionFragment

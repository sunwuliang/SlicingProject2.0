/**
 */
package org.csu.slicing.UML2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2.Interaction#getLifeline <em>Lifeline</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.Interaction#getMessage <em>Message</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.Interaction#getFragment <em>Fragment</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.Interaction#getFormalGate <em>Formal Gate</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2.UML2Package#getInteraction()
 * @model
 * @generated
 */
public interface Interaction extends Behavior, InteractionFragment {
	/**
	 * Returns the value of the '<em><b>Lifeline</b></em>' containment reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2.Lifeline}.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2.Lifeline#getInteraction <em>Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lifeline</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lifeline</em>' containment reference list.
	 * @see org.csu.slicing.UML2.UML2Package#getInteraction_Lifeline()
	 * @see org.csu.slicing.UML2.Lifeline#getInteraction
	 * @model opposite="interaction" containment="true" ordered="false"
	 * @generated
	 */
	EList<Lifeline> getLifeline();

	/**
	 * Returns the value of the '<em><b>Message</b></em>' containment reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2.Message}.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2.Message#getInteraction <em>Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' containment reference list.
	 * @see org.csu.slicing.UML2.UML2Package#getInteraction_Message()
	 * @see org.csu.slicing.UML2.Message#getInteraction
	 * @model opposite="interaction" containment="true" ordered="false"
	 * @generated
	 */
	EList<Message> getMessage();

	/**
	 * Returns the value of the '<em><b>Fragment</b></em>' containment reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2.InteractionFragment}.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2.InteractionFragment#getEnclosingInteraction <em>Enclosing Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fragment</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fragment</em>' containment reference list.
	 * @see org.csu.slicing.UML2.UML2Package#getInteraction_Fragment()
	 * @see org.csu.slicing.UML2.InteractionFragment#getEnclosingInteraction
	 * @model opposite="enclosingInteraction" containment="true"
	 * @generated
	 */
	EList<InteractionFragment> getFragment();

	/**
	 * Returns the value of the '<em><b>Formal Gate</b></em>' containment reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2.Gate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Formal Gate</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formal Gate</em>' containment reference list.
	 * @see org.csu.slicing.UML2.UML2Package#getInteraction_FormalGate()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Gate> getFormalGate();

} // Interaction

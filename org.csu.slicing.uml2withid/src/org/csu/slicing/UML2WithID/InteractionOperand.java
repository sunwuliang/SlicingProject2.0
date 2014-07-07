/**
 */
package org.csu.slicing.UML2WithID;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interaction Operand</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2WithID.InteractionOperand#getGuard <em>Guard</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.InteractionOperand#getFragment <em>Fragment</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getInteractionOperand()
 * @model
 * @generated
 */
public interface InteractionOperand extends Namespace, InteractionFragment {
	/**
	 * Returns the value of the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guard</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard</em>' containment reference.
	 * @see #setGuard(InteractionConstraint)
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getInteractionOperand_Guard()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	InteractionConstraint getGuard();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.InteractionOperand#getGuard <em>Guard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard</em>' containment reference.
	 * @see #getGuard()
	 * @generated
	 */
	void setGuard(InteractionConstraint value);

	/**
	 * Returns the value of the '<em><b>Fragment</b></em>' containment reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2WithID.InteractionFragment}.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2WithID.InteractionFragment#getEnclosingOperand <em>Enclosing Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fragment</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fragment</em>' containment reference list.
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getInteractionOperand_Fragment()
	 * @see org.csu.slicing.UML2WithID.InteractionFragment#getEnclosingOperand
	 * @model opposite="enclosingOperand" containment="true" ordered="false"
	 * @generated
	 */
	EList<InteractionFragment> getFragment();

} // InteractionOperand

/**
 */
package org.csu.slicing.UML2WithID;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Combined Fragment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2WithID.CombinedFragment#getInteractionOperator <em>Interaction Operator</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.CombinedFragment#getOperand <em>Operand</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.CombinedFragment#getCfragmentGate <em>Cfragment Gate</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getCombinedFragment()
 * @model
 * @generated
 */
public interface CombinedFragment extends InteractionFragment {
	/**
	 * Returns the value of the '<em><b>Interaction Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link org.csu.slicing.UML2WithID.InteractionOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interaction Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interaction Operator</em>' attribute.
	 * @see org.csu.slicing.UML2WithID.InteractionOperator
	 * @see #setInteractionOperator(InteractionOperator)
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getCombinedFragment_InteractionOperator()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	InteractionOperator getInteractionOperator();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.CombinedFragment#getInteractionOperator <em>Interaction Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interaction Operator</em>' attribute.
	 * @see org.csu.slicing.UML2WithID.InteractionOperator
	 * @see #getInteractionOperator()
	 * @generated
	 */
	void setInteractionOperator(InteractionOperator value);

	/**
	 * Returns the value of the '<em><b>Operand</b></em>' containment reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2WithID.InteractionOperand}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operand</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operand</em>' containment reference list.
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getCombinedFragment_Operand()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<InteractionOperand> getOperand();

	/**
	 * Returns the value of the '<em><b>Cfragment Gate</b></em>' containment reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2WithID.Gate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cfragment Gate</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cfragment Gate</em>' containment reference list.
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getCombinedFragment_CfragmentGate()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Gate> getCfragmentGate();

} // CombinedFragment

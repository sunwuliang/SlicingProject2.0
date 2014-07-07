/**
 */
package org.csu.slicing.UML2WithID;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interaction Occurrence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2WithID.InteractionOccurrence#getRefersTo <em>Refers To</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.InteractionOccurrence#getActualGate <em>Actual Gate</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.InteractionOccurrence#getArgument <em>Argument</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getInteractionOccurrence()
 * @model
 * @generated
 */
public interface InteractionOccurrence extends InteractionFragment {
	/**
	 * Returns the value of the '<em><b>Refers To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refers To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refers To</em>' reference.
	 * @see #setRefersTo(Interaction)
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getInteractionOccurrence_RefersTo()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Interaction getRefersTo();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.InteractionOccurrence#getRefersTo <em>Refers To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refers To</em>' reference.
	 * @see #getRefersTo()
	 * @generated
	 */
	void setRefersTo(Interaction value);

	/**
	 * Returns the value of the '<em><b>Actual Gate</b></em>' containment reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2WithID.Gate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actual Gate</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual Gate</em>' containment reference list.
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getInteractionOccurrence_ActualGate()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Gate> getActualGate();

	/**
	 * Returns the value of the '<em><b>Argument</b></em>' containment reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2WithID.InputPin}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Argument</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument</em>' containment reference list.
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getInteractionOccurrence_Argument()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<InputPin> getArgument();

} // InteractionOccurrence

/**
 */
package org.csu.slicing.UML2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expansion Region</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2.ExpansionRegion#getMode <em>Mode</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.ExpansionRegion#getOutputElement <em>Output Element</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.ExpansionRegion#getInputElement <em>Input Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2.UML2Package#getExpansionRegion()
 * @model
 * @generated
 */
public interface ExpansionRegion extends StructuredActivityNode {
	/**
	 * Returns the value of the '<em><b>Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link org.csu.slicing.UML2.ExpansionKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' attribute.
	 * @see org.csu.slicing.UML2.ExpansionKind
	 * @see #setMode(ExpansionKind)
	 * @see org.csu.slicing.UML2.UML2Package#getExpansionRegion_Mode()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	ExpansionKind getMode();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2.ExpansionRegion#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' attribute.
	 * @see org.csu.slicing.UML2.ExpansionKind
	 * @see #getMode()
	 * @generated
	 */
	void setMode(ExpansionKind value);

	/**
	 * Returns the value of the '<em><b>Output Element</b></em>' reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2.ExpansionNode}.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2.ExpansionNode#getRegionAsOutput <em>Region As Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Element</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Element</em>' reference list.
	 * @see org.csu.slicing.UML2.UML2Package#getExpansionRegion_OutputElement()
	 * @see org.csu.slicing.UML2.ExpansionNode#getRegionAsOutput
	 * @model opposite="regionAsOutput" ordered="false"
	 * @generated
	 */
	EList<ExpansionNode> getOutputElement();

	/**
	 * Returns the value of the '<em><b>Input Element</b></em>' reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2.ExpansionNode}.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2.ExpansionNode#getRegionAsInput <em>Region As Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Element</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Element</em>' reference list.
	 * @see org.csu.slicing.UML2.UML2Package#getExpansionRegion_InputElement()
	 * @see org.csu.slicing.UML2.ExpansionNode#getRegionAsInput
	 * @model opposite="regionAsInput" required="true" ordered="false"
	 * @generated
	 */
	EList<ExpansionNode> getInputElement();

} // ExpansionRegion

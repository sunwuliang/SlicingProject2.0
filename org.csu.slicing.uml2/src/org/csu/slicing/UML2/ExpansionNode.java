/**
 */
package org.csu.slicing.UML2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expansion Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2.ExpansionNode#getRegionAsOutput <em>Region As Output</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.ExpansionNode#getRegionAsInput <em>Region As Input</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2.UML2Package#getExpansionNode()
 * @model
 * @generated
 */
public interface ExpansionNode extends ObjectNode {
	/**
	 * Returns the value of the '<em><b>Region As Output</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2.ExpansionRegion#getOutputElement <em>Output Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Region As Output</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Region As Output</em>' reference.
	 * @see #setRegionAsOutput(ExpansionRegion)
	 * @see org.csu.slicing.UML2.UML2Package#getExpansionNode_RegionAsOutput()
	 * @see org.csu.slicing.UML2.ExpansionRegion#getOutputElement
	 * @model opposite="outputElement" ordered="false"
	 * @generated
	 */
	ExpansionRegion getRegionAsOutput();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2.ExpansionNode#getRegionAsOutput <em>Region As Output</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Region As Output</em>' reference.
	 * @see #getRegionAsOutput()
	 * @generated
	 */
	void setRegionAsOutput(ExpansionRegion value);

	/**
	 * Returns the value of the '<em><b>Region As Input</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2.ExpansionRegion#getInputElement <em>Input Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Region As Input</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Region As Input</em>' reference.
	 * @see #setRegionAsInput(ExpansionRegion)
	 * @see org.csu.slicing.UML2.UML2Package#getExpansionNode_RegionAsInput()
	 * @see org.csu.slicing.UML2.ExpansionRegion#getInputElement
	 * @model opposite="inputElement" ordered="false"
	 * @generated
	 */
	ExpansionRegion getRegionAsInput();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2.ExpansionNode#getRegionAsInput <em>Region As Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Region As Input</em>' reference.
	 * @see #getRegionAsInput()
	 * @generated
	 */
	void setRegionAsInput(ExpansionRegion value);

} // ExpansionNode

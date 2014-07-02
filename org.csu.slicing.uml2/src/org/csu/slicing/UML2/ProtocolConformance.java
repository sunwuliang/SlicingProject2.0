/**
 */
package org.csu.slicing.UML2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Protocol Conformance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2.ProtocolConformance#getSpecificMachine <em>Specific Machine</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.ProtocolConformance#getGeneralMachine <em>General Machine</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2.UML2Package#getProtocolConformance()
 * @model
 * @generated
 */
public interface ProtocolConformance extends DirectedRelationship {
	/**
	 * Returns the value of the '<em><b>Specific Machine</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2.ProtocolStateMachine#getConformance <em>Conformance</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specific Machine</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specific Machine</em>' container reference.
	 * @see #setSpecificMachine(ProtocolStateMachine)
	 * @see org.csu.slicing.UML2.UML2Package#getProtocolConformance_SpecificMachine()
	 * @see org.csu.slicing.UML2.ProtocolStateMachine#getConformance
	 * @model opposite="conformance" required="true" transient="false" ordered="false"
	 * @generated
	 */
	ProtocolStateMachine getSpecificMachine();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2.ProtocolConformance#getSpecificMachine <em>Specific Machine</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specific Machine</em>' container reference.
	 * @see #getSpecificMachine()
	 * @generated
	 */
	void setSpecificMachine(ProtocolStateMachine value);

	/**
	 * Returns the value of the '<em><b>General Machine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>General Machine</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>General Machine</em>' reference.
	 * @see #setGeneralMachine(ProtocolStateMachine)
	 * @see org.csu.slicing.UML2.UML2Package#getProtocolConformance_GeneralMachine()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ProtocolStateMachine getGeneralMachine();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2.ProtocolConformance#getGeneralMachine <em>General Machine</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>General Machine</em>' reference.
	 * @see #getGeneralMachine()
	 * @generated
	 */
	void setGeneralMachine(ProtocolStateMachine value);

} // ProtocolConformance

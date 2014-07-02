/**
 */
package org.csu.slicing.UML2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Protocol State Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2.ProtocolStateMachine#getConformance <em>Conformance</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2.UML2Package#getProtocolStateMachine()
 * @model
 * @generated
 */
public interface ProtocolStateMachine extends StateMachine {
	/**
	 * Returns the value of the '<em><b>Conformance</b></em>' containment reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2.ProtocolConformance}.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2.ProtocolConformance#getSpecificMachine <em>Specific Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conformance</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conformance</em>' containment reference list.
	 * @see org.csu.slicing.UML2.UML2Package#getProtocolStateMachine_Conformance()
	 * @see org.csu.slicing.UML2.ProtocolConformance#getSpecificMachine
	 * @model opposite="specificMachine" containment="true" ordered="false"
	 * @generated
	 */
	EList<ProtocolConformance> getConformance();

} // ProtocolStateMachine

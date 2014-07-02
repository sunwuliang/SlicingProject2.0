/**
 */
package org.csu.slicing.UML2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2.StateMachine#getRegion <em>Region</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.StateMachine#getConnectionPoint <em>Connection Point</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.StateMachine#getExtendedStateMachine <em>Extended State Machine</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.StateMachine#getStateMachine_redefinitionContext <em>State Machine redefinition Context</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2.UML2Package#getStateMachine()
 * @model
 * @generated
 */
public interface StateMachine extends Behavior {
	/**
	 * Returns the value of the '<em><b>Region</b></em>' containment reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2.Region}.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2.Region#getStateMachine <em>State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Region</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Region</em>' containment reference list.
	 * @see org.csu.slicing.UML2.UML2Package#getStateMachine_Region()
	 * @see org.csu.slicing.UML2.Region#getStateMachine
	 * @model opposite="stateMachine" containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<Region> getRegion();

	/**
	 * Returns the value of the '<em><b>Connection Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2.Pseudostate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection Point</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection Point</em>' containment reference list.
	 * @see org.csu.slicing.UML2.UML2Package#getStateMachine_ConnectionPoint()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Pseudostate> getConnectionPoint();

	/**
	 * Returns the value of the '<em><b>Extended State Machine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extended State Machine</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extended State Machine</em>' reference.
	 * @see #setExtendedStateMachine(StateMachine)
	 * @see org.csu.slicing.UML2.UML2Package#getStateMachine_ExtendedStateMachine()
	 * @model ordered="false"
	 * @generated
	 */
	StateMachine getExtendedStateMachine();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2.StateMachine#getExtendedStateMachine <em>Extended State Machine</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extended State Machine</em>' reference.
	 * @see #getExtendedStateMachine()
	 * @generated
	 */
	void setExtendedStateMachine(StateMachine value);

	/**
	 * Returns the value of the '<em><b>State Machine redefinition Context</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2.BehavioredClassifier#getOwnedStateMachine <em>Owned State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State Machine redefinition Context</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Machine redefinition Context</em>' container reference.
	 * @see #setStateMachine_redefinitionContext(BehavioredClassifier)
	 * @see org.csu.slicing.UML2.UML2Package#getStateMachine_StateMachine_redefinitionContext()
	 * @see org.csu.slicing.UML2.BehavioredClassifier#getOwnedStateMachine
	 * @model opposite="ownedStateMachine" transient="false" ordered="false"
	 * @generated
	 */
	BehavioredClassifier getStateMachine_redefinitionContext();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2.StateMachine#getStateMachine_redefinitionContext <em>State Machine redefinition Context</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Machine redefinition Context</em>' container reference.
	 * @see #getStateMachine_redefinitionContext()
	 * @generated
	 */
	void setStateMachine_redefinitionContext(BehavioredClassifier value);

} // StateMachine

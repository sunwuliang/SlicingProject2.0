/**
 */
package org.csu.slicing.UML2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Loop Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2.LoopNode#isIsTestedFirst <em>Is Tested First</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.LoopNode#getBodyPart <em>Body Part</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.LoopNode#getSetupPart <em>Setup Part</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.LoopNode#getDecider <em>Decider</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.LoopNode#getTest <em>Test</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.LoopNode#getResult <em>Result</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.LoopNode#getLoopVariable <em>Loop Variable</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.LoopNode#getBodyOutput <em>Body Output</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.LoopNode#getLoopVariableInput <em>Loop Variable Input</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2.UML2Package#getLoopNode()
 * @model
 * @generated
 */
public interface LoopNode extends StructuredActivityNode {
	/**
	 * Returns the value of the '<em><b>Is Tested First</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Tested First</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Tested First</em>' attribute.
	 * @see #setIsTestedFirst(boolean)
	 * @see org.csu.slicing.UML2.UML2Package#getLoopNode_IsTestedFirst()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	boolean isIsTestedFirst();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2.LoopNode#isIsTestedFirst <em>Is Tested First</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Tested First</em>' attribute.
	 * @see #isIsTestedFirst()
	 * @generated
	 */
	void setIsTestedFirst(boolean value);

	/**
	 * Returns the value of the '<em><b>Body Part</b></em>' reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2.ActivityNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body Part</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body Part</em>' reference list.
	 * @see org.csu.slicing.UML2.UML2Package#getLoopNode_BodyPart()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ActivityNode> getBodyPart();

	/**
	 * Returns the value of the '<em><b>Setup Part</b></em>' reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2.ActivityNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Setup Part</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Setup Part</em>' reference list.
	 * @see org.csu.slicing.UML2.UML2Package#getLoopNode_SetupPart()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ActivityNode> getSetupPart();

	/**
	 * Returns the value of the '<em><b>Decider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decider</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decider</em>' reference.
	 * @see #setDecider(OutputPin)
	 * @see org.csu.slicing.UML2.UML2Package#getLoopNode_Decider()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	OutputPin getDecider();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2.LoopNode#getDecider <em>Decider</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decider</em>' reference.
	 * @see #getDecider()
	 * @generated
	 */
	void setDecider(OutputPin value);

	/**
	 * Returns the value of the '<em><b>Test</b></em>' reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2.ActivityNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Test</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test</em>' reference list.
	 * @see org.csu.slicing.UML2.UML2Package#getLoopNode_Test()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ActivityNode> getTest();

	/**
	 * Returns the value of the '<em><b>Result</b></em>' containment reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2.OutputPin}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result</em>' containment reference list.
	 * @see org.csu.slicing.UML2.UML2Package#getLoopNode_Result()
	 * @model containment="true"
	 * @generated
	 */
	EList<OutputPin> getResult();

	/**
	 * Returns the value of the '<em><b>Loop Variable</b></em>' containment reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2.OutputPin}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Loop Variable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loop Variable</em>' containment reference list.
	 * @see org.csu.slicing.UML2.UML2Package#getLoopNode_LoopVariable()
	 * @model containment="true"
	 * @generated
	 */
	EList<OutputPin> getLoopVariable();

	/**
	 * Returns the value of the '<em><b>Body Output</b></em>' reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2.OutputPin}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body Output</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body Output</em>' reference list.
	 * @see org.csu.slicing.UML2.UML2Package#getLoopNode_BodyOutput()
	 * @model ordered="false"
	 * @generated
	 */
	EList<OutputPin> getBodyOutput();

	/**
	 * Returns the value of the '<em><b>Loop Variable Input</b></em>' containment reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2.InputPin}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Loop Variable Input</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loop Variable Input</em>' containment reference list.
	 * @see org.csu.slicing.UML2.UML2Package#getLoopNode_LoopVariableInput()
	 * @model containment="true"
	 * @generated
	 */
	EList<InputPin> getLoopVariableInput();

} // LoopNode

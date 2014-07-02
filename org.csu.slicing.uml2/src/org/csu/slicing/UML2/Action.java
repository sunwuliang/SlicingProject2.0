/**
 */
package org.csu.slicing.UML2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2.Action#getEffect <em>Effect</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.Action#getOutput <em>Output</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.Action#getInput <em>Input</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.Action#getContext_ <em>Context </em>}</li>
 *   <li>{@link org.csu.slicing.UML2.Action#getLocalPrecondition <em>Local Precondition</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.Action#getLocalPostcondition <em>Local Postcondition</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2.UML2Package#getAction()
 * @model
 * @generated
 */
public interface Action extends ExecutableNode {
	/**
	 * Returns the value of the '<em><b>Effect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effect</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effect</em>' attribute.
	 * @see #setEffect(String)
	 * @see org.csu.slicing.UML2.UML2Package#getAction_Effect()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getEffect();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2.Action#getEffect <em>Effect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effect</em>' attribute.
	 * @see #getEffect()
	 * @generated
	 */
	void setEffect(String value);

	/**
	 * Returns the value of the '<em><b>Output</b></em>' reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2.OutputPin}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' reference list.
	 * @see org.csu.slicing.UML2.UML2Package#getAction_Output()
	 * @model
	 * @generated
	 */
	EList<OutputPin> getOutput();

	/**
	 * Returns the value of the '<em><b>Input</b></em>' reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2.InputPin}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' reference list.
	 * @see org.csu.slicing.UML2.UML2Package#getAction_Input()
	 * @model
	 * @generated
	 */
	EList<InputPin> getInput();

	/**
	 * Returns the value of the '<em><b>Context </b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context </em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context </em>' reference.
	 * @see #setContext_(Classifier)
	 * @see org.csu.slicing.UML2.UML2Package#getAction_Context_()
	 * @model ordered="false"
	 * @generated
	 */
	Classifier getContext_();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2.Action#getContext_ <em>Context </em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context </em>' reference.
	 * @see #getContext_()
	 * @generated
	 */
	void setContext_(Classifier value);

	/**
	 * Returns the value of the '<em><b>Local Precondition</b></em>' containment reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2.Constraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local Precondition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Precondition</em>' containment reference list.
	 * @see org.csu.slicing.UML2.UML2Package#getAction_LocalPrecondition()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Constraint> getLocalPrecondition();

	/**
	 * Returns the value of the '<em><b>Local Postcondition</b></em>' containment reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2.Constraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local Postcondition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Postcondition</em>' containment reference list.
	 * @see org.csu.slicing.UML2.UML2Package#getAction_LocalPostcondition()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Constraint> getLocalPostcondition();

} // Action

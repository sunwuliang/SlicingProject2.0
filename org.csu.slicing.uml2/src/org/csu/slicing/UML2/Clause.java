/**
 */
package org.csu.slicing.UML2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2.Clause#getTest <em>Test</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.Clause#getBody <em>Body</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.Clause#getPredecessorClause <em>Predecessor Clause</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.Clause#getSuccessorClause <em>Successor Clause</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.Clause#getDecider <em>Decider</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.Clause#getBodyOutput <em>Body Output</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2.UML2Package#getClause()
 * @model
 * @generated
 */
public interface Clause extends Element {
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
	 * @see org.csu.slicing.UML2.UML2Package#getClause_Test()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ActivityNode> getTest();

	/**
	 * Returns the value of the '<em><b>Body</b></em>' reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2.ActivityNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' reference list.
	 * @see org.csu.slicing.UML2.UML2Package#getClause_Body()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ActivityNode> getBody();

	/**
	 * Returns the value of the '<em><b>Predecessor Clause</b></em>' reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2.Clause}.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2.Clause#getSuccessorClause <em>Successor Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predecessor Clause</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predecessor Clause</em>' reference list.
	 * @see org.csu.slicing.UML2.UML2Package#getClause_PredecessorClause()
	 * @see org.csu.slicing.UML2.Clause#getSuccessorClause
	 * @model opposite="successorClause" ordered="false"
	 * @generated
	 */
	EList<Clause> getPredecessorClause();

	/**
	 * Returns the value of the '<em><b>Successor Clause</b></em>' reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2.Clause}.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2.Clause#getPredecessorClause <em>Predecessor Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Successor Clause</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Successor Clause</em>' reference list.
	 * @see org.csu.slicing.UML2.UML2Package#getClause_SuccessorClause()
	 * @see org.csu.slicing.UML2.Clause#getPredecessorClause
	 * @model opposite="predecessorClause" ordered="false"
	 * @generated
	 */
	EList<Clause> getSuccessorClause();

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
	 * @see org.csu.slicing.UML2.UML2Package#getClause_Decider()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	OutputPin getDecider();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2.Clause#getDecider <em>Decider</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decider</em>' reference.
	 * @see #getDecider()
	 * @generated
	 */
	void setDecider(OutputPin value);

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
	 * @see org.csu.slicing.UML2.UML2Package#getClause_BodyOutput()
	 * @model ordered="false"
	 * @generated
	 */
	EList<OutputPin> getBodyOutput();

} // Clause

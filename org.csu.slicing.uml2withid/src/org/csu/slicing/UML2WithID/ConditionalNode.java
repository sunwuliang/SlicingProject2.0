/**
 */
package org.csu.slicing.UML2WithID;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conditional Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2WithID.ConditionalNode#isIsDeterminate <em>Is Determinate</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.ConditionalNode#isIsAssured <em>Is Assured</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.ConditionalNode#getClause <em>Clause</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.ConditionalNode#getResult <em>Result</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getConditionalNode()
 * @model
 * @generated
 */
public interface ConditionalNode extends StructuredActivityNode {
	/**
	 * Returns the value of the '<em><b>Is Determinate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Determinate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Determinate</em>' attribute.
	 * @see #setIsDeterminate(boolean)
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getConditionalNode_IsDeterminate()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	boolean isIsDeterminate();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.ConditionalNode#isIsDeterminate <em>Is Determinate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Determinate</em>' attribute.
	 * @see #isIsDeterminate()
	 * @generated
	 */
	void setIsDeterminate(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Assured</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Assured</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Assured</em>' attribute.
	 * @see #setIsAssured(boolean)
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getConditionalNode_IsAssured()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	boolean isIsAssured();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.ConditionalNode#isIsAssured <em>Is Assured</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Assured</em>' attribute.
	 * @see #isIsAssured()
	 * @generated
	 */
	void setIsAssured(boolean value);

	/**
	 * Returns the value of the '<em><b>Clause</b></em>' containment reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2WithID.Clause}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clause</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clause</em>' containment reference list.
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getConditionalNode_Clause()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<Clause> getClause();

	/**
	 * Returns the value of the '<em><b>Result</b></em>' containment reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2WithID.OutputPin}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result</em>' containment reference list.
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getConditionalNode_Result()
	 * @model containment="true"
	 * @generated
	 */
	EList<OutputPin> getResult();

} // ConditionalNode

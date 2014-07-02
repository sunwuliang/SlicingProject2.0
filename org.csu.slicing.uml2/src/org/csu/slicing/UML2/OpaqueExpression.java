/**
 */
package org.csu.slicing.UML2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Opaque Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2.OpaqueExpression#getBodies <em>Bodies</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.OpaqueExpression#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.OpaqueExpression#getResult <em>Result</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.OpaqueExpression#getBehavior <em>Behavior</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2.UML2Package#getOpaqueExpression()
 * @model
 * @generated
 */
public interface OpaqueExpression extends ValueSpecification {
	/**
	 * Returns the value of the '<em><b>Bodies</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bodies</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bodies</em>' attribute list.
	 * @see org.csu.slicing.UML2.UML2Package#getOpaqueExpression_Bodies()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	EList<String> getBodies();

	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see #setLanguage(String)
	 * @see org.csu.slicing.UML2.UML2Package#getOpaqueExpression_Language()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getLanguage();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2.OpaqueExpression#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(String value);

	/**
	 * Returns the value of the '<em><b>Result</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result</em>' reference.
	 * @see #setResult(Parameter)
	 * @see org.csu.slicing.UML2.UML2Package#getOpaqueExpression_Result()
	 * @model ordered="false"
	 * @generated
	 */
	Parameter getResult();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2.OpaqueExpression#getResult <em>Result</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' reference.
	 * @see #getResult()
	 * @generated
	 */
	void setResult(Parameter value);

	/**
	 * Returns the value of the '<em><b>Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Behavior</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behavior</em>' reference.
	 * @see #setBehavior(Behavior)
	 * @see org.csu.slicing.UML2.UML2Package#getOpaqueExpression_Behavior()
	 * @model ordered="false"
	 * @generated
	 */
	Behavior getBehavior();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2.OpaqueExpression#getBehavior <em>Behavior</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Behavior</em>' reference.
	 * @see #getBehavior()
	 * @generated
	 */
	void setBehavior(Behavior value);

} // OpaqueExpression

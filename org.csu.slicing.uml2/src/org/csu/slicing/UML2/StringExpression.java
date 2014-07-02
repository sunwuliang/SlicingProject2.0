/**
 */
package org.csu.slicing.UML2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2.StringExpression#getSubExpression <em>Sub Expression</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.StringExpression#getOwningExpression <em>Owning Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2.UML2Package#getStringExpression()
 * @model
 * @generated
 */
public interface StringExpression extends TemplateableElement {
	/**
	 * Returns the value of the '<em><b>Sub Expression</b></em>' containment reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2.StringExpression}.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2.StringExpression#getOwningExpression <em>Owning Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Expression</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Expression</em>' containment reference list.
	 * @see org.csu.slicing.UML2.UML2Package#getStringExpression_SubExpression()
	 * @see org.csu.slicing.UML2.StringExpression#getOwningExpression
	 * @model opposite="owningExpression" containment="true" ordered="false"
	 * @generated
	 */
	EList<StringExpression> getSubExpression();

	/**
	 * Returns the value of the '<em><b>Owning Expression</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2.StringExpression#getSubExpression <em>Sub Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Expression</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Expression</em>' container reference.
	 * @see #setOwningExpression(StringExpression)
	 * @see org.csu.slicing.UML2.UML2Package#getStringExpression_OwningExpression()
	 * @see org.csu.slicing.UML2.StringExpression#getSubExpression
	 * @model opposite="subExpression" transient="false" ordered="false"
	 * @generated
	 */
	StringExpression getOwningExpression();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2.StringExpression#getOwningExpression <em>Owning Expression</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Expression</em>' container reference.
	 * @see #getOwningExpression()
	 * @generated
	 */
	void setOwningExpression(StringExpression value);

} // StringExpression

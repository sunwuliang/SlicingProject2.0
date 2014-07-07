/**
 */
package org.csu.slicing.UML2WithID;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2WithID.Comment#getBody <em>Body</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.Comment#getAnnotatedElement <em>Annotated Element</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.Comment#getBodyExpression <em>Body Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getComment()
 * @model
 * @generated
 */
public interface Comment extends TemplateableElement {
	/**
	 * Returns the value of the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' attribute.
	 * @see #setBody(String)
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getComment_Body()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getBody();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.Comment#getBody <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' attribute.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(String value);

	/**
	 * Returns the value of the '<em><b>Annotated Element</b></em>' reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2WithID.Element}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotated Element</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotated Element</em>' reference list.
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getComment_AnnotatedElement()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Element> getAnnotatedElement();

	/**
	 * Returns the value of the '<em><b>Body Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body Expression</em>' containment reference.
	 * @see #setBodyExpression(StringExpression)
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getComment_BodyExpression()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	StringExpression getBodyExpression();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.Comment#getBodyExpression <em>Body Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body Expression</em>' containment reference.
	 * @see #getBodyExpression()
	 * @generated
	 */
	void setBodyExpression(StringExpression value);

} // Comment

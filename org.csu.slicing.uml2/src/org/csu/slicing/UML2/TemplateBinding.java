/**
 */
package org.csu.slicing.UML2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2.TemplateBinding#getBoundElement <em>Bound Element</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.TemplateBinding#getSignature <em>Signature</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.TemplateBinding#getParameterSubstitution <em>Parameter Substitution</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2.UML2Package#getTemplateBinding()
 * @model
 * @generated
 */
public interface TemplateBinding extends DirectedRelationship {
	/**
	 * Returns the value of the '<em><b>Bound Element</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2.TemplateableElement#getTemplateBinding <em>Template Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bound Element</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bound Element</em>' container reference.
	 * @see #setBoundElement(TemplateableElement)
	 * @see org.csu.slicing.UML2.UML2Package#getTemplateBinding_BoundElement()
	 * @see org.csu.slicing.UML2.TemplateableElement#getTemplateBinding
	 * @model opposite="templateBinding" required="true" transient="false" ordered="false"
	 * @generated
	 */
	TemplateableElement getBoundElement();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2.TemplateBinding#getBoundElement <em>Bound Element</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bound Element</em>' container reference.
	 * @see #getBoundElement()
	 * @generated
	 */
	void setBoundElement(TemplateableElement value);

	/**
	 * Returns the value of the '<em><b>Signature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signature</em>' reference.
	 * @see #setSignature(TemplateSignature)
	 * @see org.csu.slicing.UML2.UML2Package#getTemplateBinding_Signature()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	TemplateSignature getSignature();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2.TemplateBinding#getSignature <em>Signature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signature</em>' reference.
	 * @see #getSignature()
	 * @generated
	 */
	void setSignature(TemplateSignature value);

	/**
	 * Returns the value of the '<em><b>Parameter Substitution</b></em>' containment reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2.TemplateParameterSubstitution}.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2.TemplateParameterSubstitution#getTemplateBinding <em>Template Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Substitution</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Substitution</em>' containment reference list.
	 * @see org.csu.slicing.UML2.UML2Package#getTemplateBinding_ParameterSubstitution()
	 * @see org.csu.slicing.UML2.TemplateParameterSubstitution#getTemplateBinding
	 * @model opposite="templateBinding" containment="true" ordered="false"
	 * @generated
	 */
	EList<TemplateParameterSubstitution> getParameterSubstitution();

} // TemplateBinding

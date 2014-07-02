/**
 */
package org.csu.slicing.UML2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Templateable Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2.TemplateableElement#getTemplateBinding <em>Template Binding</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.TemplateableElement#getOwnedTemplateSignature <em>Owned Template Signature</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2.UML2Package#getTemplateableElement()
 * @model abstract="true"
 * @generated
 */
public interface TemplateableElement extends Element {
	/**
	 * Returns the value of the '<em><b>Template Binding</b></em>' containment reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2.TemplateBinding}.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2.TemplateBinding#getBoundElement <em>Bound Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template Binding</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template Binding</em>' containment reference list.
	 * @see org.csu.slicing.UML2.UML2Package#getTemplateableElement_TemplateBinding()
	 * @see org.csu.slicing.UML2.TemplateBinding#getBoundElement
	 * @model opposite="boundElement" containment="true" ordered="false"
	 * @generated
	 */
	EList<TemplateBinding> getTemplateBinding();

	/**
	 * Returns the value of the '<em><b>Owned Template Signature</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2.TemplateSignature#getTemplate <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Template Signature</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Template Signature</em>' containment reference.
	 * @see #setOwnedTemplateSignature(TemplateSignature)
	 * @see org.csu.slicing.UML2.UML2Package#getTemplateableElement_OwnedTemplateSignature()
	 * @see org.csu.slicing.UML2.TemplateSignature#getTemplate
	 * @model opposite="template" containment="true" ordered="false"
	 * @generated
	 */
	TemplateSignature getOwnedTemplateSignature();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2.TemplateableElement#getOwnedTemplateSignature <em>Owned Template Signature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Template Signature</em>' containment reference.
	 * @see #getOwnedTemplateSignature()
	 * @generated
	 */
	void setOwnedTemplateSignature(TemplateSignature value);

} // TemplateableElement

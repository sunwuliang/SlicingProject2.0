/**
 */
package org.csu.slicing.UML2WithID;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template Signature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2WithID.TemplateSignature#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.TemplateSignature#getOwnedParameter <em>Owned Parameter</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.TemplateSignature#getNestedSignature <em>Nested Signature</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.TemplateSignature#getNestingSignature <em>Nesting Signature</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.TemplateSignature#getTemplate <em>Template</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getTemplateSignature()
 * @model
 * @generated
 */
public interface TemplateSignature extends Element {
	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2WithID.TemplateParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' reference list.
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getTemplateSignature_Parameter()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<TemplateParameter> getParameter();

	/**
	 * Returns the value of the '<em><b>Owned Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2WithID.TemplateParameter}.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2WithID.TemplateParameter#getSignature <em>Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Parameter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Parameter</em>' containment reference list.
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getTemplateSignature_OwnedParameter()
	 * @see org.csu.slicing.UML2WithID.TemplateParameter#getSignature
	 * @model opposite="signature" containment="true" ordered="false"
	 * @generated
	 */
	EList<TemplateParameter> getOwnedParameter();

	/**
	 * Returns the value of the '<em><b>Nested Signature</b></em>' reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2WithID.TemplateSignature}.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2WithID.TemplateSignature#getNestingSignature <em>Nesting Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nested Signature</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nested Signature</em>' reference list.
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getTemplateSignature_NestedSignature()
	 * @see org.csu.slicing.UML2WithID.TemplateSignature#getNestingSignature
	 * @model opposite="nestingSignature" ordered="false"
	 * @generated
	 */
	EList<TemplateSignature> getNestedSignature();

	/**
	 * Returns the value of the '<em><b>Nesting Signature</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2WithID.TemplateSignature#getNestedSignature <em>Nested Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nesting Signature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nesting Signature</em>' reference.
	 * @see #setNestingSignature(TemplateSignature)
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getTemplateSignature_NestingSignature()
	 * @see org.csu.slicing.UML2WithID.TemplateSignature#getNestedSignature
	 * @model opposite="nestedSignature" ordered="false"
	 * @generated
	 */
	TemplateSignature getNestingSignature();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.TemplateSignature#getNestingSignature <em>Nesting Signature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nesting Signature</em>' reference.
	 * @see #getNestingSignature()
	 * @generated
	 */
	void setNestingSignature(TemplateSignature value);

	/**
	 * Returns the value of the '<em><b>Template</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2WithID.TemplateableElement#getOwnedTemplateSignature <em>Owned Template Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template</em>' container reference.
	 * @see #setTemplate(TemplateableElement)
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getTemplateSignature_Template()
	 * @see org.csu.slicing.UML2WithID.TemplateableElement#getOwnedTemplateSignature
	 * @model opposite="ownedTemplateSignature" required="true" transient="false" ordered="false"
	 * @generated
	 */
	TemplateableElement getTemplate();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.TemplateSignature#getTemplate <em>Template</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template</em>' container reference.
	 * @see #getTemplate()
	 * @generated
	 */
	void setTemplate(TemplateableElement value);

} // TemplateSignature

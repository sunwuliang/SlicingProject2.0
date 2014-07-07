/**
 */
package org.csu.slicing.UML2WithID;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template Parameter Substitution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2WithID.TemplateParameterSubstitution#getFormal <em>Formal</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.TemplateParameterSubstitution#getTemplateBinding <em>Template Binding</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.TemplateParameterSubstitution#getActual <em>Actual</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.TemplateParameterSubstitution#getOwnedActual <em>Owned Actual</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getTemplateParameterSubstitution()
 * @model
 * @generated
 */
public interface TemplateParameterSubstitution extends Element {
	/**
	 * Returns the value of the '<em><b>Formal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Formal</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formal</em>' reference.
	 * @see #setFormal(TemplateParameter)
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getTemplateParameterSubstitution_Formal()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	TemplateParameter getFormal();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.TemplateParameterSubstitution#getFormal <em>Formal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Formal</em>' reference.
	 * @see #getFormal()
	 * @generated
	 */
	void setFormal(TemplateParameter value);

	/**
	 * Returns the value of the '<em><b>Template Binding</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2WithID.TemplateBinding#getParameterSubstitution <em>Parameter Substitution</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template Binding</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template Binding</em>' container reference.
	 * @see #setTemplateBinding(TemplateBinding)
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getTemplateParameterSubstitution_TemplateBinding()
	 * @see org.csu.slicing.UML2WithID.TemplateBinding#getParameterSubstitution
	 * @model opposite="parameterSubstitution" required="true" transient="false" ordered="false"
	 * @generated
	 */
	TemplateBinding getTemplateBinding();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.TemplateParameterSubstitution#getTemplateBinding <em>Template Binding</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template Binding</em>' container reference.
	 * @see #getTemplateBinding()
	 * @generated
	 */
	void setTemplateBinding(TemplateBinding value);

	/**
	 * Returns the value of the '<em><b>Actual</b></em>' reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2WithID.ParameterableElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actual</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual</em>' reference list.
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getTemplateParameterSubstitution_Actual()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<ParameterableElement> getActual();

	/**
	 * Returns the value of the '<em><b>Owned Actual</b></em>' containment reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2WithID.ParameterableElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Actual</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Actual</em>' containment reference list.
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getTemplateParameterSubstitution_OwnedActual()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<ParameterableElement> getOwnedActual();

} // TemplateParameterSubstitution

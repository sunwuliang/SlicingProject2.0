/**
 */
package org.csu.slicing.UML2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameterable Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2.ParameterableElement#getTemplateParameter <em>Template Parameter</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.ParameterableElement#getOwningParameter <em>Owning Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2.UML2Package#getParameterableElement()
 * @model abstract="true"
 * @generated
 */
public interface ParameterableElement extends Element {
	/**
	 * Returns the value of the '<em><b>Template Parameter</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2.TemplateParameter#getParameteredElement <em>Parametered Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template Parameter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template Parameter</em>' reference.
	 * @see #setTemplateParameter(TemplateParameter)
	 * @see org.csu.slicing.UML2.UML2Package#getParameterableElement_TemplateParameter()
	 * @see org.csu.slicing.UML2.TemplateParameter#getParameteredElement
	 * @model opposite="parameteredElement" ordered="false"
	 * @generated
	 */
	TemplateParameter getTemplateParameter();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2.ParameterableElement#getTemplateParameter <em>Template Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template Parameter</em>' reference.
	 * @see #getTemplateParameter()
	 * @generated
	 */
	void setTemplateParameter(TemplateParameter value);

	/**
	 * Returns the value of the '<em><b>Owning Parameter</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2.TemplateParameter#getOwnedParameteredElement <em>Owned Parametered Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Parameter</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Parameter</em>' container reference.
	 * @see #setOwningParameter(TemplateParameter)
	 * @see org.csu.slicing.UML2.UML2Package#getParameterableElement_OwningParameter()
	 * @see org.csu.slicing.UML2.TemplateParameter#getOwnedParameteredElement
	 * @model opposite="ownedParameteredElement" transient="false" ordered="false"
	 * @generated
	 */
	TemplateParameter getOwningParameter();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2.ParameterableElement#getOwningParameter <em>Owning Parameter</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Parameter</em>' container reference.
	 * @see #getOwningParameter()
	 * @generated
	 */
	void setOwningParameter(TemplateParameter value);

} // ParameterableElement

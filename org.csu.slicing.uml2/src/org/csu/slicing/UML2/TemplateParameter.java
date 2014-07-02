/**
 */
package org.csu.slicing.UML2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2.TemplateParameter#getSignature <em>Signature</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.TemplateParameter#getParameteredElement <em>Parametered Element</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.TemplateParameter#getOwnedParameteredElement <em>Owned Parametered Element</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.TemplateParameter#getDefault <em>Default</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.TemplateParameter#getOwnedDefault <em>Owned Default</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2.UML2Package#getTemplateParameter()
 * @model
 * @generated
 */
public interface TemplateParameter extends Element {
	/**
	 * Returns the value of the '<em><b>Signature</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2.TemplateSignature#getOwnedParameter <em>Owned Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signature</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signature</em>' container reference.
	 * @see #setSignature(TemplateSignature)
	 * @see org.csu.slicing.UML2.UML2Package#getTemplateParameter_Signature()
	 * @see org.csu.slicing.UML2.TemplateSignature#getOwnedParameter
	 * @model opposite="ownedParameter" required="true" transient="false" ordered="false"
	 * @generated
	 */
	TemplateSignature getSignature();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2.TemplateParameter#getSignature <em>Signature</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signature</em>' container reference.
	 * @see #getSignature()
	 * @generated
	 */
	void setSignature(TemplateSignature value);

	/**
	 * Returns the value of the '<em><b>Parametered Element</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2.ParameterableElement#getTemplateParameter <em>Template Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parametered Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parametered Element</em>' reference.
	 * @see #setParameteredElement(ParameterableElement)
	 * @see org.csu.slicing.UML2.UML2Package#getTemplateParameter_ParameteredElement()
	 * @see org.csu.slicing.UML2.ParameterableElement#getTemplateParameter
	 * @model opposite="templateParameter" required="true" ordered="false"
	 * @generated
	 */
	ParameterableElement getParameteredElement();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2.TemplateParameter#getParameteredElement <em>Parametered Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parametered Element</em>' reference.
	 * @see #getParameteredElement()
	 * @generated
	 */
	void setParameteredElement(ParameterableElement value);

	/**
	 * Returns the value of the '<em><b>Owned Parametered Element</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2.ParameterableElement#getOwningParameter <em>Owning Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Parametered Element</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Parametered Element</em>' containment reference.
	 * @see #setOwnedParameteredElement(ParameterableElement)
	 * @see org.csu.slicing.UML2.UML2Package#getTemplateParameter_OwnedParameteredElement()
	 * @see org.csu.slicing.UML2.ParameterableElement#getOwningParameter
	 * @model opposite="owningParameter" containment="true" ordered="false"
	 * @generated
	 */
	ParameterableElement getOwnedParameteredElement();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2.TemplateParameter#getOwnedParameteredElement <em>Owned Parametered Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Parametered Element</em>' containment reference.
	 * @see #getOwnedParameteredElement()
	 * @generated
	 */
	void setOwnedParameteredElement(ParameterableElement value);

	/**
	 * Returns the value of the '<em><b>Default</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default</em>' reference.
	 * @see #setDefault(ParameterableElement)
	 * @see org.csu.slicing.UML2.UML2Package#getTemplateParameter_Default()
	 * @model ordered="false"
	 * @generated
	 */
	ParameterableElement getDefault();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2.TemplateParameter#getDefault <em>Default</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default</em>' reference.
	 * @see #getDefault()
	 * @generated
	 */
	void setDefault(ParameterableElement value);

	/**
	 * Returns the value of the '<em><b>Owned Default</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Default</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Default</em>' containment reference.
	 * @see #setOwnedDefault(ParameterableElement)
	 * @see org.csu.slicing.UML2.UML2Package#getTemplateParameter_OwnedDefault()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	ParameterableElement getOwnedDefault();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2.TemplateParameter#getOwnedDefault <em>Owned Default</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Default</em>' containment reference.
	 * @see #getOwnedDefault()
	 * @generated
	 */
	void setOwnedDefault(ParameterableElement value);

} // TemplateParameter

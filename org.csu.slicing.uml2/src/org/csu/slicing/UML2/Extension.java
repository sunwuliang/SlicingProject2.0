/**
 */
package org.csu.slicing.UML2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extension</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2.Extension#isIsRequired <em>Is Required</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.Extension#getMetaclass <em>Metaclass</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2.UML2Package#getExtension()
 * @model
 * @generated
 */
public interface Extension extends Association {
	/**
	 * Returns the value of the '<em><b>Is Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Required</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Required</em>' attribute.
	 * @see #setIsRequired(boolean)
	 * @see org.csu.slicing.UML2.UML2Package#getExtension_IsRequired()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	boolean isIsRequired();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2.Extension#isIsRequired <em>Is Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Required</em>' attribute.
	 * @see #isIsRequired()
	 * @generated
	 */
	void setIsRequired(boolean value);

	/**
	 * Returns the value of the '<em><b>Metaclass</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2.Class#getExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metaclass</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metaclass</em>' reference.
	 * @see #setMetaclass(org.csu.slicing.UML2.Class)
	 * @see org.csu.slicing.UML2.UML2Package#getExtension_Metaclass()
	 * @see org.csu.slicing.UML2.Class#getExtension
	 * @model opposite="extension" required="true" ordered="false"
	 * @generated
	 */
	org.csu.slicing.UML2.Class getMetaclass();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2.Extension#getMetaclass <em>Metaclass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metaclass</em>' reference.
	 * @see #getMetaclass()
	 * @generated
	 */
	void setMetaclass(org.csu.slicing.UML2.Class value);

} // Extension

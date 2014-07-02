/**
 */
package org.csu.slicing.UML2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2.ObjectFlow#isIsMulticast <em>Is Multicast</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.ObjectFlow#isIsMultireceive <em>Is Multireceive</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.ObjectFlow#getTransformation <em>Transformation</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.ObjectFlow#getSelection <em>Selection</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2.UML2Package#getObjectFlow()
 * @model
 * @generated
 */
public interface ObjectFlow extends ActivityEdge {
	/**
	 * Returns the value of the '<em><b>Is Multicast</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Multicast</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Multicast</em>' attribute.
	 * @see #setIsMulticast(boolean)
	 * @see org.csu.slicing.UML2.UML2Package#getObjectFlow_IsMulticast()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	boolean isIsMulticast();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2.ObjectFlow#isIsMulticast <em>Is Multicast</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Multicast</em>' attribute.
	 * @see #isIsMulticast()
	 * @generated
	 */
	void setIsMulticast(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Multireceive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Multireceive</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Multireceive</em>' attribute.
	 * @see #setIsMultireceive(boolean)
	 * @see org.csu.slicing.UML2.UML2Package#getObjectFlow_IsMultireceive()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	boolean isIsMultireceive();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2.ObjectFlow#isIsMultireceive <em>Is Multireceive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Multireceive</em>' attribute.
	 * @see #isIsMultireceive()
	 * @generated
	 */
	void setIsMultireceive(boolean value);

	/**
	 * Returns the value of the '<em><b>Transformation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformation</em>' reference.
	 * @see #setTransformation(Behavior)
	 * @see org.csu.slicing.UML2.UML2Package#getObjectFlow_Transformation()
	 * @model ordered="false"
	 * @generated
	 */
	Behavior getTransformation();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2.ObjectFlow#getTransformation <em>Transformation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformation</em>' reference.
	 * @see #getTransformation()
	 * @generated
	 */
	void setTransformation(Behavior value);

	/**
	 * Returns the value of the '<em><b>Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selection</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selection</em>' reference.
	 * @see #setSelection(Behavior)
	 * @see org.csu.slicing.UML2.UML2Package#getObjectFlow_Selection()
	 * @model ordered="false"
	 * @generated
	 */
	Behavior getSelection();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2.ObjectFlow#getSelection <em>Selection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selection</em>' reference.
	 * @see #getSelection()
	 * @generated
	 */
	void setSelection(Behavior value);

} // ObjectFlow

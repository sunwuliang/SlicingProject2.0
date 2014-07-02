/**
 */
package org.csu.slicing.UML2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multiplicity Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2.MultiplicityElement#isIsOrdered <em>Is Ordered</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.MultiplicityElement#isIsUnique <em>Is Unique</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.MultiplicityElement#getLower <em>Lower</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.MultiplicityElement#getUpper <em>Upper</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.MultiplicityElement#getUpperValue <em>Upper Value</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.MultiplicityElement#getLowerValue <em>Lower Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2.UML2Package#getMultiplicityElement()
 * @model abstract="true"
 * @generated
 */
public interface MultiplicityElement extends Element {
	/**
	 * Returns the value of the '<em><b>Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Ordered</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Ordered</em>' attribute.
	 * @see #setIsOrdered(boolean)
	 * @see org.csu.slicing.UML2.UML2Package#getMultiplicityElement_IsOrdered()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	boolean isIsOrdered();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2.MultiplicityElement#isIsOrdered <em>Is Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Ordered</em>' attribute.
	 * @see #isIsOrdered()
	 * @generated
	 */
	void setIsOrdered(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Unique</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Unique</em>' attribute.
	 * @see #setIsUnique(boolean)
	 * @see org.csu.slicing.UML2.UML2Package#getMultiplicityElement_IsUnique()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	boolean isIsUnique();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2.MultiplicityElement#isIsUnique <em>Is Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Unique</em>' attribute.
	 * @see #isIsUnique()
	 * @generated
	 */
	void setIsUnique(boolean value);

	/**
	 * Returns the value of the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower</em>' attribute.
	 * @see #setLower(int)
	 * @see org.csu.slicing.UML2.UML2Package#getMultiplicityElement_Lower()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	int getLower();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2.MultiplicityElement#getLower <em>Lower</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower</em>' attribute.
	 * @see #getLower()
	 * @generated
	 */
	void setLower(int value);

	/**
	 * Returns the value of the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper</em>' attribute.
	 * @see #setUpper(String)
	 * @see org.csu.slicing.UML2.UML2Package#getMultiplicityElement_Upper()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getUpper();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2.MultiplicityElement#getUpper <em>Upper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper</em>' attribute.
	 * @see #getUpper()
	 * @generated
	 */
	void setUpper(String value);

	/**
	 * Returns the value of the '<em><b>Upper Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Value</em>' containment reference.
	 * @see #setUpperValue(ValueSpecification)
	 * @see org.csu.slicing.UML2.UML2Package#getMultiplicityElement_UpperValue()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	ValueSpecification getUpperValue();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2.MultiplicityElement#getUpperValue <em>Upper Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Value</em>' containment reference.
	 * @see #getUpperValue()
	 * @generated
	 */
	void setUpperValue(ValueSpecification value);

	/**
	 * Returns the value of the '<em><b>Lower Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Value</em>' containment reference.
	 * @see #setLowerValue(ValueSpecification)
	 * @see org.csu.slicing.UML2.UML2Package#getMultiplicityElement_LowerValue()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	ValueSpecification getLowerValue();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2.MultiplicityElement#getLowerValue <em>Lower Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Value</em>' containment reference.
	 * @see #getLowerValue()
	 * @generated
	 */
	void setLowerValue(ValueSpecification value);

} // MultiplicityElement

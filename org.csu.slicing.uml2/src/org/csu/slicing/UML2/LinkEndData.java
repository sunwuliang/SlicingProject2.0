/**
 */
package org.csu.slicing.UML2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link End Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2.LinkEndData#getValue <em>Value</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.LinkEndData#getEnd <em>End</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.LinkEndData#getQualifier <em>Qualifier</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2.UML2Package#getLinkEndData()
 * @model
 * @generated
 */
public interface LinkEndData extends Element {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' reference.
	 * @see #setValue(InputPin)
	 * @see org.csu.slicing.UML2.UML2Package#getLinkEndData_Value()
	 * @model ordered="false"
	 * @generated
	 */
	InputPin getValue();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2.LinkEndData#getValue <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(InputPin value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' reference.
	 * @see #setEnd(Property)
	 * @see org.csu.slicing.UML2.UML2Package#getLinkEndData_End()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Property getEnd();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2.LinkEndData#getEnd <em>End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' reference.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(Property value);

	/**
	 * Returns the value of the '<em><b>Qualifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2.QualifierValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualifier</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualifier</em>' containment reference list.
	 * @see org.csu.slicing.UML2.UML2Package#getLinkEndData_Qualifier()
	 * @model containment="true"
	 * @generated
	 */
	EList<QualifierValue> getQualifier();

} // LinkEndData

/**
 */
package org.csu.slicing.UML2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2.TimeTrigger#isIsRelative <em>Is Relative</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.TimeTrigger#getWhen <em>When</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2.UML2Package#getTimeTrigger()
 * @model
 * @generated
 */
public interface TimeTrigger extends Trigger {
	/**
	 * Returns the value of the '<em><b>Is Relative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Relative</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Relative</em>' attribute.
	 * @see #setIsRelative(boolean)
	 * @see org.csu.slicing.UML2.UML2Package#getTimeTrigger_IsRelative()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	boolean isIsRelative();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2.TimeTrigger#isIsRelative <em>Is Relative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Relative</em>' attribute.
	 * @see #isIsRelative()
	 * @generated
	 */
	void setIsRelative(boolean value);

	/**
	 * Returns the value of the '<em><b>When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>When</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>When</em>' containment reference.
	 * @see #setWhen(ValueSpecification)
	 * @see org.csu.slicing.UML2.UML2Package#getTimeTrigger_When()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	ValueSpecification getWhen();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2.TimeTrigger#getWhen <em>When</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>When</em>' containment reference.
	 * @see #getWhen()
	 * @generated
	 */
	void setWhen(ValueSpecification value);

} // TimeTrigger

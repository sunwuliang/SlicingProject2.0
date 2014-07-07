/**
 */
package org.csu.slicing.UML2WithID;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2WithID.TimeExpression#isFirstTime <em>First Time</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.TimeExpression#getEvent <em>Event</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getTimeExpression()
 * @model
 * @generated
 */
public interface TimeExpression extends ValueSpecification {
	/**
	 * Returns the value of the '<em><b>First Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Time</em>' attribute.
	 * @see #setFirstTime(boolean)
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getTimeExpression_FirstTime()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	boolean isFirstTime();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.TimeExpression#isFirstTime <em>First Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Time</em>' attribute.
	 * @see #isFirstTime()
	 * @generated
	 */
	void setFirstTime(boolean value);

	/**
	 * Returns the value of the '<em><b>Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' reference.
	 * @see #setEvent(NamedElement)
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getTimeExpression_Event()
	 * @model ordered="false"
	 * @generated
	 */
	NamedElement getEvent();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.TimeExpression#getEvent <em>Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' reference.
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(NamedElement value);

} // TimeExpression

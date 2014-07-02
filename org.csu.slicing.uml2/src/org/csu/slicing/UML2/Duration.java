/**
 */
package org.csu.slicing.UML2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Duration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2.Duration#isFirstTime <em>First Time</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.Duration#getEvent <em>Event</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2.UML2Package#getDuration()
 * @model
 * @generated
 */
public interface Duration extends ValueSpecification {
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
	 * @see org.csu.slicing.UML2.UML2Package#getDuration_FirstTime()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	boolean isFirstTime();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2.Duration#isFirstTime <em>First Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Time</em>' attribute.
	 * @see #isFirstTime()
	 * @generated
	 */
	void setFirstTime(boolean value);

	/**
	 * Returns the value of the '<em><b>Event</b></em>' reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2.NamedElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' reference list.
	 * @see org.csu.slicing.UML2.UML2Package#getDuration_Event()
	 * @model upper="2" ordered="false"
	 * @generated
	 */
	EList<NamedElement> getEvent();

} // Duration

/**
 */
package org.csu.slicing.CoachBusWithEDataType;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Security Guard</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.CoachBusWithEDataType.SecurityGuard#getShift <em>Shift</em>}</li>
 *   <li>{@link org.csu.slicing.CoachBusWithEDataType.SecurityGuard#getCoach <em>Coach</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.CoachBusWithEDataType.CoachBusWithEDataTypePackage#getSecurityGuard()
 * @model
 * @generated
 */
public interface SecurityGuard extends Employee {
	/**
	 * Returns the value of the '<em><b>Shift</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shift</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shift</em>' attribute.
	 * @see #setShift(String)
	 * @see org.csu.slicing.CoachBusWithEDataType.CoachBusWithEDataTypePackage#getSecurityGuard_Shift()
	 * @model
	 * @generated
	 */
	String getShift();

	/**
	 * Sets the value of the '{@link org.csu.slicing.CoachBusWithEDataType.SecurityGuard#getShift <em>Shift</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shift</em>' attribute.
	 * @see #getShift()
	 * @generated
	 */
	void setShift(String value);

	/**
	 * Returns the value of the '<em><b>Coach</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.CoachBusWithEDataType.Coach#getGuards <em>Guards</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coach</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coach</em>' reference.
	 * @see #setCoach(Coach)
	 * @see org.csu.slicing.CoachBusWithEDataType.CoachBusWithEDataTypePackage#getSecurityGuard_Coach()
	 * @see org.csu.slicing.CoachBusWithEDataType.Coach#getGuards
	 * @model opposite="guards" required="true"
	 * @generated
	 */
	Coach getCoach();

	/**
	 * Sets the value of the '{@link org.csu.slicing.CoachBusWithEDataType.SecurityGuard#getCoach <em>Coach</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coach</em>' reference.
	 * @see #getCoach()
	 * @generated
	 */
	void setCoach(Coach value);

} // SecurityGuard

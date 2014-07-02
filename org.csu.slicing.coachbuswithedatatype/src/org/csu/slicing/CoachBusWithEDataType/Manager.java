/**
 */
package org.csu.slicing.CoachBusWithEDataType;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.CoachBusWithEDataType.Manager#isHasMBA <em>Has MBA</em>}</li>
 *   <li>{@link org.csu.slicing.CoachBusWithEDataType.Manager#getOffice <em>Office</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.CoachBusWithEDataType.CoachBusWithEDataTypePackage#getManager()
 * @model
 * @generated
 */
public interface Manager extends Employee {
	/**
	 * Returns the value of the '<em><b>Has MBA</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has MBA</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has MBA</em>' attribute.
	 * @see #setHasMBA(boolean)
	 * @see org.csu.slicing.CoachBusWithEDataType.CoachBusWithEDataTypePackage#getManager_HasMBA()
	 * @model
	 * @generated
	 */
	boolean isHasMBA();

	/**
	 * Sets the value of the '{@link org.csu.slicing.CoachBusWithEDataType.Manager#isHasMBA <em>Has MBA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has MBA</em>' attribute.
	 * @see #isHasMBA()
	 * @generated
	 */
	void setHasMBA(boolean value);

	/**
	 * Returns the value of the '<em><b>Office</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.CoachBusWithEDataType.BookingOffice#getManager <em>Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Office</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Office</em>' reference.
	 * @see #setOffice(BookingOffice)
	 * @see org.csu.slicing.CoachBusWithEDataType.CoachBusWithEDataTypePackage#getManager_Office()
	 * @see org.csu.slicing.CoachBusWithEDataType.BookingOffice#getManager
	 * @model opposite="manager"
	 * @generated
	 */
	BookingOffice getOffice();

	/**
	 * Sets the value of the '{@link org.csu.slicing.CoachBusWithEDataType.Manager#getOffice <em>Office</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Office</em>' reference.
	 * @see #getOffice()
	 * @generated
	 */
	void setOffice(BookingOffice value);

} // Manager

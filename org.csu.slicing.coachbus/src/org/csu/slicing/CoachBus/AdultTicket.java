/**
 */
package org.csu.slicing.CoachBus;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Adult Ticket</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.CoachBus.AdultTicket#isIsElderlyDiscount <em>Is Elderly Discount</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.CoachBus.CoachBusPackage#getAdultTicket()
 * @model
 * @generated
 */
public interface AdultTicket extends Ticket {
	/**
	 * Returns the value of the '<em><b>Is Elderly Discount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Elderly Discount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Elderly Discount</em>' attribute.
	 * @see #setIsElderlyDiscount(boolean)
	 * @see org.csu.slicing.CoachBus.CoachBusPackage#getAdultTicket_IsElderlyDiscount()
	 * @model
	 * @generated
	 */
	boolean isIsElderlyDiscount();

	/**
	 * Sets the value of the '{@link org.csu.slicing.CoachBus.AdultTicket#isIsElderlyDiscount <em>Is Elderly Discount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Elderly Discount</em>' attribute.
	 * @see #isIsElderlyDiscount()
	 * @generated
	 */
	void setIsElderlyDiscount(boolean value);

} // AdultTicket

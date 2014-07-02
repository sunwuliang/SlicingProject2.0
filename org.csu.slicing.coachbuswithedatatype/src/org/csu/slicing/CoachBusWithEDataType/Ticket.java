/**
 */
package org.csu.slicing.CoachBusWithEDataType;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ticket</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.CoachBusWithEDataType.Ticket#getNumber <em>Number</em>}</li>
 *   <li>{@link org.csu.slicing.CoachBusWithEDataType.Ticket#getPrice <em>Price</em>}</li>
 *   <li>{@link org.csu.slicing.CoachBusWithEDataType.Ticket#isIsRoundTrip <em>Is Round Trip</em>}</li>
 *   <li>{@link org.csu.slicing.CoachBusWithEDataType.Ticket#getPsg <em>Psg</em>}</li>
 *   <li>{@link org.csu.slicing.CoachBusWithEDataType.Ticket#getVm <em>Vm</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.CoachBusWithEDataType.CoachBusWithEDataTypePackage#getTicket()
 * @model
 * @generated
 */
public interface Ticket extends EObject {
	/**
	 * Returns the value of the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see #setNumber(int)
	 * @see org.csu.slicing.CoachBusWithEDataType.CoachBusWithEDataTypePackage#getTicket_Number()
	 * @model
	 * @generated
	 */
	int getNumber();

	/**
	 * Sets the value of the '{@link org.csu.slicing.CoachBusWithEDataType.Ticket#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(int value);

	/**
	 * Returns the value of the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Price</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Price</em>' attribute.
	 * @see #setPrice(double)
	 * @see org.csu.slicing.CoachBusWithEDataType.CoachBusWithEDataTypePackage#getTicket_Price()
	 * @model
	 * @generated
	 */
	double getPrice();

	/**
	 * Sets the value of the '{@link org.csu.slicing.CoachBusWithEDataType.Ticket#getPrice <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price</em>' attribute.
	 * @see #getPrice()
	 * @generated
	 */
	void setPrice(double value);

	/**
	 * Returns the value of the '<em><b>Is Round Trip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Round Trip</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Round Trip</em>' attribute.
	 * @see #setIsRoundTrip(boolean)
	 * @see org.csu.slicing.CoachBusWithEDataType.CoachBusWithEDataTypePackage#getTicket_IsRoundTrip()
	 * @model
	 * @generated
	 */
	boolean isIsRoundTrip();

	/**
	 * Sets the value of the '{@link org.csu.slicing.CoachBusWithEDataType.Ticket#isIsRoundTrip <em>Is Round Trip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Round Trip</em>' attribute.
	 * @see #isIsRoundTrip()
	 * @generated
	 */
	void setIsRoundTrip(boolean value);

	/**
	 * Returns the value of the '<em><b>Psg</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.CoachBusWithEDataType.Passenger#getTickets <em>Tickets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Psg</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Psg</em>' reference.
	 * @see #setPsg(Passenger)
	 * @see org.csu.slicing.CoachBusWithEDataType.CoachBusWithEDataTypePackage#getTicket_Psg()
	 * @see org.csu.slicing.CoachBusWithEDataType.Passenger#getTickets
	 * @model opposite="tickets" required="true"
	 * @generated
	 */
	Passenger getPsg();

	/**
	 * Sets the value of the '{@link org.csu.slicing.CoachBusWithEDataType.Ticket#getPsg <em>Psg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Psg</em>' reference.
	 * @see #getPsg()
	 * @generated
	 */
	void setPsg(Passenger value);

	/**
	 * Returns the value of the '<em><b>Vm</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.CoachBusWithEDataType.VendingMachine#getTickets <em>Tickets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vm</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vm</em>' reference.
	 * @see #setVm(VendingMachine)
	 * @see org.csu.slicing.CoachBusWithEDataType.CoachBusWithEDataTypePackage#getTicket_Vm()
	 * @see org.csu.slicing.CoachBusWithEDataType.VendingMachine#getTickets
	 * @model opposite="tickets" required="true"
	 * @generated
	 */
	VendingMachine getVm();

	/**
	 * Sets the value of the '{@link org.csu.slicing.CoachBusWithEDataType.Ticket#getVm <em>Vm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vm</em>' reference.
	 * @see #getVm()
	 * @generated
	 */
	void setVm(VendingMachine value);

} // Ticket

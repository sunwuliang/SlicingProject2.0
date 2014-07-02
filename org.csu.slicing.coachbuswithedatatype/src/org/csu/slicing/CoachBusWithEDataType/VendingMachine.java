/**
 */
package org.csu.slicing.CoachBusWithEDataType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vending Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.CoachBusWithEDataType.VendingMachine#getNumber <em>Number</em>}</li>
 *   <li>{@link org.csu.slicing.CoachBusWithEDataType.VendingMachine#getTickets <em>Tickets</em>}</li>
 *   <li>{@link org.csu.slicing.CoachBusWithEDataType.VendingMachine#getOffice <em>Office</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.CoachBusWithEDataType.CoachBusWithEDataTypePackage#getVendingMachine()
 * @model
 * @generated
 */
public interface VendingMachine extends EObject {
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
	 * @see org.csu.slicing.CoachBusWithEDataType.CoachBusWithEDataTypePackage#getVendingMachine_Number()
	 * @model
	 * @generated
	 */
	int getNumber();

	/**
	 * Sets the value of the '{@link org.csu.slicing.CoachBusWithEDataType.VendingMachine#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(int value);

	/**
	 * Returns the value of the '<em><b>Tickets</b></em>' reference list.
	 * The list contents are of type {@link org.csu.slicing.CoachBusWithEDataType.Ticket}.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.CoachBusWithEDataType.Ticket#getVm <em>Vm</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tickets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tickets</em>' reference list.
	 * @see org.csu.slicing.CoachBusWithEDataType.CoachBusWithEDataTypePackage#getVendingMachine_Tickets()
	 * @see org.csu.slicing.CoachBusWithEDataType.Ticket#getVm
	 * @model opposite="vm"
	 * @generated
	 */
	EList<Ticket> getTickets();

	/**
	 * Returns the value of the '<em><b>Office</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.CoachBusWithEDataType.BookingOffice#getVms <em>Vms</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Office</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Office</em>' reference.
	 * @see #setOffice(BookingOffice)
	 * @see org.csu.slicing.CoachBusWithEDataType.CoachBusWithEDataTypePackage#getVendingMachine_Office()
	 * @see org.csu.slicing.CoachBusWithEDataType.BookingOffice#getVms
	 * @model opposite="vms" required="true"
	 * @generated
	 */
	BookingOffice getOffice();

	/**
	 * Sets the value of the '{@link org.csu.slicing.CoachBusWithEDataType.VendingMachine#getOffice <em>Office</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Office</em>' reference.
	 * @see #getOffice()
	 * @generated
	 */
	void setOffice(BookingOffice value);

} // VendingMachine

/**
 */
package org.csu.slicing.CoachBus;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Booking Office</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.CoachBus.BookingOffice#getName <em>Name</em>}</li>
 *   <li>{@link org.csu.slicing.CoachBus.BookingOffice#getLocation <em>Location</em>}</li>
 *   <li>{@link org.csu.slicing.CoachBus.BookingOffice#getOfficeID <em>Office ID</em>}</li>
 *   <li>{@link org.csu.slicing.CoachBus.BookingOffice#getCoaches <em>Coaches</em>}</li>
 *   <li>{@link org.csu.slicing.CoachBus.BookingOffice#getManager <em>Manager</em>}</li>
 *   <li>{@link org.csu.slicing.CoachBus.BookingOffice#getVms <em>Vms</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.CoachBus.CoachBusPackage#getBookingOffice()
 * @model
 * @generated
 */
public interface BookingOffice extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.csu.slicing.CoachBus.CoachBusPackage#getBookingOffice_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.csu.slicing.CoachBus.BookingOffice#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(String)
	 * @see org.csu.slicing.CoachBus.CoachBusPackage#getBookingOffice_Location()
	 * @model
	 * @generated
	 */
	String getLocation();

	/**
	 * Sets the value of the '{@link org.csu.slicing.CoachBus.BookingOffice#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(String value);

	/**
	 * Returns the value of the '<em><b>Office ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Office ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Office ID</em>' attribute.
	 * @see #setOfficeID(int)
	 * @see org.csu.slicing.CoachBus.CoachBusPackage#getBookingOffice_OfficeID()
	 * @model
	 * @generated
	 */
	int getOfficeID();

	/**
	 * Sets the value of the '{@link org.csu.slicing.CoachBus.BookingOffice#getOfficeID <em>Office ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Office ID</em>' attribute.
	 * @see #getOfficeID()
	 * @generated
	 */
	void setOfficeID(int value);

	/**
	 * Returns the value of the '<em><b>Coaches</b></em>' reference list.
	 * The list contents are of type {@link org.csu.slicing.CoachBus.Coach}.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.CoachBus.Coach#getOffices <em>Offices</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coaches</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coaches</em>' reference list.
	 * @see org.csu.slicing.CoachBus.CoachBusPackage#getBookingOffice_Coaches()
	 * @see org.csu.slicing.CoachBus.Coach#getOffices
	 * @model opposite="offices" required="true"
	 * @generated
	 */
	EList<Coach> getCoaches();

	/**
	 * Returns the value of the '<em><b>Manager</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.CoachBus.Manager#getOffice <em>Office</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manager</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manager</em>' reference.
	 * @see #setManager(Manager)
	 * @see org.csu.slicing.CoachBus.CoachBusPackage#getBookingOffice_Manager()
	 * @see org.csu.slicing.CoachBus.Manager#getOffice
	 * @model opposite="office"
	 * @generated
	 */
	Manager getManager();

	/**
	 * Sets the value of the '{@link org.csu.slicing.CoachBus.BookingOffice#getManager <em>Manager</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manager</em>' reference.
	 * @see #getManager()
	 * @generated
	 */
	void setManager(Manager value);

	/**
	 * Returns the value of the '<em><b>Vms</b></em>' reference list.
	 * The list contents are of type {@link org.csu.slicing.CoachBus.VendingMachine}.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.CoachBus.VendingMachine#getOffice <em>Office</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vms</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vms</em>' reference list.
	 * @see org.csu.slicing.CoachBus.CoachBusPackage#getBookingOffice_Vms()
	 * @see org.csu.slicing.CoachBus.VendingMachine#getOffice
	 * @model opposite="office"
	 * @generated
	 */
	EList<VendingMachine> getVms();

} // BookingOffice

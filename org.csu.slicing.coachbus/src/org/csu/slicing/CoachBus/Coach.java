/**
 */
package org.csu.slicing.CoachBus;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coach</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.CoachBus.Coach#getId <em>Id</em>}</li>
 *   <li>{@link org.csu.slicing.CoachBus.Coach#getName <em>Name</em>}</li>
 *   <li>{@link org.csu.slicing.CoachBus.Coach#getModel <em>Model</em>}</li>
 *   <li>{@link org.csu.slicing.CoachBus.Coach#getNoOfSeats <em>No Of Seats</em>}</li>
 *   <li>{@link org.csu.slicing.CoachBus.Coach#getTrips <em>Trips</em>}</li>
 *   <li>{@link org.csu.slicing.CoachBus.Coach#getGuards <em>Guards</em>}</li>
 *   <li>{@link org.csu.slicing.CoachBus.Coach#getOffices <em>Offices</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.CoachBus.CoachBusPackage#getCoach()
 * @model
 * @generated
 */
public interface Coach extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see org.csu.slicing.CoachBus.CoachBusPackage#getCoach_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link org.csu.slicing.CoachBus.Coach#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

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
	 * @see org.csu.slicing.CoachBus.CoachBusPackage#getCoach_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.csu.slicing.CoachBus.Coach#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' attribute.
	 * @see #setModel(String)
	 * @see org.csu.slicing.CoachBus.CoachBusPackage#getCoach_Model()
	 * @model
	 * @generated
	 */
	String getModel();

	/**
	 * Sets the value of the '{@link org.csu.slicing.CoachBus.Coach#getModel <em>Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' attribute.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(String value);

	/**
	 * Returns the value of the '<em><b>No Of Seats</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>No Of Seats</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>No Of Seats</em>' attribute.
	 * @see #setNoOfSeats(int)
	 * @see org.csu.slicing.CoachBus.CoachBusPackage#getCoach_NoOfSeats()
	 * @model
	 * @generated
	 */
	int getNoOfSeats();

	/**
	 * Sets the value of the '{@link org.csu.slicing.CoachBus.Coach#getNoOfSeats <em>No Of Seats</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No Of Seats</em>' attribute.
	 * @see #getNoOfSeats()
	 * @generated
	 */
	void setNoOfSeats(int value);

	/**
	 * Returns the value of the '<em><b>Trips</b></em>' reference list.
	 * The list contents are of type {@link org.csu.slicing.CoachBus.Trip}.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.CoachBus.Trip#getCoaches <em>Coaches</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trips</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trips</em>' reference list.
	 * @see org.csu.slicing.CoachBus.CoachBusPackage#getCoach_Trips()
	 * @see org.csu.slicing.CoachBus.Trip#getCoaches
	 * @model opposite="coaches" required="true"
	 * @generated
	 */
	EList<Trip> getTrips();

	/**
	 * Returns the value of the '<em><b>Guards</b></em>' reference list.
	 * The list contents are of type {@link org.csu.slicing.CoachBus.SecurityGuard}.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.CoachBus.SecurityGuard#getCoach <em>Coach</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guards</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guards</em>' reference list.
	 * @see org.csu.slicing.CoachBus.CoachBusPackage#getCoach_Guards()
	 * @see org.csu.slicing.CoachBus.SecurityGuard#getCoach
	 * @model opposite="coach"
	 * @generated
	 */
	EList<SecurityGuard> getGuards();

	/**
	 * Returns the value of the '<em><b>Offices</b></em>' reference list.
	 * The list contents are of type {@link org.csu.slicing.CoachBus.BookingOffice}.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.CoachBus.BookingOffice#getCoaches <em>Coaches</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offices</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offices</em>' reference list.
	 * @see org.csu.slicing.CoachBus.CoachBusPackage#getCoach_Offices()
	 * @see org.csu.slicing.CoachBus.BookingOffice#getCoaches
	 * @model opposite="coaches"
	 * @generated
	 */
	EList<BookingOffice> getOffices();

} // Coach

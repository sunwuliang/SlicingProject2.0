/**
 */
package org.csu.slicing.CoachBus;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Passenger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.CoachBus.Passenger#getName <em>Name</em>}</li>
 *   <li>{@link org.csu.slicing.CoachBus.Passenger#getAge <em>Age</em>}</li>
 *   <li>{@link org.csu.slicing.CoachBus.Passenger#getIdCard <em>Id Card</em>}</li>
 *   <li>{@link org.csu.slicing.CoachBus.Passenger#getTrips <em>Trips</em>}</li>
 *   <li>{@link org.csu.slicing.CoachBus.Passenger#getTickets <em>Tickets</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.CoachBus.CoachBusPackage#getPassenger()
 * @model
 * @generated
 */
public interface Passenger extends EObject {
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
	 * @see org.csu.slicing.CoachBus.CoachBusPackage#getPassenger_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.csu.slicing.CoachBus.Passenger#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Age</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Age</em>' attribute.
	 * @see #setAge(int)
	 * @see org.csu.slicing.CoachBus.CoachBusPackage#getPassenger_Age()
	 * @model
	 * @generated
	 */
	int getAge();

	/**
	 * Sets the value of the '{@link org.csu.slicing.CoachBus.Passenger#getAge <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Age</em>' attribute.
	 * @see #getAge()
	 * @generated
	 */
	void setAge(int value);

	/**
	 * Returns the value of the '<em><b>Id Card</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Card</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Card</em>' attribute.
	 * @see #setIdCard(String)
	 * @see org.csu.slicing.CoachBus.CoachBusPackage#getPassenger_IdCard()
	 * @model
	 * @generated
	 */
	String getIdCard();

	/**
	 * Sets the value of the '{@link org.csu.slicing.CoachBus.Passenger#getIdCard <em>Id Card</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Card</em>' attribute.
	 * @see #getIdCard()
	 * @generated
	 */
	void setIdCard(String value);

	/**
	 * Returns the value of the '<em><b>Trips</b></em>' reference list.
	 * The list contents are of type {@link org.csu.slicing.CoachBus.Trip}.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.CoachBus.Trip#getPassengers <em>Passengers</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trips</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trips</em>' reference list.
	 * @see org.csu.slicing.CoachBus.CoachBusPackage#getPassenger_Trips()
	 * @see org.csu.slicing.CoachBus.Trip#getPassengers
	 * @model opposite="passengers" required="true"
	 * @generated
	 */
	EList<Trip> getTrips();

	/**
	 * Returns the value of the '<em><b>Tickets</b></em>' reference list.
	 * The list contents are of type {@link org.csu.slicing.CoachBus.Ticket}.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.CoachBus.Ticket#getPsg <em>Psg</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tickets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tickets</em>' reference list.
	 * @see org.csu.slicing.CoachBus.CoachBusPackage#getPassenger_Tickets()
	 * @see org.csu.slicing.CoachBus.Ticket#getPsg
	 * @model opposite="psg"
	 * @generated
	 */
	EList<Ticket> getTickets();

} // Passenger

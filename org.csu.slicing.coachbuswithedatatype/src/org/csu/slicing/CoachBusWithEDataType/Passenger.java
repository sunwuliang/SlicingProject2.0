/**
 */
package org.csu.slicing.CoachBusWithEDataType;

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
 *   <li>{@link org.csu.slicing.CoachBusWithEDataType.Passenger#getName <em>Name</em>}</li>
 *   <li>{@link org.csu.slicing.CoachBusWithEDataType.Passenger#getAge <em>Age</em>}</li>
 *   <li>{@link org.csu.slicing.CoachBusWithEDataType.Passenger#getIdCard <em>Id Card</em>}</li>
 *   <li>{@link org.csu.slicing.CoachBusWithEDataType.Passenger#getTrips <em>Trips</em>}</li>
 *   <li>{@link org.csu.slicing.CoachBusWithEDataType.Passenger#getTickets <em>Tickets</em>}</li>
 *   <li>{@link org.csu.slicing.CoachBusWithEDataType.Passenger#getSex <em>Sex</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.CoachBusWithEDataType.CoachBusWithEDataTypePackage#getPassenger()
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
	 * @see org.csu.slicing.CoachBusWithEDataType.CoachBusWithEDataTypePackage#getPassenger_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.csu.slicing.CoachBusWithEDataType.Passenger#getName <em>Name</em>}' attribute.
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
	 * @see org.csu.slicing.CoachBusWithEDataType.CoachBusWithEDataTypePackage#getPassenger_Age()
	 * @model
	 * @generated
	 */
	int getAge();

	/**
	 * Sets the value of the '{@link org.csu.slicing.CoachBusWithEDataType.Passenger#getAge <em>Age</em>}' attribute.
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
	 * @see org.csu.slicing.CoachBusWithEDataType.CoachBusWithEDataTypePackage#getPassenger_IdCard()
	 * @model
	 * @generated
	 */
	String getIdCard();

	/**
	 * Sets the value of the '{@link org.csu.slicing.CoachBusWithEDataType.Passenger#getIdCard <em>Id Card</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Card</em>' attribute.
	 * @see #getIdCard()
	 * @generated
	 */
	void setIdCard(String value);

	/**
	 * Returns the value of the '<em><b>Trips</b></em>' reference list.
	 * The list contents are of type {@link org.csu.slicing.CoachBusWithEDataType.Trip}.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.CoachBusWithEDataType.Trip#getPassengers <em>Passengers</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trips</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trips</em>' reference list.
	 * @see org.csu.slicing.CoachBusWithEDataType.CoachBusWithEDataTypePackage#getPassenger_Trips()
	 * @see org.csu.slicing.CoachBusWithEDataType.Trip#getPassengers
	 * @model opposite="passengers" required="true"
	 * @generated
	 */
	EList<Trip> getTrips();

	/**
	 * Returns the value of the '<em><b>Tickets</b></em>' reference list.
	 * The list contents are of type {@link org.csu.slicing.CoachBusWithEDataType.Ticket}.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.CoachBusWithEDataType.Ticket#getPsg <em>Psg</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tickets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tickets</em>' reference list.
	 * @see org.csu.slicing.CoachBusWithEDataType.CoachBusWithEDataTypePackage#getPassenger_Tickets()
	 * @see org.csu.slicing.CoachBusWithEDataType.Ticket#getPsg
	 * @model opposite="psg"
	 * @generated
	 */
	EList<Ticket> getTickets();

	/**
	 * Returns the value of the '<em><b>Sex</b></em>' attribute.
	 * The literals are from the enumeration {@link org.csu.slicing.CoachBusWithEDataType.Sex}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sex</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sex</em>' attribute.
	 * @see org.csu.slicing.CoachBusWithEDataType.Sex
	 * @see #setSex(Sex)
	 * @see org.csu.slicing.CoachBusWithEDataType.CoachBusWithEDataTypePackage#getPassenger_Sex()
	 * @model
	 * @generated
	 */
	Sex getSex();

	/**
	 * Sets the value of the '{@link org.csu.slicing.CoachBusWithEDataType.Passenger#getSex <em>Sex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sex</em>' attribute.
	 * @see org.csu.slicing.CoachBusWithEDataType.Sex
	 * @see #getSex()
	 * @generated
	 */
	void setSex(Sex value);

} // Passenger

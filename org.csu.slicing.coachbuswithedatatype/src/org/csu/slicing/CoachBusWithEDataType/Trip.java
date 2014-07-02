/**
 */
package org.csu.slicing.CoachBusWithEDataType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trip</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.CoachBusWithEDataType.Trip#getName <em>Name</em>}</li>
 *   <li>{@link org.csu.slicing.CoachBusWithEDataType.Trip#getOrigin <em>Origin</em>}</li>
 *   <li>{@link org.csu.slicing.CoachBusWithEDataType.Trip#getDestination <em>Destination</em>}</li>
 *   <li>{@link org.csu.slicing.CoachBusWithEDataType.Trip#getType <em>Type</em>}</li>
 *   <li>{@link org.csu.slicing.CoachBusWithEDataType.Trip#getNumber <em>Number</em>}</li>
 *   <li>{@link org.csu.slicing.CoachBusWithEDataType.Trip#getCoaches <em>Coaches</em>}</li>
 *   <li>{@link org.csu.slicing.CoachBusWithEDataType.Trip#getPassengers <em>Passengers</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.CoachBusWithEDataType.CoachBusWithEDataTypePackage#getTrip()
 * @model
 * @generated
 */
public interface Trip extends EObject {
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
	 * @see org.csu.slicing.CoachBusWithEDataType.CoachBusWithEDataTypePackage#getTrip_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.csu.slicing.CoachBusWithEDataType.Trip#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Origin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin</em>' attribute.
	 * @see #setOrigin(String)
	 * @see org.csu.slicing.CoachBusWithEDataType.CoachBusWithEDataTypePackage#getTrip_Origin()
	 * @model
	 * @generated
	 */
	String getOrigin();

	/**
	 * Sets the value of the '{@link org.csu.slicing.CoachBusWithEDataType.Trip#getOrigin <em>Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin</em>' attribute.
	 * @see #getOrigin()
	 * @generated
	 */
	void setOrigin(String value);

	/**
	 * Returns the value of the '<em><b>Destination</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destination</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination</em>' attribute.
	 * @see #setDestination(String)
	 * @see org.csu.slicing.CoachBusWithEDataType.CoachBusWithEDataTypePackage#getTrip_Destination()
	 * @model
	 * @generated
	 */
	String getDestination();

	/**
	 * Sets the value of the '{@link org.csu.slicing.CoachBusWithEDataType.Trip#getDestination <em>Destination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination</em>' attribute.
	 * @see #getDestination()
	 * @generated
	 */
	void setDestination(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(Object)
	 * @see org.csu.slicing.CoachBusWithEDataType.CoachBusWithEDataTypePackage#getTrip_Type()
	 * @model dataType="org.csu.slicing.CoachBusWithEDataType.TType"
	 * @generated
	 */
	Object getType();

	/**
	 * Sets the value of the '{@link org.csu.slicing.CoachBusWithEDataType.Trip#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(Object value);

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
	 * @see org.csu.slicing.CoachBusWithEDataType.CoachBusWithEDataTypePackage#getTrip_Number()
	 * @model
	 * @generated
	 */
	int getNumber();

	/**
	 * Sets the value of the '{@link org.csu.slicing.CoachBusWithEDataType.Trip#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(int value);

	/**
	 * Returns the value of the '<em><b>Coaches</b></em>' reference list.
	 * The list contents are of type {@link org.csu.slicing.CoachBusWithEDataType.Coach}.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.CoachBusWithEDataType.Coach#getTrips <em>Trips</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coaches</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coaches</em>' reference list.
	 * @see org.csu.slicing.CoachBusWithEDataType.CoachBusWithEDataTypePackage#getTrip_Coaches()
	 * @see org.csu.slicing.CoachBusWithEDataType.Coach#getTrips
	 * @model opposite="trips" required="true"
	 * @generated
	 */
	EList<Coach> getCoaches();

	/**
	 * Returns the value of the '<em><b>Passengers</b></em>' reference list.
	 * The list contents are of type {@link org.csu.slicing.CoachBusWithEDataType.Passenger}.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.CoachBusWithEDataType.Passenger#getTrips <em>Trips</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Passengers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passengers</em>' reference list.
	 * @see org.csu.slicing.CoachBusWithEDataType.CoachBusWithEDataTypePackage#getTrip_Passengers()
	 * @see org.csu.slicing.CoachBusWithEDataType.Passenger#getTrips
	 * @model opposite="trips" required="true"
	 * @generated
	 */
	EList<Passenger> getPassengers();

} // Trip

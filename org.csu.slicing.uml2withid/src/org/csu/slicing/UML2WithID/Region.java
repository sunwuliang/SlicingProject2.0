/**
 */
package org.csu.slicing.UML2WithID;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Region</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2WithID.Region#getSubvertex <em>Subvertex</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.Region#getTransition <em>Transition</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.Region#getStateMachine <em>State Machine</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.Region#getState <em>State</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.Region#getExtendedRegion <em>Extended Region</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getRegion()
 * @model
 * @generated
 */
public interface Region extends Namespace, RedefinableElement {
	/**
	 * Returns the value of the '<em><b>Subvertex</b></em>' containment reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2WithID.Vertex}.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2WithID.Vertex#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subvertex</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subvertex</em>' containment reference list.
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getRegion_Subvertex()
	 * @see org.csu.slicing.UML2WithID.Vertex#getContainer
	 * @model opposite="container" containment="true" ordered="false"
	 * @generated
	 */
	EList<Vertex> getSubvertex();

	/**
	 * Returns the value of the '<em><b>Transition</b></em>' containment reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2WithID.Transition}.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2WithID.Transition#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition</em>' containment reference list.
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getRegion_Transition()
	 * @see org.csu.slicing.UML2WithID.Transition#getContainer
	 * @model opposite="container" containment="true" ordered="false"
	 * @generated
	 */
	EList<Transition> getTransition();

	/**
	 * Returns the value of the '<em><b>State Machine</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2WithID.StateMachine#getRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State Machine</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Machine</em>' container reference.
	 * @see #setStateMachine(StateMachine)
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getRegion_StateMachine()
	 * @see org.csu.slicing.UML2WithID.StateMachine#getRegion
	 * @model opposite="region" transient="false" ordered="false"
	 * @generated
	 */
	StateMachine getStateMachine();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.Region#getStateMachine <em>State Machine</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Machine</em>' container reference.
	 * @see #getStateMachine()
	 * @generated
	 */
	void setStateMachine(StateMachine value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2WithID.State#getRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' container reference.
	 * @see #setState(State)
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getRegion_State()
	 * @see org.csu.slicing.UML2WithID.State#getRegion
	 * @model opposite="region" transient="false" ordered="false"
	 * @generated
	 */
	State getState();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.Region#getState <em>State</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' container reference.
	 * @see #getState()
	 * @generated
	 */
	void setState(State value);

	/**
	 * Returns the value of the '<em><b>Extended Region</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extended Region</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extended Region</em>' reference.
	 * @see #setExtendedRegion(Region)
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getRegion_ExtendedRegion()
	 * @model ordered="false"
	 * @generated
	 */
	Region getExtendedRegion();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.Region#getExtendedRegion <em>Extended Region</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extended Region</em>' reference.
	 * @see #getExtendedRegion()
	 * @generated
	 */
	void setExtendedRegion(Region value);

} // Region

/**
 */
package org.csu.slicing.UML2WithID;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2WithID.State#isIsComposite <em>Is Composite</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.State#isIsOrthogonal <em>Is Orthogonal</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.State#isIsSimple <em>Is Simple</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.State#isIsSubmachineState <em>Is Submachine State</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.State#getSubmachine <em>Submachine</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.State#getConnection <em>Connection</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.State#getRedefinedState <em>Redefined State</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.State#getDeferrableTrigger <em>Deferrable Trigger</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.State#getRegion <em>Region</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.State#getEntry <em>Entry</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.State#getExit <em>Exit</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.State#getDoActivity <em>Do Activity</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.State#getStateInvariant <em>State Invariant</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getState()
 * @model
 * @generated
 */
public interface State extends Namespace, RedefinableElement, Vertex {
	/**
	 * Returns the value of the '<em><b>Is Composite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Composite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Composite</em>' attribute.
	 * @see #setIsComposite(boolean)
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getState_IsComposite()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	boolean isIsComposite();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.State#isIsComposite <em>Is Composite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Composite</em>' attribute.
	 * @see #isIsComposite()
	 * @generated
	 */
	void setIsComposite(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Orthogonal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Orthogonal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Orthogonal</em>' attribute.
	 * @see #setIsOrthogonal(boolean)
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getState_IsOrthogonal()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	boolean isIsOrthogonal();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.State#isIsOrthogonal <em>Is Orthogonal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Orthogonal</em>' attribute.
	 * @see #isIsOrthogonal()
	 * @generated
	 */
	void setIsOrthogonal(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Simple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Simple</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Simple</em>' attribute.
	 * @see #setIsSimple(boolean)
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getState_IsSimple()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	boolean isIsSimple();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.State#isIsSimple <em>Is Simple</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Simple</em>' attribute.
	 * @see #isIsSimple()
	 * @generated
	 */
	void setIsSimple(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Submachine State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Submachine State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Submachine State</em>' attribute.
	 * @see #setIsSubmachineState(boolean)
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getState_IsSubmachineState()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	boolean isIsSubmachineState();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.State#isIsSubmachineState <em>Is Submachine State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Submachine State</em>' attribute.
	 * @see #isIsSubmachineState()
	 * @generated
	 */
	void setIsSubmachineState(boolean value);

	/**
	 * Returns the value of the '<em><b>Submachine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Submachine</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Submachine</em>' reference.
	 * @see #setSubmachine(StateMachine)
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getState_Submachine()
	 * @model ordered="false"
	 * @generated
	 */
	StateMachine getSubmachine();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.State#getSubmachine <em>Submachine</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Submachine</em>' reference.
	 * @see #getSubmachine()
	 * @generated
	 */
	void setSubmachine(StateMachine value);

	/**
	 * Returns the value of the '<em><b>Connection</b></em>' containment reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2WithID.ConnectionPointReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection</em>' containment reference list.
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getState_Connection()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<ConnectionPointReference> getConnection();

	/**
	 * Returns the value of the '<em><b>Redefined State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Redefined State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Redefined State</em>' reference.
	 * @see #setRedefinedState(State)
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getState_RedefinedState()
	 * @model ordered="false"
	 * @generated
	 */
	State getRedefinedState();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.State#getRedefinedState <em>Redefined State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Redefined State</em>' reference.
	 * @see #getRedefinedState()
	 * @generated
	 */
	void setRedefinedState(State value);

	/**
	 * Returns the value of the '<em><b>Deferrable Trigger</b></em>' reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2WithID.Trigger}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deferrable Trigger</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deferrable Trigger</em>' reference list.
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getState_DeferrableTrigger()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Trigger> getDeferrableTrigger();

	/**
	 * Returns the value of the '<em><b>Region</b></em>' containment reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2WithID.Region}.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2WithID.Region#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Region</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Region</em>' containment reference list.
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getState_Region()
	 * @see org.csu.slicing.UML2WithID.Region#getState
	 * @model opposite="state" containment="true" ordered="false"
	 * @generated
	 */
	EList<Region> getRegion();

	/**
	 * Returns the value of the '<em><b>Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entry</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry</em>' containment reference.
	 * @see #setEntry(Activity)
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getState_Entry()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Activity getEntry();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.State#getEntry <em>Entry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entry</em>' containment reference.
	 * @see #getEntry()
	 * @generated
	 */
	void setEntry(Activity value);

	/**
	 * Returns the value of the '<em><b>Exit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exit</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exit</em>' containment reference.
	 * @see #setExit(Activity)
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getState_Exit()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Activity getExit();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.State#getExit <em>Exit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exit</em>' containment reference.
	 * @see #getExit()
	 * @generated
	 */
	void setExit(Activity value);

	/**
	 * Returns the value of the '<em><b>Do Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Do Activity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Do Activity</em>' containment reference.
	 * @see #setDoActivity(Activity)
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getState_DoActivity()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Activity getDoActivity();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.State#getDoActivity <em>Do Activity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Do Activity</em>' containment reference.
	 * @see #getDoActivity()
	 * @generated
	 */
	void setDoActivity(Activity value);

	/**
	 * Returns the value of the '<em><b>State Invariant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State Invariant</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Invariant</em>' containment reference.
	 * @see #setStateInvariant(Constraint)
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getState_StateInvariant()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Constraint getStateInvariant();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.State#getStateInvariant <em>State Invariant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Invariant</em>' containment reference.
	 * @see #getStateInvariant()
	 * @generated
	 */
	void setStateInvariant(Constraint value);

} // State

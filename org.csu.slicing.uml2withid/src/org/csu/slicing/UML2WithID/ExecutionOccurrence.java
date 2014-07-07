/**
 */
package org.csu.slicing.UML2WithID;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Execution Occurrence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2WithID.ExecutionOccurrence#getStart <em>Start</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.ExecutionOccurrence#getFinish <em>Finish</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.ExecutionOccurrence#getBehavior <em>Behavior</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getExecutionOccurrence()
 * @model
 * @generated
 */
public interface ExecutionOccurrence extends InteractionFragment {
	/**
	 * Returns the value of the '<em><b>Start</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2WithID.EventOccurrence#getStartExec <em>Start Exec</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' reference.
	 * @see #setStart(EventOccurrence)
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getExecutionOccurrence_Start()
	 * @see org.csu.slicing.UML2WithID.EventOccurrence#getStartExec
	 * @model opposite="startExec" required="true" ordered="false"
	 * @generated
	 */
	EventOccurrence getStart();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.ExecutionOccurrence#getStart <em>Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' reference.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(EventOccurrence value);

	/**
	 * Returns the value of the '<em><b>Finish</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2WithID.EventOccurrence#getFinishExec <em>Finish Exec</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Finish</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Finish</em>' reference.
	 * @see #setFinish(EventOccurrence)
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getExecutionOccurrence_Finish()
	 * @see org.csu.slicing.UML2WithID.EventOccurrence#getFinishExec
	 * @model opposite="finishExec" required="true" ordered="false"
	 * @generated
	 */
	EventOccurrence getFinish();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.ExecutionOccurrence#getFinish <em>Finish</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Finish</em>' reference.
	 * @see #getFinish()
	 * @generated
	 */
	void setFinish(EventOccurrence value);

	/**
	 * Returns the value of the '<em><b>Behavior</b></em>' reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2WithID.Behavior}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Behavior</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behavior</em>' reference list.
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getExecutionOccurrence_Behavior()
	 * @model
	 * @generated
	 */
	EList<Behavior> getBehavior();

} // ExecutionOccurrence

/**
 */
package org.csu.slicing.UML2WithID;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Occurrence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2WithID.EventOccurrence#getStartExec <em>Start Exec</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.EventOccurrence#getFinishExec <em>Finish Exec</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.EventOccurrence#getToAfter <em>To After</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.EventOccurrence#getToBefore <em>To Before</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getEventOccurrence()
 * @model
 * @generated
 */
public interface EventOccurrence extends InteractionFragment, MessageEnd {
	/**
	 * Returns the value of the '<em><b>Start Exec</b></em>' reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2WithID.ExecutionOccurrence}.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2WithID.ExecutionOccurrence#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Exec</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Exec</em>' reference list.
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getEventOccurrence_StartExec()
	 * @see org.csu.slicing.UML2WithID.ExecutionOccurrence#getStart
	 * @model opposite="start" ordered="false"
	 * @generated
	 */
	EList<ExecutionOccurrence> getStartExec();

	/**
	 * Returns the value of the '<em><b>Finish Exec</b></em>' reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2WithID.ExecutionOccurrence}.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2WithID.ExecutionOccurrence#getFinish <em>Finish</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Finish Exec</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Finish Exec</em>' reference list.
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getEventOccurrence_FinishExec()
	 * @see org.csu.slicing.UML2WithID.ExecutionOccurrence#getFinish
	 * @model opposite="finish" ordered="false"
	 * @generated
	 */
	EList<ExecutionOccurrence> getFinishExec();

	/**
	 * Returns the value of the '<em><b>To After</b></em>' reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2WithID.GeneralOrdering}.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2WithID.GeneralOrdering#getBefore <em>Before</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To After</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To After</em>' reference list.
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getEventOccurrence_ToAfter()
	 * @see org.csu.slicing.UML2WithID.GeneralOrdering#getBefore
	 * @model opposite="before" ordered="false"
	 * @generated
	 */
	EList<GeneralOrdering> getToAfter();

	/**
	 * Returns the value of the '<em><b>To Before</b></em>' reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2WithID.GeneralOrdering}.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2WithID.GeneralOrdering#getAfter <em>After</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Before</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Before</em>' reference list.
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getEventOccurrence_ToBefore()
	 * @see org.csu.slicing.UML2WithID.GeneralOrdering#getAfter
	 * @model opposite="after" ordered="false"
	 * @generated
	 */
	EList<GeneralOrdering> getToBefore();

} // EventOccurrence

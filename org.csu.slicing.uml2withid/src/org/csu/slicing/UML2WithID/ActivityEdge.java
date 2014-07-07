/**
 */
package org.csu.slicing.UML2WithID;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2WithID.ActivityEdge#getActivity <em>Activity</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.ActivityEdge#getSource <em>Source</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.ActivityEdge#getTarget <em>Target</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.ActivityEdge#getInGroup <em>In Group</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.ActivityEdge#getGuard <em>Guard</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.ActivityEdge#getRedefinedElement <em>Redefined Element</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.ActivityEdge#getInStructuredNode <em>In Structured Node</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.ActivityEdge#getInPartition <em>In Partition</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.ActivityEdge#getWeight <em>Weight</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.ActivityEdge#getInterrupts <em>Interrupts</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getActivityEdge()
 * @model abstract="true"
 * @generated
 */
public interface ActivityEdge extends RedefinableElement {
	/**
	 * Returns the value of the '<em><b>Activity</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2WithID.Activity#getEdge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity</em>' container reference.
	 * @see #setActivity(Activity)
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getActivityEdge_Activity()
	 * @see org.csu.slicing.UML2WithID.Activity#getEdge
	 * @model opposite="edge" transient="false" ordered="false"
	 * @generated
	 */
	Activity getActivity();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.ActivityEdge#getActivity <em>Activity</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity</em>' container reference.
	 * @see #getActivity()
	 * @generated
	 */
	void setActivity(Activity value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2WithID.ActivityNode#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(ActivityNode)
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getActivityEdge_Source()
	 * @see org.csu.slicing.UML2WithID.ActivityNode#getOutgoing
	 * @model opposite="outgoing" required="true" ordered="false"
	 * @generated
	 */
	ActivityNode getSource();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.ActivityEdge#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(ActivityNode value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2WithID.ActivityNode#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(ActivityNode)
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getActivityEdge_Target()
	 * @see org.csu.slicing.UML2WithID.ActivityNode#getIncoming
	 * @model opposite="incoming" required="true" ordered="false"
	 * @generated
	 */
	ActivityNode getTarget();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.ActivityEdge#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(ActivityNode value);

	/**
	 * Returns the value of the '<em><b>In Group</b></em>' reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2WithID.ActivityGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Group</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Group</em>' reference list.
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getActivityEdge_InGroup()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ActivityGroup> getInGroup();

	/**
	 * Returns the value of the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guard</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard</em>' containment reference.
	 * @see #setGuard(ValueSpecification)
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getActivityEdge_Guard()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	ValueSpecification getGuard();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.ActivityEdge#getGuard <em>Guard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard</em>' containment reference.
	 * @see #getGuard()
	 * @generated
	 */
	void setGuard(ValueSpecification value);

	/**
	 * Returns the value of the '<em><b>Redefined Element</b></em>' reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2WithID.ActivityEdge}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Redefined Element</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Redefined Element</em>' reference list.
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getActivityEdge_RedefinedElement()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ActivityEdge> getRedefinedElement();

	/**
	 * Returns the value of the '<em><b>In Structured Node</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2WithID.StructuredActivityNode#getContainedEdge <em>Contained Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Structured Node</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Structured Node</em>' container reference.
	 * @see #setInStructuredNode(StructuredActivityNode)
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getActivityEdge_InStructuredNode()
	 * @see org.csu.slicing.UML2WithID.StructuredActivityNode#getContainedEdge
	 * @model opposite="containedEdge" transient="false" ordered="false"
	 * @generated
	 */
	StructuredActivityNode getInStructuredNode();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.ActivityEdge#getInStructuredNode <em>In Structured Node</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Structured Node</em>' container reference.
	 * @see #getInStructuredNode()
	 * @generated
	 */
	void setInStructuredNode(StructuredActivityNode value);

	/**
	 * Returns the value of the '<em><b>In Partition</b></em>' reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2WithID.ActivityPartition}.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2WithID.ActivityPartition#getContainedEdge <em>Contained Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Partition</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Partition</em>' reference list.
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getActivityEdge_InPartition()
	 * @see org.csu.slicing.UML2WithID.ActivityPartition#getContainedEdge
	 * @model opposite="containedEdge" ordered="false"
	 * @generated
	 */
	EList<ActivityPartition> getInPartition();

	/**
	 * Returns the value of the '<em><b>Weight</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Weight</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weight</em>' containment reference.
	 * @see #setWeight(ValueSpecification)
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getActivityEdge_Weight()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	ValueSpecification getWeight();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.ActivityEdge#getWeight <em>Weight</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight</em>' containment reference.
	 * @see #getWeight()
	 * @generated
	 */
	void setWeight(ValueSpecification value);

	/**
	 * Returns the value of the '<em><b>Interrupts</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2WithID.InterruptibleActivityRegion#getInterruptingEdge <em>Interrupting Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interrupts</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interrupts</em>' reference.
	 * @see #setInterrupts(InterruptibleActivityRegion)
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getActivityEdge_Interrupts()
	 * @see org.csu.slicing.UML2WithID.InterruptibleActivityRegion#getInterruptingEdge
	 * @model opposite="interruptingEdge" ordered="false"
	 * @generated
	 */
	InterruptibleActivityRegion getInterrupts();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.ActivityEdge#getInterrupts <em>Interrupts</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interrupts</em>' reference.
	 * @see #getInterrupts()
	 * @generated
	 */
	void setInterrupts(InterruptibleActivityRegion value);

} // ActivityEdge

/**
 */
package org.csu.slicing.UML2WithID;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2WithID.ActivityNode#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.ActivityNode#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.ActivityNode#getInGroup <em>In Group</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.ActivityNode#getActivity <em>Activity</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.ActivityNode#getRedefinedElement <em>Redefined Element</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.ActivityNode#getInStructuredNode <em>In Structured Node</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.ActivityNode#getInPartition <em>In Partition</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.ActivityNode#getInInterruptibleRegion <em>In Interruptible Region</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getActivityNode()
 * @model abstract="true"
 * @generated
 */
public interface ActivityNode extends RedefinableElement {
	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2WithID.ActivityEdge}.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2WithID.ActivityEdge#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference list.
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getActivityNode_Outgoing()
	 * @see org.csu.slicing.UML2WithID.ActivityEdge#getSource
	 * @model opposite="source" ordered="false"
	 * @generated
	 */
	EList<ActivityEdge> getOutgoing();

	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2WithID.ActivityEdge}.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2WithID.ActivityEdge#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' reference list.
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getActivityNode_Incoming()
	 * @see org.csu.slicing.UML2WithID.ActivityEdge#getTarget
	 * @model opposite="target" ordered="false"
	 * @generated
	 */
	EList<ActivityEdge> getIncoming();

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
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getActivityNode_InGroup()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ActivityGroup> getInGroup();

	/**
	 * Returns the value of the '<em><b>Activity</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2WithID.Activity#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity</em>' container reference.
	 * @see #setActivity(Activity)
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getActivityNode_Activity()
	 * @see org.csu.slicing.UML2WithID.Activity#getNode
	 * @model opposite="node" transient="false" ordered="false"
	 * @generated
	 */
	Activity getActivity();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.ActivityNode#getActivity <em>Activity</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity</em>' container reference.
	 * @see #getActivity()
	 * @generated
	 */
	void setActivity(Activity value);

	/**
	 * Returns the value of the '<em><b>Redefined Element</b></em>' reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2WithID.ActivityNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Redefined Element</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Redefined Element</em>' reference list.
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getActivityNode_RedefinedElement()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ActivityNode> getRedefinedElement();

	/**
	 * Returns the value of the '<em><b>In Structured Node</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2WithID.StructuredActivityNode#getContainedNode <em>Contained Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Structured Node</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Structured Node</em>' container reference.
	 * @see #setInStructuredNode(StructuredActivityNode)
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getActivityNode_InStructuredNode()
	 * @see org.csu.slicing.UML2WithID.StructuredActivityNode#getContainedNode
	 * @model opposite="containedNode" transient="false" ordered="false"
	 * @generated
	 */
	StructuredActivityNode getInStructuredNode();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.ActivityNode#getInStructuredNode <em>In Structured Node</em>}' container reference.
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
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2WithID.ActivityPartition#getContainedNode <em>Contained Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Partition</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Partition</em>' reference list.
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getActivityNode_InPartition()
	 * @see org.csu.slicing.UML2WithID.ActivityPartition#getContainedNode
	 * @model opposite="containedNode" ordered="false"
	 * @generated
	 */
	EList<ActivityPartition> getInPartition();

	/**
	 * Returns the value of the '<em><b>In Interruptible Region</b></em>' reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2WithID.InterruptibleActivityRegion}.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2WithID.InterruptibleActivityRegion#getContainedNode <em>Contained Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Interruptible Region</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Interruptible Region</em>' reference list.
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getActivityNode_InInterruptibleRegion()
	 * @see org.csu.slicing.UML2WithID.InterruptibleActivityRegion#getContainedNode
	 * @model opposite="containedNode" ordered="false"
	 * @generated
	 */
	EList<InterruptibleActivityRegion> getInInterruptibleRegion();

} // ActivityNode

/**
 */
package org.csu.slicing.UML2WithID;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interruptible Activity Region</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2WithID.InterruptibleActivityRegion#getInterruptingEdge <em>Interrupting Edge</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.InterruptibleActivityRegion#getContainedNode <em>Contained Node</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getInterruptibleActivityRegion()
 * @model
 * @generated
 */
public interface InterruptibleActivityRegion extends ActivityGroup {
	/**
	 * Returns the value of the '<em><b>Interrupting Edge</b></em>' reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2WithID.ActivityEdge}.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2WithID.ActivityEdge#getInterrupts <em>Interrupts</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interrupting Edge</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interrupting Edge</em>' reference list.
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getInterruptibleActivityRegion_InterruptingEdge()
	 * @see org.csu.slicing.UML2WithID.ActivityEdge#getInterrupts
	 * @model opposite="interrupts" ordered="false"
	 * @generated
	 */
	EList<ActivityEdge> getInterruptingEdge();

	/**
	 * Returns the value of the '<em><b>Contained Node</b></em>' reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2WithID.ActivityNode}.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2WithID.ActivityNode#getInInterruptibleRegion <em>In Interruptible Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained Node</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Node</em>' reference list.
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getInterruptibleActivityRegion_ContainedNode()
	 * @see org.csu.slicing.UML2WithID.ActivityNode#getInInterruptibleRegion
	 * @model opposite="inInterruptibleRegion"
	 * @generated
	 */
	EList<ActivityNode> getContainedNode();

} // InterruptibleActivityRegion

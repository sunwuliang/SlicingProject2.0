/**
 */
package org.csu.slicing.UML2WithID;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Observation Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2WithID.TimeObservationAction#getNow <em>Now</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getTimeObservationAction()
 * @model
 * @generated
 */
public interface TimeObservationAction extends WriteStructuralFeatureAction {
	/**
	 * Returns the value of the '<em><b>Now</b></em>' containment reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2WithID.TimeExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Now</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Now</em>' containment reference list.
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getTimeObservationAction_Now()
	 * @model containment="true"
	 * @generated
	 */
	EList<TimeExpression> getNow();

} // TimeObservationAction

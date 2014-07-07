/**
 */
package org.csu.slicing.UML2WithID;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Duration Observation Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2WithID.DurationObservationAction#getDuration <em>Duration</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getDurationObservationAction()
 * @model
 * @generated
 */
public interface DurationObservationAction extends WriteStructuralFeatureAction {
	/**
	 * Returns the value of the '<em><b>Duration</b></em>' containment reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2WithID.Duration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' containment reference list.
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getDurationObservationAction_Duration()
	 * @model containment="true"
	 * @generated
	 */
	EList<Duration> getDuration();

} // DurationObservationAction

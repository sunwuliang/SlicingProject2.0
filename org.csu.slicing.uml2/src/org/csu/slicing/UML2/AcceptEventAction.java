/**
 */
package org.csu.slicing.UML2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Accept Event Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2.AcceptEventAction#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.AcceptEventAction#getResult <em>Result</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2.UML2Package#getAcceptEventAction()
 * @model
 * @generated
 */
public interface AcceptEventAction extends Action {
	/**
	 * Returns the value of the '<em><b>Trigger</b></em>' reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2.Trigger}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trigger</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger</em>' reference list.
	 * @see org.csu.slicing.UML2.UML2Package#getAcceptEventAction_Trigger()
	 * @model
	 * @generated
	 */
	EList<Trigger> getTrigger();

	/**
	 * Returns the value of the '<em><b>Result</b></em>' reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2.OutputPin}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result</em>' reference list.
	 * @see org.csu.slicing.UML2.UML2Package#getAcceptEventAction_Result()
	 * @model ordered="false"
	 * @generated
	 */
	EList<OutputPin> getResult();

} // AcceptEventAction

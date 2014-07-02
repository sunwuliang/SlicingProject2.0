/**
 */
package org.csu.slicing.UML2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2.LinkAction#getEndData <em>End Data</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2.UML2Package#getLinkAction()
 * @model abstract="true"
 * @generated
 */
public interface LinkAction extends Action {
	/**
	 * Returns the value of the '<em><b>End Data</b></em>' containment reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2.LinkEndData}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Data</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Data</em>' containment reference list.
	 * @see org.csu.slicing.UML2.UML2Package#getLinkAction_EndData()
	 * @model containment="true" lower="2" ordered="false"
	 * @generated
	 */
	EList<LinkEndData> getEndData();

} // LinkAction

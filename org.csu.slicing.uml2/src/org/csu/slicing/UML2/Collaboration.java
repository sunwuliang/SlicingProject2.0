/**
 */
package org.csu.slicing.UML2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collaboration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2.Collaboration#getCollaborationRole <em>Collaboration Role</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2.UML2Package#getCollaboration()
 * @model
 * @generated
 */
public interface Collaboration extends BehavioredClassifier, StructuredClassifier {
	/**
	 * Returns the value of the '<em><b>Collaboration Role</b></em>' reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2.ConnectableElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collaboration Role</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collaboration Role</em>' reference list.
	 * @see org.csu.slicing.UML2.UML2Package#getCollaboration_CollaborationRole()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ConnectableElement> getCollaborationRole();

} // Collaboration

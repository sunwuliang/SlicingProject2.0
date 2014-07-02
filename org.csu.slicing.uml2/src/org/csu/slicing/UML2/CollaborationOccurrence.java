/**
 */
package org.csu.slicing.UML2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collaboration Occurrence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2.CollaborationOccurrence#getType <em>Type</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.CollaborationOccurrence#getRoleBinding <em>Role Binding</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2.UML2Package#getCollaborationOccurrence()
 * @model
 * @generated
 */
public interface CollaborationOccurrence extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Collaboration)
	 * @see org.csu.slicing.UML2.UML2Package#getCollaborationOccurrence_Type()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Collaboration getType();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2.CollaborationOccurrence#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Collaboration value);

	/**
	 * Returns the value of the '<em><b>Role Binding</b></em>' containment reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2.Dependency}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Binding</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Binding</em>' containment reference list.
	 * @see org.csu.slicing.UML2.UML2Package#getCollaborationOccurrence_RoleBinding()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Dependency> getRoleBinding();

} // CollaborationOccurrence

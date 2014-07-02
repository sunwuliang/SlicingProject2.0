/**
 */
package org.csu.slicing.UML2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Directed Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2.DirectedRelationship#getSource <em>Source</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.DirectedRelationship#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2.UML2Package#getDirectedRelationship()
 * @model abstract="true"
 * @generated
 */
public interface DirectedRelationship extends Relationship {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2.Element}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference list.
	 * @see org.csu.slicing.UML2.UML2Package#getDirectedRelationship_Source()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<Element> getSource();

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2.Element}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference list.
	 * @see org.csu.slicing.UML2.UML2Package#getDirectedRelationship_Target()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<Element> getTarget();

} // DirectedRelationship

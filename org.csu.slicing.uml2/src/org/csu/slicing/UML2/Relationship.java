/**
 */
package org.csu.slicing.UML2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2.Relationship#getRelatedElement <em>Related Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2.UML2Package#getRelationship()
 * @model abstract="true"
 * @generated
 */
public interface Relationship extends Element {
	/**
	 * Returns the value of the '<em><b>Related Element</b></em>' reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2.Element}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Element</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Element</em>' reference list.
	 * @see org.csu.slicing.UML2.UML2Package#getRelationship_RelatedElement()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<Element> getRelatedElement();

} // Relationship

/**
 */
package org.csu.slicing.UML2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2.Element#getOwnedElement <em>Owned Element</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.Element#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.Element#getOwnedComment <em>Owned Comment</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2.UML2Package#getElement()
 * @model abstract="true"
 * @generated
 */
public interface Element extends EObject {
	/**
	 * Returns the value of the '<em><b>Owned Element</b></em>' reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2.Element}.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2.Element#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Element</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Element</em>' reference list.
	 * @see org.csu.slicing.UML2.UML2Package#getElement_OwnedElement()
	 * @see org.csu.slicing.UML2.Element#getOwner
	 * @model opposite="owner" ordered="false"
	 * @generated
	 */
	EList<Element> getOwnedElement();

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2.Element#getOwnedElement <em>Owned Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' reference.
	 * @see #setOwner(Element)
	 * @see org.csu.slicing.UML2.UML2Package#getElement_Owner()
	 * @see org.csu.slicing.UML2.Element#getOwnedElement
	 * @model opposite="ownedElement" ordered="false"
	 * @generated
	 */
	Element getOwner();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2.Element#getOwner <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(Element value);

	/**
	 * Returns the value of the '<em><b>Owned Comment</b></em>' containment reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2.Comment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Comment</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Comment</em>' containment reference list.
	 * @see org.csu.slicing.UML2.UML2Package#getElement_OwnedComment()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Comment> getOwnedComment();

} // Element

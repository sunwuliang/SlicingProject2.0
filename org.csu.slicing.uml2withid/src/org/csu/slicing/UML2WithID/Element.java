/**
 */
package org.csu.slicing.UML2WithID;

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
 *   <li>{@link org.csu.slicing.UML2WithID.Element#getOwnedElement <em>Owned Element</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.Element#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.Element#getOwnedComment <em>Owned Comment</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.Element#getID <em>ID</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getElement()
 * @model abstract="true"
 * @generated
 */
public interface Element extends EObject {
	/**
	 * Returns the value of the '<em><b>Owned Element</b></em>' reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2WithID.Element}.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2WithID.Element#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Element</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Element</em>' reference list.
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getElement_OwnedElement()
	 * @see org.csu.slicing.UML2WithID.Element#getOwner
	 * @model opposite="owner" ordered="false"
	 * @generated
	 */
	EList<Element> getOwnedElement();

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2WithID.Element#getOwnedElement <em>Owned Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' reference.
	 * @see #setOwner(Element)
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getElement_Owner()
	 * @see org.csu.slicing.UML2WithID.Element#getOwnedElement
	 * @model opposite="ownedElement" ordered="false"
	 * @generated
	 */
	Element getOwner();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.Element#getOwner <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(Element value);

	/**
	 * Returns the value of the '<em><b>Owned Comment</b></em>' containment reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2WithID.Comment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Comment</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Comment</em>' containment reference list.
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getElement_OwnedComment()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Comment> getOwnedComment();

	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(String)
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getElement_ID()
	 * @model
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.Element#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

} // Element

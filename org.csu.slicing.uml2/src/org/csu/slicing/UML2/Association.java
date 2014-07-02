/**
 */
package org.csu.slicing.UML2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2.Association#isIsDerived <em>Is Derived</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.Association#getOwnedEnd <em>Owned End</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.Association#getEndType <em>End Type</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.Association#getMemberEnd <em>Member End</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2.UML2Package#getAssociation()
 * @model
 * @generated
 */
public interface Association extends Classifier, Relationship {
	/**
	 * Returns the value of the '<em><b>Is Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Derived</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Derived</em>' attribute.
	 * @see #setIsDerived(boolean)
	 * @see org.csu.slicing.UML2.UML2Package#getAssociation_IsDerived()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	boolean isIsDerived();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2.Association#isIsDerived <em>Is Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Derived</em>' attribute.
	 * @see #isIsDerived()
	 * @generated
	 */
	void setIsDerived(boolean value);

	/**
	 * Returns the value of the '<em><b>Owned End</b></em>' containment reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2.Property}.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2.Property#getOwningAssociation <em>Owning Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned End</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned End</em>' containment reference list.
	 * @see org.csu.slicing.UML2.UML2Package#getAssociation_OwnedEnd()
	 * @see org.csu.slicing.UML2.Property#getOwningAssociation
	 * @model opposite="owningAssociation" containment="true"
	 * @generated
	 */
	EList<Property> getOwnedEnd();

	/**
	 * Returns the value of the '<em><b>End Type</b></em>' reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2.Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Type</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Type</em>' reference list.
	 * @see org.csu.slicing.UML2.UML2Package#getAssociation_EndType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<Type> getEndType();

	/**
	 * Returns the value of the '<em><b>Member End</b></em>' reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2.Property}.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2.Property#getAssociation <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Member End</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member End</em>' reference list.
	 * @see org.csu.slicing.UML2.UML2Package#getAssociation_MemberEnd()
	 * @see org.csu.slicing.UML2.Property#getAssociation
	 * @model opposite="association" lower="2"
	 * @generated
	 */
	EList<Property> getMemberEnd();

} // Association

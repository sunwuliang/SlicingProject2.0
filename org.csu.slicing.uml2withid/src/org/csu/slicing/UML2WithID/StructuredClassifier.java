/**
 */
package org.csu.slicing.UML2WithID;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structured Classifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2WithID.StructuredClassifier#getOwnedAttribute <em>Owned Attribute</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.StructuredClassifier#getPart <em>Part</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.StructuredClassifier#getRole <em>Role</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.StructuredClassifier#getOwnedConnector <em>Owned Connector</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getStructuredClassifier()
 * @model abstract="true"
 * @generated
 */
public interface StructuredClassifier extends Classifier {
	/**
	 * Returns the value of the '<em><b>Owned Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2WithID.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Attribute</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Attribute</em>' containment reference list.
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getStructuredClassifier_OwnedAttribute()
	 * @model containment="true"
	 * @generated
	 */
	EList<Property> getOwnedAttribute();

	/**
	 * Returns the value of the '<em><b>Part</b></em>' reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2WithID.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Part</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part</em>' reference list.
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getStructuredClassifier_Part()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Property> getPart();

	/**
	 * Returns the value of the '<em><b>Role</b></em>' reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2WithID.ConnectableElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' reference list.
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getStructuredClassifier_Role()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ConnectableElement> getRole();

	/**
	 * Returns the value of the '<em><b>Owned Connector</b></em>' containment reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2WithID.Connector}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Connector</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Connector</em>' containment reference list.
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getStructuredClassifier_OwnedConnector()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Connector> getOwnedConnector();

} // StructuredClassifier

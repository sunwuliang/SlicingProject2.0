/**
 */
package org.csu.slicing.UML2WithID;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Artifact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2WithID.Artifact#getFileName <em>File Name</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.Artifact#getNestedArtifact <em>Nested Artifact</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.Artifact#getManifestation <em>Manifestation</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.Artifact#getOwnedOperation <em>Owned Operation</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.Artifact#getOwnedAttribute <em>Owned Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getArtifact()
 * @model
 * @generated
 */
public interface Artifact extends Classifier, DeployedArtifact {
	/**
	 * Returns the value of the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Name</em>' attribute.
	 * @see #setFileName(String)
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getArtifact_FileName()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getFileName();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.Artifact#getFileName <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Name</em>' attribute.
	 * @see #getFileName()
	 * @generated
	 */
	void setFileName(String value);

	/**
	 * Returns the value of the '<em><b>Nested Artifact</b></em>' containment reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2WithID.Artifact}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nested Artifact</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nested Artifact</em>' containment reference list.
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getArtifact_NestedArtifact()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Artifact> getNestedArtifact();

	/**
	 * Returns the value of the '<em><b>Manifestation</b></em>' containment reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2WithID.Manifestation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manifestation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manifestation</em>' containment reference list.
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getArtifact_Manifestation()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Manifestation> getManifestation();

	/**
	 * Returns the value of the '<em><b>Owned Operation</b></em>' containment reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2WithID.Operation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Operation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Operation</em>' containment reference list.
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getArtifact_OwnedOperation()
	 * @model containment="true"
	 * @generated
	 */
	EList<Operation> getOwnedOperation();

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
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getArtifact_OwnedAttribute()
	 * @model containment="true"
	 * @generated
	 */
	EList<Property> getOwnedAttribute();

} // Artifact

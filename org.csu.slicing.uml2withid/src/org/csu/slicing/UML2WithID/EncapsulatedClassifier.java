/**
 */
package org.csu.slicing.UML2WithID;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Encapsulated Classifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2WithID.EncapsulatedClassifier#getOwnedPort <em>Owned Port</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getEncapsulatedClassifier()
 * @model abstract="true"
 * @generated
 */
public interface EncapsulatedClassifier extends StructuredClassifier {
	/**
	 * Returns the value of the '<em><b>Owned Port</b></em>' containment reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2WithID.Port}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Port</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Port</em>' containment reference list.
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getEncapsulatedClassifier_OwnedPort()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Port> getOwnedPort();

} // EncapsulatedClassifier

/**
 */
package org.csu.slicing.UML2WithID;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2WithID.Dependency#getClient <em>Client</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.Dependency#getSupplier <em>Supplier</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getDependency()
 * @model
 * @generated
 */
public interface Dependency extends PackageableElement, DirectedRelationship {
	/**
	 * Returns the value of the '<em><b>Client</b></em>' reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2WithID.NamedElement}.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2WithID.NamedElement#getClientDependency <em>Client Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Client</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client</em>' reference list.
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getDependency_Client()
	 * @see org.csu.slicing.UML2WithID.NamedElement#getClientDependency
	 * @model opposite="clientDependency" required="true" ordered="false"
	 * @generated
	 */
	EList<NamedElement> getClient();

	/**
	 * Returns the value of the '<em><b>Supplier</b></em>' reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2WithID.NamedElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supplier</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supplier</em>' reference list.
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getDependency_Supplier()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<NamedElement> getSupplier();

} // Dependency

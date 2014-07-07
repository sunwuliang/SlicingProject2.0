/**
 */
package org.csu.slicing.UML2WithID;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Namespace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2WithID.Namespace#getMember <em>Member</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.Namespace#getOwnedRule <em>Owned Rule</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.Namespace#getImportedMember <em>Imported Member</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.Namespace#getElementImport <em>Element Import</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.Namespace#getPackageImport <em>Package Import</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getNamespace()
 * @model abstract="true"
 * @generated
 */
public interface Namespace extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Member</b></em>' reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2WithID.NamedElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Member</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member</em>' reference list.
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getNamespace_Member()
	 * @model ordered="false"
	 * @generated
	 */
	EList<NamedElement> getMember();

	/**
	 * Returns the value of the '<em><b>Owned Rule</b></em>' containment reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2WithID.Constraint}.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2WithID.Constraint#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Rule</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Rule</em>' containment reference list.
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getNamespace_OwnedRule()
	 * @see org.csu.slicing.UML2WithID.Constraint#getNamespace
	 * @model opposite="namespace" containment="true" ordered="false"
	 * @generated
	 */
	EList<Constraint> getOwnedRule();

	/**
	 * Returns the value of the '<em><b>Imported Member</b></em>' reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2WithID.PackageableElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imported Member</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imported Member</em>' reference list.
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getNamespace_ImportedMember()
	 * @model ordered="false"
	 * @generated
	 */
	EList<PackageableElement> getImportedMember();

	/**
	 * Returns the value of the '<em><b>Element Import</b></em>' containment reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2WithID.ElementImport}.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2WithID.ElementImport#getImportingNamespace <em>Importing Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element Import</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Import</em>' containment reference list.
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getNamespace_ElementImport()
	 * @see org.csu.slicing.UML2WithID.ElementImport#getImportingNamespace
	 * @model opposite="importingNamespace" containment="true" ordered="false"
	 * @generated
	 */
	EList<ElementImport> getElementImport();

	/**
	 * Returns the value of the '<em><b>Package Import</b></em>' containment reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2WithID.PackageImport}.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2WithID.PackageImport#getImportingNamespace <em>Importing Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package Import</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package Import</em>' containment reference list.
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getNamespace_PackageImport()
	 * @see org.csu.slicing.UML2WithID.PackageImport#getImportingNamespace
	 * @model opposite="importingNamespace" containment="true" ordered="false"
	 * @generated
	 */
	EList<PackageImport> getPackageImport();

} // Namespace

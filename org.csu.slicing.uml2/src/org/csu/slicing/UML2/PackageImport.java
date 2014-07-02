/**
 */
package org.csu.slicing.UML2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package Import</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2.PackageImport#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.PackageImport#getImportedPackage <em>Imported Package</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.PackageImport#getImportingNamespace <em>Importing Namespace</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2.UML2Package#getPackageImport()
 * @model
 * @generated
 */
public interface PackageImport extends DirectedRelationship {
	/**
	 * Returns the value of the '<em><b>Visibility</b></em>' attribute.
	 * The literals are from the enumeration {@link org.csu.slicing.UML2.VisibilityKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visibility</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibility</em>' attribute.
	 * @see org.csu.slicing.UML2.VisibilityKind
	 * @see #setVisibility(VisibilityKind)
	 * @see org.csu.slicing.UML2.UML2Package#getPackageImport_Visibility()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	VisibilityKind getVisibility();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2.PackageImport#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' attribute.
	 * @see org.csu.slicing.UML2.VisibilityKind
	 * @see #getVisibility()
	 * @generated
	 */
	void setVisibility(VisibilityKind value);

	/**
	 * Returns the value of the '<em><b>Imported Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imported Package</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imported Package</em>' reference.
	 * @see #setImportedPackage(org.csu.slicing.UML2.Package)
	 * @see org.csu.slicing.UML2.UML2Package#getPackageImport_ImportedPackage()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	org.csu.slicing.UML2.Package getImportedPackage();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2.PackageImport#getImportedPackage <em>Imported Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imported Package</em>' reference.
	 * @see #getImportedPackage()
	 * @generated
	 */
	void setImportedPackage(org.csu.slicing.UML2.Package value);

	/**
	 * Returns the value of the '<em><b>Importing Namespace</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2.Namespace#getPackageImport <em>Package Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Importing Namespace</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Importing Namespace</em>' container reference.
	 * @see #setImportingNamespace(Namespace)
	 * @see org.csu.slicing.UML2.UML2Package#getPackageImport_ImportingNamespace()
	 * @see org.csu.slicing.UML2.Namespace#getPackageImport
	 * @model opposite="packageImport" required="true" transient="false" ordered="false"
	 * @generated
	 */
	Namespace getImportingNamespace();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2.PackageImport#getImportingNamespace <em>Importing Namespace</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Importing Namespace</em>' container reference.
	 * @see #getImportingNamespace()
	 * @generated
	 */
	void setImportingNamespace(Namespace value);

} // PackageImport

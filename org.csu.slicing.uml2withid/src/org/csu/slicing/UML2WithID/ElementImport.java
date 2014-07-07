/**
 */
package org.csu.slicing.UML2WithID;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Import</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2WithID.ElementImport#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.ElementImport#getAlias <em>Alias</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.ElementImport#getImportedElement <em>Imported Element</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.ElementImport#getImportingNamespace <em>Importing Namespace</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getElementImport()
 * @model
 * @generated
 */
public interface ElementImport extends DirectedRelationship {
	/**
	 * Returns the value of the '<em><b>Visibility</b></em>' attribute.
	 * The literals are from the enumeration {@link org.csu.slicing.UML2WithID.VisibilityKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visibility</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibility</em>' attribute.
	 * @see org.csu.slicing.UML2WithID.VisibilityKind
	 * @see #setVisibility(VisibilityKind)
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getElementImport_Visibility()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	VisibilityKind getVisibility();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.ElementImport#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' attribute.
	 * @see org.csu.slicing.UML2WithID.VisibilityKind
	 * @see #getVisibility()
	 * @generated
	 */
	void setVisibility(VisibilityKind value);

	/**
	 * Returns the value of the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alias</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alias</em>' attribute.
	 * @see #setAlias(String)
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getElementImport_Alias()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getAlias();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.ElementImport#getAlias <em>Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alias</em>' attribute.
	 * @see #getAlias()
	 * @generated
	 */
	void setAlias(String value);

	/**
	 * Returns the value of the '<em><b>Imported Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imported Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imported Element</em>' reference.
	 * @see #setImportedElement(PackageableElement)
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getElementImport_ImportedElement()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	PackageableElement getImportedElement();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.ElementImport#getImportedElement <em>Imported Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imported Element</em>' reference.
	 * @see #getImportedElement()
	 * @generated
	 */
	void setImportedElement(PackageableElement value);

	/**
	 * Returns the value of the '<em><b>Importing Namespace</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2WithID.Namespace#getElementImport <em>Element Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Importing Namespace</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Importing Namespace</em>' container reference.
	 * @see #setImportingNamespace(Namespace)
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getElementImport_ImportingNamespace()
	 * @see org.csu.slicing.UML2WithID.Namespace#getElementImport
	 * @model opposite="elementImport" required="true" transient="false" ordered="false"
	 * @generated
	 */
	Namespace getImportingNamespace();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.ElementImport#getImportingNamespace <em>Importing Namespace</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Importing Namespace</em>' container reference.
	 * @see #getImportingNamespace()
	 * @generated
	 */
	void setImportingNamespace(Namespace value);

} // ElementImport

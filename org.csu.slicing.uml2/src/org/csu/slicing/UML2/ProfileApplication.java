/**
 */
package org.csu.slicing.UML2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Profile Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2.ProfileApplication#getImportedProfile <em>Imported Profile</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2.UML2Package#getProfileApplication()
 * @model
 * @generated
 */
public interface ProfileApplication extends PackageImport {
	/**
	 * Returns the value of the '<em><b>Imported Profile</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imported Profile</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imported Profile</em>' reference.
	 * @see #setImportedProfile(Profile)
	 * @see org.csu.slicing.UML2.UML2Package#getProfileApplication_ImportedProfile()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Profile getImportedProfile();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2.ProfileApplication#getImportedProfile <em>Imported Profile</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imported Profile</em>' reference.
	 * @see #getImportedProfile()
	 * @generated
	 */
	void setImportedProfile(Profile value);

} // ProfileApplication

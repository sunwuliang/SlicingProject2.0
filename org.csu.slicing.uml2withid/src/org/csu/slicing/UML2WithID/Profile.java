/**
 */
package org.csu.slicing.UML2WithID;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Profile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2WithID.Profile#getOwnedStereotype <em>Owned Stereotype</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.Profile#getMetaclassReference <em>Metaclass Reference</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.Profile#getMetamodelReference <em>Metamodel Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getProfile()
 * @model
 * @generated
 */
public interface Profile extends org.csu.slicing.UML2WithID.Package {
	/**
	 * Returns the value of the '<em><b>Owned Stereotype</b></em>' reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2WithID.Stereotype}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Stereotype</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Stereotype</em>' reference list.
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getProfile_OwnedStereotype()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Stereotype> getOwnedStereotype();

	/**
	 * Returns the value of the '<em><b>Metaclass Reference</b></em>' reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2WithID.ElementImport}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metaclass Reference</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metaclass Reference</em>' reference list.
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getProfile_MetaclassReference()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ElementImport> getMetaclassReference();

	/**
	 * Returns the value of the '<em><b>Metamodel Reference</b></em>' reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2WithID.PackageImport}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metamodel Reference</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metamodel Reference</em>' reference list.
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getProfile_MetamodelReference()
	 * @model ordered="false"
	 * @generated
	 */
	EList<PackageImport> getMetamodelReference();

} // Profile

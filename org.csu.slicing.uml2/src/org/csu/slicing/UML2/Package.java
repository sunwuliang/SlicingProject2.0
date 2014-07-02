/**
 */
package org.csu.slicing.UML2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2.Package#getNestedPackage <em>Nested Package</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.Package#getNestingPackage <em>Nesting Package</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.Package#getOwnedType <em>Owned Type</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.Package#getOwnedMember <em>Owned Member</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.Package#getPackageMerge <em>Package Merge</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.Package#getAppliedProfile <em>Applied Profile</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.Package#getPackageExtension <em>Package Extension</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2.UML2Package#getPackage()
 * @model
 * @generated
 */
public interface Package extends Namespace, PackageableElement {
	/**
	 * Returns the value of the '<em><b>Nested Package</b></em>' reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2.Package}.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2.Package#getNestingPackage <em>Nesting Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nested Package</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nested Package</em>' reference list.
	 * @see org.csu.slicing.UML2.UML2Package#getPackage_NestedPackage()
	 * @see org.csu.slicing.UML2.Package#getNestingPackage
	 * @model opposite="nestingPackage" ordered="false"
	 * @generated
	 */
	EList<Package> getNestedPackage();

	/**
	 * Returns the value of the '<em><b>Nesting Package</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2.Package#getNestedPackage <em>Nested Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nesting Package</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nesting Package</em>' reference.
	 * @see #setNestingPackage(Package)
	 * @see org.csu.slicing.UML2.UML2Package#getPackage_NestingPackage()
	 * @see org.csu.slicing.UML2.Package#getNestedPackage
	 * @model opposite="nestedPackage" ordered="false"
	 * @generated
	 */
	Package getNestingPackage();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2.Package#getNestingPackage <em>Nesting Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nesting Package</em>' reference.
	 * @see #getNestingPackage()
	 * @generated
	 */
	void setNestingPackage(Package value);

	/**
	 * Returns the value of the '<em><b>Owned Type</b></em>' reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2.Type}.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2.Type#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Type</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Type</em>' reference list.
	 * @see org.csu.slicing.UML2.UML2Package#getPackage_OwnedType()
	 * @see org.csu.slicing.UML2.Type#getPackage
	 * @model opposite="package" ordered="false"
	 * @generated
	 */
	EList<Type> getOwnedType();

	/**
	 * Returns the value of the '<em><b>Owned Member</b></em>' containment reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2.PackageableElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Member</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Member</em>' containment reference list.
	 * @see org.csu.slicing.UML2.UML2Package#getPackage_OwnedMember()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<PackageableElement> getOwnedMember();

	/**
	 * Returns the value of the '<em><b>Package Merge</b></em>' reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2.PackageMerge}.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2.PackageMerge#getMergingPackage <em>Merging Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package Merge</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package Merge</em>' reference list.
	 * @see org.csu.slicing.UML2.UML2Package#getPackage_PackageMerge()
	 * @see org.csu.slicing.UML2.PackageMerge#getMergingPackage
	 * @model opposite="mergingPackage" ordered="false"
	 * @generated
	 */
	EList<PackageMerge> getPackageMerge();

	/**
	 * Returns the value of the '<em><b>Applied Profile</b></em>' reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2.ProfileApplication}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applied Profile</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applied Profile</em>' reference list.
	 * @see org.csu.slicing.UML2.UML2Package#getPackage_AppliedProfile()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ProfileApplication> getAppliedProfile();

	/**
	 * Returns the value of the '<em><b>Package Extension</b></em>' containment reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2.PackageMerge}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package Extension</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package Extension</em>' containment reference list.
	 * @see org.csu.slicing.UML2.UML2Package#getPackage_PackageExtension()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<PackageMerge> getPackageExtension();

} // Package

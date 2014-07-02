/**
 */
package org.csu.slicing.UML2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package Merge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2.PackageMerge#getMergingPackage <em>Merging Package</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.PackageMerge#getMergedPackage <em>Merged Package</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2.UML2Package#getPackageMerge()
 * @model
 * @generated
 */
public interface PackageMerge extends DirectedRelationship {
	/**
	 * Returns the value of the '<em><b>Merging Package</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2.Package#getPackageMerge <em>Package Merge</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Merging Package</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Merging Package</em>' reference.
	 * @see #setMergingPackage(org.csu.slicing.UML2.Package)
	 * @see org.csu.slicing.UML2.UML2Package#getPackageMerge_MergingPackage()
	 * @see org.csu.slicing.UML2.Package#getPackageMerge
	 * @model opposite="packageMerge" required="true" ordered="false"
	 * @generated
	 */
	org.csu.slicing.UML2.Package getMergingPackage();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2.PackageMerge#getMergingPackage <em>Merging Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Merging Package</em>' reference.
	 * @see #getMergingPackage()
	 * @generated
	 */
	void setMergingPackage(org.csu.slicing.UML2.Package value);

	/**
	 * Returns the value of the '<em><b>Merged Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Merged Package</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Merged Package</em>' reference.
	 * @see #setMergedPackage(org.csu.slicing.UML2.Package)
	 * @see org.csu.slicing.UML2.UML2Package#getPackageMerge_MergedPackage()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	org.csu.slicing.UML2.Package getMergedPackage();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2.PackageMerge#getMergedPackage <em>Merged Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Merged Package</em>' reference.
	 * @see #getMergedPackage()
	 * @generated
	 */
	void setMergedPackage(org.csu.slicing.UML2.Package value);

} // PackageMerge

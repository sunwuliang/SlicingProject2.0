/**
 */
package org.csu.slicing.UML2WithID;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2WithID.Type#getPackage <em>Package</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getType()
 * @model abstract="true"
 * @generated
 */
public interface Type extends PackageableElement {
	/**
	 * Returns the value of the '<em><b>Package</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2WithID.Package#getOwnedType <em>Owned Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package</em>' reference.
	 * @see #setPackage(org.csu.slicing.UML2WithID.Package)
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getType_Package()
	 * @see org.csu.slicing.UML2WithID.Package#getOwnedType
	 * @model opposite="ownedType" ordered="false"
	 * @generated
	 */
	org.csu.slicing.UML2WithID.Package getPackage();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.Type#getPackage <em>Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package</em>' reference.
	 * @see #getPackage()
	 * @generated
	 */
	void setPackage(org.csu.slicing.UML2WithID.Package value);

} // Type

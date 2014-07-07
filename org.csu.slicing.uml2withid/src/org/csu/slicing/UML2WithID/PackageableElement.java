/**
 */
package org.csu.slicing.UML2WithID;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Packageable Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2WithID.PackageableElement#getPackageableElement_visibility <em>Packageable Element visibility</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getPackageableElement()
 * @model abstract="true"
 * @generated
 */
public interface PackageableElement extends NamedElement, ParameterableElement {
	/**
	 * Returns the value of the '<em><b>Packageable Element visibility</b></em>' attribute.
	 * The literals are from the enumeration {@link org.csu.slicing.UML2WithID.VisibilityKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Packageable Element visibility</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packageable Element visibility</em>' attribute.
	 * @see org.csu.slicing.UML2WithID.VisibilityKind
	 * @see #setPackageableElement_visibility(VisibilityKind)
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getPackageableElement_PackageableElement_visibility()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	VisibilityKind getPackageableElement_visibility();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.PackageableElement#getPackageableElement_visibility <em>Packageable Element visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Packageable Element visibility</em>' attribute.
	 * @see org.csu.slicing.UML2WithID.VisibilityKind
	 * @see #getPackageableElement_visibility()
	 * @generated
	 */
	void setPackageableElement_visibility(VisibilityKind value);

} // PackageableElement

/**
 */
package org.csu.slicing.UML2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structural Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2.StructuralFeature#isIsReadOnly <em>Is Read Only</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2.UML2Package#getStructuralFeature()
 * @model abstract="true"
 * @generated
 */
public interface StructuralFeature extends Feature, TypedElement, MultiplicityElement {
	/**
	 * Returns the value of the '<em><b>Is Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Read Only</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Read Only</em>' attribute.
	 * @see #setIsReadOnly(boolean)
	 * @see org.csu.slicing.UML2.UML2Package#getStructuralFeature_IsReadOnly()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	boolean isIsReadOnly();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2.StructuralFeature#isIsReadOnly <em>Is Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Read Only</em>' attribute.
	 * @see #isIsReadOnly()
	 * @generated
	 */
	void setIsReadOnly(boolean value);

} // StructuralFeature

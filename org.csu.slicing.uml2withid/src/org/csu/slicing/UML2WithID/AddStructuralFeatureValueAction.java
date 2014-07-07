/**
 */
package org.csu.slicing.UML2WithID;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Add Structural Feature Value Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2WithID.AddStructuralFeatureValueAction#isIsReplaceAll <em>Is Replace All</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.AddStructuralFeatureValueAction#getInsertAt <em>Insert At</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getAddStructuralFeatureValueAction()
 * @model
 * @generated
 */
public interface AddStructuralFeatureValueAction extends WriteStructuralFeatureAction {
	/**
	 * Returns the value of the '<em><b>Is Replace All</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Replace All</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Replace All</em>' attribute.
	 * @see #setIsReplaceAll(boolean)
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getAddStructuralFeatureValueAction_IsReplaceAll()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	boolean isIsReplaceAll();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.AddStructuralFeatureValueAction#isIsReplaceAll <em>Is Replace All</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Replace All</em>' attribute.
	 * @see #isIsReplaceAll()
	 * @generated
	 */
	void setIsReplaceAll(boolean value);

	/**
	 * Returns the value of the '<em><b>Insert At</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Insert At</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Insert At</em>' containment reference.
	 * @see #setInsertAt(InputPin)
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getAddStructuralFeatureValueAction_InsertAt()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	InputPin getInsertAt();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.AddStructuralFeatureValueAction#getInsertAt <em>Insert At</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Insert At</em>' containment reference.
	 * @see #getInsertAt()
	 * @generated
	 */
	void setInsertAt(InputPin value);

} // AddStructuralFeatureValueAction

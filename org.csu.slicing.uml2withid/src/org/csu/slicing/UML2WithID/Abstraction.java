/**
 */
package org.csu.slicing.UML2WithID;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstraction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2WithID.Abstraction#getMapping <em>Mapping</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getAbstraction()
 * @model
 * @generated
 */
public interface Abstraction extends Dependency {
	/**
	 * Returns the value of the '<em><b>Mapping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mapping</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapping</em>' containment reference.
	 * @see #setMapping(OpaqueExpression)
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getAbstraction_Mapping()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	OpaqueExpression getMapping();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.Abstraction#getMapping <em>Mapping</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapping</em>' containment reference.
	 * @see #getMapping()
	 * @generated
	 */
	void setMapping(OpaqueExpression value);

} // Abstraction

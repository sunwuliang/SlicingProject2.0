/**
 */
package org.csu.slicing.UML2WithID;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector End</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2WithID.ConnectorEnd#getDefiningEnd <em>Defining End</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.ConnectorEnd#getRole <em>Role</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.ConnectorEnd#getPartWithPort <em>Part With Port</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getConnectorEnd()
 * @model
 * @generated
 */
public interface ConnectorEnd extends MultiplicityElement {
	/**
	 * Returns the value of the '<em><b>Defining End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Defining End</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Defining End</em>' reference.
	 * @see #setDefiningEnd(Property)
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getConnectorEnd_DefiningEnd()
	 * @model ordered="false"
	 * @generated
	 */
	Property getDefiningEnd();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.ConnectorEnd#getDefiningEnd <em>Defining End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Defining End</em>' reference.
	 * @see #getDefiningEnd()
	 * @generated
	 */
	void setDefiningEnd(Property value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2WithID.ConnectableElement#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' reference.
	 * @see #setRole(ConnectableElement)
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getConnectorEnd_Role()
	 * @see org.csu.slicing.UML2WithID.ConnectableElement#getEnd
	 * @model opposite="end" ordered="false"
	 * @generated
	 */
	ConnectableElement getRole();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.ConnectorEnd#getRole <em>Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' reference.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(ConnectableElement value);

	/**
	 * Returns the value of the '<em><b>Part With Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Part With Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part With Port</em>' reference.
	 * @see #setPartWithPort(Property)
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getConnectorEnd_PartWithPort()
	 * @model ordered="false"
	 * @generated
	 */
	Property getPartWithPort();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.ConnectorEnd#getPartWithPort <em>Part With Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Part With Port</em>' reference.
	 * @see #getPartWithPort()
	 * @generated
	 */
	void setPartWithPort(Property value);

} // ConnectorEnd

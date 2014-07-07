/**
 */
package org.csu.slicing.UML2WithID;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2WithID.Connector#getType <em>Type</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.Connector#getRedefinedConnector <em>Redefined Connector</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.Connector#getEnd <em>End</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.Connector#getKind <em>Kind</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.Connector#getContract <em>Contract</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getConnector()
 * @model
 * @generated
 */
public interface Connector extends Feature {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Association)
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getConnector_Type()
	 * @model ordered="false"
	 * @generated
	 */
	Association getType();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.Connector#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Association value);

	/**
	 * Returns the value of the '<em><b>Redefined Connector</b></em>' reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2WithID.Connector}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Redefined Connector</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Redefined Connector</em>' reference list.
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getConnector_RedefinedConnector()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Connector> getRedefinedConnector();

	/**
	 * Returns the value of the '<em><b>End</b></em>' containment reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2WithID.ConnectorEnd}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' containment reference list.
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getConnector_End()
	 * @model containment="true" lower="2"
	 * @generated
	 */
	EList<ConnectorEnd> getEnd();

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.csu.slicing.UML2WithID.ConnectorKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see org.csu.slicing.UML2WithID.ConnectorKind
	 * @see #setKind(ConnectorKind)
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getConnector_Kind()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	ConnectorKind getKind();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.Connector#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see org.csu.slicing.UML2WithID.ConnectorKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(ConnectorKind value);

	/**
	 * Returns the value of the '<em><b>Contract</b></em>' reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2WithID.Behavior}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contract</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contract</em>' reference list.
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getConnector_Contract()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Behavior> getContract();

} // Connector

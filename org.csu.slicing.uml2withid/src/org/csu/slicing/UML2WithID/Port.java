/**
 */
package org.csu.slicing.UML2WithID;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2WithID.Port#isIsBehavior <em>Is Behavior</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.Port#isIsService <em>Is Service</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.Port#getRequired <em>Required</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.Port#getRedefinedPort <em>Redefined Port</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.Port#getProvided <em>Provided</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.Port#getProtocol <em>Protocol</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getPort()
 * @model
 * @generated
 */
public interface Port extends Property {
	/**
	 * Returns the value of the '<em><b>Is Behavior</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Behavior</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Behavior</em>' attribute.
	 * @see #setIsBehavior(boolean)
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getPort_IsBehavior()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	boolean isIsBehavior();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.Port#isIsBehavior <em>Is Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Behavior</em>' attribute.
	 * @see #isIsBehavior()
	 * @generated
	 */
	void setIsBehavior(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Service</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Service</em>' attribute.
	 * @see #setIsService(boolean)
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getPort_IsService()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	boolean isIsService();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.Port#isIsService <em>Is Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Service</em>' attribute.
	 * @see #isIsService()
	 * @generated
	 */
	void setIsService(boolean value);

	/**
	 * Returns the value of the '<em><b>Required</b></em>' reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2WithID.Interface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required</em>' reference list.
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getPort_Required()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Interface> getRequired();

	/**
	 * Returns the value of the '<em><b>Redefined Port</b></em>' reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2WithID.Port}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Redefined Port</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Redefined Port</em>' reference list.
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getPort_RedefinedPort()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Port> getRedefinedPort();

	/**
	 * Returns the value of the '<em><b>Provided</b></em>' reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2WithID.Interface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provided</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided</em>' reference list.
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getPort_Provided()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Interface> getProvided();

	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protocol</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocol</em>' reference.
	 * @see #setProtocol(ProtocolStateMachine)
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getPort_Protocol()
	 * @model ordered="false"
	 * @generated
	 */
	ProtocolStateMachine getProtocol();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.Port#getProtocol <em>Protocol</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol</em>' reference.
	 * @see #getProtocol()
	 * @generated
	 */
	void setProtocol(ProtocolStateMachine value);

} // Port

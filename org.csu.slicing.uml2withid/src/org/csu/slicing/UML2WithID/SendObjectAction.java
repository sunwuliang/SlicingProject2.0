/**
 */
package org.csu.slicing.UML2WithID;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Send Object Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2WithID.SendObjectAction#getTarget <em>Target</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.SendObjectAction#getRequest <em>Request</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getSendObjectAction()
 * @model
 * @generated
 */
public interface SendObjectAction extends InvocationAction {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' containment reference.
	 * @see #setTarget(InputPin)
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getSendObjectAction_Target()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	InputPin getTarget();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.SendObjectAction#getTarget <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' containment reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(InputPin value);

	/**
	 * Returns the value of the '<em><b>Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Request</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request</em>' containment reference.
	 * @see #setRequest(InputPin)
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getSendObjectAction_Request()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	InputPin getRequest();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.SendObjectAction#getRequest <em>Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request</em>' containment reference.
	 * @see #getRequest()
	 * @generated
	 */
	void setRequest(InputPin value);

} // SendObjectAction

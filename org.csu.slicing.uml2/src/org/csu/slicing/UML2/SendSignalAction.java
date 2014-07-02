/**
 */
package org.csu.slicing.UML2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Send Signal Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2.SendSignalAction#getTarget <em>Target</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.SendSignalAction#getSignal <em>Signal</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2.UML2Package#getSendSignalAction()
 * @model
 * @generated
 */
public interface SendSignalAction extends InvocationAction {
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
	 * @see org.csu.slicing.UML2.UML2Package#getSendSignalAction_Target()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	InputPin getTarget();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2.SendSignalAction#getTarget <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' containment reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(InputPin value);

	/**
	 * Returns the value of the '<em><b>Signal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signal</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signal</em>' reference.
	 * @see #setSignal(Signal)
	 * @see org.csu.slicing.UML2.UML2Package#getSendSignalAction_Signal()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Signal getSignal();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2.SendSignalAction#getSignal <em>Signal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signal</em>' reference.
	 * @see #getSignal()
	 * @generated
	 */
	void setSignal(Signal value);

} // SendSignalAction

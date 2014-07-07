/**
 */
package org.csu.slicing.UML2WithID;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call Behavior Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2WithID.CallBehaviorAction#getBehavior <em>Behavior</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getCallBehaviorAction()
 * @model
 * @generated
 */
public interface CallBehaviorAction extends CallAction {
	/**
	 * Returns the value of the '<em><b>Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Behavior</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behavior</em>' reference.
	 * @see #setBehavior(Behavior)
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getCallBehaviorAction_Behavior()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Behavior getBehavior();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.CallBehaviorAction#getBehavior <em>Behavior</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Behavior</em>' reference.
	 * @see #getBehavior()
	 * @generated
	 */
	void setBehavior(Behavior value);

} // CallBehaviorAction

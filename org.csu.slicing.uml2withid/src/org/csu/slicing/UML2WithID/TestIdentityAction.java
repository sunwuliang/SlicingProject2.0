/**
 */
package org.csu.slicing.UML2WithID;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Identity Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2WithID.TestIdentityAction#getFirst <em>First</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.TestIdentityAction#getSecond <em>Second</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.TestIdentityAction#getResult <em>Result</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getTestIdentityAction()
 * @model
 * @generated
 */
public interface TestIdentityAction extends Action {
	/**
	 * Returns the value of the '<em><b>First</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First</em>' containment reference.
	 * @see #setFirst(InputPin)
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getTestIdentityAction_First()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	InputPin getFirst();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.TestIdentityAction#getFirst <em>First</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First</em>' containment reference.
	 * @see #getFirst()
	 * @generated
	 */
	void setFirst(InputPin value);

	/**
	 * Returns the value of the '<em><b>Second</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Second</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Second</em>' containment reference.
	 * @see #setSecond(InputPin)
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getTestIdentityAction_Second()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	InputPin getSecond();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.TestIdentityAction#getSecond <em>Second</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Second</em>' containment reference.
	 * @see #getSecond()
	 * @generated
	 */
	void setSecond(InputPin value);

	/**
	 * Returns the value of the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result</em>' containment reference.
	 * @see #setResult(OutputPin)
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getTestIdentityAction_Result()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	OutputPin getResult();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.TestIdentityAction#getResult <em>Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' containment reference.
	 * @see #getResult()
	 * @generated
	 */
	void setResult(OutputPin value);

} // TestIdentityAction

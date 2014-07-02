/**
 */
package org.csu.slicing.UML2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Destroy Object Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2.DestroyObjectAction#isIsDestroyLinks <em>Is Destroy Links</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.DestroyObjectAction#isIsDestroyOwnedObjects <em>Is Destroy Owned Objects</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.DestroyObjectAction#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2.UML2Package#getDestroyObjectAction()
 * @model
 * @generated
 */
public interface DestroyObjectAction extends Action {
	/**
	 * Returns the value of the '<em><b>Is Destroy Links</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Destroy Links</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Destroy Links</em>' attribute.
	 * @see #setIsDestroyLinks(boolean)
	 * @see org.csu.slicing.UML2.UML2Package#getDestroyObjectAction_IsDestroyLinks()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	boolean isIsDestroyLinks();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2.DestroyObjectAction#isIsDestroyLinks <em>Is Destroy Links</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Destroy Links</em>' attribute.
	 * @see #isIsDestroyLinks()
	 * @generated
	 */
	void setIsDestroyLinks(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Destroy Owned Objects</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Destroy Owned Objects</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Destroy Owned Objects</em>' attribute.
	 * @see #setIsDestroyOwnedObjects(boolean)
	 * @see org.csu.slicing.UML2.UML2Package#getDestroyObjectAction_IsDestroyOwnedObjects()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	boolean isIsDestroyOwnedObjects();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2.DestroyObjectAction#isIsDestroyOwnedObjects <em>Is Destroy Owned Objects</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Destroy Owned Objects</em>' attribute.
	 * @see #isIsDestroyOwnedObjects()
	 * @generated
	 */
	void setIsDestroyOwnedObjects(boolean value);

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
	 * @see org.csu.slicing.UML2.UML2Package#getDestroyObjectAction_Target()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	InputPin getTarget();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2.DestroyObjectAction#getTarget <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' containment reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(InputPin value);

} // DestroyObjectAction

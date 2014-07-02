/**
 */
package org.csu.slicing.UML2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Read Is Classified Object Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2.ReadIsClassifiedObjectAction#isIsDirect <em>Is Direct</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.ReadIsClassifiedObjectAction#getClassifier <em>Classifier</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.ReadIsClassifiedObjectAction#getResult <em>Result</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.ReadIsClassifiedObjectAction#getObject <em>Object</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2.UML2Package#getReadIsClassifiedObjectAction()
 * @model
 * @generated
 */
public interface ReadIsClassifiedObjectAction extends Action {
	/**
	 * Returns the value of the '<em><b>Is Direct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Direct</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Direct</em>' attribute.
	 * @see #setIsDirect(boolean)
	 * @see org.csu.slicing.UML2.UML2Package#getReadIsClassifiedObjectAction_IsDirect()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	boolean isIsDirect();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2.ReadIsClassifiedObjectAction#isIsDirect <em>Is Direct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Direct</em>' attribute.
	 * @see #isIsDirect()
	 * @generated
	 */
	void setIsDirect(boolean value);

	/**
	 * Returns the value of the '<em><b>Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classifier</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classifier</em>' reference.
	 * @see #setClassifier(Classifier)
	 * @see org.csu.slicing.UML2.UML2Package#getReadIsClassifiedObjectAction_Classifier()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Classifier getClassifier();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2.ReadIsClassifiedObjectAction#getClassifier <em>Classifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classifier</em>' reference.
	 * @see #getClassifier()
	 * @generated
	 */
	void setClassifier(Classifier value);

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
	 * @see org.csu.slicing.UML2.UML2Package#getReadIsClassifiedObjectAction_Result()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	OutputPin getResult();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2.ReadIsClassifiedObjectAction#getResult <em>Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' containment reference.
	 * @see #getResult()
	 * @generated
	 */
	void setResult(OutputPin value);

	/**
	 * Returns the value of the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object</em>' containment reference.
	 * @see #setObject(InputPin)
	 * @see org.csu.slicing.UML2.UML2Package#getReadIsClassifiedObjectAction_Object()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	InputPin getObject();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2.ReadIsClassifiedObjectAction#getObject <em>Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object</em>' containment reference.
	 * @see #getObject()
	 * @generated
	 */
	void setObject(InputPin value);

} // ReadIsClassifiedObjectAction

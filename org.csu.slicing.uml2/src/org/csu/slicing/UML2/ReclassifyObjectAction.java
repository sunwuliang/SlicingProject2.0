/**
 */
package org.csu.slicing.UML2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reclassify Object Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2.ReclassifyObjectAction#isIsReplaceAll <em>Is Replace All</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.ReclassifyObjectAction#getOldClassifier <em>Old Classifier</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.ReclassifyObjectAction#getNewClassifier <em>New Classifier</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.ReclassifyObjectAction#getObject <em>Object</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2.UML2Package#getReclassifyObjectAction()
 * @model
 * @generated
 */
public interface ReclassifyObjectAction extends Action {
	/**
	 * Returns the value of the '<em><b>Is Replace All</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Replace All</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Replace All</em>' attribute.
	 * @see #setIsReplaceAll(boolean)
	 * @see org.csu.slicing.UML2.UML2Package#getReclassifyObjectAction_IsReplaceAll()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	boolean isIsReplaceAll();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2.ReclassifyObjectAction#isIsReplaceAll <em>Is Replace All</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Replace All</em>' attribute.
	 * @see #isIsReplaceAll()
	 * @generated
	 */
	void setIsReplaceAll(boolean value);

	/**
	 * Returns the value of the '<em><b>Old Classifier</b></em>' reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2.Classifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Old Classifier</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Old Classifier</em>' reference list.
	 * @see org.csu.slicing.UML2.UML2Package#getReclassifyObjectAction_OldClassifier()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Classifier> getOldClassifier();

	/**
	 * Returns the value of the '<em><b>New Classifier</b></em>' reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2.Classifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New Classifier</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Classifier</em>' reference list.
	 * @see org.csu.slicing.UML2.UML2Package#getReclassifyObjectAction_NewClassifier()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Classifier> getNewClassifier();

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
	 * @see org.csu.slicing.UML2.UML2Package#getReclassifyObjectAction_Object()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	InputPin getObject();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2.ReclassifyObjectAction#getObject <em>Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object</em>' containment reference.
	 * @see #getObject()
	 * @generated
	 */
	void setObject(InputPin value);

} // ReclassifyObjectAction

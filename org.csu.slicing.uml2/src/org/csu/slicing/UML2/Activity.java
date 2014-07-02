/**
 */
package org.csu.slicing.UML2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2.Activity#getBody <em>Body</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.Activity#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.Activity#getEdge <em>Edge</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.Activity#getGroup <em>Group</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.Activity#getNode <em>Node</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.Activity#getAction <em>Action</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.Activity#getStructuredNode <em>Structured Node</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.Activity#isIsSingleExecution <em>Is Single Execution</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.Activity#isIsReadOnly <em>Is Read Only</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2.UML2Package#getActivity()
 * @model
 * @generated
 */
public interface Activity extends Behavior {
	/**
	 * Returns the value of the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' attribute.
	 * @see #setBody(String)
	 * @see org.csu.slicing.UML2.UML2Package#getActivity_Body()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getBody();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2.Activity#getBody <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' attribute.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(String value);

	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see #setLanguage(String)
	 * @see org.csu.slicing.UML2.UML2Package#getActivity_Language()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getLanguage();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2.Activity#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(String value);

	/**
	 * Returns the value of the '<em><b>Edge</b></em>' containment reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2.ActivityEdge}.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2.ActivityEdge#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edge</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edge</em>' containment reference list.
	 * @see org.csu.slicing.UML2.UML2Package#getActivity_Edge()
	 * @see org.csu.slicing.UML2.ActivityEdge#getActivity
	 * @model opposite="activity" containment="true" ordered="false"
	 * @generated
	 */
	EList<ActivityEdge> getEdge();

	/**
	 * Returns the value of the '<em><b>Group</b></em>' containment reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2.ActivityGroup}.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2.ActivityGroup#getActivityGroup_activity <em>Activity Group activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' containment reference list.
	 * @see org.csu.slicing.UML2.UML2Package#getActivity_Group()
	 * @see org.csu.slicing.UML2.ActivityGroup#getActivityGroup_activity
	 * @model opposite="activityGroup_activity" containment="true" ordered="false"
	 * @generated
	 */
	EList<ActivityGroup> getGroup();

	/**
	 * Returns the value of the '<em><b>Node</b></em>' containment reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2.ActivityNode}.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2.ActivityNode#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node</em>' containment reference list.
	 * @see org.csu.slicing.UML2.UML2Package#getActivity_Node()
	 * @see org.csu.slicing.UML2.ActivityNode#getActivity
	 * @model opposite="activity" containment="true" ordered="false"
	 * @generated
	 */
	EList<ActivityNode> getNode();

	/**
	 * Returns the value of the '<em><b>Action</b></em>' reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2.Action}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' reference list.
	 * @see org.csu.slicing.UML2.UML2Package#getActivity_Action()
	 * @model
	 * @generated
	 */
	EList<Action> getAction();

	/**
	 * Returns the value of the '<em><b>Structured Node</b></em>' reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2.StructuredActivityNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Structured Node</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structured Node</em>' reference list.
	 * @see org.csu.slicing.UML2.UML2Package#getActivity_StructuredNode()
	 * @model ordered="false"
	 * @generated
	 */
	EList<StructuredActivityNode> getStructuredNode();

	/**
	 * Returns the value of the '<em><b>Is Single Execution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Single Execution</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Single Execution</em>' attribute.
	 * @see #setIsSingleExecution(boolean)
	 * @see org.csu.slicing.UML2.UML2Package#getActivity_IsSingleExecution()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	boolean isIsSingleExecution();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2.Activity#isIsSingleExecution <em>Is Single Execution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Single Execution</em>' attribute.
	 * @see #isIsSingleExecution()
	 * @generated
	 */
	void setIsSingleExecution(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Read Only</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Read Only</em>' attribute.
	 * @see #setIsReadOnly(boolean)
	 * @see org.csu.slicing.UML2.UML2Package#getActivity_IsReadOnly()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	boolean isIsReadOnly();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2.Activity#isIsReadOnly <em>Is Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Read Only</em>' attribute.
	 * @see #isIsReadOnly()
	 * @generated
	 */
	void setIsReadOnly(boolean value);

} // Activity

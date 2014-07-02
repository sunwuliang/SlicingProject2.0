/**
 */
package org.csu.slicing.UML2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2.ActivityGroup#getSuperGroup <em>Super Group</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.ActivityGroup#getActivityGroup_activity <em>Activity Group activity</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2.UML2Package#getActivityGroup()
 * @model abstract="true"
 * @generated
 */
public interface ActivityGroup extends Element {
	/**
	 * Returns the value of the '<em><b>Super Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Group</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Group</em>' reference.
	 * @see #setSuperGroup(ActivityGroup)
	 * @see org.csu.slicing.UML2.UML2Package#getActivityGroup_SuperGroup()
	 * @model ordered="false"
	 * @generated
	 */
	ActivityGroup getSuperGroup();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2.ActivityGroup#getSuperGroup <em>Super Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super Group</em>' reference.
	 * @see #getSuperGroup()
	 * @generated
	 */
	void setSuperGroup(ActivityGroup value);

	/**
	 * Returns the value of the '<em><b>Activity Group activity</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2.Activity#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity Group activity</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity Group activity</em>' container reference.
	 * @see #setActivityGroup_activity(Activity)
	 * @see org.csu.slicing.UML2.UML2Package#getActivityGroup_ActivityGroup_activity()
	 * @see org.csu.slicing.UML2.Activity#getGroup
	 * @model opposite="group" transient="false" ordered="false"
	 * @generated
	 */
	Activity getActivityGroup_activity();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2.ActivityGroup#getActivityGroup_activity <em>Activity Group activity</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity Group activity</em>' container reference.
	 * @see #getActivityGroup_activity()
	 * @generated
	 */
	void setActivityGroup_activity(Activity value);

} // ActivityGroup

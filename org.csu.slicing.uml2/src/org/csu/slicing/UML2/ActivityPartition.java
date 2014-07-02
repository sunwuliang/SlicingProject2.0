/**
 */
package org.csu.slicing.UML2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Partition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2.ActivityPartition#isIsDimension <em>Is Dimension</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.ActivityPartition#isIsExternal <em>Is External</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.ActivityPartition#getContainedEdge <em>Contained Edge</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.ActivityPartition#getContainedNode <em>Contained Node</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.ActivityPartition#getSubgroup <em>Subgroup</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.ActivityPartition#getSuperPartition <em>Super Partition</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.ActivityPartition#getRepresents <em>Represents</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2.UML2Package#getActivityPartition()
 * @model
 * @generated
 */
public interface ActivityPartition extends NamedElement, ActivityGroup {
	/**
	 * Returns the value of the '<em><b>Is Dimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Dimension</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Dimension</em>' attribute.
	 * @see #setIsDimension(boolean)
	 * @see org.csu.slicing.UML2.UML2Package#getActivityPartition_IsDimension()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	boolean isIsDimension();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2.ActivityPartition#isIsDimension <em>Is Dimension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Dimension</em>' attribute.
	 * @see #isIsDimension()
	 * @generated
	 */
	void setIsDimension(boolean value);

	/**
	 * Returns the value of the '<em><b>Is External</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is External</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is External</em>' attribute.
	 * @see #setIsExternal(boolean)
	 * @see org.csu.slicing.UML2.UML2Package#getActivityPartition_IsExternal()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	boolean isIsExternal();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2.ActivityPartition#isIsExternal <em>Is External</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is External</em>' attribute.
	 * @see #isIsExternal()
	 * @generated
	 */
	void setIsExternal(boolean value);

	/**
	 * Returns the value of the '<em><b>Contained Edge</b></em>' reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2.ActivityEdge}.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2.ActivityEdge#getInPartition <em>In Partition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained Edge</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Edge</em>' reference list.
	 * @see org.csu.slicing.UML2.UML2Package#getActivityPartition_ContainedEdge()
	 * @see org.csu.slicing.UML2.ActivityEdge#getInPartition
	 * @model opposite="inPartition"
	 * @generated
	 */
	EList<ActivityEdge> getContainedEdge();

	/**
	 * Returns the value of the '<em><b>Contained Node</b></em>' reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2.ActivityNode}.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2.ActivityNode#getInPartition <em>In Partition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained Node</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Node</em>' reference list.
	 * @see org.csu.slicing.UML2.UML2Package#getActivityPartition_ContainedNode()
	 * @see org.csu.slicing.UML2.ActivityNode#getInPartition
	 * @model opposite="inPartition"
	 * @generated
	 */
	EList<ActivityNode> getContainedNode();

	/**
	 * Returns the value of the '<em><b>Subgroup</b></em>' containment reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2.ActivityPartition}.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2.ActivityPartition#getSuperPartition <em>Super Partition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subgroup</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subgroup</em>' containment reference list.
	 * @see org.csu.slicing.UML2.UML2Package#getActivityPartition_Subgroup()
	 * @see org.csu.slicing.UML2.ActivityPartition#getSuperPartition
	 * @model opposite="superPartition" containment="true" ordered="false"
	 * @generated
	 */
	EList<ActivityPartition> getSubgroup();

	/**
	 * Returns the value of the '<em><b>Super Partition</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2.ActivityPartition#getSubgroup <em>Subgroup</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Partition</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Partition</em>' container reference.
	 * @see #setSuperPartition(ActivityPartition)
	 * @see org.csu.slicing.UML2.UML2Package#getActivityPartition_SuperPartition()
	 * @see org.csu.slicing.UML2.ActivityPartition#getSubgroup
	 * @model opposite="subgroup" transient="false" ordered="false"
	 * @generated
	 */
	ActivityPartition getSuperPartition();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2.ActivityPartition#getSuperPartition <em>Super Partition</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super Partition</em>' container reference.
	 * @see #getSuperPartition()
	 * @generated
	 */
	void setSuperPartition(ActivityPartition value);

	/**
	 * Returns the value of the '<em><b>Represents</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Represents</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Represents</em>' reference.
	 * @see #setRepresents(Element)
	 * @see org.csu.slicing.UML2.UML2Package#getActivityPartition_Represents()
	 * @model ordered="false"
	 * @generated
	 */
	Element getRepresents();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2.ActivityPartition#getRepresents <em>Represents</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Represents</em>' reference.
	 * @see #getRepresents()
	 * @generated
	 */
	void setRepresents(Element value);

} // ActivityPartition

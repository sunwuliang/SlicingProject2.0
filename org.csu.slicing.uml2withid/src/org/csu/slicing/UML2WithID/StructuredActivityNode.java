/**
 */
package org.csu.slicing.UML2WithID;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structured Activity Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2WithID.StructuredActivityNode#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.StructuredActivityNode#getContainedNode <em>Contained Node</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.StructuredActivityNode#getContainedEdge <em>Contained Edge</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.StructuredActivityNode#isMustIsolate <em>Must Isolate</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getStructuredActivityNode()
 * @model
 * @generated
 */
public interface StructuredActivityNode extends Action, Namespace, ActivityGroup {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' containment reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2WithID.Variable}.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2WithID.Variable#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' containment reference list.
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getStructuredActivityNode_Variable()
	 * @see org.csu.slicing.UML2WithID.Variable#getScope
	 * @model opposite="scope" containment="true" ordered="false"
	 * @generated
	 */
	EList<Variable> getVariable();

	/**
	 * Returns the value of the '<em><b>Contained Node</b></em>' containment reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2WithID.ActivityNode}.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2WithID.ActivityNode#getInStructuredNode <em>In Structured Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained Node</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Node</em>' containment reference list.
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getStructuredActivityNode_ContainedNode()
	 * @see org.csu.slicing.UML2WithID.ActivityNode#getInStructuredNode
	 * @model opposite="inStructuredNode" containment="true"
	 * @generated
	 */
	EList<ActivityNode> getContainedNode();

	/**
	 * Returns the value of the '<em><b>Contained Edge</b></em>' containment reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2WithID.ActivityEdge}.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2WithID.ActivityEdge#getInStructuredNode <em>In Structured Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained Edge</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Edge</em>' containment reference list.
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getStructuredActivityNode_ContainedEdge()
	 * @see org.csu.slicing.UML2WithID.ActivityEdge#getInStructuredNode
	 * @model opposite="inStructuredNode" containment="true"
	 * @generated
	 */
	EList<ActivityEdge> getContainedEdge();

	/**
	 * Returns the value of the '<em><b>Must Isolate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Must Isolate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Must Isolate</em>' attribute.
	 * @see #setMustIsolate(boolean)
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getStructuredActivityNode_MustIsolate()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	boolean isMustIsolate();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.StructuredActivityNode#isMustIsolate <em>Must Isolate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Must Isolate</em>' attribute.
	 * @see #isMustIsolate()
	 * @generated
	 */
	void setMustIsolate(boolean value);

} // StructuredActivityNode

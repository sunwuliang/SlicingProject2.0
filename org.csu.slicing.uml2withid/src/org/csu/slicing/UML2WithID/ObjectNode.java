/**
 */
package org.csu.slicing.UML2WithID;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2WithID.ObjectNode#getOrdering <em>Ordering</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.ObjectNode#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.ObjectNode#getInState <em>In State</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.ObjectNode#getSelection <em>Selection</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getObjectNode()
 * @model abstract="true"
 * @generated
 */
public interface ObjectNode extends ActivityNode, TypedElement {
	/**
	 * Returns the value of the '<em><b>Ordering</b></em>' attribute.
	 * The literals are from the enumeration {@link org.csu.slicing.UML2WithID.ObjectNodeOrderingKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ordering</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ordering</em>' attribute.
	 * @see org.csu.slicing.UML2WithID.ObjectNodeOrderingKind
	 * @see #setOrdering(ObjectNodeOrderingKind)
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getObjectNode_Ordering()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	ObjectNodeOrderingKind getOrdering();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.ObjectNode#getOrdering <em>Ordering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ordering</em>' attribute.
	 * @see org.csu.slicing.UML2WithID.ObjectNodeOrderingKind
	 * @see #getOrdering()
	 * @generated
	 */
	void setOrdering(ObjectNodeOrderingKind value);

	/**
	 * Returns the value of the '<em><b>Upper Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper Bound</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Bound</em>' containment reference.
	 * @see #setUpperBound(ValueSpecification)
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getObjectNode_UpperBound()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	ValueSpecification getUpperBound();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.ObjectNode#getUpperBound <em>Upper Bound</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Bound</em>' containment reference.
	 * @see #getUpperBound()
	 * @generated
	 */
	void setUpperBound(ValueSpecification value);

	/**
	 * Returns the value of the '<em><b>In State</b></em>' reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2WithID.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In State</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In State</em>' reference list.
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getObjectNode_InState()
	 * @model ordered="false"
	 * @generated
	 */
	EList<State> getInState();

	/**
	 * Returns the value of the '<em><b>Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selection</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selection</em>' reference.
	 * @see #setSelection(Behavior)
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getObjectNode_Selection()
	 * @model ordered="false"
	 * @generated
	 */
	Behavior getSelection();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.ObjectNode#getSelection <em>Selection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selection</em>' reference.
	 * @see #getSelection()
	 * @generated
	 */
	void setSelection(Behavior value);

} // ObjectNode

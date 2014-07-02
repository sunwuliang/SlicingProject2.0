/**
 */
package org.csu.slicing.UML2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2.Node#getNestedNode <em>Nested Node</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2.UML2Package#getNode()
 * @model
 * @generated
 */
public interface Node extends org.csu.slicing.UML2.Class, DeploymentTarget {
	/**
	 * Returns the value of the '<em><b>Nested Node</b></em>' containment reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nested Node</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nested Node</em>' containment reference list.
	 * @see org.csu.slicing.UML2.UML2Package#getNode_NestedNode()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Node> getNestedNode();

} // Node

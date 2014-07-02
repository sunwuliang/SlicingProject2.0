/**
 */
package org.csu.slicing.UML2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Executable Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2.ExecutableNode#getHandler <em>Handler</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2.UML2Package#getExecutableNode()
 * @model abstract="true"
 * @generated
 */
public interface ExecutableNode extends ActivityNode {
	/**
	 * Returns the value of the '<em><b>Handler</b></em>' containment reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2.ExceptionHandler}.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2.ExceptionHandler#getProtectedNode <em>Protected Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Handler</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Handler</em>' containment reference list.
	 * @see org.csu.slicing.UML2.UML2Package#getExecutableNode_Handler()
	 * @see org.csu.slicing.UML2.ExceptionHandler#getProtectedNode
	 * @model opposite="protectedNode" containment="true" ordered="false"
	 * @generated
	 */
	EList<ExceptionHandler> getHandler();

} // ExecutableNode

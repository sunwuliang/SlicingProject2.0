/**
 */
package org.csu.slicing.UML2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Invocation Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2.InvocationAction#getArgument <em>Argument</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.InvocationAction#getOnPort <em>On Port</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2.UML2Package#getInvocationAction()
 * @model abstract="true"
 * @generated
 */
public interface InvocationAction extends Action {
	/**
	 * Returns the value of the '<em><b>Argument</b></em>' containment reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2.InputPin}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Argument</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument</em>' containment reference list.
	 * @see org.csu.slicing.UML2.UML2Package#getInvocationAction_Argument()
	 * @model containment="true"
	 * @generated
	 */
	EList<InputPin> getArgument();

	/**
	 * Returns the value of the '<em><b>On Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Port</em>' reference.
	 * @see #setOnPort(Port)
	 * @see org.csu.slicing.UML2.UML2Package#getInvocationAction_OnPort()
	 * @model ordered="false"
	 * @generated
	 */
	Port getOnPort();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2.InvocationAction#getOnPort <em>On Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Port</em>' reference.
	 * @see #getOnPort()
	 * @generated
	 */
	void setOnPort(Port value);

} // InvocationAction

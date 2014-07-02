/**
 */
package org.csu.slicing.UML2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connectable Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2.ConnectableElement#getEnd <em>End</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2.UML2Package#getConnectableElement()
 * @model abstract="true"
 * @generated
 */
public interface ConnectableElement extends NamedElement, ParameterableElement {
	/**
	 * Returns the value of the '<em><b>End</b></em>' reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2.ConnectorEnd}.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2.ConnectorEnd#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' reference list.
	 * @see org.csu.slicing.UML2.UML2Package#getConnectableElement_End()
	 * @see org.csu.slicing.UML2.ConnectorEnd#getRole
	 * @model opposite="role" ordered="false"
	 * @generated
	 */
	EList<ConnectorEnd> getEnd();

} // ConnectableElement

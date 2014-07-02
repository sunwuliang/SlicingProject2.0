/**
 */
package org.csu.slicing.UML2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vertex</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2.Vertex#getContainer <em>Container</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.Vertex#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.Vertex#getIncoming <em>Incoming</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2.UML2Package#getVertex()
 * @model abstract="true"
 * @generated
 */
public interface Vertex extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Container</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2.Region#getSubvertex <em>Subvertex</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' container reference.
	 * @see #setContainer(Region)
	 * @see org.csu.slicing.UML2.UML2Package#getVertex_Container()
	 * @see org.csu.slicing.UML2.Region#getSubvertex
	 * @model opposite="subvertex" transient="false" ordered="false"
	 * @generated
	 */
	Region getContainer();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2.Vertex#getContainer <em>Container</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' container reference.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(Region value);

	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2.Transition}.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference list.
	 * @see org.csu.slicing.UML2.UML2Package#getVertex_Outgoing()
	 * @see org.csu.slicing.UML2.Transition#getSource
	 * @model opposite="source" ordered="false"
	 * @generated
	 */
	EList<Transition> getOutgoing();

	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2.Transition}.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' reference list.
	 * @see org.csu.slicing.UML2.UML2Package#getVertex_Incoming()
	 * @see org.csu.slicing.UML2.Transition#getTarget
	 * @model opposite="target" ordered="false"
	 * @generated
	 */
	EList<Transition> getIncoming();

} // Vertex

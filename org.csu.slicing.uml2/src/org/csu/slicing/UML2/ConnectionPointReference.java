/**
 */
package org.csu.slicing.UML2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection Point Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2.ConnectionPointReference#getEntry <em>Entry</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.ConnectionPointReference#getExit <em>Exit</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2.UML2Package#getConnectionPointReference()
 * @model
 * @generated
 */
public interface ConnectionPointReference extends Vertex {
	/**
	 * Returns the value of the '<em><b>Entry</b></em>' reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2.Pseudostate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entry</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry</em>' reference list.
	 * @see org.csu.slicing.UML2.UML2Package#getConnectionPointReference_Entry()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Pseudostate> getEntry();

	/**
	 * Returns the value of the '<em><b>Exit</b></em>' reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2.Pseudostate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exit</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exit</em>' reference list.
	 * @see org.csu.slicing.UML2.UML2Package#getConnectionPointReference_Exit()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Pseudostate> getExit();

} // ConnectionPointReference

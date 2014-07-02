/**
 */
package org.csu.slicing.UML2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Redefinable Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2.RedefinableElement#getRedefinitionContext <em>Redefinition Context</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.RedefinableElement#isIsLeaf <em>Is Leaf</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2.UML2Package#getRedefinableElement()
 * @model abstract="true"
 * @generated
 */
public interface RedefinableElement extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Redefinition Context</b></em>' reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2.Classifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Redefinition Context</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Redefinition Context</em>' reference list.
	 * @see org.csu.slicing.UML2.UML2Package#getRedefinableElement_RedefinitionContext()
	 * @model
	 * @generated
	 */
	EList<Classifier> getRedefinitionContext();

	/**
	 * Returns the value of the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Leaf</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Leaf</em>' attribute.
	 * @see #setIsLeaf(boolean)
	 * @see org.csu.slicing.UML2.UML2Package#getRedefinableElement_IsLeaf()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	boolean isIsLeaf();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2.RedefinableElement#isIsLeaf <em>Is Leaf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Leaf</em>' attribute.
	 * @see #isIsLeaf()
	 * @generated
	 */
	void setIsLeaf(boolean value);

} // RedefinableElement

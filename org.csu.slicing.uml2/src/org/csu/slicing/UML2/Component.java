/**
 */
package org.csu.slicing.UML2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2.Component#isIsIndirectlyInstantiated <em>Is Indirectly Instantiated</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.Component#getRequired <em>Required</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.Component#getProvided <em>Provided</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.Component#getRealization <em>Realization</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.Component#getOwnedMember <em>Owned Member</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2.UML2Package#getComponent()
 * @model
 * @generated
 */
public interface Component extends org.csu.slicing.UML2.Class {
	/**
	 * Returns the value of the '<em><b>Is Indirectly Instantiated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Indirectly Instantiated</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Indirectly Instantiated</em>' attribute.
	 * @see #setIsIndirectlyInstantiated(boolean)
	 * @see org.csu.slicing.UML2.UML2Package#getComponent_IsIndirectlyInstantiated()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	boolean isIsIndirectlyInstantiated();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2.Component#isIsIndirectlyInstantiated <em>Is Indirectly Instantiated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Indirectly Instantiated</em>' attribute.
	 * @see #isIsIndirectlyInstantiated()
	 * @generated
	 */
	void setIsIndirectlyInstantiated(boolean value);

	/**
	 * Returns the value of the '<em><b>Required</b></em>' reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2.Interface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required</em>' reference list.
	 * @see org.csu.slicing.UML2.UML2Package#getComponent_Required()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Interface> getRequired();

	/**
	 * Returns the value of the '<em><b>Provided</b></em>' reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2.Interface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provided</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided</em>' reference list.
	 * @see org.csu.slicing.UML2.UML2Package#getComponent_Provided()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Interface> getProvided();

	/**
	 * Returns the value of the '<em><b>Realization</b></em>' containment reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2.Realization}.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2.Realization#getAbstraction <em>Abstraction</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realization</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realization</em>' containment reference list.
	 * @see org.csu.slicing.UML2.UML2Package#getComponent_Realization()
	 * @see org.csu.slicing.UML2.Realization#getAbstraction
	 * @model opposite="abstraction" containment="true" ordered="false"
	 * @generated
	 */
	EList<Realization> getRealization();

	/**
	 * Returns the value of the '<em><b>Owned Member</b></em>' containment reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2.PackageableElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Member</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Member</em>' containment reference list.
	 * @see org.csu.slicing.UML2.UML2Package#getComponent_OwnedMember()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<PackageableElement> getOwnedMember();

} // Component

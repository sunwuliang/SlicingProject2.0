/**
 */
package org.csu.slicing.UML2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2.Class#getOwnedOperation <em>Owned Operation</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.Class#getSuperClass <em>Super Class</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.Class#getExtension <em>Extension</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.Class#getNestedClassifier <em>Nested Classifier</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.Class#isIsActive <em>Is Active</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.Class#getOwnedReception <em>Owned Reception</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2.UML2Package#getClass_()
 * @model
 * @generated
 */
public interface Class extends BehavioredClassifier, EncapsulatedClassifier {
	/**
	 * Returns the value of the '<em><b>Owned Operation</b></em>' containment reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2.Operation}.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2.Operation#getClass_ <em>Class </em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Operation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Operation</em>' containment reference list.
	 * @see org.csu.slicing.UML2.UML2Package#getClass_OwnedOperation()
	 * @see org.csu.slicing.UML2.Operation#getClass_
	 * @model opposite="class_" containment="true"
	 * @generated
	 */
	EList<Operation> getOwnedOperation();

	/**
	 * Returns the value of the '<em><b>Super Class</b></em>' reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2.Class}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Class</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Class</em>' reference list.
	 * @see org.csu.slicing.UML2.UML2Package#getClass_SuperClass()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Class> getSuperClass();

	/**
	 * Returns the value of the '<em><b>Extension</b></em>' reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2.Extension}.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2.Extension#getMetaclass <em>Metaclass</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extension</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension</em>' reference list.
	 * @see org.csu.slicing.UML2.UML2Package#getClass_Extension()
	 * @see org.csu.slicing.UML2.Extension#getMetaclass
	 * @model opposite="metaclass" ordered="false"
	 * @generated
	 */
	EList<Extension> getExtension();

	/**
	 * Returns the value of the '<em><b>Nested Classifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2.Classifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nested Classifier</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nested Classifier</em>' containment reference list.
	 * @see org.csu.slicing.UML2.UML2Package#getClass_NestedClassifier()
	 * @model containment="true"
	 * @generated
	 */
	EList<Classifier> getNestedClassifier();

	/**
	 * Returns the value of the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Active</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Active</em>' attribute.
	 * @see #setIsActive(boolean)
	 * @see org.csu.slicing.UML2.UML2Package#getClass_IsActive()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	boolean isIsActive();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2.Class#isIsActive <em>Is Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Active</em>' attribute.
	 * @see #isIsActive()
	 * @generated
	 */
	void setIsActive(boolean value);

	/**
	 * Returns the value of the '<em><b>Owned Reception</b></em>' containment reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2.Reception}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Reception</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Reception</em>' containment reference list.
	 * @see org.csu.slicing.UML2.UML2Package#getClass_OwnedReception()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Reception> getOwnedReception();

} // Class

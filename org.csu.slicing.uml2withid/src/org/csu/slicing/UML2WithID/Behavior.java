/**
 */
package org.csu.slicing.UML2WithID;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behavior</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2WithID.Behavior#isIsReentrant <em>Is Reentrant</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.Behavior#getContext <em>Context</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.Behavior#getRedefinedBehavior <em>Redefined Behavior</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.Behavior#getSpecification <em>Specification</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.Behavior#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.Behavior#getFormalParameter <em>Formal Parameter</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.Behavior#getReturnResult <em>Return Result</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.Behavior#getPrecondition <em>Precondition</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.Behavior#getPostcondition <em>Postcondition</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.Behavior#getOwnedParameterSet <em>Owned Parameter Set</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getBehavior()
 * @model abstract="true"
 * @generated
 */
public interface Behavior extends org.csu.slicing.UML2WithID.Class {
	/**
	 * Returns the value of the '<em><b>Is Reentrant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Reentrant</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Reentrant</em>' attribute.
	 * @see #setIsReentrant(boolean)
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getBehavior_IsReentrant()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	boolean isIsReentrant();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.Behavior#isIsReentrant <em>Is Reentrant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Reentrant</em>' attribute.
	 * @see #isIsReentrant()
	 * @generated
	 */
	void setIsReentrant(boolean value);

	/**
	 * Returns the value of the '<em><b>Context</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2WithID.BehavioredClassifier#getOwnedBehavior <em>Owned Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' container reference.
	 * @see #setContext(BehavioredClassifier)
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getBehavior_Context()
	 * @see org.csu.slicing.UML2WithID.BehavioredClassifier#getOwnedBehavior
	 * @model opposite="ownedBehavior" transient="false" ordered="false"
	 * @generated
	 */
	BehavioredClassifier getContext();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.Behavior#getContext <em>Context</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' container reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(BehavioredClassifier value);

	/**
	 * Returns the value of the '<em><b>Redefined Behavior</b></em>' reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2WithID.Behavior}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Redefined Behavior</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Redefined Behavior</em>' reference list.
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getBehavior_RedefinedBehavior()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Behavior> getRedefinedBehavior();

	/**
	 * Returns the value of the '<em><b>Specification</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2WithID.BehavioralFeature#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specification</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specification</em>' reference.
	 * @see #setSpecification(BehavioralFeature)
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getBehavior_Specification()
	 * @see org.csu.slicing.UML2WithID.BehavioralFeature#getMethod
	 * @model opposite="method" ordered="false"
	 * @generated
	 */
	BehavioralFeature getSpecification();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.Behavior#getSpecification <em>Specification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specification</em>' reference.
	 * @see #getSpecification()
	 * @generated
	 */
	void setSpecification(BehavioralFeature value);

	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2WithID.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' containment reference list.
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getBehavior_Parameter()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParameter();

	/**
	 * Returns the value of the '<em><b>Formal Parameter</b></em>' reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2WithID.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Formal Parameter</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formal Parameter</em>' reference list.
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getBehavior_FormalParameter()
	 * @model
	 * @generated
	 */
	EList<Parameter> getFormalParameter();

	/**
	 * Returns the value of the '<em><b>Return Result</b></em>' reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2WithID.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Result</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Result</em>' reference list.
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getBehavior_ReturnResult()
	 * @model
	 * @generated
	 */
	EList<Parameter> getReturnResult();

	/**
	 * Returns the value of the '<em><b>Precondition</b></em>' reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2WithID.Constraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precondition</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precondition</em>' reference list.
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getBehavior_Precondition()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Constraint> getPrecondition();

	/**
	 * Returns the value of the '<em><b>Postcondition</b></em>' reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2WithID.Constraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Postcondition</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Postcondition</em>' reference list.
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getBehavior_Postcondition()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Constraint> getPostcondition();

	/**
	 * Returns the value of the '<em><b>Owned Parameter Set</b></em>' containment reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2WithID.ParameterSet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Parameter Set</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Parameter Set</em>' containment reference list.
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getBehavior_OwnedParameterSet()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<ParameterSet> getOwnedParameterSet();

} // Behavior

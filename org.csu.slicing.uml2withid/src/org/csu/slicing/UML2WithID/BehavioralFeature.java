/**
 */
package org.csu.slicing.UML2WithID;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behavioral Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2WithID.BehavioralFeature#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.BehavioralFeature#getFormalParameter <em>Formal Parameter</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.BehavioralFeature#getReturnResult <em>Return Result</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.BehavioralFeature#getRaisedException <em>Raised Exception</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.BehavioralFeature#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.BehavioralFeature#getMethod <em>Method</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.BehavioralFeature#getConcurrency <em>Concurrency</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getBehavioralFeature()
 * @model abstract="true"
 * @generated
 */
public interface BehavioralFeature extends Namespace, Feature {
	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2WithID.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' reference list.
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getBehavioralFeature_Parameter()
	 * @model
	 * @generated
	 */
	EList<Parameter> getParameter();

	/**
	 * Returns the value of the '<em><b>Formal Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2WithID.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Formal Parameter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formal Parameter</em>' containment reference list.
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getBehavioralFeature_FormalParameter()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Parameter> getFormalParameter();

	/**
	 * Returns the value of the '<em><b>Return Result</b></em>' containment reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2WithID.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Result</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Result</em>' containment reference list.
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getBehavioralFeature_ReturnResult()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getReturnResult();

	/**
	 * Returns the value of the '<em><b>Raised Exception</b></em>' reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2WithID.Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Raised Exception</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Raised Exception</em>' reference list.
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getBehavioralFeature_RaisedException()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Type> getRaisedException();

	/**
	 * Returns the value of the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Abstract</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Abstract</em>' attribute.
	 * @see #setIsAbstract(boolean)
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getBehavioralFeature_IsAbstract()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	boolean isIsAbstract();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.BehavioralFeature#isIsAbstract <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Abstract</em>' attribute.
	 * @see #isIsAbstract()
	 * @generated
	 */
	void setIsAbstract(boolean value);

	/**
	 * Returns the value of the '<em><b>Method</b></em>' reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2WithID.Behavior}.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2WithID.Behavior#getSpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' reference list.
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getBehavioralFeature_Method()
	 * @see org.csu.slicing.UML2WithID.Behavior#getSpecification
	 * @model opposite="specification" ordered="false"
	 * @generated
	 */
	EList<Behavior> getMethod();

	/**
	 * Returns the value of the '<em><b>Concurrency</b></em>' attribute.
	 * The literals are from the enumeration {@link org.csu.slicing.UML2WithID.CallConcurrencyKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concurrency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concurrency</em>' attribute.
	 * @see org.csu.slicing.UML2WithID.CallConcurrencyKind
	 * @see #setConcurrency(CallConcurrencyKind)
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getBehavioralFeature_Concurrency()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	CallConcurrencyKind getConcurrency();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.BehavioralFeature#getConcurrency <em>Concurrency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concurrency</em>' attribute.
	 * @see org.csu.slicing.UML2WithID.CallConcurrencyKind
	 * @see #getConcurrency()
	 * @generated
	 */
	void setConcurrency(CallConcurrencyKind value);

} // BehavioralFeature

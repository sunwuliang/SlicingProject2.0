/**
 */
package org.csu.slicing.UML2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2.Operation#getOwnedParameter <em>Owned Parameter</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.Operation#getClass_ <em>Class </em>}</li>
 *   <li>{@link org.csu.slicing.UML2.Operation#isIsQuery <em>Is Query</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.Operation#getDatatype <em>Datatype</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.Operation#getPrecondition <em>Precondition</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.Operation#getPostcondition <em>Postcondition</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.Operation#getRedefinedOperation <em>Redefined Operation</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.Operation#getBodyCondition <em>Body Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2.UML2Package#getOperation()
 * @model
 * @generated
 */
public interface Operation extends BehavioralFeature, TypedElement, MultiplicityElement, ParameterableElement {
	/**
	 * Returns the value of the '<em><b>Owned Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2.Parameter}.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2.Parameter#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Parameter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Parameter</em>' containment reference list.
	 * @see org.csu.slicing.UML2.UML2Package#getOperation_OwnedParameter()
	 * @see org.csu.slicing.UML2.Parameter#getOperation
	 * @model opposite="operation" containment="true"
	 * @generated
	 */
	EList<Parameter> getOwnedParameter();

	/**
	 * Returns the value of the '<em><b>Class </b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2.Class#getOwnedOperation <em>Owned Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class </em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class </em>' container reference.
	 * @see #setClass_(org.csu.slicing.UML2.Class)
	 * @see org.csu.slicing.UML2.UML2Package#getOperation_Class_()
	 * @see org.csu.slicing.UML2.Class#getOwnedOperation
	 * @model opposite="ownedOperation" transient="false" ordered="false"
	 * @generated
	 */
	org.csu.slicing.UML2.Class getClass_();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2.Operation#getClass_ <em>Class </em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class </em>' container reference.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass_(org.csu.slicing.UML2.Class value);

	/**
	 * Returns the value of the '<em><b>Is Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Query</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Query</em>' attribute.
	 * @see #setIsQuery(boolean)
	 * @see org.csu.slicing.UML2.UML2Package#getOperation_IsQuery()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	boolean isIsQuery();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2.Operation#isIsQuery <em>Is Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Query</em>' attribute.
	 * @see #isIsQuery()
	 * @generated
	 */
	void setIsQuery(boolean value);

	/**
	 * Returns the value of the '<em><b>Datatype</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2.DataType#getOwnedOperation <em>Owned Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datatype</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datatype</em>' container reference.
	 * @see #setDatatype(DataType)
	 * @see org.csu.slicing.UML2.UML2Package#getOperation_Datatype()
	 * @see org.csu.slicing.UML2.DataType#getOwnedOperation
	 * @model opposite="ownedOperation" transient="false" ordered="false"
	 * @generated
	 */
	DataType getDatatype();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2.Operation#getDatatype <em>Datatype</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datatype</em>' container reference.
	 * @see #getDatatype()
	 * @generated
	 */
	void setDatatype(DataType value);

	/**
	 * Returns the value of the '<em><b>Precondition</b></em>' reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2.Constraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precondition</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precondition</em>' reference list.
	 * @see org.csu.slicing.UML2.UML2Package#getOperation_Precondition()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Constraint> getPrecondition();

	/**
	 * Returns the value of the '<em><b>Postcondition</b></em>' reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2.Constraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Postcondition</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Postcondition</em>' reference list.
	 * @see org.csu.slicing.UML2.UML2Package#getOperation_Postcondition()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Constraint> getPostcondition();

	/**
	 * Returns the value of the '<em><b>Redefined Operation</b></em>' reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2.Operation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Redefined Operation</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Redefined Operation</em>' reference list.
	 * @see org.csu.slicing.UML2.UML2Package#getOperation_RedefinedOperation()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Operation> getRedefinedOperation();

	/**
	 * Returns the value of the '<em><b>Body Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body Condition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body Condition</em>' reference.
	 * @see #setBodyCondition(Constraint)
	 * @see org.csu.slicing.UML2.UML2Package#getOperation_BodyCondition()
	 * @model ordered="false"
	 * @generated
	 */
	Constraint getBodyCondition();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2.Operation#getBodyCondition <em>Body Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body Condition</em>' reference.
	 * @see #getBodyCondition()
	 * @generated
	 */
	void setBodyCondition(Constraint value);

} // Operation

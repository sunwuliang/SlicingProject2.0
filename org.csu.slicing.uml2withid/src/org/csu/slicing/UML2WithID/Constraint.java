/**
 */
package org.csu.slicing.UML2WithID;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2WithID.Constraint#getContext <em>Context</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.Constraint#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.Constraint#getSpecification <em>Specification</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.Constraint#getConstrainedElement <em>Constrained Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getConstraint()
 * @model
 * @generated
 */
public interface Constraint extends PackageableElement {
	/**
	 * Returns the value of the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' reference.
	 * @see #setContext(Namespace)
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getConstraint_Context()
	 * @model ordered="false"
	 * @generated
	 */
	Namespace getContext();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.Constraint#getContext <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(Namespace value);

	/**
	 * Returns the value of the '<em><b>Namespace</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2WithID.Namespace#getOwnedRule <em>Owned Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Namespace</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namespace</em>' container reference.
	 * @see #setNamespace(Namespace)
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getConstraint_Namespace()
	 * @see org.csu.slicing.UML2WithID.Namespace#getOwnedRule
	 * @model opposite="ownedRule" transient="false" ordered="false"
	 * @generated
	 */
	Namespace getNamespace();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.Constraint#getNamespace <em>Namespace</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namespace</em>' container reference.
	 * @see #getNamespace()
	 * @generated
	 */
	void setNamespace(Namespace value);

	/**
	 * Returns the value of the '<em><b>Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specification</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specification</em>' containment reference.
	 * @see #setSpecification(ValueSpecification)
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getConstraint_Specification()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	ValueSpecification getSpecification();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.Constraint#getSpecification <em>Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specification</em>' containment reference.
	 * @see #getSpecification()
	 * @generated
	 */
	void setSpecification(ValueSpecification value);

	/**
	 * Returns the value of the '<em><b>Constrained Element</b></em>' reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2WithID.Element}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constrained Element</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constrained Element</em>' reference list.
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getConstraint_ConstrainedElement()
	 * @model
	 * @generated
	 */
	EList<Element> getConstrainedElement();

} // Constraint

/**
 */
package org.csu.slicing.UML2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Implementation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2.Implementation#getContract <em>Contract</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.Implementation#getImplementingClassifier <em>Implementing Classifier</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2.UML2Package#getImplementation()
 * @model
 * @generated
 */
public interface Implementation extends Realization {
	/**
	 * Returns the value of the '<em><b>Contract</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contract</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contract</em>' reference.
	 * @see #setContract(Interface)
	 * @see org.csu.slicing.UML2.UML2Package#getImplementation_Contract()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Interface getContract();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2.Implementation#getContract <em>Contract</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contract</em>' reference.
	 * @see #getContract()
	 * @generated
	 */
	void setContract(Interface value);

	/**
	 * Returns the value of the '<em><b>Implementing Classifier</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2.BehavioredClassifier#getImplementation <em>Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implementing Classifier</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementing Classifier</em>' container reference.
	 * @see #setImplementingClassifier(BehavioredClassifier)
	 * @see org.csu.slicing.UML2.UML2Package#getImplementation_ImplementingClassifier()
	 * @see org.csu.slicing.UML2.BehavioredClassifier#getImplementation
	 * @model opposite="implementation" required="true" transient="false" ordered="false"
	 * @generated
	 */
	BehavioredClassifier getImplementingClassifier();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2.Implementation#getImplementingClassifier <em>Implementing Classifier</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implementing Classifier</em>' container reference.
	 * @see #getImplementingClassifier()
	 * @generated
	 */
	void setImplementingClassifier(BehavioredClassifier value);

} // Implementation

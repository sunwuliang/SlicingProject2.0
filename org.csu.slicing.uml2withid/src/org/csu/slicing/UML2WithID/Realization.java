/**
 */
package org.csu.slicing.UML2WithID;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Realization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2WithID.Realization#getAbstraction <em>Abstraction</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.Realization#getRealizingClassifier <em>Realizing Classifier</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getRealization()
 * @model
 * @generated
 */
public interface Realization extends Abstraction {
	/**
	 * Returns the value of the '<em><b>Abstraction</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2WithID.Component#getRealization <em>Realization</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstraction</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstraction</em>' container reference.
	 * @see #setAbstraction(Component)
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getRealization_Abstraction()
	 * @see org.csu.slicing.UML2WithID.Component#getRealization
	 * @model opposite="realization" transient="false" ordered="false"
	 * @generated
	 */
	Component getAbstraction();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.Realization#getAbstraction <em>Abstraction</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstraction</em>' container reference.
	 * @see #getAbstraction()
	 * @generated
	 */
	void setAbstraction(Component value);

	/**
	 * Returns the value of the '<em><b>Realizing Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realizing Classifier</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realizing Classifier</em>' reference.
	 * @see #setRealizingClassifier(Classifier)
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getRealization_RealizingClassifier()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Classifier getRealizingClassifier();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.Realization#getRealizingClassifier <em>Realizing Classifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Realizing Classifier</em>' reference.
	 * @see #getRealizingClassifier()
	 * @generated
	 */
	void setRealizingClassifier(Classifier value);

} // Realization

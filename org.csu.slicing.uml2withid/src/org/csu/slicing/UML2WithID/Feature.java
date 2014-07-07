/**
 */
package org.csu.slicing.UML2WithID;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2WithID.Feature#getFeaturingClassifier <em>Featuring Classifier</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.Feature#isIsStatic <em>Is Static</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getFeature()
 * @model abstract="true"
 * @generated
 */
public interface Feature extends RedefinableElement {
	/**
	 * Returns the value of the '<em><b>Featuring Classifier</b></em>' reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2WithID.Classifier}.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2WithID.Classifier#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Featuring Classifier</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Featuring Classifier</em>' reference list.
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getFeature_FeaturingClassifier()
	 * @see org.csu.slicing.UML2WithID.Classifier#getFeature
	 * @model opposite="feature" ordered="false"
	 * @generated
	 */
	EList<Classifier> getFeaturingClassifier();

	/**
	 * Returns the value of the '<em><b>Is Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Static</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Static</em>' attribute.
	 * @see #setIsStatic(boolean)
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getFeature_IsStatic()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	boolean isIsStatic();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.Feature#isIsStatic <em>Is Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Static</em>' attribute.
	 * @see #isIsStatic()
	 * @generated
	 */
	void setIsStatic(boolean value);

} // Feature

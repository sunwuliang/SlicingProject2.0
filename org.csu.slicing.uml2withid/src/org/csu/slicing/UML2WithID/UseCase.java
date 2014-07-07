/**
 */
package org.csu.slicing.UML2WithID;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Use Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2WithID.UseCase#getInclude <em>Include</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.UseCase#getExtend <em>Extend</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.UseCase#getExtensionPoint <em>Extension Point</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.UseCase#getSubject <em>Subject</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getUseCase()
 * @model
 * @generated
 */
public interface UseCase extends BehavioredClassifier {
	/**
	 * Returns the value of the '<em><b>Include</b></em>' containment reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2WithID.Include}.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2WithID.Include#getIncludingCase <em>Including Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Include</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Include</em>' containment reference list.
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getUseCase_Include()
	 * @see org.csu.slicing.UML2WithID.Include#getIncludingCase
	 * @model opposite="includingCase" containment="true" ordered="false"
	 * @generated
	 */
	EList<Include> getInclude();

	/**
	 * Returns the value of the '<em><b>Extend</b></em>' containment reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2WithID.Extend}.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2WithID.Extend#getExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extend</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extend</em>' containment reference list.
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getUseCase_Extend()
	 * @see org.csu.slicing.UML2WithID.Extend#getExtension
	 * @model opposite="extension" containment="true" ordered="false"
	 * @generated
	 */
	EList<Extend> getExtend();

	/**
	 * Returns the value of the '<em><b>Extension Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2WithID.ExtensionPoint}.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2WithID.ExtensionPoint#getUseCase <em>Use Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extension Point</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension Point</em>' containment reference list.
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getUseCase_ExtensionPoint()
	 * @see org.csu.slicing.UML2WithID.ExtensionPoint#getUseCase
	 * @model opposite="useCase" containment="true" ordered="false"
	 * @generated
	 */
	EList<ExtensionPoint> getExtensionPoint();

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2WithID.Classifier}.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2WithID.Classifier#getUseCase <em>Use Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subject</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subject</em>' reference list.
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getUseCase_Subject()
	 * @see org.csu.slicing.UML2WithID.Classifier#getUseCase
	 * @model opposite="useCase" ordered="false"
	 * @generated
	 */
	EList<Classifier> getSubject();

} // UseCase

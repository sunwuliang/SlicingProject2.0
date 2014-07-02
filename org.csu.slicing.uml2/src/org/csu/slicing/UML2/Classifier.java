/**
 */
package org.csu.slicing.UML2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Classifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2.Classifier#getFeature <em>Feature</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.Classifier#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.Classifier#getInheritedMember <em>Inherited Member</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.Classifier#getGeneral <em>General</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.Classifier#getGeneralization <em>Generalization</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.Classifier#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.Classifier#getRedefinedClassifier <em>Redefined Classifier</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.Classifier#getSubstitution <em>Substitution</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.Classifier#getPowertypeExtent <em>Powertype Extent</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.Classifier#getOwnedUseCase <em>Owned Use Case</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.Classifier#getUseCase <em>Use Case</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.Classifier#getRepresentation <em>Representation</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.Classifier#getOccurrence <em>Occurrence</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2.UML2Package#getClassifier()
 * @model abstract="true"
 * @generated
 */
public interface Classifier extends Namespace, Type, RedefinableElement {
	/**
	 * Returns the value of the '<em><b>Feature</b></em>' reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2.Feature}.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2.Feature#getFeaturingClassifier <em>Featuring Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' reference list.
	 * @see org.csu.slicing.UML2.UML2Package#getClassifier_Feature()
	 * @see org.csu.slicing.UML2.Feature#getFeaturingClassifier
	 * @model opposite="featuringClassifier" ordered="false"
	 * @generated
	 */
	EList<Feature> getFeature();

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
	 * @see org.csu.slicing.UML2.UML2Package#getClassifier_IsAbstract()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	boolean isIsAbstract();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2.Classifier#isIsAbstract <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Abstract</em>' attribute.
	 * @see #isIsAbstract()
	 * @generated
	 */
	void setIsAbstract(boolean value);

	/**
	 * Returns the value of the '<em><b>Inherited Member</b></em>' reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2.NamedElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inherited Member</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inherited Member</em>' reference list.
	 * @see org.csu.slicing.UML2.UML2Package#getClassifier_InheritedMember()
	 * @model ordered="false"
	 * @generated
	 */
	EList<NamedElement> getInheritedMember();

	/**
	 * Returns the value of the '<em><b>General</b></em>' reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2.Classifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>General</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>General</em>' reference list.
	 * @see org.csu.slicing.UML2.UML2Package#getClassifier_General()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Classifier> getGeneral();

	/**
	 * Returns the value of the '<em><b>Generalization</b></em>' containment reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2.Generalization}.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2.Generalization#getSpecific <em>Specific</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generalization</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generalization</em>' containment reference list.
	 * @see org.csu.slicing.UML2.UML2Package#getClassifier_Generalization()
	 * @see org.csu.slicing.UML2.Generalization#getSpecific
	 * @model opposite="specific" containment="true" ordered="false"
	 * @generated
	 */
	EList<Generalization> getGeneralization();

	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' reference list.
	 * @see org.csu.slicing.UML2.UML2Package#getClassifier_Attribute()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Property> getAttribute();

	/**
	 * Returns the value of the '<em><b>Redefined Classifier</b></em>' reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2.Classifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Redefined Classifier</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Redefined Classifier</em>' reference list.
	 * @see org.csu.slicing.UML2.UML2Package#getClassifier_RedefinedClassifier()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Classifier> getRedefinedClassifier();

	/**
	 * Returns the value of the '<em><b>Substitution</b></em>' containment reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2.Substitution}.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2.Substitution#getSubstitutingClassifier <em>Substituting Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Substitution</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Substitution</em>' containment reference list.
	 * @see org.csu.slicing.UML2.UML2Package#getClassifier_Substitution()
	 * @see org.csu.slicing.UML2.Substitution#getSubstitutingClassifier
	 * @model opposite="substitutingClassifier" containment="true" ordered="false"
	 * @generated
	 */
	EList<Substitution> getSubstitution();

	/**
	 * Returns the value of the '<em><b>Powertype Extent</b></em>' reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2.GeneralizationSet}.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2.GeneralizationSet#getPowertype <em>Powertype</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Powertype Extent</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Powertype Extent</em>' reference list.
	 * @see org.csu.slicing.UML2.UML2Package#getClassifier_PowertypeExtent()
	 * @see org.csu.slicing.UML2.GeneralizationSet#getPowertype
	 * @model opposite="powertype" ordered="false"
	 * @generated
	 */
	EList<GeneralizationSet> getPowertypeExtent();

	/**
	 * Returns the value of the '<em><b>Owned Use Case</b></em>' containment reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2.UseCase}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Use Case</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Use Case</em>' containment reference list.
	 * @see org.csu.slicing.UML2.UML2Package#getClassifier_OwnedUseCase()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<UseCase> getOwnedUseCase();

	/**
	 * Returns the value of the '<em><b>Use Case</b></em>' reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2.UseCase}.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2.UseCase#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Case</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Case</em>' reference list.
	 * @see org.csu.slicing.UML2.UML2Package#getClassifier_UseCase()
	 * @see org.csu.slicing.UML2.UseCase#getSubject
	 * @model opposite="subject" ordered="false"
	 * @generated
	 */
	EList<UseCase> getUseCase();

	/**
	 * Returns the value of the '<em><b>Representation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Representation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Representation</em>' reference.
	 * @see #setRepresentation(CollaborationOccurrence)
	 * @see org.csu.slicing.UML2.UML2Package#getClassifier_Representation()
	 * @model ordered="false"
	 * @generated
	 */
	CollaborationOccurrence getRepresentation();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2.Classifier#getRepresentation <em>Representation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Representation</em>' reference.
	 * @see #getRepresentation()
	 * @generated
	 */
	void setRepresentation(CollaborationOccurrence value);

	/**
	 * Returns the value of the '<em><b>Occurrence</b></em>' containment reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2.CollaborationOccurrence}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Occurrence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Occurrence</em>' containment reference list.
	 * @see org.csu.slicing.UML2.UML2Package#getClassifier_Occurrence()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<CollaborationOccurrence> getOccurrence();

} // Classifier

/**
 */
package org.csu.slicing.UML2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generalization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2.Generalization#getSpecific <em>Specific</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.Generalization#getGeneral <em>General</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.Generalization#isIsSubstitutable <em>Is Substitutable</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.Generalization#getGeneralizationSet <em>Generalization Set</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2.UML2Package#getGeneralization()
 * @model
 * @generated
 */
public interface Generalization extends DirectedRelationship {
	/**
	 * Returns the value of the '<em><b>Specific</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2.Classifier#getGeneralization <em>Generalization</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specific</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specific</em>' container reference.
	 * @see #setSpecific(Classifier)
	 * @see org.csu.slicing.UML2.UML2Package#getGeneralization_Specific()
	 * @see org.csu.slicing.UML2.Classifier#getGeneralization
	 * @model opposite="generalization" required="true" transient="false" ordered="false"
	 * @generated
	 */
	Classifier getSpecific();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2.Generalization#getSpecific <em>Specific</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specific</em>' container reference.
	 * @see #getSpecific()
	 * @generated
	 */
	void setSpecific(Classifier value);

	/**
	 * Returns the value of the '<em><b>General</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>General</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>General</em>' reference.
	 * @see #setGeneral(Classifier)
	 * @see org.csu.slicing.UML2.UML2Package#getGeneralization_General()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Classifier getGeneral();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2.Generalization#getGeneral <em>General</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>General</em>' reference.
	 * @see #getGeneral()
	 * @generated
	 */
	void setGeneral(Classifier value);

	/**
	 * Returns the value of the '<em><b>Is Substitutable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Substitutable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Substitutable</em>' attribute.
	 * @see #setIsSubstitutable(boolean)
	 * @see org.csu.slicing.UML2.UML2Package#getGeneralization_IsSubstitutable()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	boolean isIsSubstitutable();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2.Generalization#isIsSubstitutable <em>Is Substitutable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Substitutable</em>' attribute.
	 * @see #isIsSubstitutable()
	 * @generated
	 */
	void setIsSubstitutable(boolean value);

	/**
	 * Returns the value of the '<em><b>Generalization Set</b></em>' reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2.GeneralizationSet}.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2.GeneralizationSet#getGeneralization <em>Generalization</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generalization Set</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generalization Set</em>' reference list.
	 * @see org.csu.slicing.UML2.UML2Package#getGeneralization_GeneralizationSet()
	 * @see org.csu.slicing.UML2.GeneralizationSet#getGeneralization
	 * @model opposite="generalization" ordered="false"
	 * @generated
	 */
	EList<GeneralizationSet> getGeneralizationSet();

} // Generalization

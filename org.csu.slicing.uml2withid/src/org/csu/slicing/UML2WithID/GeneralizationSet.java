/**
 */
package org.csu.slicing.UML2WithID;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generalization Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2WithID.GeneralizationSet#isIsCovering <em>Is Covering</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.GeneralizationSet#isIsDisjoint <em>Is Disjoint</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.GeneralizationSet#getPowertype <em>Powertype</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.GeneralizationSet#getGeneralization <em>Generalization</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getGeneralizationSet()
 * @model
 * @generated
 */
public interface GeneralizationSet extends PackageableElement {
	/**
	 * Returns the value of the '<em><b>Is Covering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Covering</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Covering</em>' attribute.
	 * @see #setIsCovering(boolean)
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getGeneralizationSet_IsCovering()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	boolean isIsCovering();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.GeneralizationSet#isIsCovering <em>Is Covering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Covering</em>' attribute.
	 * @see #isIsCovering()
	 * @generated
	 */
	void setIsCovering(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Disjoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Disjoint</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Disjoint</em>' attribute.
	 * @see #setIsDisjoint(boolean)
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getGeneralizationSet_IsDisjoint()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	boolean isIsDisjoint();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.GeneralizationSet#isIsDisjoint <em>Is Disjoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Disjoint</em>' attribute.
	 * @see #isIsDisjoint()
	 * @generated
	 */
	void setIsDisjoint(boolean value);

	/**
	 * Returns the value of the '<em><b>Powertype</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2WithID.Classifier#getPowertypeExtent <em>Powertype Extent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Powertype</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Powertype</em>' reference.
	 * @see #setPowertype(Classifier)
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getGeneralizationSet_Powertype()
	 * @see org.csu.slicing.UML2WithID.Classifier#getPowertypeExtent
	 * @model opposite="powertypeExtent" ordered="false"
	 * @generated
	 */
	Classifier getPowertype();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.GeneralizationSet#getPowertype <em>Powertype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Powertype</em>' reference.
	 * @see #getPowertype()
	 * @generated
	 */
	void setPowertype(Classifier value);

	/**
	 * Returns the value of the '<em><b>Generalization</b></em>' reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2WithID.Generalization}.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2WithID.Generalization#getGeneralizationSet <em>Generalization Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generalization</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generalization</em>' reference list.
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getGeneralizationSet_Generalization()
	 * @see org.csu.slicing.UML2WithID.Generalization#getGeneralizationSet
	 * @model opposite="generalizationSet" ordered="false"
	 * @generated
	 */
	EList<Generalization> getGeneralization();

} // GeneralizationSet

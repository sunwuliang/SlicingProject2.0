/**
 */
package org.csu.slicing.UML2WithID;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Information Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2WithID.InformationFlow#getRealization <em>Realization</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.InformationFlow#getConveyed <em>Conveyed</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getInformationFlow()
 * @model
 * @generated
 */
public interface InformationFlow extends PackageableElement, DirectedRelationship {
	/**
	 * Returns the value of the '<em><b>Realization</b></em>' reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2WithID.Relationship}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realization</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realization</em>' reference list.
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getInformationFlow_Realization()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Relationship> getRealization();

	/**
	 * Returns the value of the '<em><b>Conveyed</b></em>' reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2WithID.Classifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conveyed</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conveyed</em>' reference list.
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getInformationFlow_Conveyed()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<Classifier> getConveyed();

} // InformationFlow

/**
 */
package org.csu.slicing.UML2WithID;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instance Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2WithID.InstanceSpecification#getSlot <em>Slot</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.InstanceSpecification#getClassifier <em>Classifier</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.InstanceSpecification#getSpecification <em>Specification</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getInstanceSpecification()
 * @model
 * @generated
 */
public interface InstanceSpecification extends PackageableElement, DeploymentTarget, DeployedArtifact {
	/**
	 * Returns the value of the '<em><b>Slot</b></em>' containment reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2WithID.Slot}.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2WithID.Slot#getOwningInstance <em>Owning Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Slot</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slot</em>' containment reference list.
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getInstanceSpecification_Slot()
	 * @see org.csu.slicing.UML2WithID.Slot#getOwningInstance
	 * @model opposite="owningInstance" containment="true" ordered="false"
	 * @generated
	 */
	EList<Slot> getSlot();

	/**
	 * Returns the value of the '<em><b>Classifier</b></em>' reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2WithID.Classifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classifier</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classifier</em>' reference list.
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getInstanceSpecification_Classifier()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Classifier> getClassifier();

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
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getInstanceSpecification_Specification()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	ValueSpecification getSpecification();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.InstanceSpecification#getSpecification <em>Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specification</em>' containment reference.
	 * @see #getSpecification()
	 * @generated
	 */
	void setSpecification(ValueSpecification value);

} // InstanceSpecification

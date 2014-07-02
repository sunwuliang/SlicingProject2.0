/**
 */
package org.csu.slicing.UML2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Slot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2.Slot#getOwningInstance <em>Owning Instance</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.Slot#getValue <em>Value</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.Slot#getDefiningFeature <em>Defining Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2.UML2Package#getSlot()
 * @model
 * @generated
 */
public interface Slot extends Element {
	/**
	 * Returns the value of the '<em><b>Owning Instance</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2.InstanceSpecification#getSlot <em>Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Instance</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Instance</em>' container reference.
	 * @see #setOwningInstance(InstanceSpecification)
	 * @see org.csu.slicing.UML2.UML2Package#getSlot_OwningInstance()
	 * @see org.csu.slicing.UML2.InstanceSpecification#getSlot
	 * @model opposite="slot" required="true" transient="false" ordered="false"
	 * @generated
	 */
	InstanceSpecification getOwningInstance();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2.Slot#getOwningInstance <em>Owning Instance</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Instance</em>' container reference.
	 * @see #getOwningInstance()
	 * @generated
	 */
	void setOwningInstance(InstanceSpecification value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2.ValueSpecification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference list.
	 * @see org.csu.slicing.UML2.UML2Package#getSlot_Value()
	 * @model containment="true"
	 * @generated
	 */
	EList<ValueSpecification> getValue();

	/**
	 * Returns the value of the '<em><b>Defining Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Defining Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Defining Feature</em>' reference.
	 * @see #setDefiningFeature(StructuralFeature)
	 * @see org.csu.slicing.UML2.UML2Package#getSlot_DefiningFeature()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	StructuralFeature getDefiningFeature();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2.Slot#getDefiningFeature <em>Defining Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Defining Feature</em>' reference.
	 * @see #getDefiningFeature()
	 * @generated
	 */
	void setDefiningFeature(StructuralFeature value);

} // Slot

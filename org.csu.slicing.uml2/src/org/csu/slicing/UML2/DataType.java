/**
 */
package org.csu.slicing.UML2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2.DataType#getOwnedAttribute <em>Owned Attribute</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.DataType#getOwnedOperation <em>Owned Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2.UML2Package#getDataType()
 * @model
 * @generated
 */
public interface DataType extends Classifier {
	/**
	 * Returns the value of the '<em><b>Owned Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2.Property}.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2.Property#getDatatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Attribute</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Attribute</em>' containment reference list.
	 * @see org.csu.slicing.UML2.UML2Package#getDataType_OwnedAttribute()
	 * @see org.csu.slicing.UML2.Property#getDatatype
	 * @model opposite="datatype" containment="true"
	 * @generated
	 */
	EList<Property> getOwnedAttribute();

	/**
	 * Returns the value of the '<em><b>Owned Operation</b></em>' containment reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2.Operation}.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2.Operation#getDatatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Operation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Operation</em>' containment reference list.
	 * @see org.csu.slicing.UML2.UML2Package#getDataType_OwnedOperation()
	 * @see org.csu.slicing.UML2.Operation#getDatatype
	 * @model opposite="datatype" containment="true"
	 * @generated
	 */
	EList<Operation> getOwnedOperation();

} // DataType

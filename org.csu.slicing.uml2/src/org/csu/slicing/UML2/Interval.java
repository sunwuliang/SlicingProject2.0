/**
 */
package org.csu.slicing.UML2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interval</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2.Interval#getMin <em>Min</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.Interval#getMax <em>Max</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2.UML2Package#getInterval()
 * @model
 * @generated
 */
public interface Interval extends ValueSpecification {
	/**
	 * Returns the value of the '<em><b>Min</b></em>' reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2.ValueSpecification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min</em>' reference list.
	 * @see org.csu.slicing.UML2.UML2Package#getInterval_Min()
	 * @model
	 * @generated
	 */
	EList<ValueSpecification> getMin();

	/**
	 * Returns the value of the '<em><b>Max</b></em>' reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2.ValueSpecification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max</em>' reference list.
	 * @see org.csu.slicing.UML2.UML2Package#getInterval_Max()
	 * @model
	 * @generated
	 */
	EList<ValueSpecification> getMax();

} // Interval

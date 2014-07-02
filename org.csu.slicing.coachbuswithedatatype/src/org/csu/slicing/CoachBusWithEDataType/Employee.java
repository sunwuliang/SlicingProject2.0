/**
 */
package org.csu.slicing.CoachBusWithEDataType;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Employee</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.CoachBusWithEDataType.Employee#getId <em>Id</em>}</li>
 *   <li>{@link org.csu.slicing.CoachBusWithEDataType.Employee#getBaseSalary <em>Base Salary</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.CoachBusWithEDataType.CoachBusWithEDataTypePackage#getEmployee()
 * @model
 * @generated
 */
public interface Employee extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see org.csu.slicing.CoachBusWithEDataType.CoachBusWithEDataTypePackage#getEmployee_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link org.csu.slicing.CoachBusWithEDataType.Employee#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Base Salary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Salary</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Salary</em>' attribute.
	 * @see #setBaseSalary(double)
	 * @see org.csu.slicing.CoachBusWithEDataType.CoachBusWithEDataTypePackage#getEmployee_BaseSalary()
	 * @model
	 * @generated
	 */
	double getBaseSalary();

	/**
	 * Sets the value of the '{@link org.csu.slicing.CoachBusWithEDataType.Employee#getBaseSalary <em>Base Salary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Salary</em>' attribute.
	 * @see #getBaseSalary()
	 * @generated
	 */
	void setBaseSalary(double value);

} // Employee

/**
 */
package org.csu.slicing.UML2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2.ParameterSet#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.ParameterSet#getCondition <em>Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2.UML2Package#getParameterSet()
 * @model
 * @generated
 */
public interface ParameterSet extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2.Parameter}.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2.Parameter#getParameterSet <em>Parameter Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' reference list.
	 * @see org.csu.slicing.UML2.UML2Package#getParameterSet_Parameter()
	 * @see org.csu.slicing.UML2.Parameter#getParameterSet
	 * @model opposite="parameterSet" required="true" ordered="false"
	 * @generated
	 */
	EList<Parameter> getParameter();

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2.Constraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference list.
	 * @see org.csu.slicing.UML2.UML2Package#getParameterSet_Condition()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Constraint> getCondition();

} // ParameterSet

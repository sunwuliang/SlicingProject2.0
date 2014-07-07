/**
 */
package org.csu.slicing.UML2WithID;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2WithID.Parameter#getOperation <em>Operation</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.Parameter#getDefault <em>Default</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.Parameter#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.Parameter#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.Parameter#isIsException <em>Is Exception</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.Parameter#isIsStream <em>Is Stream</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.Parameter#getEffect <em>Effect</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.Parameter#getParameterSet <em>Parameter Set</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends ConnectableElement, TypedElement, MultiplicityElement {
	/**
	 * Returns the value of the '<em><b>Operation</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2WithID.Operation#getOwnedParameter <em>Owned Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' container reference.
	 * @see #setOperation(Operation)
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getParameter_Operation()
	 * @see org.csu.slicing.UML2WithID.Operation#getOwnedParameter
	 * @model opposite="ownedParameter" transient="false" ordered="false"
	 * @generated
	 */
	Operation getOperation();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.Parameter#getOperation <em>Operation</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' container reference.
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(Operation value);

	/**
	 * Returns the value of the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default</em>' attribute.
	 * @see #setDefault(String)
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getParameter_Default()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getDefault();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.Parameter#getDefault <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default</em>' attribute.
	 * @see #getDefault()
	 * @generated
	 */
	void setDefault(String value);

	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link org.csu.slicing.UML2WithID.ParameterDirectionKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see org.csu.slicing.UML2WithID.ParameterDirectionKind
	 * @see #setDirection(ParameterDirectionKind)
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getParameter_Direction()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	ParameterDirectionKind getDirection();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.Parameter#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see org.csu.slicing.UML2WithID.ParameterDirectionKind
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(ParameterDirectionKind value);

	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' containment reference.
	 * @see #setDefaultValue(ValueSpecification)
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getParameter_DefaultValue()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	ValueSpecification getDefaultValue();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.Parameter#getDefaultValue <em>Default Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' containment reference.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(ValueSpecification value);

	/**
	 * Returns the value of the '<em><b>Is Exception</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Exception</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Exception</em>' attribute.
	 * @see #setIsException(boolean)
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getParameter_IsException()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	boolean isIsException();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.Parameter#isIsException <em>Is Exception</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Exception</em>' attribute.
	 * @see #isIsException()
	 * @generated
	 */
	void setIsException(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Stream</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Stream</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Stream</em>' attribute.
	 * @see #setIsStream(boolean)
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getParameter_IsStream()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	boolean isIsStream();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.Parameter#isIsStream <em>Is Stream</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Stream</em>' attribute.
	 * @see #isIsStream()
	 * @generated
	 */
	void setIsStream(boolean value);

	/**
	 * Returns the value of the '<em><b>Effect</b></em>' attribute.
	 * The literals are from the enumeration {@link org.csu.slicing.UML2WithID.ParameterEffectKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effect</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effect</em>' attribute.
	 * @see org.csu.slicing.UML2WithID.ParameterEffectKind
	 * @see #setEffect(ParameterEffectKind)
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getParameter_Effect()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	ParameterEffectKind getEffect();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.Parameter#getEffect <em>Effect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effect</em>' attribute.
	 * @see org.csu.slicing.UML2WithID.ParameterEffectKind
	 * @see #getEffect()
	 * @generated
	 */
	void setEffect(ParameterEffectKind value);

	/**
	 * Returns the value of the '<em><b>Parameter Set</b></em>' reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2WithID.ParameterSet}.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2WithID.ParameterSet#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Set</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Set</em>' reference list.
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getParameter_ParameterSet()
	 * @see org.csu.slicing.UML2WithID.ParameterSet#getParameter
	 * @model opposite="parameter" ordered="false"
	 * @generated
	 */
	EList<ParameterSet> getParameterSet();

} // Parameter

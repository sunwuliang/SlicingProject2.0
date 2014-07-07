/**
 */
package org.csu.slicing.UML2WithID;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Named Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2WithID.NamedElement#getName <em>Name</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.NamedElement#getQualifiedName <em>Qualified Name</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.NamedElement#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.NamedElement#getClientDependency <em>Client Dependency</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.NamedElement#getNameExpression <em>Name Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getNamedElement()
 * @model abstract="true"
 * @generated
 */
public interface NamedElement extends TemplateableElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getNamedElement_Name()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.NamedElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualified Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualified Name</em>' attribute.
	 * @see #setQualifiedName(String)
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getNamedElement_QualifiedName()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getQualifiedName();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.NamedElement#getQualifiedName <em>Qualified Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualified Name</em>' attribute.
	 * @see #getQualifiedName()
	 * @generated
	 */
	void setQualifiedName(String value);

	/**
	 * Returns the value of the '<em><b>Visibility</b></em>' attribute.
	 * The literals are from the enumeration {@link org.csu.slicing.UML2WithID.VisibilityKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visibility</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibility</em>' attribute.
	 * @see org.csu.slicing.UML2WithID.VisibilityKind
	 * @see #setVisibility(VisibilityKind)
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getNamedElement_Visibility()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	VisibilityKind getVisibility();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.NamedElement#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' attribute.
	 * @see org.csu.slicing.UML2WithID.VisibilityKind
	 * @see #getVisibility()
	 * @generated
	 */
	void setVisibility(VisibilityKind value);

	/**
	 * Returns the value of the '<em><b>Client Dependency</b></em>' reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2WithID.Dependency}.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2WithID.Dependency#getClient <em>Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Client Dependency</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client Dependency</em>' reference list.
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getNamedElement_ClientDependency()
	 * @see org.csu.slicing.UML2WithID.Dependency#getClient
	 * @model opposite="client" ordered="false"
	 * @generated
	 */
	EList<Dependency> getClientDependency();

	/**
	 * Returns the value of the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Expression</em>' containment reference.
	 * @see #setNameExpression(StringExpression)
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getNamedElement_NameExpression()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	StringExpression getNameExpression();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.NamedElement#getNameExpression <em>Name Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Expression</em>' containment reference.
	 * @see #getNameExpression()
	 * @generated
	 */
	void setNameExpression(StringExpression value);

} // NamedElement

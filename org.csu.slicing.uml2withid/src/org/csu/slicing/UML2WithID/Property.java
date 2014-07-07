/**
 */
package org.csu.slicing.UML2WithID;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2WithID.Property#getDefault <em>Default</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.Property#isIsComposite <em>Is Composite</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.Property#isIsDerived <em>Is Derived</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.Property#getClass_ <em>Class </em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.Property#getOpposite <em>Opposite</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.Property#isIsDerivedUnion <em>Is Derived Union</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.Property#getOwningAssociation <em>Owning Association</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.Property#getRedefinedProperty <em>Redefined Property</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.Property#getSubsettedProperty <em>Subsetted Property</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.Property#getDatatype <em>Datatype</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.Property#getAssociation <em>Association</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.Property#getAggregation <em>Aggregation</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.Property#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.Property#getQualifier <em>Qualifier</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.Property#getAssociationEnd <em>Association End</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getProperty()
 * @model
 * @generated
 */
public interface Property extends StructuralFeature, ConnectableElement, DeploymentTarget {
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
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getProperty_Default()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getDefault();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.Property#getDefault <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default</em>' attribute.
	 * @see #getDefault()
	 * @generated
	 */
	void setDefault(String value);

	/**
	 * Returns the value of the '<em><b>Is Composite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Composite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Composite</em>' attribute.
	 * @see #setIsComposite(boolean)
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getProperty_IsComposite()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	boolean isIsComposite();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.Property#isIsComposite <em>Is Composite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Composite</em>' attribute.
	 * @see #isIsComposite()
	 * @generated
	 */
	void setIsComposite(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Derived</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Derived</em>' attribute.
	 * @see #setIsDerived(boolean)
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getProperty_IsDerived()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	boolean isIsDerived();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.Property#isIsDerived <em>Is Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Derived</em>' attribute.
	 * @see #isIsDerived()
	 * @generated
	 */
	void setIsDerived(boolean value);

	/**
	 * Returns the value of the '<em><b>Class </b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class </em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class </em>' reference.
	 * @see #setClass_(org.csu.slicing.UML2WithID.Class)
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getProperty_Class_()
	 * @model ordered="false"
	 * @generated
	 */
	org.csu.slicing.UML2WithID.Class getClass_();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.Property#getClass_ <em>Class </em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class </em>' reference.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass_(org.csu.slicing.UML2WithID.Class value);

	/**
	 * Returns the value of the '<em><b>Opposite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Opposite</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opposite</em>' reference.
	 * @see #setOpposite(Property)
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getProperty_Opposite()
	 * @model ordered="false"
	 * @generated
	 */
	Property getOpposite();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.Property#getOpposite <em>Opposite</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opposite</em>' reference.
	 * @see #getOpposite()
	 * @generated
	 */
	void setOpposite(Property value);

	/**
	 * Returns the value of the '<em><b>Is Derived Union</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Derived Union</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Derived Union</em>' attribute.
	 * @see #setIsDerivedUnion(boolean)
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getProperty_IsDerivedUnion()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	boolean isIsDerivedUnion();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.Property#isIsDerivedUnion <em>Is Derived Union</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Derived Union</em>' attribute.
	 * @see #isIsDerivedUnion()
	 * @generated
	 */
	void setIsDerivedUnion(boolean value);

	/**
	 * Returns the value of the '<em><b>Owning Association</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2WithID.Association#getOwnedEnd <em>Owned End</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Association</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Association</em>' container reference.
	 * @see #setOwningAssociation(Association)
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getProperty_OwningAssociation()
	 * @see org.csu.slicing.UML2WithID.Association#getOwnedEnd
	 * @model opposite="ownedEnd" transient="false" ordered="false"
	 * @generated
	 */
	Association getOwningAssociation();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.Property#getOwningAssociation <em>Owning Association</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Association</em>' container reference.
	 * @see #getOwningAssociation()
	 * @generated
	 */
	void setOwningAssociation(Association value);

	/**
	 * Returns the value of the '<em><b>Redefined Property</b></em>' reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2WithID.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Redefined Property</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Redefined Property</em>' reference list.
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getProperty_RedefinedProperty()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Property> getRedefinedProperty();

	/**
	 * Returns the value of the '<em><b>Subsetted Property</b></em>' reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2WithID.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subsetted Property</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subsetted Property</em>' reference list.
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getProperty_SubsettedProperty()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Property> getSubsettedProperty();

	/**
	 * Returns the value of the '<em><b>Datatype</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2WithID.DataType#getOwnedAttribute <em>Owned Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datatype</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datatype</em>' container reference.
	 * @see #setDatatype(DataType)
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getProperty_Datatype()
	 * @see org.csu.slicing.UML2WithID.DataType#getOwnedAttribute
	 * @model opposite="ownedAttribute" transient="false" ordered="false"
	 * @generated
	 */
	DataType getDatatype();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.Property#getDatatype <em>Datatype</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datatype</em>' container reference.
	 * @see #getDatatype()
	 * @generated
	 */
	void setDatatype(DataType value);

	/**
	 * Returns the value of the '<em><b>Association</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2WithID.Association#getMemberEnd <em>Member End</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association</em>' reference.
	 * @see #setAssociation(Association)
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getProperty_Association()
	 * @see org.csu.slicing.UML2WithID.Association#getMemberEnd
	 * @model opposite="memberEnd" ordered="false"
	 * @generated
	 */
	Association getAssociation();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.Property#getAssociation <em>Association</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Association</em>' reference.
	 * @see #getAssociation()
	 * @generated
	 */
	void setAssociation(Association value);

	/**
	 * Returns the value of the '<em><b>Aggregation</b></em>' attribute.
	 * The literals are from the enumeration {@link org.csu.slicing.UML2WithID.AggregationKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aggregation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregation</em>' attribute.
	 * @see org.csu.slicing.UML2WithID.AggregationKind
	 * @see #setAggregation(AggregationKind)
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getProperty_Aggregation()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	AggregationKind getAggregation();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.Property#getAggregation <em>Aggregation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregation</em>' attribute.
	 * @see org.csu.slicing.UML2WithID.AggregationKind
	 * @see #getAggregation()
	 * @generated
	 */
	void setAggregation(AggregationKind value);

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
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getProperty_DefaultValue()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	ValueSpecification getDefaultValue();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.Property#getDefaultValue <em>Default Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' containment reference.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(ValueSpecification value);

	/**
	 * Returns the value of the '<em><b>Qualifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2WithID.Property}.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2WithID.Property#getAssociationEnd <em>Association End</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualifier</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualifier</em>' containment reference list.
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getProperty_Qualifier()
	 * @see org.csu.slicing.UML2WithID.Property#getAssociationEnd
	 * @model opposite="associationEnd" containment="true"
	 * @generated
	 */
	EList<Property> getQualifier();

	/**
	 * Returns the value of the '<em><b>Association End</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2WithID.Property#getQualifier <em>Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association End</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association End</em>' container reference.
	 * @see #setAssociationEnd(Property)
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getProperty_AssociationEnd()
	 * @see org.csu.slicing.UML2WithID.Property#getQualifier
	 * @model opposite="qualifier" transient="false" ordered="false"
	 * @generated
	 */
	Property getAssociationEnd();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.Property#getAssociationEnd <em>Association End</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Association End</em>' container reference.
	 * @see #getAssociationEnd()
	 * @generated
	 */
	void setAssociationEnd(Property value);

} // Property

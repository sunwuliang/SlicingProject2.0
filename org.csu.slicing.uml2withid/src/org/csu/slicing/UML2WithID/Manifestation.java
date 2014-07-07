/**
 */
package org.csu.slicing.UML2WithID;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Manifestation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2WithID.Manifestation#getUtilizedElement <em>Utilized Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getManifestation()
 * @model
 * @generated
 */
public interface Manifestation extends Abstraction {
	/**
	 * Returns the value of the '<em><b>Utilized Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Utilized Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Utilized Element</em>' reference.
	 * @see #setUtilizedElement(PackageableElement)
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getManifestation_UtilizedElement()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	PackageableElement getUtilizedElement();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.Manifestation#getUtilizedElement <em>Utilized Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Utilized Element</em>' reference.
	 * @see #getUtilizedElement()
	 * @generated
	 */
	void setUtilizedElement(PackageableElement value);

} // Manifestation

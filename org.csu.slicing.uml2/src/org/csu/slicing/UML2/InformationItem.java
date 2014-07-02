/**
 */
package org.csu.slicing.UML2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Information Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2.InformationItem#getRepresented <em>Represented</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2.UML2Package#getInformationItem()
 * @model
 * @generated
 */
public interface InformationItem extends Classifier {
	/**
	 * Returns the value of the '<em><b>Represented</b></em>' reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2.Classifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Represented</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Represented</em>' reference list.
	 * @see org.csu.slicing.UML2.UML2Package#getInformationItem_Represented()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Classifier> getRepresented();

} // InformationItem

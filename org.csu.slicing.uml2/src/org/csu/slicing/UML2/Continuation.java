/**
 */
package org.csu.slicing.UML2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Continuation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2.Continuation#isSetting <em>Setting</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2.UML2Package#getContinuation()
 * @model
 * @generated
 */
public interface Continuation extends InteractionFragment {
	/**
	 * Returns the value of the '<em><b>Setting</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Setting</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Setting</em>' attribute.
	 * @see #setSetting(boolean)
	 * @see org.csu.slicing.UML2.UML2Package#getContinuation_Setting()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	boolean isSetting();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2.Continuation#isSetting <em>Setting</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Setting</em>' attribute.
	 * @see #isSetting()
	 * @generated
	 */
	void setSetting(boolean value);

} // Continuation

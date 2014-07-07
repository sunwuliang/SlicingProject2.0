/**
 */
package org.csu.slicing.UML2WithID;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>General Ordering</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2WithID.GeneralOrdering#getBefore <em>Before</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.GeneralOrdering#getAfter <em>After</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getGeneralOrdering()
 * @model
 * @generated
 */
public interface GeneralOrdering extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Before</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2WithID.EventOccurrence#getToAfter <em>To After</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Before</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Before</em>' reference.
	 * @see #setBefore(EventOccurrence)
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getGeneralOrdering_Before()
	 * @see org.csu.slicing.UML2WithID.EventOccurrence#getToAfter
	 * @model opposite="toAfter" required="true" ordered="false"
	 * @generated
	 */
	EventOccurrence getBefore();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.GeneralOrdering#getBefore <em>Before</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Before</em>' reference.
	 * @see #getBefore()
	 * @generated
	 */
	void setBefore(EventOccurrence value);

	/**
	 * Returns the value of the '<em><b>After</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2WithID.EventOccurrence#getToBefore <em>To Before</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>After</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>After</em>' reference.
	 * @see #setAfter(EventOccurrence)
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getGeneralOrdering_After()
	 * @see org.csu.slicing.UML2WithID.EventOccurrence#getToBefore
	 * @model opposite="toBefore" required="true" ordered="false"
	 * @generated
	 */
	EventOccurrence getAfter();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.GeneralOrdering#getAfter <em>After</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>After</em>' reference.
	 * @see #getAfter()
	 * @generated
	 */
	void setAfter(EventOccurrence value);

} // GeneralOrdering

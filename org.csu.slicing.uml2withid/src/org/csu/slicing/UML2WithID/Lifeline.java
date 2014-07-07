/**
 */
package org.csu.slicing.UML2WithID;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lifeline</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2WithID.Lifeline#getCoveredBy <em>Covered By</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.Lifeline#getRepresents <em>Represents</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.Lifeline#getInteraction <em>Interaction</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.Lifeline#getSelector <em>Selector</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.Lifeline#getDecomposedAs <em>Decomposed As</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getLifeline()
 * @model
 * @generated
 */
public interface Lifeline extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Covered By</b></em>' reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2WithID.InteractionFragment}.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2WithID.InteractionFragment#getCovered <em>Covered</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Covered By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Covered By</em>' reference list.
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getLifeline_CoveredBy()
	 * @see org.csu.slicing.UML2WithID.InteractionFragment#getCovered
	 * @model opposite="covered" ordered="false"
	 * @generated
	 */
	EList<InteractionFragment> getCoveredBy();

	/**
	 * Returns the value of the '<em><b>Represents</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Represents</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Represents</em>' reference.
	 * @see #setRepresents(ConnectableElement)
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getLifeline_Represents()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ConnectableElement getRepresents();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.Lifeline#getRepresents <em>Represents</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Represents</em>' reference.
	 * @see #getRepresents()
	 * @generated
	 */
	void setRepresents(ConnectableElement value);

	/**
	 * Returns the value of the '<em><b>Interaction</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2WithID.Interaction#getLifeline <em>Lifeline</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interaction</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interaction</em>' container reference.
	 * @see #setInteraction(Interaction)
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getLifeline_Interaction()
	 * @see org.csu.slicing.UML2WithID.Interaction#getLifeline
	 * @model opposite="lifeline" required="true" transient="false" ordered="false"
	 * @generated
	 */
	Interaction getInteraction();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.Lifeline#getInteraction <em>Interaction</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interaction</em>' container reference.
	 * @see #getInteraction()
	 * @generated
	 */
	void setInteraction(Interaction value);

	/**
	 * Returns the value of the '<em><b>Selector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selector</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selector</em>' containment reference.
	 * @see #setSelector(OpaqueExpression)
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getLifeline_Selector()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	OpaqueExpression getSelector();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.Lifeline#getSelector <em>Selector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selector</em>' containment reference.
	 * @see #getSelector()
	 * @generated
	 */
	void setSelector(OpaqueExpression value);

	/**
	 * Returns the value of the '<em><b>Decomposed As</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decomposed As</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decomposed As</em>' reference.
	 * @see #setDecomposedAs(PartDecomposition)
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getLifeline_DecomposedAs()
	 * @model ordered="false"
	 * @generated
	 */
	PartDecomposition getDecomposedAs();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.Lifeline#getDecomposedAs <em>Decomposed As</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decomposed As</em>' reference.
	 * @see #getDecomposedAs()
	 * @generated
	 */
	void setDecomposedAs(PartDecomposition value);

} // Lifeline

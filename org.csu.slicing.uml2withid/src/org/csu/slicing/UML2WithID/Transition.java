/**
 */
package org.csu.slicing.UML2WithID;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2WithID.Transition#getKind <em>Kind</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.Transition#getContainer <em>Container</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.Transition#getSource <em>Source</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.Transition#getTarget <em>Target</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.Transition#getRedefinedTransition <em>Redefined Transition</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.Transition#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.Transition#getGuard <em>Guard</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.Transition#getEffect <em>Effect</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends RedefinableElement {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.csu.slicing.UML2WithID.TransitionKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see org.csu.slicing.UML2WithID.TransitionKind
	 * @see #setKind(TransitionKind)
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getTransition_Kind()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	TransitionKind getKind();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.Transition#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see org.csu.slicing.UML2WithID.TransitionKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(TransitionKind value);

	/**
	 * Returns the value of the '<em><b>Container</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2WithID.Region#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' container reference.
	 * @see #setContainer(Region)
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getTransition_Container()
	 * @see org.csu.slicing.UML2WithID.Region#getTransition
	 * @model opposite="transition" required="true" transient="false" ordered="false"
	 * @generated
	 */
	Region getContainer();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.Transition#getContainer <em>Container</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' container reference.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(Region value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2WithID.Vertex#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Vertex)
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getTransition_Source()
	 * @see org.csu.slicing.UML2WithID.Vertex#getOutgoing
	 * @model opposite="outgoing" required="true" ordered="false"
	 * @generated
	 */
	Vertex getSource();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.Transition#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Vertex value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2WithID.Vertex#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Vertex)
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getTransition_Target()
	 * @see org.csu.slicing.UML2WithID.Vertex#getIncoming
	 * @model opposite="incoming" required="true" ordered="false"
	 * @generated
	 */
	Vertex getTarget();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.Transition#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Vertex value);

	/**
	 * Returns the value of the '<em><b>Redefined Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Redefined Transition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Redefined Transition</em>' reference.
	 * @see #setRedefinedTransition(Transition)
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getTransition_RedefinedTransition()
	 * @model ordered="false"
	 * @generated
	 */
	Transition getRedefinedTransition();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.Transition#getRedefinedTransition <em>Redefined Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Redefined Transition</em>' reference.
	 * @see #getRedefinedTransition()
	 * @generated
	 */
	void setRedefinedTransition(Transition value);

	/**
	 * Returns the value of the '<em><b>Trigger</b></em>' reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2WithID.Trigger}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trigger</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger</em>' reference list.
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getTransition_Trigger()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Trigger> getTrigger();

	/**
	 * Returns the value of the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guard</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard</em>' containment reference.
	 * @see #setGuard(Constraint)
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getTransition_Guard()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Constraint getGuard();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.Transition#getGuard <em>Guard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard</em>' containment reference.
	 * @see #getGuard()
	 * @generated
	 */
	void setGuard(Constraint value);

	/**
	 * Returns the value of the '<em><b>Effect</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effect</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effect</em>' containment reference.
	 * @see #setEffect(Activity)
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getTransition_Effect()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Activity getEffect();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.Transition#getEffect <em>Effect</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effect</em>' containment reference.
	 * @see #getEffect()
	 * @generated
	 */
	void setEffect(Activity value);

} // Transition

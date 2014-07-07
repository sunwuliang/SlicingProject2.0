/**
 */
package org.csu.slicing.UML2WithID;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behaviored Classifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2WithID.BehavioredClassifier#getOwnedBehavior <em>Owned Behavior</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.BehavioredClassifier#getClassifierBehavior <em>Classifier Behavior</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.BehavioredClassifier#getImplementation <em>Implementation</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.BehavioredClassifier#getOwnedTrigger <em>Owned Trigger</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.BehavioredClassifier#getOwnedStateMachine <em>Owned State Machine</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getBehavioredClassifier()
 * @model abstract="true"
 * @generated
 */
public interface BehavioredClassifier extends Classifier {
	/**
	 * Returns the value of the '<em><b>Owned Behavior</b></em>' containment reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2WithID.Behavior}.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2WithID.Behavior#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Behavior</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Behavior</em>' containment reference list.
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getBehavioredClassifier_OwnedBehavior()
	 * @see org.csu.slicing.UML2WithID.Behavior#getContext
	 * @model opposite="context" containment="true" ordered="false"
	 * @generated
	 */
	EList<Behavior> getOwnedBehavior();

	/**
	 * Returns the value of the '<em><b>Classifier Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classifier Behavior</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classifier Behavior</em>' reference.
	 * @see #setClassifierBehavior(Behavior)
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getBehavioredClassifier_ClassifierBehavior()
	 * @model ordered="false"
	 * @generated
	 */
	Behavior getClassifierBehavior();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.BehavioredClassifier#getClassifierBehavior <em>Classifier Behavior</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classifier Behavior</em>' reference.
	 * @see #getClassifierBehavior()
	 * @generated
	 */
	void setClassifierBehavior(Behavior value);

	/**
	 * Returns the value of the '<em><b>Implementation</b></em>' containment reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2WithID.Implementation}.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2WithID.Implementation#getImplementingClassifier <em>Implementing Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implementation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementation</em>' containment reference list.
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getBehavioredClassifier_Implementation()
	 * @see org.csu.slicing.UML2WithID.Implementation#getImplementingClassifier
	 * @model opposite="implementingClassifier" containment="true" ordered="false"
	 * @generated
	 */
	EList<Implementation> getImplementation();

	/**
	 * Returns the value of the '<em><b>Owned Trigger</b></em>' containment reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2WithID.Trigger}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Trigger</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Trigger</em>' containment reference list.
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getBehavioredClassifier_OwnedTrigger()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Trigger> getOwnedTrigger();

	/**
	 * Returns the value of the '<em><b>Owned State Machine</b></em>' containment reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2WithID.StateMachine}.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2WithID.StateMachine#getStateMachine_redefinitionContext <em>State Machine redefinition Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned State Machine</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned State Machine</em>' containment reference list.
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getBehavioredClassifier_OwnedStateMachine()
	 * @see org.csu.slicing.UML2WithID.StateMachine#getStateMachine_redefinitionContext
	 * @model opposite="stateMachine_redefinitionContext" containment="true" ordered="false"
	 * @generated
	 */
	EList<StateMachine> getOwnedStateMachine();

} // BehavioredClassifier

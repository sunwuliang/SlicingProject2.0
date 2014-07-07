/**
 */
package org.csu.slicing.UML2WithID;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signal Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2WithID.SignalTrigger#getSignal <em>Signal</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getSignalTrigger()
 * @model
 * @generated
 */
public interface SignalTrigger extends MessageTrigger {
	/**
	 * Returns the value of the '<em><b>Signal</b></em>' reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2WithID.Signal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signal</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signal</em>' reference list.
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getSignalTrigger_Signal()
	 * @model
	 * @generated
	 */
	EList<Signal> getSignal();

} // SignalTrigger

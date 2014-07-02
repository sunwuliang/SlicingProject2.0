/**
 */
package org.csu.slicing.UML2.impl;

import java.util.Collection;

import org.csu.slicing.UML2.Gate;
import org.csu.slicing.UML2.InputPin;
import org.csu.slicing.UML2.Interaction;
import org.csu.slicing.UML2.InteractionOccurrence;
import org.csu.slicing.UML2.UML2Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interaction Occurrence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2.impl.InteractionOccurrenceImpl#getRefersTo <em>Refers To</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.InteractionOccurrenceImpl#getActualGate <em>Actual Gate</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.InteractionOccurrenceImpl#getArgument <em>Argument</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InteractionOccurrenceImpl extends InteractionFragmentImpl implements InteractionOccurrence {
	/**
	 * The cached value of the '{@link #getRefersTo() <em>Refers To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefersTo()
	 * @generated
	 * @ordered
	 */
	protected Interaction refersTo;

	/**
	 * The cached value of the '{@link #getActualGate() <em>Actual Gate</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualGate()
	 * @generated
	 * @ordered
	 */
	protected EList<Gate> actualGate;

	/**
	 * The cached value of the '{@link #getArgument() <em>Argument</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgument()
	 * @generated
	 * @ordered
	 */
	protected EList<InputPin> argument;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InteractionOccurrenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UML2Package.eINSTANCE.getInteractionOccurrence();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interaction getRefersTo() {
		if (refersTo != null && refersTo.eIsProxy()) {
			InternalEObject oldRefersTo = (InternalEObject)refersTo;
			refersTo = (Interaction)eResolveProxy(oldRefersTo);
			if (refersTo != oldRefersTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2Package.INTERACTION_OCCURRENCE__REFERS_TO, oldRefersTo, refersTo));
			}
		}
		return refersTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interaction basicGetRefersTo() {
		return refersTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefersTo(Interaction newRefersTo) {
		Interaction oldRefersTo = refersTo;
		refersTo = newRefersTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.INTERACTION_OCCURRENCE__REFERS_TO, oldRefersTo, refersTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Gate> getActualGate() {
		if (actualGate == null) {
			actualGate = new EObjectContainmentEList<Gate>(Gate.class, this, UML2Package.INTERACTION_OCCURRENCE__ACTUAL_GATE);
		}
		return actualGate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputPin> getArgument() {
		if (argument == null) {
			argument = new EObjectContainmentEList<InputPin>(InputPin.class, this, UML2Package.INTERACTION_OCCURRENCE__ARGUMENT);
		}
		return argument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UML2Package.INTERACTION_OCCURRENCE__ACTUAL_GATE:
				return ((InternalEList<?>)getActualGate()).basicRemove(otherEnd, msgs);
			case UML2Package.INTERACTION_OCCURRENCE__ARGUMENT:
				return ((InternalEList<?>)getArgument()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UML2Package.INTERACTION_OCCURRENCE__REFERS_TO:
				if (resolve) return getRefersTo();
				return basicGetRefersTo();
			case UML2Package.INTERACTION_OCCURRENCE__ACTUAL_GATE:
				return getActualGate();
			case UML2Package.INTERACTION_OCCURRENCE__ARGUMENT:
				return getArgument();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UML2Package.INTERACTION_OCCURRENCE__REFERS_TO:
				setRefersTo((Interaction)newValue);
				return;
			case UML2Package.INTERACTION_OCCURRENCE__ACTUAL_GATE:
				getActualGate().clear();
				getActualGate().addAll((Collection<? extends Gate>)newValue);
				return;
			case UML2Package.INTERACTION_OCCURRENCE__ARGUMENT:
				getArgument().clear();
				getArgument().addAll((Collection<? extends InputPin>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case UML2Package.INTERACTION_OCCURRENCE__REFERS_TO:
				setRefersTo((Interaction)null);
				return;
			case UML2Package.INTERACTION_OCCURRENCE__ACTUAL_GATE:
				getActualGate().clear();
				return;
			case UML2Package.INTERACTION_OCCURRENCE__ARGUMENT:
				getArgument().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UML2Package.INTERACTION_OCCURRENCE__REFERS_TO:
				return refersTo != null;
			case UML2Package.INTERACTION_OCCURRENCE__ACTUAL_GATE:
				return actualGate != null && !actualGate.isEmpty();
			case UML2Package.INTERACTION_OCCURRENCE__ARGUMENT:
				return argument != null && !argument.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InteractionOccurrenceImpl

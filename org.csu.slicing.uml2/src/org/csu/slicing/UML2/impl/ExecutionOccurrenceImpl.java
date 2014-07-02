/**
 */
package org.csu.slicing.UML2.impl;

import java.util.Collection;

import org.csu.slicing.UML2.Behavior;
import org.csu.slicing.UML2.EventOccurrence;
import org.csu.slicing.UML2.ExecutionOccurrence;
import org.csu.slicing.UML2.UML2Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Execution Occurrence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2.impl.ExecutionOccurrenceImpl#getStart <em>Start</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.ExecutionOccurrenceImpl#getFinish <em>Finish</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.ExecutionOccurrenceImpl#getBehavior <em>Behavior</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExecutionOccurrenceImpl extends InteractionFragmentImpl implements ExecutionOccurrence {
	/**
	 * The cached value of the '{@link #getStart() <em>Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected EventOccurrence start;

	/**
	 * The cached value of the '{@link #getFinish() <em>Finish</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinish()
	 * @generated
	 * @ordered
	 */
	protected EventOccurrence finish;

	/**
	 * The cached value of the '{@link #getBehavior() <em>Behavior</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehavior()
	 * @generated
	 * @ordered
	 */
	protected EList<Behavior> behavior;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExecutionOccurrenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UML2Package.eINSTANCE.getExecutionOccurrence();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventOccurrence getStart() {
		if (start != null && start.eIsProxy()) {
			InternalEObject oldStart = (InternalEObject)start;
			start = (EventOccurrence)eResolveProxy(oldStart);
			if (start != oldStart) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2Package.EXECUTION_OCCURRENCE__START, oldStart, start));
			}
		}
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventOccurrence basicGetStart() {
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStart(EventOccurrence newStart, NotificationChain msgs) {
		EventOccurrence oldStart = start;
		start = newStart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UML2Package.EXECUTION_OCCURRENCE__START, oldStart, newStart);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStart(EventOccurrence newStart) {
		if (newStart != start) {
			NotificationChain msgs = null;
			if (start != null)
				msgs = ((InternalEObject)start).eInverseRemove(this, UML2Package.EVENT_OCCURRENCE__START_EXEC, EventOccurrence.class, msgs);
			if (newStart != null)
				msgs = ((InternalEObject)newStart).eInverseAdd(this, UML2Package.EVENT_OCCURRENCE__START_EXEC, EventOccurrence.class, msgs);
			msgs = basicSetStart(newStart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.EXECUTION_OCCURRENCE__START, newStart, newStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventOccurrence getFinish() {
		if (finish != null && finish.eIsProxy()) {
			InternalEObject oldFinish = (InternalEObject)finish;
			finish = (EventOccurrence)eResolveProxy(oldFinish);
			if (finish != oldFinish) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2Package.EXECUTION_OCCURRENCE__FINISH, oldFinish, finish));
			}
		}
		return finish;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventOccurrence basicGetFinish() {
		return finish;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFinish(EventOccurrence newFinish, NotificationChain msgs) {
		EventOccurrence oldFinish = finish;
		finish = newFinish;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UML2Package.EXECUTION_OCCURRENCE__FINISH, oldFinish, newFinish);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinish(EventOccurrence newFinish) {
		if (newFinish != finish) {
			NotificationChain msgs = null;
			if (finish != null)
				msgs = ((InternalEObject)finish).eInverseRemove(this, UML2Package.EVENT_OCCURRENCE__FINISH_EXEC, EventOccurrence.class, msgs);
			if (newFinish != null)
				msgs = ((InternalEObject)newFinish).eInverseAdd(this, UML2Package.EVENT_OCCURRENCE__FINISH_EXEC, EventOccurrence.class, msgs);
			msgs = basicSetFinish(newFinish, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.EXECUTION_OCCURRENCE__FINISH, newFinish, newFinish));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Behavior> getBehavior() {
		if (behavior == null) {
			behavior = new EObjectResolvingEList<Behavior>(Behavior.class, this, UML2Package.EXECUTION_OCCURRENCE__BEHAVIOR);
		}
		return behavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UML2Package.EXECUTION_OCCURRENCE__START:
				if (start != null)
					msgs = ((InternalEObject)start).eInverseRemove(this, UML2Package.EVENT_OCCURRENCE__START_EXEC, EventOccurrence.class, msgs);
				return basicSetStart((EventOccurrence)otherEnd, msgs);
			case UML2Package.EXECUTION_OCCURRENCE__FINISH:
				if (finish != null)
					msgs = ((InternalEObject)finish).eInverseRemove(this, UML2Package.EVENT_OCCURRENCE__FINISH_EXEC, EventOccurrence.class, msgs);
				return basicSetFinish((EventOccurrence)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UML2Package.EXECUTION_OCCURRENCE__START:
				return basicSetStart(null, msgs);
			case UML2Package.EXECUTION_OCCURRENCE__FINISH:
				return basicSetFinish(null, msgs);
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
			case UML2Package.EXECUTION_OCCURRENCE__START:
				if (resolve) return getStart();
				return basicGetStart();
			case UML2Package.EXECUTION_OCCURRENCE__FINISH:
				if (resolve) return getFinish();
				return basicGetFinish();
			case UML2Package.EXECUTION_OCCURRENCE__BEHAVIOR:
				return getBehavior();
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
			case UML2Package.EXECUTION_OCCURRENCE__START:
				setStart((EventOccurrence)newValue);
				return;
			case UML2Package.EXECUTION_OCCURRENCE__FINISH:
				setFinish((EventOccurrence)newValue);
				return;
			case UML2Package.EXECUTION_OCCURRENCE__BEHAVIOR:
				getBehavior().clear();
				getBehavior().addAll((Collection<? extends Behavior>)newValue);
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
			case UML2Package.EXECUTION_OCCURRENCE__START:
				setStart((EventOccurrence)null);
				return;
			case UML2Package.EXECUTION_OCCURRENCE__FINISH:
				setFinish((EventOccurrence)null);
				return;
			case UML2Package.EXECUTION_OCCURRENCE__BEHAVIOR:
				getBehavior().clear();
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
			case UML2Package.EXECUTION_OCCURRENCE__START:
				return start != null;
			case UML2Package.EXECUTION_OCCURRENCE__FINISH:
				return finish != null;
			case UML2Package.EXECUTION_OCCURRENCE__BEHAVIOR:
				return behavior != null && !behavior.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ExecutionOccurrenceImpl

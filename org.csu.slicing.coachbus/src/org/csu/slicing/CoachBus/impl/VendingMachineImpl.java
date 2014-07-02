/**
 */
package org.csu.slicing.CoachBus.impl;

import java.util.Collection;

import org.csu.slicing.CoachBus.BookingOffice;
import org.csu.slicing.CoachBus.CoachBusPackage;
import org.csu.slicing.CoachBus.Ticket;
import org.csu.slicing.CoachBus.VendingMachine;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vending Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.csu.slicing.CoachBus.impl.VendingMachineImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link org.csu.slicing.CoachBus.impl.VendingMachineImpl#getTickets <em>Tickets</em>}</li>
 *   <li>{@link org.csu.slicing.CoachBus.impl.VendingMachineImpl#getOffice <em>Office</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VendingMachineImpl extends EObjectImpl implements VendingMachine {
	/**
	 * The default value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected int number = NUMBER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTickets() <em>Tickets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTickets()
	 * @generated
	 * @ordered
	 */
	protected EList<Ticket> tickets;

	/**
	 * The cached value of the '{@link #getOffice() <em>Office</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffice()
	 * @generated
	 * @ordered
	 */
	protected BookingOffice office;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VendingMachineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoachBusPackage.Literals.VENDING_MACHINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumber(int newNumber) {
		int oldNumber = number;
		number = newNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoachBusPackage.VENDING_MACHINE__NUMBER, oldNumber, number));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Ticket> getTickets() {
		if (tickets == null) {
			tickets = new EObjectWithInverseResolvingEList<Ticket>(Ticket.class, this, CoachBusPackage.VENDING_MACHINE__TICKETS, CoachBusPackage.TICKET__VM);
		}
		return tickets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookingOffice getOffice() {
		if (office != null && office.eIsProxy()) {
			InternalEObject oldOffice = (InternalEObject)office;
			office = (BookingOffice)eResolveProxy(oldOffice);
			if (office != oldOffice) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CoachBusPackage.VENDING_MACHINE__OFFICE, oldOffice, office));
			}
		}
		return office;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookingOffice basicGetOffice() {
		return office;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOffice(BookingOffice newOffice, NotificationChain msgs) {
		BookingOffice oldOffice = office;
		office = newOffice;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CoachBusPackage.VENDING_MACHINE__OFFICE, oldOffice, newOffice);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOffice(BookingOffice newOffice) {
		if (newOffice != office) {
			NotificationChain msgs = null;
			if (office != null)
				msgs = ((InternalEObject)office).eInverseRemove(this, CoachBusPackage.BOOKING_OFFICE__VMS, BookingOffice.class, msgs);
			if (newOffice != null)
				msgs = ((InternalEObject)newOffice).eInverseAdd(this, CoachBusPackage.BOOKING_OFFICE__VMS, BookingOffice.class, msgs);
			msgs = basicSetOffice(newOffice, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoachBusPackage.VENDING_MACHINE__OFFICE, newOffice, newOffice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CoachBusPackage.VENDING_MACHINE__TICKETS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTickets()).basicAdd(otherEnd, msgs);
			case CoachBusPackage.VENDING_MACHINE__OFFICE:
				if (office != null)
					msgs = ((InternalEObject)office).eInverseRemove(this, CoachBusPackage.BOOKING_OFFICE__VMS, BookingOffice.class, msgs);
				return basicSetOffice((BookingOffice)otherEnd, msgs);
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
			case CoachBusPackage.VENDING_MACHINE__TICKETS:
				return ((InternalEList<?>)getTickets()).basicRemove(otherEnd, msgs);
			case CoachBusPackage.VENDING_MACHINE__OFFICE:
				return basicSetOffice(null, msgs);
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
			case CoachBusPackage.VENDING_MACHINE__NUMBER:
				return getNumber();
			case CoachBusPackage.VENDING_MACHINE__TICKETS:
				return getTickets();
			case CoachBusPackage.VENDING_MACHINE__OFFICE:
				if (resolve) return getOffice();
				return basicGetOffice();
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
			case CoachBusPackage.VENDING_MACHINE__NUMBER:
				setNumber((Integer)newValue);
				return;
			case CoachBusPackage.VENDING_MACHINE__TICKETS:
				getTickets().clear();
				getTickets().addAll((Collection<? extends Ticket>)newValue);
				return;
			case CoachBusPackage.VENDING_MACHINE__OFFICE:
				setOffice((BookingOffice)newValue);
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
			case CoachBusPackage.VENDING_MACHINE__NUMBER:
				setNumber(NUMBER_EDEFAULT);
				return;
			case CoachBusPackage.VENDING_MACHINE__TICKETS:
				getTickets().clear();
				return;
			case CoachBusPackage.VENDING_MACHINE__OFFICE:
				setOffice((BookingOffice)null);
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
			case CoachBusPackage.VENDING_MACHINE__NUMBER:
				return number != NUMBER_EDEFAULT;
			case CoachBusPackage.VENDING_MACHINE__TICKETS:
				return tickets != null && !tickets.isEmpty();
			case CoachBusPackage.VENDING_MACHINE__OFFICE:
				return office != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (number: ");
		result.append(number);
		result.append(')');
		return result.toString();
	}

} //VendingMachineImpl

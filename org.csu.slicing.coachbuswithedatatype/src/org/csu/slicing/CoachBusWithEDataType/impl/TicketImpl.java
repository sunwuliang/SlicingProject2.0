/**
 */
package org.csu.slicing.CoachBusWithEDataType.impl;

import org.csu.slicing.CoachBusWithEDataType.CoachBusWithEDataTypePackage;
import org.csu.slicing.CoachBusWithEDataType.Passenger;
import org.csu.slicing.CoachBusWithEDataType.Ticket;
import org.csu.slicing.CoachBusWithEDataType.VendingMachine;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ticket</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.csu.slicing.CoachBusWithEDataType.impl.TicketImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link org.csu.slicing.CoachBusWithEDataType.impl.TicketImpl#getPrice <em>Price</em>}</li>
 *   <li>{@link org.csu.slicing.CoachBusWithEDataType.impl.TicketImpl#isIsRoundTrip <em>Is Round Trip</em>}</li>
 *   <li>{@link org.csu.slicing.CoachBusWithEDataType.impl.TicketImpl#getPsg <em>Psg</em>}</li>
 *   <li>{@link org.csu.slicing.CoachBusWithEDataType.impl.TicketImpl#getVm <em>Vm</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TicketImpl extends EObjectImpl implements Ticket {
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
	 * The default value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected static final double PRICE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected double price = PRICE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsRoundTrip() <em>Is Round Trip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsRoundTrip()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ROUND_TRIP_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsRoundTrip() <em>Is Round Trip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsRoundTrip()
	 * @generated
	 * @ordered
	 */
	protected boolean isRoundTrip = IS_ROUND_TRIP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPsg() <em>Psg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPsg()
	 * @generated
	 * @ordered
	 */
	protected Passenger psg;

	/**
	 * The cached value of the '{@link #getVm() <em>Vm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVm()
	 * @generated
	 * @ordered
	 */
	protected VendingMachine vm;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TicketImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoachBusWithEDataTypePackage.Literals.TICKET;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CoachBusWithEDataTypePackage.TICKET__NUMBER, oldNumber, number));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrice(double newPrice) {
		double oldPrice = price;
		price = newPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoachBusWithEDataTypePackage.TICKET__PRICE, oldPrice, price));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsRoundTrip() {
		return isRoundTrip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsRoundTrip(boolean newIsRoundTrip) {
		boolean oldIsRoundTrip = isRoundTrip;
		isRoundTrip = newIsRoundTrip;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoachBusWithEDataTypePackage.TICKET__IS_ROUND_TRIP, oldIsRoundTrip, isRoundTrip));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Passenger getPsg() {
		if (psg != null && psg.eIsProxy()) {
			InternalEObject oldPsg = (InternalEObject)psg;
			psg = (Passenger)eResolveProxy(oldPsg);
			if (psg != oldPsg) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CoachBusWithEDataTypePackage.TICKET__PSG, oldPsg, psg));
			}
		}
		return psg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Passenger basicGetPsg() {
		return psg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPsg(Passenger newPsg, NotificationChain msgs) {
		Passenger oldPsg = psg;
		psg = newPsg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CoachBusWithEDataTypePackage.TICKET__PSG, oldPsg, newPsg);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPsg(Passenger newPsg) {
		if (newPsg != psg) {
			NotificationChain msgs = null;
			if (psg != null)
				msgs = ((InternalEObject)psg).eInverseRemove(this, CoachBusWithEDataTypePackage.PASSENGER__TICKETS, Passenger.class, msgs);
			if (newPsg != null)
				msgs = ((InternalEObject)newPsg).eInverseAdd(this, CoachBusWithEDataTypePackage.PASSENGER__TICKETS, Passenger.class, msgs);
			msgs = basicSetPsg(newPsg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoachBusWithEDataTypePackage.TICKET__PSG, newPsg, newPsg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VendingMachine getVm() {
		if (vm != null && vm.eIsProxy()) {
			InternalEObject oldVm = (InternalEObject)vm;
			vm = (VendingMachine)eResolveProxy(oldVm);
			if (vm != oldVm) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CoachBusWithEDataTypePackage.TICKET__VM, oldVm, vm));
			}
		}
		return vm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VendingMachine basicGetVm() {
		return vm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVm(VendingMachine newVm, NotificationChain msgs) {
		VendingMachine oldVm = vm;
		vm = newVm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CoachBusWithEDataTypePackage.TICKET__VM, oldVm, newVm);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVm(VendingMachine newVm) {
		if (newVm != vm) {
			NotificationChain msgs = null;
			if (vm != null)
				msgs = ((InternalEObject)vm).eInverseRemove(this, CoachBusWithEDataTypePackage.VENDING_MACHINE__TICKETS, VendingMachine.class, msgs);
			if (newVm != null)
				msgs = ((InternalEObject)newVm).eInverseAdd(this, CoachBusWithEDataTypePackage.VENDING_MACHINE__TICKETS, VendingMachine.class, msgs);
			msgs = basicSetVm(newVm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoachBusWithEDataTypePackage.TICKET__VM, newVm, newVm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CoachBusWithEDataTypePackage.TICKET__PSG:
				if (psg != null)
					msgs = ((InternalEObject)psg).eInverseRemove(this, CoachBusWithEDataTypePackage.PASSENGER__TICKETS, Passenger.class, msgs);
				return basicSetPsg((Passenger)otherEnd, msgs);
			case CoachBusWithEDataTypePackage.TICKET__VM:
				if (vm != null)
					msgs = ((InternalEObject)vm).eInverseRemove(this, CoachBusWithEDataTypePackage.VENDING_MACHINE__TICKETS, VendingMachine.class, msgs);
				return basicSetVm((VendingMachine)otherEnd, msgs);
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
			case CoachBusWithEDataTypePackage.TICKET__PSG:
				return basicSetPsg(null, msgs);
			case CoachBusWithEDataTypePackage.TICKET__VM:
				return basicSetVm(null, msgs);
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
			case CoachBusWithEDataTypePackage.TICKET__NUMBER:
				return getNumber();
			case CoachBusWithEDataTypePackage.TICKET__PRICE:
				return getPrice();
			case CoachBusWithEDataTypePackage.TICKET__IS_ROUND_TRIP:
				return isIsRoundTrip();
			case CoachBusWithEDataTypePackage.TICKET__PSG:
				if (resolve) return getPsg();
				return basicGetPsg();
			case CoachBusWithEDataTypePackage.TICKET__VM:
				if (resolve) return getVm();
				return basicGetVm();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CoachBusWithEDataTypePackage.TICKET__NUMBER:
				setNumber((Integer)newValue);
				return;
			case CoachBusWithEDataTypePackage.TICKET__PRICE:
				setPrice((Double)newValue);
				return;
			case CoachBusWithEDataTypePackage.TICKET__IS_ROUND_TRIP:
				setIsRoundTrip((Boolean)newValue);
				return;
			case CoachBusWithEDataTypePackage.TICKET__PSG:
				setPsg((Passenger)newValue);
				return;
			case CoachBusWithEDataTypePackage.TICKET__VM:
				setVm((VendingMachine)newValue);
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
			case CoachBusWithEDataTypePackage.TICKET__NUMBER:
				setNumber(NUMBER_EDEFAULT);
				return;
			case CoachBusWithEDataTypePackage.TICKET__PRICE:
				setPrice(PRICE_EDEFAULT);
				return;
			case CoachBusWithEDataTypePackage.TICKET__IS_ROUND_TRIP:
				setIsRoundTrip(IS_ROUND_TRIP_EDEFAULT);
				return;
			case CoachBusWithEDataTypePackage.TICKET__PSG:
				setPsg((Passenger)null);
				return;
			case CoachBusWithEDataTypePackage.TICKET__VM:
				setVm((VendingMachine)null);
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
			case CoachBusWithEDataTypePackage.TICKET__NUMBER:
				return number != NUMBER_EDEFAULT;
			case CoachBusWithEDataTypePackage.TICKET__PRICE:
				return price != PRICE_EDEFAULT;
			case CoachBusWithEDataTypePackage.TICKET__IS_ROUND_TRIP:
				return isRoundTrip != IS_ROUND_TRIP_EDEFAULT;
			case CoachBusWithEDataTypePackage.TICKET__PSG:
				return psg != null;
			case CoachBusWithEDataTypePackage.TICKET__VM:
				return vm != null;
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
		result.append(", price: ");
		result.append(price);
		result.append(", isRoundTrip: ");
		result.append(isRoundTrip);
		result.append(')');
		return result.toString();
	}

} //TicketImpl

/**
 */
package org.csu.slicing.UML2.impl;

import java.util.Collection;

import org.csu.slicing.UML2.Interface;
import org.csu.slicing.UML2.Port;
import org.csu.slicing.UML2.ProtocolStateMachine;
import org.csu.slicing.UML2.UML2Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2.impl.PortImpl#isIsBehavior <em>Is Behavior</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.PortImpl#isIsService <em>Is Service</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.PortImpl#getRequired <em>Required</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.PortImpl#getRedefinedPort <em>Redefined Port</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.PortImpl#getProvided <em>Provided</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.PortImpl#getProtocol <em>Protocol</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PortImpl extends PropertyImpl implements Port {
	/**
	 * The default value of the '{@link #isIsBehavior() <em>Is Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsBehavior()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_BEHAVIOR_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsBehavior() <em>Is Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsBehavior()
	 * @generated
	 * @ordered
	 */
	protected boolean isBehavior = IS_BEHAVIOR_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsService() <em>Is Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsService()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_SERVICE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsService() <em>Is Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsService()
	 * @generated
	 * @ordered
	 */
	protected boolean isService = IS_SERVICE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRequired() <em>Required</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequired()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface> required;

	/**
	 * The cached value of the '{@link #getRedefinedPort() <em>Redefined Port</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinedPort()
	 * @generated
	 * @ordered
	 */
	protected EList<Port> redefinedPort;

	/**
	 * The cached value of the '{@link #getProvided() <em>Provided</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvided()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface> provided;

	/**
	 * The cached value of the '{@link #getProtocol() <em>Protocol</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected ProtocolStateMachine protocol;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UML2Package.eINSTANCE.getPort();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsBehavior() {
		return isBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsBehavior(boolean newIsBehavior) {
		boolean oldIsBehavior = isBehavior;
		isBehavior = newIsBehavior;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.PORT__IS_BEHAVIOR, oldIsBehavior, isBehavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsService() {
		return isService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsService(boolean newIsService) {
		boolean oldIsService = isService;
		isService = newIsService;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.PORT__IS_SERVICE, oldIsService, isService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> getRequired() {
		if (required == null) {
			required = new EObjectResolvingEList<Interface>(Interface.class, this, UML2Package.PORT__REQUIRED);
		}
		return required;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Port> getRedefinedPort() {
		if (redefinedPort == null) {
			redefinedPort = new EObjectResolvingEList<Port>(Port.class, this, UML2Package.PORT__REDEFINED_PORT);
		}
		return redefinedPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> getProvided() {
		if (provided == null) {
			provided = new EObjectResolvingEList<Interface>(Interface.class, this, UML2Package.PORT__PROVIDED);
		}
		return provided;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolStateMachine getProtocol() {
		if (protocol != null && protocol.eIsProxy()) {
			InternalEObject oldProtocol = (InternalEObject)protocol;
			protocol = (ProtocolStateMachine)eResolveProxy(oldProtocol);
			if (protocol != oldProtocol) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2Package.PORT__PROTOCOL, oldProtocol, protocol));
			}
		}
		return protocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolStateMachine basicGetProtocol() {
		return protocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtocol(ProtocolStateMachine newProtocol) {
		ProtocolStateMachine oldProtocol = protocol;
		protocol = newProtocol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.PORT__PROTOCOL, oldProtocol, protocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UML2Package.PORT__IS_BEHAVIOR:
				return isIsBehavior();
			case UML2Package.PORT__IS_SERVICE:
				return isIsService();
			case UML2Package.PORT__REQUIRED:
				return getRequired();
			case UML2Package.PORT__REDEFINED_PORT:
				return getRedefinedPort();
			case UML2Package.PORT__PROVIDED:
				return getProvided();
			case UML2Package.PORT__PROTOCOL:
				if (resolve) return getProtocol();
				return basicGetProtocol();
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
			case UML2Package.PORT__IS_BEHAVIOR:
				setIsBehavior((Boolean)newValue);
				return;
			case UML2Package.PORT__IS_SERVICE:
				setIsService((Boolean)newValue);
				return;
			case UML2Package.PORT__REQUIRED:
				getRequired().clear();
				getRequired().addAll((Collection<? extends Interface>)newValue);
				return;
			case UML2Package.PORT__REDEFINED_PORT:
				getRedefinedPort().clear();
				getRedefinedPort().addAll((Collection<? extends Port>)newValue);
				return;
			case UML2Package.PORT__PROVIDED:
				getProvided().clear();
				getProvided().addAll((Collection<? extends Interface>)newValue);
				return;
			case UML2Package.PORT__PROTOCOL:
				setProtocol((ProtocolStateMachine)newValue);
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
			case UML2Package.PORT__IS_BEHAVIOR:
				setIsBehavior(IS_BEHAVIOR_EDEFAULT);
				return;
			case UML2Package.PORT__IS_SERVICE:
				setIsService(IS_SERVICE_EDEFAULT);
				return;
			case UML2Package.PORT__REQUIRED:
				getRequired().clear();
				return;
			case UML2Package.PORT__REDEFINED_PORT:
				getRedefinedPort().clear();
				return;
			case UML2Package.PORT__PROVIDED:
				getProvided().clear();
				return;
			case UML2Package.PORT__PROTOCOL:
				setProtocol((ProtocolStateMachine)null);
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
			case UML2Package.PORT__IS_BEHAVIOR:
				return isBehavior != IS_BEHAVIOR_EDEFAULT;
			case UML2Package.PORT__IS_SERVICE:
				return isService != IS_SERVICE_EDEFAULT;
			case UML2Package.PORT__REQUIRED:
				return required != null && !required.isEmpty();
			case UML2Package.PORT__REDEFINED_PORT:
				return redefinedPort != null && !redefinedPort.isEmpty();
			case UML2Package.PORT__PROVIDED:
				return provided != null && !provided.isEmpty();
			case UML2Package.PORT__PROTOCOL:
				return protocol != null;
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
		result.append(" (isBehavior: ");
		result.append(isBehavior);
		result.append(", isService: ");
		result.append(isService);
		result.append(')');
		return result.toString();
	}

} //PortImpl

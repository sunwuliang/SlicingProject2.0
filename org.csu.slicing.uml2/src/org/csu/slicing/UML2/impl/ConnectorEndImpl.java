/**
 */
package org.csu.slicing.UML2.impl;

import org.csu.slicing.UML2.ConnectableElement;
import org.csu.slicing.UML2.ConnectorEnd;
import org.csu.slicing.UML2.Property;
import org.csu.slicing.UML2.UML2Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connector End</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2.impl.ConnectorEndImpl#getDefiningEnd <em>Defining End</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.ConnectorEndImpl#getRole <em>Role</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.ConnectorEndImpl#getPartWithPort <em>Part With Port</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConnectorEndImpl extends MultiplicityElementImpl implements ConnectorEnd {
	/**
	 * The cached value of the '{@link #getDefiningEnd() <em>Defining End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefiningEnd()
	 * @generated
	 * @ordered
	 */
	protected Property definingEnd;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected ConnectableElement role;

	/**
	 * The cached value of the '{@link #getPartWithPort() <em>Part With Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartWithPort()
	 * @generated
	 * @ordered
	 */
	protected Property partWithPort;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectorEndImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UML2Package.eINSTANCE.getConnectorEnd();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getDefiningEnd() {
		if (definingEnd != null && definingEnd.eIsProxy()) {
			InternalEObject oldDefiningEnd = (InternalEObject)definingEnd;
			definingEnd = (Property)eResolveProxy(oldDefiningEnd);
			if (definingEnd != oldDefiningEnd) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2Package.CONNECTOR_END__DEFINING_END, oldDefiningEnd, definingEnd));
			}
		}
		return definingEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property basicGetDefiningEnd() {
		return definingEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefiningEnd(Property newDefiningEnd) {
		Property oldDefiningEnd = definingEnd;
		definingEnd = newDefiningEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.CONNECTOR_END__DEFINING_END, oldDefiningEnd, definingEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectableElement getRole() {
		if (role != null && role.eIsProxy()) {
			InternalEObject oldRole = (InternalEObject)role;
			role = (ConnectableElement)eResolveProxy(oldRole);
			if (role != oldRole) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2Package.CONNECTOR_END__ROLE, oldRole, role));
			}
		}
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectableElement basicGetRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRole(ConnectableElement newRole, NotificationChain msgs) {
		ConnectableElement oldRole = role;
		role = newRole;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UML2Package.CONNECTOR_END__ROLE, oldRole, newRole);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole(ConnectableElement newRole) {
		if (newRole != role) {
			NotificationChain msgs = null;
			if (role != null)
				msgs = ((InternalEObject)role).eInverseRemove(this, UML2Package.CONNECTABLE_ELEMENT__END, ConnectableElement.class, msgs);
			if (newRole != null)
				msgs = ((InternalEObject)newRole).eInverseAdd(this, UML2Package.CONNECTABLE_ELEMENT__END, ConnectableElement.class, msgs);
			msgs = basicSetRole(newRole, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.CONNECTOR_END__ROLE, newRole, newRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getPartWithPort() {
		if (partWithPort != null && partWithPort.eIsProxy()) {
			InternalEObject oldPartWithPort = (InternalEObject)partWithPort;
			partWithPort = (Property)eResolveProxy(oldPartWithPort);
			if (partWithPort != oldPartWithPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2Package.CONNECTOR_END__PART_WITH_PORT, oldPartWithPort, partWithPort));
			}
		}
		return partWithPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property basicGetPartWithPort() {
		return partWithPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartWithPort(Property newPartWithPort) {
		Property oldPartWithPort = partWithPort;
		partWithPort = newPartWithPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.CONNECTOR_END__PART_WITH_PORT, oldPartWithPort, partWithPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UML2Package.CONNECTOR_END__ROLE:
				if (role != null)
					msgs = ((InternalEObject)role).eInverseRemove(this, UML2Package.CONNECTABLE_ELEMENT__END, ConnectableElement.class, msgs);
				return basicSetRole((ConnectableElement)otherEnd, msgs);
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
			case UML2Package.CONNECTOR_END__ROLE:
				return basicSetRole(null, msgs);
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
			case UML2Package.CONNECTOR_END__DEFINING_END:
				if (resolve) return getDefiningEnd();
				return basicGetDefiningEnd();
			case UML2Package.CONNECTOR_END__ROLE:
				if (resolve) return getRole();
				return basicGetRole();
			case UML2Package.CONNECTOR_END__PART_WITH_PORT:
				if (resolve) return getPartWithPort();
				return basicGetPartWithPort();
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
			case UML2Package.CONNECTOR_END__DEFINING_END:
				setDefiningEnd((Property)newValue);
				return;
			case UML2Package.CONNECTOR_END__ROLE:
				setRole((ConnectableElement)newValue);
				return;
			case UML2Package.CONNECTOR_END__PART_WITH_PORT:
				setPartWithPort((Property)newValue);
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
			case UML2Package.CONNECTOR_END__DEFINING_END:
				setDefiningEnd((Property)null);
				return;
			case UML2Package.CONNECTOR_END__ROLE:
				setRole((ConnectableElement)null);
				return;
			case UML2Package.CONNECTOR_END__PART_WITH_PORT:
				setPartWithPort((Property)null);
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
			case UML2Package.CONNECTOR_END__DEFINING_END:
				return definingEnd != null;
			case UML2Package.CONNECTOR_END__ROLE:
				return role != null;
			case UML2Package.CONNECTOR_END__PART_WITH_PORT:
				return partWithPort != null;
		}
		return super.eIsSet(featureID);
	}

} //ConnectorEndImpl

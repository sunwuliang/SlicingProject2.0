/**
 */
package org.csu.slicing.UML2.impl;

import org.csu.slicing.UML2.Extension;
import org.csu.slicing.UML2.UML2Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extension</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2.impl.ExtensionImpl#isIsRequired <em>Is Required</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.ExtensionImpl#getMetaclass <em>Metaclass</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExtensionImpl extends AssociationImpl implements Extension {
	/**
	 * The default value of the '{@link #isIsRequired() <em>Is Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsRequired()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_REQUIRED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsRequired() <em>Is Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsRequired()
	 * @generated
	 * @ordered
	 */
	protected boolean isRequired = IS_REQUIRED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMetaclass() <em>Metaclass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaclass()
	 * @generated
	 * @ordered
	 */
	protected org.csu.slicing.UML2.Class metaclass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtensionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UML2Package.eINSTANCE.getExtension();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsRequired() {
		return isRequired;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsRequired(boolean newIsRequired) {
		boolean oldIsRequired = isRequired;
		isRequired = newIsRequired;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.EXTENSION__IS_REQUIRED, oldIsRequired, isRequired));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.csu.slicing.UML2.Class getMetaclass() {
		if (metaclass != null && metaclass.eIsProxy()) {
			InternalEObject oldMetaclass = (InternalEObject)metaclass;
			metaclass = (org.csu.slicing.UML2.Class)eResolveProxy(oldMetaclass);
			if (metaclass != oldMetaclass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2Package.EXTENSION__METACLASS, oldMetaclass, metaclass));
			}
		}
		return metaclass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.csu.slicing.UML2.Class basicGetMetaclass() {
		return metaclass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMetaclass(org.csu.slicing.UML2.Class newMetaclass, NotificationChain msgs) {
		org.csu.slicing.UML2.Class oldMetaclass = metaclass;
		metaclass = newMetaclass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UML2Package.EXTENSION__METACLASS, oldMetaclass, newMetaclass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetaclass(org.csu.slicing.UML2.Class newMetaclass) {
		if (newMetaclass != metaclass) {
			NotificationChain msgs = null;
			if (metaclass != null)
				msgs = ((InternalEObject)metaclass).eInverseRemove(this, UML2Package.CLASS__EXTENSION, org.csu.slicing.UML2.Class.class, msgs);
			if (newMetaclass != null)
				msgs = ((InternalEObject)newMetaclass).eInverseAdd(this, UML2Package.CLASS__EXTENSION, org.csu.slicing.UML2.Class.class, msgs);
			msgs = basicSetMetaclass(newMetaclass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.EXTENSION__METACLASS, newMetaclass, newMetaclass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UML2Package.EXTENSION__METACLASS:
				if (metaclass != null)
					msgs = ((InternalEObject)metaclass).eInverseRemove(this, UML2Package.CLASS__EXTENSION, org.csu.slicing.UML2.Class.class, msgs);
				return basicSetMetaclass((org.csu.slicing.UML2.Class)otherEnd, msgs);
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
			case UML2Package.EXTENSION__METACLASS:
				return basicSetMetaclass(null, msgs);
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
			case UML2Package.EXTENSION__IS_REQUIRED:
				return isIsRequired();
			case UML2Package.EXTENSION__METACLASS:
				if (resolve) return getMetaclass();
				return basicGetMetaclass();
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
			case UML2Package.EXTENSION__IS_REQUIRED:
				setIsRequired((Boolean)newValue);
				return;
			case UML2Package.EXTENSION__METACLASS:
				setMetaclass((org.csu.slicing.UML2.Class)newValue);
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
			case UML2Package.EXTENSION__IS_REQUIRED:
				setIsRequired(IS_REQUIRED_EDEFAULT);
				return;
			case UML2Package.EXTENSION__METACLASS:
				setMetaclass((org.csu.slicing.UML2.Class)null);
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
			case UML2Package.EXTENSION__IS_REQUIRED:
				return isRequired != IS_REQUIRED_EDEFAULT;
			case UML2Package.EXTENSION__METACLASS:
				return metaclass != null;
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
		result.append(" (isRequired: ");
		result.append(isRequired);
		result.append(')');
		return result.toString();
	}

} //ExtensionImpl

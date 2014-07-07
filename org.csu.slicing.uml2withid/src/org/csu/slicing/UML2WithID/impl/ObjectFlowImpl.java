/**
 */
package org.csu.slicing.UML2WithID.impl;

import org.csu.slicing.UML2WithID.Behavior;
import org.csu.slicing.UML2WithID.ObjectFlow;
import org.csu.slicing.UML2WithID.UML2WithIDPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Flow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.ObjectFlowImpl#isIsMulticast <em>Is Multicast</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.ObjectFlowImpl#isIsMultireceive <em>Is Multireceive</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.ObjectFlowImpl#getTransformation <em>Transformation</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.ObjectFlowImpl#getSelection <em>Selection</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObjectFlowImpl extends ActivityEdgeImpl implements ObjectFlow {
	/**
	 * The default value of the '{@link #isIsMulticast() <em>Is Multicast</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMulticast()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_MULTICAST_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsMulticast() <em>Is Multicast</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMulticast()
	 * @generated
	 * @ordered
	 */
	protected boolean isMulticast = IS_MULTICAST_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsMultireceive() <em>Is Multireceive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMultireceive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_MULTIRECEIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsMultireceive() <em>Is Multireceive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMultireceive()
	 * @generated
	 * @ordered
	 */
	protected boolean isMultireceive = IS_MULTIRECEIVE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTransformation() <em>Transformation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformation()
	 * @generated
	 * @ordered
	 */
	protected Behavior transformation;

	/**
	 * The cached value of the '{@link #getSelection() <em>Selection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelection()
	 * @generated
	 * @ordered
	 */
	protected Behavior selection;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectFlowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UML2WithIDPackage.eINSTANCE.getObjectFlow();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsMulticast() {
		return isMulticast;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsMulticast(boolean newIsMulticast) {
		boolean oldIsMulticast = isMulticast;
		isMulticast = newIsMulticast;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2WithIDPackage.OBJECT_FLOW__IS_MULTICAST, oldIsMulticast, isMulticast));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsMultireceive() {
		return isMultireceive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsMultireceive(boolean newIsMultireceive) {
		boolean oldIsMultireceive = isMultireceive;
		isMultireceive = newIsMultireceive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2WithIDPackage.OBJECT_FLOW__IS_MULTIRECEIVE, oldIsMultireceive, isMultireceive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior getTransformation() {
		if (transformation != null && transformation.eIsProxy()) {
			InternalEObject oldTransformation = (InternalEObject)transformation;
			transformation = (Behavior)eResolveProxy(oldTransformation);
			if (transformation != oldTransformation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2WithIDPackage.OBJECT_FLOW__TRANSFORMATION, oldTransformation, transformation));
			}
		}
		return transformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior basicGetTransformation() {
		return transformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransformation(Behavior newTransformation) {
		Behavior oldTransformation = transformation;
		transformation = newTransformation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2WithIDPackage.OBJECT_FLOW__TRANSFORMATION, oldTransformation, transformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior getSelection() {
		if (selection != null && selection.eIsProxy()) {
			InternalEObject oldSelection = (InternalEObject)selection;
			selection = (Behavior)eResolveProxy(oldSelection);
			if (selection != oldSelection) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2WithIDPackage.OBJECT_FLOW__SELECTION, oldSelection, selection));
			}
		}
		return selection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior basicGetSelection() {
		return selection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelection(Behavior newSelection) {
		Behavior oldSelection = selection;
		selection = newSelection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2WithIDPackage.OBJECT_FLOW__SELECTION, oldSelection, selection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UML2WithIDPackage.OBJECT_FLOW__IS_MULTICAST:
				return isIsMulticast();
			case UML2WithIDPackage.OBJECT_FLOW__IS_MULTIRECEIVE:
				return isIsMultireceive();
			case UML2WithIDPackage.OBJECT_FLOW__TRANSFORMATION:
				if (resolve) return getTransformation();
				return basicGetTransformation();
			case UML2WithIDPackage.OBJECT_FLOW__SELECTION:
				if (resolve) return getSelection();
				return basicGetSelection();
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
			case UML2WithIDPackage.OBJECT_FLOW__IS_MULTICAST:
				setIsMulticast((Boolean)newValue);
				return;
			case UML2WithIDPackage.OBJECT_FLOW__IS_MULTIRECEIVE:
				setIsMultireceive((Boolean)newValue);
				return;
			case UML2WithIDPackage.OBJECT_FLOW__TRANSFORMATION:
				setTransformation((Behavior)newValue);
				return;
			case UML2WithIDPackage.OBJECT_FLOW__SELECTION:
				setSelection((Behavior)newValue);
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
			case UML2WithIDPackage.OBJECT_FLOW__IS_MULTICAST:
				setIsMulticast(IS_MULTICAST_EDEFAULT);
				return;
			case UML2WithIDPackage.OBJECT_FLOW__IS_MULTIRECEIVE:
				setIsMultireceive(IS_MULTIRECEIVE_EDEFAULT);
				return;
			case UML2WithIDPackage.OBJECT_FLOW__TRANSFORMATION:
				setTransformation((Behavior)null);
				return;
			case UML2WithIDPackage.OBJECT_FLOW__SELECTION:
				setSelection((Behavior)null);
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
			case UML2WithIDPackage.OBJECT_FLOW__IS_MULTICAST:
				return isMulticast != IS_MULTICAST_EDEFAULT;
			case UML2WithIDPackage.OBJECT_FLOW__IS_MULTIRECEIVE:
				return isMultireceive != IS_MULTIRECEIVE_EDEFAULT;
			case UML2WithIDPackage.OBJECT_FLOW__TRANSFORMATION:
				return transformation != null;
			case UML2WithIDPackage.OBJECT_FLOW__SELECTION:
				return selection != null;
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
		result.append(" (isMulticast: ");
		result.append(isMulticast);
		result.append(", isMultireceive: ");
		result.append(isMultireceive);
		result.append(')');
		return result.toString();
	}

} //ObjectFlowImpl

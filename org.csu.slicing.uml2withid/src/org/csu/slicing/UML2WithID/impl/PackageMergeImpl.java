/**
 */
package org.csu.slicing.UML2WithID.impl;

import org.csu.slicing.UML2WithID.PackageMerge;
import org.csu.slicing.UML2WithID.UML2WithIDPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package Merge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.PackageMergeImpl#getMergingPackage <em>Merging Package</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.PackageMergeImpl#getMergedPackage <em>Merged Package</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PackageMergeImpl extends DirectedRelationshipImpl implements PackageMerge {
	/**
	 * The cached value of the '{@link #getMergingPackage() <em>Merging Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMergingPackage()
	 * @generated
	 * @ordered
	 */
	protected org.csu.slicing.UML2WithID.Package mergingPackage;

	/**
	 * The cached value of the '{@link #getMergedPackage() <em>Merged Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMergedPackage()
	 * @generated
	 * @ordered
	 */
	protected org.csu.slicing.UML2WithID.Package mergedPackage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageMergeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UML2WithIDPackage.eINSTANCE.getPackageMerge();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.csu.slicing.UML2WithID.Package getMergingPackage() {
		if (mergingPackage != null && mergingPackage.eIsProxy()) {
			InternalEObject oldMergingPackage = (InternalEObject)mergingPackage;
			mergingPackage = (org.csu.slicing.UML2WithID.Package)eResolveProxy(oldMergingPackage);
			if (mergingPackage != oldMergingPackage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2WithIDPackage.PACKAGE_MERGE__MERGING_PACKAGE, oldMergingPackage, mergingPackage));
			}
		}
		return mergingPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.csu.slicing.UML2WithID.Package basicGetMergingPackage() {
		return mergingPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMergingPackage(org.csu.slicing.UML2WithID.Package newMergingPackage, NotificationChain msgs) {
		org.csu.slicing.UML2WithID.Package oldMergingPackage = mergingPackage;
		mergingPackage = newMergingPackage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UML2WithIDPackage.PACKAGE_MERGE__MERGING_PACKAGE, oldMergingPackage, newMergingPackage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMergingPackage(org.csu.slicing.UML2WithID.Package newMergingPackage) {
		if (newMergingPackage != mergingPackage) {
			NotificationChain msgs = null;
			if (mergingPackage != null)
				msgs = ((InternalEObject)mergingPackage).eInverseRemove(this, UML2WithIDPackage.PACKAGE__PACKAGE_MERGE, org.csu.slicing.UML2WithID.Package.class, msgs);
			if (newMergingPackage != null)
				msgs = ((InternalEObject)newMergingPackage).eInverseAdd(this, UML2WithIDPackage.PACKAGE__PACKAGE_MERGE, org.csu.slicing.UML2WithID.Package.class, msgs);
			msgs = basicSetMergingPackage(newMergingPackage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2WithIDPackage.PACKAGE_MERGE__MERGING_PACKAGE, newMergingPackage, newMergingPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.csu.slicing.UML2WithID.Package getMergedPackage() {
		if (mergedPackage != null && mergedPackage.eIsProxy()) {
			InternalEObject oldMergedPackage = (InternalEObject)mergedPackage;
			mergedPackage = (org.csu.slicing.UML2WithID.Package)eResolveProxy(oldMergedPackage);
			if (mergedPackage != oldMergedPackage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2WithIDPackage.PACKAGE_MERGE__MERGED_PACKAGE, oldMergedPackage, mergedPackage));
			}
		}
		return mergedPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.csu.slicing.UML2WithID.Package basicGetMergedPackage() {
		return mergedPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMergedPackage(org.csu.slicing.UML2WithID.Package newMergedPackage) {
		org.csu.slicing.UML2WithID.Package oldMergedPackage = mergedPackage;
		mergedPackage = newMergedPackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2WithIDPackage.PACKAGE_MERGE__MERGED_PACKAGE, oldMergedPackage, mergedPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UML2WithIDPackage.PACKAGE_MERGE__MERGING_PACKAGE:
				if (mergingPackage != null)
					msgs = ((InternalEObject)mergingPackage).eInverseRemove(this, UML2WithIDPackage.PACKAGE__PACKAGE_MERGE, org.csu.slicing.UML2WithID.Package.class, msgs);
				return basicSetMergingPackage((org.csu.slicing.UML2WithID.Package)otherEnd, msgs);
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
			case UML2WithIDPackage.PACKAGE_MERGE__MERGING_PACKAGE:
				return basicSetMergingPackage(null, msgs);
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
			case UML2WithIDPackage.PACKAGE_MERGE__MERGING_PACKAGE:
				if (resolve) return getMergingPackage();
				return basicGetMergingPackage();
			case UML2WithIDPackage.PACKAGE_MERGE__MERGED_PACKAGE:
				if (resolve) return getMergedPackage();
				return basicGetMergedPackage();
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
			case UML2WithIDPackage.PACKAGE_MERGE__MERGING_PACKAGE:
				setMergingPackage((org.csu.slicing.UML2WithID.Package)newValue);
				return;
			case UML2WithIDPackage.PACKAGE_MERGE__MERGED_PACKAGE:
				setMergedPackage((org.csu.slicing.UML2WithID.Package)newValue);
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
			case UML2WithIDPackage.PACKAGE_MERGE__MERGING_PACKAGE:
				setMergingPackage((org.csu.slicing.UML2WithID.Package)null);
				return;
			case UML2WithIDPackage.PACKAGE_MERGE__MERGED_PACKAGE:
				setMergedPackage((org.csu.slicing.UML2WithID.Package)null);
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
			case UML2WithIDPackage.PACKAGE_MERGE__MERGING_PACKAGE:
				return mergingPackage != null;
			case UML2WithIDPackage.PACKAGE_MERGE__MERGED_PACKAGE:
				return mergedPackage != null;
		}
		return super.eIsSet(featureID);
	}

} //PackageMergeImpl

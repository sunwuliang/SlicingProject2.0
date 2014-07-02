/**
 */
package org.csu.slicing.UML2.impl;

import org.csu.slicing.UML2.Profile;
import org.csu.slicing.UML2.ProfileApplication;
import org.csu.slicing.UML2.UML2Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Profile Application</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2.impl.ProfileApplicationImpl#getImportedProfile <em>Imported Profile</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProfileApplicationImpl extends PackageImportImpl implements ProfileApplication {
	/**
	 * The cached value of the '{@link #getImportedProfile() <em>Imported Profile</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportedProfile()
	 * @generated
	 * @ordered
	 */
	protected Profile importedProfile;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProfileApplicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UML2Package.eINSTANCE.getProfileApplication();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Profile getImportedProfile() {
		if (importedProfile != null && importedProfile.eIsProxy()) {
			InternalEObject oldImportedProfile = (InternalEObject)importedProfile;
			importedProfile = (Profile)eResolveProxy(oldImportedProfile);
			if (importedProfile != oldImportedProfile) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2Package.PROFILE_APPLICATION__IMPORTED_PROFILE, oldImportedProfile, importedProfile));
			}
		}
		return importedProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Profile basicGetImportedProfile() {
		return importedProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportedProfile(Profile newImportedProfile) {
		Profile oldImportedProfile = importedProfile;
		importedProfile = newImportedProfile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.PROFILE_APPLICATION__IMPORTED_PROFILE, oldImportedProfile, importedProfile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UML2Package.PROFILE_APPLICATION__IMPORTED_PROFILE:
				if (resolve) return getImportedProfile();
				return basicGetImportedProfile();
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
			case UML2Package.PROFILE_APPLICATION__IMPORTED_PROFILE:
				setImportedProfile((Profile)newValue);
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
			case UML2Package.PROFILE_APPLICATION__IMPORTED_PROFILE:
				setImportedProfile((Profile)null);
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
			case UML2Package.PROFILE_APPLICATION__IMPORTED_PROFILE:
				return importedProfile != null;
		}
		return super.eIsSet(featureID);
	}

} //ProfileApplicationImpl

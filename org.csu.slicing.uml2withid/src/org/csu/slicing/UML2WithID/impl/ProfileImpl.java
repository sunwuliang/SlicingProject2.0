/**
 */
package org.csu.slicing.UML2WithID.impl;

import java.util.Collection;

import org.csu.slicing.UML2WithID.ElementImport;
import org.csu.slicing.UML2WithID.PackageImport;
import org.csu.slicing.UML2WithID.Profile;
import org.csu.slicing.UML2WithID.Stereotype;
import org.csu.slicing.UML2WithID.UML2WithIDPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Profile</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.ProfileImpl#getOwnedStereotype <em>Owned Stereotype</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.ProfileImpl#getMetaclassReference <em>Metaclass Reference</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.ProfileImpl#getMetamodelReference <em>Metamodel Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProfileImpl extends PackageImpl implements Profile {
	/**
	 * The cached value of the '{@link #getOwnedStereotype() <em>Owned Stereotype</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedStereotype()
	 * @generated
	 * @ordered
	 */
	protected EList<Stereotype> ownedStereotype;

	/**
	 * The cached value of the '{@link #getMetaclassReference() <em>Metaclass Reference</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaclassReference()
	 * @generated
	 * @ordered
	 */
	protected EList<ElementImport> metaclassReference;

	/**
	 * The cached value of the '{@link #getMetamodelReference() <em>Metamodel Reference</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetamodelReference()
	 * @generated
	 * @ordered
	 */
	protected EList<PackageImport> metamodelReference;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProfileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UML2WithIDPackage.eINSTANCE.getProfile();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Stereotype> getOwnedStereotype() {
		if (ownedStereotype == null) {
			ownedStereotype = new EObjectResolvingEList<Stereotype>(Stereotype.class, this, UML2WithIDPackage.PROFILE__OWNED_STEREOTYPE);
		}
		return ownedStereotype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ElementImport> getMetaclassReference() {
		if (metaclassReference == null) {
			metaclassReference = new EObjectResolvingEList<ElementImport>(ElementImport.class, this, UML2WithIDPackage.PROFILE__METACLASS_REFERENCE);
		}
		return metaclassReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PackageImport> getMetamodelReference() {
		if (metamodelReference == null) {
			metamodelReference = new EObjectResolvingEList<PackageImport>(PackageImport.class, this, UML2WithIDPackage.PROFILE__METAMODEL_REFERENCE);
		}
		return metamodelReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UML2WithIDPackage.PROFILE__OWNED_STEREOTYPE:
				return getOwnedStereotype();
			case UML2WithIDPackage.PROFILE__METACLASS_REFERENCE:
				return getMetaclassReference();
			case UML2WithIDPackage.PROFILE__METAMODEL_REFERENCE:
				return getMetamodelReference();
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
			case UML2WithIDPackage.PROFILE__OWNED_STEREOTYPE:
				getOwnedStereotype().clear();
				getOwnedStereotype().addAll((Collection<? extends Stereotype>)newValue);
				return;
			case UML2WithIDPackage.PROFILE__METACLASS_REFERENCE:
				getMetaclassReference().clear();
				getMetaclassReference().addAll((Collection<? extends ElementImport>)newValue);
				return;
			case UML2WithIDPackage.PROFILE__METAMODEL_REFERENCE:
				getMetamodelReference().clear();
				getMetamodelReference().addAll((Collection<? extends PackageImport>)newValue);
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
			case UML2WithIDPackage.PROFILE__OWNED_STEREOTYPE:
				getOwnedStereotype().clear();
				return;
			case UML2WithIDPackage.PROFILE__METACLASS_REFERENCE:
				getMetaclassReference().clear();
				return;
			case UML2WithIDPackage.PROFILE__METAMODEL_REFERENCE:
				getMetamodelReference().clear();
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
			case UML2WithIDPackage.PROFILE__OWNED_STEREOTYPE:
				return ownedStereotype != null && !ownedStereotype.isEmpty();
			case UML2WithIDPackage.PROFILE__METACLASS_REFERENCE:
				return metaclassReference != null && !metaclassReference.isEmpty();
			case UML2WithIDPackage.PROFILE__METAMODEL_REFERENCE:
				return metamodelReference != null && !metamodelReference.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProfileImpl

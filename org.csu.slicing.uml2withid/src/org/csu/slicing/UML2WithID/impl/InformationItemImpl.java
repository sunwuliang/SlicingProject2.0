/**
 */
package org.csu.slicing.UML2WithID.impl;

import java.util.Collection;

import org.csu.slicing.UML2WithID.Classifier;
import org.csu.slicing.UML2WithID.InformationItem;
import org.csu.slicing.UML2WithID.UML2WithIDPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Information Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.InformationItemImpl#getRepresented <em>Represented</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InformationItemImpl extends ClassifierImpl implements InformationItem {
	/**
	 * The cached value of the '{@link #getRepresented() <em>Represented</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresented()
	 * @generated
	 * @ordered
	 */
	protected EList<Classifier> represented;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InformationItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UML2WithIDPackage.eINSTANCE.getInformationItem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Classifier> getRepresented() {
		if (represented == null) {
			represented = new EObjectResolvingEList<Classifier>(Classifier.class, this, UML2WithIDPackage.INFORMATION_ITEM__REPRESENTED);
		}
		return represented;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UML2WithIDPackage.INFORMATION_ITEM__REPRESENTED:
				return getRepresented();
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
			case UML2WithIDPackage.INFORMATION_ITEM__REPRESENTED:
				getRepresented().clear();
				getRepresented().addAll((Collection<? extends Classifier>)newValue);
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
			case UML2WithIDPackage.INFORMATION_ITEM__REPRESENTED:
				getRepresented().clear();
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
			case UML2WithIDPackage.INFORMATION_ITEM__REPRESENTED:
				return represented != null && !represented.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InformationItemImpl

/**
 */
package org.csu.slicing.UML2.impl;

import java.util.Collection;

import org.csu.slicing.UML2.ConnectionPointReference;
import org.csu.slicing.UML2.Pseudostate;
import org.csu.slicing.UML2.UML2Package;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection Point Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2.impl.ConnectionPointReferenceImpl#getEntry <em>Entry</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.ConnectionPointReferenceImpl#getExit <em>Exit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConnectionPointReferenceImpl extends VertexImpl implements ConnectionPointReference {
	/**
	 * The cached value of the '{@link #getEntry() <em>Entry</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntry()
	 * @generated
	 * @ordered
	 */
	protected EList<Pseudostate> entry;

	/**
	 * The cached value of the '{@link #getExit() <em>Exit</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExit()
	 * @generated
	 * @ordered
	 */
	protected EList<Pseudostate> exit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionPointReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UML2Package.eINSTANCE.getConnectionPointReference();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pseudostate> getEntry() {
		if (entry == null) {
			entry = new EObjectResolvingEList<Pseudostate>(Pseudostate.class, this, UML2Package.CONNECTION_POINT_REFERENCE__ENTRY);
		}
		return entry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pseudostate> getExit() {
		if (exit == null) {
			exit = new EObjectResolvingEList<Pseudostate>(Pseudostate.class, this, UML2Package.CONNECTION_POINT_REFERENCE__EXIT);
		}
		return exit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UML2Package.CONNECTION_POINT_REFERENCE__ENTRY:
				return getEntry();
			case UML2Package.CONNECTION_POINT_REFERENCE__EXIT:
				return getExit();
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
			case UML2Package.CONNECTION_POINT_REFERENCE__ENTRY:
				getEntry().clear();
				getEntry().addAll((Collection<? extends Pseudostate>)newValue);
				return;
			case UML2Package.CONNECTION_POINT_REFERENCE__EXIT:
				getExit().clear();
				getExit().addAll((Collection<? extends Pseudostate>)newValue);
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
			case UML2Package.CONNECTION_POINT_REFERENCE__ENTRY:
				getEntry().clear();
				return;
			case UML2Package.CONNECTION_POINT_REFERENCE__EXIT:
				getExit().clear();
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
			case UML2Package.CONNECTION_POINT_REFERENCE__ENTRY:
				return entry != null && !entry.isEmpty();
			case UML2Package.CONNECTION_POINT_REFERENCE__EXIT:
				return exit != null && !exit.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConnectionPointReferenceImpl

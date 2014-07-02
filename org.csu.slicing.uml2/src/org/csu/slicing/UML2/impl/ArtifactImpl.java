/**
 */
package org.csu.slicing.UML2.impl;

import java.util.Collection;

import org.csu.slicing.UML2.Artifact;
import org.csu.slicing.UML2.Manifestation;
import org.csu.slicing.UML2.Operation;
import org.csu.slicing.UML2.Property;
import org.csu.slicing.UML2.UML2Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Artifact</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2.impl.ArtifactImpl#getFileName <em>File Name</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.ArtifactImpl#getNestedArtifact <em>Nested Artifact</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.ArtifactImpl#getManifestation <em>Manifestation</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.ArtifactImpl#getOwnedOperation <em>Owned Operation</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.ArtifactImpl#getOwnedAttribute <em>Owned Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArtifactImpl extends ClassifierImpl implements Artifact {
	/**
	 * The default value of the '{@link #getFileName() <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileName()
	 * @generated
	 * @ordered
	 */
	protected static final String FILE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFileName() <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileName()
	 * @generated
	 * @ordered
	 */
	protected String fileName = FILE_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNestedArtifact() <em>Nested Artifact</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNestedArtifact()
	 * @generated
	 * @ordered
	 */
	protected EList<Artifact> nestedArtifact;

	/**
	 * The cached value of the '{@link #getManifestation() <em>Manifestation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManifestation()
	 * @generated
	 * @ordered
	 */
	protected EList<Manifestation> manifestation;

	/**
	 * The cached value of the '{@link #getOwnedOperation() <em>Owned Operation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedOperation()
	 * @generated
	 * @ordered
	 */
	protected EList<Operation> ownedOperation;

	/**
	 * The cached value of the '{@link #getOwnedAttribute() <em>Owned Attribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> ownedAttribute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArtifactImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UML2Package.eINSTANCE.getArtifact();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFileName() {
		return fileName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFileName(String newFileName) {
		String oldFileName = fileName;
		fileName = newFileName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.ARTIFACT__FILE_NAME, oldFileName, fileName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Artifact> getNestedArtifact() {
		if (nestedArtifact == null) {
			nestedArtifact = new EObjectContainmentEList<Artifact>(Artifact.class, this, UML2Package.ARTIFACT__NESTED_ARTIFACT);
		}
		return nestedArtifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Manifestation> getManifestation() {
		if (manifestation == null) {
			manifestation = new EObjectContainmentEList<Manifestation>(Manifestation.class, this, UML2Package.ARTIFACT__MANIFESTATION);
		}
		return manifestation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getOwnedOperation() {
		if (ownedOperation == null) {
			ownedOperation = new EObjectContainmentEList<Operation>(Operation.class, this, UML2Package.ARTIFACT__OWNED_OPERATION);
		}
		return ownedOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getOwnedAttribute() {
		if (ownedAttribute == null) {
			ownedAttribute = new EObjectContainmentEList<Property>(Property.class, this, UML2Package.ARTIFACT__OWNED_ATTRIBUTE);
		}
		return ownedAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UML2Package.ARTIFACT__NESTED_ARTIFACT:
				return ((InternalEList<?>)getNestedArtifact()).basicRemove(otherEnd, msgs);
			case UML2Package.ARTIFACT__MANIFESTATION:
				return ((InternalEList<?>)getManifestation()).basicRemove(otherEnd, msgs);
			case UML2Package.ARTIFACT__OWNED_OPERATION:
				return ((InternalEList<?>)getOwnedOperation()).basicRemove(otherEnd, msgs);
			case UML2Package.ARTIFACT__OWNED_ATTRIBUTE:
				return ((InternalEList<?>)getOwnedAttribute()).basicRemove(otherEnd, msgs);
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
			case UML2Package.ARTIFACT__FILE_NAME:
				return getFileName();
			case UML2Package.ARTIFACT__NESTED_ARTIFACT:
				return getNestedArtifact();
			case UML2Package.ARTIFACT__MANIFESTATION:
				return getManifestation();
			case UML2Package.ARTIFACT__OWNED_OPERATION:
				return getOwnedOperation();
			case UML2Package.ARTIFACT__OWNED_ATTRIBUTE:
				return getOwnedAttribute();
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
			case UML2Package.ARTIFACT__FILE_NAME:
				setFileName((String)newValue);
				return;
			case UML2Package.ARTIFACT__NESTED_ARTIFACT:
				getNestedArtifact().clear();
				getNestedArtifact().addAll((Collection<? extends Artifact>)newValue);
				return;
			case UML2Package.ARTIFACT__MANIFESTATION:
				getManifestation().clear();
				getManifestation().addAll((Collection<? extends Manifestation>)newValue);
				return;
			case UML2Package.ARTIFACT__OWNED_OPERATION:
				getOwnedOperation().clear();
				getOwnedOperation().addAll((Collection<? extends Operation>)newValue);
				return;
			case UML2Package.ARTIFACT__OWNED_ATTRIBUTE:
				getOwnedAttribute().clear();
				getOwnedAttribute().addAll((Collection<? extends Property>)newValue);
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
			case UML2Package.ARTIFACT__FILE_NAME:
				setFileName(FILE_NAME_EDEFAULT);
				return;
			case UML2Package.ARTIFACT__NESTED_ARTIFACT:
				getNestedArtifact().clear();
				return;
			case UML2Package.ARTIFACT__MANIFESTATION:
				getManifestation().clear();
				return;
			case UML2Package.ARTIFACT__OWNED_OPERATION:
				getOwnedOperation().clear();
				return;
			case UML2Package.ARTIFACT__OWNED_ATTRIBUTE:
				getOwnedAttribute().clear();
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
			case UML2Package.ARTIFACT__FILE_NAME:
				return FILE_NAME_EDEFAULT == null ? fileName != null : !FILE_NAME_EDEFAULT.equals(fileName);
			case UML2Package.ARTIFACT__NESTED_ARTIFACT:
				return nestedArtifact != null && !nestedArtifact.isEmpty();
			case UML2Package.ARTIFACT__MANIFESTATION:
				return manifestation != null && !manifestation.isEmpty();
			case UML2Package.ARTIFACT__OWNED_OPERATION:
				return ownedOperation != null && !ownedOperation.isEmpty();
			case UML2Package.ARTIFACT__OWNED_ATTRIBUTE:
				return ownedAttribute != null && !ownedAttribute.isEmpty();
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
		result.append(" (fileName: ");
		result.append(fileName);
		result.append(')');
		return result.toString();
	}

} //ArtifactImpl

/**
 */
package org.csu.slicing.UML2WithID.impl;

import java.util.Collection;

import org.csu.slicing.UML2WithID.Classifier;
import org.csu.slicing.UML2WithID.Extend;
import org.csu.slicing.UML2WithID.ExtensionPoint;
import org.csu.slicing.UML2WithID.Include;
import org.csu.slicing.UML2WithID.UML2WithIDPackage;
import org.csu.slicing.UML2WithID.UseCase;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Use Case</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.UseCaseImpl#getInclude <em>Include</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.UseCaseImpl#getExtend <em>Extend</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.UseCaseImpl#getExtensionPoint <em>Extension Point</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.UseCaseImpl#getSubject <em>Subject</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UseCaseImpl extends BehavioredClassifierImpl implements UseCase {
	/**
	 * The cached value of the '{@link #getInclude() <em>Include</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInclude()
	 * @generated
	 * @ordered
	 */
	protected EList<Include> include;

	/**
	 * The cached value of the '{@link #getExtend() <em>Extend</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtend()
	 * @generated
	 * @ordered
	 */
	protected EList<Extend> extend;

	/**
	 * The cached value of the '{@link #getExtensionPoint() <em>Extension Point</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensionPoint()
	 * @generated
	 * @ordered
	 */
	protected EList<ExtensionPoint> extensionPoint;

	/**
	 * The cached value of the '{@link #getSubject() <em>Subject</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected EList<Classifier> subject;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UseCaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UML2WithIDPackage.eINSTANCE.getUseCase();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Include> getInclude() {
		if (include == null) {
			include = new EObjectContainmentWithInverseEList<Include>(Include.class, this, UML2WithIDPackage.USE_CASE__INCLUDE, UML2WithIDPackage.INCLUDE__INCLUDING_CASE);
		}
		return include;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Extend> getExtend() {
		if (extend == null) {
			extend = new EObjectContainmentWithInverseEList<Extend>(Extend.class, this, UML2WithIDPackage.USE_CASE__EXTEND, UML2WithIDPackage.EXTEND__EXTENSION);
		}
		return extend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExtensionPoint> getExtensionPoint() {
		if (extensionPoint == null) {
			extensionPoint = new EObjectContainmentWithInverseEList<ExtensionPoint>(ExtensionPoint.class, this, UML2WithIDPackage.USE_CASE__EXTENSION_POINT, UML2WithIDPackage.EXTENSION_POINT__USE_CASE);
		}
		return extensionPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Classifier> getSubject() {
		if (subject == null) {
			subject = new EObjectWithInverseResolvingEList.ManyInverse<Classifier>(Classifier.class, this, UML2WithIDPackage.USE_CASE__SUBJECT, UML2WithIDPackage.CLASSIFIER__USE_CASE);
		}
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UML2WithIDPackage.USE_CASE__INCLUDE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInclude()).basicAdd(otherEnd, msgs);
			case UML2WithIDPackage.USE_CASE__EXTEND:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getExtend()).basicAdd(otherEnd, msgs);
			case UML2WithIDPackage.USE_CASE__EXTENSION_POINT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getExtensionPoint()).basicAdd(otherEnd, msgs);
			case UML2WithIDPackage.USE_CASE__SUBJECT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubject()).basicAdd(otherEnd, msgs);
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
			case UML2WithIDPackage.USE_CASE__INCLUDE:
				return ((InternalEList<?>)getInclude()).basicRemove(otherEnd, msgs);
			case UML2WithIDPackage.USE_CASE__EXTEND:
				return ((InternalEList<?>)getExtend()).basicRemove(otherEnd, msgs);
			case UML2WithIDPackage.USE_CASE__EXTENSION_POINT:
				return ((InternalEList<?>)getExtensionPoint()).basicRemove(otherEnd, msgs);
			case UML2WithIDPackage.USE_CASE__SUBJECT:
				return ((InternalEList<?>)getSubject()).basicRemove(otherEnd, msgs);
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
			case UML2WithIDPackage.USE_CASE__INCLUDE:
				return getInclude();
			case UML2WithIDPackage.USE_CASE__EXTEND:
				return getExtend();
			case UML2WithIDPackage.USE_CASE__EXTENSION_POINT:
				return getExtensionPoint();
			case UML2WithIDPackage.USE_CASE__SUBJECT:
				return getSubject();
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
			case UML2WithIDPackage.USE_CASE__INCLUDE:
				getInclude().clear();
				getInclude().addAll((Collection<? extends Include>)newValue);
				return;
			case UML2WithIDPackage.USE_CASE__EXTEND:
				getExtend().clear();
				getExtend().addAll((Collection<? extends Extend>)newValue);
				return;
			case UML2WithIDPackage.USE_CASE__EXTENSION_POINT:
				getExtensionPoint().clear();
				getExtensionPoint().addAll((Collection<? extends ExtensionPoint>)newValue);
				return;
			case UML2WithIDPackage.USE_CASE__SUBJECT:
				getSubject().clear();
				getSubject().addAll((Collection<? extends Classifier>)newValue);
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
			case UML2WithIDPackage.USE_CASE__INCLUDE:
				getInclude().clear();
				return;
			case UML2WithIDPackage.USE_CASE__EXTEND:
				getExtend().clear();
				return;
			case UML2WithIDPackage.USE_CASE__EXTENSION_POINT:
				getExtensionPoint().clear();
				return;
			case UML2WithIDPackage.USE_CASE__SUBJECT:
				getSubject().clear();
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
			case UML2WithIDPackage.USE_CASE__INCLUDE:
				return include != null && !include.isEmpty();
			case UML2WithIDPackage.USE_CASE__EXTEND:
				return extend != null && !extend.isEmpty();
			case UML2WithIDPackage.USE_CASE__EXTENSION_POINT:
				return extensionPoint != null && !extensionPoint.isEmpty();
			case UML2WithIDPackage.USE_CASE__SUBJECT:
				return subject != null && !subject.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //UseCaseImpl

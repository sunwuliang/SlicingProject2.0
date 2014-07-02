/**
 */
package org.csu.slicing.UML2.impl;

import org.csu.slicing.UML2.Classifier;
import org.csu.slicing.UML2.Component;
import org.csu.slicing.UML2.Realization;
import org.csu.slicing.UML2.UML2Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Realization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2.impl.RealizationImpl#getAbstraction <em>Abstraction</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.RealizationImpl#getRealizingClassifier <em>Realizing Classifier</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RealizationImpl extends AbstractionImpl implements Realization {
	/**
	 * The cached value of the '{@link #getRealizingClassifier() <em>Realizing Classifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizingClassifier()
	 * @generated
	 * @ordered
	 */
	protected Classifier realizingClassifier;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RealizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UML2Package.eINSTANCE.getRealization();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component getAbstraction() {
		if (eContainerFeatureID() != UML2Package.REALIZATION__ABSTRACTION) return null;
		return (Component)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstraction(Component newAbstraction, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newAbstraction, UML2Package.REALIZATION__ABSTRACTION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstraction(Component newAbstraction) {
		if (newAbstraction != eInternalContainer() || (eContainerFeatureID() != UML2Package.REALIZATION__ABSTRACTION && newAbstraction != null)) {
			if (EcoreUtil.isAncestor(this, newAbstraction))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAbstraction != null)
				msgs = ((InternalEObject)newAbstraction).eInverseAdd(this, UML2Package.COMPONENT__REALIZATION, Component.class, msgs);
			msgs = basicSetAbstraction(newAbstraction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.REALIZATION__ABSTRACTION, newAbstraction, newAbstraction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getRealizingClassifier() {
		if (realizingClassifier != null && realizingClassifier.eIsProxy()) {
			InternalEObject oldRealizingClassifier = (InternalEObject)realizingClassifier;
			realizingClassifier = (Classifier)eResolveProxy(oldRealizingClassifier);
			if (realizingClassifier != oldRealizingClassifier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2Package.REALIZATION__REALIZING_CLASSIFIER, oldRealizingClassifier, realizingClassifier));
			}
		}
		return realizingClassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier basicGetRealizingClassifier() {
		return realizingClassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRealizingClassifier(Classifier newRealizingClassifier) {
		Classifier oldRealizingClassifier = realizingClassifier;
		realizingClassifier = newRealizingClassifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.REALIZATION__REALIZING_CLASSIFIER, oldRealizingClassifier, realizingClassifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UML2Package.REALIZATION__ABSTRACTION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetAbstraction((Component)otherEnd, msgs);
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
			case UML2Package.REALIZATION__ABSTRACTION:
				return basicSetAbstraction(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case UML2Package.REALIZATION__ABSTRACTION:
				return eInternalContainer().eInverseRemove(this, UML2Package.COMPONENT__REALIZATION, Component.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UML2Package.REALIZATION__ABSTRACTION:
				return getAbstraction();
			case UML2Package.REALIZATION__REALIZING_CLASSIFIER:
				if (resolve) return getRealizingClassifier();
				return basicGetRealizingClassifier();
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
			case UML2Package.REALIZATION__ABSTRACTION:
				setAbstraction((Component)newValue);
				return;
			case UML2Package.REALIZATION__REALIZING_CLASSIFIER:
				setRealizingClassifier((Classifier)newValue);
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
			case UML2Package.REALIZATION__ABSTRACTION:
				setAbstraction((Component)null);
				return;
			case UML2Package.REALIZATION__REALIZING_CLASSIFIER:
				setRealizingClassifier((Classifier)null);
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
			case UML2Package.REALIZATION__ABSTRACTION:
				return getAbstraction() != null;
			case UML2Package.REALIZATION__REALIZING_CLASSIFIER:
				return realizingClassifier != null;
		}
		return super.eIsSet(featureID);
	}

} //RealizationImpl

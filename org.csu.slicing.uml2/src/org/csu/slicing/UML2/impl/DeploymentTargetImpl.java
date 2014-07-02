/**
 */
package org.csu.slicing.UML2.impl;

import java.util.Collection;

import org.csu.slicing.UML2.Deployment;
import org.csu.slicing.UML2.DeploymentTarget;
import org.csu.slicing.UML2.PackageableElement;
import org.csu.slicing.UML2.UML2Package;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deployment Target</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2.impl.DeploymentTargetImpl#getDeployment <em>Deployment</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.DeploymentTargetImpl#getDeployedElement <em>Deployed Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class DeploymentTargetImpl extends NamedElementImpl implements DeploymentTarget {
	/**
	 * The cached value of the '{@link #getDeployment() <em>Deployment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeployment()
	 * @generated
	 * @ordered
	 */
	protected EList<Deployment> deployment;

	/**
	 * The cached value of the '{@link #getDeployedElement() <em>Deployed Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeployedElement()
	 * @generated
	 * @ordered
	 */
	protected EList<PackageableElement> deployedElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeploymentTargetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UML2Package.eINSTANCE.getDeploymentTarget();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Deployment> getDeployment() {
		if (deployment == null) {
			deployment = new EObjectContainmentWithInverseEList<Deployment>(Deployment.class, this, UML2Package.DEPLOYMENT_TARGET__DEPLOYMENT, UML2Package.DEPLOYMENT__LOCATION);
		}
		return deployment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PackageableElement> getDeployedElement() {
		if (deployedElement == null) {
			deployedElement = new EObjectResolvingEList<PackageableElement>(PackageableElement.class, this, UML2Package.DEPLOYMENT_TARGET__DEPLOYED_ELEMENT);
		}
		return deployedElement;
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
			case UML2Package.DEPLOYMENT_TARGET__DEPLOYMENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDeployment()).basicAdd(otherEnd, msgs);
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
			case UML2Package.DEPLOYMENT_TARGET__DEPLOYMENT:
				return ((InternalEList<?>)getDeployment()).basicRemove(otherEnd, msgs);
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
			case UML2Package.DEPLOYMENT_TARGET__DEPLOYMENT:
				return getDeployment();
			case UML2Package.DEPLOYMENT_TARGET__DEPLOYED_ELEMENT:
				return getDeployedElement();
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
			case UML2Package.DEPLOYMENT_TARGET__DEPLOYMENT:
				getDeployment().clear();
				getDeployment().addAll((Collection<? extends Deployment>)newValue);
				return;
			case UML2Package.DEPLOYMENT_TARGET__DEPLOYED_ELEMENT:
				getDeployedElement().clear();
				getDeployedElement().addAll((Collection<? extends PackageableElement>)newValue);
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
			case UML2Package.DEPLOYMENT_TARGET__DEPLOYMENT:
				getDeployment().clear();
				return;
			case UML2Package.DEPLOYMENT_TARGET__DEPLOYED_ELEMENT:
				getDeployedElement().clear();
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
			case UML2Package.DEPLOYMENT_TARGET__DEPLOYMENT:
				return deployment != null && !deployment.isEmpty();
			case UML2Package.DEPLOYMENT_TARGET__DEPLOYED_ELEMENT:
				return deployedElement != null && !deployedElement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DeploymentTargetImpl

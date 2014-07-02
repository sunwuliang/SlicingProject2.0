/**
 */
package org.csu.slicing.UML2.impl;

import java.util.Collection;

import org.csu.slicing.UML2.DeployedArtifact;
import org.csu.slicing.UML2.Deployment;
import org.csu.slicing.UML2.DeploymentSpecification;
import org.csu.slicing.UML2.DeploymentTarget;
import org.csu.slicing.UML2.UML2Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deployment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2.impl.DeploymentImpl#getDeployedArtifact <em>Deployed Artifact</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.DeploymentImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.DeploymentImpl#getConfiguration <em>Configuration</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeploymentImpl extends DependencyImpl implements Deployment {
	/**
	 * The cached value of the '{@link #getDeployedArtifact() <em>Deployed Artifact</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeployedArtifact()
	 * @generated
	 * @ordered
	 */
	protected EList<DeployedArtifact> deployedArtifact;

	/**
	 * The cached value of the '{@link #getConfiguration() <em>Configuration</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfiguration()
	 * @generated
	 * @ordered
	 */
	protected EList<DeploymentSpecification> configuration;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeploymentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UML2Package.eINSTANCE.getDeployment();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeployedArtifact> getDeployedArtifact() {
		if (deployedArtifact == null) {
			deployedArtifact = new EObjectResolvingEList<DeployedArtifact>(DeployedArtifact.class, this, UML2Package.DEPLOYMENT__DEPLOYED_ARTIFACT);
		}
		return deployedArtifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentTarget getLocation() {
		if (eContainerFeatureID() != UML2Package.DEPLOYMENT__LOCATION) return null;
		return (DeploymentTarget)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocation(DeploymentTarget newLocation, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newLocation, UML2Package.DEPLOYMENT__LOCATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(DeploymentTarget newLocation) {
		if (newLocation != eInternalContainer() || (eContainerFeatureID() != UML2Package.DEPLOYMENT__LOCATION && newLocation != null)) {
			if (EcoreUtil.isAncestor(this, newLocation))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newLocation != null)
				msgs = ((InternalEObject)newLocation).eInverseAdd(this, UML2Package.DEPLOYMENT_TARGET__DEPLOYMENT, DeploymentTarget.class, msgs);
			msgs = basicSetLocation(newLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.DEPLOYMENT__LOCATION, newLocation, newLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeploymentSpecification> getConfiguration() {
		if (configuration == null) {
			configuration = new EObjectContainmentEList<DeploymentSpecification>(DeploymentSpecification.class, this, UML2Package.DEPLOYMENT__CONFIGURATION);
		}
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UML2Package.DEPLOYMENT__LOCATION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetLocation((DeploymentTarget)otherEnd, msgs);
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
			case UML2Package.DEPLOYMENT__LOCATION:
				return basicSetLocation(null, msgs);
			case UML2Package.DEPLOYMENT__CONFIGURATION:
				return ((InternalEList<?>)getConfiguration()).basicRemove(otherEnd, msgs);
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
			case UML2Package.DEPLOYMENT__LOCATION:
				return eInternalContainer().eInverseRemove(this, UML2Package.DEPLOYMENT_TARGET__DEPLOYMENT, DeploymentTarget.class, msgs);
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
			case UML2Package.DEPLOYMENT__DEPLOYED_ARTIFACT:
				return getDeployedArtifact();
			case UML2Package.DEPLOYMENT__LOCATION:
				return getLocation();
			case UML2Package.DEPLOYMENT__CONFIGURATION:
				return getConfiguration();
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
			case UML2Package.DEPLOYMENT__DEPLOYED_ARTIFACT:
				getDeployedArtifact().clear();
				getDeployedArtifact().addAll((Collection<? extends DeployedArtifact>)newValue);
				return;
			case UML2Package.DEPLOYMENT__LOCATION:
				setLocation((DeploymentTarget)newValue);
				return;
			case UML2Package.DEPLOYMENT__CONFIGURATION:
				getConfiguration().clear();
				getConfiguration().addAll((Collection<? extends DeploymentSpecification>)newValue);
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
			case UML2Package.DEPLOYMENT__DEPLOYED_ARTIFACT:
				getDeployedArtifact().clear();
				return;
			case UML2Package.DEPLOYMENT__LOCATION:
				setLocation((DeploymentTarget)null);
				return;
			case UML2Package.DEPLOYMENT__CONFIGURATION:
				getConfiguration().clear();
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
			case UML2Package.DEPLOYMENT__DEPLOYED_ARTIFACT:
				return deployedArtifact != null && !deployedArtifact.isEmpty();
			case UML2Package.DEPLOYMENT__LOCATION:
				return getLocation() != null;
			case UML2Package.DEPLOYMENT__CONFIGURATION:
				return configuration != null && !configuration.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DeploymentImpl

/**
 */
package org.csu.slicing.UML2WithID.impl;

import org.csu.slicing.UML2WithID.DeploymentSpecification;
import org.csu.slicing.UML2WithID.UML2WithIDPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deployment Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.DeploymentSpecificationImpl#getDeploymentLocation <em>Deployment Location</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.DeploymentSpecificationImpl#getExecutionLocation <em>Execution Location</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeploymentSpecificationImpl extends ArtifactImpl implements DeploymentSpecification {
	/**
	 * The default value of the '{@link #getDeploymentLocation() <em>Deployment Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeploymentLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String DEPLOYMENT_LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeploymentLocation() <em>Deployment Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeploymentLocation()
	 * @generated
	 * @ordered
	 */
	protected String deploymentLocation = DEPLOYMENT_LOCATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getExecutionLocation() <em>Execution Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String EXECUTION_LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExecutionLocation() <em>Execution Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionLocation()
	 * @generated
	 * @ordered
	 */
	protected String executionLocation = EXECUTION_LOCATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeploymentSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UML2WithIDPackage.eINSTANCE.getDeploymentSpecification();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDeploymentLocation() {
		return deploymentLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeploymentLocation(String newDeploymentLocation) {
		String oldDeploymentLocation = deploymentLocation;
		deploymentLocation = newDeploymentLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2WithIDPackage.DEPLOYMENT_SPECIFICATION__DEPLOYMENT_LOCATION, oldDeploymentLocation, deploymentLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExecutionLocation() {
		return executionLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExecutionLocation(String newExecutionLocation) {
		String oldExecutionLocation = executionLocation;
		executionLocation = newExecutionLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2WithIDPackage.DEPLOYMENT_SPECIFICATION__EXECUTION_LOCATION, oldExecutionLocation, executionLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UML2WithIDPackage.DEPLOYMENT_SPECIFICATION__DEPLOYMENT_LOCATION:
				return getDeploymentLocation();
			case UML2WithIDPackage.DEPLOYMENT_SPECIFICATION__EXECUTION_LOCATION:
				return getExecutionLocation();
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
			case UML2WithIDPackage.DEPLOYMENT_SPECIFICATION__DEPLOYMENT_LOCATION:
				setDeploymentLocation((String)newValue);
				return;
			case UML2WithIDPackage.DEPLOYMENT_SPECIFICATION__EXECUTION_LOCATION:
				setExecutionLocation((String)newValue);
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
			case UML2WithIDPackage.DEPLOYMENT_SPECIFICATION__DEPLOYMENT_LOCATION:
				setDeploymentLocation(DEPLOYMENT_LOCATION_EDEFAULT);
				return;
			case UML2WithIDPackage.DEPLOYMENT_SPECIFICATION__EXECUTION_LOCATION:
				setExecutionLocation(EXECUTION_LOCATION_EDEFAULT);
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
			case UML2WithIDPackage.DEPLOYMENT_SPECIFICATION__DEPLOYMENT_LOCATION:
				return DEPLOYMENT_LOCATION_EDEFAULT == null ? deploymentLocation != null : !DEPLOYMENT_LOCATION_EDEFAULT.equals(deploymentLocation);
			case UML2WithIDPackage.DEPLOYMENT_SPECIFICATION__EXECUTION_LOCATION:
				return EXECUTION_LOCATION_EDEFAULT == null ? executionLocation != null : !EXECUTION_LOCATION_EDEFAULT.equals(executionLocation);
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
		result.append(" (deploymentLocation: ");
		result.append(deploymentLocation);
		result.append(", executionLocation: ");
		result.append(executionLocation);
		result.append(')');
		return result.toString();
	}

} //DeploymentSpecificationImpl

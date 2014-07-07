/**
 */
package org.csu.slicing.UML2WithID;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deployment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2WithID.Deployment#getDeployedArtifact <em>Deployed Artifact</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.Deployment#getLocation <em>Location</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.Deployment#getConfiguration <em>Configuration</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getDeployment()
 * @model
 * @generated
 */
public interface Deployment extends Dependency {
	/**
	 * Returns the value of the '<em><b>Deployed Artifact</b></em>' reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2WithID.DeployedArtifact}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deployed Artifact</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployed Artifact</em>' reference list.
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getDeployment_DeployedArtifact()
	 * @model ordered="false"
	 * @generated
	 */
	EList<DeployedArtifact> getDeployedArtifact();

	/**
	 * Returns the value of the '<em><b>Location</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2WithID.DeploymentTarget#getDeployment <em>Deployment</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' container reference.
	 * @see #setLocation(DeploymentTarget)
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getDeployment_Location()
	 * @see org.csu.slicing.UML2WithID.DeploymentTarget#getDeployment
	 * @model opposite="deployment" required="true" transient="false" ordered="false"
	 * @generated
	 */
	DeploymentTarget getLocation();

	/**
	 * Sets the value of the '{@link org.csu.slicing.UML2WithID.Deployment#getLocation <em>Location</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' container reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(DeploymentTarget value);

	/**
	 * Returns the value of the '<em><b>Configuration</b></em>' containment reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2WithID.DeploymentSpecification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configuration</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration</em>' containment reference list.
	 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage#getDeployment_Configuration()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<DeploymentSpecification> getConfiguration();

} // Deployment

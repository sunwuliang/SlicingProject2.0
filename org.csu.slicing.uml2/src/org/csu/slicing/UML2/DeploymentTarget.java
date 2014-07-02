/**
 */
package org.csu.slicing.UML2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deployment Target</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2.DeploymentTarget#getDeployment <em>Deployment</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.DeploymentTarget#getDeployedElement <em>Deployed Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.csu.slicing.UML2.UML2Package#getDeploymentTarget()
 * @model abstract="true"
 * @generated
 */
public interface DeploymentTarget extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Deployment</b></em>' containment reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2.Deployment}.
	 * It is bidirectional and its opposite is '{@link org.csu.slicing.UML2.Deployment#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deployment</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployment</em>' containment reference list.
	 * @see org.csu.slicing.UML2.UML2Package#getDeploymentTarget_Deployment()
	 * @see org.csu.slicing.UML2.Deployment#getLocation
	 * @model opposite="location" containment="true" ordered="false"
	 * @generated
	 */
	EList<Deployment> getDeployment();

	/**
	 * Returns the value of the '<em><b>Deployed Element</b></em>' reference list.
	 * The list contents are of type {@link org.csu.slicing.UML2.PackageableElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deployed Element</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployed Element</em>' reference list.
	 * @see org.csu.slicing.UML2.UML2Package#getDeploymentTarget_DeployedElement()
	 * @model ordered="false"
	 * @generated
	 */
	EList<PackageableElement> getDeployedElement();

} // DeploymentTarget

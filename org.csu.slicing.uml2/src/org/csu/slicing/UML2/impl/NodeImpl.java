/**
 */
package org.csu.slicing.UML2.impl;

import java.util.Collection;

import org.csu.slicing.UML2.Deployment;
import org.csu.slicing.UML2.DeploymentTarget;
import org.csu.slicing.UML2.Node;
import org.csu.slicing.UML2.PackageableElement;
import org.csu.slicing.UML2.UML2Package;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2.impl.NodeImpl#getDeployment <em>Deployment</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.NodeImpl#getDeployedElement <em>Deployed Element</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.NodeImpl#getNestedNode <em>Nested Node</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NodeImpl extends ClassImpl implements Node {
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
	 * The cached value of the '{@link #getNestedNode() <em>Nested Node</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNestedNode()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> nestedNode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UML2Package.eINSTANCE.getNode();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Deployment> getDeployment() {
		if (deployment == null) {
			deployment = new EObjectContainmentWithInverseEList<Deployment>(Deployment.class, this, UML2Package.NODE__DEPLOYMENT, UML2Package.DEPLOYMENT__LOCATION);
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
			deployedElement = new EObjectResolvingEList<PackageableElement>(PackageableElement.class, this, UML2Package.NODE__DEPLOYED_ELEMENT);
		}
		return deployedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getNestedNode() {
		if (nestedNode == null) {
			nestedNode = new EObjectContainmentEList<Node>(Node.class, this, UML2Package.NODE__NESTED_NODE);
		}
		return nestedNode;
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
			case UML2Package.NODE__DEPLOYMENT:
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
			case UML2Package.NODE__DEPLOYMENT:
				return ((InternalEList<?>)getDeployment()).basicRemove(otherEnd, msgs);
			case UML2Package.NODE__NESTED_NODE:
				return ((InternalEList<?>)getNestedNode()).basicRemove(otherEnd, msgs);
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
			case UML2Package.NODE__DEPLOYMENT:
				return getDeployment();
			case UML2Package.NODE__DEPLOYED_ELEMENT:
				return getDeployedElement();
			case UML2Package.NODE__NESTED_NODE:
				return getNestedNode();
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
			case UML2Package.NODE__DEPLOYMENT:
				getDeployment().clear();
				getDeployment().addAll((Collection<? extends Deployment>)newValue);
				return;
			case UML2Package.NODE__DEPLOYED_ELEMENT:
				getDeployedElement().clear();
				getDeployedElement().addAll((Collection<? extends PackageableElement>)newValue);
				return;
			case UML2Package.NODE__NESTED_NODE:
				getNestedNode().clear();
				getNestedNode().addAll((Collection<? extends Node>)newValue);
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
			case UML2Package.NODE__DEPLOYMENT:
				getDeployment().clear();
				return;
			case UML2Package.NODE__DEPLOYED_ELEMENT:
				getDeployedElement().clear();
				return;
			case UML2Package.NODE__NESTED_NODE:
				getNestedNode().clear();
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
			case UML2Package.NODE__DEPLOYMENT:
				return deployment != null && !deployment.isEmpty();
			case UML2Package.NODE__DEPLOYED_ELEMENT:
				return deployedElement != null && !deployedElement.isEmpty();
			case UML2Package.NODE__NESTED_NODE:
				return nestedNode != null && !nestedNode.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == DeploymentTarget.class) {
			switch (derivedFeatureID) {
				case UML2Package.NODE__DEPLOYMENT: return UML2Package.DEPLOYMENT_TARGET__DEPLOYMENT;
				case UML2Package.NODE__DEPLOYED_ELEMENT: return UML2Package.DEPLOYMENT_TARGET__DEPLOYED_ELEMENT;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == DeploymentTarget.class) {
			switch (baseFeatureID) {
				case UML2Package.DEPLOYMENT_TARGET__DEPLOYMENT: return UML2Package.NODE__DEPLOYMENT;
				case UML2Package.DEPLOYMENT_TARGET__DEPLOYED_ELEMENT: return UML2Package.NODE__DEPLOYED_ELEMENT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //NodeImpl

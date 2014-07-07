/**
 */
package org.csu.slicing.UML2WithID.impl;

import java.util.Collection;

import org.csu.slicing.UML2WithID.Classifier;
import org.csu.slicing.UML2WithID.DirectedRelationship;
import org.csu.slicing.UML2WithID.Element;
import org.csu.slicing.UML2WithID.InformationFlow;
import org.csu.slicing.UML2WithID.Relationship;
import org.csu.slicing.UML2WithID.UML2WithIDPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Information Flow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.InformationFlowImpl#getRelatedElement <em>Related Element</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.InformationFlowImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.InformationFlowImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.InformationFlowImpl#getRealization <em>Realization</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.InformationFlowImpl#getConveyed <em>Conveyed</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InformationFlowImpl extends PackageableElementImpl implements InformationFlow {
	/**
	 * The cached value of the '{@link #getRelatedElement() <em>Related Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedElement()
	 * @generated
	 * @ordered
	 */
	protected EList<Element> relatedElement;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected EList<Element> source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected EList<Element> target;

	/**
	 * The cached value of the '{@link #getRealization() <em>Realization</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealization()
	 * @generated
	 * @ordered
	 */
	protected EList<Relationship> realization;

	/**
	 * The cached value of the '{@link #getConveyed() <em>Conveyed</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConveyed()
	 * @generated
	 * @ordered
	 */
	protected EList<Classifier> conveyed;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InformationFlowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UML2WithIDPackage.eINSTANCE.getInformationFlow();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getRelatedElement() {
		if (relatedElement == null) {
			relatedElement = new EObjectResolvingEList<Element>(Element.class, this, UML2WithIDPackage.INFORMATION_FLOW__RELATED_ELEMENT);
		}
		return relatedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getSource() {
		if (source == null) {
			source = new EObjectResolvingEList<Element>(Element.class, this, UML2WithIDPackage.INFORMATION_FLOW__SOURCE);
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getTarget() {
		if (target == null) {
			target = new EObjectResolvingEList<Element>(Element.class, this, UML2WithIDPackage.INFORMATION_FLOW__TARGET);
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relationship> getRealization() {
		if (realization == null) {
			realization = new EObjectResolvingEList<Relationship>(Relationship.class, this, UML2WithIDPackage.INFORMATION_FLOW__REALIZATION);
		}
		return realization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Classifier> getConveyed() {
		if (conveyed == null) {
			conveyed = new EObjectResolvingEList<Classifier>(Classifier.class, this, UML2WithIDPackage.INFORMATION_FLOW__CONVEYED);
		}
		return conveyed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UML2WithIDPackage.INFORMATION_FLOW__RELATED_ELEMENT:
				return getRelatedElement();
			case UML2WithIDPackage.INFORMATION_FLOW__SOURCE:
				return getSource();
			case UML2WithIDPackage.INFORMATION_FLOW__TARGET:
				return getTarget();
			case UML2WithIDPackage.INFORMATION_FLOW__REALIZATION:
				return getRealization();
			case UML2WithIDPackage.INFORMATION_FLOW__CONVEYED:
				return getConveyed();
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
			case UML2WithIDPackage.INFORMATION_FLOW__RELATED_ELEMENT:
				getRelatedElement().clear();
				getRelatedElement().addAll((Collection<? extends Element>)newValue);
				return;
			case UML2WithIDPackage.INFORMATION_FLOW__SOURCE:
				getSource().clear();
				getSource().addAll((Collection<? extends Element>)newValue);
				return;
			case UML2WithIDPackage.INFORMATION_FLOW__TARGET:
				getTarget().clear();
				getTarget().addAll((Collection<? extends Element>)newValue);
				return;
			case UML2WithIDPackage.INFORMATION_FLOW__REALIZATION:
				getRealization().clear();
				getRealization().addAll((Collection<? extends Relationship>)newValue);
				return;
			case UML2WithIDPackage.INFORMATION_FLOW__CONVEYED:
				getConveyed().clear();
				getConveyed().addAll((Collection<? extends Classifier>)newValue);
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
			case UML2WithIDPackage.INFORMATION_FLOW__RELATED_ELEMENT:
				getRelatedElement().clear();
				return;
			case UML2WithIDPackage.INFORMATION_FLOW__SOURCE:
				getSource().clear();
				return;
			case UML2WithIDPackage.INFORMATION_FLOW__TARGET:
				getTarget().clear();
				return;
			case UML2WithIDPackage.INFORMATION_FLOW__REALIZATION:
				getRealization().clear();
				return;
			case UML2WithIDPackage.INFORMATION_FLOW__CONVEYED:
				getConveyed().clear();
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
			case UML2WithIDPackage.INFORMATION_FLOW__RELATED_ELEMENT:
				return relatedElement != null && !relatedElement.isEmpty();
			case UML2WithIDPackage.INFORMATION_FLOW__SOURCE:
				return source != null && !source.isEmpty();
			case UML2WithIDPackage.INFORMATION_FLOW__TARGET:
				return target != null && !target.isEmpty();
			case UML2WithIDPackage.INFORMATION_FLOW__REALIZATION:
				return realization != null && !realization.isEmpty();
			case UML2WithIDPackage.INFORMATION_FLOW__CONVEYED:
				return conveyed != null && !conveyed.isEmpty();
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
		if (baseClass == Relationship.class) {
			switch (derivedFeatureID) {
				case UML2WithIDPackage.INFORMATION_FLOW__RELATED_ELEMENT: return UML2WithIDPackage.RELATIONSHIP__RELATED_ELEMENT;
				default: return -1;
			}
		}
		if (baseClass == DirectedRelationship.class) {
			switch (derivedFeatureID) {
				case UML2WithIDPackage.INFORMATION_FLOW__SOURCE: return UML2WithIDPackage.DIRECTED_RELATIONSHIP__SOURCE;
				case UML2WithIDPackage.INFORMATION_FLOW__TARGET: return UML2WithIDPackage.DIRECTED_RELATIONSHIP__TARGET;
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
		if (baseClass == Relationship.class) {
			switch (baseFeatureID) {
				case UML2WithIDPackage.RELATIONSHIP__RELATED_ELEMENT: return UML2WithIDPackage.INFORMATION_FLOW__RELATED_ELEMENT;
				default: return -1;
			}
		}
		if (baseClass == DirectedRelationship.class) {
			switch (baseFeatureID) {
				case UML2WithIDPackage.DIRECTED_RELATIONSHIP__SOURCE: return UML2WithIDPackage.INFORMATION_FLOW__SOURCE;
				case UML2WithIDPackage.DIRECTED_RELATIONSHIP__TARGET: return UML2WithIDPackage.INFORMATION_FLOW__TARGET;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //InformationFlowImpl

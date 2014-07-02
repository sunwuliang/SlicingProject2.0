/**
 */
package org.csu.slicing.UML2.impl;

import java.util.Collection;

import org.csu.slicing.UML2.Interval;
import org.csu.slicing.UML2.UML2Package;
import org.csu.slicing.UML2.ValueSpecification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interval</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2.impl.IntervalImpl#getMin <em>Min</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.IntervalImpl#getMax <em>Max</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IntervalImpl extends ValueSpecificationImpl implements Interval {
	/**
	 * The cached value of the '{@link #getMin() <em>Min</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin()
	 * @generated
	 * @ordered
	 */
	protected EList<ValueSpecification> min;

	/**
	 * The cached value of the '{@link #getMax() <em>Max</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax()
	 * @generated
	 * @ordered
	 */
	protected EList<ValueSpecification> max;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntervalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UML2Package.eINSTANCE.getInterval();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValueSpecification> getMin() {
		if (min == null) {
			min = new EObjectResolvingEList<ValueSpecification>(ValueSpecification.class, this, UML2Package.INTERVAL__MIN);
		}
		return min;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValueSpecification> getMax() {
		if (max == null) {
			max = new EObjectResolvingEList<ValueSpecification>(ValueSpecification.class, this, UML2Package.INTERVAL__MAX);
		}
		return max;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UML2Package.INTERVAL__MIN:
				return getMin();
			case UML2Package.INTERVAL__MAX:
				return getMax();
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
			case UML2Package.INTERVAL__MIN:
				getMin().clear();
				getMin().addAll((Collection<? extends ValueSpecification>)newValue);
				return;
			case UML2Package.INTERVAL__MAX:
				getMax().clear();
				getMax().addAll((Collection<? extends ValueSpecification>)newValue);
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
			case UML2Package.INTERVAL__MIN:
				getMin().clear();
				return;
			case UML2Package.INTERVAL__MAX:
				getMax().clear();
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
			case UML2Package.INTERVAL__MIN:
				return min != null && !min.isEmpty();
			case UML2Package.INTERVAL__MAX:
				return max != null && !max.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IntervalImpl

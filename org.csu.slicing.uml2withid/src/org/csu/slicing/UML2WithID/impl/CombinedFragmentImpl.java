/**
 */
package org.csu.slicing.UML2WithID.impl;

import java.util.Collection;

import org.csu.slicing.UML2WithID.CombinedFragment;
import org.csu.slicing.UML2WithID.Gate;
import org.csu.slicing.UML2WithID.InteractionOperand;
import org.csu.slicing.UML2WithID.InteractionOperator;
import org.csu.slicing.UML2WithID.UML2WithIDPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Combined Fragment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.CombinedFragmentImpl#getInteractionOperator <em>Interaction Operator</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.CombinedFragmentImpl#getOperand <em>Operand</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.CombinedFragmentImpl#getCfragmentGate <em>Cfragment Gate</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CombinedFragmentImpl extends InteractionFragmentImpl implements CombinedFragment {
	/**
	 * The default value of the '{@link #getInteractionOperator() <em>Interaction Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteractionOperator()
	 * @generated
	 * @ordered
	 */
	protected static final InteractionOperator INTERACTION_OPERATOR_EDEFAULT = InteractionOperator.CONSIDER;

	/**
	 * The cached value of the '{@link #getInteractionOperator() <em>Interaction Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteractionOperator()
	 * @generated
	 * @ordered
	 */
	protected InteractionOperator interactionOperator = INTERACTION_OPERATOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOperand() <em>Operand</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperand()
	 * @generated
	 * @ordered
	 */
	protected EList<InteractionOperand> operand;

	/**
	 * The cached value of the '{@link #getCfragmentGate() <em>Cfragment Gate</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCfragmentGate()
	 * @generated
	 * @ordered
	 */
	protected EList<Gate> cfragmentGate;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CombinedFragmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UML2WithIDPackage.eINSTANCE.getCombinedFragment();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionOperator getInteractionOperator() {
		return interactionOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInteractionOperator(InteractionOperator newInteractionOperator) {
		InteractionOperator oldInteractionOperator = interactionOperator;
		interactionOperator = newInteractionOperator == null ? INTERACTION_OPERATOR_EDEFAULT : newInteractionOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2WithIDPackage.COMBINED_FRAGMENT__INTERACTION_OPERATOR, oldInteractionOperator, interactionOperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InteractionOperand> getOperand() {
		if (operand == null) {
			operand = new EObjectContainmentEList<InteractionOperand>(InteractionOperand.class, this, UML2WithIDPackage.COMBINED_FRAGMENT__OPERAND);
		}
		return operand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Gate> getCfragmentGate() {
		if (cfragmentGate == null) {
			cfragmentGate = new EObjectContainmentEList<Gate>(Gate.class, this, UML2WithIDPackage.COMBINED_FRAGMENT__CFRAGMENT_GATE);
		}
		return cfragmentGate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UML2WithIDPackage.COMBINED_FRAGMENT__OPERAND:
				return ((InternalEList<?>)getOperand()).basicRemove(otherEnd, msgs);
			case UML2WithIDPackage.COMBINED_FRAGMENT__CFRAGMENT_GATE:
				return ((InternalEList<?>)getCfragmentGate()).basicRemove(otherEnd, msgs);
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
			case UML2WithIDPackage.COMBINED_FRAGMENT__INTERACTION_OPERATOR:
				return getInteractionOperator();
			case UML2WithIDPackage.COMBINED_FRAGMENT__OPERAND:
				return getOperand();
			case UML2WithIDPackage.COMBINED_FRAGMENT__CFRAGMENT_GATE:
				return getCfragmentGate();
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
			case UML2WithIDPackage.COMBINED_FRAGMENT__INTERACTION_OPERATOR:
				setInteractionOperator((InteractionOperator)newValue);
				return;
			case UML2WithIDPackage.COMBINED_FRAGMENT__OPERAND:
				getOperand().clear();
				getOperand().addAll((Collection<? extends InteractionOperand>)newValue);
				return;
			case UML2WithIDPackage.COMBINED_FRAGMENT__CFRAGMENT_GATE:
				getCfragmentGate().clear();
				getCfragmentGate().addAll((Collection<? extends Gate>)newValue);
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
			case UML2WithIDPackage.COMBINED_FRAGMENT__INTERACTION_OPERATOR:
				setInteractionOperator(INTERACTION_OPERATOR_EDEFAULT);
				return;
			case UML2WithIDPackage.COMBINED_FRAGMENT__OPERAND:
				getOperand().clear();
				return;
			case UML2WithIDPackage.COMBINED_FRAGMENT__CFRAGMENT_GATE:
				getCfragmentGate().clear();
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
			case UML2WithIDPackage.COMBINED_FRAGMENT__INTERACTION_OPERATOR:
				return interactionOperator != INTERACTION_OPERATOR_EDEFAULT;
			case UML2WithIDPackage.COMBINED_FRAGMENT__OPERAND:
				return operand != null && !operand.isEmpty();
			case UML2WithIDPackage.COMBINED_FRAGMENT__CFRAGMENT_GATE:
				return cfragmentGate != null && !cfragmentGate.isEmpty();
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
		result.append(" (interactionOperator: ");
		result.append(interactionOperator);
		result.append(')');
		return result.toString();
	}

} //CombinedFragmentImpl

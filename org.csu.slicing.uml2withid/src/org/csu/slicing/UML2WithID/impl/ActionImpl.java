/**
 */
package org.csu.slicing.UML2WithID.impl;

import java.util.Collection;

import org.csu.slicing.UML2WithID.Action;
import org.csu.slicing.UML2WithID.Classifier;
import org.csu.slicing.UML2WithID.Constraint;
import org.csu.slicing.UML2WithID.InputPin;
import org.csu.slicing.UML2WithID.OutputPin;
import org.csu.slicing.UML2WithID.UML2WithIDPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.ActionImpl#getEffect <em>Effect</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.ActionImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.ActionImpl#getInput <em>Input</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.ActionImpl#getContext_ <em>Context </em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.ActionImpl#getLocalPrecondition <em>Local Precondition</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.ActionImpl#getLocalPostcondition <em>Local Postcondition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActionImpl extends ExecutableNodeImpl implements Action {
	/**
	 * The default value of the '{@link #getEffect() <em>Effect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffect()
	 * @generated
	 * @ordered
	 */
	protected static final String EFFECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEffect() <em>Effect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffect()
	 * @generated
	 * @ordered
	 */
	protected String effect = EFFECT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOutput() <em>Output</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected EList<OutputPin> output;

	/**
	 * The cached value of the '{@link #getInput() <em>Input</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected EList<InputPin> input;

	/**
	 * The cached value of the '{@link #getContext_() <em>Context </em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext_()
	 * @generated
	 * @ordered
	 */
	protected Classifier context_;

	/**
	 * The cached value of the '{@link #getLocalPrecondition() <em>Local Precondition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalPrecondition()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> localPrecondition;

	/**
	 * The cached value of the '{@link #getLocalPostcondition() <em>Local Postcondition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalPostcondition()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> localPostcondition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UML2WithIDPackage.eINSTANCE.getAction();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEffect() {
		return effect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffect(String newEffect) {
		String oldEffect = effect;
		effect = newEffect;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2WithIDPackage.ACTION__EFFECT, oldEffect, effect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutputPin> getOutput() {
		if (output == null) {
			output = new EObjectResolvingEList<OutputPin>(OutputPin.class, this, UML2WithIDPackage.ACTION__OUTPUT);
		}
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputPin> getInput() {
		if (input == null) {
			input = new EObjectResolvingEList<InputPin>(InputPin.class, this, UML2WithIDPackage.ACTION__INPUT);
		}
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getContext_() {
		if (context_ != null && context_.eIsProxy()) {
			InternalEObject oldContext_ = (InternalEObject)context_;
			context_ = (Classifier)eResolveProxy(oldContext_);
			if (context_ != oldContext_) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2WithIDPackage.ACTION__CONTEXT_, oldContext_, context_));
			}
		}
		return context_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier basicGetContext_() {
		return context_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContext_(Classifier newContext_) {
		Classifier oldContext_ = context_;
		context_ = newContext_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2WithIDPackage.ACTION__CONTEXT_, oldContext_, context_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getLocalPrecondition() {
		if (localPrecondition == null) {
			localPrecondition = new EObjectContainmentEList<Constraint>(Constraint.class, this, UML2WithIDPackage.ACTION__LOCAL_PRECONDITION);
		}
		return localPrecondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getLocalPostcondition() {
		if (localPostcondition == null) {
			localPostcondition = new EObjectContainmentEList<Constraint>(Constraint.class, this, UML2WithIDPackage.ACTION__LOCAL_POSTCONDITION);
		}
		return localPostcondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UML2WithIDPackage.ACTION__LOCAL_PRECONDITION:
				return ((InternalEList<?>)getLocalPrecondition()).basicRemove(otherEnd, msgs);
			case UML2WithIDPackage.ACTION__LOCAL_POSTCONDITION:
				return ((InternalEList<?>)getLocalPostcondition()).basicRemove(otherEnd, msgs);
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
			case UML2WithIDPackage.ACTION__EFFECT:
				return getEffect();
			case UML2WithIDPackage.ACTION__OUTPUT:
				return getOutput();
			case UML2WithIDPackage.ACTION__INPUT:
				return getInput();
			case UML2WithIDPackage.ACTION__CONTEXT_:
				if (resolve) return getContext_();
				return basicGetContext_();
			case UML2WithIDPackage.ACTION__LOCAL_PRECONDITION:
				return getLocalPrecondition();
			case UML2WithIDPackage.ACTION__LOCAL_POSTCONDITION:
				return getLocalPostcondition();
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
			case UML2WithIDPackage.ACTION__EFFECT:
				setEffect((String)newValue);
				return;
			case UML2WithIDPackage.ACTION__OUTPUT:
				getOutput().clear();
				getOutput().addAll((Collection<? extends OutputPin>)newValue);
				return;
			case UML2WithIDPackage.ACTION__INPUT:
				getInput().clear();
				getInput().addAll((Collection<? extends InputPin>)newValue);
				return;
			case UML2WithIDPackage.ACTION__CONTEXT_:
				setContext_((Classifier)newValue);
				return;
			case UML2WithIDPackage.ACTION__LOCAL_PRECONDITION:
				getLocalPrecondition().clear();
				getLocalPrecondition().addAll((Collection<? extends Constraint>)newValue);
				return;
			case UML2WithIDPackage.ACTION__LOCAL_POSTCONDITION:
				getLocalPostcondition().clear();
				getLocalPostcondition().addAll((Collection<? extends Constraint>)newValue);
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
			case UML2WithIDPackage.ACTION__EFFECT:
				setEffect(EFFECT_EDEFAULT);
				return;
			case UML2WithIDPackage.ACTION__OUTPUT:
				getOutput().clear();
				return;
			case UML2WithIDPackage.ACTION__INPUT:
				getInput().clear();
				return;
			case UML2WithIDPackage.ACTION__CONTEXT_:
				setContext_((Classifier)null);
				return;
			case UML2WithIDPackage.ACTION__LOCAL_PRECONDITION:
				getLocalPrecondition().clear();
				return;
			case UML2WithIDPackage.ACTION__LOCAL_POSTCONDITION:
				getLocalPostcondition().clear();
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
			case UML2WithIDPackage.ACTION__EFFECT:
				return EFFECT_EDEFAULT == null ? effect != null : !EFFECT_EDEFAULT.equals(effect);
			case UML2WithIDPackage.ACTION__OUTPUT:
				return output != null && !output.isEmpty();
			case UML2WithIDPackage.ACTION__INPUT:
				return input != null && !input.isEmpty();
			case UML2WithIDPackage.ACTION__CONTEXT_:
				return context_ != null;
			case UML2WithIDPackage.ACTION__LOCAL_PRECONDITION:
				return localPrecondition != null && !localPrecondition.isEmpty();
			case UML2WithIDPackage.ACTION__LOCAL_POSTCONDITION:
				return localPostcondition != null && !localPostcondition.isEmpty();
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
		result.append(" (effect: ");
		result.append(effect);
		result.append(')');
		return result.toString();
	}

} //ActionImpl

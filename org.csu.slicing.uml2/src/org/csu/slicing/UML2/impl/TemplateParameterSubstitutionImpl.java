/**
 */
package org.csu.slicing.UML2.impl;

import java.util.Collection;

import org.csu.slicing.UML2.ParameterableElement;
import org.csu.slicing.UML2.TemplateBinding;
import org.csu.slicing.UML2.TemplateParameter;
import org.csu.slicing.UML2.TemplateParameterSubstitution;
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
 * An implementation of the model object '<em><b>Template Parameter Substitution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2.impl.TemplateParameterSubstitutionImpl#getFormal <em>Formal</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.TemplateParameterSubstitutionImpl#getTemplateBinding <em>Template Binding</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.TemplateParameterSubstitutionImpl#getActual <em>Actual</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.TemplateParameterSubstitutionImpl#getOwnedActual <em>Owned Actual</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TemplateParameterSubstitutionImpl extends ElementImpl implements TemplateParameterSubstitution {
	/**
	 * The cached value of the '{@link #getFormal() <em>Formal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormal()
	 * @generated
	 * @ordered
	 */
	protected TemplateParameter formal;

	/**
	 * The cached value of the '{@link #getActual() <em>Actual</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActual()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterableElement> actual;

	/**
	 * The cached value of the '{@link #getOwnedActual() <em>Owned Actual</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedActual()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterableElement> ownedActual;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemplateParameterSubstitutionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UML2Package.eINSTANCE.getTemplateParameterSubstitution();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateParameter getFormal() {
		if (formal != null && formal.eIsProxy()) {
			InternalEObject oldFormal = (InternalEObject)formal;
			formal = (TemplateParameter)eResolveProxy(oldFormal);
			if (formal != oldFormal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2Package.TEMPLATE_PARAMETER_SUBSTITUTION__FORMAL, oldFormal, formal));
			}
		}
		return formal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateParameter basicGetFormal() {
		return formal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormal(TemplateParameter newFormal) {
		TemplateParameter oldFormal = formal;
		formal = newFormal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.TEMPLATE_PARAMETER_SUBSTITUTION__FORMAL, oldFormal, formal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateBinding getTemplateBinding() {
		if (eContainerFeatureID() != UML2Package.TEMPLATE_PARAMETER_SUBSTITUTION__TEMPLATE_BINDING) return null;
		return (TemplateBinding)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTemplateBinding(TemplateBinding newTemplateBinding, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTemplateBinding, UML2Package.TEMPLATE_PARAMETER_SUBSTITUTION__TEMPLATE_BINDING, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemplateBinding(TemplateBinding newTemplateBinding) {
		if (newTemplateBinding != eInternalContainer() || (eContainerFeatureID() != UML2Package.TEMPLATE_PARAMETER_SUBSTITUTION__TEMPLATE_BINDING && newTemplateBinding != null)) {
			if (EcoreUtil.isAncestor(this, newTemplateBinding))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTemplateBinding != null)
				msgs = ((InternalEObject)newTemplateBinding).eInverseAdd(this, UML2Package.TEMPLATE_BINDING__PARAMETER_SUBSTITUTION, TemplateBinding.class, msgs);
			msgs = basicSetTemplateBinding(newTemplateBinding, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.TEMPLATE_PARAMETER_SUBSTITUTION__TEMPLATE_BINDING, newTemplateBinding, newTemplateBinding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParameterableElement> getActual() {
		if (actual == null) {
			actual = new EObjectResolvingEList<ParameterableElement>(ParameterableElement.class, this, UML2Package.TEMPLATE_PARAMETER_SUBSTITUTION__ACTUAL);
		}
		return actual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParameterableElement> getOwnedActual() {
		if (ownedActual == null) {
			ownedActual = new EObjectContainmentEList<ParameterableElement>(ParameterableElement.class, this, UML2Package.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL);
		}
		return ownedActual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UML2Package.TEMPLATE_PARAMETER_SUBSTITUTION__TEMPLATE_BINDING:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTemplateBinding((TemplateBinding)otherEnd, msgs);
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
			case UML2Package.TEMPLATE_PARAMETER_SUBSTITUTION__TEMPLATE_BINDING:
				return basicSetTemplateBinding(null, msgs);
			case UML2Package.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL:
				return ((InternalEList<?>)getOwnedActual()).basicRemove(otherEnd, msgs);
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
			case UML2Package.TEMPLATE_PARAMETER_SUBSTITUTION__TEMPLATE_BINDING:
				return eInternalContainer().eInverseRemove(this, UML2Package.TEMPLATE_BINDING__PARAMETER_SUBSTITUTION, TemplateBinding.class, msgs);
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
			case UML2Package.TEMPLATE_PARAMETER_SUBSTITUTION__FORMAL:
				if (resolve) return getFormal();
				return basicGetFormal();
			case UML2Package.TEMPLATE_PARAMETER_SUBSTITUTION__TEMPLATE_BINDING:
				return getTemplateBinding();
			case UML2Package.TEMPLATE_PARAMETER_SUBSTITUTION__ACTUAL:
				return getActual();
			case UML2Package.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL:
				return getOwnedActual();
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
			case UML2Package.TEMPLATE_PARAMETER_SUBSTITUTION__FORMAL:
				setFormal((TemplateParameter)newValue);
				return;
			case UML2Package.TEMPLATE_PARAMETER_SUBSTITUTION__TEMPLATE_BINDING:
				setTemplateBinding((TemplateBinding)newValue);
				return;
			case UML2Package.TEMPLATE_PARAMETER_SUBSTITUTION__ACTUAL:
				getActual().clear();
				getActual().addAll((Collection<? extends ParameterableElement>)newValue);
				return;
			case UML2Package.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL:
				getOwnedActual().clear();
				getOwnedActual().addAll((Collection<? extends ParameterableElement>)newValue);
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
			case UML2Package.TEMPLATE_PARAMETER_SUBSTITUTION__FORMAL:
				setFormal((TemplateParameter)null);
				return;
			case UML2Package.TEMPLATE_PARAMETER_SUBSTITUTION__TEMPLATE_BINDING:
				setTemplateBinding((TemplateBinding)null);
				return;
			case UML2Package.TEMPLATE_PARAMETER_SUBSTITUTION__ACTUAL:
				getActual().clear();
				return;
			case UML2Package.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL:
				getOwnedActual().clear();
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
			case UML2Package.TEMPLATE_PARAMETER_SUBSTITUTION__FORMAL:
				return formal != null;
			case UML2Package.TEMPLATE_PARAMETER_SUBSTITUTION__TEMPLATE_BINDING:
				return getTemplateBinding() != null;
			case UML2Package.TEMPLATE_PARAMETER_SUBSTITUTION__ACTUAL:
				return actual != null && !actual.isEmpty();
			case UML2Package.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL:
				return ownedActual != null && !ownedActual.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TemplateParameterSubstitutionImpl

/**
 */
package org.csu.slicing.UML2.impl;

import java.util.Collection;

import org.csu.slicing.UML2.RedefinableTemplateSignature;
import org.csu.slicing.UML2.TemplateParameter;
import org.csu.slicing.UML2.TemplateSignature;
import org.csu.slicing.UML2.TemplateableElement;
import org.csu.slicing.UML2.UML2Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Redefinable Template Signature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2.impl.RedefinableTemplateSignatureImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.RedefinableTemplateSignatureImpl#getOwnedParameter <em>Owned Parameter</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.RedefinableTemplateSignatureImpl#getNestedSignature <em>Nested Signature</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.RedefinableTemplateSignatureImpl#getNestingSignature <em>Nesting Signature</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.RedefinableTemplateSignatureImpl#getTemplate <em>Template</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RedefinableTemplateSignatureImpl extends RedefinableElementImpl implements RedefinableTemplateSignature {
	/**
	 * The cached value of the '{@link #getParameter() <em>Parameter</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<TemplateParameter> parameter;

	/**
	 * The cached value of the '{@link #getOwnedParameter() <em>Owned Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<TemplateParameter> ownedParameter;

	/**
	 * The cached value of the '{@link #getNestedSignature() <em>Nested Signature</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNestedSignature()
	 * @generated
	 * @ordered
	 */
	protected EList<TemplateSignature> nestedSignature;

	/**
	 * The cached value of the '{@link #getNestingSignature() <em>Nesting Signature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNestingSignature()
	 * @generated
	 * @ordered
	 */
	protected TemplateSignature nestingSignature;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RedefinableTemplateSignatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UML2Package.eINSTANCE.getRedefinableTemplateSignature();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TemplateParameter> getParameter() {
		if (parameter == null) {
			parameter = new EObjectResolvingEList<TemplateParameter>(TemplateParameter.class, this, UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__PARAMETER);
		}
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TemplateParameter> getOwnedParameter() {
		if (ownedParameter == null) {
			ownedParameter = new EObjectContainmentWithInverseEList<TemplateParameter>(TemplateParameter.class, this, UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_PARAMETER, UML2Package.TEMPLATE_PARAMETER__SIGNATURE);
		}
		return ownedParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TemplateSignature> getNestedSignature() {
		if (nestedSignature == null) {
			nestedSignature = new EObjectWithInverseResolvingEList<TemplateSignature>(TemplateSignature.class, this, UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__NESTED_SIGNATURE, UML2Package.TEMPLATE_SIGNATURE__NESTING_SIGNATURE);
		}
		return nestedSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateSignature getNestingSignature() {
		if (nestingSignature != null && nestingSignature.eIsProxy()) {
			InternalEObject oldNestingSignature = (InternalEObject)nestingSignature;
			nestingSignature = (TemplateSignature)eResolveProxy(oldNestingSignature);
			if (nestingSignature != oldNestingSignature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__NESTING_SIGNATURE, oldNestingSignature, nestingSignature));
			}
		}
		return nestingSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateSignature basicGetNestingSignature() {
		return nestingSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNestingSignature(TemplateSignature newNestingSignature, NotificationChain msgs) {
		TemplateSignature oldNestingSignature = nestingSignature;
		nestingSignature = newNestingSignature;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__NESTING_SIGNATURE, oldNestingSignature, newNestingSignature);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNestingSignature(TemplateSignature newNestingSignature) {
		if (newNestingSignature != nestingSignature) {
			NotificationChain msgs = null;
			if (nestingSignature != null)
				msgs = ((InternalEObject)nestingSignature).eInverseRemove(this, UML2Package.TEMPLATE_SIGNATURE__NESTED_SIGNATURE, TemplateSignature.class, msgs);
			if (newNestingSignature != null)
				msgs = ((InternalEObject)newNestingSignature).eInverseAdd(this, UML2Package.TEMPLATE_SIGNATURE__NESTED_SIGNATURE, TemplateSignature.class, msgs);
			msgs = basicSetNestingSignature(newNestingSignature, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__NESTING_SIGNATURE, newNestingSignature, newNestingSignature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateableElement getTemplate() {
		if (eContainerFeatureID() != UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__TEMPLATE) return null;
		return (TemplateableElement)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTemplate(TemplateableElement newTemplate, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTemplate, UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__TEMPLATE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemplate(TemplateableElement newTemplate) {
		if (newTemplate != eInternalContainer() || (eContainerFeatureID() != UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__TEMPLATE && newTemplate != null)) {
			if (EcoreUtil.isAncestor(this, newTemplate))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTemplate != null)
				msgs = ((InternalEObject)newTemplate).eInverseAdd(this, UML2Package.TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE, TemplateableElement.class, msgs);
			msgs = basicSetTemplate(newTemplate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__TEMPLATE, newTemplate, newTemplate));
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
			case UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_PARAMETER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedParameter()).basicAdd(otherEnd, msgs);
			case UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__NESTED_SIGNATURE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getNestedSignature()).basicAdd(otherEnd, msgs);
			case UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__NESTING_SIGNATURE:
				if (nestingSignature != null)
					msgs = ((InternalEObject)nestingSignature).eInverseRemove(this, UML2Package.TEMPLATE_SIGNATURE__NESTED_SIGNATURE, TemplateSignature.class, msgs);
				return basicSetNestingSignature((TemplateSignature)otherEnd, msgs);
			case UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__TEMPLATE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTemplate((TemplateableElement)otherEnd, msgs);
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
			case UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_PARAMETER:
				return ((InternalEList<?>)getOwnedParameter()).basicRemove(otherEnd, msgs);
			case UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__NESTED_SIGNATURE:
				return ((InternalEList<?>)getNestedSignature()).basicRemove(otherEnd, msgs);
			case UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__NESTING_SIGNATURE:
				return basicSetNestingSignature(null, msgs);
			case UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__TEMPLATE:
				return basicSetTemplate(null, msgs);
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
			case UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__TEMPLATE:
				return eInternalContainer().eInverseRemove(this, UML2Package.TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE, TemplateableElement.class, msgs);
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
			case UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__PARAMETER:
				return getParameter();
			case UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_PARAMETER:
				return getOwnedParameter();
			case UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__NESTED_SIGNATURE:
				return getNestedSignature();
			case UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__NESTING_SIGNATURE:
				if (resolve) return getNestingSignature();
				return basicGetNestingSignature();
			case UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__TEMPLATE:
				return getTemplate();
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
			case UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__PARAMETER:
				getParameter().clear();
				getParameter().addAll((Collection<? extends TemplateParameter>)newValue);
				return;
			case UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_PARAMETER:
				getOwnedParameter().clear();
				getOwnedParameter().addAll((Collection<? extends TemplateParameter>)newValue);
				return;
			case UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__NESTED_SIGNATURE:
				getNestedSignature().clear();
				getNestedSignature().addAll((Collection<? extends TemplateSignature>)newValue);
				return;
			case UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__NESTING_SIGNATURE:
				setNestingSignature((TemplateSignature)newValue);
				return;
			case UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__TEMPLATE:
				setTemplate((TemplateableElement)newValue);
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
			case UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__PARAMETER:
				getParameter().clear();
				return;
			case UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_PARAMETER:
				getOwnedParameter().clear();
				return;
			case UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__NESTED_SIGNATURE:
				getNestedSignature().clear();
				return;
			case UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__NESTING_SIGNATURE:
				setNestingSignature((TemplateSignature)null);
				return;
			case UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__TEMPLATE:
				setTemplate((TemplateableElement)null);
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
			case UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__PARAMETER:
				return parameter != null && !parameter.isEmpty();
			case UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_PARAMETER:
				return ownedParameter != null && !ownedParameter.isEmpty();
			case UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__NESTED_SIGNATURE:
				return nestedSignature != null && !nestedSignature.isEmpty();
			case UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__NESTING_SIGNATURE:
				return nestingSignature != null;
			case UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__TEMPLATE:
				return getTemplate() != null;
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
		if (baseClass == TemplateSignature.class) {
			switch (derivedFeatureID) {
				case UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__PARAMETER: return UML2Package.TEMPLATE_SIGNATURE__PARAMETER;
				case UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_PARAMETER: return UML2Package.TEMPLATE_SIGNATURE__OWNED_PARAMETER;
				case UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__NESTED_SIGNATURE: return UML2Package.TEMPLATE_SIGNATURE__NESTED_SIGNATURE;
				case UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__NESTING_SIGNATURE: return UML2Package.TEMPLATE_SIGNATURE__NESTING_SIGNATURE;
				case UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__TEMPLATE: return UML2Package.TEMPLATE_SIGNATURE__TEMPLATE;
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
		if (baseClass == TemplateSignature.class) {
			switch (baseFeatureID) {
				case UML2Package.TEMPLATE_SIGNATURE__PARAMETER: return UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__PARAMETER;
				case UML2Package.TEMPLATE_SIGNATURE__OWNED_PARAMETER: return UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_PARAMETER;
				case UML2Package.TEMPLATE_SIGNATURE__NESTED_SIGNATURE: return UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__NESTED_SIGNATURE;
				case UML2Package.TEMPLATE_SIGNATURE__NESTING_SIGNATURE: return UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__NESTING_SIGNATURE;
				case UML2Package.TEMPLATE_SIGNATURE__TEMPLATE: return UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE__TEMPLATE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //RedefinableTemplateSignatureImpl

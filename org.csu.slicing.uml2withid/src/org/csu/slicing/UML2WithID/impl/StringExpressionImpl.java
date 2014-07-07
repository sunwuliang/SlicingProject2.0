/**
 */
package org.csu.slicing.UML2WithID.impl;

import java.util.Collection;

import org.csu.slicing.UML2WithID.StringExpression;
import org.csu.slicing.UML2WithID.UML2WithIDPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>String Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.StringExpressionImpl#getSubExpression <em>Sub Expression</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.StringExpressionImpl#getOwningExpression <em>Owning Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StringExpressionImpl extends TemplateableElementImpl implements StringExpression {
	/**
	 * The cached value of the '{@link #getSubExpression() <em>Sub Expression</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubExpression()
	 * @generated
	 * @ordered
	 */
	protected EList<StringExpression> subExpression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StringExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UML2WithIDPackage.eINSTANCE.getStringExpression();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StringExpression> getSubExpression() {
		if (subExpression == null) {
			subExpression = new EObjectContainmentWithInverseEList<StringExpression>(StringExpression.class, this, UML2WithIDPackage.STRING_EXPRESSION__SUB_EXPRESSION, UML2WithIDPackage.STRING_EXPRESSION__OWNING_EXPRESSION);
		}
		return subExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringExpression getOwningExpression() {
		if (eContainerFeatureID() != UML2WithIDPackage.STRING_EXPRESSION__OWNING_EXPRESSION) return null;
		return (StringExpression)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningExpression(StringExpression newOwningExpression, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningExpression, UML2WithIDPackage.STRING_EXPRESSION__OWNING_EXPRESSION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningExpression(StringExpression newOwningExpression) {
		if (newOwningExpression != eInternalContainer() || (eContainerFeatureID() != UML2WithIDPackage.STRING_EXPRESSION__OWNING_EXPRESSION && newOwningExpression != null)) {
			if (EcoreUtil.isAncestor(this, newOwningExpression))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningExpression != null)
				msgs = ((InternalEObject)newOwningExpression).eInverseAdd(this, UML2WithIDPackage.STRING_EXPRESSION__SUB_EXPRESSION, StringExpression.class, msgs);
			msgs = basicSetOwningExpression(newOwningExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2WithIDPackage.STRING_EXPRESSION__OWNING_EXPRESSION, newOwningExpression, newOwningExpression));
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
			case UML2WithIDPackage.STRING_EXPRESSION__SUB_EXPRESSION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubExpression()).basicAdd(otherEnd, msgs);
			case UML2WithIDPackage.STRING_EXPRESSION__OWNING_EXPRESSION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningExpression((StringExpression)otherEnd, msgs);
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
			case UML2WithIDPackage.STRING_EXPRESSION__SUB_EXPRESSION:
				return ((InternalEList<?>)getSubExpression()).basicRemove(otherEnd, msgs);
			case UML2WithIDPackage.STRING_EXPRESSION__OWNING_EXPRESSION:
				return basicSetOwningExpression(null, msgs);
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
			case UML2WithIDPackage.STRING_EXPRESSION__OWNING_EXPRESSION:
				return eInternalContainer().eInverseRemove(this, UML2WithIDPackage.STRING_EXPRESSION__SUB_EXPRESSION, StringExpression.class, msgs);
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
			case UML2WithIDPackage.STRING_EXPRESSION__SUB_EXPRESSION:
				return getSubExpression();
			case UML2WithIDPackage.STRING_EXPRESSION__OWNING_EXPRESSION:
				return getOwningExpression();
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
			case UML2WithIDPackage.STRING_EXPRESSION__SUB_EXPRESSION:
				getSubExpression().clear();
				getSubExpression().addAll((Collection<? extends StringExpression>)newValue);
				return;
			case UML2WithIDPackage.STRING_EXPRESSION__OWNING_EXPRESSION:
				setOwningExpression((StringExpression)newValue);
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
			case UML2WithIDPackage.STRING_EXPRESSION__SUB_EXPRESSION:
				getSubExpression().clear();
				return;
			case UML2WithIDPackage.STRING_EXPRESSION__OWNING_EXPRESSION:
				setOwningExpression((StringExpression)null);
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
			case UML2WithIDPackage.STRING_EXPRESSION__SUB_EXPRESSION:
				return subExpression != null && !subExpression.isEmpty();
			case UML2WithIDPackage.STRING_EXPRESSION__OWNING_EXPRESSION:
				return getOwningExpression() != null;
		}
		return super.eIsSet(featureID);
	}

} //StringExpressionImpl

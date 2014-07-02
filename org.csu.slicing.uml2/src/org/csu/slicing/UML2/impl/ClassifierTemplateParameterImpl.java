/**
 */
package org.csu.slicing.UML2.impl;

import org.csu.slicing.UML2.ClassifierTemplateParameter;
import org.csu.slicing.UML2.UML2Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Classifier Template Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2.impl.ClassifierTemplateParameterImpl#isAllowSubstitutable <em>Allow Substitutable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassifierTemplateParameterImpl extends TemplateParameterImpl implements ClassifierTemplateParameter {
	/**
	 * The default value of the '{@link #isAllowSubstitutable() <em>Allow Substitutable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowSubstitutable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ALLOW_SUBSTITUTABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAllowSubstitutable() <em>Allow Substitutable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowSubstitutable()
	 * @generated
	 * @ordered
	 */
	protected boolean allowSubstitutable = ALLOW_SUBSTITUTABLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassifierTemplateParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UML2Package.eINSTANCE.getClassifierTemplateParameter();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAllowSubstitutable() {
		return allowSubstitutable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllowSubstitutable(boolean newAllowSubstitutable) {
		boolean oldAllowSubstitutable = allowSubstitutable;
		allowSubstitutable = newAllowSubstitutable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.CLASSIFIER_TEMPLATE_PARAMETER__ALLOW_SUBSTITUTABLE, oldAllowSubstitutable, allowSubstitutable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UML2Package.CLASSIFIER_TEMPLATE_PARAMETER__ALLOW_SUBSTITUTABLE:
				return isAllowSubstitutable();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UML2Package.CLASSIFIER_TEMPLATE_PARAMETER__ALLOW_SUBSTITUTABLE:
				setAllowSubstitutable((Boolean)newValue);
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
			case UML2Package.CLASSIFIER_TEMPLATE_PARAMETER__ALLOW_SUBSTITUTABLE:
				setAllowSubstitutable(ALLOW_SUBSTITUTABLE_EDEFAULT);
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
			case UML2Package.CLASSIFIER_TEMPLATE_PARAMETER__ALLOW_SUBSTITUTABLE:
				return allowSubstitutable != ALLOW_SUBSTITUTABLE_EDEFAULT;
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
		result.append(" (allowSubstitutable: ");
		result.append(allowSubstitutable);
		result.append(')');
		return result.toString();
	}

} //ClassifierTemplateParameterImpl

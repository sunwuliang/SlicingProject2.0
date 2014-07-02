/**
 */
package org.csu.slicing.UML2.impl;

import org.csu.slicing.UML2.MultiplicityElement;
import org.csu.slicing.UML2.StructuralFeature;
import org.csu.slicing.UML2.Type;
import org.csu.slicing.UML2.TypedElement;
import org.csu.slicing.UML2.UML2Package;
import org.csu.slicing.UML2.ValueSpecification;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Structural Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2.impl.StructuralFeatureImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.StructuralFeatureImpl#isIsOrdered <em>Is Ordered</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.StructuralFeatureImpl#isIsUnique <em>Is Unique</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.StructuralFeatureImpl#getLower <em>Lower</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.StructuralFeatureImpl#getUpper <em>Upper</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.StructuralFeatureImpl#getUpperValue <em>Upper Value</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.StructuralFeatureImpl#getLowerValue <em>Lower Value</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.StructuralFeatureImpl#isIsReadOnly <em>Is Read Only</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class StructuralFeatureImpl extends FeatureImpl implements StructuralFeature {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Type type;

	/**
	 * The default value of the '{@link #isIsOrdered() <em>Is Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOrdered()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ORDERED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsOrdered() <em>Is Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOrdered()
	 * @generated
	 * @ordered
	 */
	protected boolean isOrdered = IS_ORDERED_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsUnique() <em>Is Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsUnique()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_UNIQUE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsUnique() <em>Is Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsUnique()
	 * @generated
	 * @ordered
	 */
	protected boolean isUnique = IS_UNIQUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLower() <em>Lower</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLower()
	 * @generated
	 * @ordered
	 */
	protected static final int LOWER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLower() <em>Lower</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLower()
	 * @generated
	 * @ordered
	 */
	protected int lower = LOWER_EDEFAULT;

	/**
	 * The default value of the '{@link #getUpper() <em>Upper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpper()
	 * @generated
	 * @ordered
	 */
	protected static final String UPPER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUpper() <em>Upper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpper()
	 * @generated
	 * @ordered
	 */
	protected String upper = UPPER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUpperValue() <em>Upper Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperValue()
	 * @generated
	 * @ordered
	 */
	protected ValueSpecification upperValue;

	/**
	 * The cached value of the '{@link #getLowerValue() <em>Lower Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerValue()
	 * @generated
	 * @ordered
	 */
	protected ValueSpecification lowerValue;

	/**
	 * The default value of the '{@link #isIsReadOnly() <em>Is Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsReadOnly()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_READ_ONLY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsReadOnly() <em>Is Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsReadOnly()
	 * @generated
	 * @ordered
	 */
	protected boolean isReadOnly = IS_READ_ONLY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructuralFeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UML2Package.eINSTANCE.getStructuralFeature();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (Type)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2Package.STRUCTURAL_FEATURE__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Type newType) {
		Type oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.STRUCTURAL_FEATURE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsOrdered() {
		return isOrdered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsOrdered(boolean newIsOrdered) {
		boolean oldIsOrdered = isOrdered;
		isOrdered = newIsOrdered;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.STRUCTURAL_FEATURE__IS_ORDERED, oldIsOrdered, isOrdered));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsUnique() {
		return isUnique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsUnique(boolean newIsUnique) {
		boolean oldIsUnique = isUnique;
		isUnique = newIsUnique;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.STRUCTURAL_FEATURE__IS_UNIQUE, oldIsUnique, isUnique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLower() {
		return lower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLower(int newLower) {
		int oldLower = lower;
		lower = newLower;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.STRUCTURAL_FEATURE__LOWER, oldLower, lower));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUpper() {
		return upper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpper(String newUpper) {
		String oldUpper = upper;
		upper = newUpper;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.STRUCTURAL_FEATURE__UPPER, oldUpper, upper));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getUpperValue() {
		return upperValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpperValue(ValueSpecification newUpperValue, NotificationChain msgs) {
		ValueSpecification oldUpperValue = upperValue;
		upperValue = newUpperValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UML2Package.STRUCTURAL_FEATURE__UPPER_VALUE, oldUpperValue, newUpperValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpperValue(ValueSpecification newUpperValue) {
		if (newUpperValue != upperValue) {
			NotificationChain msgs = null;
			if (upperValue != null)
				msgs = ((InternalEObject)upperValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.STRUCTURAL_FEATURE__UPPER_VALUE, null, msgs);
			if (newUpperValue != null)
				msgs = ((InternalEObject)newUpperValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UML2Package.STRUCTURAL_FEATURE__UPPER_VALUE, null, msgs);
			msgs = basicSetUpperValue(newUpperValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.STRUCTURAL_FEATURE__UPPER_VALUE, newUpperValue, newUpperValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getLowerValue() {
		return lowerValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLowerValue(ValueSpecification newLowerValue, NotificationChain msgs) {
		ValueSpecification oldLowerValue = lowerValue;
		lowerValue = newLowerValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UML2Package.STRUCTURAL_FEATURE__LOWER_VALUE, oldLowerValue, newLowerValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowerValue(ValueSpecification newLowerValue) {
		if (newLowerValue != lowerValue) {
			NotificationChain msgs = null;
			if (lowerValue != null)
				msgs = ((InternalEObject)lowerValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.STRUCTURAL_FEATURE__LOWER_VALUE, null, msgs);
			if (newLowerValue != null)
				msgs = ((InternalEObject)newLowerValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UML2Package.STRUCTURAL_FEATURE__LOWER_VALUE, null, msgs);
			msgs = basicSetLowerValue(newLowerValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.STRUCTURAL_FEATURE__LOWER_VALUE, newLowerValue, newLowerValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsReadOnly() {
		return isReadOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsReadOnly(boolean newIsReadOnly) {
		boolean oldIsReadOnly = isReadOnly;
		isReadOnly = newIsReadOnly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.STRUCTURAL_FEATURE__IS_READ_ONLY, oldIsReadOnly, isReadOnly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UML2Package.STRUCTURAL_FEATURE__UPPER_VALUE:
				return basicSetUpperValue(null, msgs);
			case UML2Package.STRUCTURAL_FEATURE__LOWER_VALUE:
				return basicSetLowerValue(null, msgs);
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
			case UML2Package.STRUCTURAL_FEATURE__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case UML2Package.STRUCTURAL_FEATURE__IS_ORDERED:
				return isIsOrdered();
			case UML2Package.STRUCTURAL_FEATURE__IS_UNIQUE:
				return isIsUnique();
			case UML2Package.STRUCTURAL_FEATURE__LOWER:
				return getLower();
			case UML2Package.STRUCTURAL_FEATURE__UPPER:
				return getUpper();
			case UML2Package.STRUCTURAL_FEATURE__UPPER_VALUE:
				return getUpperValue();
			case UML2Package.STRUCTURAL_FEATURE__LOWER_VALUE:
				return getLowerValue();
			case UML2Package.STRUCTURAL_FEATURE__IS_READ_ONLY:
				return isIsReadOnly();
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
			case UML2Package.STRUCTURAL_FEATURE__TYPE:
				setType((Type)newValue);
				return;
			case UML2Package.STRUCTURAL_FEATURE__IS_ORDERED:
				setIsOrdered((Boolean)newValue);
				return;
			case UML2Package.STRUCTURAL_FEATURE__IS_UNIQUE:
				setIsUnique((Boolean)newValue);
				return;
			case UML2Package.STRUCTURAL_FEATURE__LOWER:
				setLower((Integer)newValue);
				return;
			case UML2Package.STRUCTURAL_FEATURE__UPPER:
				setUpper((String)newValue);
				return;
			case UML2Package.STRUCTURAL_FEATURE__UPPER_VALUE:
				setUpperValue((ValueSpecification)newValue);
				return;
			case UML2Package.STRUCTURAL_FEATURE__LOWER_VALUE:
				setLowerValue((ValueSpecification)newValue);
				return;
			case UML2Package.STRUCTURAL_FEATURE__IS_READ_ONLY:
				setIsReadOnly((Boolean)newValue);
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
			case UML2Package.STRUCTURAL_FEATURE__TYPE:
				setType((Type)null);
				return;
			case UML2Package.STRUCTURAL_FEATURE__IS_ORDERED:
				setIsOrdered(IS_ORDERED_EDEFAULT);
				return;
			case UML2Package.STRUCTURAL_FEATURE__IS_UNIQUE:
				setIsUnique(IS_UNIQUE_EDEFAULT);
				return;
			case UML2Package.STRUCTURAL_FEATURE__LOWER:
				setLower(LOWER_EDEFAULT);
				return;
			case UML2Package.STRUCTURAL_FEATURE__UPPER:
				setUpper(UPPER_EDEFAULT);
				return;
			case UML2Package.STRUCTURAL_FEATURE__UPPER_VALUE:
				setUpperValue((ValueSpecification)null);
				return;
			case UML2Package.STRUCTURAL_FEATURE__LOWER_VALUE:
				setLowerValue((ValueSpecification)null);
				return;
			case UML2Package.STRUCTURAL_FEATURE__IS_READ_ONLY:
				setIsReadOnly(IS_READ_ONLY_EDEFAULT);
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
			case UML2Package.STRUCTURAL_FEATURE__TYPE:
				return type != null;
			case UML2Package.STRUCTURAL_FEATURE__IS_ORDERED:
				return isOrdered != IS_ORDERED_EDEFAULT;
			case UML2Package.STRUCTURAL_FEATURE__IS_UNIQUE:
				return isUnique != IS_UNIQUE_EDEFAULT;
			case UML2Package.STRUCTURAL_FEATURE__LOWER:
				return lower != LOWER_EDEFAULT;
			case UML2Package.STRUCTURAL_FEATURE__UPPER:
				return UPPER_EDEFAULT == null ? upper != null : !UPPER_EDEFAULT.equals(upper);
			case UML2Package.STRUCTURAL_FEATURE__UPPER_VALUE:
				return upperValue != null;
			case UML2Package.STRUCTURAL_FEATURE__LOWER_VALUE:
				return lowerValue != null;
			case UML2Package.STRUCTURAL_FEATURE__IS_READ_ONLY:
				return isReadOnly != IS_READ_ONLY_EDEFAULT;
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
		if (baseClass == TypedElement.class) {
			switch (derivedFeatureID) {
				case UML2Package.STRUCTURAL_FEATURE__TYPE: return UML2Package.TYPED_ELEMENT__TYPE;
				default: return -1;
			}
		}
		if (baseClass == MultiplicityElement.class) {
			switch (derivedFeatureID) {
				case UML2Package.STRUCTURAL_FEATURE__IS_ORDERED: return UML2Package.MULTIPLICITY_ELEMENT__IS_ORDERED;
				case UML2Package.STRUCTURAL_FEATURE__IS_UNIQUE: return UML2Package.MULTIPLICITY_ELEMENT__IS_UNIQUE;
				case UML2Package.STRUCTURAL_FEATURE__LOWER: return UML2Package.MULTIPLICITY_ELEMENT__LOWER;
				case UML2Package.STRUCTURAL_FEATURE__UPPER: return UML2Package.MULTIPLICITY_ELEMENT__UPPER;
				case UML2Package.STRUCTURAL_FEATURE__UPPER_VALUE: return UML2Package.MULTIPLICITY_ELEMENT__UPPER_VALUE;
				case UML2Package.STRUCTURAL_FEATURE__LOWER_VALUE: return UML2Package.MULTIPLICITY_ELEMENT__LOWER_VALUE;
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
		if (baseClass == TypedElement.class) {
			switch (baseFeatureID) {
				case UML2Package.TYPED_ELEMENT__TYPE: return UML2Package.STRUCTURAL_FEATURE__TYPE;
				default: return -1;
			}
		}
		if (baseClass == MultiplicityElement.class) {
			switch (baseFeatureID) {
				case UML2Package.MULTIPLICITY_ELEMENT__IS_ORDERED: return UML2Package.STRUCTURAL_FEATURE__IS_ORDERED;
				case UML2Package.MULTIPLICITY_ELEMENT__IS_UNIQUE: return UML2Package.STRUCTURAL_FEATURE__IS_UNIQUE;
				case UML2Package.MULTIPLICITY_ELEMENT__LOWER: return UML2Package.STRUCTURAL_FEATURE__LOWER;
				case UML2Package.MULTIPLICITY_ELEMENT__UPPER: return UML2Package.STRUCTURAL_FEATURE__UPPER;
				case UML2Package.MULTIPLICITY_ELEMENT__UPPER_VALUE: return UML2Package.STRUCTURAL_FEATURE__UPPER_VALUE;
				case UML2Package.MULTIPLICITY_ELEMENT__LOWER_VALUE: return UML2Package.STRUCTURAL_FEATURE__LOWER_VALUE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (isOrdered: ");
		result.append(isOrdered);
		result.append(", isUnique: ");
		result.append(isUnique);
		result.append(", lower: ");
		result.append(lower);
		result.append(", upper: ");
		result.append(upper);
		result.append(", isReadOnly: ");
		result.append(isReadOnly);
		result.append(')');
		return result.toString();
	}

} //StructuralFeatureImpl

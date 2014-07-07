/**
 */
package org.csu.slicing.UML2WithID.impl;

import java.util.Collection;

import org.csu.slicing.UML2WithID.MultiplicityElement;
import org.csu.slicing.UML2WithID.Operation;
import org.csu.slicing.UML2WithID.Parameter;
import org.csu.slicing.UML2WithID.ParameterDirectionKind;
import org.csu.slicing.UML2WithID.ParameterEffectKind;
import org.csu.slicing.UML2WithID.ParameterSet;
import org.csu.slicing.UML2WithID.Type;
import org.csu.slicing.UML2WithID.TypedElement;
import org.csu.slicing.UML2WithID.UML2WithIDPackage;
import org.csu.slicing.UML2WithID.ValueSpecification;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.ParameterImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.ParameterImpl#isIsOrdered <em>Is Ordered</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.ParameterImpl#isIsUnique <em>Is Unique</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.ParameterImpl#getLower <em>Lower</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.ParameterImpl#getUpper <em>Upper</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.ParameterImpl#getUpperValue <em>Upper Value</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.ParameterImpl#getLowerValue <em>Lower Value</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.ParameterImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.ParameterImpl#getDefault <em>Default</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.ParameterImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.ParameterImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.ParameterImpl#isIsException <em>Is Exception</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.ParameterImpl#isIsStream <em>Is Stream</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.ParameterImpl#getEffect <em>Effect</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.ParameterImpl#getParameterSet <em>Parameter Set</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParameterImpl extends ConnectableElementImpl implements Parameter {
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
	 * The default value of the '{@link #getDefault() <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefault() <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault()
	 * @generated
	 * @ordered
	 */
	protected String default_ = DEFAULT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected static final ParameterDirectionKind DIRECTION_EDEFAULT = ParameterDirectionKind.IN;

	/**
	 * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected ParameterDirectionKind direction = DIRECTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected ValueSpecification defaultValue;

	/**
	 * The default value of the '{@link #isIsException() <em>Is Exception</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsException()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_EXCEPTION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsException() <em>Is Exception</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsException()
	 * @generated
	 * @ordered
	 */
	protected boolean isException = IS_EXCEPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsStream() <em>Is Stream</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsStream()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_STREAM_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsStream() <em>Is Stream</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsStream()
	 * @generated
	 * @ordered
	 */
	protected boolean isStream = IS_STREAM_EDEFAULT;

	/**
	 * The default value of the '{@link #getEffect() <em>Effect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffect()
	 * @generated
	 * @ordered
	 */
	protected static final ParameterEffectKind EFFECT_EDEFAULT = ParameterEffectKind.UPDATE;

	/**
	 * The cached value of the '{@link #getEffect() <em>Effect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffect()
	 * @generated
	 * @ordered
	 */
	protected ParameterEffectKind effect = EFFECT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParameterSet() <em>Parameter Set</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterSet()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterSet> parameterSet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UML2WithIDPackage.eINSTANCE.getParameter();
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2WithIDPackage.PARAMETER__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UML2WithIDPackage.PARAMETER__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UML2WithIDPackage.PARAMETER__IS_ORDERED, oldIsOrdered, isOrdered));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UML2WithIDPackage.PARAMETER__IS_UNIQUE, oldIsUnique, isUnique));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UML2WithIDPackage.PARAMETER__LOWER, oldLower, lower));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UML2WithIDPackage.PARAMETER__UPPER, oldUpper, upper));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UML2WithIDPackage.PARAMETER__UPPER_VALUE, oldUpperValue, newUpperValue);
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
				msgs = ((InternalEObject)upperValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2WithIDPackage.PARAMETER__UPPER_VALUE, null, msgs);
			if (newUpperValue != null)
				msgs = ((InternalEObject)newUpperValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UML2WithIDPackage.PARAMETER__UPPER_VALUE, null, msgs);
			msgs = basicSetUpperValue(newUpperValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2WithIDPackage.PARAMETER__UPPER_VALUE, newUpperValue, newUpperValue));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UML2WithIDPackage.PARAMETER__LOWER_VALUE, oldLowerValue, newLowerValue);
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
				msgs = ((InternalEObject)lowerValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2WithIDPackage.PARAMETER__LOWER_VALUE, null, msgs);
			if (newLowerValue != null)
				msgs = ((InternalEObject)newLowerValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UML2WithIDPackage.PARAMETER__LOWER_VALUE, null, msgs);
			msgs = basicSetLowerValue(newLowerValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2WithIDPackage.PARAMETER__LOWER_VALUE, newLowerValue, newLowerValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getOperation() {
		if (eContainerFeatureID() != UML2WithIDPackage.PARAMETER__OPERATION) return null;
		return (Operation)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperation(Operation newOperation, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOperation, UML2WithIDPackage.PARAMETER__OPERATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperation(Operation newOperation) {
		if (newOperation != eInternalContainer() || (eContainerFeatureID() != UML2WithIDPackage.PARAMETER__OPERATION && newOperation != null)) {
			if (EcoreUtil.isAncestor(this, newOperation))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOperation != null)
				msgs = ((InternalEObject)newOperation).eInverseAdd(this, UML2WithIDPackage.OPERATION__OWNED_PARAMETER, Operation.class, msgs);
			msgs = basicSetOperation(newOperation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2WithIDPackage.PARAMETER__OPERATION, newOperation, newOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefault() {
		return default_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefault(String newDefault) {
		String oldDefault = default_;
		default_ = newDefault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2WithIDPackage.PARAMETER__DEFAULT, oldDefault, default_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterDirectionKind getDirection() {
		return direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirection(ParameterDirectionKind newDirection) {
		ParameterDirectionKind oldDirection = direction;
		direction = newDirection == null ? DIRECTION_EDEFAULT : newDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2WithIDPackage.PARAMETER__DIRECTION, oldDirection, direction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getDefaultValue() {
		return defaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultValue(ValueSpecification newDefaultValue, NotificationChain msgs) {
		ValueSpecification oldDefaultValue = defaultValue;
		defaultValue = newDefaultValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UML2WithIDPackage.PARAMETER__DEFAULT_VALUE, oldDefaultValue, newDefaultValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValue(ValueSpecification newDefaultValue) {
		if (newDefaultValue != defaultValue) {
			NotificationChain msgs = null;
			if (defaultValue != null)
				msgs = ((InternalEObject)defaultValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2WithIDPackage.PARAMETER__DEFAULT_VALUE, null, msgs);
			if (newDefaultValue != null)
				msgs = ((InternalEObject)newDefaultValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UML2WithIDPackage.PARAMETER__DEFAULT_VALUE, null, msgs);
			msgs = basicSetDefaultValue(newDefaultValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2WithIDPackage.PARAMETER__DEFAULT_VALUE, newDefaultValue, newDefaultValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsException() {
		return isException;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsException(boolean newIsException) {
		boolean oldIsException = isException;
		isException = newIsException;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2WithIDPackage.PARAMETER__IS_EXCEPTION, oldIsException, isException));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsStream() {
		return isStream;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsStream(boolean newIsStream) {
		boolean oldIsStream = isStream;
		isStream = newIsStream;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2WithIDPackage.PARAMETER__IS_STREAM, oldIsStream, isStream));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterEffectKind getEffect() {
		return effect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffect(ParameterEffectKind newEffect) {
		ParameterEffectKind oldEffect = effect;
		effect = newEffect == null ? EFFECT_EDEFAULT : newEffect;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2WithIDPackage.PARAMETER__EFFECT, oldEffect, effect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParameterSet> getParameterSet() {
		if (parameterSet == null) {
			parameterSet = new EObjectWithInverseResolvingEList.ManyInverse<ParameterSet>(ParameterSet.class, this, UML2WithIDPackage.PARAMETER__PARAMETER_SET, UML2WithIDPackage.PARAMETER_SET__PARAMETER);
		}
		return parameterSet;
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
			case UML2WithIDPackage.PARAMETER__OPERATION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOperation((Operation)otherEnd, msgs);
			case UML2WithIDPackage.PARAMETER__PARAMETER_SET:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getParameterSet()).basicAdd(otherEnd, msgs);
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
			case UML2WithIDPackage.PARAMETER__UPPER_VALUE:
				return basicSetUpperValue(null, msgs);
			case UML2WithIDPackage.PARAMETER__LOWER_VALUE:
				return basicSetLowerValue(null, msgs);
			case UML2WithIDPackage.PARAMETER__OPERATION:
				return basicSetOperation(null, msgs);
			case UML2WithIDPackage.PARAMETER__DEFAULT_VALUE:
				return basicSetDefaultValue(null, msgs);
			case UML2WithIDPackage.PARAMETER__PARAMETER_SET:
				return ((InternalEList<?>)getParameterSet()).basicRemove(otherEnd, msgs);
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
			case UML2WithIDPackage.PARAMETER__OPERATION:
				return eInternalContainer().eInverseRemove(this, UML2WithIDPackage.OPERATION__OWNED_PARAMETER, Operation.class, msgs);
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
			case UML2WithIDPackage.PARAMETER__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case UML2WithIDPackage.PARAMETER__IS_ORDERED:
				return isIsOrdered();
			case UML2WithIDPackage.PARAMETER__IS_UNIQUE:
				return isIsUnique();
			case UML2WithIDPackage.PARAMETER__LOWER:
				return getLower();
			case UML2WithIDPackage.PARAMETER__UPPER:
				return getUpper();
			case UML2WithIDPackage.PARAMETER__UPPER_VALUE:
				return getUpperValue();
			case UML2WithIDPackage.PARAMETER__LOWER_VALUE:
				return getLowerValue();
			case UML2WithIDPackage.PARAMETER__OPERATION:
				return getOperation();
			case UML2WithIDPackage.PARAMETER__DEFAULT:
				return getDefault();
			case UML2WithIDPackage.PARAMETER__DIRECTION:
				return getDirection();
			case UML2WithIDPackage.PARAMETER__DEFAULT_VALUE:
				return getDefaultValue();
			case UML2WithIDPackage.PARAMETER__IS_EXCEPTION:
				return isIsException();
			case UML2WithIDPackage.PARAMETER__IS_STREAM:
				return isIsStream();
			case UML2WithIDPackage.PARAMETER__EFFECT:
				return getEffect();
			case UML2WithIDPackage.PARAMETER__PARAMETER_SET:
				return getParameterSet();
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
			case UML2WithIDPackage.PARAMETER__TYPE:
				setType((Type)newValue);
				return;
			case UML2WithIDPackage.PARAMETER__IS_ORDERED:
				setIsOrdered((Boolean)newValue);
				return;
			case UML2WithIDPackage.PARAMETER__IS_UNIQUE:
				setIsUnique((Boolean)newValue);
				return;
			case UML2WithIDPackage.PARAMETER__LOWER:
				setLower((Integer)newValue);
				return;
			case UML2WithIDPackage.PARAMETER__UPPER:
				setUpper((String)newValue);
				return;
			case UML2WithIDPackage.PARAMETER__UPPER_VALUE:
				setUpperValue((ValueSpecification)newValue);
				return;
			case UML2WithIDPackage.PARAMETER__LOWER_VALUE:
				setLowerValue((ValueSpecification)newValue);
				return;
			case UML2WithIDPackage.PARAMETER__OPERATION:
				setOperation((Operation)newValue);
				return;
			case UML2WithIDPackage.PARAMETER__DEFAULT:
				setDefault((String)newValue);
				return;
			case UML2WithIDPackage.PARAMETER__DIRECTION:
				setDirection((ParameterDirectionKind)newValue);
				return;
			case UML2WithIDPackage.PARAMETER__DEFAULT_VALUE:
				setDefaultValue((ValueSpecification)newValue);
				return;
			case UML2WithIDPackage.PARAMETER__IS_EXCEPTION:
				setIsException((Boolean)newValue);
				return;
			case UML2WithIDPackage.PARAMETER__IS_STREAM:
				setIsStream((Boolean)newValue);
				return;
			case UML2WithIDPackage.PARAMETER__EFFECT:
				setEffect((ParameterEffectKind)newValue);
				return;
			case UML2WithIDPackage.PARAMETER__PARAMETER_SET:
				getParameterSet().clear();
				getParameterSet().addAll((Collection<? extends ParameterSet>)newValue);
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
			case UML2WithIDPackage.PARAMETER__TYPE:
				setType((Type)null);
				return;
			case UML2WithIDPackage.PARAMETER__IS_ORDERED:
				setIsOrdered(IS_ORDERED_EDEFAULT);
				return;
			case UML2WithIDPackage.PARAMETER__IS_UNIQUE:
				setIsUnique(IS_UNIQUE_EDEFAULT);
				return;
			case UML2WithIDPackage.PARAMETER__LOWER:
				setLower(LOWER_EDEFAULT);
				return;
			case UML2WithIDPackage.PARAMETER__UPPER:
				setUpper(UPPER_EDEFAULT);
				return;
			case UML2WithIDPackage.PARAMETER__UPPER_VALUE:
				setUpperValue((ValueSpecification)null);
				return;
			case UML2WithIDPackage.PARAMETER__LOWER_VALUE:
				setLowerValue((ValueSpecification)null);
				return;
			case UML2WithIDPackage.PARAMETER__OPERATION:
				setOperation((Operation)null);
				return;
			case UML2WithIDPackage.PARAMETER__DEFAULT:
				setDefault(DEFAULT_EDEFAULT);
				return;
			case UML2WithIDPackage.PARAMETER__DIRECTION:
				setDirection(DIRECTION_EDEFAULT);
				return;
			case UML2WithIDPackage.PARAMETER__DEFAULT_VALUE:
				setDefaultValue((ValueSpecification)null);
				return;
			case UML2WithIDPackage.PARAMETER__IS_EXCEPTION:
				setIsException(IS_EXCEPTION_EDEFAULT);
				return;
			case UML2WithIDPackage.PARAMETER__IS_STREAM:
				setIsStream(IS_STREAM_EDEFAULT);
				return;
			case UML2WithIDPackage.PARAMETER__EFFECT:
				setEffect(EFFECT_EDEFAULT);
				return;
			case UML2WithIDPackage.PARAMETER__PARAMETER_SET:
				getParameterSet().clear();
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
			case UML2WithIDPackage.PARAMETER__TYPE:
				return type != null;
			case UML2WithIDPackage.PARAMETER__IS_ORDERED:
				return isOrdered != IS_ORDERED_EDEFAULT;
			case UML2WithIDPackage.PARAMETER__IS_UNIQUE:
				return isUnique != IS_UNIQUE_EDEFAULT;
			case UML2WithIDPackage.PARAMETER__LOWER:
				return lower != LOWER_EDEFAULT;
			case UML2WithIDPackage.PARAMETER__UPPER:
				return UPPER_EDEFAULT == null ? upper != null : !UPPER_EDEFAULT.equals(upper);
			case UML2WithIDPackage.PARAMETER__UPPER_VALUE:
				return upperValue != null;
			case UML2WithIDPackage.PARAMETER__LOWER_VALUE:
				return lowerValue != null;
			case UML2WithIDPackage.PARAMETER__OPERATION:
				return getOperation() != null;
			case UML2WithIDPackage.PARAMETER__DEFAULT:
				return DEFAULT_EDEFAULT == null ? default_ != null : !DEFAULT_EDEFAULT.equals(default_);
			case UML2WithIDPackage.PARAMETER__DIRECTION:
				return direction != DIRECTION_EDEFAULT;
			case UML2WithIDPackage.PARAMETER__DEFAULT_VALUE:
				return defaultValue != null;
			case UML2WithIDPackage.PARAMETER__IS_EXCEPTION:
				return isException != IS_EXCEPTION_EDEFAULT;
			case UML2WithIDPackage.PARAMETER__IS_STREAM:
				return isStream != IS_STREAM_EDEFAULT;
			case UML2WithIDPackage.PARAMETER__EFFECT:
				return effect != EFFECT_EDEFAULT;
			case UML2WithIDPackage.PARAMETER__PARAMETER_SET:
				return parameterSet != null && !parameterSet.isEmpty();
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
				case UML2WithIDPackage.PARAMETER__TYPE: return UML2WithIDPackage.TYPED_ELEMENT__TYPE;
				default: return -1;
			}
		}
		if (baseClass == MultiplicityElement.class) {
			switch (derivedFeatureID) {
				case UML2WithIDPackage.PARAMETER__IS_ORDERED: return UML2WithIDPackage.MULTIPLICITY_ELEMENT__IS_ORDERED;
				case UML2WithIDPackage.PARAMETER__IS_UNIQUE: return UML2WithIDPackage.MULTIPLICITY_ELEMENT__IS_UNIQUE;
				case UML2WithIDPackage.PARAMETER__LOWER: return UML2WithIDPackage.MULTIPLICITY_ELEMENT__LOWER;
				case UML2WithIDPackage.PARAMETER__UPPER: return UML2WithIDPackage.MULTIPLICITY_ELEMENT__UPPER;
				case UML2WithIDPackage.PARAMETER__UPPER_VALUE: return UML2WithIDPackage.MULTIPLICITY_ELEMENT__UPPER_VALUE;
				case UML2WithIDPackage.PARAMETER__LOWER_VALUE: return UML2WithIDPackage.MULTIPLICITY_ELEMENT__LOWER_VALUE;
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
				case UML2WithIDPackage.TYPED_ELEMENT__TYPE: return UML2WithIDPackage.PARAMETER__TYPE;
				default: return -1;
			}
		}
		if (baseClass == MultiplicityElement.class) {
			switch (baseFeatureID) {
				case UML2WithIDPackage.MULTIPLICITY_ELEMENT__IS_ORDERED: return UML2WithIDPackage.PARAMETER__IS_ORDERED;
				case UML2WithIDPackage.MULTIPLICITY_ELEMENT__IS_UNIQUE: return UML2WithIDPackage.PARAMETER__IS_UNIQUE;
				case UML2WithIDPackage.MULTIPLICITY_ELEMENT__LOWER: return UML2WithIDPackage.PARAMETER__LOWER;
				case UML2WithIDPackage.MULTIPLICITY_ELEMENT__UPPER: return UML2WithIDPackage.PARAMETER__UPPER;
				case UML2WithIDPackage.MULTIPLICITY_ELEMENT__UPPER_VALUE: return UML2WithIDPackage.PARAMETER__UPPER_VALUE;
				case UML2WithIDPackage.MULTIPLICITY_ELEMENT__LOWER_VALUE: return UML2WithIDPackage.PARAMETER__LOWER_VALUE;
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
		result.append(", default: ");
		result.append(default_);
		result.append(", direction: ");
		result.append(direction);
		result.append(", isException: ");
		result.append(isException);
		result.append(", isStream: ");
		result.append(isStream);
		result.append(", effect: ");
		result.append(effect);
		result.append(')');
		return result.toString();
	}

} //ParameterImpl

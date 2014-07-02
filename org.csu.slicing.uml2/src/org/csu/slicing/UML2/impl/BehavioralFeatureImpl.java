/**
 */
package org.csu.slicing.UML2.impl;

import java.util.Collection;

import org.csu.slicing.UML2.Behavior;
import org.csu.slicing.UML2.BehavioralFeature;
import org.csu.slicing.UML2.CallConcurrencyKind;
import org.csu.slicing.UML2.Classifier;
import org.csu.slicing.UML2.Feature;
import org.csu.slicing.UML2.Parameter;
import org.csu.slicing.UML2.RedefinableElement;
import org.csu.slicing.UML2.Type;
import org.csu.slicing.UML2.UML2Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Behavioral Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2.impl.BehavioralFeatureImpl#getRedefinitionContext <em>Redefinition Context</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.BehavioralFeatureImpl#isIsLeaf <em>Is Leaf</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.BehavioralFeatureImpl#getFeaturingClassifier <em>Featuring Classifier</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.BehavioralFeatureImpl#isIsStatic <em>Is Static</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.BehavioralFeatureImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.BehavioralFeatureImpl#getFormalParameter <em>Formal Parameter</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.BehavioralFeatureImpl#getReturnResult <em>Return Result</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.BehavioralFeatureImpl#getRaisedException <em>Raised Exception</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.BehavioralFeatureImpl#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.BehavioralFeatureImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.BehavioralFeatureImpl#getConcurrency <em>Concurrency</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class BehavioralFeatureImpl extends NamespaceImpl implements BehavioralFeature {
	/**
	 * The cached value of the '{@link #getRedefinitionContext() <em>Redefinition Context</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinitionContext()
	 * @generated
	 * @ordered
	 */
	protected EList<Classifier> redefinitionContext;

	/**
	 * The default value of the '{@link #isIsLeaf() <em>Is Leaf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsLeaf()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_LEAF_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsLeaf() <em>Is Leaf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsLeaf()
	 * @generated
	 * @ordered
	 */
	protected boolean isLeaf = IS_LEAF_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFeaturingClassifier() <em>Featuring Classifier</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeaturingClassifier()
	 * @generated
	 * @ordered
	 */
	protected EList<Classifier> featuringClassifier;

	/**
	 * The default value of the '{@link #isIsStatic() <em>Is Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsStatic()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_STATIC_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsStatic() <em>Is Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsStatic()
	 * @generated
	 * @ordered
	 */
	protected boolean isStatic = IS_STATIC_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParameter() <em>Parameter</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> parameter;

	/**
	 * The cached value of the '{@link #getFormalParameter() <em>Formal Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormalParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> formalParameter;

	/**
	 * The cached value of the '{@link #getReturnResult() <em>Return Result</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnResult()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> returnResult;

	/**
	 * The cached value of the '{@link #getRaisedException() <em>Raised Exception</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRaisedException()
	 * @generated
	 * @ordered
	 */
	protected EList<Type> raisedException;

	/**
	 * The default value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ABSTRACT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected boolean isAbstract = IS_ABSTRACT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMethod() <em>Method</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected EList<Behavior> method;

	/**
	 * The default value of the '{@link #getConcurrency() <em>Concurrency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcurrency()
	 * @generated
	 * @ordered
	 */
	protected static final CallConcurrencyKind CONCURRENCY_EDEFAULT = CallConcurrencyKind.GUARDED;

	/**
	 * The cached value of the '{@link #getConcurrency() <em>Concurrency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcurrency()
	 * @generated
	 * @ordered
	 */
	protected CallConcurrencyKind concurrency = CONCURRENCY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BehavioralFeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UML2Package.eINSTANCE.getBehavioralFeature();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Classifier> getRedefinitionContext() {
		if (redefinitionContext == null) {
			redefinitionContext = new EObjectResolvingEList<Classifier>(Classifier.class, this, UML2Package.BEHAVIORAL_FEATURE__REDEFINITION_CONTEXT);
		}
		return redefinitionContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsLeaf() {
		return isLeaf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsLeaf(boolean newIsLeaf) {
		boolean oldIsLeaf = isLeaf;
		isLeaf = newIsLeaf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.BEHAVIORAL_FEATURE__IS_LEAF, oldIsLeaf, isLeaf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Classifier> getFeaturingClassifier() {
		if (featuringClassifier == null) {
			featuringClassifier = new EObjectWithInverseResolvingEList.ManyInverse<Classifier>(Classifier.class, this, UML2Package.BEHAVIORAL_FEATURE__FEATURING_CLASSIFIER, UML2Package.CLASSIFIER__FEATURE);
		}
		return featuringClassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsStatic() {
		return isStatic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsStatic(boolean newIsStatic) {
		boolean oldIsStatic = isStatic;
		isStatic = newIsStatic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.BEHAVIORAL_FEATURE__IS_STATIC, oldIsStatic, isStatic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getParameter() {
		if (parameter == null) {
			parameter = new EObjectResolvingEList<Parameter>(Parameter.class, this, UML2Package.BEHAVIORAL_FEATURE__PARAMETER);
		}
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getFormalParameter() {
		if (formalParameter == null) {
			formalParameter = new EObjectContainmentEList<Parameter>(Parameter.class, this, UML2Package.BEHAVIORAL_FEATURE__FORMAL_PARAMETER);
		}
		return formalParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getReturnResult() {
		if (returnResult == null) {
			returnResult = new EObjectContainmentEList<Parameter>(Parameter.class, this, UML2Package.BEHAVIORAL_FEATURE__RETURN_RESULT);
		}
		return returnResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Type> getRaisedException() {
		if (raisedException == null) {
			raisedException = new EObjectResolvingEList<Type>(Type.class, this, UML2Package.BEHAVIORAL_FEATURE__RAISED_EXCEPTION);
		}
		return raisedException;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsAbstract() {
		return isAbstract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAbstract(boolean newIsAbstract) {
		boolean oldIsAbstract = isAbstract;
		isAbstract = newIsAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.BEHAVIORAL_FEATURE__IS_ABSTRACT, oldIsAbstract, isAbstract));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Behavior> getMethod() {
		if (method == null) {
			method = new EObjectWithInverseResolvingEList<Behavior>(Behavior.class, this, UML2Package.BEHAVIORAL_FEATURE__METHOD, UML2Package.BEHAVIOR__SPECIFICATION);
		}
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallConcurrencyKind getConcurrency() {
		return concurrency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcurrency(CallConcurrencyKind newConcurrency) {
		CallConcurrencyKind oldConcurrency = concurrency;
		concurrency = newConcurrency == null ? CONCURRENCY_EDEFAULT : newConcurrency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.BEHAVIORAL_FEATURE__CONCURRENCY, oldConcurrency, concurrency));
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
			case UML2Package.BEHAVIORAL_FEATURE__FEATURING_CLASSIFIER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFeaturingClassifier()).basicAdd(otherEnd, msgs);
			case UML2Package.BEHAVIORAL_FEATURE__METHOD:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMethod()).basicAdd(otherEnd, msgs);
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
			case UML2Package.BEHAVIORAL_FEATURE__FEATURING_CLASSIFIER:
				return ((InternalEList<?>)getFeaturingClassifier()).basicRemove(otherEnd, msgs);
			case UML2Package.BEHAVIORAL_FEATURE__FORMAL_PARAMETER:
				return ((InternalEList<?>)getFormalParameter()).basicRemove(otherEnd, msgs);
			case UML2Package.BEHAVIORAL_FEATURE__RETURN_RESULT:
				return ((InternalEList<?>)getReturnResult()).basicRemove(otherEnd, msgs);
			case UML2Package.BEHAVIORAL_FEATURE__METHOD:
				return ((InternalEList<?>)getMethod()).basicRemove(otherEnd, msgs);
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
			case UML2Package.BEHAVIORAL_FEATURE__REDEFINITION_CONTEXT:
				return getRedefinitionContext();
			case UML2Package.BEHAVIORAL_FEATURE__IS_LEAF:
				return isIsLeaf();
			case UML2Package.BEHAVIORAL_FEATURE__FEATURING_CLASSIFIER:
				return getFeaturingClassifier();
			case UML2Package.BEHAVIORAL_FEATURE__IS_STATIC:
				return isIsStatic();
			case UML2Package.BEHAVIORAL_FEATURE__PARAMETER:
				return getParameter();
			case UML2Package.BEHAVIORAL_FEATURE__FORMAL_PARAMETER:
				return getFormalParameter();
			case UML2Package.BEHAVIORAL_FEATURE__RETURN_RESULT:
				return getReturnResult();
			case UML2Package.BEHAVIORAL_FEATURE__RAISED_EXCEPTION:
				return getRaisedException();
			case UML2Package.BEHAVIORAL_FEATURE__IS_ABSTRACT:
				return isIsAbstract();
			case UML2Package.BEHAVIORAL_FEATURE__METHOD:
				return getMethod();
			case UML2Package.BEHAVIORAL_FEATURE__CONCURRENCY:
				return getConcurrency();
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
			case UML2Package.BEHAVIORAL_FEATURE__REDEFINITION_CONTEXT:
				getRedefinitionContext().clear();
				getRedefinitionContext().addAll((Collection<? extends Classifier>)newValue);
				return;
			case UML2Package.BEHAVIORAL_FEATURE__IS_LEAF:
				setIsLeaf((Boolean)newValue);
				return;
			case UML2Package.BEHAVIORAL_FEATURE__FEATURING_CLASSIFIER:
				getFeaturingClassifier().clear();
				getFeaturingClassifier().addAll((Collection<? extends Classifier>)newValue);
				return;
			case UML2Package.BEHAVIORAL_FEATURE__IS_STATIC:
				setIsStatic((Boolean)newValue);
				return;
			case UML2Package.BEHAVIORAL_FEATURE__PARAMETER:
				getParameter().clear();
				getParameter().addAll((Collection<? extends Parameter>)newValue);
				return;
			case UML2Package.BEHAVIORAL_FEATURE__FORMAL_PARAMETER:
				getFormalParameter().clear();
				getFormalParameter().addAll((Collection<? extends Parameter>)newValue);
				return;
			case UML2Package.BEHAVIORAL_FEATURE__RETURN_RESULT:
				getReturnResult().clear();
				getReturnResult().addAll((Collection<? extends Parameter>)newValue);
				return;
			case UML2Package.BEHAVIORAL_FEATURE__RAISED_EXCEPTION:
				getRaisedException().clear();
				getRaisedException().addAll((Collection<? extends Type>)newValue);
				return;
			case UML2Package.BEHAVIORAL_FEATURE__IS_ABSTRACT:
				setIsAbstract((Boolean)newValue);
				return;
			case UML2Package.BEHAVIORAL_FEATURE__METHOD:
				getMethod().clear();
				getMethod().addAll((Collection<? extends Behavior>)newValue);
				return;
			case UML2Package.BEHAVIORAL_FEATURE__CONCURRENCY:
				setConcurrency((CallConcurrencyKind)newValue);
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
			case UML2Package.BEHAVIORAL_FEATURE__REDEFINITION_CONTEXT:
				getRedefinitionContext().clear();
				return;
			case UML2Package.BEHAVIORAL_FEATURE__IS_LEAF:
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UML2Package.BEHAVIORAL_FEATURE__FEATURING_CLASSIFIER:
				getFeaturingClassifier().clear();
				return;
			case UML2Package.BEHAVIORAL_FEATURE__IS_STATIC:
				setIsStatic(IS_STATIC_EDEFAULT);
				return;
			case UML2Package.BEHAVIORAL_FEATURE__PARAMETER:
				getParameter().clear();
				return;
			case UML2Package.BEHAVIORAL_FEATURE__FORMAL_PARAMETER:
				getFormalParameter().clear();
				return;
			case UML2Package.BEHAVIORAL_FEATURE__RETURN_RESULT:
				getReturnResult().clear();
				return;
			case UML2Package.BEHAVIORAL_FEATURE__RAISED_EXCEPTION:
				getRaisedException().clear();
				return;
			case UML2Package.BEHAVIORAL_FEATURE__IS_ABSTRACT:
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case UML2Package.BEHAVIORAL_FEATURE__METHOD:
				getMethod().clear();
				return;
			case UML2Package.BEHAVIORAL_FEATURE__CONCURRENCY:
				setConcurrency(CONCURRENCY_EDEFAULT);
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
			case UML2Package.BEHAVIORAL_FEATURE__REDEFINITION_CONTEXT:
				return redefinitionContext != null && !redefinitionContext.isEmpty();
			case UML2Package.BEHAVIORAL_FEATURE__IS_LEAF:
				return isLeaf != IS_LEAF_EDEFAULT;
			case UML2Package.BEHAVIORAL_FEATURE__FEATURING_CLASSIFIER:
				return featuringClassifier != null && !featuringClassifier.isEmpty();
			case UML2Package.BEHAVIORAL_FEATURE__IS_STATIC:
				return isStatic != IS_STATIC_EDEFAULT;
			case UML2Package.BEHAVIORAL_FEATURE__PARAMETER:
				return parameter != null && !parameter.isEmpty();
			case UML2Package.BEHAVIORAL_FEATURE__FORMAL_PARAMETER:
				return formalParameter != null && !formalParameter.isEmpty();
			case UML2Package.BEHAVIORAL_FEATURE__RETURN_RESULT:
				return returnResult != null && !returnResult.isEmpty();
			case UML2Package.BEHAVIORAL_FEATURE__RAISED_EXCEPTION:
				return raisedException != null && !raisedException.isEmpty();
			case UML2Package.BEHAVIORAL_FEATURE__IS_ABSTRACT:
				return isAbstract != IS_ABSTRACT_EDEFAULT;
			case UML2Package.BEHAVIORAL_FEATURE__METHOD:
				return method != null && !method.isEmpty();
			case UML2Package.BEHAVIORAL_FEATURE__CONCURRENCY:
				return concurrency != CONCURRENCY_EDEFAULT;
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
		if (baseClass == RedefinableElement.class) {
			switch (derivedFeatureID) {
				case UML2Package.BEHAVIORAL_FEATURE__REDEFINITION_CONTEXT: return UML2Package.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT;
				case UML2Package.BEHAVIORAL_FEATURE__IS_LEAF: return UML2Package.REDEFINABLE_ELEMENT__IS_LEAF;
				default: return -1;
			}
		}
		if (baseClass == Feature.class) {
			switch (derivedFeatureID) {
				case UML2Package.BEHAVIORAL_FEATURE__FEATURING_CLASSIFIER: return UML2Package.FEATURE__FEATURING_CLASSIFIER;
				case UML2Package.BEHAVIORAL_FEATURE__IS_STATIC: return UML2Package.FEATURE__IS_STATIC;
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
		if (baseClass == RedefinableElement.class) {
			switch (baseFeatureID) {
				case UML2Package.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT: return UML2Package.BEHAVIORAL_FEATURE__REDEFINITION_CONTEXT;
				case UML2Package.REDEFINABLE_ELEMENT__IS_LEAF: return UML2Package.BEHAVIORAL_FEATURE__IS_LEAF;
				default: return -1;
			}
		}
		if (baseClass == Feature.class) {
			switch (baseFeatureID) {
				case UML2Package.FEATURE__FEATURING_CLASSIFIER: return UML2Package.BEHAVIORAL_FEATURE__FEATURING_CLASSIFIER;
				case UML2Package.FEATURE__IS_STATIC: return UML2Package.BEHAVIORAL_FEATURE__IS_STATIC;
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
		result.append(" (isLeaf: ");
		result.append(isLeaf);
		result.append(", isStatic: ");
		result.append(isStatic);
		result.append(", isAbstract: ");
		result.append(isAbstract);
		result.append(", concurrency: ");
		result.append(concurrency);
		result.append(')');
		return result.toString();
	}

} //BehavioralFeatureImpl

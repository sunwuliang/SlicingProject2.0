/**
 */
package org.csu.slicing.UML2WithID.impl;

import java.util.Collection;

import org.csu.slicing.UML2WithID.PackageMerge;
import org.csu.slicing.UML2WithID.PackageableElement;
import org.csu.slicing.UML2WithID.ParameterableElement;
import org.csu.slicing.UML2WithID.ProfileApplication;
import org.csu.slicing.UML2WithID.TemplateParameter;
import org.csu.slicing.UML2WithID.Type;
import org.csu.slicing.UML2WithID.UML2WithIDPackage;
import org.csu.slicing.UML2WithID.VisibilityKind;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.PackageImpl#getTemplateParameter <em>Template Parameter</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.PackageImpl#getOwningParameter <em>Owning Parameter</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.PackageImpl#getPackageableElement_visibility <em>Packageable Element visibility</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.PackageImpl#getNestedPackage <em>Nested Package</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.PackageImpl#getNestingPackage <em>Nesting Package</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.PackageImpl#getOwnedType <em>Owned Type</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.PackageImpl#getOwnedMember <em>Owned Member</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.PackageImpl#getPackageMerge <em>Package Merge</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.PackageImpl#getAppliedProfile <em>Applied Profile</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.PackageImpl#getPackageExtension <em>Package Extension</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PackageImpl extends NamespaceImpl implements org.csu.slicing.UML2WithID.Package {
	/**
	 * The cached value of the '{@link #getTemplateParameter() <em>Template Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateParameter()
	 * @generated
	 * @ordered
	 */
	protected TemplateParameter templateParameter;

	/**
	 * The default value of the '{@link #getPackageableElement_visibility() <em>Packageable Element visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageableElement_visibility()
	 * @generated
	 * @ordered
	 */
	protected static final VisibilityKind PACKAGEABLE_ELEMENT_VISIBILITY_EDEFAULT = VisibilityKind.PACKAGE;

	/**
	 * The cached value of the '{@link #getPackageableElement_visibility() <em>Packageable Element visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageableElement_visibility()
	 * @generated
	 * @ordered
	 */
	protected VisibilityKind packageableElement_visibility = PACKAGEABLE_ELEMENT_VISIBILITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNestedPackage() <em>Nested Package</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNestedPackage()
	 * @generated
	 * @ordered
	 */
	protected EList<org.csu.slicing.UML2WithID.Package> nestedPackage;

	/**
	 * The cached value of the '{@link #getNestingPackage() <em>Nesting Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNestingPackage()
	 * @generated
	 * @ordered
	 */
	protected org.csu.slicing.UML2WithID.Package nestingPackage;

	/**
	 * The cached value of the '{@link #getOwnedType() <em>Owned Type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedType()
	 * @generated
	 * @ordered
	 */
	protected EList<Type> ownedType;

	/**
	 * The cached value of the '{@link #getOwnedMember() <em>Owned Member</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedMember()
	 * @generated
	 * @ordered
	 */
	protected EList<PackageableElement> ownedMember;

	/**
	 * The cached value of the '{@link #getPackageMerge() <em>Package Merge</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageMerge()
	 * @generated
	 * @ordered
	 */
	protected EList<PackageMerge> packageMerge;

	/**
	 * The cached value of the '{@link #getAppliedProfile() <em>Applied Profile</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppliedProfile()
	 * @generated
	 * @ordered
	 */
	protected EList<ProfileApplication> appliedProfile;

	/**
	 * The cached value of the '{@link #getPackageExtension() <em>Package Extension</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageExtension()
	 * @generated
	 * @ordered
	 */
	protected EList<PackageMerge> packageExtension;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UML2WithIDPackage.eINSTANCE.getPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateParameter getTemplateParameter() {
		if (templateParameter != null && templateParameter.eIsProxy()) {
			InternalEObject oldTemplateParameter = (InternalEObject)templateParameter;
			templateParameter = (TemplateParameter)eResolveProxy(oldTemplateParameter);
			if (templateParameter != oldTemplateParameter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2WithIDPackage.PACKAGE__TEMPLATE_PARAMETER, oldTemplateParameter, templateParameter));
			}
		}
		return templateParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateParameter basicGetTemplateParameter() {
		return templateParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTemplateParameter(TemplateParameter newTemplateParameter, NotificationChain msgs) {
		TemplateParameter oldTemplateParameter = templateParameter;
		templateParameter = newTemplateParameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UML2WithIDPackage.PACKAGE__TEMPLATE_PARAMETER, oldTemplateParameter, newTemplateParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemplateParameter(TemplateParameter newTemplateParameter) {
		if (newTemplateParameter != templateParameter) {
			NotificationChain msgs = null;
			if (templateParameter != null)
				msgs = ((InternalEObject)templateParameter).eInverseRemove(this, UML2WithIDPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
			if (newTemplateParameter != null)
				msgs = ((InternalEObject)newTemplateParameter).eInverseAdd(this, UML2WithIDPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
			msgs = basicSetTemplateParameter(newTemplateParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2WithIDPackage.PACKAGE__TEMPLATE_PARAMETER, newTemplateParameter, newTemplateParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateParameter getOwningParameter() {
		if (eContainerFeatureID() != UML2WithIDPackage.PACKAGE__OWNING_PARAMETER) return null;
		return (TemplateParameter)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningParameter(TemplateParameter newOwningParameter, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningParameter, UML2WithIDPackage.PACKAGE__OWNING_PARAMETER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningParameter(TemplateParameter newOwningParameter) {
		if (newOwningParameter != eInternalContainer() || (eContainerFeatureID() != UML2WithIDPackage.PACKAGE__OWNING_PARAMETER && newOwningParameter != null)) {
			if (EcoreUtil.isAncestor(this, newOwningParameter))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningParameter != null)
				msgs = ((InternalEObject)newOwningParameter).eInverseAdd(this, UML2WithIDPackage.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
			msgs = basicSetOwningParameter(newOwningParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2WithIDPackage.PACKAGE__OWNING_PARAMETER, newOwningParameter, newOwningParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisibilityKind getPackageableElement_visibility() {
		return packageableElement_visibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackageableElement_visibility(VisibilityKind newPackageableElement_visibility) {
		VisibilityKind oldPackageableElement_visibility = packageableElement_visibility;
		packageableElement_visibility = newPackageableElement_visibility == null ? PACKAGEABLE_ELEMENT_VISIBILITY_EDEFAULT : newPackageableElement_visibility;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2WithIDPackage.PACKAGE__PACKAGEABLE_ELEMENT_VISIBILITY, oldPackageableElement_visibility, packageableElement_visibility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.csu.slicing.UML2WithID.Package> getNestedPackage() {
		if (nestedPackage == null) {
			nestedPackage = new EObjectWithInverseResolvingEList<org.csu.slicing.UML2WithID.Package>(org.csu.slicing.UML2WithID.Package.class, this, UML2WithIDPackage.PACKAGE__NESTED_PACKAGE, UML2WithIDPackage.PACKAGE__NESTING_PACKAGE);
		}
		return nestedPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.csu.slicing.UML2WithID.Package getNestingPackage() {
		if (nestingPackage != null && nestingPackage.eIsProxy()) {
			InternalEObject oldNestingPackage = (InternalEObject)nestingPackage;
			nestingPackage = (org.csu.slicing.UML2WithID.Package)eResolveProxy(oldNestingPackage);
			if (nestingPackage != oldNestingPackage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2WithIDPackage.PACKAGE__NESTING_PACKAGE, oldNestingPackage, nestingPackage));
			}
		}
		return nestingPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.csu.slicing.UML2WithID.Package basicGetNestingPackage() {
		return nestingPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNestingPackage(org.csu.slicing.UML2WithID.Package newNestingPackage, NotificationChain msgs) {
		org.csu.slicing.UML2WithID.Package oldNestingPackage = nestingPackage;
		nestingPackage = newNestingPackage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UML2WithIDPackage.PACKAGE__NESTING_PACKAGE, oldNestingPackage, newNestingPackage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNestingPackage(org.csu.slicing.UML2WithID.Package newNestingPackage) {
		if (newNestingPackage != nestingPackage) {
			NotificationChain msgs = null;
			if (nestingPackage != null)
				msgs = ((InternalEObject)nestingPackage).eInverseRemove(this, UML2WithIDPackage.PACKAGE__NESTED_PACKAGE, org.csu.slicing.UML2WithID.Package.class, msgs);
			if (newNestingPackage != null)
				msgs = ((InternalEObject)newNestingPackage).eInverseAdd(this, UML2WithIDPackage.PACKAGE__NESTED_PACKAGE, org.csu.slicing.UML2WithID.Package.class, msgs);
			msgs = basicSetNestingPackage(newNestingPackage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2WithIDPackage.PACKAGE__NESTING_PACKAGE, newNestingPackage, newNestingPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Type> getOwnedType() {
		if (ownedType == null) {
			ownedType = new EObjectWithInverseResolvingEList<Type>(Type.class, this, UML2WithIDPackage.PACKAGE__OWNED_TYPE, UML2WithIDPackage.TYPE__PACKAGE);
		}
		return ownedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PackageableElement> getOwnedMember() {
		if (ownedMember == null) {
			ownedMember = new EObjectContainmentEList<PackageableElement>(PackageableElement.class, this, UML2WithIDPackage.PACKAGE__OWNED_MEMBER);
		}
		return ownedMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PackageMerge> getPackageMerge() {
		if (packageMerge == null) {
			packageMerge = new EObjectWithInverseResolvingEList<PackageMerge>(PackageMerge.class, this, UML2WithIDPackage.PACKAGE__PACKAGE_MERGE, UML2WithIDPackage.PACKAGE_MERGE__MERGING_PACKAGE);
		}
		return packageMerge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProfileApplication> getAppliedProfile() {
		if (appliedProfile == null) {
			appliedProfile = new EObjectResolvingEList<ProfileApplication>(ProfileApplication.class, this, UML2WithIDPackage.PACKAGE__APPLIED_PROFILE);
		}
		return appliedProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PackageMerge> getPackageExtension() {
		if (packageExtension == null) {
			packageExtension = new EObjectContainmentEList<PackageMerge>(PackageMerge.class, this, UML2WithIDPackage.PACKAGE__PACKAGE_EXTENSION);
		}
		return packageExtension;
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
			case UML2WithIDPackage.PACKAGE__TEMPLATE_PARAMETER:
				if (templateParameter != null)
					msgs = ((InternalEObject)templateParameter).eInverseRemove(this, UML2WithIDPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
				return basicSetTemplateParameter((TemplateParameter)otherEnd, msgs);
			case UML2WithIDPackage.PACKAGE__OWNING_PARAMETER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningParameter((TemplateParameter)otherEnd, msgs);
			case UML2WithIDPackage.PACKAGE__NESTED_PACKAGE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getNestedPackage()).basicAdd(otherEnd, msgs);
			case UML2WithIDPackage.PACKAGE__NESTING_PACKAGE:
				if (nestingPackage != null)
					msgs = ((InternalEObject)nestingPackage).eInverseRemove(this, UML2WithIDPackage.PACKAGE__NESTED_PACKAGE, org.csu.slicing.UML2WithID.Package.class, msgs);
				return basicSetNestingPackage((org.csu.slicing.UML2WithID.Package)otherEnd, msgs);
			case UML2WithIDPackage.PACKAGE__OWNED_TYPE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedType()).basicAdd(otherEnd, msgs);
			case UML2WithIDPackage.PACKAGE__PACKAGE_MERGE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPackageMerge()).basicAdd(otherEnd, msgs);
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
			case UML2WithIDPackage.PACKAGE__TEMPLATE_PARAMETER:
				return basicSetTemplateParameter(null, msgs);
			case UML2WithIDPackage.PACKAGE__OWNING_PARAMETER:
				return basicSetOwningParameter(null, msgs);
			case UML2WithIDPackage.PACKAGE__NESTED_PACKAGE:
				return ((InternalEList<?>)getNestedPackage()).basicRemove(otherEnd, msgs);
			case UML2WithIDPackage.PACKAGE__NESTING_PACKAGE:
				return basicSetNestingPackage(null, msgs);
			case UML2WithIDPackage.PACKAGE__OWNED_TYPE:
				return ((InternalEList<?>)getOwnedType()).basicRemove(otherEnd, msgs);
			case UML2WithIDPackage.PACKAGE__OWNED_MEMBER:
				return ((InternalEList<?>)getOwnedMember()).basicRemove(otherEnd, msgs);
			case UML2WithIDPackage.PACKAGE__PACKAGE_MERGE:
				return ((InternalEList<?>)getPackageMerge()).basicRemove(otherEnd, msgs);
			case UML2WithIDPackage.PACKAGE__PACKAGE_EXTENSION:
				return ((InternalEList<?>)getPackageExtension()).basicRemove(otherEnd, msgs);
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
			case UML2WithIDPackage.PACKAGE__OWNING_PARAMETER:
				return eInternalContainer().eInverseRemove(this, UML2WithIDPackage.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
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
			case UML2WithIDPackage.PACKAGE__TEMPLATE_PARAMETER:
				if (resolve) return getTemplateParameter();
				return basicGetTemplateParameter();
			case UML2WithIDPackage.PACKAGE__OWNING_PARAMETER:
				return getOwningParameter();
			case UML2WithIDPackage.PACKAGE__PACKAGEABLE_ELEMENT_VISIBILITY:
				return getPackageableElement_visibility();
			case UML2WithIDPackage.PACKAGE__NESTED_PACKAGE:
				return getNestedPackage();
			case UML2WithIDPackage.PACKAGE__NESTING_PACKAGE:
				if (resolve) return getNestingPackage();
				return basicGetNestingPackage();
			case UML2WithIDPackage.PACKAGE__OWNED_TYPE:
				return getOwnedType();
			case UML2WithIDPackage.PACKAGE__OWNED_MEMBER:
				return getOwnedMember();
			case UML2WithIDPackage.PACKAGE__PACKAGE_MERGE:
				return getPackageMerge();
			case UML2WithIDPackage.PACKAGE__APPLIED_PROFILE:
				return getAppliedProfile();
			case UML2WithIDPackage.PACKAGE__PACKAGE_EXTENSION:
				return getPackageExtension();
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
			case UML2WithIDPackage.PACKAGE__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)newValue);
				return;
			case UML2WithIDPackage.PACKAGE__OWNING_PARAMETER:
				setOwningParameter((TemplateParameter)newValue);
				return;
			case UML2WithIDPackage.PACKAGE__PACKAGEABLE_ELEMENT_VISIBILITY:
				setPackageableElement_visibility((VisibilityKind)newValue);
				return;
			case UML2WithIDPackage.PACKAGE__NESTED_PACKAGE:
				getNestedPackage().clear();
				getNestedPackage().addAll((Collection<? extends org.csu.slicing.UML2WithID.Package>)newValue);
				return;
			case UML2WithIDPackage.PACKAGE__NESTING_PACKAGE:
				setNestingPackage((org.csu.slicing.UML2WithID.Package)newValue);
				return;
			case UML2WithIDPackage.PACKAGE__OWNED_TYPE:
				getOwnedType().clear();
				getOwnedType().addAll((Collection<? extends Type>)newValue);
				return;
			case UML2WithIDPackage.PACKAGE__OWNED_MEMBER:
				getOwnedMember().clear();
				getOwnedMember().addAll((Collection<? extends PackageableElement>)newValue);
				return;
			case UML2WithIDPackage.PACKAGE__PACKAGE_MERGE:
				getPackageMerge().clear();
				getPackageMerge().addAll((Collection<? extends PackageMerge>)newValue);
				return;
			case UML2WithIDPackage.PACKAGE__APPLIED_PROFILE:
				getAppliedProfile().clear();
				getAppliedProfile().addAll((Collection<? extends ProfileApplication>)newValue);
				return;
			case UML2WithIDPackage.PACKAGE__PACKAGE_EXTENSION:
				getPackageExtension().clear();
				getPackageExtension().addAll((Collection<? extends PackageMerge>)newValue);
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
			case UML2WithIDPackage.PACKAGE__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)null);
				return;
			case UML2WithIDPackage.PACKAGE__OWNING_PARAMETER:
				setOwningParameter((TemplateParameter)null);
				return;
			case UML2WithIDPackage.PACKAGE__PACKAGEABLE_ELEMENT_VISIBILITY:
				setPackageableElement_visibility(PACKAGEABLE_ELEMENT_VISIBILITY_EDEFAULT);
				return;
			case UML2WithIDPackage.PACKAGE__NESTED_PACKAGE:
				getNestedPackage().clear();
				return;
			case UML2WithIDPackage.PACKAGE__NESTING_PACKAGE:
				setNestingPackage((org.csu.slicing.UML2WithID.Package)null);
				return;
			case UML2WithIDPackage.PACKAGE__OWNED_TYPE:
				getOwnedType().clear();
				return;
			case UML2WithIDPackage.PACKAGE__OWNED_MEMBER:
				getOwnedMember().clear();
				return;
			case UML2WithIDPackage.PACKAGE__PACKAGE_MERGE:
				getPackageMerge().clear();
				return;
			case UML2WithIDPackage.PACKAGE__APPLIED_PROFILE:
				getAppliedProfile().clear();
				return;
			case UML2WithIDPackage.PACKAGE__PACKAGE_EXTENSION:
				getPackageExtension().clear();
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
			case UML2WithIDPackage.PACKAGE__TEMPLATE_PARAMETER:
				return templateParameter != null;
			case UML2WithIDPackage.PACKAGE__OWNING_PARAMETER:
				return getOwningParameter() != null;
			case UML2WithIDPackage.PACKAGE__PACKAGEABLE_ELEMENT_VISIBILITY:
				return packageableElement_visibility != PACKAGEABLE_ELEMENT_VISIBILITY_EDEFAULT;
			case UML2WithIDPackage.PACKAGE__NESTED_PACKAGE:
				return nestedPackage != null && !nestedPackage.isEmpty();
			case UML2WithIDPackage.PACKAGE__NESTING_PACKAGE:
				return nestingPackage != null;
			case UML2WithIDPackage.PACKAGE__OWNED_TYPE:
				return ownedType != null && !ownedType.isEmpty();
			case UML2WithIDPackage.PACKAGE__OWNED_MEMBER:
				return ownedMember != null && !ownedMember.isEmpty();
			case UML2WithIDPackage.PACKAGE__PACKAGE_MERGE:
				return packageMerge != null && !packageMerge.isEmpty();
			case UML2WithIDPackage.PACKAGE__APPLIED_PROFILE:
				return appliedProfile != null && !appliedProfile.isEmpty();
			case UML2WithIDPackage.PACKAGE__PACKAGE_EXTENSION:
				return packageExtension != null && !packageExtension.isEmpty();
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
		if (baseClass == ParameterableElement.class) {
			switch (derivedFeatureID) {
				case UML2WithIDPackage.PACKAGE__TEMPLATE_PARAMETER: return UML2WithIDPackage.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER;
				case UML2WithIDPackage.PACKAGE__OWNING_PARAMETER: return UML2WithIDPackage.PARAMETERABLE_ELEMENT__OWNING_PARAMETER;
				default: return -1;
			}
		}
		if (baseClass == PackageableElement.class) {
			switch (derivedFeatureID) {
				case UML2WithIDPackage.PACKAGE__PACKAGEABLE_ELEMENT_VISIBILITY: return UML2WithIDPackage.PACKAGEABLE_ELEMENT__PACKAGEABLE_ELEMENT_VISIBILITY;
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
		if (baseClass == ParameterableElement.class) {
			switch (baseFeatureID) {
				case UML2WithIDPackage.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER: return UML2WithIDPackage.PACKAGE__TEMPLATE_PARAMETER;
				case UML2WithIDPackage.PARAMETERABLE_ELEMENT__OWNING_PARAMETER: return UML2WithIDPackage.PACKAGE__OWNING_PARAMETER;
				default: return -1;
			}
		}
		if (baseClass == PackageableElement.class) {
			switch (baseFeatureID) {
				case UML2WithIDPackage.PACKAGEABLE_ELEMENT__PACKAGEABLE_ELEMENT_VISIBILITY: return UML2WithIDPackage.PACKAGE__PACKAGEABLE_ELEMENT_VISIBILITY;
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
		result.append(" (packageableElement_visibility: ");
		result.append(packageableElement_visibility);
		result.append(')');
		return result.toString();
	}

} //PackageImpl

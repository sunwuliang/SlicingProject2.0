/**
 */
package org.csu.slicing.UML2WithID.impl;

import java.util.Collection;

import org.csu.slicing.UML2WithID.Classifier;
import org.csu.slicing.UML2WithID.CollaborationOccurrence;
import org.csu.slicing.UML2WithID.Feature;
import org.csu.slicing.UML2WithID.Generalization;
import org.csu.slicing.UML2WithID.GeneralizationSet;
import org.csu.slicing.UML2WithID.NamedElement;
import org.csu.slicing.UML2WithID.PackageableElement;
import org.csu.slicing.UML2WithID.ParameterableElement;
import org.csu.slicing.UML2WithID.Property;
import org.csu.slicing.UML2WithID.RedefinableElement;
import org.csu.slicing.UML2WithID.Substitution;
import org.csu.slicing.UML2WithID.TemplateParameter;
import org.csu.slicing.UML2WithID.Type;
import org.csu.slicing.UML2WithID.UML2WithIDPackage;
import org.csu.slicing.UML2WithID.UseCase;
import org.csu.slicing.UML2WithID.VisibilityKind;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Classifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.ClassifierImpl#getTemplateParameter <em>Template Parameter</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.ClassifierImpl#getOwningParameter <em>Owning Parameter</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.ClassifierImpl#getPackageableElement_visibility <em>Packageable Element visibility</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.ClassifierImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.ClassifierImpl#getRedefinitionContext <em>Redefinition Context</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.ClassifierImpl#isIsLeaf <em>Is Leaf</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.ClassifierImpl#getFeature <em>Feature</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.ClassifierImpl#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.ClassifierImpl#getInheritedMember <em>Inherited Member</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.ClassifierImpl#getGeneral <em>General</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.ClassifierImpl#getGeneralization <em>Generalization</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.ClassifierImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.ClassifierImpl#getRedefinedClassifier <em>Redefined Classifier</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.ClassifierImpl#getSubstitution <em>Substitution</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.ClassifierImpl#getPowertypeExtent <em>Powertype Extent</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.ClassifierImpl#getOwnedUseCase <em>Owned Use Case</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.ClassifierImpl#getUseCase <em>Use Case</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.ClassifierImpl#getRepresentation <em>Representation</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.ClassifierImpl#getOccurrence <em>Occurrence</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ClassifierImpl extends NamespaceImpl implements Classifier {
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
	 * The cached value of the '{@link #getPackage() <em>Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackage()
	 * @generated
	 * @ordered
	 */
	protected org.csu.slicing.UML2WithID.Package package_;

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
	 * The cached value of the '{@link #getFeature() <em>Feature</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeature()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> feature;

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
	 * The cached value of the '{@link #getInheritedMember() <em>Inherited Member</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInheritedMember()
	 * @generated
	 * @ordered
	 */
	protected EList<NamedElement> inheritedMember;

	/**
	 * The cached value of the '{@link #getGeneral() <em>General</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneral()
	 * @generated
	 * @ordered
	 */
	protected EList<Classifier> general;

	/**
	 * The cached value of the '{@link #getGeneralization() <em>Generalization</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralization()
	 * @generated
	 * @ordered
	 */
	protected EList<Generalization> generalization;

	/**
	 * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> attribute;

	/**
	 * The cached value of the '{@link #getRedefinedClassifier() <em>Redefined Classifier</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinedClassifier()
	 * @generated
	 * @ordered
	 */
	protected EList<Classifier> redefinedClassifier;

	/**
	 * The cached value of the '{@link #getSubstitution() <em>Substitution</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstitution()
	 * @generated
	 * @ordered
	 */
	protected EList<Substitution> substitution;

	/**
	 * The cached value of the '{@link #getPowertypeExtent() <em>Powertype Extent</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowertypeExtent()
	 * @generated
	 * @ordered
	 */
	protected EList<GeneralizationSet> powertypeExtent;

	/**
	 * The cached value of the '{@link #getOwnedUseCase() <em>Owned Use Case</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedUseCase()
	 * @generated
	 * @ordered
	 */
	protected EList<UseCase> ownedUseCase;

	/**
	 * The cached value of the '{@link #getUseCase() <em>Use Case</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseCase()
	 * @generated
	 * @ordered
	 */
	protected EList<UseCase> useCase;

	/**
	 * The cached value of the '{@link #getRepresentation() <em>Representation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresentation()
	 * @generated
	 * @ordered
	 */
	protected CollaborationOccurrence representation;

	/**
	 * The cached value of the '{@link #getOccurrence() <em>Occurrence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccurrence()
	 * @generated
	 * @ordered
	 */
	protected EList<CollaborationOccurrence> occurrence;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UML2WithIDPackage.eINSTANCE.getClassifier();
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2WithIDPackage.CLASSIFIER__TEMPLATE_PARAMETER, oldTemplateParameter, templateParameter));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UML2WithIDPackage.CLASSIFIER__TEMPLATE_PARAMETER, oldTemplateParameter, newTemplateParameter);
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
			eNotify(new ENotificationImpl(this, Notification.SET, UML2WithIDPackage.CLASSIFIER__TEMPLATE_PARAMETER, newTemplateParameter, newTemplateParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateParameter getOwningParameter() {
		if (eContainerFeatureID() != UML2WithIDPackage.CLASSIFIER__OWNING_PARAMETER) return null;
		return (TemplateParameter)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningParameter(TemplateParameter newOwningParameter, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningParameter, UML2WithIDPackage.CLASSIFIER__OWNING_PARAMETER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningParameter(TemplateParameter newOwningParameter) {
		if (newOwningParameter != eInternalContainer() || (eContainerFeatureID() != UML2WithIDPackage.CLASSIFIER__OWNING_PARAMETER && newOwningParameter != null)) {
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
			eNotify(new ENotificationImpl(this, Notification.SET, UML2WithIDPackage.CLASSIFIER__OWNING_PARAMETER, newOwningParameter, newOwningParameter));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UML2WithIDPackage.CLASSIFIER__PACKAGEABLE_ELEMENT_VISIBILITY, oldPackageableElement_visibility, packageableElement_visibility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.csu.slicing.UML2WithID.Package getPackage() {
		if (package_ != null && package_.eIsProxy()) {
			InternalEObject oldPackage = (InternalEObject)package_;
			package_ = (org.csu.slicing.UML2WithID.Package)eResolveProxy(oldPackage);
			if (package_ != oldPackage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2WithIDPackage.CLASSIFIER__PACKAGE, oldPackage, package_));
			}
		}
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.csu.slicing.UML2WithID.Package basicGetPackage() {
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPackage(org.csu.slicing.UML2WithID.Package newPackage, NotificationChain msgs) {
		org.csu.slicing.UML2WithID.Package oldPackage = package_;
		package_ = newPackage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UML2WithIDPackage.CLASSIFIER__PACKAGE, oldPackage, newPackage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackage(org.csu.slicing.UML2WithID.Package newPackage) {
		if (newPackage != package_) {
			NotificationChain msgs = null;
			if (package_ != null)
				msgs = ((InternalEObject)package_).eInverseRemove(this, UML2WithIDPackage.PACKAGE__OWNED_TYPE, org.csu.slicing.UML2WithID.Package.class, msgs);
			if (newPackage != null)
				msgs = ((InternalEObject)newPackage).eInverseAdd(this, UML2WithIDPackage.PACKAGE__OWNED_TYPE, org.csu.slicing.UML2WithID.Package.class, msgs);
			msgs = basicSetPackage(newPackage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2WithIDPackage.CLASSIFIER__PACKAGE, newPackage, newPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Classifier> getRedefinitionContext() {
		if (redefinitionContext == null) {
			redefinitionContext = new EObjectResolvingEList<Classifier>(Classifier.class, this, UML2WithIDPackage.CLASSIFIER__REDEFINITION_CONTEXT);
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
			eNotify(new ENotificationImpl(this, Notification.SET, UML2WithIDPackage.CLASSIFIER__IS_LEAF, oldIsLeaf, isLeaf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feature> getFeature() {
		if (feature == null) {
			feature = new EObjectWithInverseResolvingEList.ManyInverse<Feature>(Feature.class, this, UML2WithIDPackage.CLASSIFIER__FEATURE, UML2WithIDPackage.FEATURE__FEATURING_CLASSIFIER);
		}
		return feature;
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
			eNotify(new ENotificationImpl(this, Notification.SET, UML2WithIDPackage.CLASSIFIER__IS_ABSTRACT, oldIsAbstract, isAbstract));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NamedElement> getInheritedMember() {
		if (inheritedMember == null) {
			inheritedMember = new EObjectResolvingEList<NamedElement>(NamedElement.class, this, UML2WithIDPackage.CLASSIFIER__INHERITED_MEMBER);
		}
		return inheritedMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Classifier> getGeneral() {
		if (general == null) {
			general = new EObjectResolvingEList<Classifier>(Classifier.class, this, UML2WithIDPackage.CLASSIFIER__GENERAL);
		}
		return general;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Generalization> getGeneralization() {
		if (generalization == null) {
			generalization = new EObjectContainmentWithInverseEList<Generalization>(Generalization.class, this, UML2WithIDPackage.CLASSIFIER__GENERALIZATION, UML2WithIDPackage.GENERALIZATION__SPECIFIC);
		}
		return generalization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getAttribute() {
		if (attribute == null) {
			attribute = new EObjectResolvingEList<Property>(Property.class, this, UML2WithIDPackage.CLASSIFIER__ATTRIBUTE);
		}
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Classifier> getRedefinedClassifier() {
		if (redefinedClassifier == null) {
			redefinedClassifier = new EObjectResolvingEList<Classifier>(Classifier.class, this, UML2WithIDPackage.CLASSIFIER__REDEFINED_CLASSIFIER);
		}
		return redefinedClassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Substitution> getSubstitution() {
		if (substitution == null) {
			substitution = new EObjectContainmentWithInverseEList<Substitution>(Substitution.class, this, UML2WithIDPackage.CLASSIFIER__SUBSTITUTION, UML2WithIDPackage.SUBSTITUTION__SUBSTITUTING_CLASSIFIER);
		}
		return substitution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GeneralizationSet> getPowertypeExtent() {
		if (powertypeExtent == null) {
			powertypeExtent = new EObjectWithInverseResolvingEList<GeneralizationSet>(GeneralizationSet.class, this, UML2WithIDPackage.CLASSIFIER__POWERTYPE_EXTENT, UML2WithIDPackage.GENERALIZATION_SET__POWERTYPE);
		}
		return powertypeExtent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UseCase> getOwnedUseCase() {
		if (ownedUseCase == null) {
			ownedUseCase = new EObjectContainmentEList<UseCase>(UseCase.class, this, UML2WithIDPackage.CLASSIFIER__OWNED_USE_CASE);
		}
		return ownedUseCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UseCase> getUseCase() {
		if (useCase == null) {
			useCase = new EObjectWithInverseResolvingEList.ManyInverse<UseCase>(UseCase.class, this, UML2WithIDPackage.CLASSIFIER__USE_CASE, UML2WithIDPackage.USE_CASE__SUBJECT);
		}
		return useCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollaborationOccurrence getRepresentation() {
		if (representation != null && representation.eIsProxy()) {
			InternalEObject oldRepresentation = (InternalEObject)representation;
			representation = (CollaborationOccurrence)eResolveProxy(oldRepresentation);
			if (representation != oldRepresentation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2WithIDPackage.CLASSIFIER__REPRESENTATION, oldRepresentation, representation));
			}
		}
		return representation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollaborationOccurrence basicGetRepresentation() {
		return representation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepresentation(CollaborationOccurrence newRepresentation) {
		CollaborationOccurrence oldRepresentation = representation;
		representation = newRepresentation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2WithIDPackage.CLASSIFIER__REPRESENTATION, oldRepresentation, representation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CollaborationOccurrence> getOccurrence() {
		if (occurrence == null) {
			occurrence = new EObjectContainmentEList<CollaborationOccurrence>(CollaborationOccurrence.class, this, UML2WithIDPackage.CLASSIFIER__OCCURRENCE);
		}
		return occurrence;
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
			case UML2WithIDPackage.CLASSIFIER__TEMPLATE_PARAMETER:
				if (templateParameter != null)
					msgs = ((InternalEObject)templateParameter).eInverseRemove(this, UML2WithIDPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
				return basicSetTemplateParameter((TemplateParameter)otherEnd, msgs);
			case UML2WithIDPackage.CLASSIFIER__OWNING_PARAMETER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningParameter((TemplateParameter)otherEnd, msgs);
			case UML2WithIDPackage.CLASSIFIER__PACKAGE:
				if (package_ != null)
					msgs = ((InternalEObject)package_).eInverseRemove(this, UML2WithIDPackage.PACKAGE__OWNED_TYPE, org.csu.slicing.UML2WithID.Package.class, msgs);
				return basicSetPackage((org.csu.slicing.UML2WithID.Package)otherEnd, msgs);
			case UML2WithIDPackage.CLASSIFIER__FEATURE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFeature()).basicAdd(otherEnd, msgs);
			case UML2WithIDPackage.CLASSIFIER__GENERALIZATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGeneralization()).basicAdd(otherEnd, msgs);
			case UML2WithIDPackage.CLASSIFIER__SUBSTITUTION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubstitution()).basicAdd(otherEnd, msgs);
			case UML2WithIDPackage.CLASSIFIER__POWERTYPE_EXTENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPowertypeExtent()).basicAdd(otherEnd, msgs);
			case UML2WithIDPackage.CLASSIFIER__USE_CASE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUseCase()).basicAdd(otherEnd, msgs);
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
			case UML2WithIDPackage.CLASSIFIER__TEMPLATE_PARAMETER:
				return basicSetTemplateParameter(null, msgs);
			case UML2WithIDPackage.CLASSIFIER__OWNING_PARAMETER:
				return basicSetOwningParameter(null, msgs);
			case UML2WithIDPackage.CLASSIFIER__PACKAGE:
				return basicSetPackage(null, msgs);
			case UML2WithIDPackage.CLASSIFIER__FEATURE:
				return ((InternalEList<?>)getFeature()).basicRemove(otherEnd, msgs);
			case UML2WithIDPackage.CLASSIFIER__GENERALIZATION:
				return ((InternalEList<?>)getGeneralization()).basicRemove(otherEnd, msgs);
			case UML2WithIDPackage.CLASSIFIER__SUBSTITUTION:
				return ((InternalEList<?>)getSubstitution()).basicRemove(otherEnd, msgs);
			case UML2WithIDPackage.CLASSIFIER__POWERTYPE_EXTENT:
				return ((InternalEList<?>)getPowertypeExtent()).basicRemove(otherEnd, msgs);
			case UML2WithIDPackage.CLASSIFIER__OWNED_USE_CASE:
				return ((InternalEList<?>)getOwnedUseCase()).basicRemove(otherEnd, msgs);
			case UML2WithIDPackage.CLASSIFIER__USE_CASE:
				return ((InternalEList<?>)getUseCase()).basicRemove(otherEnd, msgs);
			case UML2WithIDPackage.CLASSIFIER__OCCURRENCE:
				return ((InternalEList<?>)getOccurrence()).basicRemove(otherEnd, msgs);
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
			case UML2WithIDPackage.CLASSIFIER__OWNING_PARAMETER:
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
			case UML2WithIDPackage.CLASSIFIER__TEMPLATE_PARAMETER:
				if (resolve) return getTemplateParameter();
				return basicGetTemplateParameter();
			case UML2WithIDPackage.CLASSIFIER__OWNING_PARAMETER:
				return getOwningParameter();
			case UML2WithIDPackage.CLASSIFIER__PACKAGEABLE_ELEMENT_VISIBILITY:
				return getPackageableElement_visibility();
			case UML2WithIDPackage.CLASSIFIER__PACKAGE:
				if (resolve) return getPackage();
				return basicGetPackage();
			case UML2WithIDPackage.CLASSIFIER__REDEFINITION_CONTEXT:
				return getRedefinitionContext();
			case UML2WithIDPackage.CLASSIFIER__IS_LEAF:
				return isIsLeaf();
			case UML2WithIDPackage.CLASSIFIER__FEATURE:
				return getFeature();
			case UML2WithIDPackage.CLASSIFIER__IS_ABSTRACT:
				return isIsAbstract();
			case UML2WithIDPackage.CLASSIFIER__INHERITED_MEMBER:
				return getInheritedMember();
			case UML2WithIDPackage.CLASSIFIER__GENERAL:
				return getGeneral();
			case UML2WithIDPackage.CLASSIFIER__GENERALIZATION:
				return getGeneralization();
			case UML2WithIDPackage.CLASSIFIER__ATTRIBUTE:
				return getAttribute();
			case UML2WithIDPackage.CLASSIFIER__REDEFINED_CLASSIFIER:
				return getRedefinedClassifier();
			case UML2WithIDPackage.CLASSIFIER__SUBSTITUTION:
				return getSubstitution();
			case UML2WithIDPackage.CLASSIFIER__POWERTYPE_EXTENT:
				return getPowertypeExtent();
			case UML2WithIDPackage.CLASSIFIER__OWNED_USE_CASE:
				return getOwnedUseCase();
			case UML2WithIDPackage.CLASSIFIER__USE_CASE:
				return getUseCase();
			case UML2WithIDPackage.CLASSIFIER__REPRESENTATION:
				if (resolve) return getRepresentation();
				return basicGetRepresentation();
			case UML2WithIDPackage.CLASSIFIER__OCCURRENCE:
				return getOccurrence();
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
			case UML2WithIDPackage.CLASSIFIER__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)newValue);
				return;
			case UML2WithIDPackage.CLASSIFIER__OWNING_PARAMETER:
				setOwningParameter((TemplateParameter)newValue);
				return;
			case UML2WithIDPackage.CLASSIFIER__PACKAGEABLE_ELEMENT_VISIBILITY:
				setPackageableElement_visibility((VisibilityKind)newValue);
				return;
			case UML2WithIDPackage.CLASSIFIER__PACKAGE:
				setPackage((org.csu.slicing.UML2WithID.Package)newValue);
				return;
			case UML2WithIDPackage.CLASSIFIER__REDEFINITION_CONTEXT:
				getRedefinitionContext().clear();
				getRedefinitionContext().addAll((Collection<? extends Classifier>)newValue);
				return;
			case UML2WithIDPackage.CLASSIFIER__IS_LEAF:
				setIsLeaf((Boolean)newValue);
				return;
			case UML2WithIDPackage.CLASSIFIER__FEATURE:
				getFeature().clear();
				getFeature().addAll((Collection<? extends Feature>)newValue);
				return;
			case UML2WithIDPackage.CLASSIFIER__IS_ABSTRACT:
				setIsAbstract((Boolean)newValue);
				return;
			case UML2WithIDPackage.CLASSIFIER__INHERITED_MEMBER:
				getInheritedMember().clear();
				getInheritedMember().addAll((Collection<? extends NamedElement>)newValue);
				return;
			case UML2WithIDPackage.CLASSIFIER__GENERAL:
				getGeneral().clear();
				getGeneral().addAll((Collection<? extends Classifier>)newValue);
				return;
			case UML2WithIDPackage.CLASSIFIER__GENERALIZATION:
				getGeneralization().clear();
				getGeneralization().addAll((Collection<? extends Generalization>)newValue);
				return;
			case UML2WithIDPackage.CLASSIFIER__ATTRIBUTE:
				getAttribute().clear();
				getAttribute().addAll((Collection<? extends Property>)newValue);
				return;
			case UML2WithIDPackage.CLASSIFIER__REDEFINED_CLASSIFIER:
				getRedefinedClassifier().clear();
				getRedefinedClassifier().addAll((Collection<? extends Classifier>)newValue);
				return;
			case UML2WithIDPackage.CLASSIFIER__SUBSTITUTION:
				getSubstitution().clear();
				getSubstitution().addAll((Collection<? extends Substitution>)newValue);
				return;
			case UML2WithIDPackage.CLASSIFIER__POWERTYPE_EXTENT:
				getPowertypeExtent().clear();
				getPowertypeExtent().addAll((Collection<? extends GeneralizationSet>)newValue);
				return;
			case UML2WithIDPackage.CLASSIFIER__OWNED_USE_CASE:
				getOwnedUseCase().clear();
				getOwnedUseCase().addAll((Collection<? extends UseCase>)newValue);
				return;
			case UML2WithIDPackage.CLASSIFIER__USE_CASE:
				getUseCase().clear();
				getUseCase().addAll((Collection<? extends UseCase>)newValue);
				return;
			case UML2WithIDPackage.CLASSIFIER__REPRESENTATION:
				setRepresentation((CollaborationOccurrence)newValue);
				return;
			case UML2WithIDPackage.CLASSIFIER__OCCURRENCE:
				getOccurrence().clear();
				getOccurrence().addAll((Collection<? extends CollaborationOccurrence>)newValue);
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
			case UML2WithIDPackage.CLASSIFIER__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)null);
				return;
			case UML2WithIDPackage.CLASSIFIER__OWNING_PARAMETER:
				setOwningParameter((TemplateParameter)null);
				return;
			case UML2WithIDPackage.CLASSIFIER__PACKAGEABLE_ELEMENT_VISIBILITY:
				setPackageableElement_visibility(PACKAGEABLE_ELEMENT_VISIBILITY_EDEFAULT);
				return;
			case UML2WithIDPackage.CLASSIFIER__PACKAGE:
				setPackage((org.csu.slicing.UML2WithID.Package)null);
				return;
			case UML2WithIDPackage.CLASSIFIER__REDEFINITION_CONTEXT:
				getRedefinitionContext().clear();
				return;
			case UML2WithIDPackage.CLASSIFIER__IS_LEAF:
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UML2WithIDPackage.CLASSIFIER__FEATURE:
				getFeature().clear();
				return;
			case UML2WithIDPackage.CLASSIFIER__IS_ABSTRACT:
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case UML2WithIDPackage.CLASSIFIER__INHERITED_MEMBER:
				getInheritedMember().clear();
				return;
			case UML2WithIDPackage.CLASSIFIER__GENERAL:
				getGeneral().clear();
				return;
			case UML2WithIDPackage.CLASSIFIER__GENERALIZATION:
				getGeneralization().clear();
				return;
			case UML2WithIDPackage.CLASSIFIER__ATTRIBUTE:
				getAttribute().clear();
				return;
			case UML2WithIDPackage.CLASSIFIER__REDEFINED_CLASSIFIER:
				getRedefinedClassifier().clear();
				return;
			case UML2WithIDPackage.CLASSIFIER__SUBSTITUTION:
				getSubstitution().clear();
				return;
			case UML2WithIDPackage.CLASSIFIER__POWERTYPE_EXTENT:
				getPowertypeExtent().clear();
				return;
			case UML2WithIDPackage.CLASSIFIER__OWNED_USE_CASE:
				getOwnedUseCase().clear();
				return;
			case UML2WithIDPackage.CLASSIFIER__USE_CASE:
				getUseCase().clear();
				return;
			case UML2WithIDPackage.CLASSIFIER__REPRESENTATION:
				setRepresentation((CollaborationOccurrence)null);
				return;
			case UML2WithIDPackage.CLASSIFIER__OCCURRENCE:
				getOccurrence().clear();
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
			case UML2WithIDPackage.CLASSIFIER__TEMPLATE_PARAMETER:
				return templateParameter != null;
			case UML2WithIDPackage.CLASSIFIER__OWNING_PARAMETER:
				return getOwningParameter() != null;
			case UML2WithIDPackage.CLASSIFIER__PACKAGEABLE_ELEMENT_VISIBILITY:
				return packageableElement_visibility != PACKAGEABLE_ELEMENT_VISIBILITY_EDEFAULT;
			case UML2WithIDPackage.CLASSIFIER__PACKAGE:
				return package_ != null;
			case UML2WithIDPackage.CLASSIFIER__REDEFINITION_CONTEXT:
				return redefinitionContext != null && !redefinitionContext.isEmpty();
			case UML2WithIDPackage.CLASSIFIER__IS_LEAF:
				return isLeaf != IS_LEAF_EDEFAULT;
			case UML2WithIDPackage.CLASSIFIER__FEATURE:
				return feature != null && !feature.isEmpty();
			case UML2WithIDPackage.CLASSIFIER__IS_ABSTRACT:
				return isAbstract != IS_ABSTRACT_EDEFAULT;
			case UML2WithIDPackage.CLASSIFIER__INHERITED_MEMBER:
				return inheritedMember != null && !inheritedMember.isEmpty();
			case UML2WithIDPackage.CLASSIFIER__GENERAL:
				return general != null && !general.isEmpty();
			case UML2WithIDPackage.CLASSIFIER__GENERALIZATION:
				return generalization != null && !generalization.isEmpty();
			case UML2WithIDPackage.CLASSIFIER__ATTRIBUTE:
				return attribute != null && !attribute.isEmpty();
			case UML2WithIDPackage.CLASSIFIER__REDEFINED_CLASSIFIER:
				return redefinedClassifier != null && !redefinedClassifier.isEmpty();
			case UML2WithIDPackage.CLASSIFIER__SUBSTITUTION:
				return substitution != null && !substitution.isEmpty();
			case UML2WithIDPackage.CLASSIFIER__POWERTYPE_EXTENT:
				return powertypeExtent != null && !powertypeExtent.isEmpty();
			case UML2WithIDPackage.CLASSIFIER__OWNED_USE_CASE:
				return ownedUseCase != null && !ownedUseCase.isEmpty();
			case UML2WithIDPackage.CLASSIFIER__USE_CASE:
				return useCase != null && !useCase.isEmpty();
			case UML2WithIDPackage.CLASSIFIER__REPRESENTATION:
				return representation != null;
			case UML2WithIDPackage.CLASSIFIER__OCCURRENCE:
				return occurrence != null && !occurrence.isEmpty();
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
				case UML2WithIDPackage.CLASSIFIER__TEMPLATE_PARAMETER: return UML2WithIDPackage.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER;
				case UML2WithIDPackage.CLASSIFIER__OWNING_PARAMETER: return UML2WithIDPackage.PARAMETERABLE_ELEMENT__OWNING_PARAMETER;
				default: return -1;
			}
		}
		if (baseClass == PackageableElement.class) {
			switch (derivedFeatureID) {
				case UML2WithIDPackage.CLASSIFIER__PACKAGEABLE_ELEMENT_VISIBILITY: return UML2WithIDPackage.PACKAGEABLE_ELEMENT__PACKAGEABLE_ELEMENT_VISIBILITY;
				default: return -1;
			}
		}
		if (baseClass == Type.class) {
			switch (derivedFeatureID) {
				case UML2WithIDPackage.CLASSIFIER__PACKAGE: return UML2WithIDPackage.TYPE__PACKAGE;
				default: return -1;
			}
		}
		if (baseClass == RedefinableElement.class) {
			switch (derivedFeatureID) {
				case UML2WithIDPackage.CLASSIFIER__REDEFINITION_CONTEXT: return UML2WithIDPackage.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT;
				case UML2WithIDPackage.CLASSIFIER__IS_LEAF: return UML2WithIDPackage.REDEFINABLE_ELEMENT__IS_LEAF;
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
				case UML2WithIDPackage.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER: return UML2WithIDPackage.CLASSIFIER__TEMPLATE_PARAMETER;
				case UML2WithIDPackage.PARAMETERABLE_ELEMENT__OWNING_PARAMETER: return UML2WithIDPackage.CLASSIFIER__OWNING_PARAMETER;
				default: return -1;
			}
		}
		if (baseClass == PackageableElement.class) {
			switch (baseFeatureID) {
				case UML2WithIDPackage.PACKAGEABLE_ELEMENT__PACKAGEABLE_ELEMENT_VISIBILITY: return UML2WithIDPackage.CLASSIFIER__PACKAGEABLE_ELEMENT_VISIBILITY;
				default: return -1;
			}
		}
		if (baseClass == Type.class) {
			switch (baseFeatureID) {
				case UML2WithIDPackage.TYPE__PACKAGE: return UML2WithIDPackage.CLASSIFIER__PACKAGE;
				default: return -1;
			}
		}
		if (baseClass == RedefinableElement.class) {
			switch (baseFeatureID) {
				case UML2WithIDPackage.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT: return UML2WithIDPackage.CLASSIFIER__REDEFINITION_CONTEXT;
				case UML2WithIDPackage.REDEFINABLE_ELEMENT__IS_LEAF: return UML2WithIDPackage.CLASSIFIER__IS_LEAF;
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
		result.append(", isLeaf: ");
		result.append(isLeaf);
		result.append(", isAbstract: ");
		result.append(isAbstract);
		result.append(')');
		return result.toString();
	}

} //ClassifierImpl

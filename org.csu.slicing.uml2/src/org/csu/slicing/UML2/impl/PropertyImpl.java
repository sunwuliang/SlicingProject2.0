/**
 */
package org.csu.slicing.UML2.impl;

import java.util.Collection;

import org.csu.slicing.UML2.AggregationKind;
import org.csu.slicing.UML2.Association;
import org.csu.slicing.UML2.ConnectableElement;
import org.csu.slicing.UML2.ConnectorEnd;
import org.csu.slicing.UML2.DataType;
import org.csu.slicing.UML2.Deployment;
import org.csu.slicing.UML2.DeploymentTarget;
import org.csu.slicing.UML2.PackageableElement;
import org.csu.slicing.UML2.ParameterableElement;
import org.csu.slicing.UML2.Property;
import org.csu.slicing.UML2.TemplateParameter;
import org.csu.slicing.UML2.UML2Package;
import org.csu.slicing.UML2.ValueSpecification;

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
 * An implementation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2.impl.PropertyImpl#getTemplateParameter <em>Template Parameter</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.PropertyImpl#getOwningParameter <em>Owning Parameter</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.PropertyImpl#getEnd <em>End</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.PropertyImpl#getDeployment <em>Deployment</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.PropertyImpl#getDeployedElement <em>Deployed Element</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.PropertyImpl#getDefault <em>Default</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.PropertyImpl#isIsComposite <em>Is Composite</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.PropertyImpl#isIsDerived <em>Is Derived</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.PropertyImpl#getClass_ <em>Class </em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.PropertyImpl#getOpposite <em>Opposite</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.PropertyImpl#isIsDerivedUnion <em>Is Derived Union</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.PropertyImpl#getOwningAssociation <em>Owning Association</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.PropertyImpl#getRedefinedProperty <em>Redefined Property</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.PropertyImpl#getSubsettedProperty <em>Subsetted Property</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.PropertyImpl#getDatatype <em>Datatype</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.PropertyImpl#getAssociation <em>Association</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.PropertyImpl#getAggregation <em>Aggregation</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.PropertyImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.PropertyImpl#getQualifier <em>Qualifier</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.PropertyImpl#getAssociationEnd <em>Association End</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PropertyImpl extends StructuralFeatureImpl implements Property {
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
	 * The cached value of the '{@link #getEnd() <em>End</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected EList<ConnectorEnd> end;

	/**
	 * The cached value of the '{@link #getDeployment() <em>Deployment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeployment()
	 * @generated
	 * @ordered
	 */
	protected EList<Deployment> deployment;

	/**
	 * The cached value of the '{@link #getDeployedElement() <em>Deployed Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeployedElement()
	 * @generated
	 * @ordered
	 */
	protected EList<PackageableElement> deployedElement;

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
	 * The default value of the '{@link #isIsComposite() <em>Is Composite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsComposite()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_COMPOSITE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsComposite() <em>Is Composite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsComposite()
	 * @generated
	 * @ordered
	 */
	protected boolean isComposite = IS_COMPOSITE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsDerived() <em>Is Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDerived()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DERIVED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsDerived() <em>Is Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDerived()
	 * @generated
	 * @ordered
	 */
	protected boolean isDerived = IS_DERIVED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getClass_() <em>Class </em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected org.csu.slicing.UML2.Class class_;

	/**
	 * The cached value of the '{@link #getOpposite() <em>Opposite</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpposite()
	 * @generated
	 * @ordered
	 */
	protected Property opposite;

	/**
	 * The default value of the '{@link #isIsDerivedUnion() <em>Is Derived Union</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDerivedUnion()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DERIVED_UNION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsDerivedUnion() <em>Is Derived Union</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDerivedUnion()
	 * @generated
	 * @ordered
	 */
	protected boolean isDerivedUnion = IS_DERIVED_UNION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRedefinedProperty() <em>Redefined Property</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinedProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> redefinedProperty;

	/**
	 * The cached value of the '{@link #getSubsettedProperty() <em>Subsetted Property</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubsettedProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> subsettedProperty;

	/**
	 * The cached value of the '{@link #getAssociation() <em>Association</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociation()
	 * @generated
	 * @ordered
	 */
	protected Association association;

	/**
	 * The default value of the '{@link #getAggregation() <em>Aggregation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregation()
	 * @generated
	 * @ordered
	 */
	protected static final AggregationKind AGGREGATION_EDEFAULT = AggregationKind.COMPOSITE;

	/**
	 * The cached value of the '{@link #getAggregation() <em>Aggregation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregation()
	 * @generated
	 * @ordered
	 */
	protected AggregationKind aggregation = AGGREGATION_EDEFAULT;

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
	 * The cached value of the '{@link #getQualifier() <em>Qualifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifier()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> qualifier;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UML2Package.eINSTANCE.getProperty();
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2Package.PROPERTY__TEMPLATE_PARAMETER, oldTemplateParameter, templateParameter));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UML2Package.PROPERTY__TEMPLATE_PARAMETER, oldTemplateParameter, newTemplateParameter);
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
				msgs = ((InternalEObject)templateParameter).eInverseRemove(this, UML2Package.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
			if (newTemplateParameter != null)
				msgs = ((InternalEObject)newTemplateParameter).eInverseAdd(this, UML2Package.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
			msgs = basicSetTemplateParameter(newTemplateParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.PROPERTY__TEMPLATE_PARAMETER, newTemplateParameter, newTemplateParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateParameter getOwningParameter() {
		if (eContainerFeatureID() != UML2Package.PROPERTY__OWNING_PARAMETER) return null;
		return (TemplateParameter)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningParameter(TemplateParameter newOwningParameter, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningParameter, UML2Package.PROPERTY__OWNING_PARAMETER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningParameter(TemplateParameter newOwningParameter) {
		if (newOwningParameter != eInternalContainer() || (eContainerFeatureID() != UML2Package.PROPERTY__OWNING_PARAMETER && newOwningParameter != null)) {
			if (EcoreUtil.isAncestor(this, newOwningParameter))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningParameter != null)
				msgs = ((InternalEObject)newOwningParameter).eInverseAdd(this, UML2Package.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
			msgs = basicSetOwningParameter(newOwningParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.PROPERTY__OWNING_PARAMETER, newOwningParameter, newOwningParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConnectorEnd> getEnd() {
		if (end == null) {
			end = new EObjectWithInverseResolvingEList<ConnectorEnd>(ConnectorEnd.class, this, UML2Package.PROPERTY__END, UML2Package.CONNECTOR_END__ROLE);
		}
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Deployment> getDeployment() {
		if (deployment == null) {
			deployment = new EObjectContainmentWithInverseEList<Deployment>(Deployment.class, this, UML2Package.PROPERTY__DEPLOYMENT, UML2Package.DEPLOYMENT__LOCATION);
		}
		return deployment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PackageableElement> getDeployedElement() {
		if (deployedElement == null) {
			deployedElement = new EObjectResolvingEList<PackageableElement>(PackageableElement.class, this, UML2Package.PROPERTY__DEPLOYED_ELEMENT);
		}
		return deployedElement;
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
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.PROPERTY__DEFAULT, oldDefault, default_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsComposite() {
		return isComposite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsComposite(boolean newIsComposite) {
		boolean oldIsComposite = isComposite;
		isComposite = newIsComposite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.PROPERTY__IS_COMPOSITE, oldIsComposite, isComposite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsDerived() {
		return isDerived;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDerived(boolean newIsDerived) {
		boolean oldIsDerived = isDerived;
		isDerived = newIsDerived;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.PROPERTY__IS_DERIVED, oldIsDerived, isDerived));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.csu.slicing.UML2.Class getClass_() {
		if (class_ != null && class_.eIsProxy()) {
			InternalEObject oldClass_ = (InternalEObject)class_;
			class_ = (org.csu.slicing.UML2.Class)eResolveProxy(oldClass_);
			if (class_ != oldClass_) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2Package.PROPERTY__CLASS_, oldClass_, class_));
			}
		}
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.csu.slicing.UML2.Class basicGetClass_() {
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClass_(org.csu.slicing.UML2.Class newClass_) {
		org.csu.slicing.UML2.Class oldClass_ = class_;
		class_ = newClass_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.PROPERTY__CLASS_, oldClass_, class_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getOpposite() {
		if (opposite != null && opposite.eIsProxy()) {
			InternalEObject oldOpposite = (InternalEObject)opposite;
			opposite = (Property)eResolveProxy(oldOpposite);
			if (opposite != oldOpposite) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2Package.PROPERTY__OPPOSITE, oldOpposite, opposite));
			}
		}
		return opposite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property basicGetOpposite() {
		return opposite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpposite(Property newOpposite) {
		Property oldOpposite = opposite;
		opposite = newOpposite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.PROPERTY__OPPOSITE, oldOpposite, opposite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsDerivedUnion() {
		return isDerivedUnion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDerivedUnion(boolean newIsDerivedUnion) {
		boolean oldIsDerivedUnion = isDerivedUnion;
		isDerivedUnion = newIsDerivedUnion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.PROPERTY__IS_DERIVED_UNION, oldIsDerivedUnion, isDerivedUnion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association getOwningAssociation() {
		if (eContainerFeatureID() != UML2Package.PROPERTY__OWNING_ASSOCIATION) return null;
		return (Association)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningAssociation(Association newOwningAssociation, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningAssociation, UML2Package.PROPERTY__OWNING_ASSOCIATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningAssociation(Association newOwningAssociation) {
		if (newOwningAssociation != eInternalContainer() || (eContainerFeatureID() != UML2Package.PROPERTY__OWNING_ASSOCIATION && newOwningAssociation != null)) {
			if (EcoreUtil.isAncestor(this, newOwningAssociation))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningAssociation != null)
				msgs = ((InternalEObject)newOwningAssociation).eInverseAdd(this, UML2Package.ASSOCIATION__OWNED_END, Association.class, msgs);
			msgs = basicSetOwningAssociation(newOwningAssociation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.PROPERTY__OWNING_ASSOCIATION, newOwningAssociation, newOwningAssociation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getRedefinedProperty() {
		if (redefinedProperty == null) {
			redefinedProperty = new EObjectResolvingEList<Property>(Property.class, this, UML2Package.PROPERTY__REDEFINED_PROPERTY);
		}
		return redefinedProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getSubsettedProperty() {
		if (subsettedProperty == null) {
			subsettedProperty = new EObjectResolvingEList<Property>(Property.class, this, UML2Package.PROPERTY__SUBSETTED_PROPERTY);
		}
		return subsettedProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getDatatype() {
		if (eContainerFeatureID() != UML2Package.PROPERTY__DATATYPE) return null;
		return (DataType)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatatype(DataType newDatatype, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDatatype, UML2Package.PROPERTY__DATATYPE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatatype(DataType newDatatype) {
		if (newDatatype != eInternalContainer() || (eContainerFeatureID() != UML2Package.PROPERTY__DATATYPE && newDatatype != null)) {
			if (EcoreUtil.isAncestor(this, newDatatype))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDatatype != null)
				msgs = ((InternalEObject)newDatatype).eInverseAdd(this, UML2Package.DATA_TYPE__OWNED_ATTRIBUTE, DataType.class, msgs);
			msgs = basicSetDatatype(newDatatype, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.PROPERTY__DATATYPE, newDatatype, newDatatype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association getAssociation() {
		if (association != null && association.eIsProxy()) {
			InternalEObject oldAssociation = (InternalEObject)association;
			association = (Association)eResolveProxy(oldAssociation);
			if (association != oldAssociation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2Package.PROPERTY__ASSOCIATION, oldAssociation, association));
			}
		}
		return association;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association basicGetAssociation() {
		return association;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssociation(Association newAssociation, NotificationChain msgs) {
		Association oldAssociation = association;
		association = newAssociation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UML2Package.PROPERTY__ASSOCIATION, oldAssociation, newAssociation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssociation(Association newAssociation) {
		if (newAssociation != association) {
			NotificationChain msgs = null;
			if (association != null)
				msgs = ((InternalEObject)association).eInverseRemove(this, UML2Package.ASSOCIATION__MEMBER_END, Association.class, msgs);
			if (newAssociation != null)
				msgs = ((InternalEObject)newAssociation).eInverseAdd(this, UML2Package.ASSOCIATION__MEMBER_END, Association.class, msgs);
			msgs = basicSetAssociation(newAssociation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.PROPERTY__ASSOCIATION, newAssociation, newAssociation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregationKind getAggregation() {
		return aggregation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAggregation(AggregationKind newAggregation) {
		AggregationKind oldAggregation = aggregation;
		aggregation = newAggregation == null ? AGGREGATION_EDEFAULT : newAggregation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.PROPERTY__AGGREGATION, oldAggregation, aggregation));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UML2Package.PROPERTY__DEFAULT_VALUE, oldDefaultValue, newDefaultValue);
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
				msgs = ((InternalEObject)defaultValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.PROPERTY__DEFAULT_VALUE, null, msgs);
			if (newDefaultValue != null)
				msgs = ((InternalEObject)newDefaultValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UML2Package.PROPERTY__DEFAULT_VALUE, null, msgs);
			msgs = basicSetDefaultValue(newDefaultValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.PROPERTY__DEFAULT_VALUE, newDefaultValue, newDefaultValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getQualifier() {
		if (qualifier == null) {
			qualifier = new EObjectContainmentWithInverseEList<Property>(Property.class, this, UML2Package.PROPERTY__QUALIFIER, UML2Package.PROPERTY__ASSOCIATION_END);
		}
		return qualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getAssociationEnd() {
		if (eContainerFeatureID() != UML2Package.PROPERTY__ASSOCIATION_END) return null;
		return (Property)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssociationEnd(Property newAssociationEnd, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newAssociationEnd, UML2Package.PROPERTY__ASSOCIATION_END, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssociationEnd(Property newAssociationEnd) {
		if (newAssociationEnd != eInternalContainer() || (eContainerFeatureID() != UML2Package.PROPERTY__ASSOCIATION_END && newAssociationEnd != null)) {
			if (EcoreUtil.isAncestor(this, newAssociationEnd))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAssociationEnd != null)
				msgs = ((InternalEObject)newAssociationEnd).eInverseAdd(this, UML2Package.PROPERTY__QUALIFIER, Property.class, msgs);
			msgs = basicSetAssociationEnd(newAssociationEnd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.PROPERTY__ASSOCIATION_END, newAssociationEnd, newAssociationEnd));
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
			case UML2Package.PROPERTY__TEMPLATE_PARAMETER:
				if (templateParameter != null)
					msgs = ((InternalEObject)templateParameter).eInverseRemove(this, UML2Package.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
				return basicSetTemplateParameter((TemplateParameter)otherEnd, msgs);
			case UML2Package.PROPERTY__OWNING_PARAMETER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningParameter((TemplateParameter)otherEnd, msgs);
			case UML2Package.PROPERTY__END:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEnd()).basicAdd(otherEnd, msgs);
			case UML2Package.PROPERTY__DEPLOYMENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDeployment()).basicAdd(otherEnd, msgs);
			case UML2Package.PROPERTY__OWNING_ASSOCIATION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningAssociation((Association)otherEnd, msgs);
			case UML2Package.PROPERTY__DATATYPE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDatatype((DataType)otherEnd, msgs);
			case UML2Package.PROPERTY__ASSOCIATION:
				if (association != null)
					msgs = ((InternalEObject)association).eInverseRemove(this, UML2Package.ASSOCIATION__MEMBER_END, Association.class, msgs);
				return basicSetAssociation((Association)otherEnd, msgs);
			case UML2Package.PROPERTY__QUALIFIER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getQualifier()).basicAdd(otherEnd, msgs);
			case UML2Package.PROPERTY__ASSOCIATION_END:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetAssociationEnd((Property)otherEnd, msgs);
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
			case UML2Package.PROPERTY__TEMPLATE_PARAMETER:
				return basicSetTemplateParameter(null, msgs);
			case UML2Package.PROPERTY__OWNING_PARAMETER:
				return basicSetOwningParameter(null, msgs);
			case UML2Package.PROPERTY__END:
				return ((InternalEList<?>)getEnd()).basicRemove(otherEnd, msgs);
			case UML2Package.PROPERTY__DEPLOYMENT:
				return ((InternalEList<?>)getDeployment()).basicRemove(otherEnd, msgs);
			case UML2Package.PROPERTY__OWNING_ASSOCIATION:
				return basicSetOwningAssociation(null, msgs);
			case UML2Package.PROPERTY__DATATYPE:
				return basicSetDatatype(null, msgs);
			case UML2Package.PROPERTY__ASSOCIATION:
				return basicSetAssociation(null, msgs);
			case UML2Package.PROPERTY__DEFAULT_VALUE:
				return basicSetDefaultValue(null, msgs);
			case UML2Package.PROPERTY__QUALIFIER:
				return ((InternalEList<?>)getQualifier()).basicRemove(otherEnd, msgs);
			case UML2Package.PROPERTY__ASSOCIATION_END:
				return basicSetAssociationEnd(null, msgs);
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
			case UML2Package.PROPERTY__OWNING_PARAMETER:
				return eInternalContainer().eInverseRemove(this, UML2Package.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
			case UML2Package.PROPERTY__OWNING_ASSOCIATION:
				return eInternalContainer().eInverseRemove(this, UML2Package.ASSOCIATION__OWNED_END, Association.class, msgs);
			case UML2Package.PROPERTY__DATATYPE:
				return eInternalContainer().eInverseRemove(this, UML2Package.DATA_TYPE__OWNED_ATTRIBUTE, DataType.class, msgs);
			case UML2Package.PROPERTY__ASSOCIATION_END:
				return eInternalContainer().eInverseRemove(this, UML2Package.PROPERTY__QUALIFIER, Property.class, msgs);
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
			case UML2Package.PROPERTY__TEMPLATE_PARAMETER:
				if (resolve) return getTemplateParameter();
				return basicGetTemplateParameter();
			case UML2Package.PROPERTY__OWNING_PARAMETER:
				return getOwningParameter();
			case UML2Package.PROPERTY__END:
				return getEnd();
			case UML2Package.PROPERTY__DEPLOYMENT:
				return getDeployment();
			case UML2Package.PROPERTY__DEPLOYED_ELEMENT:
				return getDeployedElement();
			case UML2Package.PROPERTY__DEFAULT:
				return getDefault();
			case UML2Package.PROPERTY__IS_COMPOSITE:
				return isIsComposite();
			case UML2Package.PROPERTY__IS_DERIVED:
				return isIsDerived();
			case UML2Package.PROPERTY__CLASS_:
				if (resolve) return getClass_();
				return basicGetClass_();
			case UML2Package.PROPERTY__OPPOSITE:
				if (resolve) return getOpposite();
				return basicGetOpposite();
			case UML2Package.PROPERTY__IS_DERIVED_UNION:
				return isIsDerivedUnion();
			case UML2Package.PROPERTY__OWNING_ASSOCIATION:
				return getOwningAssociation();
			case UML2Package.PROPERTY__REDEFINED_PROPERTY:
				return getRedefinedProperty();
			case UML2Package.PROPERTY__SUBSETTED_PROPERTY:
				return getSubsettedProperty();
			case UML2Package.PROPERTY__DATATYPE:
				return getDatatype();
			case UML2Package.PROPERTY__ASSOCIATION:
				if (resolve) return getAssociation();
				return basicGetAssociation();
			case UML2Package.PROPERTY__AGGREGATION:
				return getAggregation();
			case UML2Package.PROPERTY__DEFAULT_VALUE:
				return getDefaultValue();
			case UML2Package.PROPERTY__QUALIFIER:
				return getQualifier();
			case UML2Package.PROPERTY__ASSOCIATION_END:
				return getAssociationEnd();
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
			case UML2Package.PROPERTY__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)newValue);
				return;
			case UML2Package.PROPERTY__OWNING_PARAMETER:
				setOwningParameter((TemplateParameter)newValue);
				return;
			case UML2Package.PROPERTY__END:
				getEnd().clear();
				getEnd().addAll((Collection<? extends ConnectorEnd>)newValue);
				return;
			case UML2Package.PROPERTY__DEPLOYMENT:
				getDeployment().clear();
				getDeployment().addAll((Collection<? extends Deployment>)newValue);
				return;
			case UML2Package.PROPERTY__DEPLOYED_ELEMENT:
				getDeployedElement().clear();
				getDeployedElement().addAll((Collection<? extends PackageableElement>)newValue);
				return;
			case UML2Package.PROPERTY__DEFAULT:
				setDefault((String)newValue);
				return;
			case UML2Package.PROPERTY__IS_COMPOSITE:
				setIsComposite((Boolean)newValue);
				return;
			case UML2Package.PROPERTY__IS_DERIVED:
				setIsDerived((Boolean)newValue);
				return;
			case UML2Package.PROPERTY__CLASS_:
				setClass_((org.csu.slicing.UML2.Class)newValue);
				return;
			case UML2Package.PROPERTY__OPPOSITE:
				setOpposite((Property)newValue);
				return;
			case UML2Package.PROPERTY__IS_DERIVED_UNION:
				setIsDerivedUnion((Boolean)newValue);
				return;
			case UML2Package.PROPERTY__OWNING_ASSOCIATION:
				setOwningAssociation((Association)newValue);
				return;
			case UML2Package.PROPERTY__REDEFINED_PROPERTY:
				getRedefinedProperty().clear();
				getRedefinedProperty().addAll((Collection<? extends Property>)newValue);
				return;
			case UML2Package.PROPERTY__SUBSETTED_PROPERTY:
				getSubsettedProperty().clear();
				getSubsettedProperty().addAll((Collection<? extends Property>)newValue);
				return;
			case UML2Package.PROPERTY__DATATYPE:
				setDatatype((DataType)newValue);
				return;
			case UML2Package.PROPERTY__ASSOCIATION:
				setAssociation((Association)newValue);
				return;
			case UML2Package.PROPERTY__AGGREGATION:
				setAggregation((AggregationKind)newValue);
				return;
			case UML2Package.PROPERTY__DEFAULT_VALUE:
				setDefaultValue((ValueSpecification)newValue);
				return;
			case UML2Package.PROPERTY__QUALIFIER:
				getQualifier().clear();
				getQualifier().addAll((Collection<? extends Property>)newValue);
				return;
			case UML2Package.PROPERTY__ASSOCIATION_END:
				setAssociationEnd((Property)newValue);
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
			case UML2Package.PROPERTY__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)null);
				return;
			case UML2Package.PROPERTY__OWNING_PARAMETER:
				setOwningParameter((TemplateParameter)null);
				return;
			case UML2Package.PROPERTY__END:
				getEnd().clear();
				return;
			case UML2Package.PROPERTY__DEPLOYMENT:
				getDeployment().clear();
				return;
			case UML2Package.PROPERTY__DEPLOYED_ELEMENT:
				getDeployedElement().clear();
				return;
			case UML2Package.PROPERTY__DEFAULT:
				setDefault(DEFAULT_EDEFAULT);
				return;
			case UML2Package.PROPERTY__IS_COMPOSITE:
				setIsComposite(IS_COMPOSITE_EDEFAULT);
				return;
			case UML2Package.PROPERTY__IS_DERIVED:
				setIsDerived(IS_DERIVED_EDEFAULT);
				return;
			case UML2Package.PROPERTY__CLASS_:
				setClass_((org.csu.slicing.UML2.Class)null);
				return;
			case UML2Package.PROPERTY__OPPOSITE:
				setOpposite((Property)null);
				return;
			case UML2Package.PROPERTY__IS_DERIVED_UNION:
				setIsDerivedUnion(IS_DERIVED_UNION_EDEFAULT);
				return;
			case UML2Package.PROPERTY__OWNING_ASSOCIATION:
				setOwningAssociation((Association)null);
				return;
			case UML2Package.PROPERTY__REDEFINED_PROPERTY:
				getRedefinedProperty().clear();
				return;
			case UML2Package.PROPERTY__SUBSETTED_PROPERTY:
				getSubsettedProperty().clear();
				return;
			case UML2Package.PROPERTY__DATATYPE:
				setDatatype((DataType)null);
				return;
			case UML2Package.PROPERTY__ASSOCIATION:
				setAssociation((Association)null);
				return;
			case UML2Package.PROPERTY__AGGREGATION:
				setAggregation(AGGREGATION_EDEFAULT);
				return;
			case UML2Package.PROPERTY__DEFAULT_VALUE:
				setDefaultValue((ValueSpecification)null);
				return;
			case UML2Package.PROPERTY__QUALIFIER:
				getQualifier().clear();
				return;
			case UML2Package.PROPERTY__ASSOCIATION_END:
				setAssociationEnd((Property)null);
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
			case UML2Package.PROPERTY__TEMPLATE_PARAMETER:
				return templateParameter != null;
			case UML2Package.PROPERTY__OWNING_PARAMETER:
				return getOwningParameter() != null;
			case UML2Package.PROPERTY__END:
				return end != null && !end.isEmpty();
			case UML2Package.PROPERTY__DEPLOYMENT:
				return deployment != null && !deployment.isEmpty();
			case UML2Package.PROPERTY__DEPLOYED_ELEMENT:
				return deployedElement != null && !deployedElement.isEmpty();
			case UML2Package.PROPERTY__DEFAULT:
				return DEFAULT_EDEFAULT == null ? default_ != null : !DEFAULT_EDEFAULT.equals(default_);
			case UML2Package.PROPERTY__IS_COMPOSITE:
				return isComposite != IS_COMPOSITE_EDEFAULT;
			case UML2Package.PROPERTY__IS_DERIVED:
				return isDerived != IS_DERIVED_EDEFAULT;
			case UML2Package.PROPERTY__CLASS_:
				return class_ != null;
			case UML2Package.PROPERTY__OPPOSITE:
				return opposite != null;
			case UML2Package.PROPERTY__IS_DERIVED_UNION:
				return isDerivedUnion != IS_DERIVED_UNION_EDEFAULT;
			case UML2Package.PROPERTY__OWNING_ASSOCIATION:
				return getOwningAssociation() != null;
			case UML2Package.PROPERTY__REDEFINED_PROPERTY:
				return redefinedProperty != null && !redefinedProperty.isEmpty();
			case UML2Package.PROPERTY__SUBSETTED_PROPERTY:
				return subsettedProperty != null && !subsettedProperty.isEmpty();
			case UML2Package.PROPERTY__DATATYPE:
				return getDatatype() != null;
			case UML2Package.PROPERTY__ASSOCIATION:
				return association != null;
			case UML2Package.PROPERTY__AGGREGATION:
				return aggregation != AGGREGATION_EDEFAULT;
			case UML2Package.PROPERTY__DEFAULT_VALUE:
				return defaultValue != null;
			case UML2Package.PROPERTY__QUALIFIER:
				return qualifier != null && !qualifier.isEmpty();
			case UML2Package.PROPERTY__ASSOCIATION_END:
				return getAssociationEnd() != null;
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
				case UML2Package.PROPERTY__TEMPLATE_PARAMETER: return UML2Package.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER;
				case UML2Package.PROPERTY__OWNING_PARAMETER: return UML2Package.PARAMETERABLE_ELEMENT__OWNING_PARAMETER;
				default: return -1;
			}
		}
		if (baseClass == ConnectableElement.class) {
			switch (derivedFeatureID) {
				case UML2Package.PROPERTY__END: return UML2Package.CONNECTABLE_ELEMENT__END;
				default: return -1;
			}
		}
		if (baseClass == DeploymentTarget.class) {
			switch (derivedFeatureID) {
				case UML2Package.PROPERTY__DEPLOYMENT: return UML2Package.DEPLOYMENT_TARGET__DEPLOYMENT;
				case UML2Package.PROPERTY__DEPLOYED_ELEMENT: return UML2Package.DEPLOYMENT_TARGET__DEPLOYED_ELEMENT;
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
				case UML2Package.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER: return UML2Package.PROPERTY__TEMPLATE_PARAMETER;
				case UML2Package.PARAMETERABLE_ELEMENT__OWNING_PARAMETER: return UML2Package.PROPERTY__OWNING_PARAMETER;
				default: return -1;
			}
		}
		if (baseClass == ConnectableElement.class) {
			switch (baseFeatureID) {
				case UML2Package.CONNECTABLE_ELEMENT__END: return UML2Package.PROPERTY__END;
				default: return -1;
			}
		}
		if (baseClass == DeploymentTarget.class) {
			switch (baseFeatureID) {
				case UML2Package.DEPLOYMENT_TARGET__DEPLOYMENT: return UML2Package.PROPERTY__DEPLOYMENT;
				case UML2Package.DEPLOYMENT_TARGET__DEPLOYED_ELEMENT: return UML2Package.PROPERTY__DEPLOYED_ELEMENT;
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
		result.append(" (default: ");
		result.append(default_);
		result.append(", isComposite: ");
		result.append(isComposite);
		result.append(", isDerived: ");
		result.append(isDerived);
		result.append(", isDerivedUnion: ");
		result.append(isDerivedUnion);
		result.append(", aggregation: ");
		result.append(aggregation);
		result.append(')');
		return result.toString();
	}

} //PropertyImpl

/**
 */
package org.csu.slicing.UML2.impl;

import java.util.Collection;

import org.csu.slicing.UML2.Constraint;
import org.csu.slicing.UML2.ElementImport;
import org.csu.slicing.UML2.NamedElement;
import org.csu.slicing.UML2.Namespace;
import org.csu.slicing.UML2.PackageImport;
import org.csu.slicing.UML2.PackageableElement;
import org.csu.slicing.UML2.UML2Package;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Namespace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2.impl.NamespaceImpl#getMember <em>Member</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.NamespaceImpl#getOwnedRule <em>Owned Rule</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.NamespaceImpl#getImportedMember <em>Imported Member</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.NamespaceImpl#getElementImport <em>Element Import</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.NamespaceImpl#getPackageImport <em>Package Import</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class NamespaceImpl extends NamedElementImpl implements Namespace {
	/**
	 * The cached value of the '{@link #getMember() <em>Member</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMember()
	 * @generated
	 * @ordered
	 */
	protected EList<NamedElement> member;

	/**
	 * The cached value of the '{@link #getOwnedRule() <em>Owned Rule</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedRule()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> ownedRule;

	/**
	 * The cached value of the '{@link #getImportedMember() <em>Imported Member</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportedMember()
	 * @generated
	 * @ordered
	 */
	protected EList<PackageableElement> importedMember;

	/**
	 * The cached value of the '{@link #getElementImport() <em>Element Import</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementImport()
	 * @generated
	 * @ordered
	 */
	protected EList<ElementImport> elementImport;

	/**
	 * The cached value of the '{@link #getPackageImport() <em>Package Import</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageImport()
	 * @generated
	 * @ordered
	 */
	protected EList<PackageImport> packageImport;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NamespaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UML2Package.eINSTANCE.getNamespace();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NamedElement> getMember() {
		if (member == null) {
			member = new EObjectResolvingEList<NamedElement>(NamedElement.class, this, UML2Package.NAMESPACE__MEMBER);
		}
		return member;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getOwnedRule() {
		if (ownedRule == null) {
			ownedRule = new EObjectContainmentWithInverseEList<Constraint>(Constraint.class, this, UML2Package.NAMESPACE__OWNED_RULE, UML2Package.CONSTRAINT__NAMESPACE);
		}
		return ownedRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PackageableElement> getImportedMember() {
		if (importedMember == null) {
			importedMember = new EObjectResolvingEList<PackageableElement>(PackageableElement.class, this, UML2Package.NAMESPACE__IMPORTED_MEMBER);
		}
		return importedMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ElementImport> getElementImport() {
		if (elementImport == null) {
			elementImport = new EObjectContainmentWithInverseEList<ElementImport>(ElementImport.class, this, UML2Package.NAMESPACE__ELEMENT_IMPORT, UML2Package.ELEMENT_IMPORT__IMPORTING_NAMESPACE);
		}
		return elementImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PackageImport> getPackageImport() {
		if (packageImport == null) {
			packageImport = new EObjectContainmentWithInverseEList<PackageImport>(PackageImport.class, this, UML2Package.NAMESPACE__PACKAGE_IMPORT, UML2Package.PACKAGE_IMPORT__IMPORTING_NAMESPACE);
		}
		return packageImport;
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
			case UML2Package.NAMESPACE__OWNED_RULE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedRule()).basicAdd(otherEnd, msgs);
			case UML2Package.NAMESPACE__ELEMENT_IMPORT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getElementImport()).basicAdd(otherEnd, msgs);
			case UML2Package.NAMESPACE__PACKAGE_IMPORT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPackageImport()).basicAdd(otherEnd, msgs);
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
			case UML2Package.NAMESPACE__OWNED_RULE:
				return ((InternalEList<?>)getOwnedRule()).basicRemove(otherEnd, msgs);
			case UML2Package.NAMESPACE__ELEMENT_IMPORT:
				return ((InternalEList<?>)getElementImport()).basicRemove(otherEnd, msgs);
			case UML2Package.NAMESPACE__PACKAGE_IMPORT:
				return ((InternalEList<?>)getPackageImport()).basicRemove(otherEnd, msgs);
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
			case UML2Package.NAMESPACE__MEMBER:
				return getMember();
			case UML2Package.NAMESPACE__OWNED_RULE:
				return getOwnedRule();
			case UML2Package.NAMESPACE__IMPORTED_MEMBER:
				return getImportedMember();
			case UML2Package.NAMESPACE__ELEMENT_IMPORT:
				return getElementImport();
			case UML2Package.NAMESPACE__PACKAGE_IMPORT:
				return getPackageImport();
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
			case UML2Package.NAMESPACE__MEMBER:
				getMember().clear();
				getMember().addAll((Collection<? extends NamedElement>)newValue);
				return;
			case UML2Package.NAMESPACE__OWNED_RULE:
				getOwnedRule().clear();
				getOwnedRule().addAll((Collection<? extends Constraint>)newValue);
				return;
			case UML2Package.NAMESPACE__IMPORTED_MEMBER:
				getImportedMember().clear();
				getImportedMember().addAll((Collection<? extends PackageableElement>)newValue);
				return;
			case UML2Package.NAMESPACE__ELEMENT_IMPORT:
				getElementImport().clear();
				getElementImport().addAll((Collection<? extends ElementImport>)newValue);
				return;
			case UML2Package.NAMESPACE__PACKAGE_IMPORT:
				getPackageImport().clear();
				getPackageImport().addAll((Collection<? extends PackageImport>)newValue);
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
			case UML2Package.NAMESPACE__MEMBER:
				getMember().clear();
				return;
			case UML2Package.NAMESPACE__OWNED_RULE:
				getOwnedRule().clear();
				return;
			case UML2Package.NAMESPACE__IMPORTED_MEMBER:
				getImportedMember().clear();
				return;
			case UML2Package.NAMESPACE__ELEMENT_IMPORT:
				getElementImport().clear();
				return;
			case UML2Package.NAMESPACE__PACKAGE_IMPORT:
				getPackageImport().clear();
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
			case UML2Package.NAMESPACE__MEMBER:
				return member != null && !member.isEmpty();
			case UML2Package.NAMESPACE__OWNED_RULE:
				return ownedRule != null && !ownedRule.isEmpty();
			case UML2Package.NAMESPACE__IMPORTED_MEMBER:
				return importedMember != null && !importedMember.isEmpty();
			case UML2Package.NAMESPACE__ELEMENT_IMPORT:
				return elementImport != null && !elementImport.isEmpty();
			case UML2Package.NAMESPACE__PACKAGE_IMPORT:
				return packageImport != null && !packageImport.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //NamespaceImpl

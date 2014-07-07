/**
 */
package org.csu.slicing.UML2WithID.impl;

import org.csu.slicing.UML2WithID.InteractionConstraint;
import org.csu.slicing.UML2WithID.UML2WithIDPackage;
import org.csu.slicing.UML2WithID.ValueSpecification;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interaction Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.InteractionConstraintImpl#getMinint <em>Minint</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.InteractionConstraintImpl#getMaxint <em>Maxint</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InteractionConstraintImpl extends ConstraintImpl implements InteractionConstraint {
	/**
	 * The cached value of the '{@link #getMinint() <em>Minint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinint()
	 * @generated
	 * @ordered
	 */
	protected ValueSpecification minint;

	/**
	 * The cached value of the '{@link #getMaxint() <em>Maxint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxint()
	 * @generated
	 * @ordered
	 */
	protected ValueSpecification maxint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InteractionConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UML2WithIDPackage.eINSTANCE.getInteractionConstraint();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getMinint() {
		return minint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMinint(ValueSpecification newMinint, NotificationChain msgs) {
		ValueSpecification oldMinint = minint;
		minint = newMinint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UML2WithIDPackage.INTERACTION_CONSTRAINT__MININT, oldMinint, newMinint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinint(ValueSpecification newMinint) {
		if (newMinint != minint) {
			NotificationChain msgs = null;
			if (minint != null)
				msgs = ((InternalEObject)minint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2WithIDPackage.INTERACTION_CONSTRAINT__MININT, null, msgs);
			if (newMinint != null)
				msgs = ((InternalEObject)newMinint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UML2WithIDPackage.INTERACTION_CONSTRAINT__MININT, null, msgs);
			msgs = basicSetMinint(newMinint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2WithIDPackage.INTERACTION_CONSTRAINT__MININT, newMinint, newMinint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getMaxint() {
		return maxint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaxint(ValueSpecification newMaxint, NotificationChain msgs) {
		ValueSpecification oldMaxint = maxint;
		maxint = newMaxint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UML2WithIDPackage.INTERACTION_CONSTRAINT__MAXINT, oldMaxint, newMaxint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxint(ValueSpecification newMaxint) {
		if (newMaxint != maxint) {
			NotificationChain msgs = null;
			if (maxint != null)
				msgs = ((InternalEObject)maxint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2WithIDPackage.INTERACTION_CONSTRAINT__MAXINT, null, msgs);
			if (newMaxint != null)
				msgs = ((InternalEObject)newMaxint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UML2WithIDPackage.INTERACTION_CONSTRAINT__MAXINT, null, msgs);
			msgs = basicSetMaxint(newMaxint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2WithIDPackage.INTERACTION_CONSTRAINT__MAXINT, newMaxint, newMaxint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UML2WithIDPackage.INTERACTION_CONSTRAINT__MININT:
				return basicSetMinint(null, msgs);
			case UML2WithIDPackage.INTERACTION_CONSTRAINT__MAXINT:
				return basicSetMaxint(null, msgs);
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
			case UML2WithIDPackage.INTERACTION_CONSTRAINT__MININT:
				return getMinint();
			case UML2WithIDPackage.INTERACTION_CONSTRAINT__MAXINT:
				return getMaxint();
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
			case UML2WithIDPackage.INTERACTION_CONSTRAINT__MININT:
				setMinint((ValueSpecification)newValue);
				return;
			case UML2WithIDPackage.INTERACTION_CONSTRAINT__MAXINT:
				setMaxint((ValueSpecification)newValue);
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
			case UML2WithIDPackage.INTERACTION_CONSTRAINT__MININT:
				setMinint((ValueSpecification)null);
				return;
			case UML2WithIDPackage.INTERACTION_CONSTRAINT__MAXINT:
				setMaxint((ValueSpecification)null);
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
			case UML2WithIDPackage.INTERACTION_CONSTRAINT__MININT:
				return minint != null;
			case UML2WithIDPackage.INTERACTION_CONSTRAINT__MAXINT:
				return maxint != null;
		}
		return super.eIsSet(featureID);
	}

} //InteractionConstraintImpl

/**
 */
package org.csu.slicing.UML2WithID.impl;

import java.util.Collection;

import org.csu.slicing.UML2WithID.Classifier;
import org.csu.slicing.UML2WithID.ExceptionHandler;
import org.csu.slicing.UML2WithID.ExecutableNode;
import org.csu.slicing.UML2WithID.ObjectNode;
import org.csu.slicing.UML2WithID.UML2WithIDPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exception Handler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.ExceptionHandlerImpl#getProtectedNode <em>Protected Node</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.ExceptionHandlerImpl#getHandlerBody <em>Handler Body</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.ExceptionHandlerImpl#getExceptionInput <em>Exception Input</em>}</li>
 *   <li>{@link org.csu.slicing.UML2WithID.impl.ExceptionHandlerImpl#getExceptionType <em>Exception Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExceptionHandlerImpl extends ElementImpl implements ExceptionHandler {
	/**
	 * The cached value of the '{@link #getHandlerBody() <em>Handler Body</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandlerBody()
	 * @generated
	 * @ordered
	 */
	protected ExecutableNode handlerBody;

	/**
	 * The cached value of the '{@link #getExceptionInput() <em>Exception Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExceptionInput()
	 * @generated
	 * @ordered
	 */
	protected ObjectNode exceptionInput;

	/**
	 * The cached value of the '{@link #getExceptionType() <em>Exception Type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExceptionType()
	 * @generated
	 * @ordered
	 */
	protected EList<Classifier> exceptionType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExceptionHandlerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UML2WithIDPackage.eINSTANCE.getExceptionHandler();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutableNode getProtectedNode() {
		if (eContainerFeatureID() != UML2WithIDPackage.EXCEPTION_HANDLER__PROTECTED_NODE) return null;
		return (ExecutableNode)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProtectedNode(ExecutableNode newProtectedNode, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newProtectedNode, UML2WithIDPackage.EXCEPTION_HANDLER__PROTECTED_NODE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtectedNode(ExecutableNode newProtectedNode) {
		if (newProtectedNode != eInternalContainer() || (eContainerFeatureID() != UML2WithIDPackage.EXCEPTION_HANDLER__PROTECTED_NODE && newProtectedNode != null)) {
			if (EcoreUtil.isAncestor(this, newProtectedNode))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newProtectedNode != null)
				msgs = ((InternalEObject)newProtectedNode).eInverseAdd(this, UML2WithIDPackage.EXECUTABLE_NODE__HANDLER, ExecutableNode.class, msgs);
			msgs = basicSetProtectedNode(newProtectedNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2WithIDPackage.EXCEPTION_HANDLER__PROTECTED_NODE, newProtectedNode, newProtectedNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutableNode getHandlerBody() {
		if (handlerBody != null && handlerBody.eIsProxy()) {
			InternalEObject oldHandlerBody = (InternalEObject)handlerBody;
			handlerBody = (ExecutableNode)eResolveProxy(oldHandlerBody);
			if (handlerBody != oldHandlerBody) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2WithIDPackage.EXCEPTION_HANDLER__HANDLER_BODY, oldHandlerBody, handlerBody));
			}
		}
		return handlerBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutableNode basicGetHandlerBody() {
		return handlerBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHandlerBody(ExecutableNode newHandlerBody) {
		ExecutableNode oldHandlerBody = handlerBody;
		handlerBody = newHandlerBody;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2WithIDPackage.EXCEPTION_HANDLER__HANDLER_BODY, oldHandlerBody, handlerBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectNode getExceptionInput() {
		if (exceptionInput != null && exceptionInput.eIsProxy()) {
			InternalEObject oldExceptionInput = (InternalEObject)exceptionInput;
			exceptionInput = (ObjectNode)eResolveProxy(oldExceptionInput);
			if (exceptionInput != oldExceptionInput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2WithIDPackage.EXCEPTION_HANDLER__EXCEPTION_INPUT, oldExceptionInput, exceptionInput));
			}
		}
		return exceptionInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectNode basicGetExceptionInput() {
		return exceptionInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExceptionInput(ObjectNode newExceptionInput) {
		ObjectNode oldExceptionInput = exceptionInput;
		exceptionInput = newExceptionInput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2WithIDPackage.EXCEPTION_HANDLER__EXCEPTION_INPUT, oldExceptionInput, exceptionInput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Classifier> getExceptionType() {
		if (exceptionType == null) {
			exceptionType = new EObjectResolvingEList<Classifier>(Classifier.class, this, UML2WithIDPackage.EXCEPTION_HANDLER__EXCEPTION_TYPE);
		}
		return exceptionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UML2WithIDPackage.EXCEPTION_HANDLER__PROTECTED_NODE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetProtectedNode((ExecutableNode)otherEnd, msgs);
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
			case UML2WithIDPackage.EXCEPTION_HANDLER__PROTECTED_NODE:
				return basicSetProtectedNode(null, msgs);
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
			case UML2WithIDPackage.EXCEPTION_HANDLER__PROTECTED_NODE:
				return eInternalContainer().eInverseRemove(this, UML2WithIDPackage.EXECUTABLE_NODE__HANDLER, ExecutableNode.class, msgs);
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
			case UML2WithIDPackage.EXCEPTION_HANDLER__PROTECTED_NODE:
				return getProtectedNode();
			case UML2WithIDPackage.EXCEPTION_HANDLER__HANDLER_BODY:
				if (resolve) return getHandlerBody();
				return basicGetHandlerBody();
			case UML2WithIDPackage.EXCEPTION_HANDLER__EXCEPTION_INPUT:
				if (resolve) return getExceptionInput();
				return basicGetExceptionInput();
			case UML2WithIDPackage.EXCEPTION_HANDLER__EXCEPTION_TYPE:
				return getExceptionType();
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
			case UML2WithIDPackage.EXCEPTION_HANDLER__PROTECTED_NODE:
				setProtectedNode((ExecutableNode)newValue);
				return;
			case UML2WithIDPackage.EXCEPTION_HANDLER__HANDLER_BODY:
				setHandlerBody((ExecutableNode)newValue);
				return;
			case UML2WithIDPackage.EXCEPTION_HANDLER__EXCEPTION_INPUT:
				setExceptionInput((ObjectNode)newValue);
				return;
			case UML2WithIDPackage.EXCEPTION_HANDLER__EXCEPTION_TYPE:
				getExceptionType().clear();
				getExceptionType().addAll((Collection<? extends Classifier>)newValue);
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
			case UML2WithIDPackage.EXCEPTION_HANDLER__PROTECTED_NODE:
				setProtectedNode((ExecutableNode)null);
				return;
			case UML2WithIDPackage.EXCEPTION_HANDLER__HANDLER_BODY:
				setHandlerBody((ExecutableNode)null);
				return;
			case UML2WithIDPackage.EXCEPTION_HANDLER__EXCEPTION_INPUT:
				setExceptionInput((ObjectNode)null);
				return;
			case UML2WithIDPackage.EXCEPTION_HANDLER__EXCEPTION_TYPE:
				getExceptionType().clear();
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
			case UML2WithIDPackage.EXCEPTION_HANDLER__PROTECTED_NODE:
				return getProtectedNode() != null;
			case UML2WithIDPackage.EXCEPTION_HANDLER__HANDLER_BODY:
				return handlerBody != null;
			case UML2WithIDPackage.EXCEPTION_HANDLER__EXCEPTION_INPUT:
				return exceptionInput != null;
			case UML2WithIDPackage.EXCEPTION_HANDLER__EXCEPTION_TYPE:
				return exceptionType != null && !exceptionType.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ExceptionHandlerImpl

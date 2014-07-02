/**
 */
package org.csu.slicing.UML2.impl;

import java.util.Collection;

import org.csu.slicing.UML2.Activity;
import org.csu.slicing.UML2.Classifier;
import org.csu.slicing.UML2.ConnectionPointReference;
import org.csu.slicing.UML2.Constraint;
import org.csu.slicing.UML2.RedefinableElement;
import org.csu.slicing.UML2.Region;
import org.csu.slicing.UML2.State;
import org.csu.slicing.UML2.StateMachine;
import org.csu.slicing.UML2.Transition;
import org.csu.slicing.UML2.Trigger;
import org.csu.slicing.UML2.UML2Package;
import org.csu.slicing.UML2.Vertex;

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
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.csu.slicing.UML2.impl.StateImpl#getRedefinitionContext <em>Redefinition Context</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.StateImpl#isIsLeaf <em>Is Leaf</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.StateImpl#getContainer <em>Container</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.StateImpl#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.StateImpl#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.StateImpl#isIsComposite <em>Is Composite</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.StateImpl#isIsOrthogonal <em>Is Orthogonal</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.StateImpl#isIsSimple <em>Is Simple</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.StateImpl#isIsSubmachineState <em>Is Submachine State</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.StateImpl#getSubmachine <em>Submachine</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.StateImpl#getConnection <em>Connection</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.StateImpl#getRedefinedState <em>Redefined State</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.StateImpl#getDeferrableTrigger <em>Deferrable Trigger</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.StateImpl#getRegion <em>Region</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.StateImpl#getEntry <em>Entry</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.StateImpl#getExit <em>Exit</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.StateImpl#getDoActivity <em>Do Activity</em>}</li>
 *   <li>{@link org.csu.slicing.UML2.impl.StateImpl#getStateInvariant <em>State Invariant</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StateImpl extends NamespaceImpl implements State {
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
	 * The cached value of the '{@link #getOutgoing() <em>Outgoing</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoing()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> outgoing;

	/**
	 * The cached value of the '{@link #getIncoming() <em>Incoming</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncoming()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> incoming;

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
	 * The default value of the '{@link #isIsOrthogonal() <em>Is Orthogonal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOrthogonal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ORTHOGONAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsOrthogonal() <em>Is Orthogonal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOrthogonal()
	 * @generated
	 * @ordered
	 */
	protected boolean isOrthogonal = IS_ORTHOGONAL_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsSimple() <em>Is Simple</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSimple()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_SIMPLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsSimple() <em>Is Simple</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSimple()
	 * @generated
	 * @ordered
	 */
	protected boolean isSimple = IS_SIMPLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsSubmachineState() <em>Is Submachine State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSubmachineState()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_SUBMACHINE_STATE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsSubmachineState() <em>Is Submachine State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSubmachineState()
	 * @generated
	 * @ordered
	 */
	protected boolean isSubmachineState = IS_SUBMACHINE_STATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSubmachine() <em>Submachine</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubmachine()
	 * @generated
	 * @ordered
	 */
	protected StateMachine submachine;

	/**
	 * The cached value of the '{@link #getConnection() <em>Connection</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnection()
	 * @generated
	 * @ordered
	 */
	protected EList<ConnectionPointReference> connection;

	/**
	 * The cached value of the '{@link #getRedefinedState() <em>Redefined State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinedState()
	 * @generated
	 * @ordered
	 */
	protected State redefinedState;

	/**
	 * The cached value of the '{@link #getDeferrableTrigger() <em>Deferrable Trigger</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeferrableTrigger()
	 * @generated
	 * @ordered
	 */
	protected EList<Trigger> deferrableTrigger;

	/**
	 * The cached value of the '{@link #getRegion() <em>Region</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegion()
	 * @generated
	 * @ordered
	 */
	protected EList<Region> region;

	/**
	 * The cached value of the '{@link #getEntry() <em>Entry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntry()
	 * @generated
	 * @ordered
	 */
	protected Activity entry;

	/**
	 * The cached value of the '{@link #getExit() <em>Exit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExit()
	 * @generated
	 * @ordered
	 */
	protected Activity exit;

	/**
	 * The cached value of the '{@link #getDoActivity() <em>Do Activity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoActivity()
	 * @generated
	 * @ordered
	 */
	protected Activity doActivity;

	/**
	 * The cached value of the '{@link #getStateInvariant() <em>State Invariant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateInvariant()
	 * @generated
	 * @ordered
	 */
	protected Constraint stateInvariant;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UML2Package.eINSTANCE.getState();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Classifier> getRedefinitionContext() {
		if (redefinitionContext == null) {
			redefinitionContext = new EObjectResolvingEList<Classifier>(Classifier.class, this, UML2Package.STATE__REDEFINITION_CONTEXT);
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
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.STATE__IS_LEAF, oldIsLeaf, isLeaf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Region getContainer() {
		if (eContainerFeatureID() != UML2Package.STATE__CONTAINER) return null;
		return (Region)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainer(Region newContainer, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newContainer, UML2Package.STATE__CONTAINER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainer(Region newContainer) {
		if (newContainer != eInternalContainer() || (eContainerFeatureID() != UML2Package.STATE__CONTAINER && newContainer != null)) {
			if (EcoreUtil.isAncestor(this, newContainer))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContainer != null)
				msgs = ((InternalEObject)newContainer).eInverseAdd(this, UML2Package.REGION__SUBVERTEX, Region.class, msgs);
			msgs = basicSetContainer(newContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.STATE__CONTAINER, newContainer, newContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getOutgoing() {
		if (outgoing == null) {
			outgoing = new EObjectWithInverseResolvingEList<Transition>(Transition.class, this, UML2Package.STATE__OUTGOING, UML2Package.TRANSITION__SOURCE);
		}
		return outgoing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getIncoming() {
		if (incoming == null) {
			incoming = new EObjectWithInverseResolvingEList<Transition>(Transition.class, this, UML2Package.STATE__INCOMING, UML2Package.TRANSITION__TARGET);
		}
		return incoming;
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
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.STATE__IS_COMPOSITE, oldIsComposite, isComposite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsOrthogonal() {
		return isOrthogonal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsOrthogonal(boolean newIsOrthogonal) {
		boolean oldIsOrthogonal = isOrthogonal;
		isOrthogonal = newIsOrthogonal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.STATE__IS_ORTHOGONAL, oldIsOrthogonal, isOrthogonal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsSimple() {
		return isSimple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsSimple(boolean newIsSimple) {
		boolean oldIsSimple = isSimple;
		isSimple = newIsSimple;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.STATE__IS_SIMPLE, oldIsSimple, isSimple));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsSubmachineState() {
		return isSubmachineState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsSubmachineState(boolean newIsSubmachineState) {
		boolean oldIsSubmachineState = isSubmachineState;
		isSubmachineState = newIsSubmachineState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.STATE__IS_SUBMACHINE_STATE, oldIsSubmachineState, isSubmachineState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachine getSubmachine() {
		if (submachine != null && submachine.eIsProxy()) {
			InternalEObject oldSubmachine = (InternalEObject)submachine;
			submachine = (StateMachine)eResolveProxy(oldSubmachine);
			if (submachine != oldSubmachine) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2Package.STATE__SUBMACHINE, oldSubmachine, submachine));
			}
		}
		return submachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachine basicGetSubmachine() {
		return submachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubmachine(StateMachine newSubmachine) {
		StateMachine oldSubmachine = submachine;
		submachine = newSubmachine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.STATE__SUBMACHINE, oldSubmachine, submachine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConnectionPointReference> getConnection() {
		if (connection == null) {
			connection = new EObjectContainmentEList<ConnectionPointReference>(ConnectionPointReference.class, this, UML2Package.STATE__CONNECTION);
		}
		return connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getRedefinedState() {
		if (redefinedState != null && redefinedState.eIsProxy()) {
			InternalEObject oldRedefinedState = (InternalEObject)redefinedState;
			redefinedState = (State)eResolveProxy(oldRedefinedState);
			if (redefinedState != oldRedefinedState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2Package.STATE__REDEFINED_STATE, oldRedefinedState, redefinedState));
			}
		}
		return redefinedState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetRedefinedState() {
		return redefinedState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRedefinedState(State newRedefinedState) {
		State oldRedefinedState = redefinedState;
		redefinedState = newRedefinedState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.STATE__REDEFINED_STATE, oldRedefinedState, redefinedState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Trigger> getDeferrableTrigger() {
		if (deferrableTrigger == null) {
			deferrableTrigger = new EObjectResolvingEList<Trigger>(Trigger.class, this, UML2Package.STATE__DEFERRABLE_TRIGGER);
		}
		return deferrableTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Region> getRegion() {
		if (region == null) {
			region = new EObjectContainmentWithInverseEList<Region>(Region.class, this, UML2Package.STATE__REGION, UML2Package.REGION__STATE);
		}
		return region;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity getEntry() {
		return entry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEntry(Activity newEntry, NotificationChain msgs) {
		Activity oldEntry = entry;
		entry = newEntry;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UML2Package.STATE__ENTRY, oldEntry, newEntry);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntry(Activity newEntry) {
		if (newEntry != entry) {
			NotificationChain msgs = null;
			if (entry != null)
				msgs = ((InternalEObject)entry).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.STATE__ENTRY, null, msgs);
			if (newEntry != null)
				msgs = ((InternalEObject)newEntry).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UML2Package.STATE__ENTRY, null, msgs);
			msgs = basicSetEntry(newEntry, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.STATE__ENTRY, newEntry, newEntry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity getExit() {
		return exit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExit(Activity newExit, NotificationChain msgs) {
		Activity oldExit = exit;
		exit = newExit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UML2Package.STATE__EXIT, oldExit, newExit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExit(Activity newExit) {
		if (newExit != exit) {
			NotificationChain msgs = null;
			if (exit != null)
				msgs = ((InternalEObject)exit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.STATE__EXIT, null, msgs);
			if (newExit != null)
				msgs = ((InternalEObject)newExit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UML2Package.STATE__EXIT, null, msgs);
			msgs = basicSetExit(newExit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.STATE__EXIT, newExit, newExit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity getDoActivity() {
		return doActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDoActivity(Activity newDoActivity, NotificationChain msgs) {
		Activity oldDoActivity = doActivity;
		doActivity = newDoActivity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UML2Package.STATE__DO_ACTIVITY, oldDoActivity, newDoActivity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDoActivity(Activity newDoActivity) {
		if (newDoActivity != doActivity) {
			NotificationChain msgs = null;
			if (doActivity != null)
				msgs = ((InternalEObject)doActivity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.STATE__DO_ACTIVITY, null, msgs);
			if (newDoActivity != null)
				msgs = ((InternalEObject)newDoActivity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UML2Package.STATE__DO_ACTIVITY, null, msgs);
			msgs = basicSetDoActivity(newDoActivity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.STATE__DO_ACTIVITY, newDoActivity, newDoActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint getStateInvariant() {
		return stateInvariant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStateInvariant(Constraint newStateInvariant, NotificationChain msgs) {
		Constraint oldStateInvariant = stateInvariant;
		stateInvariant = newStateInvariant;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UML2Package.STATE__STATE_INVARIANT, oldStateInvariant, newStateInvariant);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStateInvariant(Constraint newStateInvariant) {
		if (newStateInvariant != stateInvariant) {
			NotificationChain msgs = null;
			if (stateInvariant != null)
				msgs = ((InternalEObject)stateInvariant).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.STATE__STATE_INVARIANT, null, msgs);
			if (newStateInvariant != null)
				msgs = ((InternalEObject)newStateInvariant).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UML2Package.STATE__STATE_INVARIANT, null, msgs);
			msgs = basicSetStateInvariant(newStateInvariant, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.STATE__STATE_INVARIANT, newStateInvariant, newStateInvariant));
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
			case UML2Package.STATE__CONTAINER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetContainer((Region)otherEnd, msgs);
			case UML2Package.STATE__OUTGOING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoing()).basicAdd(otherEnd, msgs);
			case UML2Package.STATE__INCOMING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncoming()).basicAdd(otherEnd, msgs);
			case UML2Package.STATE__REGION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRegion()).basicAdd(otherEnd, msgs);
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
			case UML2Package.STATE__CONTAINER:
				return basicSetContainer(null, msgs);
			case UML2Package.STATE__OUTGOING:
				return ((InternalEList<?>)getOutgoing()).basicRemove(otherEnd, msgs);
			case UML2Package.STATE__INCOMING:
				return ((InternalEList<?>)getIncoming()).basicRemove(otherEnd, msgs);
			case UML2Package.STATE__CONNECTION:
				return ((InternalEList<?>)getConnection()).basicRemove(otherEnd, msgs);
			case UML2Package.STATE__REGION:
				return ((InternalEList<?>)getRegion()).basicRemove(otherEnd, msgs);
			case UML2Package.STATE__ENTRY:
				return basicSetEntry(null, msgs);
			case UML2Package.STATE__EXIT:
				return basicSetExit(null, msgs);
			case UML2Package.STATE__DO_ACTIVITY:
				return basicSetDoActivity(null, msgs);
			case UML2Package.STATE__STATE_INVARIANT:
				return basicSetStateInvariant(null, msgs);
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
			case UML2Package.STATE__CONTAINER:
				return eInternalContainer().eInverseRemove(this, UML2Package.REGION__SUBVERTEX, Region.class, msgs);
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
			case UML2Package.STATE__REDEFINITION_CONTEXT:
				return getRedefinitionContext();
			case UML2Package.STATE__IS_LEAF:
				return isIsLeaf();
			case UML2Package.STATE__CONTAINER:
				return getContainer();
			case UML2Package.STATE__OUTGOING:
				return getOutgoing();
			case UML2Package.STATE__INCOMING:
				return getIncoming();
			case UML2Package.STATE__IS_COMPOSITE:
				return isIsComposite();
			case UML2Package.STATE__IS_ORTHOGONAL:
				return isIsOrthogonal();
			case UML2Package.STATE__IS_SIMPLE:
				return isIsSimple();
			case UML2Package.STATE__IS_SUBMACHINE_STATE:
				return isIsSubmachineState();
			case UML2Package.STATE__SUBMACHINE:
				if (resolve) return getSubmachine();
				return basicGetSubmachine();
			case UML2Package.STATE__CONNECTION:
				return getConnection();
			case UML2Package.STATE__REDEFINED_STATE:
				if (resolve) return getRedefinedState();
				return basicGetRedefinedState();
			case UML2Package.STATE__DEFERRABLE_TRIGGER:
				return getDeferrableTrigger();
			case UML2Package.STATE__REGION:
				return getRegion();
			case UML2Package.STATE__ENTRY:
				return getEntry();
			case UML2Package.STATE__EXIT:
				return getExit();
			case UML2Package.STATE__DO_ACTIVITY:
				return getDoActivity();
			case UML2Package.STATE__STATE_INVARIANT:
				return getStateInvariant();
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
			case UML2Package.STATE__REDEFINITION_CONTEXT:
				getRedefinitionContext().clear();
				getRedefinitionContext().addAll((Collection<? extends Classifier>)newValue);
				return;
			case UML2Package.STATE__IS_LEAF:
				setIsLeaf((Boolean)newValue);
				return;
			case UML2Package.STATE__CONTAINER:
				setContainer((Region)newValue);
				return;
			case UML2Package.STATE__OUTGOING:
				getOutgoing().clear();
				getOutgoing().addAll((Collection<? extends Transition>)newValue);
				return;
			case UML2Package.STATE__INCOMING:
				getIncoming().clear();
				getIncoming().addAll((Collection<? extends Transition>)newValue);
				return;
			case UML2Package.STATE__IS_COMPOSITE:
				setIsComposite((Boolean)newValue);
				return;
			case UML2Package.STATE__IS_ORTHOGONAL:
				setIsOrthogonal((Boolean)newValue);
				return;
			case UML2Package.STATE__IS_SIMPLE:
				setIsSimple((Boolean)newValue);
				return;
			case UML2Package.STATE__IS_SUBMACHINE_STATE:
				setIsSubmachineState((Boolean)newValue);
				return;
			case UML2Package.STATE__SUBMACHINE:
				setSubmachine((StateMachine)newValue);
				return;
			case UML2Package.STATE__CONNECTION:
				getConnection().clear();
				getConnection().addAll((Collection<? extends ConnectionPointReference>)newValue);
				return;
			case UML2Package.STATE__REDEFINED_STATE:
				setRedefinedState((State)newValue);
				return;
			case UML2Package.STATE__DEFERRABLE_TRIGGER:
				getDeferrableTrigger().clear();
				getDeferrableTrigger().addAll((Collection<? extends Trigger>)newValue);
				return;
			case UML2Package.STATE__REGION:
				getRegion().clear();
				getRegion().addAll((Collection<? extends Region>)newValue);
				return;
			case UML2Package.STATE__ENTRY:
				setEntry((Activity)newValue);
				return;
			case UML2Package.STATE__EXIT:
				setExit((Activity)newValue);
				return;
			case UML2Package.STATE__DO_ACTIVITY:
				setDoActivity((Activity)newValue);
				return;
			case UML2Package.STATE__STATE_INVARIANT:
				setStateInvariant((Constraint)newValue);
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
			case UML2Package.STATE__REDEFINITION_CONTEXT:
				getRedefinitionContext().clear();
				return;
			case UML2Package.STATE__IS_LEAF:
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UML2Package.STATE__CONTAINER:
				setContainer((Region)null);
				return;
			case UML2Package.STATE__OUTGOING:
				getOutgoing().clear();
				return;
			case UML2Package.STATE__INCOMING:
				getIncoming().clear();
				return;
			case UML2Package.STATE__IS_COMPOSITE:
				setIsComposite(IS_COMPOSITE_EDEFAULT);
				return;
			case UML2Package.STATE__IS_ORTHOGONAL:
				setIsOrthogonal(IS_ORTHOGONAL_EDEFAULT);
				return;
			case UML2Package.STATE__IS_SIMPLE:
				setIsSimple(IS_SIMPLE_EDEFAULT);
				return;
			case UML2Package.STATE__IS_SUBMACHINE_STATE:
				setIsSubmachineState(IS_SUBMACHINE_STATE_EDEFAULT);
				return;
			case UML2Package.STATE__SUBMACHINE:
				setSubmachine((StateMachine)null);
				return;
			case UML2Package.STATE__CONNECTION:
				getConnection().clear();
				return;
			case UML2Package.STATE__REDEFINED_STATE:
				setRedefinedState((State)null);
				return;
			case UML2Package.STATE__DEFERRABLE_TRIGGER:
				getDeferrableTrigger().clear();
				return;
			case UML2Package.STATE__REGION:
				getRegion().clear();
				return;
			case UML2Package.STATE__ENTRY:
				setEntry((Activity)null);
				return;
			case UML2Package.STATE__EXIT:
				setExit((Activity)null);
				return;
			case UML2Package.STATE__DO_ACTIVITY:
				setDoActivity((Activity)null);
				return;
			case UML2Package.STATE__STATE_INVARIANT:
				setStateInvariant((Constraint)null);
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
			case UML2Package.STATE__REDEFINITION_CONTEXT:
				return redefinitionContext != null && !redefinitionContext.isEmpty();
			case UML2Package.STATE__IS_LEAF:
				return isLeaf != IS_LEAF_EDEFAULT;
			case UML2Package.STATE__CONTAINER:
				return getContainer() != null;
			case UML2Package.STATE__OUTGOING:
				return outgoing != null && !outgoing.isEmpty();
			case UML2Package.STATE__INCOMING:
				return incoming != null && !incoming.isEmpty();
			case UML2Package.STATE__IS_COMPOSITE:
				return isComposite != IS_COMPOSITE_EDEFAULT;
			case UML2Package.STATE__IS_ORTHOGONAL:
				return isOrthogonal != IS_ORTHOGONAL_EDEFAULT;
			case UML2Package.STATE__IS_SIMPLE:
				return isSimple != IS_SIMPLE_EDEFAULT;
			case UML2Package.STATE__IS_SUBMACHINE_STATE:
				return isSubmachineState != IS_SUBMACHINE_STATE_EDEFAULT;
			case UML2Package.STATE__SUBMACHINE:
				return submachine != null;
			case UML2Package.STATE__CONNECTION:
				return connection != null && !connection.isEmpty();
			case UML2Package.STATE__REDEFINED_STATE:
				return redefinedState != null;
			case UML2Package.STATE__DEFERRABLE_TRIGGER:
				return deferrableTrigger != null && !deferrableTrigger.isEmpty();
			case UML2Package.STATE__REGION:
				return region != null && !region.isEmpty();
			case UML2Package.STATE__ENTRY:
				return entry != null;
			case UML2Package.STATE__EXIT:
				return exit != null;
			case UML2Package.STATE__DO_ACTIVITY:
				return doActivity != null;
			case UML2Package.STATE__STATE_INVARIANT:
				return stateInvariant != null;
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
				case UML2Package.STATE__REDEFINITION_CONTEXT: return UML2Package.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT;
				case UML2Package.STATE__IS_LEAF: return UML2Package.REDEFINABLE_ELEMENT__IS_LEAF;
				default: return -1;
			}
		}
		if (baseClass == Vertex.class) {
			switch (derivedFeatureID) {
				case UML2Package.STATE__CONTAINER: return UML2Package.VERTEX__CONTAINER;
				case UML2Package.STATE__OUTGOING: return UML2Package.VERTEX__OUTGOING;
				case UML2Package.STATE__INCOMING: return UML2Package.VERTEX__INCOMING;
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
				case UML2Package.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT: return UML2Package.STATE__REDEFINITION_CONTEXT;
				case UML2Package.REDEFINABLE_ELEMENT__IS_LEAF: return UML2Package.STATE__IS_LEAF;
				default: return -1;
			}
		}
		if (baseClass == Vertex.class) {
			switch (baseFeatureID) {
				case UML2Package.VERTEX__CONTAINER: return UML2Package.STATE__CONTAINER;
				case UML2Package.VERTEX__OUTGOING: return UML2Package.STATE__OUTGOING;
				case UML2Package.VERTEX__INCOMING: return UML2Package.STATE__INCOMING;
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
		result.append(", isComposite: ");
		result.append(isComposite);
		result.append(", isOrthogonal: ");
		result.append(isOrthogonal);
		result.append(", isSimple: ");
		result.append(isSimple);
		result.append(", isSubmachineState: ");
		result.append(isSubmachineState);
		result.append(')');
		return result.toString();
	}

} //StateImpl

/**
 */
package org.csu.slicing.UML2.impl;

import org.csu.slicing.UML2.Abstraction;
import org.csu.slicing.UML2.AcceptCallAction;
import org.csu.slicing.UML2.AcceptEventAction;
import org.csu.slicing.UML2.Action;
import org.csu.slicing.UML2.Activity;
import org.csu.slicing.UML2.ActivityFinalNode;
import org.csu.slicing.UML2.ActivityParameterNode;
import org.csu.slicing.UML2.ActivityPartition;
import org.csu.slicing.UML2.Actor;
import org.csu.slicing.UML2.AddStructuralFeatureValueAction;
import org.csu.slicing.UML2.AddVariableValueAction;
import org.csu.slicing.UML2.AggregationKind;
import org.csu.slicing.UML2.AnyTrigger;
import org.csu.slicing.UML2.ApplyFunctionAction;
import org.csu.slicing.UML2.Artifact;
import org.csu.slicing.UML2.Association;
import org.csu.slicing.UML2.AssociationClass;
import org.csu.slicing.UML2.BroadcastSignalAction;
import org.csu.slicing.UML2.CallBehaviorAction;
import org.csu.slicing.UML2.CallConcurrencyKind;
import org.csu.slicing.UML2.CallOperationAction;
import org.csu.slicing.UML2.CallTrigger;
import org.csu.slicing.UML2.CentralBufferNode;
import org.csu.slicing.UML2.ChangeTrigger;
import org.csu.slicing.UML2.ClassifierTemplateParameter;
import org.csu.slicing.UML2.Clause;
import org.csu.slicing.UML2.ClearAssociationAction;
import org.csu.slicing.UML2.ClearStructuralFeatureAction;
import org.csu.slicing.UML2.ClearVariableAction;
import org.csu.slicing.UML2.Collaboration;
import org.csu.slicing.UML2.CollaborationOccurrence;
import org.csu.slicing.UML2.CombinedFragment;
import org.csu.slicing.UML2.Comment;
import org.csu.slicing.UML2.CommunicationPath;
import org.csu.slicing.UML2.Component;
import org.csu.slicing.UML2.ConditionalNode;
import org.csu.slicing.UML2.ConnectableElementTemplateParameter;
import org.csu.slicing.UML2.ConnectionPointReference;
import org.csu.slicing.UML2.Connector;
import org.csu.slicing.UML2.ConnectorEnd;
import org.csu.slicing.UML2.ConnectorKind;
import org.csu.slicing.UML2.Constraint;
import org.csu.slicing.UML2.Continuation;
import org.csu.slicing.UML2.ControlFlow;
import org.csu.slicing.UML2.CreateLinkAction;
import org.csu.slicing.UML2.CreateLinkObjectAction;
import org.csu.slicing.UML2.CreateObjectAction;
import org.csu.slicing.UML2.DataStoreNode;
import org.csu.slicing.UML2.DataType;
import org.csu.slicing.UML2.DecisionNode;
import org.csu.slicing.UML2.Dependency;
import org.csu.slicing.UML2.Deployment;
import org.csu.slicing.UML2.DeploymentSpecification;
import org.csu.slicing.UML2.DestroyLinkAction;
import org.csu.slicing.UML2.DestroyObjectAction;
import org.csu.slicing.UML2.Device;
import org.csu.slicing.UML2.Duration;
import org.csu.slicing.UML2.DurationConstraint;
import org.csu.slicing.UML2.DurationInterval;
import org.csu.slicing.UML2.DurationObservationAction;
import org.csu.slicing.UML2.ElementImport;
import org.csu.slicing.UML2.Enumeration;
import org.csu.slicing.UML2.EnumerationLiteral;
import org.csu.slicing.UML2.EventOccurrence;
import org.csu.slicing.UML2.ExceptionHandler;
import org.csu.slicing.UML2.ExecutionEnvironment;
import org.csu.slicing.UML2.ExecutionOccurrence;
import org.csu.slicing.UML2.ExpansionKind;
import org.csu.slicing.UML2.ExpansionNode;
import org.csu.slicing.UML2.ExpansionRegion;
import org.csu.slicing.UML2.Expression;
import org.csu.slicing.UML2.Extend;
import org.csu.slicing.UML2.Extension;
import org.csu.slicing.UML2.ExtensionEnd;
import org.csu.slicing.UML2.ExtensionPoint;
import org.csu.slicing.UML2.FinalState;
import org.csu.slicing.UML2.FlowFinalNode;
import org.csu.slicing.UML2.ForkNode;
import org.csu.slicing.UML2.Gate;
import org.csu.slicing.UML2.GeneralOrdering;
import org.csu.slicing.UML2.Generalization;
import org.csu.slicing.UML2.GeneralizationSet;
import org.csu.slicing.UML2.Implementation;
import org.csu.slicing.UML2.Include;
import org.csu.slicing.UML2.InformationFlow;
import org.csu.slicing.UML2.InformationItem;
import org.csu.slicing.UML2.InitialNode;
import org.csu.slicing.UML2.InputPin;
import org.csu.slicing.UML2.InstanceSpecification;
import org.csu.slicing.UML2.InstanceValue;
import org.csu.slicing.UML2.Interaction;
import org.csu.slicing.UML2.InteractionConstraint;
import org.csu.slicing.UML2.InteractionOccurrence;
import org.csu.slicing.UML2.InteractionOperand;
import org.csu.slicing.UML2.InteractionOperator;
import org.csu.slicing.UML2.Interface;
import org.csu.slicing.UML2.InterruptibleActivityRegion;
import org.csu.slicing.UML2.Interval;
import org.csu.slicing.UML2.IntervalConstraint;
import org.csu.slicing.UML2.JoinNode;
import org.csu.slicing.UML2.Lifeline;
import org.csu.slicing.UML2.LinkEndCreationData;
import org.csu.slicing.UML2.LinkEndData;
import org.csu.slicing.UML2.LiteralBoolean;
import org.csu.slicing.UML2.LiteralInteger;
import org.csu.slicing.UML2.LiteralNull;
import org.csu.slicing.UML2.LiteralString;
import org.csu.slicing.UML2.LiteralUnlimitedNatural;
import org.csu.slicing.UML2.LoopNode;
import org.csu.slicing.UML2.Manifestation;
import org.csu.slicing.UML2.MergeNode;
import org.csu.slicing.UML2.Message;
import org.csu.slicing.UML2.MessageKind;
import org.csu.slicing.UML2.MessageSort;
import org.csu.slicing.UML2.Model;
import org.csu.slicing.UML2.Node;
import org.csu.slicing.UML2.ObjectFlow;
import org.csu.slicing.UML2.ObjectNodeOrderingKind;
import org.csu.slicing.UML2.OpaqueExpression;
import org.csu.slicing.UML2.Operation;
import org.csu.slicing.UML2.OperationTemplateParameter;
import org.csu.slicing.UML2.OutputPin;
import org.csu.slicing.UML2.PackageImport;
import org.csu.slicing.UML2.PackageMerge;
import org.csu.slicing.UML2.Parameter;
import org.csu.slicing.UML2.ParameterDirectionKind;
import org.csu.slicing.UML2.ParameterEffectKind;
import org.csu.slicing.UML2.ParameterSet;
import org.csu.slicing.UML2.PartDecomposition;
import org.csu.slicing.UML2.Permission;
import org.csu.slicing.UML2.Port;
import org.csu.slicing.UML2.PrimitiveFunction;
import org.csu.slicing.UML2.PrimitiveType;
import org.csu.slicing.UML2.Profile;
import org.csu.slicing.UML2.ProfileApplication;
import org.csu.slicing.UML2.Property;
import org.csu.slicing.UML2.ProtocolConformance;
import org.csu.slicing.UML2.ProtocolStateMachine;
import org.csu.slicing.UML2.ProtocolTransition;
import org.csu.slicing.UML2.Pseudostate;
import org.csu.slicing.UML2.PseudostateKind;
import org.csu.slicing.UML2.QualifierValue;
import org.csu.slicing.UML2.RaiseExceptionAction;
import org.csu.slicing.UML2.ReadExtentAction;
import org.csu.slicing.UML2.ReadIsClassifiedObjectAction;
import org.csu.slicing.UML2.ReadLinkAction;
import org.csu.slicing.UML2.ReadLinkObjectEndAction;
import org.csu.slicing.UML2.ReadLinkObjectEndQualifierAction;
import org.csu.slicing.UML2.ReadSelfAction;
import org.csu.slicing.UML2.ReadStructuralFeatureAction;
import org.csu.slicing.UML2.ReadVariableAction;
import org.csu.slicing.UML2.Realization;
import org.csu.slicing.UML2.Reception;
import org.csu.slicing.UML2.ReclassifyObjectAction;
import org.csu.slicing.UML2.RedefinableTemplateSignature;
import org.csu.slicing.UML2.Region;
import org.csu.slicing.UML2.RemoveStructuralFeatureValueAction;
import org.csu.slicing.UML2.RemoveVariableValueAction;
import org.csu.slicing.UML2.ReplyAction;
import org.csu.slicing.UML2.SendObjectAction;
import org.csu.slicing.UML2.SendSignalAction;
import org.csu.slicing.UML2.Signal;
import org.csu.slicing.UML2.SignalTrigger;
import org.csu.slicing.UML2.Slot;
import org.csu.slicing.UML2.StartOwnedBehaviorAction;
import org.csu.slicing.UML2.State;
import org.csu.slicing.UML2.StateInvariant;
import org.csu.slicing.UML2.StateMachine;
import org.csu.slicing.UML2.Stereotype;
import org.csu.slicing.UML2.Stop;
import org.csu.slicing.UML2.StringExpression;
import org.csu.slicing.UML2.StructuredActivityNode;
import org.csu.slicing.UML2.Substitution;
import org.csu.slicing.UML2.TemplateBinding;
import org.csu.slicing.UML2.TemplateParameter;
import org.csu.slicing.UML2.TemplateParameterSubstitution;
import org.csu.slicing.UML2.TemplateSignature;
import org.csu.slicing.UML2.TestIdentityAction;
import org.csu.slicing.UML2.TimeConstraint;
import org.csu.slicing.UML2.TimeExpression;
import org.csu.slicing.UML2.TimeInterval;
import org.csu.slicing.UML2.TimeObservationAction;
import org.csu.slicing.UML2.TimeTrigger;
import org.csu.slicing.UML2.Transition;
import org.csu.slicing.UML2.TransitionKind;
import org.csu.slicing.UML2.UML2Factory;
import org.csu.slicing.UML2.UML2Package;
import org.csu.slicing.UML2.Usage;
import org.csu.slicing.UML2.UseCase;
import org.csu.slicing.UML2.ValuePin;
import org.csu.slicing.UML2.Variable;
import org.csu.slicing.UML2.VisibilityKind;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UML2FactoryImpl extends EFactoryImpl implements UML2Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UML2Factory init() {
		try {
			UML2Factory theUML2Factory = (UML2Factory)EPackage.Registry.INSTANCE.getEFactory("http:///UML2.ecore"); 
			if (theUML2Factory != null) {
				return theUML2Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UML2FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UML2FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case UML2Package.OPAQUE_EXPRESSION: return createOpaqueExpression();
			case UML2Package.EXPRESSION: return createExpression();
			case UML2Package.COMMENT: return createComment();
			case UML2Package.CLASS: return createClass();
			case UML2Package.PROPERTY: return createProperty();
			case UML2Package.OPERATION: return createOperation();
			case UML2Package.PARAMETER: return createParameter();
			case UML2Package.PACKAGE: return createPackage();
			case UML2Package.ENUMERATION: return createEnumeration();
			case UML2Package.DATA_TYPE: return createDataType();
			case UML2Package.ENUMERATION_LITERAL: return createEnumerationLiteral();
			case UML2Package.PRIMITIVE_TYPE: return createPrimitiveType();
			case UML2Package.CONSTRAINT: return createConstraint();
			case UML2Package.LITERAL_BOOLEAN: return createLiteralBoolean();
			case UML2Package.LITERAL_STRING: return createLiteralString();
			case UML2Package.LITERAL_NULL: return createLiteralNull();
			case UML2Package.LITERAL_INTEGER: return createLiteralInteger();
			case UML2Package.LITERAL_UNLIMITED_NATURAL: return createLiteralUnlimitedNatural();
			case UML2Package.INSTANCE_SPECIFICATION: return createInstanceSpecification();
			case UML2Package.SLOT: return createSlot();
			case UML2Package.INSTANCE_VALUE: return createInstanceValue();
			case UML2Package.GENERALIZATION: return createGeneralization();
			case UML2Package.ELEMENT_IMPORT: return createElementImport();
			case UML2Package.PACKAGE_IMPORT: return createPackageImport();
			case UML2Package.ASSOCIATION: return createAssociation();
			case UML2Package.PACKAGE_MERGE: return createPackageMerge();
			case UML2Package.STEREOTYPE: return createStereotype();
			case UML2Package.PROFILE: return createProfile();
			case UML2Package.PROFILE_APPLICATION: return createProfileApplication();
			case UML2Package.EXTENSION: return createExtension();
			case UML2Package.EXTENSION_END: return createExtensionEnd();
			case UML2Package.ACTIVITY: return createActivity();
			case UML2Package.PERMISSION: return createPermission();
			case UML2Package.DEPENDENCY: return createDependency();
			case UML2Package.USAGE: return createUsage();
			case UML2Package.ABSTRACTION: return createAbstraction();
			case UML2Package.REALIZATION: return createRealization();
			case UML2Package.SUBSTITUTION: return createSubstitution();
			case UML2Package.GENERALIZATION_SET: return createGeneralizationSet();
			case UML2Package.ASSOCIATION_CLASS: return createAssociationClass();
			case UML2Package.INFORMATION_ITEM: return createInformationItem();
			case UML2Package.INFORMATION_FLOW: return createInformationFlow();
			case UML2Package.MODEL: return createModel();
			case UML2Package.CONNECTOR_END: return createConnectorEnd();
			case UML2Package.CONNECTOR: return createConnector();
			case UML2Package.ACTION: return createAction();
			case UML2Package.CONTROL_FLOW: return createControlFlow();
			case UML2Package.OBJECT_FLOW: return createObjectFlow();
			case UML2Package.INITIAL_NODE: return createInitialNode();
			case UML2Package.ACTIVITY_FINAL_NODE: return createActivityFinalNode();
			case UML2Package.DECISION_NODE: return createDecisionNode();
			case UML2Package.MERGE_NODE: return createMergeNode();
			case UML2Package.OUTPUT_PIN: return createOutputPin();
			case UML2Package.INPUT_PIN: return createInputPin();
			case UML2Package.ACTIVITY_PARAMETER_NODE: return createActivityParameterNode();
			case UML2Package.VALUE_PIN: return createValuePin();
			case UML2Package.INTERFACE: return createInterface();
			case UML2Package.IMPLEMENTATION: return createImplementation();
			case UML2Package.ARTIFACT: return createArtifact();
			case UML2Package.MANIFESTATION: return createManifestation();
			case UML2Package.ACTOR: return createActor();
			case UML2Package.EXTEND: return createExtend();
			case UML2Package.USE_CASE: return createUseCase();
			case UML2Package.EXTENSION_POINT: return createExtensionPoint();
			case UML2Package.INCLUDE: return createInclude();
			case UML2Package.COLLABORATION_OCCURRENCE: return createCollaborationOccurrence();
			case UML2Package.COLLABORATION: return createCollaboration();
			case UML2Package.PORT: return createPort();
			case UML2Package.CALL_TRIGGER: return createCallTrigger();
			case UML2Package.CHANGE_TRIGGER: return createChangeTrigger();
			case UML2Package.RECEPTION: return createReception();
			case UML2Package.SIGNAL: return createSignal();
			case UML2Package.SIGNAL_TRIGGER: return createSignalTrigger();
			case UML2Package.TIME_TRIGGER: return createTimeTrigger();
			case UML2Package.ANY_TRIGGER: return createAnyTrigger();
			case UML2Package.VARIABLE: return createVariable();
			case UML2Package.STRUCTURED_ACTIVITY_NODE: return createStructuredActivityNode();
			case UML2Package.CONDITIONAL_NODE: return createConditionalNode();
			case UML2Package.CLAUSE: return createClause();
			case UML2Package.LOOP_NODE: return createLoopNode();
			case UML2Package.INTERACTION: return createInteraction();
			case UML2Package.LIFELINE: return createLifeline();
			case UML2Package.MESSAGE: return createMessage();
			case UML2Package.GENERAL_ORDERING: return createGeneralOrdering();
			case UML2Package.EVENT_OCCURRENCE: return createEventOccurrence();
			case UML2Package.EXECUTION_OCCURRENCE: return createExecutionOccurrence();
			case UML2Package.STATE_INVARIANT: return createStateInvariant();
			case UML2Package.STOP: return createStop();
			case UML2Package.TEMPLATE_SIGNATURE: return createTemplateSignature();
			case UML2Package.TEMPLATE_PARAMETER: return createTemplateParameter();
			case UML2Package.STRING_EXPRESSION: return createStringExpression();
			case UML2Package.TEMPLATE_BINDING: return createTemplateBinding();
			case UML2Package.TEMPLATE_PARAMETER_SUBSTITUTION: return createTemplateParameterSubstitution();
			case UML2Package.OPERATION_TEMPLATE_PARAMETER: return createOperationTemplateParameter();
			case UML2Package.CLASSIFIER_TEMPLATE_PARAMETER: return createClassifierTemplateParameter();
			case UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE: return createRedefinableTemplateSignature();
			case UML2Package.CONNECTABLE_ELEMENT_TEMPLATE_PARAMETER: return createConnectableElementTemplateParameter();
			case UML2Package.FORK_NODE: return createForkNode();
			case UML2Package.JOIN_NODE: return createJoinNode();
			case UML2Package.FLOW_FINAL_NODE: return createFlowFinalNode();
			case UML2Package.CENTRAL_BUFFER_NODE: return createCentralBufferNode();
			case UML2Package.ACTIVITY_PARTITION: return createActivityPartition();
			case UML2Package.EXPANSION_NODE: return createExpansionNode();
			case UML2Package.EXPANSION_REGION: return createExpansionRegion();
			case UML2Package.EXCEPTION_HANDLER: return createExceptionHandler();
			case UML2Package.INTERACTION_OCCURRENCE: return createInteractionOccurrence();
			case UML2Package.GATE: return createGate();
			case UML2Package.PART_DECOMPOSITION: return createPartDecomposition();
			case UML2Package.INTERACTION_OPERAND: return createInteractionOperand();
			case UML2Package.INTERACTION_CONSTRAINT: return createInteractionConstraint();
			case UML2Package.COMBINED_FRAGMENT: return createCombinedFragment();
			case UML2Package.CONTINUATION: return createContinuation();
			case UML2Package.STATE_MACHINE: return createStateMachine();
			case UML2Package.REGION: return createRegion();
			case UML2Package.PSEUDOSTATE: return createPseudostate();
			case UML2Package.STATE: return createState();
			case UML2Package.CONNECTION_POINT_REFERENCE: return createConnectionPointReference();
			case UML2Package.TRANSITION: return createTransition();
			case UML2Package.FINAL_STATE: return createFinalState();
			case UML2Package.CREATE_OBJECT_ACTION: return createCreateObjectAction();
			case UML2Package.DESTROY_OBJECT_ACTION: return createDestroyObjectAction();
			case UML2Package.TEST_IDENTITY_ACTION: return createTestIdentityAction();
			case UML2Package.READ_SELF_ACTION: return createReadSelfAction();
			case UML2Package.READ_STRUCTURAL_FEATURE_ACTION: return createReadStructuralFeatureAction();
			case UML2Package.CLEAR_STRUCTURAL_FEATURE_ACTION: return createClearStructuralFeatureAction();
			case UML2Package.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION: return createRemoveStructuralFeatureValueAction();
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION: return createAddStructuralFeatureValueAction();
			case UML2Package.LINK_END_DATA: return createLinkEndData();
			case UML2Package.READ_LINK_ACTION: return createReadLinkAction();
			case UML2Package.LINK_END_CREATION_DATA: return createLinkEndCreationData();
			case UML2Package.CREATE_LINK_ACTION: return createCreateLinkAction();
			case UML2Package.DESTROY_LINK_ACTION: return createDestroyLinkAction();
			case UML2Package.CLEAR_ASSOCIATION_ACTION: return createClearAssociationAction();
			case UML2Package.READ_VARIABLE_ACTION: return createReadVariableAction();
			case UML2Package.CLEAR_VARIABLE_ACTION: return createClearVariableAction();
			case UML2Package.ADD_VARIABLE_VALUE_ACTION: return createAddVariableValueAction();
			case UML2Package.REMOVE_VARIABLE_VALUE_ACTION: return createRemoveVariableValueAction();
			case UML2Package.APPLY_FUNCTION_ACTION: return createApplyFunctionAction();
			case UML2Package.PRIMITIVE_FUNCTION: return createPrimitiveFunction();
			case UML2Package.SEND_SIGNAL_ACTION: return createSendSignalAction();
			case UML2Package.BROADCAST_SIGNAL_ACTION: return createBroadcastSignalAction();
			case UML2Package.SEND_OBJECT_ACTION: return createSendObjectAction();
			case UML2Package.CALL_OPERATION_ACTION: return createCallOperationAction();
			case UML2Package.CALL_BEHAVIOR_ACTION: return createCallBehaviorAction();
			case UML2Package.TIME_EXPRESSION: return createTimeExpression();
			case UML2Package.DURATION: return createDuration();
			case UML2Package.TIME_OBSERVATION_ACTION: return createTimeObservationAction();
			case UML2Package.DURATION_INTERVAL: return createDurationInterval();
			case UML2Package.INTERVAL: return createInterval();
			case UML2Package.TIME_CONSTRAINT: return createTimeConstraint();
			case UML2Package.INTERVAL_CONSTRAINT: return createIntervalConstraint();
			case UML2Package.TIME_INTERVAL: return createTimeInterval();
			case UML2Package.DURATION_OBSERVATION_ACTION: return createDurationObservationAction();
			case UML2Package.DURATION_CONSTRAINT: return createDurationConstraint();
			case UML2Package.DATA_STORE_NODE: return createDataStoreNode();
			case UML2Package.INTERRUPTIBLE_ACTIVITY_REGION: return createInterruptibleActivityRegion();
			case UML2Package.PARAMETER_SET: return createParameterSet();
			case UML2Package.COMPONENT: return createComponent();
			case UML2Package.DEPLOYMENT: return createDeployment();
			case UML2Package.NODE: return createNode();
			case UML2Package.DEVICE: return createDevice();
			case UML2Package.EXECUTION_ENVIRONMENT: return createExecutionEnvironment();
			case UML2Package.COMMUNICATION_PATH: return createCommunicationPath();
			case UML2Package.PROTOCOL_CONFORMANCE: return createProtocolConformance();
			case UML2Package.PROTOCOL_STATE_MACHINE: return createProtocolStateMachine();
			case UML2Package.PROTOCOL_TRANSITION: return createProtocolTransition();
			case UML2Package.READ_EXTENT_ACTION: return createReadExtentAction();
			case UML2Package.RECLASSIFY_OBJECT_ACTION: return createReclassifyObjectAction();
			case UML2Package.READ_IS_CLASSIFIED_OBJECT_ACTION: return createReadIsClassifiedObjectAction();
			case UML2Package.START_OWNED_BEHAVIOR_ACTION: return createStartOwnedBehaviorAction();
			case UML2Package.QUALIFIER_VALUE: return createQualifierValue();
			case UML2Package.READ_LINK_OBJECT_END_ACTION: return createReadLinkObjectEndAction();
			case UML2Package.READ_LINK_OBJECT_END_QUALIFIER_ACTION: return createReadLinkObjectEndQualifierAction();
			case UML2Package.CREATE_LINK_OBJECT_ACTION: return createCreateLinkObjectAction();
			case UML2Package.ACCEPT_EVENT_ACTION: return createAcceptEventAction();
			case UML2Package.ACCEPT_CALL_ACTION: return createAcceptCallAction();
			case UML2Package.REPLY_ACTION: return createReplyAction();
			case UML2Package.RAISE_EXCEPTION_ACTION: return createRaiseExceptionAction();
			case UML2Package.DEPLOYMENT_SPECIFICATION: return createDeploymentSpecification();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case UML2Package.VISIBILITY_KIND:
				return createVisibilityKindFromString(eDataType, initialValue);
			case UML2Package.PARAMETER_DIRECTION_KIND:
				return createParameterDirectionKindFromString(eDataType, initialValue);
			case UML2Package.AGGREGATION_KIND:
				return createAggregationKindFromString(eDataType, initialValue);
			case UML2Package.CALL_CONCURRENCY_KIND:
				return createCallConcurrencyKindFromString(eDataType, initialValue);
			case UML2Package.MESSAGE_KIND:
				return createMessageKindFromString(eDataType, initialValue);
			case UML2Package.MESSAGE_SORT:
				return createMessageSortFromString(eDataType, initialValue);
			case UML2Package.EXPANSION_KIND:
				return createExpansionKindFromString(eDataType, initialValue);
			case UML2Package.INTERACTION_OPERATOR:
				return createInteractionOperatorFromString(eDataType, initialValue);
			case UML2Package.TRANSITION_KIND:
				return createTransitionKindFromString(eDataType, initialValue);
			case UML2Package.PSEUDOSTATE_KIND:
				return createPseudostateKindFromString(eDataType, initialValue);
			case UML2Package.PARAMETER_EFFECT_KIND:
				return createParameterEffectKindFromString(eDataType, initialValue);
			case UML2Package.OBJECT_NODE_ORDERING_KIND:
				return createObjectNodeOrderingKindFromString(eDataType, initialValue);
			case UML2Package.CONNECTOR_KIND:
				return createConnectorKindFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case UML2Package.VISIBILITY_KIND:
				return convertVisibilityKindToString(eDataType, instanceValue);
			case UML2Package.PARAMETER_DIRECTION_KIND:
				return convertParameterDirectionKindToString(eDataType, instanceValue);
			case UML2Package.AGGREGATION_KIND:
				return convertAggregationKindToString(eDataType, instanceValue);
			case UML2Package.CALL_CONCURRENCY_KIND:
				return convertCallConcurrencyKindToString(eDataType, instanceValue);
			case UML2Package.MESSAGE_KIND:
				return convertMessageKindToString(eDataType, instanceValue);
			case UML2Package.MESSAGE_SORT:
				return convertMessageSortToString(eDataType, instanceValue);
			case UML2Package.EXPANSION_KIND:
				return convertExpansionKindToString(eDataType, instanceValue);
			case UML2Package.INTERACTION_OPERATOR:
				return convertInteractionOperatorToString(eDataType, instanceValue);
			case UML2Package.TRANSITION_KIND:
				return convertTransitionKindToString(eDataType, instanceValue);
			case UML2Package.PSEUDOSTATE_KIND:
				return convertPseudostateKindToString(eDataType, instanceValue);
			case UML2Package.PARAMETER_EFFECT_KIND:
				return convertParameterEffectKindToString(eDataType, instanceValue);
			case UML2Package.OBJECT_NODE_ORDERING_KIND:
				return convertObjectNodeOrderingKindToString(eDataType, instanceValue);
			case UML2Package.CONNECTOR_KIND:
				return convertConnectorKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpaqueExpression createOpaqueExpression() {
		OpaqueExpressionImpl opaqueExpression = new OpaqueExpressionImpl();
		return opaqueExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression createExpression() {
		ExpressionImpl expression = new ExpressionImpl();
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comment createComment() {
		CommentImpl comment = new CommentImpl();
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.csu.slicing.UML2.Class createClass() {
		ClassImpl class_ = new ClassImpl();
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createProperty() {
		PropertyImpl property = new PropertyImpl();
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation createOperation() {
		OperationImpl operation = new OperationImpl();
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.csu.slicing.UML2.Package createPackage() {
		PackageImpl package_ = new PackageImpl();
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumeration createEnumeration() {
		EnumerationImpl enumeration = new EnumerationImpl();
		return enumeration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType createDataType() {
		DataTypeImpl dataType = new DataTypeImpl();
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationLiteral createEnumerationLiteral() {
		EnumerationLiteralImpl enumerationLiteral = new EnumerationLiteralImpl();
		return enumerationLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveType createPrimitiveType() {
		PrimitiveTypeImpl primitiveType = new PrimitiveTypeImpl();
		return primitiveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint createConstraint() {
		ConstraintImpl constraint = new ConstraintImpl();
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralBoolean createLiteralBoolean() {
		LiteralBooleanImpl literalBoolean = new LiteralBooleanImpl();
		return literalBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralString createLiteralString() {
		LiteralStringImpl literalString = new LiteralStringImpl();
		return literalString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralNull createLiteralNull() {
		LiteralNullImpl literalNull = new LiteralNullImpl();
		return literalNull;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralInteger createLiteralInteger() {
		LiteralIntegerImpl literalInteger = new LiteralIntegerImpl();
		return literalInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralUnlimitedNatural createLiteralUnlimitedNatural() {
		LiteralUnlimitedNaturalImpl literalUnlimitedNatural = new LiteralUnlimitedNaturalImpl();
		return literalUnlimitedNatural;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceSpecification createInstanceSpecification() {
		InstanceSpecificationImpl instanceSpecification = new InstanceSpecificationImpl();
		return instanceSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Slot createSlot() {
		SlotImpl slot = new SlotImpl();
		return slot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceValue createInstanceValue() {
		InstanceValueImpl instanceValue = new InstanceValueImpl();
		return instanceValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Generalization createGeneralization() {
		GeneralizationImpl generalization = new GeneralizationImpl();
		return generalization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementImport createElementImport() {
		ElementImportImpl elementImport = new ElementImportImpl();
		return elementImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageImport createPackageImport() {
		PackageImportImpl packageImport = new PackageImportImpl();
		return packageImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association createAssociation() {
		AssociationImpl association = new AssociationImpl();
		return association;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageMerge createPackageMerge() {
		PackageMergeImpl packageMerge = new PackageMergeImpl();
		return packageMerge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stereotype createStereotype() {
		StereotypeImpl stereotype = new StereotypeImpl();
		return stereotype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Profile createProfile() {
		ProfileImpl profile = new ProfileImpl();
		return profile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProfileApplication createProfileApplication() {
		ProfileApplicationImpl profileApplication = new ProfileApplicationImpl();
		return profileApplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Extension createExtension() {
		ExtensionImpl extension = new ExtensionImpl();
		return extension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionEnd createExtensionEnd() {
		ExtensionEndImpl extensionEnd = new ExtensionEndImpl();
		return extensionEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity createActivity() {
		ActivityImpl activity = new ActivityImpl();
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Permission createPermission() {
		PermissionImpl permission = new PermissionImpl();
		return permission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dependency createDependency() {
		DependencyImpl dependency = new DependencyImpl();
		return dependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Usage createUsage() {
		UsageImpl usage = new UsageImpl();
		return usage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Abstraction createAbstraction() {
		AbstractionImpl abstraction = new AbstractionImpl();
		return abstraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Realization createRealization() {
		RealizationImpl realization = new RealizationImpl();
		return realization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Substitution createSubstitution() {
		SubstitutionImpl substitution = new SubstitutionImpl();
		return substitution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralizationSet createGeneralizationSet() {
		GeneralizationSetImpl generalizationSet = new GeneralizationSetImpl();
		return generalizationSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociationClass createAssociationClass() {
		AssociationClassImpl associationClass = new AssociationClassImpl();
		return associationClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InformationItem createInformationItem() {
		InformationItemImpl informationItem = new InformationItemImpl();
		return informationItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InformationFlow createInformationFlow() {
		InformationFlowImpl informationFlow = new InformationFlowImpl();
		return informationFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model createModel() {
		ModelImpl model = new ModelImpl();
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectorEnd createConnectorEnd() {
		ConnectorEndImpl connectorEnd = new ConnectorEndImpl();
		return connectorEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector createConnector() {
		ConnectorImpl connector = new ConnectorImpl();
		return connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action createAction() {
		ActionImpl action = new ActionImpl();
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlFlow createControlFlow() {
		ControlFlowImpl controlFlow = new ControlFlowImpl();
		return controlFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectFlow createObjectFlow() {
		ObjectFlowImpl objectFlow = new ObjectFlowImpl();
		return objectFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitialNode createInitialNode() {
		InitialNodeImpl initialNode = new InitialNodeImpl();
		return initialNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityFinalNode createActivityFinalNode() {
		ActivityFinalNodeImpl activityFinalNode = new ActivityFinalNodeImpl();
		return activityFinalNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecisionNode createDecisionNode() {
		DecisionNodeImpl decisionNode = new DecisionNodeImpl();
		return decisionNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MergeNode createMergeNode() {
		MergeNodeImpl mergeNode = new MergeNodeImpl();
		return mergeNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputPin createOutputPin() {
		OutputPinImpl outputPin = new OutputPinImpl();
		return outputPin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin createInputPin() {
		InputPinImpl inputPin = new InputPinImpl();
		return inputPin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityParameterNode createActivityParameterNode() {
		ActivityParameterNodeImpl activityParameterNode = new ActivityParameterNodeImpl();
		return activityParameterNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValuePin createValuePin() {
		ValuePinImpl valuePin = new ValuePinImpl();
		return valuePin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface createInterface() {
		InterfaceImpl interface_ = new InterfaceImpl();
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Implementation createImplementation() {
		ImplementationImpl implementation = new ImplementationImpl();
		return implementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Artifact createArtifact() {
		ArtifactImpl artifact = new ArtifactImpl();
		return artifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Manifestation createManifestation() {
		ManifestationImpl manifestation = new ManifestationImpl();
		return manifestation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actor createActor() {
		ActorImpl actor = new ActorImpl();
		return actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Extend createExtend() {
		ExtendImpl extend = new ExtendImpl();
		return extend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCase createUseCase() {
		UseCaseImpl useCase = new UseCaseImpl();
		return useCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionPoint createExtensionPoint() {
		ExtensionPointImpl extensionPoint = new ExtensionPointImpl();
		return extensionPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Include createInclude() {
		IncludeImpl include = new IncludeImpl();
		return include;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollaborationOccurrence createCollaborationOccurrence() {
		CollaborationOccurrenceImpl collaborationOccurrence = new CollaborationOccurrenceImpl();
		return collaborationOccurrence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collaboration createCollaboration() {
		CollaborationImpl collaboration = new CollaborationImpl();
		return collaboration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port createPort() {
		PortImpl port = new PortImpl();
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallTrigger createCallTrigger() {
		CallTriggerImpl callTrigger = new CallTriggerImpl();
		return callTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeTrigger createChangeTrigger() {
		ChangeTriggerImpl changeTrigger = new ChangeTriggerImpl();
		return changeTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reception createReception() {
		ReceptionImpl reception = new ReceptionImpl();
		return reception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signal createSignal() {
		SignalImpl signal = new SignalImpl();
		return signal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalTrigger createSignalTrigger() {
		SignalTriggerImpl signalTrigger = new SignalTriggerImpl();
		return signalTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeTrigger createTimeTrigger() {
		TimeTriggerImpl timeTrigger = new TimeTriggerImpl();
		return timeTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnyTrigger createAnyTrigger() {
		AnyTriggerImpl anyTrigger = new AnyTriggerImpl();
		return anyTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable createVariable() {
		VariableImpl variable = new VariableImpl();
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredActivityNode createStructuredActivityNode() {
		StructuredActivityNodeImpl structuredActivityNode = new StructuredActivityNodeImpl();
		return structuredActivityNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionalNode createConditionalNode() {
		ConditionalNodeImpl conditionalNode = new ConditionalNodeImpl();
		return conditionalNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clause createClause() {
		ClauseImpl clause = new ClauseImpl();
		return clause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoopNode createLoopNode() {
		LoopNodeImpl loopNode = new LoopNodeImpl();
		return loopNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interaction createInteraction() {
		InteractionImpl interaction = new InteractionImpl();
		return interaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lifeline createLifeline() {
		LifelineImpl lifeline = new LifelineImpl();
		return lifeline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message createMessage() {
		MessageImpl message = new MessageImpl();
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralOrdering createGeneralOrdering() {
		GeneralOrderingImpl generalOrdering = new GeneralOrderingImpl();
		return generalOrdering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventOccurrence createEventOccurrence() {
		EventOccurrenceImpl eventOccurrence = new EventOccurrenceImpl();
		return eventOccurrence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionOccurrence createExecutionOccurrence() {
		ExecutionOccurrenceImpl executionOccurrence = new ExecutionOccurrenceImpl();
		return executionOccurrence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateInvariant createStateInvariant() {
		StateInvariantImpl stateInvariant = new StateInvariantImpl();
		return stateInvariant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stop createStop() {
		StopImpl stop = new StopImpl();
		return stop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateSignature createTemplateSignature() {
		TemplateSignatureImpl templateSignature = new TemplateSignatureImpl();
		return templateSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateParameter createTemplateParameter() {
		TemplateParameterImpl templateParameter = new TemplateParameterImpl();
		return templateParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringExpression createStringExpression() {
		StringExpressionImpl stringExpression = new StringExpressionImpl();
		return stringExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateBinding createTemplateBinding() {
		TemplateBindingImpl templateBinding = new TemplateBindingImpl();
		return templateBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateParameterSubstitution createTemplateParameterSubstitution() {
		TemplateParameterSubstitutionImpl templateParameterSubstitution = new TemplateParameterSubstitutionImpl();
		return templateParameterSubstitution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationTemplateParameter createOperationTemplateParameter() {
		OperationTemplateParameterImpl operationTemplateParameter = new OperationTemplateParameterImpl();
		return operationTemplateParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassifierTemplateParameter createClassifierTemplateParameter() {
		ClassifierTemplateParameterImpl classifierTemplateParameter = new ClassifierTemplateParameterImpl();
		return classifierTemplateParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RedefinableTemplateSignature createRedefinableTemplateSignature() {
		RedefinableTemplateSignatureImpl redefinableTemplateSignature = new RedefinableTemplateSignatureImpl();
		return redefinableTemplateSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectableElementTemplateParameter createConnectableElementTemplateParameter() {
		ConnectableElementTemplateParameterImpl connectableElementTemplateParameter = new ConnectableElementTemplateParameterImpl();
		return connectableElementTemplateParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForkNode createForkNode() {
		ForkNodeImpl forkNode = new ForkNodeImpl();
		return forkNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoinNode createJoinNode() {
		JoinNodeImpl joinNode = new JoinNodeImpl();
		return joinNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowFinalNode createFlowFinalNode() {
		FlowFinalNodeImpl flowFinalNode = new FlowFinalNodeImpl();
		return flowFinalNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CentralBufferNode createCentralBufferNode() {
		CentralBufferNodeImpl centralBufferNode = new CentralBufferNodeImpl();
		return centralBufferNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityPartition createActivityPartition() {
		ActivityPartitionImpl activityPartition = new ActivityPartitionImpl();
		return activityPartition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpansionNode createExpansionNode() {
		ExpansionNodeImpl expansionNode = new ExpansionNodeImpl();
		return expansionNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpansionRegion createExpansionRegion() {
		ExpansionRegionImpl expansionRegion = new ExpansionRegionImpl();
		return expansionRegion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExceptionHandler createExceptionHandler() {
		ExceptionHandlerImpl exceptionHandler = new ExceptionHandlerImpl();
		return exceptionHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionOccurrence createInteractionOccurrence() {
		InteractionOccurrenceImpl interactionOccurrence = new InteractionOccurrenceImpl();
		return interactionOccurrence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gate createGate() {
		GateImpl gate = new GateImpl();
		return gate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartDecomposition createPartDecomposition() {
		PartDecompositionImpl partDecomposition = new PartDecompositionImpl();
		return partDecomposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionOperand createInteractionOperand() {
		InteractionOperandImpl interactionOperand = new InteractionOperandImpl();
		return interactionOperand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionConstraint createInteractionConstraint() {
		InteractionConstraintImpl interactionConstraint = new InteractionConstraintImpl();
		return interactionConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CombinedFragment createCombinedFragment() {
		CombinedFragmentImpl combinedFragment = new CombinedFragmentImpl();
		return combinedFragment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Continuation createContinuation() {
		ContinuationImpl continuation = new ContinuationImpl();
		return continuation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachine createStateMachine() {
		StateMachineImpl stateMachine = new StateMachineImpl();
		return stateMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Region createRegion() {
		RegionImpl region = new RegionImpl();
		return region;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pseudostate createPseudostate() {
		PseudostateImpl pseudostate = new PseudostateImpl();
		return pseudostate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State createState() {
		StateImpl state = new StateImpl();
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionPointReference createConnectionPointReference() {
		ConnectionPointReferenceImpl connectionPointReference = new ConnectionPointReferenceImpl();
		return connectionPointReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition createTransition() {
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinalState createFinalState() {
		FinalStateImpl finalState = new FinalStateImpl();
		return finalState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateObjectAction createCreateObjectAction() {
		CreateObjectActionImpl createObjectAction = new CreateObjectActionImpl();
		return createObjectAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DestroyObjectAction createDestroyObjectAction() {
		DestroyObjectActionImpl destroyObjectAction = new DestroyObjectActionImpl();
		return destroyObjectAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestIdentityAction createTestIdentityAction() {
		TestIdentityActionImpl testIdentityAction = new TestIdentityActionImpl();
		return testIdentityAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadSelfAction createReadSelfAction() {
		ReadSelfActionImpl readSelfAction = new ReadSelfActionImpl();
		return readSelfAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadStructuralFeatureAction createReadStructuralFeatureAction() {
		ReadStructuralFeatureActionImpl readStructuralFeatureAction = new ReadStructuralFeatureActionImpl();
		return readStructuralFeatureAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClearStructuralFeatureAction createClearStructuralFeatureAction() {
		ClearStructuralFeatureActionImpl clearStructuralFeatureAction = new ClearStructuralFeatureActionImpl();
		return clearStructuralFeatureAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoveStructuralFeatureValueAction createRemoveStructuralFeatureValueAction() {
		RemoveStructuralFeatureValueActionImpl removeStructuralFeatureValueAction = new RemoveStructuralFeatureValueActionImpl();
		return removeStructuralFeatureValueAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddStructuralFeatureValueAction createAddStructuralFeatureValueAction() {
		AddStructuralFeatureValueActionImpl addStructuralFeatureValueAction = new AddStructuralFeatureValueActionImpl();
		return addStructuralFeatureValueAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkEndData createLinkEndData() {
		LinkEndDataImpl linkEndData = new LinkEndDataImpl();
		return linkEndData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadLinkAction createReadLinkAction() {
		ReadLinkActionImpl readLinkAction = new ReadLinkActionImpl();
		return readLinkAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkEndCreationData createLinkEndCreationData() {
		LinkEndCreationDataImpl linkEndCreationData = new LinkEndCreationDataImpl();
		return linkEndCreationData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateLinkAction createCreateLinkAction() {
		CreateLinkActionImpl createLinkAction = new CreateLinkActionImpl();
		return createLinkAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DestroyLinkAction createDestroyLinkAction() {
		DestroyLinkActionImpl destroyLinkAction = new DestroyLinkActionImpl();
		return destroyLinkAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClearAssociationAction createClearAssociationAction() {
		ClearAssociationActionImpl clearAssociationAction = new ClearAssociationActionImpl();
		return clearAssociationAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadVariableAction createReadVariableAction() {
		ReadVariableActionImpl readVariableAction = new ReadVariableActionImpl();
		return readVariableAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClearVariableAction createClearVariableAction() {
		ClearVariableActionImpl clearVariableAction = new ClearVariableActionImpl();
		return clearVariableAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddVariableValueAction createAddVariableValueAction() {
		AddVariableValueActionImpl addVariableValueAction = new AddVariableValueActionImpl();
		return addVariableValueAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoveVariableValueAction createRemoveVariableValueAction() {
		RemoveVariableValueActionImpl removeVariableValueAction = new RemoveVariableValueActionImpl();
		return removeVariableValueAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplyFunctionAction createApplyFunctionAction() {
		ApplyFunctionActionImpl applyFunctionAction = new ApplyFunctionActionImpl();
		return applyFunctionAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveFunction createPrimitiveFunction() {
		PrimitiveFunctionImpl primitiveFunction = new PrimitiveFunctionImpl();
		return primitiveFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SendSignalAction createSendSignalAction() {
		SendSignalActionImpl sendSignalAction = new SendSignalActionImpl();
		return sendSignalAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BroadcastSignalAction createBroadcastSignalAction() {
		BroadcastSignalActionImpl broadcastSignalAction = new BroadcastSignalActionImpl();
		return broadcastSignalAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SendObjectAction createSendObjectAction() {
		SendObjectActionImpl sendObjectAction = new SendObjectActionImpl();
		return sendObjectAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallOperationAction createCallOperationAction() {
		CallOperationActionImpl callOperationAction = new CallOperationActionImpl();
		return callOperationAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallBehaviorAction createCallBehaviorAction() {
		CallBehaviorActionImpl callBehaviorAction = new CallBehaviorActionImpl();
		return callBehaviorAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeExpression createTimeExpression() {
		TimeExpressionImpl timeExpression = new TimeExpressionImpl();
		return timeExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration createDuration() {
		DurationImpl duration = new DurationImpl();
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeObservationAction createTimeObservationAction() {
		TimeObservationActionImpl timeObservationAction = new TimeObservationActionImpl();
		return timeObservationAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DurationInterval createDurationInterval() {
		DurationIntervalImpl durationInterval = new DurationIntervalImpl();
		return durationInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interval createInterval() {
		IntervalImpl interval = new IntervalImpl();
		return interval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeConstraint createTimeConstraint() {
		TimeConstraintImpl timeConstraint = new TimeConstraintImpl();
		return timeConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntervalConstraint createIntervalConstraint() {
		IntervalConstraintImpl intervalConstraint = new IntervalConstraintImpl();
		return intervalConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeInterval createTimeInterval() {
		TimeIntervalImpl timeInterval = new TimeIntervalImpl();
		return timeInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DurationObservationAction createDurationObservationAction() {
		DurationObservationActionImpl durationObservationAction = new DurationObservationActionImpl();
		return durationObservationAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DurationConstraint createDurationConstraint() {
		DurationConstraintImpl durationConstraint = new DurationConstraintImpl();
		return durationConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataStoreNode createDataStoreNode() {
		DataStoreNodeImpl dataStoreNode = new DataStoreNodeImpl();
		return dataStoreNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterruptibleActivityRegion createInterruptibleActivityRegion() {
		InterruptibleActivityRegionImpl interruptibleActivityRegion = new InterruptibleActivityRegionImpl();
		return interruptibleActivityRegion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterSet createParameterSet() {
		ParameterSetImpl parameterSet = new ParameterSetImpl();
		return parameterSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component createComponent() {
		ComponentImpl component = new ComponentImpl();
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Deployment createDeployment() {
		DeploymentImpl deployment = new DeploymentImpl();
		return deployment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node createNode() {
		NodeImpl node = new NodeImpl();
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Device createDevice() {
		DeviceImpl device = new DeviceImpl();
		return device;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionEnvironment createExecutionEnvironment() {
		ExecutionEnvironmentImpl executionEnvironment = new ExecutionEnvironmentImpl();
		return executionEnvironment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationPath createCommunicationPath() {
		CommunicationPathImpl communicationPath = new CommunicationPathImpl();
		return communicationPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolConformance createProtocolConformance() {
		ProtocolConformanceImpl protocolConformance = new ProtocolConformanceImpl();
		return protocolConformance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolStateMachine createProtocolStateMachine() {
		ProtocolStateMachineImpl protocolStateMachine = new ProtocolStateMachineImpl();
		return protocolStateMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolTransition createProtocolTransition() {
		ProtocolTransitionImpl protocolTransition = new ProtocolTransitionImpl();
		return protocolTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadExtentAction createReadExtentAction() {
		ReadExtentActionImpl readExtentAction = new ReadExtentActionImpl();
		return readExtentAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReclassifyObjectAction createReclassifyObjectAction() {
		ReclassifyObjectActionImpl reclassifyObjectAction = new ReclassifyObjectActionImpl();
		return reclassifyObjectAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadIsClassifiedObjectAction createReadIsClassifiedObjectAction() {
		ReadIsClassifiedObjectActionImpl readIsClassifiedObjectAction = new ReadIsClassifiedObjectActionImpl();
		return readIsClassifiedObjectAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartOwnedBehaviorAction createStartOwnedBehaviorAction() {
		StartOwnedBehaviorActionImpl startOwnedBehaviorAction = new StartOwnedBehaviorActionImpl();
		return startOwnedBehaviorAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualifierValue createQualifierValue() {
		QualifierValueImpl qualifierValue = new QualifierValueImpl();
		return qualifierValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadLinkObjectEndAction createReadLinkObjectEndAction() {
		ReadLinkObjectEndActionImpl readLinkObjectEndAction = new ReadLinkObjectEndActionImpl();
		return readLinkObjectEndAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadLinkObjectEndQualifierAction createReadLinkObjectEndQualifierAction() {
		ReadLinkObjectEndQualifierActionImpl readLinkObjectEndQualifierAction = new ReadLinkObjectEndQualifierActionImpl();
		return readLinkObjectEndQualifierAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateLinkObjectAction createCreateLinkObjectAction() {
		CreateLinkObjectActionImpl createLinkObjectAction = new CreateLinkObjectActionImpl();
		return createLinkObjectAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcceptEventAction createAcceptEventAction() {
		AcceptEventActionImpl acceptEventAction = new AcceptEventActionImpl();
		return acceptEventAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcceptCallAction createAcceptCallAction() {
		AcceptCallActionImpl acceptCallAction = new AcceptCallActionImpl();
		return acceptCallAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReplyAction createReplyAction() {
		ReplyActionImpl replyAction = new ReplyActionImpl();
		return replyAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RaiseExceptionAction createRaiseExceptionAction() {
		RaiseExceptionActionImpl raiseExceptionAction = new RaiseExceptionActionImpl();
		return raiseExceptionAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentSpecification createDeploymentSpecification() {
		DeploymentSpecificationImpl deploymentSpecification = new DeploymentSpecificationImpl();
		return deploymentSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisibilityKind createVisibilityKindFromString(EDataType eDataType, String initialValue) {
		VisibilityKind result = VisibilityKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVisibilityKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterDirectionKind createParameterDirectionKindFromString(EDataType eDataType, String initialValue) {
		ParameterDirectionKind result = ParameterDirectionKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParameterDirectionKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregationKind createAggregationKindFromString(EDataType eDataType, String initialValue) {
		AggregationKind result = AggregationKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAggregationKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallConcurrencyKind createCallConcurrencyKindFromString(EDataType eDataType, String initialValue) {
		CallConcurrencyKind result = CallConcurrencyKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCallConcurrencyKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageKind createMessageKindFromString(EDataType eDataType, String initialValue) {
		MessageKind result = MessageKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMessageKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageSort createMessageSortFromString(EDataType eDataType, String initialValue) {
		MessageSort result = MessageSort.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMessageSortToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpansionKind createExpansionKindFromString(EDataType eDataType, String initialValue) {
		ExpansionKind result = ExpansionKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExpansionKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionOperator createInteractionOperatorFromString(EDataType eDataType, String initialValue) {
		InteractionOperator result = InteractionOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInteractionOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionKind createTransitionKindFromString(EDataType eDataType, String initialValue) {
		TransitionKind result = TransitionKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTransitionKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PseudostateKind createPseudostateKindFromString(EDataType eDataType, String initialValue) {
		PseudostateKind result = PseudostateKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPseudostateKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterEffectKind createParameterEffectKindFromString(EDataType eDataType, String initialValue) {
		ParameterEffectKind result = ParameterEffectKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParameterEffectKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectNodeOrderingKind createObjectNodeOrderingKindFromString(EDataType eDataType, String initialValue) {
		ObjectNodeOrderingKind result = ObjectNodeOrderingKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertObjectNodeOrderingKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectorKind createConnectorKindFromString(EDataType eDataType, String initialValue) {
		ConnectorKind result = ConnectorKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConnectorKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UML2Package getUML2Package() {
		return (UML2Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UML2Package getPackage() {
		return UML2Package.eINSTANCE;
	}

} //UML2FactoryImpl

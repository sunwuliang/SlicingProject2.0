/**
 */
package org.csu.slicing.UML2WithID.impl;

import org.csu.slicing.UML2WithID.Abstraction;
import org.csu.slicing.UML2WithID.AcceptCallAction;
import org.csu.slicing.UML2WithID.AcceptEventAction;
import org.csu.slicing.UML2WithID.Action;
import org.csu.slicing.UML2WithID.Activity;
import org.csu.slicing.UML2WithID.ActivityFinalNode;
import org.csu.slicing.UML2WithID.ActivityParameterNode;
import org.csu.slicing.UML2WithID.ActivityPartition;
import org.csu.slicing.UML2WithID.Actor;
import org.csu.slicing.UML2WithID.AddStructuralFeatureValueAction;
import org.csu.slicing.UML2WithID.AddVariableValueAction;
import org.csu.slicing.UML2WithID.AggregationKind;
import org.csu.slicing.UML2WithID.AnyTrigger;
import org.csu.slicing.UML2WithID.ApplyFunctionAction;
import org.csu.slicing.UML2WithID.Artifact;
import org.csu.slicing.UML2WithID.Association;
import org.csu.slicing.UML2WithID.AssociationClass;
import org.csu.slicing.UML2WithID.BroadcastSignalAction;
import org.csu.slicing.UML2WithID.CallBehaviorAction;
import org.csu.slicing.UML2WithID.CallConcurrencyKind;
import org.csu.slicing.UML2WithID.CallOperationAction;
import org.csu.slicing.UML2WithID.CallTrigger;
import org.csu.slicing.UML2WithID.CentralBufferNode;
import org.csu.slicing.UML2WithID.ChangeTrigger;
import org.csu.slicing.UML2WithID.ClassifierTemplateParameter;
import org.csu.slicing.UML2WithID.Clause;
import org.csu.slicing.UML2WithID.ClearAssociationAction;
import org.csu.slicing.UML2WithID.ClearStructuralFeatureAction;
import org.csu.slicing.UML2WithID.ClearVariableAction;
import org.csu.slicing.UML2WithID.Collaboration;
import org.csu.slicing.UML2WithID.CollaborationOccurrence;
import org.csu.slicing.UML2WithID.CombinedFragment;
import org.csu.slicing.UML2WithID.Comment;
import org.csu.slicing.UML2WithID.CommunicationPath;
import org.csu.slicing.UML2WithID.Component;
import org.csu.slicing.UML2WithID.ConditionalNode;
import org.csu.slicing.UML2WithID.ConnectableElementTemplateParameter;
import org.csu.slicing.UML2WithID.ConnectionPointReference;
import org.csu.slicing.UML2WithID.Connector;
import org.csu.slicing.UML2WithID.ConnectorEnd;
import org.csu.slicing.UML2WithID.ConnectorKind;
import org.csu.slicing.UML2WithID.Constraint;
import org.csu.slicing.UML2WithID.Continuation;
import org.csu.slicing.UML2WithID.ControlFlow;
import org.csu.slicing.UML2WithID.CreateLinkAction;
import org.csu.slicing.UML2WithID.CreateLinkObjectAction;
import org.csu.slicing.UML2WithID.CreateObjectAction;
import org.csu.slicing.UML2WithID.DataStoreNode;
import org.csu.slicing.UML2WithID.DataType;
import org.csu.slicing.UML2WithID.DecisionNode;
import org.csu.slicing.UML2WithID.Dependency;
import org.csu.slicing.UML2WithID.Deployment;
import org.csu.slicing.UML2WithID.DeploymentSpecification;
import org.csu.slicing.UML2WithID.DestroyLinkAction;
import org.csu.slicing.UML2WithID.DestroyObjectAction;
import org.csu.slicing.UML2WithID.Device;
import org.csu.slicing.UML2WithID.Duration;
import org.csu.slicing.UML2WithID.DurationConstraint;
import org.csu.slicing.UML2WithID.DurationInterval;
import org.csu.slicing.UML2WithID.DurationObservationAction;
import org.csu.slicing.UML2WithID.ElementImport;
import org.csu.slicing.UML2WithID.Enumeration;
import org.csu.slicing.UML2WithID.EnumerationLiteral;
import org.csu.slicing.UML2WithID.EventOccurrence;
import org.csu.slicing.UML2WithID.ExceptionHandler;
import org.csu.slicing.UML2WithID.ExecutionEnvironment;
import org.csu.slicing.UML2WithID.ExecutionOccurrence;
import org.csu.slicing.UML2WithID.ExpansionKind;
import org.csu.slicing.UML2WithID.ExpansionNode;
import org.csu.slicing.UML2WithID.ExpansionRegion;
import org.csu.slicing.UML2WithID.Expression;
import org.csu.slicing.UML2WithID.Extend;
import org.csu.slicing.UML2WithID.Extension;
import org.csu.slicing.UML2WithID.ExtensionEnd;
import org.csu.slicing.UML2WithID.ExtensionPoint;
import org.csu.slicing.UML2WithID.FinalState;
import org.csu.slicing.UML2WithID.FlowFinalNode;
import org.csu.slicing.UML2WithID.ForkNode;
import org.csu.slicing.UML2WithID.Gate;
import org.csu.slicing.UML2WithID.GeneralOrdering;
import org.csu.slicing.UML2WithID.Generalization;
import org.csu.slicing.UML2WithID.GeneralizationSet;
import org.csu.slicing.UML2WithID.Implementation;
import org.csu.slicing.UML2WithID.Include;
import org.csu.slicing.UML2WithID.InformationFlow;
import org.csu.slicing.UML2WithID.InformationItem;
import org.csu.slicing.UML2WithID.InitialNode;
import org.csu.slicing.UML2WithID.InputPin;
import org.csu.slicing.UML2WithID.InstanceSpecification;
import org.csu.slicing.UML2WithID.InstanceValue;
import org.csu.slicing.UML2WithID.Interaction;
import org.csu.slicing.UML2WithID.InteractionConstraint;
import org.csu.slicing.UML2WithID.InteractionOccurrence;
import org.csu.slicing.UML2WithID.InteractionOperand;
import org.csu.slicing.UML2WithID.InteractionOperator;
import org.csu.slicing.UML2WithID.Interface;
import org.csu.slicing.UML2WithID.InterruptibleActivityRegion;
import org.csu.slicing.UML2WithID.Interval;
import org.csu.slicing.UML2WithID.IntervalConstraint;
import org.csu.slicing.UML2WithID.JoinNode;
import org.csu.slicing.UML2WithID.Lifeline;
import org.csu.slicing.UML2WithID.LinkEndCreationData;
import org.csu.slicing.UML2WithID.LinkEndData;
import org.csu.slicing.UML2WithID.LiteralBoolean;
import org.csu.slicing.UML2WithID.LiteralInteger;
import org.csu.slicing.UML2WithID.LiteralNull;
import org.csu.slicing.UML2WithID.LiteralString;
import org.csu.slicing.UML2WithID.LiteralUnlimitedNatural;
import org.csu.slicing.UML2WithID.LoopNode;
import org.csu.slicing.UML2WithID.Manifestation;
import org.csu.slicing.UML2WithID.MergeNode;
import org.csu.slicing.UML2WithID.Message;
import org.csu.slicing.UML2WithID.MessageKind;
import org.csu.slicing.UML2WithID.MessageSort;
import org.csu.slicing.UML2WithID.Model;
import org.csu.slicing.UML2WithID.Node;
import org.csu.slicing.UML2WithID.ObjectFlow;
import org.csu.slicing.UML2WithID.ObjectNodeOrderingKind;
import org.csu.slicing.UML2WithID.OpaqueExpression;
import org.csu.slicing.UML2WithID.Operation;
import org.csu.slicing.UML2WithID.OperationTemplateParameter;
import org.csu.slicing.UML2WithID.OutputPin;
import org.csu.slicing.UML2WithID.PackageImport;
import org.csu.slicing.UML2WithID.PackageMerge;
import org.csu.slicing.UML2WithID.Parameter;
import org.csu.slicing.UML2WithID.ParameterDirectionKind;
import org.csu.slicing.UML2WithID.ParameterEffectKind;
import org.csu.slicing.UML2WithID.ParameterSet;
import org.csu.slicing.UML2WithID.PartDecomposition;
import org.csu.slicing.UML2WithID.Permission;
import org.csu.slicing.UML2WithID.Port;
import org.csu.slicing.UML2WithID.PrimitiveFunction;
import org.csu.slicing.UML2WithID.PrimitiveType;
import org.csu.slicing.UML2WithID.Profile;
import org.csu.slicing.UML2WithID.ProfileApplication;
import org.csu.slicing.UML2WithID.Property;
import org.csu.slicing.UML2WithID.ProtocolConformance;
import org.csu.slicing.UML2WithID.ProtocolStateMachine;
import org.csu.slicing.UML2WithID.ProtocolTransition;
import org.csu.slicing.UML2WithID.Pseudostate;
import org.csu.slicing.UML2WithID.PseudostateKind;
import org.csu.slicing.UML2WithID.QualifierValue;
import org.csu.slicing.UML2WithID.RaiseExceptionAction;
import org.csu.slicing.UML2WithID.ReadExtentAction;
import org.csu.slicing.UML2WithID.ReadIsClassifiedObjectAction;
import org.csu.slicing.UML2WithID.ReadLinkAction;
import org.csu.slicing.UML2WithID.ReadLinkObjectEndAction;
import org.csu.slicing.UML2WithID.ReadLinkObjectEndQualifierAction;
import org.csu.slicing.UML2WithID.ReadSelfAction;
import org.csu.slicing.UML2WithID.ReadStructuralFeatureAction;
import org.csu.slicing.UML2WithID.ReadVariableAction;
import org.csu.slicing.UML2WithID.Realization;
import org.csu.slicing.UML2WithID.Reception;
import org.csu.slicing.UML2WithID.ReclassifyObjectAction;
import org.csu.slicing.UML2WithID.RedefinableTemplateSignature;
import org.csu.slicing.UML2WithID.Region;
import org.csu.slicing.UML2WithID.RemoveStructuralFeatureValueAction;
import org.csu.slicing.UML2WithID.RemoveVariableValueAction;
import org.csu.slicing.UML2WithID.ReplyAction;
import org.csu.slicing.UML2WithID.SendObjectAction;
import org.csu.slicing.UML2WithID.SendSignalAction;
import org.csu.slicing.UML2WithID.Signal;
import org.csu.slicing.UML2WithID.SignalTrigger;
import org.csu.slicing.UML2WithID.Slot;
import org.csu.slicing.UML2WithID.StartOwnedBehaviorAction;
import org.csu.slicing.UML2WithID.State;
import org.csu.slicing.UML2WithID.StateInvariant;
import org.csu.slicing.UML2WithID.StateMachine;
import org.csu.slicing.UML2WithID.Stereotype;
import org.csu.slicing.UML2WithID.Stop;
import org.csu.slicing.UML2WithID.StringExpression;
import org.csu.slicing.UML2WithID.StructuredActivityNode;
import org.csu.slicing.UML2WithID.Substitution;
import org.csu.slicing.UML2WithID.TemplateBinding;
import org.csu.slicing.UML2WithID.TemplateParameter;
import org.csu.slicing.UML2WithID.TemplateParameterSubstitution;
import org.csu.slicing.UML2WithID.TemplateSignature;
import org.csu.slicing.UML2WithID.TestIdentityAction;
import org.csu.slicing.UML2WithID.TimeConstraint;
import org.csu.slicing.UML2WithID.TimeExpression;
import org.csu.slicing.UML2WithID.TimeInterval;
import org.csu.slicing.UML2WithID.TimeObservationAction;
import org.csu.slicing.UML2WithID.TimeTrigger;
import org.csu.slicing.UML2WithID.Transition;
import org.csu.slicing.UML2WithID.TransitionKind;
import org.csu.slicing.UML2WithID.UML2WithIDFactory;
import org.csu.slicing.UML2WithID.UML2WithIDPackage;
import org.csu.slicing.UML2WithID.Usage;
import org.csu.slicing.UML2WithID.UseCase;
import org.csu.slicing.UML2WithID.ValuePin;
import org.csu.slicing.UML2WithID.Variable;
import org.csu.slicing.UML2WithID.VisibilityKind;

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
public class UML2WithIDFactoryImpl extends EFactoryImpl implements UML2WithIDFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UML2WithIDFactory init() {
		try {
			UML2WithIDFactory theUML2WithIDFactory = (UML2WithIDFactory)EPackage.Registry.INSTANCE.getEFactory("http:///UML2WithID.ecore"); 
			if (theUML2WithIDFactory != null) {
				return theUML2WithIDFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UML2WithIDFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UML2WithIDFactoryImpl() {
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
			case UML2WithIDPackage.OPAQUE_EXPRESSION: return createOpaqueExpression();
			case UML2WithIDPackage.EXPRESSION: return createExpression();
			case UML2WithIDPackage.COMMENT: return createComment();
			case UML2WithIDPackage.CLASS: return createClass();
			case UML2WithIDPackage.PROPERTY: return createProperty();
			case UML2WithIDPackage.OPERATION: return createOperation();
			case UML2WithIDPackage.PARAMETER: return createParameter();
			case UML2WithIDPackage.PACKAGE: return createPackage();
			case UML2WithIDPackage.ENUMERATION: return createEnumeration();
			case UML2WithIDPackage.DATA_TYPE: return createDataType();
			case UML2WithIDPackage.ENUMERATION_LITERAL: return createEnumerationLiteral();
			case UML2WithIDPackage.PRIMITIVE_TYPE: return createPrimitiveType();
			case UML2WithIDPackage.CONSTRAINT: return createConstraint();
			case UML2WithIDPackage.LITERAL_BOOLEAN: return createLiteralBoolean();
			case UML2WithIDPackage.LITERAL_STRING: return createLiteralString();
			case UML2WithIDPackage.LITERAL_NULL: return createLiteralNull();
			case UML2WithIDPackage.LITERAL_INTEGER: return createLiteralInteger();
			case UML2WithIDPackage.LITERAL_UNLIMITED_NATURAL: return createLiteralUnlimitedNatural();
			case UML2WithIDPackage.INSTANCE_SPECIFICATION: return createInstanceSpecification();
			case UML2WithIDPackage.SLOT: return createSlot();
			case UML2WithIDPackage.INSTANCE_VALUE: return createInstanceValue();
			case UML2WithIDPackage.GENERALIZATION: return createGeneralization();
			case UML2WithIDPackage.ELEMENT_IMPORT: return createElementImport();
			case UML2WithIDPackage.PACKAGE_IMPORT: return createPackageImport();
			case UML2WithIDPackage.ASSOCIATION: return createAssociation();
			case UML2WithIDPackage.PACKAGE_MERGE: return createPackageMerge();
			case UML2WithIDPackage.STEREOTYPE: return createStereotype();
			case UML2WithIDPackage.PROFILE: return createProfile();
			case UML2WithIDPackage.PROFILE_APPLICATION: return createProfileApplication();
			case UML2WithIDPackage.EXTENSION: return createExtension();
			case UML2WithIDPackage.EXTENSION_END: return createExtensionEnd();
			case UML2WithIDPackage.ACTIVITY: return createActivity();
			case UML2WithIDPackage.PERMISSION: return createPermission();
			case UML2WithIDPackage.DEPENDENCY: return createDependency();
			case UML2WithIDPackage.USAGE: return createUsage();
			case UML2WithIDPackage.ABSTRACTION: return createAbstraction();
			case UML2WithIDPackage.REALIZATION: return createRealization();
			case UML2WithIDPackage.SUBSTITUTION: return createSubstitution();
			case UML2WithIDPackage.GENERALIZATION_SET: return createGeneralizationSet();
			case UML2WithIDPackage.ASSOCIATION_CLASS: return createAssociationClass();
			case UML2WithIDPackage.INFORMATION_ITEM: return createInformationItem();
			case UML2WithIDPackage.INFORMATION_FLOW: return createInformationFlow();
			case UML2WithIDPackage.MODEL: return createModel();
			case UML2WithIDPackage.CONNECTOR_END: return createConnectorEnd();
			case UML2WithIDPackage.CONNECTOR: return createConnector();
			case UML2WithIDPackage.ACTION: return createAction();
			case UML2WithIDPackage.CONTROL_FLOW: return createControlFlow();
			case UML2WithIDPackage.OBJECT_FLOW: return createObjectFlow();
			case UML2WithIDPackage.INITIAL_NODE: return createInitialNode();
			case UML2WithIDPackage.ACTIVITY_FINAL_NODE: return createActivityFinalNode();
			case UML2WithIDPackage.DECISION_NODE: return createDecisionNode();
			case UML2WithIDPackage.MERGE_NODE: return createMergeNode();
			case UML2WithIDPackage.OUTPUT_PIN: return createOutputPin();
			case UML2WithIDPackage.INPUT_PIN: return createInputPin();
			case UML2WithIDPackage.ACTIVITY_PARAMETER_NODE: return createActivityParameterNode();
			case UML2WithIDPackage.VALUE_PIN: return createValuePin();
			case UML2WithIDPackage.INTERFACE: return createInterface();
			case UML2WithIDPackage.IMPLEMENTATION: return createImplementation();
			case UML2WithIDPackage.ARTIFACT: return createArtifact();
			case UML2WithIDPackage.MANIFESTATION: return createManifestation();
			case UML2WithIDPackage.ACTOR: return createActor();
			case UML2WithIDPackage.EXTEND: return createExtend();
			case UML2WithIDPackage.USE_CASE: return createUseCase();
			case UML2WithIDPackage.EXTENSION_POINT: return createExtensionPoint();
			case UML2WithIDPackage.INCLUDE: return createInclude();
			case UML2WithIDPackage.COLLABORATION_OCCURRENCE: return createCollaborationOccurrence();
			case UML2WithIDPackage.COLLABORATION: return createCollaboration();
			case UML2WithIDPackage.PORT: return createPort();
			case UML2WithIDPackage.CALL_TRIGGER: return createCallTrigger();
			case UML2WithIDPackage.CHANGE_TRIGGER: return createChangeTrigger();
			case UML2WithIDPackage.RECEPTION: return createReception();
			case UML2WithIDPackage.SIGNAL: return createSignal();
			case UML2WithIDPackage.SIGNAL_TRIGGER: return createSignalTrigger();
			case UML2WithIDPackage.TIME_TRIGGER: return createTimeTrigger();
			case UML2WithIDPackage.ANY_TRIGGER: return createAnyTrigger();
			case UML2WithIDPackage.VARIABLE: return createVariable();
			case UML2WithIDPackage.STRUCTURED_ACTIVITY_NODE: return createStructuredActivityNode();
			case UML2WithIDPackage.CONDITIONAL_NODE: return createConditionalNode();
			case UML2WithIDPackage.CLAUSE: return createClause();
			case UML2WithIDPackage.LOOP_NODE: return createLoopNode();
			case UML2WithIDPackage.INTERACTION: return createInteraction();
			case UML2WithIDPackage.LIFELINE: return createLifeline();
			case UML2WithIDPackage.MESSAGE: return createMessage();
			case UML2WithIDPackage.GENERAL_ORDERING: return createGeneralOrdering();
			case UML2WithIDPackage.EVENT_OCCURRENCE: return createEventOccurrence();
			case UML2WithIDPackage.EXECUTION_OCCURRENCE: return createExecutionOccurrence();
			case UML2WithIDPackage.STATE_INVARIANT: return createStateInvariant();
			case UML2WithIDPackage.STOP: return createStop();
			case UML2WithIDPackage.TEMPLATE_SIGNATURE: return createTemplateSignature();
			case UML2WithIDPackage.TEMPLATE_PARAMETER: return createTemplateParameter();
			case UML2WithIDPackage.STRING_EXPRESSION: return createStringExpression();
			case UML2WithIDPackage.TEMPLATE_BINDING: return createTemplateBinding();
			case UML2WithIDPackage.TEMPLATE_PARAMETER_SUBSTITUTION: return createTemplateParameterSubstitution();
			case UML2WithIDPackage.OPERATION_TEMPLATE_PARAMETER: return createOperationTemplateParameter();
			case UML2WithIDPackage.CLASSIFIER_TEMPLATE_PARAMETER: return createClassifierTemplateParameter();
			case UML2WithIDPackage.REDEFINABLE_TEMPLATE_SIGNATURE: return createRedefinableTemplateSignature();
			case UML2WithIDPackage.CONNECTABLE_ELEMENT_TEMPLATE_PARAMETER: return createConnectableElementTemplateParameter();
			case UML2WithIDPackage.FORK_NODE: return createForkNode();
			case UML2WithIDPackage.JOIN_NODE: return createJoinNode();
			case UML2WithIDPackage.FLOW_FINAL_NODE: return createFlowFinalNode();
			case UML2WithIDPackage.CENTRAL_BUFFER_NODE: return createCentralBufferNode();
			case UML2WithIDPackage.ACTIVITY_PARTITION: return createActivityPartition();
			case UML2WithIDPackage.EXPANSION_NODE: return createExpansionNode();
			case UML2WithIDPackage.EXPANSION_REGION: return createExpansionRegion();
			case UML2WithIDPackage.EXCEPTION_HANDLER: return createExceptionHandler();
			case UML2WithIDPackage.INTERACTION_OCCURRENCE: return createInteractionOccurrence();
			case UML2WithIDPackage.GATE: return createGate();
			case UML2WithIDPackage.PART_DECOMPOSITION: return createPartDecomposition();
			case UML2WithIDPackage.INTERACTION_OPERAND: return createInteractionOperand();
			case UML2WithIDPackage.INTERACTION_CONSTRAINT: return createInteractionConstraint();
			case UML2WithIDPackage.COMBINED_FRAGMENT: return createCombinedFragment();
			case UML2WithIDPackage.CONTINUATION: return createContinuation();
			case UML2WithIDPackage.STATE_MACHINE: return createStateMachine();
			case UML2WithIDPackage.REGION: return createRegion();
			case UML2WithIDPackage.PSEUDOSTATE: return createPseudostate();
			case UML2WithIDPackage.STATE: return createState();
			case UML2WithIDPackage.CONNECTION_POINT_REFERENCE: return createConnectionPointReference();
			case UML2WithIDPackage.TRANSITION: return createTransition();
			case UML2WithIDPackage.FINAL_STATE: return createFinalState();
			case UML2WithIDPackage.CREATE_OBJECT_ACTION: return createCreateObjectAction();
			case UML2WithIDPackage.DESTROY_OBJECT_ACTION: return createDestroyObjectAction();
			case UML2WithIDPackage.TEST_IDENTITY_ACTION: return createTestIdentityAction();
			case UML2WithIDPackage.READ_SELF_ACTION: return createReadSelfAction();
			case UML2WithIDPackage.READ_STRUCTURAL_FEATURE_ACTION: return createReadStructuralFeatureAction();
			case UML2WithIDPackage.CLEAR_STRUCTURAL_FEATURE_ACTION: return createClearStructuralFeatureAction();
			case UML2WithIDPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION: return createRemoveStructuralFeatureValueAction();
			case UML2WithIDPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION: return createAddStructuralFeatureValueAction();
			case UML2WithIDPackage.LINK_END_DATA: return createLinkEndData();
			case UML2WithIDPackage.READ_LINK_ACTION: return createReadLinkAction();
			case UML2WithIDPackage.LINK_END_CREATION_DATA: return createLinkEndCreationData();
			case UML2WithIDPackage.CREATE_LINK_ACTION: return createCreateLinkAction();
			case UML2WithIDPackage.DESTROY_LINK_ACTION: return createDestroyLinkAction();
			case UML2WithIDPackage.CLEAR_ASSOCIATION_ACTION: return createClearAssociationAction();
			case UML2WithIDPackage.READ_VARIABLE_ACTION: return createReadVariableAction();
			case UML2WithIDPackage.CLEAR_VARIABLE_ACTION: return createClearVariableAction();
			case UML2WithIDPackage.ADD_VARIABLE_VALUE_ACTION: return createAddVariableValueAction();
			case UML2WithIDPackage.REMOVE_VARIABLE_VALUE_ACTION: return createRemoveVariableValueAction();
			case UML2WithIDPackage.APPLY_FUNCTION_ACTION: return createApplyFunctionAction();
			case UML2WithIDPackage.PRIMITIVE_FUNCTION: return createPrimitiveFunction();
			case UML2WithIDPackage.SEND_SIGNAL_ACTION: return createSendSignalAction();
			case UML2WithIDPackage.BROADCAST_SIGNAL_ACTION: return createBroadcastSignalAction();
			case UML2WithIDPackage.SEND_OBJECT_ACTION: return createSendObjectAction();
			case UML2WithIDPackage.CALL_OPERATION_ACTION: return createCallOperationAction();
			case UML2WithIDPackage.CALL_BEHAVIOR_ACTION: return createCallBehaviorAction();
			case UML2WithIDPackage.TIME_EXPRESSION: return createTimeExpression();
			case UML2WithIDPackage.DURATION: return createDuration();
			case UML2WithIDPackage.TIME_OBSERVATION_ACTION: return createTimeObservationAction();
			case UML2WithIDPackage.DURATION_INTERVAL: return createDurationInterval();
			case UML2WithIDPackage.INTERVAL: return createInterval();
			case UML2WithIDPackage.TIME_CONSTRAINT: return createTimeConstraint();
			case UML2WithIDPackage.INTERVAL_CONSTRAINT: return createIntervalConstraint();
			case UML2WithIDPackage.TIME_INTERVAL: return createTimeInterval();
			case UML2WithIDPackage.DURATION_OBSERVATION_ACTION: return createDurationObservationAction();
			case UML2WithIDPackage.DURATION_CONSTRAINT: return createDurationConstraint();
			case UML2WithIDPackage.DATA_STORE_NODE: return createDataStoreNode();
			case UML2WithIDPackage.INTERRUPTIBLE_ACTIVITY_REGION: return createInterruptibleActivityRegion();
			case UML2WithIDPackage.PARAMETER_SET: return createParameterSet();
			case UML2WithIDPackage.COMPONENT: return createComponent();
			case UML2WithIDPackage.DEPLOYMENT: return createDeployment();
			case UML2WithIDPackage.NODE: return createNode();
			case UML2WithIDPackage.DEVICE: return createDevice();
			case UML2WithIDPackage.EXECUTION_ENVIRONMENT: return createExecutionEnvironment();
			case UML2WithIDPackage.COMMUNICATION_PATH: return createCommunicationPath();
			case UML2WithIDPackage.PROTOCOL_CONFORMANCE: return createProtocolConformance();
			case UML2WithIDPackage.PROTOCOL_STATE_MACHINE: return createProtocolStateMachine();
			case UML2WithIDPackage.PROTOCOL_TRANSITION: return createProtocolTransition();
			case UML2WithIDPackage.READ_EXTENT_ACTION: return createReadExtentAction();
			case UML2WithIDPackage.RECLASSIFY_OBJECT_ACTION: return createReclassifyObjectAction();
			case UML2WithIDPackage.READ_IS_CLASSIFIED_OBJECT_ACTION: return createReadIsClassifiedObjectAction();
			case UML2WithIDPackage.START_OWNED_BEHAVIOR_ACTION: return createStartOwnedBehaviorAction();
			case UML2WithIDPackage.QUALIFIER_VALUE: return createQualifierValue();
			case UML2WithIDPackage.READ_LINK_OBJECT_END_ACTION: return createReadLinkObjectEndAction();
			case UML2WithIDPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION: return createReadLinkObjectEndQualifierAction();
			case UML2WithIDPackage.CREATE_LINK_OBJECT_ACTION: return createCreateLinkObjectAction();
			case UML2WithIDPackage.ACCEPT_EVENT_ACTION: return createAcceptEventAction();
			case UML2WithIDPackage.ACCEPT_CALL_ACTION: return createAcceptCallAction();
			case UML2WithIDPackage.REPLY_ACTION: return createReplyAction();
			case UML2WithIDPackage.RAISE_EXCEPTION_ACTION: return createRaiseExceptionAction();
			case UML2WithIDPackage.DEPLOYMENT_SPECIFICATION: return createDeploymentSpecification();
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
			case UML2WithIDPackage.VISIBILITY_KIND:
				return createVisibilityKindFromString(eDataType, initialValue);
			case UML2WithIDPackage.PARAMETER_DIRECTION_KIND:
				return createParameterDirectionKindFromString(eDataType, initialValue);
			case UML2WithIDPackage.AGGREGATION_KIND:
				return createAggregationKindFromString(eDataType, initialValue);
			case UML2WithIDPackage.CALL_CONCURRENCY_KIND:
				return createCallConcurrencyKindFromString(eDataType, initialValue);
			case UML2WithIDPackage.MESSAGE_KIND:
				return createMessageKindFromString(eDataType, initialValue);
			case UML2WithIDPackage.MESSAGE_SORT:
				return createMessageSortFromString(eDataType, initialValue);
			case UML2WithIDPackage.EXPANSION_KIND:
				return createExpansionKindFromString(eDataType, initialValue);
			case UML2WithIDPackage.INTERACTION_OPERATOR:
				return createInteractionOperatorFromString(eDataType, initialValue);
			case UML2WithIDPackage.TRANSITION_KIND:
				return createTransitionKindFromString(eDataType, initialValue);
			case UML2WithIDPackage.PSEUDOSTATE_KIND:
				return createPseudostateKindFromString(eDataType, initialValue);
			case UML2WithIDPackage.PARAMETER_EFFECT_KIND:
				return createParameterEffectKindFromString(eDataType, initialValue);
			case UML2WithIDPackage.OBJECT_NODE_ORDERING_KIND:
				return createObjectNodeOrderingKindFromString(eDataType, initialValue);
			case UML2WithIDPackage.CONNECTOR_KIND:
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
			case UML2WithIDPackage.VISIBILITY_KIND:
				return convertVisibilityKindToString(eDataType, instanceValue);
			case UML2WithIDPackage.PARAMETER_DIRECTION_KIND:
				return convertParameterDirectionKindToString(eDataType, instanceValue);
			case UML2WithIDPackage.AGGREGATION_KIND:
				return convertAggregationKindToString(eDataType, instanceValue);
			case UML2WithIDPackage.CALL_CONCURRENCY_KIND:
				return convertCallConcurrencyKindToString(eDataType, instanceValue);
			case UML2WithIDPackage.MESSAGE_KIND:
				return convertMessageKindToString(eDataType, instanceValue);
			case UML2WithIDPackage.MESSAGE_SORT:
				return convertMessageSortToString(eDataType, instanceValue);
			case UML2WithIDPackage.EXPANSION_KIND:
				return convertExpansionKindToString(eDataType, instanceValue);
			case UML2WithIDPackage.INTERACTION_OPERATOR:
				return convertInteractionOperatorToString(eDataType, instanceValue);
			case UML2WithIDPackage.TRANSITION_KIND:
				return convertTransitionKindToString(eDataType, instanceValue);
			case UML2WithIDPackage.PSEUDOSTATE_KIND:
				return convertPseudostateKindToString(eDataType, instanceValue);
			case UML2WithIDPackage.PARAMETER_EFFECT_KIND:
				return convertParameterEffectKindToString(eDataType, instanceValue);
			case UML2WithIDPackage.OBJECT_NODE_ORDERING_KIND:
				return convertObjectNodeOrderingKindToString(eDataType, instanceValue);
			case UML2WithIDPackage.CONNECTOR_KIND:
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
	public org.csu.slicing.UML2WithID.Class createClass() {
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
	public org.csu.slicing.UML2WithID.Package createPackage() {
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
	public UML2WithIDPackage getUML2WithIDPackage() {
		return (UML2WithIDPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UML2WithIDPackage getPackage() {
		return UML2WithIDPackage.eINSTANCE;
	}

} //UML2WithIDFactoryImpl

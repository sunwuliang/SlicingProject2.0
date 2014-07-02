/**
 */
package org.csu.slicing.UML2.util;

import org.csu.slicing.UML2.Abstraction;
import org.csu.slicing.UML2.AcceptCallAction;
import org.csu.slicing.UML2.AcceptEventAction;
import org.csu.slicing.UML2.Action;
import org.csu.slicing.UML2.Activity;
import org.csu.slicing.UML2.ActivityEdge;
import org.csu.slicing.UML2.ActivityFinalNode;
import org.csu.slicing.UML2.ActivityGroup;
import org.csu.slicing.UML2.ActivityNode;
import org.csu.slicing.UML2.ActivityParameterNode;
import org.csu.slicing.UML2.ActivityPartition;
import org.csu.slicing.UML2.Actor;
import org.csu.slicing.UML2.AddStructuralFeatureValueAction;
import org.csu.slicing.UML2.AddVariableValueAction;
import org.csu.slicing.UML2.AnyTrigger;
import org.csu.slicing.UML2.ApplyFunctionAction;
import org.csu.slicing.UML2.Artifact;
import org.csu.slicing.UML2.Association;
import org.csu.slicing.UML2.AssociationClass;
import org.csu.slicing.UML2.Behavior;
import org.csu.slicing.UML2.BehavioralFeature;
import org.csu.slicing.UML2.BehavioredClassifier;
import org.csu.slicing.UML2.BroadcastSignalAction;
import org.csu.slicing.UML2.CallAction;
import org.csu.slicing.UML2.CallBehaviorAction;
import org.csu.slicing.UML2.CallOperationAction;
import org.csu.slicing.UML2.CallTrigger;
import org.csu.slicing.UML2.CentralBufferNode;
import org.csu.slicing.UML2.ChangeTrigger;
import org.csu.slicing.UML2.Classifier;
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
import org.csu.slicing.UML2.ConnectableElement;
import org.csu.slicing.UML2.ConnectableElementTemplateParameter;
import org.csu.slicing.UML2.ConnectionPointReference;
import org.csu.slicing.UML2.Connector;
import org.csu.slicing.UML2.ConnectorEnd;
import org.csu.slicing.UML2.Constraint;
import org.csu.slicing.UML2.Continuation;
import org.csu.slicing.UML2.ControlFlow;
import org.csu.slicing.UML2.ControlNode;
import org.csu.slicing.UML2.CreateLinkAction;
import org.csu.slicing.UML2.CreateLinkObjectAction;
import org.csu.slicing.UML2.CreateObjectAction;
import org.csu.slicing.UML2.DataStoreNode;
import org.csu.slicing.UML2.DataType;
import org.csu.slicing.UML2.DecisionNode;
import org.csu.slicing.UML2.Dependency;
import org.csu.slicing.UML2.DeployedArtifact;
import org.csu.slicing.UML2.Deployment;
import org.csu.slicing.UML2.DeploymentSpecification;
import org.csu.slicing.UML2.DeploymentTarget;
import org.csu.slicing.UML2.DestroyLinkAction;
import org.csu.slicing.UML2.DestroyObjectAction;
import org.csu.slicing.UML2.Device;
import org.csu.slicing.UML2.DirectedRelationship;
import org.csu.slicing.UML2.Duration;
import org.csu.slicing.UML2.DurationConstraint;
import org.csu.slicing.UML2.DurationInterval;
import org.csu.slicing.UML2.DurationObservationAction;
import org.csu.slicing.UML2.Element;
import org.csu.slicing.UML2.ElementImport;
import org.csu.slicing.UML2.EncapsulatedClassifier;
import org.csu.slicing.UML2.Enumeration;
import org.csu.slicing.UML2.EnumerationLiteral;
import org.csu.slicing.UML2.EventOccurrence;
import org.csu.slicing.UML2.ExceptionHandler;
import org.csu.slicing.UML2.ExecutableNode;
import org.csu.slicing.UML2.ExecutionEnvironment;
import org.csu.slicing.UML2.ExecutionOccurrence;
import org.csu.slicing.UML2.ExpansionNode;
import org.csu.slicing.UML2.ExpansionRegion;
import org.csu.slicing.UML2.Expression;
import org.csu.slicing.UML2.Extend;
import org.csu.slicing.UML2.Extension;
import org.csu.slicing.UML2.ExtensionEnd;
import org.csu.slicing.UML2.ExtensionPoint;
import org.csu.slicing.UML2.Feature;
import org.csu.slicing.UML2.FinalNode;
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
import org.csu.slicing.UML2.InteractionFragment;
import org.csu.slicing.UML2.InteractionOccurrence;
import org.csu.slicing.UML2.InteractionOperand;
import org.csu.slicing.UML2.Interface;
import org.csu.slicing.UML2.InterruptibleActivityRegion;
import org.csu.slicing.UML2.Interval;
import org.csu.slicing.UML2.IntervalConstraint;
import org.csu.slicing.UML2.InvocationAction;
import org.csu.slicing.UML2.JoinNode;
import org.csu.slicing.UML2.Lifeline;
import org.csu.slicing.UML2.LinkAction;
import org.csu.slicing.UML2.LinkEndCreationData;
import org.csu.slicing.UML2.LinkEndData;
import org.csu.slicing.UML2.LiteralBoolean;
import org.csu.slicing.UML2.LiteralInteger;
import org.csu.slicing.UML2.LiteralNull;
import org.csu.slicing.UML2.LiteralSpecification;
import org.csu.slicing.UML2.LiteralString;
import org.csu.slicing.UML2.LiteralUnlimitedNatural;
import org.csu.slicing.UML2.LoopNode;
import org.csu.slicing.UML2.Manifestation;
import org.csu.slicing.UML2.MergeNode;
import org.csu.slicing.UML2.Message;
import org.csu.slicing.UML2.MessageEnd;
import org.csu.slicing.UML2.MessageTrigger;
import org.csu.slicing.UML2.Model;
import org.csu.slicing.UML2.MultiplicityElement;
import org.csu.slicing.UML2.NamedElement;
import org.csu.slicing.UML2.Namespace;
import org.csu.slicing.UML2.Node;
import org.csu.slicing.UML2.ObjectFlow;
import org.csu.slicing.UML2.ObjectNode;
import org.csu.slicing.UML2.OpaqueExpression;
import org.csu.slicing.UML2.Operation;
import org.csu.slicing.UML2.OperationTemplateParameter;
import org.csu.slicing.UML2.OutputPin;
import org.csu.slicing.UML2.PackageImport;
import org.csu.slicing.UML2.PackageMerge;
import org.csu.slicing.UML2.PackageableElement;
import org.csu.slicing.UML2.Parameter;
import org.csu.slicing.UML2.ParameterSet;
import org.csu.slicing.UML2.ParameterableClassifier;
import org.csu.slicing.UML2.ParameterableElement;
import org.csu.slicing.UML2.PartDecomposition;
import org.csu.slicing.UML2.Permission;
import org.csu.slicing.UML2.Pin;
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
import org.csu.slicing.UML2.RedefinableElement;
import org.csu.slicing.UML2.RedefinableTemplateSignature;
import org.csu.slicing.UML2.Region;
import org.csu.slicing.UML2.Relationship;
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
import org.csu.slicing.UML2.StructuralFeature;
import org.csu.slicing.UML2.StructuralFeatureAction;
import org.csu.slicing.UML2.StructuredActivityNode;
import org.csu.slicing.UML2.StructuredClassifier;
import org.csu.slicing.UML2.Substitution;
import org.csu.slicing.UML2.TemplateBinding;
import org.csu.slicing.UML2.TemplateParameter;
import org.csu.slicing.UML2.TemplateParameterSubstitution;
import org.csu.slicing.UML2.TemplateSignature;
import org.csu.slicing.UML2.TemplateableClassifier;
import org.csu.slicing.UML2.TemplateableElement;
import org.csu.slicing.UML2.TestIdentityAction;
import org.csu.slicing.UML2.TimeConstraint;
import org.csu.slicing.UML2.TimeExpression;
import org.csu.slicing.UML2.TimeInterval;
import org.csu.slicing.UML2.TimeObservationAction;
import org.csu.slicing.UML2.TimeTrigger;
import org.csu.slicing.UML2.Transition;
import org.csu.slicing.UML2.Trigger;
import org.csu.slicing.UML2.Type;
import org.csu.slicing.UML2.TypedElement;
import org.csu.slicing.UML2.UML2Package;
import org.csu.slicing.UML2.Usage;
import org.csu.slicing.UML2.UseCase;
import org.csu.slicing.UML2.ValuePin;
import org.csu.slicing.UML2.ValueSpecification;
import org.csu.slicing.UML2.Variable;
import org.csu.slicing.UML2.VariableAction;
import org.csu.slicing.UML2.Vertex;
import org.csu.slicing.UML2.WriteLinkAction;
import org.csu.slicing.UML2.WriteStructuralFeatureAction;
import org.csu.slicing.UML2.WriteVariableAction;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.csu.slicing.UML2.UML2Package
 * @generated
 */
public class UML2AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static UML2Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UML2AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = UML2Package.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UML2Switch<Adapter> modelSwitch =
		new UML2Switch<Adapter>() {
			@Override
			public Adapter caseElement(Element object) {
				return createElementAdapter();
			}
			@Override
			public Adapter caseMultiplicityElement(MultiplicityElement object) {
				return createMultiplicityElementAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseNamespace(Namespace object) {
				return createNamespaceAdapter();
			}
			@Override
			public Adapter caseOpaqueExpression(OpaqueExpression object) {
				return createOpaqueExpressionAdapter();
			}
			@Override
			public Adapter caseValueSpecification(ValueSpecification object) {
				return createValueSpecificationAdapter();
			}
			@Override
			public Adapter caseExpression(Expression object) {
				return createExpressionAdapter();
			}
			@Override
			public Adapter caseComment(Comment object) {
				return createCommentAdapter();
			}
			@Override
			public Adapter caseDirectedRelationship(DirectedRelationship object) {
				return createDirectedRelationshipAdapter();
			}
			@Override
			public Adapter caseRelationship(Relationship object) {
				return createRelationshipAdapter();
			}
			@Override
			public Adapter caseClass(org.csu.slicing.UML2.Class object) {
				return createClassAdapter();
			}
			@Override
			public Adapter caseType(Type object) {
				return createTypeAdapter();
			}
			@Override
			public Adapter caseProperty(Property object) {
				return createPropertyAdapter();
			}
			@Override
			public Adapter caseOperation(Operation object) {
				return createOperationAdapter();
			}
			@Override
			public Adapter caseTypedElement(TypedElement object) {
				return createTypedElementAdapter();
			}
			@Override
			public Adapter caseParameter(Parameter object) {
				return createParameterAdapter();
			}
			@Override
			public Adapter casePackage(org.csu.slicing.UML2.Package object) {
				return createPackageAdapter();
			}
			@Override
			public Adapter caseEnumeration(Enumeration object) {
				return createEnumerationAdapter();
			}
			@Override
			public Adapter caseDataType(DataType object) {
				return createDataTypeAdapter();
			}
			@Override
			public Adapter caseEnumerationLiteral(EnumerationLiteral object) {
				return createEnumerationLiteralAdapter();
			}
			@Override
			public Adapter casePrimitiveType(PrimitiveType object) {
				return createPrimitiveTypeAdapter();
			}
			@Override
			public Adapter caseClassifier(Classifier object) {
				return createClassifierAdapter();
			}
			@Override
			public Adapter caseFeature(Feature object) {
				return createFeatureAdapter();
			}
			@Override
			public Adapter caseConstraint(Constraint object) {
				return createConstraintAdapter();
			}
			@Override
			public Adapter caseLiteralBoolean(LiteralBoolean object) {
				return createLiteralBooleanAdapter();
			}
			@Override
			public Adapter caseLiteralSpecification(LiteralSpecification object) {
				return createLiteralSpecificationAdapter();
			}
			@Override
			public Adapter caseLiteralString(LiteralString object) {
				return createLiteralStringAdapter();
			}
			@Override
			public Adapter caseLiteralNull(LiteralNull object) {
				return createLiteralNullAdapter();
			}
			@Override
			public Adapter caseLiteralInteger(LiteralInteger object) {
				return createLiteralIntegerAdapter();
			}
			@Override
			public Adapter caseLiteralUnlimitedNatural(LiteralUnlimitedNatural object) {
				return createLiteralUnlimitedNaturalAdapter();
			}
			@Override
			public Adapter caseBehavioralFeature(BehavioralFeature object) {
				return createBehavioralFeatureAdapter();
			}
			@Override
			public Adapter caseStructuralFeature(StructuralFeature object) {
				return createStructuralFeatureAdapter();
			}
			@Override
			public Adapter caseInstanceSpecification(InstanceSpecification object) {
				return createInstanceSpecificationAdapter();
			}
			@Override
			public Adapter caseSlot(Slot object) {
				return createSlotAdapter();
			}
			@Override
			public Adapter caseInstanceValue(InstanceValue object) {
				return createInstanceValueAdapter();
			}
			@Override
			public Adapter caseRedefinableElement(RedefinableElement object) {
				return createRedefinableElementAdapter();
			}
			@Override
			public Adapter caseGeneralization(Generalization object) {
				return createGeneralizationAdapter();
			}
			@Override
			public Adapter casePackageableElement(PackageableElement object) {
				return createPackageableElementAdapter();
			}
			@Override
			public Adapter caseElementImport(ElementImport object) {
				return createElementImportAdapter();
			}
			@Override
			public Adapter casePackageImport(PackageImport object) {
				return createPackageImportAdapter();
			}
			@Override
			public Adapter caseAssociation(Association object) {
				return createAssociationAdapter();
			}
			@Override
			public Adapter casePackageMerge(PackageMerge object) {
				return createPackageMergeAdapter();
			}
			@Override
			public Adapter caseStereotype(Stereotype object) {
				return createStereotypeAdapter();
			}
			@Override
			public Adapter caseProfile(Profile object) {
				return createProfileAdapter();
			}
			@Override
			public Adapter caseProfileApplication(ProfileApplication object) {
				return createProfileApplicationAdapter();
			}
			@Override
			public Adapter caseExtension(Extension object) {
				return createExtensionAdapter();
			}
			@Override
			public Adapter caseExtensionEnd(ExtensionEnd object) {
				return createExtensionEndAdapter();
			}
			@Override
			public Adapter caseBehavior(Behavior object) {
				return createBehaviorAdapter();
			}
			@Override
			public Adapter caseBehavioredClassifier(BehavioredClassifier object) {
				return createBehavioredClassifierAdapter();
			}
			@Override
			public Adapter caseActivity(Activity object) {
				return createActivityAdapter();
			}
			@Override
			public Adapter casePermission(Permission object) {
				return createPermissionAdapter();
			}
			@Override
			public Adapter caseDependency(Dependency object) {
				return createDependencyAdapter();
			}
			@Override
			public Adapter caseUsage(Usage object) {
				return createUsageAdapter();
			}
			@Override
			public Adapter caseAbstraction(Abstraction object) {
				return createAbstractionAdapter();
			}
			@Override
			public Adapter caseRealization(Realization object) {
				return createRealizationAdapter();
			}
			@Override
			public Adapter caseSubstitution(Substitution object) {
				return createSubstitutionAdapter();
			}
			@Override
			public Adapter caseGeneralizationSet(GeneralizationSet object) {
				return createGeneralizationSetAdapter();
			}
			@Override
			public Adapter caseAssociationClass(AssociationClass object) {
				return createAssociationClassAdapter();
			}
			@Override
			public Adapter caseInformationItem(InformationItem object) {
				return createInformationItemAdapter();
			}
			@Override
			public Adapter caseInformationFlow(InformationFlow object) {
				return createInformationFlowAdapter();
			}
			@Override
			public Adapter caseModel(Model object) {
				return createModelAdapter();
			}
			@Override
			public Adapter caseConnectorEnd(ConnectorEnd object) {
				return createConnectorEndAdapter();
			}
			@Override
			public Adapter caseConnectableElement(ConnectableElement object) {
				return createConnectableElementAdapter();
			}
			@Override
			public Adapter caseConnector(Connector object) {
				return createConnectorAdapter();
			}
			@Override
			public Adapter caseStructuredClassifier(StructuredClassifier object) {
				return createStructuredClassifierAdapter();
			}
			@Override
			public Adapter caseActivityEdge(ActivityEdge object) {
				return createActivityEdgeAdapter();
			}
			@Override
			public Adapter caseActivityGroup(ActivityGroup object) {
				return createActivityGroupAdapter();
			}
			@Override
			public Adapter caseActivityNode(ActivityNode object) {
				return createActivityNodeAdapter();
			}
			@Override
			public Adapter caseAction(Action object) {
				return createActionAdapter();
			}
			@Override
			public Adapter caseObjectNode(ObjectNode object) {
				return createObjectNodeAdapter();
			}
			@Override
			public Adapter caseControlNode(ControlNode object) {
				return createControlNodeAdapter();
			}
			@Override
			public Adapter caseControlFlow(ControlFlow object) {
				return createControlFlowAdapter();
			}
			@Override
			public Adapter caseObjectFlow(ObjectFlow object) {
				return createObjectFlowAdapter();
			}
			@Override
			public Adapter caseInitialNode(InitialNode object) {
				return createInitialNodeAdapter();
			}
			@Override
			public Adapter caseFinalNode(FinalNode object) {
				return createFinalNodeAdapter();
			}
			@Override
			public Adapter caseActivityFinalNode(ActivityFinalNode object) {
				return createActivityFinalNodeAdapter();
			}
			@Override
			public Adapter caseDecisionNode(DecisionNode object) {
				return createDecisionNodeAdapter();
			}
			@Override
			public Adapter caseMergeNode(MergeNode object) {
				return createMergeNodeAdapter();
			}
			@Override
			public Adapter caseExecutableNode(ExecutableNode object) {
				return createExecutableNodeAdapter();
			}
			@Override
			public Adapter caseOutputPin(OutputPin object) {
				return createOutputPinAdapter();
			}
			@Override
			public Adapter caseInputPin(InputPin object) {
				return createInputPinAdapter();
			}
			@Override
			public Adapter casePin(Pin object) {
				return createPinAdapter();
			}
			@Override
			public Adapter caseActivityParameterNode(ActivityParameterNode object) {
				return createActivityParameterNodeAdapter();
			}
			@Override
			public Adapter caseValuePin(ValuePin object) {
				return createValuePinAdapter();
			}
			@Override
			public Adapter caseInterface(Interface object) {
				return createInterfaceAdapter();
			}
			@Override
			public Adapter caseImplementation(Implementation object) {
				return createImplementationAdapter();
			}
			@Override
			public Adapter caseArtifact(Artifact object) {
				return createArtifactAdapter();
			}
			@Override
			public Adapter caseManifestation(Manifestation object) {
				return createManifestationAdapter();
			}
			@Override
			public Adapter caseActor(Actor object) {
				return createActorAdapter();
			}
			@Override
			public Adapter caseExtend(Extend object) {
				return createExtendAdapter();
			}
			@Override
			public Adapter caseUseCase(UseCase object) {
				return createUseCaseAdapter();
			}
			@Override
			public Adapter caseExtensionPoint(ExtensionPoint object) {
				return createExtensionPointAdapter();
			}
			@Override
			public Adapter caseInclude(Include object) {
				return createIncludeAdapter();
			}
			@Override
			public Adapter caseCollaborationOccurrence(CollaborationOccurrence object) {
				return createCollaborationOccurrenceAdapter();
			}
			@Override
			public Adapter caseCollaboration(Collaboration object) {
				return createCollaborationAdapter();
			}
			@Override
			public Adapter casePort(Port object) {
				return createPortAdapter();
			}
			@Override
			public Adapter caseEncapsulatedClassifier(EncapsulatedClassifier object) {
				return createEncapsulatedClassifierAdapter();
			}
			@Override
			public Adapter caseCallTrigger(CallTrigger object) {
				return createCallTriggerAdapter();
			}
			@Override
			public Adapter caseMessageTrigger(MessageTrigger object) {
				return createMessageTriggerAdapter();
			}
			@Override
			public Adapter caseChangeTrigger(ChangeTrigger object) {
				return createChangeTriggerAdapter();
			}
			@Override
			public Adapter caseTrigger(Trigger object) {
				return createTriggerAdapter();
			}
			@Override
			public Adapter caseReception(Reception object) {
				return createReceptionAdapter();
			}
			@Override
			public Adapter caseSignal(Signal object) {
				return createSignalAdapter();
			}
			@Override
			public Adapter caseSignalTrigger(SignalTrigger object) {
				return createSignalTriggerAdapter();
			}
			@Override
			public Adapter caseTimeTrigger(TimeTrigger object) {
				return createTimeTriggerAdapter();
			}
			@Override
			public Adapter caseAnyTrigger(AnyTrigger object) {
				return createAnyTriggerAdapter();
			}
			@Override
			public Adapter caseVariable(Variable object) {
				return createVariableAdapter();
			}
			@Override
			public Adapter caseStructuredActivityNode(StructuredActivityNode object) {
				return createStructuredActivityNodeAdapter();
			}
			@Override
			public Adapter caseConditionalNode(ConditionalNode object) {
				return createConditionalNodeAdapter();
			}
			@Override
			public Adapter caseClause(Clause object) {
				return createClauseAdapter();
			}
			@Override
			public Adapter caseLoopNode(LoopNode object) {
				return createLoopNodeAdapter();
			}
			@Override
			public Adapter caseInteraction(Interaction object) {
				return createInteractionAdapter();
			}
			@Override
			public Adapter caseInteractionFragment(InteractionFragment object) {
				return createInteractionFragmentAdapter();
			}
			@Override
			public Adapter caseLifeline(Lifeline object) {
				return createLifelineAdapter();
			}
			@Override
			public Adapter caseMessage(Message object) {
				return createMessageAdapter();
			}
			@Override
			public Adapter caseGeneralOrdering(GeneralOrdering object) {
				return createGeneralOrderingAdapter();
			}
			@Override
			public Adapter caseMessageEnd(MessageEnd object) {
				return createMessageEndAdapter();
			}
			@Override
			public Adapter caseEventOccurrence(EventOccurrence object) {
				return createEventOccurrenceAdapter();
			}
			@Override
			public Adapter caseExecutionOccurrence(ExecutionOccurrence object) {
				return createExecutionOccurrenceAdapter();
			}
			@Override
			public Adapter caseStateInvariant(StateInvariant object) {
				return createStateInvariantAdapter();
			}
			@Override
			public Adapter caseStop(Stop object) {
				return createStopAdapter();
			}
			@Override
			public Adapter caseTemplateSignature(TemplateSignature object) {
				return createTemplateSignatureAdapter();
			}
			@Override
			public Adapter caseTemplateParameter(TemplateParameter object) {
				return createTemplateParameterAdapter();
			}
			@Override
			public Adapter caseTemplateableElement(TemplateableElement object) {
				return createTemplateableElementAdapter();
			}
			@Override
			public Adapter caseStringExpression(StringExpression object) {
				return createStringExpressionAdapter();
			}
			@Override
			public Adapter caseParameterableElement(ParameterableElement object) {
				return createParameterableElementAdapter();
			}
			@Override
			public Adapter caseTemplateBinding(TemplateBinding object) {
				return createTemplateBindingAdapter();
			}
			@Override
			public Adapter caseTemplateParameterSubstitution(TemplateParameterSubstitution object) {
				return createTemplateParameterSubstitutionAdapter();
			}
			@Override
			public Adapter caseOperationTemplateParameter(OperationTemplateParameter object) {
				return createOperationTemplateParameterAdapter();
			}
			@Override
			public Adapter caseClassifierTemplateParameter(ClassifierTemplateParameter object) {
				return createClassifierTemplateParameterAdapter();
			}
			@Override
			public Adapter caseParameterableClassifier(ParameterableClassifier object) {
				return createParameterableClassifierAdapter();
			}
			@Override
			public Adapter caseRedefinableTemplateSignature(RedefinableTemplateSignature object) {
				return createRedefinableTemplateSignatureAdapter();
			}
			@Override
			public Adapter caseTemplateableClassifier(TemplateableClassifier object) {
				return createTemplateableClassifierAdapter();
			}
			@Override
			public Adapter caseConnectableElementTemplateParameter(ConnectableElementTemplateParameter object) {
				return createConnectableElementTemplateParameterAdapter();
			}
			@Override
			public Adapter caseForkNode(ForkNode object) {
				return createForkNodeAdapter();
			}
			@Override
			public Adapter caseJoinNode(JoinNode object) {
				return createJoinNodeAdapter();
			}
			@Override
			public Adapter caseFlowFinalNode(FlowFinalNode object) {
				return createFlowFinalNodeAdapter();
			}
			@Override
			public Adapter caseCentralBufferNode(CentralBufferNode object) {
				return createCentralBufferNodeAdapter();
			}
			@Override
			public Adapter caseActivityPartition(ActivityPartition object) {
				return createActivityPartitionAdapter();
			}
			@Override
			public Adapter caseExpansionNode(ExpansionNode object) {
				return createExpansionNodeAdapter();
			}
			@Override
			public Adapter caseExpansionRegion(ExpansionRegion object) {
				return createExpansionRegionAdapter();
			}
			@Override
			public Adapter caseExceptionHandler(ExceptionHandler object) {
				return createExceptionHandlerAdapter();
			}
			@Override
			public Adapter caseInteractionOccurrence(InteractionOccurrence object) {
				return createInteractionOccurrenceAdapter();
			}
			@Override
			public Adapter caseGate(Gate object) {
				return createGateAdapter();
			}
			@Override
			public Adapter casePartDecomposition(PartDecomposition object) {
				return createPartDecompositionAdapter();
			}
			@Override
			public Adapter caseInteractionOperand(InteractionOperand object) {
				return createInteractionOperandAdapter();
			}
			@Override
			public Adapter caseInteractionConstraint(InteractionConstraint object) {
				return createInteractionConstraintAdapter();
			}
			@Override
			public Adapter caseCombinedFragment(CombinedFragment object) {
				return createCombinedFragmentAdapter();
			}
			@Override
			public Adapter caseContinuation(Continuation object) {
				return createContinuationAdapter();
			}
			@Override
			public Adapter caseStateMachine(StateMachine object) {
				return createStateMachineAdapter();
			}
			@Override
			public Adapter caseRegion(Region object) {
				return createRegionAdapter();
			}
			@Override
			public Adapter casePseudostate(Pseudostate object) {
				return createPseudostateAdapter();
			}
			@Override
			public Adapter caseState(State object) {
				return createStateAdapter();
			}
			@Override
			public Adapter caseVertex(Vertex object) {
				return createVertexAdapter();
			}
			@Override
			public Adapter caseConnectionPointReference(ConnectionPointReference object) {
				return createConnectionPointReferenceAdapter();
			}
			@Override
			public Adapter caseTransition(Transition object) {
				return createTransitionAdapter();
			}
			@Override
			public Adapter caseFinalState(FinalState object) {
				return createFinalStateAdapter();
			}
			@Override
			public Adapter caseCreateObjectAction(CreateObjectAction object) {
				return createCreateObjectActionAdapter();
			}
			@Override
			public Adapter caseDestroyObjectAction(DestroyObjectAction object) {
				return createDestroyObjectActionAdapter();
			}
			@Override
			public Adapter caseTestIdentityAction(TestIdentityAction object) {
				return createTestIdentityActionAdapter();
			}
			@Override
			public Adapter caseReadSelfAction(ReadSelfAction object) {
				return createReadSelfActionAdapter();
			}
			@Override
			public Adapter caseStructuralFeatureAction(StructuralFeatureAction object) {
				return createStructuralFeatureActionAdapter();
			}
			@Override
			public Adapter caseReadStructuralFeatureAction(ReadStructuralFeatureAction object) {
				return createReadStructuralFeatureActionAdapter();
			}
			@Override
			public Adapter caseWriteStructuralFeatureAction(WriteStructuralFeatureAction object) {
				return createWriteStructuralFeatureActionAdapter();
			}
			@Override
			public Adapter caseClearStructuralFeatureAction(ClearStructuralFeatureAction object) {
				return createClearStructuralFeatureActionAdapter();
			}
			@Override
			public Adapter caseRemoveStructuralFeatureValueAction(RemoveStructuralFeatureValueAction object) {
				return createRemoveStructuralFeatureValueActionAdapter();
			}
			@Override
			public Adapter caseAddStructuralFeatureValueAction(AddStructuralFeatureValueAction object) {
				return createAddStructuralFeatureValueActionAdapter();
			}
			@Override
			public Adapter caseLinkAction(LinkAction object) {
				return createLinkActionAdapter();
			}
			@Override
			public Adapter caseLinkEndData(LinkEndData object) {
				return createLinkEndDataAdapter();
			}
			@Override
			public Adapter caseReadLinkAction(ReadLinkAction object) {
				return createReadLinkActionAdapter();
			}
			@Override
			public Adapter caseLinkEndCreationData(LinkEndCreationData object) {
				return createLinkEndCreationDataAdapter();
			}
			@Override
			public Adapter caseCreateLinkAction(CreateLinkAction object) {
				return createCreateLinkActionAdapter();
			}
			@Override
			public Adapter caseWriteLinkAction(WriteLinkAction object) {
				return createWriteLinkActionAdapter();
			}
			@Override
			public Adapter caseDestroyLinkAction(DestroyLinkAction object) {
				return createDestroyLinkActionAdapter();
			}
			@Override
			public Adapter caseClearAssociationAction(ClearAssociationAction object) {
				return createClearAssociationActionAdapter();
			}
			@Override
			public Adapter caseVariableAction(VariableAction object) {
				return createVariableActionAdapter();
			}
			@Override
			public Adapter caseReadVariableAction(ReadVariableAction object) {
				return createReadVariableActionAdapter();
			}
			@Override
			public Adapter caseWriteVariableAction(WriteVariableAction object) {
				return createWriteVariableActionAdapter();
			}
			@Override
			public Adapter caseClearVariableAction(ClearVariableAction object) {
				return createClearVariableActionAdapter();
			}
			@Override
			public Adapter caseAddVariableValueAction(AddVariableValueAction object) {
				return createAddVariableValueActionAdapter();
			}
			@Override
			public Adapter caseRemoveVariableValueAction(RemoveVariableValueAction object) {
				return createRemoveVariableValueActionAdapter();
			}
			@Override
			public Adapter caseApplyFunctionAction(ApplyFunctionAction object) {
				return createApplyFunctionActionAdapter();
			}
			@Override
			public Adapter casePrimitiveFunction(PrimitiveFunction object) {
				return createPrimitiveFunctionAdapter();
			}
			@Override
			public Adapter caseCallAction(CallAction object) {
				return createCallActionAdapter();
			}
			@Override
			public Adapter caseInvocationAction(InvocationAction object) {
				return createInvocationActionAdapter();
			}
			@Override
			public Adapter caseSendSignalAction(SendSignalAction object) {
				return createSendSignalActionAdapter();
			}
			@Override
			public Adapter caseBroadcastSignalAction(BroadcastSignalAction object) {
				return createBroadcastSignalActionAdapter();
			}
			@Override
			public Adapter caseSendObjectAction(SendObjectAction object) {
				return createSendObjectActionAdapter();
			}
			@Override
			public Adapter caseCallOperationAction(CallOperationAction object) {
				return createCallOperationActionAdapter();
			}
			@Override
			public Adapter caseCallBehaviorAction(CallBehaviorAction object) {
				return createCallBehaviorActionAdapter();
			}
			@Override
			public Adapter caseTimeExpression(TimeExpression object) {
				return createTimeExpressionAdapter();
			}
			@Override
			public Adapter caseDuration(Duration object) {
				return createDurationAdapter();
			}
			@Override
			public Adapter caseTimeObservationAction(TimeObservationAction object) {
				return createTimeObservationActionAdapter();
			}
			@Override
			public Adapter caseDurationInterval(DurationInterval object) {
				return createDurationIntervalAdapter();
			}
			@Override
			public Adapter caseInterval(Interval object) {
				return createIntervalAdapter();
			}
			@Override
			public Adapter caseTimeConstraint(TimeConstraint object) {
				return createTimeConstraintAdapter();
			}
			@Override
			public Adapter caseIntervalConstraint(IntervalConstraint object) {
				return createIntervalConstraintAdapter();
			}
			@Override
			public Adapter caseTimeInterval(TimeInterval object) {
				return createTimeIntervalAdapter();
			}
			@Override
			public Adapter caseDurationObservationAction(DurationObservationAction object) {
				return createDurationObservationActionAdapter();
			}
			@Override
			public Adapter caseDurationConstraint(DurationConstraint object) {
				return createDurationConstraintAdapter();
			}
			@Override
			public Adapter caseDataStoreNode(DataStoreNode object) {
				return createDataStoreNodeAdapter();
			}
			@Override
			public Adapter caseInterruptibleActivityRegion(InterruptibleActivityRegion object) {
				return createInterruptibleActivityRegionAdapter();
			}
			@Override
			public Adapter caseParameterSet(ParameterSet object) {
				return createParameterSetAdapter();
			}
			@Override
			public Adapter caseComponent(Component object) {
				return createComponentAdapter();
			}
			@Override
			public Adapter caseDeployment(Deployment object) {
				return createDeploymentAdapter();
			}
			@Override
			public Adapter caseDeployedArtifact(DeployedArtifact object) {
				return createDeployedArtifactAdapter();
			}
			@Override
			public Adapter caseDeploymentTarget(DeploymentTarget object) {
				return createDeploymentTargetAdapter();
			}
			@Override
			public Adapter caseNode(Node object) {
				return createNodeAdapter();
			}
			@Override
			public Adapter caseDevice(Device object) {
				return createDeviceAdapter();
			}
			@Override
			public Adapter caseExecutionEnvironment(ExecutionEnvironment object) {
				return createExecutionEnvironmentAdapter();
			}
			@Override
			public Adapter caseCommunicationPath(CommunicationPath object) {
				return createCommunicationPathAdapter();
			}
			@Override
			public Adapter caseProtocolConformance(ProtocolConformance object) {
				return createProtocolConformanceAdapter();
			}
			@Override
			public Adapter caseProtocolStateMachine(ProtocolStateMachine object) {
				return createProtocolStateMachineAdapter();
			}
			@Override
			public Adapter caseProtocolTransition(ProtocolTransition object) {
				return createProtocolTransitionAdapter();
			}
			@Override
			public Adapter caseReadExtentAction(ReadExtentAction object) {
				return createReadExtentActionAdapter();
			}
			@Override
			public Adapter caseReclassifyObjectAction(ReclassifyObjectAction object) {
				return createReclassifyObjectActionAdapter();
			}
			@Override
			public Adapter caseReadIsClassifiedObjectAction(ReadIsClassifiedObjectAction object) {
				return createReadIsClassifiedObjectActionAdapter();
			}
			@Override
			public Adapter caseStartOwnedBehaviorAction(StartOwnedBehaviorAction object) {
				return createStartOwnedBehaviorActionAdapter();
			}
			@Override
			public Adapter caseQualifierValue(QualifierValue object) {
				return createQualifierValueAdapter();
			}
			@Override
			public Adapter caseReadLinkObjectEndAction(ReadLinkObjectEndAction object) {
				return createReadLinkObjectEndActionAdapter();
			}
			@Override
			public Adapter caseReadLinkObjectEndQualifierAction(ReadLinkObjectEndQualifierAction object) {
				return createReadLinkObjectEndQualifierActionAdapter();
			}
			@Override
			public Adapter caseCreateLinkObjectAction(CreateLinkObjectAction object) {
				return createCreateLinkObjectActionAdapter();
			}
			@Override
			public Adapter caseAcceptEventAction(AcceptEventAction object) {
				return createAcceptEventActionAdapter();
			}
			@Override
			public Adapter caseAcceptCallAction(AcceptCallAction object) {
				return createAcceptCallActionAdapter();
			}
			@Override
			public Adapter caseReplyAction(ReplyAction object) {
				return createReplyActionAdapter();
			}
			@Override
			public Adapter caseRaiseExceptionAction(RaiseExceptionAction object) {
				return createRaiseExceptionActionAdapter();
			}
			@Override
			public Adapter caseDeploymentSpecification(DeploymentSpecification object) {
				return createDeploymentSpecificationAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.MultiplicityElement <em>Multiplicity Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.MultiplicityElement
	 * @generated
	 */
	public Adapter createMultiplicityElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.Namespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.Namespace
	 * @generated
	 */
	public Adapter createNamespaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.OpaqueExpression <em>Opaque Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.OpaqueExpression
	 * @generated
	 */
	public Adapter createOpaqueExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.ValueSpecification <em>Value Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.ValueSpecification
	 * @generated
	 */
	public Adapter createValueSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.Comment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.Comment
	 * @generated
	 */
	public Adapter createCommentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.DirectedRelationship <em>Directed Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.DirectedRelationship
	 * @generated
	 */
	public Adapter createDirectedRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.Relationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.Relationship
	 * @generated
	 */
	public Adapter createRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.Class
	 * @generated
	 */
	public Adapter createClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.Type
	 * @generated
	 */
	public Adapter createTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.Property
	 * @generated
	 */
	public Adapter createPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.Operation
	 * @generated
	 */
	public Adapter createOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.TypedElement <em>Typed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.TypedElement
	 * @generated
	 */
	public Adapter createTypedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.Parameter
	 * @generated
	 */
	public Adapter createParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.Package
	 * @generated
	 */
	public Adapter createPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.Enumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.Enumeration
	 * @generated
	 */
	public Adapter createEnumerationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.DataType
	 * @generated
	 */
	public Adapter createDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.EnumerationLiteral <em>Enumeration Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.EnumerationLiteral
	 * @generated
	 */
	public Adapter createEnumerationLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.PrimitiveType <em>Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.PrimitiveType
	 * @generated
	 */
	public Adapter createPrimitiveTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.Classifier <em>Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.Classifier
	 * @generated
	 */
	public Adapter createClassifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.Feature
	 * @generated
	 */
	public Adapter createFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.Constraint
	 * @generated
	 */
	public Adapter createConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.LiteralBoolean <em>Literal Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.LiteralBoolean
	 * @generated
	 */
	public Adapter createLiteralBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.LiteralSpecification <em>Literal Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.LiteralSpecification
	 * @generated
	 */
	public Adapter createLiteralSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.LiteralString <em>Literal String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.LiteralString
	 * @generated
	 */
	public Adapter createLiteralStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.LiteralNull <em>Literal Null</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.LiteralNull
	 * @generated
	 */
	public Adapter createLiteralNullAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.LiteralInteger <em>Literal Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.LiteralInteger
	 * @generated
	 */
	public Adapter createLiteralIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.LiteralUnlimitedNatural <em>Literal Unlimited Natural</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.LiteralUnlimitedNatural
	 * @generated
	 */
	public Adapter createLiteralUnlimitedNaturalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.BehavioralFeature <em>Behavioral Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.BehavioralFeature
	 * @generated
	 */
	public Adapter createBehavioralFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.StructuralFeature <em>Structural Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.StructuralFeature
	 * @generated
	 */
	public Adapter createStructuralFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.InstanceSpecification <em>Instance Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.InstanceSpecification
	 * @generated
	 */
	public Adapter createInstanceSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.Slot <em>Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.Slot
	 * @generated
	 */
	public Adapter createSlotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.InstanceValue <em>Instance Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.InstanceValue
	 * @generated
	 */
	public Adapter createInstanceValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.RedefinableElement <em>Redefinable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.RedefinableElement
	 * @generated
	 */
	public Adapter createRedefinableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.Generalization <em>Generalization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.Generalization
	 * @generated
	 */
	public Adapter createGeneralizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.PackageableElement <em>Packageable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.PackageableElement
	 * @generated
	 */
	public Adapter createPackageableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.ElementImport <em>Element Import</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.ElementImport
	 * @generated
	 */
	public Adapter createElementImportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.PackageImport <em>Package Import</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.PackageImport
	 * @generated
	 */
	public Adapter createPackageImportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.Association <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.Association
	 * @generated
	 */
	public Adapter createAssociationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.PackageMerge <em>Package Merge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.PackageMerge
	 * @generated
	 */
	public Adapter createPackageMergeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.Stereotype <em>Stereotype</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.Stereotype
	 * @generated
	 */
	public Adapter createStereotypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.Profile <em>Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.Profile
	 * @generated
	 */
	public Adapter createProfileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.ProfileApplication <em>Profile Application</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.ProfileApplication
	 * @generated
	 */
	public Adapter createProfileApplicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.Extension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.Extension
	 * @generated
	 */
	public Adapter createExtensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.ExtensionEnd <em>Extension End</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.ExtensionEnd
	 * @generated
	 */
	public Adapter createExtensionEndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.Behavior <em>Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.Behavior
	 * @generated
	 */
	public Adapter createBehaviorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.BehavioredClassifier <em>Behaviored Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.BehavioredClassifier
	 * @generated
	 */
	public Adapter createBehavioredClassifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.Activity
	 * @generated
	 */
	public Adapter createActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.Permission <em>Permission</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.Permission
	 * @generated
	 */
	public Adapter createPermissionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.Dependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.Dependency
	 * @generated
	 */
	public Adapter createDependencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.Usage <em>Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.Usage
	 * @generated
	 */
	public Adapter createUsageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.Abstraction <em>Abstraction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.Abstraction
	 * @generated
	 */
	public Adapter createAbstractionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.Realization <em>Realization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.Realization
	 * @generated
	 */
	public Adapter createRealizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.Substitution <em>Substitution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.Substitution
	 * @generated
	 */
	public Adapter createSubstitutionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.GeneralizationSet <em>Generalization Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.GeneralizationSet
	 * @generated
	 */
	public Adapter createGeneralizationSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.AssociationClass <em>Association Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.AssociationClass
	 * @generated
	 */
	public Adapter createAssociationClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.InformationItem <em>Information Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.InformationItem
	 * @generated
	 */
	public Adapter createInformationItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.InformationFlow <em>Information Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.InformationFlow
	 * @generated
	 */
	public Adapter createInformationFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.Model
	 * @generated
	 */
	public Adapter createModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.ConnectorEnd <em>Connector End</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.ConnectorEnd
	 * @generated
	 */
	public Adapter createConnectorEndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.ConnectableElement <em>Connectable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.ConnectableElement
	 * @generated
	 */
	public Adapter createConnectableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.Connector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.Connector
	 * @generated
	 */
	public Adapter createConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.StructuredClassifier <em>Structured Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.StructuredClassifier
	 * @generated
	 */
	public Adapter createStructuredClassifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.ActivityEdge <em>Activity Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.ActivityEdge
	 * @generated
	 */
	public Adapter createActivityEdgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.ActivityGroup <em>Activity Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.ActivityGroup
	 * @generated
	 */
	public Adapter createActivityGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.ActivityNode <em>Activity Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.ActivityNode
	 * @generated
	 */
	public Adapter createActivityNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.Action
	 * @generated
	 */
	public Adapter createActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.ObjectNode <em>Object Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.ObjectNode
	 * @generated
	 */
	public Adapter createObjectNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.ControlNode <em>Control Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.ControlNode
	 * @generated
	 */
	public Adapter createControlNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.ControlFlow <em>Control Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.ControlFlow
	 * @generated
	 */
	public Adapter createControlFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.ObjectFlow <em>Object Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.ObjectFlow
	 * @generated
	 */
	public Adapter createObjectFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.InitialNode <em>Initial Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.InitialNode
	 * @generated
	 */
	public Adapter createInitialNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.FinalNode <em>Final Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.FinalNode
	 * @generated
	 */
	public Adapter createFinalNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.ActivityFinalNode <em>Activity Final Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.ActivityFinalNode
	 * @generated
	 */
	public Adapter createActivityFinalNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.DecisionNode <em>Decision Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.DecisionNode
	 * @generated
	 */
	public Adapter createDecisionNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.MergeNode <em>Merge Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.MergeNode
	 * @generated
	 */
	public Adapter createMergeNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.ExecutableNode <em>Executable Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.ExecutableNode
	 * @generated
	 */
	public Adapter createExecutableNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.OutputPin <em>Output Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.OutputPin
	 * @generated
	 */
	public Adapter createOutputPinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.InputPin <em>Input Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.InputPin
	 * @generated
	 */
	public Adapter createInputPinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.Pin <em>Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.Pin
	 * @generated
	 */
	public Adapter createPinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.ActivityParameterNode <em>Activity Parameter Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.ActivityParameterNode
	 * @generated
	 */
	public Adapter createActivityParameterNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.ValuePin <em>Value Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.ValuePin
	 * @generated
	 */
	public Adapter createValuePinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.Interface
	 * @generated
	 */
	public Adapter createInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.Implementation <em>Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.Implementation
	 * @generated
	 */
	public Adapter createImplementationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.Artifact <em>Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.Artifact
	 * @generated
	 */
	public Adapter createArtifactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.Manifestation <em>Manifestation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.Manifestation
	 * @generated
	 */
	public Adapter createManifestationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.Actor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.Actor
	 * @generated
	 */
	public Adapter createActorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.Extend <em>Extend</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.Extend
	 * @generated
	 */
	public Adapter createExtendAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.UseCase <em>Use Case</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.UseCase
	 * @generated
	 */
	public Adapter createUseCaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.ExtensionPoint <em>Extension Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.ExtensionPoint
	 * @generated
	 */
	public Adapter createExtensionPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.Include <em>Include</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.Include
	 * @generated
	 */
	public Adapter createIncludeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.CollaborationOccurrence <em>Collaboration Occurrence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.CollaborationOccurrence
	 * @generated
	 */
	public Adapter createCollaborationOccurrenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.Collaboration <em>Collaboration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.Collaboration
	 * @generated
	 */
	public Adapter createCollaborationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.Port
	 * @generated
	 */
	public Adapter createPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.EncapsulatedClassifier <em>Encapsulated Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.EncapsulatedClassifier
	 * @generated
	 */
	public Adapter createEncapsulatedClassifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.CallTrigger <em>Call Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.CallTrigger
	 * @generated
	 */
	public Adapter createCallTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.MessageTrigger <em>Message Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.MessageTrigger
	 * @generated
	 */
	public Adapter createMessageTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.ChangeTrigger <em>Change Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.ChangeTrigger
	 * @generated
	 */
	public Adapter createChangeTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.Trigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.Trigger
	 * @generated
	 */
	public Adapter createTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.Reception <em>Reception</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.Reception
	 * @generated
	 */
	public Adapter createReceptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.Signal <em>Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.Signal
	 * @generated
	 */
	public Adapter createSignalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.SignalTrigger <em>Signal Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.SignalTrigger
	 * @generated
	 */
	public Adapter createSignalTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.TimeTrigger <em>Time Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.TimeTrigger
	 * @generated
	 */
	public Adapter createTimeTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.AnyTrigger <em>Any Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.AnyTrigger
	 * @generated
	 */
	public Adapter createAnyTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.Variable
	 * @generated
	 */
	public Adapter createVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.StructuredActivityNode <em>Structured Activity Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.StructuredActivityNode
	 * @generated
	 */
	public Adapter createStructuredActivityNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.ConditionalNode <em>Conditional Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.ConditionalNode
	 * @generated
	 */
	public Adapter createConditionalNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.Clause <em>Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.Clause
	 * @generated
	 */
	public Adapter createClauseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.LoopNode <em>Loop Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.LoopNode
	 * @generated
	 */
	public Adapter createLoopNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.Interaction <em>Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.Interaction
	 * @generated
	 */
	public Adapter createInteractionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.InteractionFragment <em>Interaction Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.InteractionFragment
	 * @generated
	 */
	public Adapter createInteractionFragmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.Lifeline <em>Lifeline</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.Lifeline
	 * @generated
	 */
	public Adapter createLifelineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.Message
	 * @generated
	 */
	public Adapter createMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.GeneralOrdering <em>General Ordering</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.GeneralOrdering
	 * @generated
	 */
	public Adapter createGeneralOrderingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.MessageEnd <em>Message End</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.MessageEnd
	 * @generated
	 */
	public Adapter createMessageEndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.EventOccurrence <em>Event Occurrence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.EventOccurrence
	 * @generated
	 */
	public Adapter createEventOccurrenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.ExecutionOccurrence <em>Execution Occurrence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.ExecutionOccurrence
	 * @generated
	 */
	public Adapter createExecutionOccurrenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.StateInvariant <em>State Invariant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.StateInvariant
	 * @generated
	 */
	public Adapter createStateInvariantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.Stop <em>Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.Stop
	 * @generated
	 */
	public Adapter createStopAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.TemplateSignature <em>Template Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.TemplateSignature
	 * @generated
	 */
	public Adapter createTemplateSignatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.TemplateParameter <em>Template Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.TemplateParameter
	 * @generated
	 */
	public Adapter createTemplateParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.TemplateableElement <em>Templateable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.TemplateableElement
	 * @generated
	 */
	public Adapter createTemplateableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.StringExpression <em>String Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.StringExpression
	 * @generated
	 */
	public Adapter createStringExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.ParameterableElement <em>Parameterable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.ParameterableElement
	 * @generated
	 */
	public Adapter createParameterableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.TemplateBinding <em>Template Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.TemplateBinding
	 * @generated
	 */
	public Adapter createTemplateBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.TemplateParameterSubstitution <em>Template Parameter Substitution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.TemplateParameterSubstitution
	 * @generated
	 */
	public Adapter createTemplateParameterSubstitutionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.OperationTemplateParameter <em>Operation Template Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.OperationTemplateParameter
	 * @generated
	 */
	public Adapter createOperationTemplateParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.ClassifierTemplateParameter <em>Classifier Template Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.ClassifierTemplateParameter
	 * @generated
	 */
	public Adapter createClassifierTemplateParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.ParameterableClassifier <em>Parameterable Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.ParameterableClassifier
	 * @generated
	 */
	public Adapter createParameterableClassifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.RedefinableTemplateSignature <em>Redefinable Template Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.RedefinableTemplateSignature
	 * @generated
	 */
	public Adapter createRedefinableTemplateSignatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.TemplateableClassifier <em>Templateable Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.TemplateableClassifier
	 * @generated
	 */
	public Adapter createTemplateableClassifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.ConnectableElementTemplateParameter <em>Connectable Element Template Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.ConnectableElementTemplateParameter
	 * @generated
	 */
	public Adapter createConnectableElementTemplateParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.ForkNode <em>Fork Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.ForkNode
	 * @generated
	 */
	public Adapter createForkNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.JoinNode <em>Join Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.JoinNode
	 * @generated
	 */
	public Adapter createJoinNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.FlowFinalNode <em>Flow Final Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.FlowFinalNode
	 * @generated
	 */
	public Adapter createFlowFinalNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.CentralBufferNode <em>Central Buffer Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.CentralBufferNode
	 * @generated
	 */
	public Adapter createCentralBufferNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.ActivityPartition <em>Activity Partition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.ActivityPartition
	 * @generated
	 */
	public Adapter createActivityPartitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.ExpansionNode <em>Expansion Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.ExpansionNode
	 * @generated
	 */
	public Adapter createExpansionNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.ExpansionRegion <em>Expansion Region</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.ExpansionRegion
	 * @generated
	 */
	public Adapter createExpansionRegionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.ExceptionHandler <em>Exception Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.ExceptionHandler
	 * @generated
	 */
	public Adapter createExceptionHandlerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.InteractionOccurrence <em>Interaction Occurrence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.InteractionOccurrence
	 * @generated
	 */
	public Adapter createInteractionOccurrenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.Gate <em>Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.Gate
	 * @generated
	 */
	public Adapter createGateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.PartDecomposition <em>Part Decomposition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.PartDecomposition
	 * @generated
	 */
	public Adapter createPartDecompositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.InteractionOperand <em>Interaction Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.InteractionOperand
	 * @generated
	 */
	public Adapter createInteractionOperandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.InteractionConstraint <em>Interaction Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.InteractionConstraint
	 * @generated
	 */
	public Adapter createInteractionConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.CombinedFragment <em>Combined Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.CombinedFragment
	 * @generated
	 */
	public Adapter createCombinedFragmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.Continuation <em>Continuation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.Continuation
	 * @generated
	 */
	public Adapter createContinuationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.StateMachine <em>State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.StateMachine
	 * @generated
	 */
	public Adapter createStateMachineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.Region <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.Region
	 * @generated
	 */
	public Adapter createRegionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.Pseudostate <em>Pseudostate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.Pseudostate
	 * @generated
	 */
	public Adapter createPseudostateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.State
	 * @generated
	 */
	public Adapter createStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.Vertex <em>Vertex</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.Vertex
	 * @generated
	 */
	public Adapter createVertexAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.ConnectionPointReference <em>Connection Point Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.ConnectionPointReference
	 * @generated
	 */
	public Adapter createConnectionPointReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.Transition
	 * @generated
	 */
	public Adapter createTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.FinalState <em>Final State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.FinalState
	 * @generated
	 */
	public Adapter createFinalStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.CreateObjectAction <em>Create Object Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.CreateObjectAction
	 * @generated
	 */
	public Adapter createCreateObjectActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.DestroyObjectAction <em>Destroy Object Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.DestroyObjectAction
	 * @generated
	 */
	public Adapter createDestroyObjectActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.TestIdentityAction <em>Test Identity Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.TestIdentityAction
	 * @generated
	 */
	public Adapter createTestIdentityActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.ReadSelfAction <em>Read Self Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.ReadSelfAction
	 * @generated
	 */
	public Adapter createReadSelfActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.StructuralFeatureAction <em>Structural Feature Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.StructuralFeatureAction
	 * @generated
	 */
	public Adapter createStructuralFeatureActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.ReadStructuralFeatureAction <em>Read Structural Feature Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.ReadStructuralFeatureAction
	 * @generated
	 */
	public Adapter createReadStructuralFeatureActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.WriteStructuralFeatureAction <em>Write Structural Feature Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.WriteStructuralFeatureAction
	 * @generated
	 */
	public Adapter createWriteStructuralFeatureActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.ClearStructuralFeatureAction <em>Clear Structural Feature Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.ClearStructuralFeatureAction
	 * @generated
	 */
	public Adapter createClearStructuralFeatureActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.RemoveStructuralFeatureValueAction <em>Remove Structural Feature Value Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.RemoveStructuralFeatureValueAction
	 * @generated
	 */
	public Adapter createRemoveStructuralFeatureValueActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.AddStructuralFeatureValueAction <em>Add Structural Feature Value Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.AddStructuralFeatureValueAction
	 * @generated
	 */
	public Adapter createAddStructuralFeatureValueActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.LinkAction <em>Link Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.LinkAction
	 * @generated
	 */
	public Adapter createLinkActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.LinkEndData <em>Link End Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.LinkEndData
	 * @generated
	 */
	public Adapter createLinkEndDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.ReadLinkAction <em>Read Link Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.ReadLinkAction
	 * @generated
	 */
	public Adapter createReadLinkActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.LinkEndCreationData <em>Link End Creation Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.LinkEndCreationData
	 * @generated
	 */
	public Adapter createLinkEndCreationDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.CreateLinkAction <em>Create Link Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.CreateLinkAction
	 * @generated
	 */
	public Adapter createCreateLinkActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.WriteLinkAction <em>Write Link Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.WriteLinkAction
	 * @generated
	 */
	public Adapter createWriteLinkActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.DestroyLinkAction <em>Destroy Link Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.DestroyLinkAction
	 * @generated
	 */
	public Adapter createDestroyLinkActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.ClearAssociationAction <em>Clear Association Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.ClearAssociationAction
	 * @generated
	 */
	public Adapter createClearAssociationActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.VariableAction <em>Variable Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.VariableAction
	 * @generated
	 */
	public Adapter createVariableActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.ReadVariableAction <em>Read Variable Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.ReadVariableAction
	 * @generated
	 */
	public Adapter createReadVariableActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.WriteVariableAction <em>Write Variable Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.WriteVariableAction
	 * @generated
	 */
	public Adapter createWriteVariableActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.ClearVariableAction <em>Clear Variable Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.ClearVariableAction
	 * @generated
	 */
	public Adapter createClearVariableActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.AddVariableValueAction <em>Add Variable Value Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.AddVariableValueAction
	 * @generated
	 */
	public Adapter createAddVariableValueActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.RemoveVariableValueAction <em>Remove Variable Value Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.RemoveVariableValueAction
	 * @generated
	 */
	public Adapter createRemoveVariableValueActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.ApplyFunctionAction <em>Apply Function Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.ApplyFunctionAction
	 * @generated
	 */
	public Adapter createApplyFunctionActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.PrimitiveFunction <em>Primitive Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.PrimitiveFunction
	 * @generated
	 */
	public Adapter createPrimitiveFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.CallAction <em>Call Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.CallAction
	 * @generated
	 */
	public Adapter createCallActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.InvocationAction <em>Invocation Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.InvocationAction
	 * @generated
	 */
	public Adapter createInvocationActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.SendSignalAction <em>Send Signal Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.SendSignalAction
	 * @generated
	 */
	public Adapter createSendSignalActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.BroadcastSignalAction <em>Broadcast Signal Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.BroadcastSignalAction
	 * @generated
	 */
	public Adapter createBroadcastSignalActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.SendObjectAction <em>Send Object Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.SendObjectAction
	 * @generated
	 */
	public Adapter createSendObjectActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.CallOperationAction <em>Call Operation Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.CallOperationAction
	 * @generated
	 */
	public Adapter createCallOperationActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.CallBehaviorAction <em>Call Behavior Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.CallBehaviorAction
	 * @generated
	 */
	public Adapter createCallBehaviorActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.TimeExpression <em>Time Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.TimeExpression
	 * @generated
	 */
	public Adapter createTimeExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.Duration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.Duration
	 * @generated
	 */
	public Adapter createDurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.TimeObservationAction <em>Time Observation Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.TimeObservationAction
	 * @generated
	 */
	public Adapter createTimeObservationActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.DurationInterval <em>Duration Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.DurationInterval
	 * @generated
	 */
	public Adapter createDurationIntervalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.Interval <em>Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.Interval
	 * @generated
	 */
	public Adapter createIntervalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.TimeConstraint <em>Time Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.TimeConstraint
	 * @generated
	 */
	public Adapter createTimeConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.IntervalConstraint <em>Interval Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.IntervalConstraint
	 * @generated
	 */
	public Adapter createIntervalConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.TimeInterval <em>Time Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.TimeInterval
	 * @generated
	 */
	public Adapter createTimeIntervalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.DurationObservationAction <em>Duration Observation Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.DurationObservationAction
	 * @generated
	 */
	public Adapter createDurationObservationActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.DurationConstraint <em>Duration Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.DurationConstraint
	 * @generated
	 */
	public Adapter createDurationConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.DataStoreNode <em>Data Store Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.DataStoreNode
	 * @generated
	 */
	public Adapter createDataStoreNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.InterruptibleActivityRegion <em>Interruptible Activity Region</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.InterruptibleActivityRegion
	 * @generated
	 */
	public Adapter createInterruptibleActivityRegionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.ParameterSet <em>Parameter Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.ParameterSet
	 * @generated
	 */
	public Adapter createParameterSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.Component
	 * @generated
	 */
	public Adapter createComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.Deployment <em>Deployment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.Deployment
	 * @generated
	 */
	public Adapter createDeploymentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.DeployedArtifact <em>Deployed Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.DeployedArtifact
	 * @generated
	 */
	public Adapter createDeployedArtifactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.DeploymentTarget <em>Deployment Target</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.DeploymentTarget
	 * @generated
	 */
	public Adapter createDeploymentTargetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.Node
	 * @generated
	 */
	public Adapter createNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.Device <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.Device
	 * @generated
	 */
	public Adapter createDeviceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.ExecutionEnvironment <em>Execution Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.ExecutionEnvironment
	 * @generated
	 */
	public Adapter createExecutionEnvironmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.CommunicationPath <em>Communication Path</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.CommunicationPath
	 * @generated
	 */
	public Adapter createCommunicationPathAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.ProtocolConformance <em>Protocol Conformance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.ProtocolConformance
	 * @generated
	 */
	public Adapter createProtocolConformanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.ProtocolStateMachine <em>Protocol State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.ProtocolStateMachine
	 * @generated
	 */
	public Adapter createProtocolStateMachineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.ProtocolTransition <em>Protocol Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.ProtocolTransition
	 * @generated
	 */
	public Adapter createProtocolTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.ReadExtentAction <em>Read Extent Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.ReadExtentAction
	 * @generated
	 */
	public Adapter createReadExtentActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.ReclassifyObjectAction <em>Reclassify Object Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.ReclassifyObjectAction
	 * @generated
	 */
	public Adapter createReclassifyObjectActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.ReadIsClassifiedObjectAction <em>Read Is Classified Object Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.ReadIsClassifiedObjectAction
	 * @generated
	 */
	public Adapter createReadIsClassifiedObjectActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.StartOwnedBehaviorAction <em>Start Owned Behavior Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.StartOwnedBehaviorAction
	 * @generated
	 */
	public Adapter createStartOwnedBehaviorActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.QualifierValue <em>Qualifier Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.QualifierValue
	 * @generated
	 */
	public Adapter createQualifierValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.ReadLinkObjectEndAction <em>Read Link Object End Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.ReadLinkObjectEndAction
	 * @generated
	 */
	public Adapter createReadLinkObjectEndActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.ReadLinkObjectEndQualifierAction <em>Read Link Object End Qualifier Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.ReadLinkObjectEndQualifierAction
	 * @generated
	 */
	public Adapter createReadLinkObjectEndQualifierActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.CreateLinkObjectAction <em>Create Link Object Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.CreateLinkObjectAction
	 * @generated
	 */
	public Adapter createCreateLinkObjectActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.AcceptEventAction <em>Accept Event Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.AcceptEventAction
	 * @generated
	 */
	public Adapter createAcceptEventActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.AcceptCallAction <em>Accept Call Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.AcceptCallAction
	 * @generated
	 */
	public Adapter createAcceptCallActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.ReplyAction <em>Reply Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.ReplyAction
	 * @generated
	 */
	public Adapter createReplyActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.RaiseExceptionAction <em>Raise Exception Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.RaiseExceptionAction
	 * @generated
	 */
	public Adapter createRaiseExceptionActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2.DeploymentSpecification <em>Deployment Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2.DeploymentSpecification
	 * @generated
	 */
	public Adapter createDeploymentSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //UML2AdapterFactory

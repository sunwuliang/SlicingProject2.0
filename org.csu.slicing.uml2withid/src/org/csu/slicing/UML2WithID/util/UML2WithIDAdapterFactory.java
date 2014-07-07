/**
 */
package org.csu.slicing.UML2WithID.util;

import org.csu.slicing.UML2WithID.Abstraction;
import org.csu.slicing.UML2WithID.AcceptCallAction;
import org.csu.slicing.UML2WithID.AcceptEventAction;
import org.csu.slicing.UML2WithID.Action;
import org.csu.slicing.UML2WithID.Activity;
import org.csu.slicing.UML2WithID.ActivityEdge;
import org.csu.slicing.UML2WithID.ActivityFinalNode;
import org.csu.slicing.UML2WithID.ActivityGroup;
import org.csu.slicing.UML2WithID.ActivityNode;
import org.csu.slicing.UML2WithID.ActivityParameterNode;
import org.csu.slicing.UML2WithID.ActivityPartition;
import org.csu.slicing.UML2WithID.Actor;
import org.csu.slicing.UML2WithID.AddStructuralFeatureValueAction;
import org.csu.slicing.UML2WithID.AddVariableValueAction;
import org.csu.slicing.UML2WithID.AnyTrigger;
import org.csu.slicing.UML2WithID.ApplyFunctionAction;
import org.csu.slicing.UML2WithID.Artifact;
import org.csu.slicing.UML2WithID.Association;
import org.csu.slicing.UML2WithID.AssociationClass;
import org.csu.slicing.UML2WithID.Behavior;
import org.csu.slicing.UML2WithID.BehavioralFeature;
import org.csu.slicing.UML2WithID.BehavioredClassifier;
import org.csu.slicing.UML2WithID.BroadcastSignalAction;
import org.csu.slicing.UML2WithID.CallAction;
import org.csu.slicing.UML2WithID.CallBehaviorAction;
import org.csu.slicing.UML2WithID.CallOperationAction;
import org.csu.slicing.UML2WithID.CallTrigger;
import org.csu.slicing.UML2WithID.CentralBufferNode;
import org.csu.slicing.UML2WithID.ChangeTrigger;
import org.csu.slicing.UML2WithID.Classifier;
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
import org.csu.slicing.UML2WithID.ConnectableElement;
import org.csu.slicing.UML2WithID.ConnectableElementTemplateParameter;
import org.csu.slicing.UML2WithID.ConnectionPointReference;
import org.csu.slicing.UML2WithID.Connector;
import org.csu.slicing.UML2WithID.ConnectorEnd;
import org.csu.slicing.UML2WithID.Constraint;
import org.csu.slicing.UML2WithID.Continuation;
import org.csu.slicing.UML2WithID.ControlFlow;
import org.csu.slicing.UML2WithID.ControlNode;
import org.csu.slicing.UML2WithID.CreateLinkAction;
import org.csu.slicing.UML2WithID.CreateLinkObjectAction;
import org.csu.slicing.UML2WithID.CreateObjectAction;
import org.csu.slicing.UML2WithID.DataStoreNode;
import org.csu.slicing.UML2WithID.DataType;
import org.csu.slicing.UML2WithID.DecisionNode;
import org.csu.slicing.UML2WithID.Dependency;
import org.csu.slicing.UML2WithID.DeployedArtifact;
import org.csu.slicing.UML2WithID.Deployment;
import org.csu.slicing.UML2WithID.DeploymentSpecification;
import org.csu.slicing.UML2WithID.DeploymentTarget;
import org.csu.slicing.UML2WithID.DestroyLinkAction;
import org.csu.slicing.UML2WithID.DestroyObjectAction;
import org.csu.slicing.UML2WithID.Device;
import org.csu.slicing.UML2WithID.DirectedRelationship;
import org.csu.slicing.UML2WithID.Duration;
import org.csu.slicing.UML2WithID.DurationConstraint;
import org.csu.slicing.UML2WithID.DurationInterval;
import org.csu.slicing.UML2WithID.DurationObservationAction;
import org.csu.slicing.UML2WithID.Element;
import org.csu.slicing.UML2WithID.ElementImport;
import org.csu.slicing.UML2WithID.EncapsulatedClassifier;
import org.csu.slicing.UML2WithID.Enumeration;
import org.csu.slicing.UML2WithID.EnumerationLiteral;
import org.csu.slicing.UML2WithID.EventOccurrence;
import org.csu.slicing.UML2WithID.ExceptionHandler;
import org.csu.slicing.UML2WithID.ExecutableNode;
import org.csu.slicing.UML2WithID.ExecutionEnvironment;
import org.csu.slicing.UML2WithID.ExecutionOccurrence;
import org.csu.slicing.UML2WithID.ExpansionNode;
import org.csu.slicing.UML2WithID.ExpansionRegion;
import org.csu.slicing.UML2WithID.Expression;
import org.csu.slicing.UML2WithID.Extend;
import org.csu.slicing.UML2WithID.Extension;
import org.csu.slicing.UML2WithID.ExtensionEnd;
import org.csu.slicing.UML2WithID.ExtensionPoint;
import org.csu.slicing.UML2WithID.Feature;
import org.csu.slicing.UML2WithID.FinalNode;
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
import org.csu.slicing.UML2WithID.InteractionFragment;
import org.csu.slicing.UML2WithID.InteractionOccurrence;
import org.csu.slicing.UML2WithID.InteractionOperand;
import org.csu.slicing.UML2WithID.Interface;
import org.csu.slicing.UML2WithID.InterruptibleActivityRegion;
import org.csu.slicing.UML2WithID.Interval;
import org.csu.slicing.UML2WithID.IntervalConstraint;
import org.csu.slicing.UML2WithID.InvocationAction;
import org.csu.slicing.UML2WithID.JoinNode;
import org.csu.slicing.UML2WithID.Lifeline;
import org.csu.slicing.UML2WithID.LinkAction;
import org.csu.slicing.UML2WithID.LinkEndCreationData;
import org.csu.slicing.UML2WithID.LinkEndData;
import org.csu.slicing.UML2WithID.LiteralBoolean;
import org.csu.slicing.UML2WithID.LiteralInteger;
import org.csu.slicing.UML2WithID.LiteralNull;
import org.csu.slicing.UML2WithID.LiteralSpecification;
import org.csu.slicing.UML2WithID.LiteralString;
import org.csu.slicing.UML2WithID.LiteralUnlimitedNatural;
import org.csu.slicing.UML2WithID.LoopNode;
import org.csu.slicing.UML2WithID.Manifestation;
import org.csu.slicing.UML2WithID.MergeNode;
import org.csu.slicing.UML2WithID.Message;
import org.csu.slicing.UML2WithID.MessageEnd;
import org.csu.slicing.UML2WithID.MessageTrigger;
import org.csu.slicing.UML2WithID.Model;
import org.csu.slicing.UML2WithID.MultiplicityElement;
import org.csu.slicing.UML2WithID.NamedElement;
import org.csu.slicing.UML2WithID.Namespace;
import org.csu.slicing.UML2WithID.Node;
import org.csu.slicing.UML2WithID.ObjectFlow;
import org.csu.slicing.UML2WithID.ObjectNode;
import org.csu.slicing.UML2WithID.OpaqueExpression;
import org.csu.slicing.UML2WithID.Operation;
import org.csu.slicing.UML2WithID.OperationTemplateParameter;
import org.csu.slicing.UML2WithID.OutputPin;
import org.csu.slicing.UML2WithID.PackageImport;
import org.csu.slicing.UML2WithID.PackageMerge;
import org.csu.slicing.UML2WithID.PackageableElement;
import org.csu.slicing.UML2WithID.Parameter;
import org.csu.slicing.UML2WithID.ParameterSet;
import org.csu.slicing.UML2WithID.ParameterableClassifier;
import org.csu.slicing.UML2WithID.ParameterableElement;
import org.csu.slicing.UML2WithID.PartDecomposition;
import org.csu.slicing.UML2WithID.Permission;
import org.csu.slicing.UML2WithID.Pin;
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
import org.csu.slicing.UML2WithID.RedefinableElement;
import org.csu.slicing.UML2WithID.RedefinableTemplateSignature;
import org.csu.slicing.UML2WithID.Region;
import org.csu.slicing.UML2WithID.Relationship;
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
import org.csu.slicing.UML2WithID.StructuralFeature;
import org.csu.slicing.UML2WithID.StructuralFeatureAction;
import org.csu.slicing.UML2WithID.StructuredActivityNode;
import org.csu.slicing.UML2WithID.StructuredClassifier;
import org.csu.slicing.UML2WithID.Substitution;
import org.csu.slicing.UML2WithID.TemplateBinding;
import org.csu.slicing.UML2WithID.TemplateParameter;
import org.csu.slicing.UML2WithID.TemplateParameterSubstitution;
import org.csu.slicing.UML2WithID.TemplateSignature;
import org.csu.slicing.UML2WithID.TemplateableClassifier;
import org.csu.slicing.UML2WithID.TemplateableElement;
import org.csu.slicing.UML2WithID.TestIdentityAction;
import org.csu.slicing.UML2WithID.TimeConstraint;
import org.csu.slicing.UML2WithID.TimeExpression;
import org.csu.slicing.UML2WithID.TimeInterval;
import org.csu.slicing.UML2WithID.TimeObservationAction;
import org.csu.slicing.UML2WithID.TimeTrigger;
import org.csu.slicing.UML2WithID.Transition;
import org.csu.slicing.UML2WithID.Trigger;
import org.csu.slicing.UML2WithID.Type;
import org.csu.slicing.UML2WithID.TypedElement;
import org.csu.slicing.UML2WithID.UML2WithIDPackage;
import org.csu.slicing.UML2WithID.Usage;
import org.csu.slicing.UML2WithID.UseCase;
import org.csu.slicing.UML2WithID.ValuePin;
import org.csu.slicing.UML2WithID.ValueSpecification;
import org.csu.slicing.UML2WithID.Variable;
import org.csu.slicing.UML2WithID.VariableAction;
import org.csu.slicing.UML2WithID.Vertex;
import org.csu.slicing.UML2WithID.WriteLinkAction;
import org.csu.slicing.UML2WithID.WriteStructuralFeatureAction;
import org.csu.slicing.UML2WithID.WriteVariableAction;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.csu.slicing.UML2WithID.UML2WithIDPackage
 * @generated
 */
public class UML2WithIDAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static UML2WithIDPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UML2WithIDAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = UML2WithIDPackage.eINSTANCE;
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
	protected UML2WithIDSwitch<Adapter> modelSwitch =
		new UML2WithIDSwitch<Adapter>() {
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
			public Adapter caseClass(org.csu.slicing.UML2WithID.Class object) {
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
			public Adapter casePackage(org.csu.slicing.UML2WithID.Package object) {
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
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.MultiplicityElement <em>Multiplicity Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.MultiplicityElement
	 * @generated
	 */
	public Adapter createMultiplicityElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.Namespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.Namespace
	 * @generated
	 */
	public Adapter createNamespaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.OpaqueExpression <em>Opaque Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.OpaqueExpression
	 * @generated
	 */
	public Adapter createOpaqueExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.ValueSpecification <em>Value Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.ValueSpecification
	 * @generated
	 */
	public Adapter createValueSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.Comment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.Comment
	 * @generated
	 */
	public Adapter createCommentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.DirectedRelationship <em>Directed Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.DirectedRelationship
	 * @generated
	 */
	public Adapter createDirectedRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.Relationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.Relationship
	 * @generated
	 */
	public Adapter createRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.Class
	 * @generated
	 */
	public Adapter createClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.Type
	 * @generated
	 */
	public Adapter createTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.Property
	 * @generated
	 */
	public Adapter createPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.Operation
	 * @generated
	 */
	public Adapter createOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.TypedElement <em>Typed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.TypedElement
	 * @generated
	 */
	public Adapter createTypedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.Parameter
	 * @generated
	 */
	public Adapter createParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.Package
	 * @generated
	 */
	public Adapter createPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.Enumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.Enumeration
	 * @generated
	 */
	public Adapter createEnumerationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.DataType
	 * @generated
	 */
	public Adapter createDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.EnumerationLiteral <em>Enumeration Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.EnumerationLiteral
	 * @generated
	 */
	public Adapter createEnumerationLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.PrimitiveType <em>Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.PrimitiveType
	 * @generated
	 */
	public Adapter createPrimitiveTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.Classifier <em>Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.Classifier
	 * @generated
	 */
	public Adapter createClassifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.Feature
	 * @generated
	 */
	public Adapter createFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.Constraint
	 * @generated
	 */
	public Adapter createConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.LiteralBoolean <em>Literal Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.LiteralBoolean
	 * @generated
	 */
	public Adapter createLiteralBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.LiteralSpecification <em>Literal Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.LiteralSpecification
	 * @generated
	 */
	public Adapter createLiteralSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.LiteralString <em>Literal String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.LiteralString
	 * @generated
	 */
	public Adapter createLiteralStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.LiteralNull <em>Literal Null</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.LiteralNull
	 * @generated
	 */
	public Adapter createLiteralNullAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.LiteralInteger <em>Literal Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.LiteralInteger
	 * @generated
	 */
	public Adapter createLiteralIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.LiteralUnlimitedNatural <em>Literal Unlimited Natural</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.LiteralUnlimitedNatural
	 * @generated
	 */
	public Adapter createLiteralUnlimitedNaturalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.BehavioralFeature <em>Behavioral Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.BehavioralFeature
	 * @generated
	 */
	public Adapter createBehavioralFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.StructuralFeature <em>Structural Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.StructuralFeature
	 * @generated
	 */
	public Adapter createStructuralFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.InstanceSpecification <em>Instance Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.InstanceSpecification
	 * @generated
	 */
	public Adapter createInstanceSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.Slot <em>Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.Slot
	 * @generated
	 */
	public Adapter createSlotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.InstanceValue <em>Instance Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.InstanceValue
	 * @generated
	 */
	public Adapter createInstanceValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.RedefinableElement <em>Redefinable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.RedefinableElement
	 * @generated
	 */
	public Adapter createRedefinableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.Generalization <em>Generalization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.Generalization
	 * @generated
	 */
	public Adapter createGeneralizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.PackageableElement <em>Packageable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.PackageableElement
	 * @generated
	 */
	public Adapter createPackageableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.ElementImport <em>Element Import</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.ElementImport
	 * @generated
	 */
	public Adapter createElementImportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.PackageImport <em>Package Import</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.PackageImport
	 * @generated
	 */
	public Adapter createPackageImportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.Association <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.Association
	 * @generated
	 */
	public Adapter createAssociationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.PackageMerge <em>Package Merge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.PackageMerge
	 * @generated
	 */
	public Adapter createPackageMergeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.Stereotype <em>Stereotype</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.Stereotype
	 * @generated
	 */
	public Adapter createStereotypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.Profile <em>Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.Profile
	 * @generated
	 */
	public Adapter createProfileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.ProfileApplication <em>Profile Application</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.ProfileApplication
	 * @generated
	 */
	public Adapter createProfileApplicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.Extension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.Extension
	 * @generated
	 */
	public Adapter createExtensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.ExtensionEnd <em>Extension End</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.ExtensionEnd
	 * @generated
	 */
	public Adapter createExtensionEndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.Behavior <em>Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.Behavior
	 * @generated
	 */
	public Adapter createBehaviorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.BehavioredClassifier <em>Behaviored Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.BehavioredClassifier
	 * @generated
	 */
	public Adapter createBehavioredClassifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.Activity
	 * @generated
	 */
	public Adapter createActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.Permission <em>Permission</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.Permission
	 * @generated
	 */
	public Adapter createPermissionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.Dependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.Dependency
	 * @generated
	 */
	public Adapter createDependencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.Usage <em>Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.Usage
	 * @generated
	 */
	public Adapter createUsageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.Abstraction <em>Abstraction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.Abstraction
	 * @generated
	 */
	public Adapter createAbstractionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.Realization <em>Realization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.Realization
	 * @generated
	 */
	public Adapter createRealizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.Substitution <em>Substitution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.Substitution
	 * @generated
	 */
	public Adapter createSubstitutionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.GeneralizationSet <em>Generalization Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.GeneralizationSet
	 * @generated
	 */
	public Adapter createGeneralizationSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.AssociationClass <em>Association Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.AssociationClass
	 * @generated
	 */
	public Adapter createAssociationClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.InformationItem <em>Information Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.InformationItem
	 * @generated
	 */
	public Adapter createInformationItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.InformationFlow <em>Information Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.InformationFlow
	 * @generated
	 */
	public Adapter createInformationFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.Model
	 * @generated
	 */
	public Adapter createModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.ConnectorEnd <em>Connector End</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.ConnectorEnd
	 * @generated
	 */
	public Adapter createConnectorEndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.ConnectableElement <em>Connectable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.ConnectableElement
	 * @generated
	 */
	public Adapter createConnectableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.Connector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.Connector
	 * @generated
	 */
	public Adapter createConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.StructuredClassifier <em>Structured Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.StructuredClassifier
	 * @generated
	 */
	public Adapter createStructuredClassifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.ActivityEdge <em>Activity Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.ActivityEdge
	 * @generated
	 */
	public Adapter createActivityEdgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.ActivityGroup <em>Activity Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.ActivityGroup
	 * @generated
	 */
	public Adapter createActivityGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.ActivityNode <em>Activity Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.ActivityNode
	 * @generated
	 */
	public Adapter createActivityNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.Action
	 * @generated
	 */
	public Adapter createActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.ObjectNode <em>Object Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.ObjectNode
	 * @generated
	 */
	public Adapter createObjectNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.ControlNode <em>Control Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.ControlNode
	 * @generated
	 */
	public Adapter createControlNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.ControlFlow <em>Control Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.ControlFlow
	 * @generated
	 */
	public Adapter createControlFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.ObjectFlow <em>Object Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.ObjectFlow
	 * @generated
	 */
	public Adapter createObjectFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.InitialNode <em>Initial Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.InitialNode
	 * @generated
	 */
	public Adapter createInitialNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.FinalNode <em>Final Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.FinalNode
	 * @generated
	 */
	public Adapter createFinalNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.ActivityFinalNode <em>Activity Final Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.ActivityFinalNode
	 * @generated
	 */
	public Adapter createActivityFinalNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.DecisionNode <em>Decision Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.DecisionNode
	 * @generated
	 */
	public Adapter createDecisionNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.MergeNode <em>Merge Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.MergeNode
	 * @generated
	 */
	public Adapter createMergeNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.ExecutableNode <em>Executable Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.ExecutableNode
	 * @generated
	 */
	public Adapter createExecutableNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.OutputPin <em>Output Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.OutputPin
	 * @generated
	 */
	public Adapter createOutputPinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.InputPin <em>Input Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.InputPin
	 * @generated
	 */
	public Adapter createInputPinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.Pin <em>Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.Pin
	 * @generated
	 */
	public Adapter createPinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.ActivityParameterNode <em>Activity Parameter Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.ActivityParameterNode
	 * @generated
	 */
	public Adapter createActivityParameterNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.ValuePin <em>Value Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.ValuePin
	 * @generated
	 */
	public Adapter createValuePinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.Interface
	 * @generated
	 */
	public Adapter createInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.Implementation <em>Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.Implementation
	 * @generated
	 */
	public Adapter createImplementationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.Artifact <em>Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.Artifact
	 * @generated
	 */
	public Adapter createArtifactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.Manifestation <em>Manifestation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.Manifestation
	 * @generated
	 */
	public Adapter createManifestationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.Actor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.Actor
	 * @generated
	 */
	public Adapter createActorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.Extend <em>Extend</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.Extend
	 * @generated
	 */
	public Adapter createExtendAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.UseCase <em>Use Case</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.UseCase
	 * @generated
	 */
	public Adapter createUseCaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.ExtensionPoint <em>Extension Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.ExtensionPoint
	 * @generated
	 */
	public Adapter createExtensionPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.Include <em>Include</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.Include
	 * @generated
	 */
	public Adapter createIncludeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.CollaborationOccurrence <em>Collaboration Occurrence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.CollaborationOccurrence
	 * @generated
	 */
	public Adapter createCollaborationOccurrenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.Collaboration <em>Collaboration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.Collaboration
	 * @generated
	 */
	public Adapter createCollaborationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.Port
	 * @generated
	 */
	public Adapter createPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.EncapsulatedClassifier <em>Encapsulated Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.EncapsulatedClassifier
	 * @generated
	 */
	public Adapter createEncapsulatedClassifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.CallTrigger <em>Call Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.CallTrigger
	 * @generated
	 */
	public Adapter createCallTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.MessageTrigger <em>Message Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.MessageTrigger
	 * @generated
	 */
	public Adapter createMessageTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.ChangeTrigger <em>Change Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.ChangeTrigger
	 * @generated
	 */
	public Adapter createChangeTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.Trigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.Trigger
	 * @generated
	 */
	public Adapter createTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.Reception <em>Reception</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.Reception
	 * @generated
	 */
	public Adapter createReceptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.Signal <em>Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.Signal
	 * @generated
	 */
	public Adapter createSignalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.SignalTrigger <em>Signal Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.SignalTrigger
	 * @generated
	 */
	public Adapter createSignalTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.TimeTrigger <em>Time Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.TimeTrigger
	 * @generated
	 */
	public Adapter createTimeTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.AnyTrigger <em>Any Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.AnyTrigger
	 * @generated
	 */
	public Adapter createAnyTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.Variable
	 * @generated
	 */
	public Adapter createVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.StructuredActivityNode <em>Structured Activity Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.StructuredActivityNode
	 * @generated
	 */
	public Adapter createStructuredActivityNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.ConditionalNode <em>Conditional Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.ConditionalNode
	 * @generated
	 */
	public Adapter createConditionalNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.Clause <em>Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.Clause
	 * @generated
	 */
	public Adapter createClauseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.LoopNode <em>Loop Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.LoopNode
	 * @generated
	 */
	public Adapter createLoopNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.Interaction <em>Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.Interaction
	 * @generated
	 */
	public Adapter createInteractionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.InteractionFragment <em>Interaction Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.InteractionFragment
	 * @generated
	 */
	public Adapter createInteractionFragmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.Lifeline <em>Lifeline</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.Lifeline
	 * @generated
	 */
	public Adapter createLifelineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.Message
	 * @generated
	 */
	public Adapter createMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.GeneralOrdering <em>General Ordering</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.GeneralOrdering
	 * @generated
	 */
	public Adapter createGeneralOrderingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.MessageEnd <em>Message End</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.MessageEnd
	 * @generated
	 */
	public Adapter createMessageEndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.EventOccurrence <em>Event Occurrence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.EventOccurrence
	 * @generated
	 */
	public Adapter createEventOccurrenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.ExecutionOccurrence <em>Execution Occurrence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.ExecutionOccurrence
	 * @generated
	 */
	public Adapter createExecutionOccurrenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.StateInvariant <em>State Invariant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.StateInvariant
	 * @generated
	 */
	public Adapter createStateInvariantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.Stop <em>Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.Stop
	 * @generated
	 */
	public Adapter createStopAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.TemplateSignature <em>Template Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.TemplateSignature
	 * @generated
	 */
	public Adapter createTemplateSignatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.TemplateParameter <em>Template Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.TemplateParameter
	 * @generated
	 */
	public Adapter createTemplateParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.TemplateableElement <em>Templateable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.TemplateableElement
	 * @generated
	 */
	public Adapter createTemplateableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.StringExpression <em>String Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.StringExpression
	 * @generated
	 */
	public Adapter createStringExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.ParameterableElement <em>Parameterable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.ParameterableElement
	 * @generated
	 */
	public Adapter createParameterableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.TemplateBinding <em>Template Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.TemplateBinding
	 * @generated
	 */
	public Adapter createTemplateBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.TemplateParameterSubstitution <em>Template Parameter Substitution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.TemplateParameterSubstitution
	 * @generated
	 */
	public Adapter createTemplateParameterSubstitutionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.OperationTemplateParameter <em>Operation Template Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.OperationTemplateParameter
	 * @generated
	 */
	public Adapter createOperationTemplateParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.ClassifierTemplateParameter <em>Classifier Template Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.ClassifierTemplateParameter
	 * @generated
	 */
	public Adapter createClassifierTemplateParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.ParameterableClassifier <em>Parameterable Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.ParameterableClassifier
	 * @generated
	 */
	public Adapter createParameterableClassifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.RedefinableTemplateSignature <em>Redefinable Template Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.RedefinableTemplateSignature
	 * @generated
	 */
	public Adapter createRedefinableTemplateSignatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.TemplateableClassifier <em>Templateable Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.TemplateableClassifier
	 * @generated
	 */
	public Adapter createTemplateableClassifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.ConnectableElementTemplateParameter <em>Connectable Element Template Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.ConnectableElementTemplateParameter
	 * @generated
	 */
	public Adapter createConnectableElementTemplateParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.ForkNode <em>Fork Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.ForkNode
	 * @generated
	 */
	public Adapter createForkNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.JoinNode <em>Join Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.JoinNode
	 * @generated
	 */
	public Adapter createJoinNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.FlowFinalNode <em>Flow Final Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.FlowFinalNode
	 * @generated
	 */
	public Adapter createFlowFinalNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.CentralBufferNode <em>Central Buffer Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.CentralBufferNode
	 * @generated
	 */
	public Adapter createCentralBufferNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.ActivityPartition <em>Activity Partition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.ActivityPartition
	 * @generated
	 */
	public Adapter createActivityPartitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.ExpansionNode <em>Expansion Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.ExpansionNode
	 * @generated
	 */
	public Adapter createExpansionNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.ExpansionRegion <em>Expansion Region</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.ExpansionRegion
	 * @generated
	 */
	public Adapter createExpansionRegionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.ExceptionHandler <em>Exception Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.ExceptionHandler
	 * @generated
	 */
	public Adapter createExceptionHandlerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.InteractionOccurrence <em>Interaction Occurrence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.InteractionOccurrence
	 * @generated
	 */
	public Adapter createInteractionOccurrenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.Gate <em>Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.Gate
	 * @generated
	 */
	public Adapter createGateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.PartDecomposition <em>Part Decomposition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.PartDecomposition
	 * @generated
	 */
	public Adapter createPartDecompositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.InteractionOperand <em>Interaction Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.InteractionOperand
	 * @generated
	 */
	public Adapter createInteractionOperandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.InteractionConstraint <em>Interaction Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.InteractionConstraint
	 * @generated
	 */
	public Adapter createInteractionConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.CombinedFragment <em>Combined Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.CombinedFragment
	 * @generated
	 */
	public Adapter createCombinedFragmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.Continuation <em>Continuation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.Continuation
	 * @generated
	 */
	public Adapter createContinuationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.StateMachine <em>State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.StateMachine
	 * @generated
	 */
	public Adapter createStateMachineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.Region <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.Region
	 * @generated
	 */
	public Adapter createRegionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.Pseudostate <em>Pseudostate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.Pseudostate
	 * @generated
	 */
	public Adapter createPseudostateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.State
	 * @generated
	 */
	public Adapter createStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.Vertex <em>Vertex</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.Vertex
	 * @generated
	 */
	public Adapter createVertexAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.ConnectionPointReference <em>Connection Point Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.ConnectionPointReference
	 * @generated
	 */
	public Adapter createConnectionPointReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.Transition
	 * @generated
	 */
	public Adapter createTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.FinalState <em>Final State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.FinalState
	 * @generated
	 */
	public Adapter createFinalStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.CreateObjectAction <em>Create Object Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.CreateObjectAction
	 * @generated
	 */
	public Adapter createCreateObjectActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.DestroyObjectAction <em>Destroy Object Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.DestroyObjectAction
	 * @generated
	 */
	public Adapter createDestroyObjectActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.TestIdentityAction <em>Test Identity Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.TestIdentityAction
	 * @generated
	 */
	public Adapter createTestIdentityActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.ReadSelfAction <em>Read Self Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.ReadSelfAction
	 * @generated
	 */
	public Adapter createReadSelfActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.StructuralFeatureAction <em>Structural Feature Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.StructuralFeatureAction
	 * @generated
	 */
	public Adapter createStructuralFeatureActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.ReadStructuralFeatureAction <em>Read Structural Feature Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.ReadStructuralFeatureAction
	 * @generated
	 */
	public Adapter createReadStructuralFeatureActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.WriteStructuralFeatureAction <em>Write Structural Feature Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.WriteStructuralFeatureAction
	 * @generated
	 */
	public Adapter createWriteStructuralFeatureActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.ClearStructuralFeatureAction <em>Clear Structural Feature Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.ClearStructuralFeatureAction
	 * @generated
	 */
	public Adapter createClearStructuralFeatureActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.RemoveStructuralFeatureValueAction <em>Remove Structural Feature Value Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.RemoveStructuralFeatureValueAction
	 * @generated
	 */
	public Adapter createRemoveStructuralFeatureValueActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.AddStructuralFeatureValueAction <em>Add Structural Feature Value Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.AddStructuralFeatureValueAction
	 * @generated
	 */
	public Adapter createAddStructuralFeatureValueActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.LinkAction <em>Link Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.LinkAction
	 * @generated
	 */
	public Adapter createLinkActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.LinkEndData <em>Link End Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.LinkEndData
	 * @generated
	 */
	public Adapter createLinkEndDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.ReadLinkAction <em>Read Link Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.ReadLinkAction
	 * @generated
	 */
	public Adapter createReadLinkActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.LinkEndCreationData <em>Link End Creation Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.LinkEndCreationData
	 * @generated
	 */
	public Adapter createLinkEndCreationDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.CreateLinkAction <em>Create Link Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.CreateLinkAction
	 * @generated
	 */
	public Adapter createCreateLinkActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.WriteLinkAction <em>Write Link Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.WriteLinkAction
	 * @generated
	 */
	public Adapter createWriteLinkActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.DestroyLinkAction <em>Destroy Link Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.DestroyLinkAction
	 * @generated
	 */
	public Adapter createDestroyLinkActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.ClearAssociationAction <em>Clear Association Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.ClearAssociationAction
	 * @generated
	 */
	public Adapter createClearAssociationActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.VariableAction <em>Variable Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.VariableAction
	 * @generated
	 */
	public Adapter createVariableActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.ReadVariableAction <em>Read Variable Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.ReadVariableAction
	 * @generated
	 */
	public Adapter createReadVariableActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.WriteVariableAction <em>Write Variable Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.WriteVariableAction
	 * @generated
	 */
	public Adapter createWriteVariableActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.ClearVariableAction <em>Clear Variable Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.ClearVariableAction
	 * @generated
	 */
	public Adapter createClearVariableActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.AddVariableValueAction <em>Add Variable Value Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.AddVariableValueAction
	 * @generated
	 */
	public Adapter createAddVariableValueActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.RemoveVariableValueAction <em>Remove Variable Value Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.RemoveVariableValueAction
	 * @generated
	 */
	public Adapter createRemoveVariableValueActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.ApplyFunctionAction <em>Apply Function Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.ApplyFunctionAction
	 * @generated
	 */
	public Adapter createApplyFunctionActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.PrimitiveFunction <em>Primitive Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.PrimitiveFunction
	 * @generated
	 */
	public Adapter createPrimitiveFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.CallAction <em>Call Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.CallAction
	 * @generated
	 */
	public Adapter createCallActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.InvocationAction <em>Invocation Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.InvocationAction
	 * @generated
	 */
	public Adapter createInvocationActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.SendSignalAction <em>Send Signal Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.SendSignalAction
	 * @generated
	 */
	public Adapter createSendSignalActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.BroadcastSignalAction <em>Broadcast Signal Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.BroadcastSignalAction
	 * @generated
	 */
	public Adapter createBroadcastSignalActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.SendObjectAction <em>Send Object Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.SendObjectAction
	 * @generated
	 */
	public Adapter createSendObjectActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.CallOperationAction <em>Call Operation Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.CallOperationAction
	 * @generated
	 */
	public Adapter createCallOperationActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.CallBehaviorAction <em>Call Behavior Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.CallBehaviorAction
	 * @generated
	 */
	public Adapter createCallBehaviorActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.TimeExpression <em>Time Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.TimeExpression
	 * @generated
	 */
	public Adapter createTimeExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.Duration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.Duration
	 * @generated
	 */
	public Adapter createDurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.TimeObservationAction <em>Time Observation Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.TimeObservationAction
	 * @generated
	 */
	public Adapter createTimeObservationActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.DurationInterval <em>Duration Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.DurationInterval
	 * @generated
	 */
	public Adapter createDurationIntervalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.Interval <em>Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.Interval
	 * @generated
	 */
	public Adapter createIntervalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.TimeConstraint <em>Time Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.TimeConstraint
	 * @generated
	 */
	public Adapter createTimeConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.IntervalConstraint <em>Interval Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.IntervalConstraint
	 * @generated
	 */
	public Adapter createIntervalConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.TimeInterval <em>Time Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.TimeInterval
	 * @generated
	 */
	public Adapter createTimeIntervalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.DurationObservationAction <em>Duration Observation Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.DurationObservationAction
	 * @generated
	 */
	public Adapter createDurationObservationActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.DurationConstraint <em>Duration Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.DurationConstraint
	 * @generated
	 */
	public Adapter createDurationConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.DataStoreNode <em>Data Store Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.DataStoreNode
	 * @generated
	 */
	public Adapter createDataStoreNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.InterruptibleActivityRegion <em>Interruptible Activity Region</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.InterruptibleActivityRegion
	 * @generated
	 */
	public Adapter createInterruptibleActivityRegionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.ParameterSet <em>Parameter Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.ParameterSet
	 * @generated
	 */
	public Adapter createParameterSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.Component
	 * @generated
	 */
	public Adapter createComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.Deployment <em>Deployment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.Deployment
	 * @generated
	 */
	public Adapter createDeploymentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.DeployedArtifact <em>Deployed Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.DeployedArtifact
	 * @generated
	 */
	public Adapter createDeployedArtifactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.DeploymentTarget <em>Deployment Target</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.DeploymentTarget
	 * @generated
	 */
	public Adapter createDeploymentTargetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.Node
	 * @generated
	 */
	public Adapter createNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.Device <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.Device
	 * @generated
	 */
	public Adapter createDeviceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.ExecutionEnvironment <em>Execution Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.ExecutionEnvironment
	 * @generated
	 */
	public Adapter createExecutionEnvironmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.CommunicationPath <em>Communication Path</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.CommunicationPath
	 * @generated
	 */
	public Adapter createCommunicationPathAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.ProtocolConformance <em>Protocol Conformance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.ProtocolConformance
	 * @generated
	 */
	public Adapter createProtocolConformanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.ProtocolStateMachine <em>Protocol State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.ProtocolStateMachine
	 * @generated
	 */
	public Adapter createProtocolStateMachineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.ProtocolTransition <em>Protocol Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.ProtocolTransition
	 * @generated
	 */
	public Adapter createProtocolTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.ReadExtentAction <em>Read Extent Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.ReadExtentAction
	 * @generated
	 */
	public Adapter createReadExtentActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.ReclassifyObjectAction <em>Reclassify Object Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.ReclassifyObjectAction
	 * @generated
	 */
	public Adapter createReclassifyObjectActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.ReadIsClassifiedObjectAction <em>Read Is Classified Object Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.ReadIsClassifiedObjectAction
	 * @generated
	 */
	public Adapter createReadIsClassifiedObjectActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.StartOwnedBehaviorAction <em>Start Owned Behavior Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.StartOwnedBehaviorAction
	 * @generated
	 */
	public Adapter createStartOwnedBehaviorActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.QualifierValue <em>Qualifier Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.QualifierValue
	 * @generated
	 */
	public Adapter createQualifierValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.ReadLinkObjectEndAction <em>Read Link Object End Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.ReadLinkObjectEndAction
	 * @generated
	 */
	public Adapter createReadLinkObjectEndActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.ReadLinkObjectEndQualifierAction <em>Read Link Object End Qualifier Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.ReadLinkObjectEndQualifierAction
	 * @generated
	 */
	public Adapter createReadLinkObjectEndQualifierActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.CreateLinkObjectAction <em>Create Link Object Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.CreateLinkObjectAction
	 * @generated
	 */
	public Adapter createCreateLinkObjectActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.AcceptEventAction <em>Accept Event Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.AcceptEventAction
	 * @generated
	 */
	public Adapter createAcceptEventActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.AcceptCallAction <em>Accept Call Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.AcceptCallAction
	 * @generated
	 */
	public Adapter createAcceptCallActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.ReplyAction <em>Reply Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.ReplyAction
	 * @generated
	 */
	public Adapter createReplyActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.RaiseExceptionAction <em>Raise Exception Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.RaiseExceptionAction
	 * @generated
	 */
	public Adapter createRaiseExceptionActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.csu.slicing.UML2WithID.DeploymentSpecification <em>Deployment Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.csu.slicing.UML2WithID.DeploymentSpecification
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

} //UML2WithIDAdapterFactory

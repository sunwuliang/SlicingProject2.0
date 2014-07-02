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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.csu.slicing.UML2.UML2Package
 * @generated
 */
public class UML2Switch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static UML2Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UML2Switch() {
		if (modelPackage == null) {
			modelPackage = UML2Package.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case UML2Package.ELEMENT: {
				Element element = (Element)theEObject;
				T result = caseElement(element);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.MULTIPLICITY_ELEMENT: {
				MultiplicityElement multiplicityElement = (MultiplicityElement)theEObject;
				T result = caseMultiplicityElement(multiplicityElement);
				if (result == null) result = caseElement(multiplicityElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.NAMED_ELEMENT: {
				NamedElement namedElement = (NamedElement)theEObject;
				T result = caseNamedElement(namedElement);
				if (result == null) result = caseTemplateableElement(namedElement);
				if (result == null) result = caseElement(namedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.NAMESPACE: {
				Namespace namespace = (Namespace)theEObject;
				T result = caseNamespace(namespace);
				if (result == null) result = caseNamedElement(namespace);
				if (result == null) result = caseTemplateableElement(namespace);
				if (result == null) result = caseElement(namespace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.OPAQUE_EXPRESSION: {
				OpaqueExpression opaqueExpression = (OpaqueExpression)theEObject;
				T result = caseOpaqueExpression(opaqueExpression);
				if (result == null) result = caseValueSpecification(opaqueExpression);
				if (result == null) result = caseTypedElement(opaqueExpression);
				if (result == null) result = caseParameterableElement(opaqueExpression);
				if (result == null) result = caseNamedElement(opaqueExpression);
				if (result == null) result = caseTemplateableElement(opaqueExpression);
				if (result == null) result = caseElement(opaqueExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.VALUE_SPECIFICATION: {
				ValueSpecification valueSpecification = (ValueSpecification)theEObject;
				T result = caseValueSpecification(valueSpecification);
				if (result == null) result = caseTypedElement(valueSpecification);
				if (result == null) result = caseParameterableElement(valueSpecification);
				if (result == null) result = caseNamedElement(valueSpecification);
				if (result == null) result = caseTemplateableElement(valueSpecification);
				if (result == null) result = caseElement(valueSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.EXPRESSION: {
				Expression expression = (Expression)theEObject;
				T result = caseExpression(expression);
				if (result == null) result = caseOpaqueExpression(expression);
				if (result == null) result = caseValueSpecification(expression);
				if (result == null) result = caseTypedElement(expression);
				if (result == null) result = caseParameterableElement(expression);
				if (result == null) result = caseNamedElement(expression);
				if (result == null) result = caseTemplateableElement(expression);
				if (result == null) result = caseElement(expression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.COMMENT: {
				Comment comment = (Comment)theEObject;
				T result = caseComment(comment);
				if (result == null) result = caseTemplateableElement(comment);
				if (result == null) result = caseElement(comment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.DIRECTED_RELATIONSHIP: {
				DirectedRelationship directedRelationship = (DirectedRelationship)theEObject;
				T result = caseDirectedRelationship(directedRelationship);
				if (result == null) result = caseRelationship(directedRelationship);
				if (result == null) result = caseElement(directedRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.RELATIONSHIP: {
				Relationship relationship = (Relationship)theEObject;
				T result = caseRelationship(relationship);
				if (result == null) result = caseElement(relationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.CLASS: {
				org.csu.slicing.UML2.Class class_ = (org.csu.slicing.UML2.Class)theEObject;
				T result = caseClass(class_);
				if (result == null) result = caseBehavioredClassifier(class_);
				if (result == null) result = caseEncapsulatedClassifier(class_);
				if (result == null) result = caseStructuredClassifier(class_);
				if (result == null) result = caseClassifier(class_);
				if (result == null) result = caseNamespace(class_);
				if (result == null) result = caseType(class_);
				if (result == null) result = caseRedefinableElement(class_);
				if (result == null) result = casePackageableElement(class_);
				if (result == null) result = caseNamedElement(class_);
				if (result == null) result = caseTemplateableElement(class_);
				if (result == null) result = caseParameterableElement(class_);
				if (result == null) result = caseElement(class_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.TYPE: {
				Type type = (Type)theEObject;
				T result = caseType(type);
				if (result == null) result = casePackageableElement(type);
				if (result == null) result = caseNamedElement(type);
				if (result == null) result = caseParameterableElement(type);
				if (result == null) result = caseTemplateableElement(type);
				if (result == null) result = caseElement(type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.PROPERTY: {
				Property property = (Property)theEObject;
				T result = caseProperty(property);
				if (result == null) result = caseStructuralFeature(property);
				if (result == null) result = caseConnectableElement(property);
				if (result == null) result = caseDeploymentTarget(property);
				if (result == null) result = caseFeature(property);
				if (result == null) result = caseTypedElement(property);
				if (result == null) result = caseMultiplicityElement(property);
				if (result == null) result = caseParameterableElement(property);
				if (result == null) result = caseRedefinableElement(property);
				if (result == null) result = caseNamedElement(property);
				if (result == null) result = caseTemplateableElement(property);
				if (result == null) result = caseElement(property);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.OPERATION: {
				Operation operation = (Operation)theEObject;
				T result = caseOperation(operation);
				if (result == null) result = caseBehavioralFeature(operation);
				if (result == null) result = caseTypedElement(operation);
				if (result == null) result = caseMultiplicityElement(operation);
				if (result == null) result = caseParameterableElement(operation);
				if (result == null) result = caseNamespace(operation);
				if (result == null) result = caseFeature(operation);
				if (result == null) result = caseRedefinableElement(operation);
				if (result == null) result = caseNamedElement(operation);
				if (result == null) result = caseTemplateableElement(operation);
				if (result == null) result = caseElement(operation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.TYPED_ELEMENT: {
				TypedElement typedElement = (TypedElement)theEObject;
				T result = caseTypedElement(typedElement);
				if (result == null) result = caseNamedElement(typedElement);
				if (result == null) result = caseTemplateableElement(typedElement);
				if (result == null) result = caseElement(typedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.PARAMETER: {
				Parameter parameter = (Parameter)theEObject;
				T result = caseParameter(parameter);
				if (result == null) result = caseConnectableElement(parameter);
				if (result == null) result = caseTypedElement(parameter);
				if (result == null) result = caseMultiplicityElement(parameter);
				if (result == null) result = caseNamedElement(parameter);
				if (result == null) result = caseParameterableElement(parameter);
				if (result == null) result = caseTemplateableElement(parameter);
				if (result == null) result = caseElement(parameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.PACKAGE: {
				org.csu.slicing.UML2.Package package_ = (org.csu.slicing.UML2.Package)theEObject;
				T result = casePackage(package_);
				if (result == null) result = caseNamespace(package_);
				if (result == null) result = casePackageableElement(package_);
				if (result == null) result = caseNamedElement(package_);
				if (result == null) result = caseParameterableElement(package_);
				if (result == null) result = caseTemplateableElement(package_);
				if (result == null) result = caseElement(package_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.ENUMERATION: {
				Enumeration enumeration = (Enumeration)theEObject;
				T result = caseEnumeration(enumeration);
				if (result == null) result = caseDataType(enumeration);
				if (result == null) result = caseClassifier(enumeration);
				if (result == null) result = caseNamespace(enumeration);
				if (result == null) result = caseType(enumeration);
				if (result == null) result = caseRedefinableElement(enumeration);
				if (result == null) result = casePackageableElement(enumeration);
				if (result == null) result = caseNamedElement(enumeration);
				if (result == null) result = caseTemplateableElement(enumeration);
				if (result == null) result = caseParameterableElement(enumeration);
				if (result == null) result = caseElement(enumeration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.DATA_TYPE: {
				DataType dataType = (DataType)theEObject;
				T result = caseDataType(dataType);
				if (result == null) result = caseClassifier(dataType);
				if (result == null) result = caseNamespace(dataType);
				if (result == null) result = caseType(dataType);
				if (result == null) result = caseRedefinableElement(dataType);
				if (result == null) result = casePackageableElement(dataType);
				if (result == null) result = caseNamedElement(dataType);
				if (result == null) result = caseTemplateableElement(dataType);
				if (result == null) result = caseParameterableElement(dataType);
				if (result == null) result = caseElement(dataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.ENUMERATION_LITERAL: {
				EnumerationLiteral enumerationLiteral = (EnumerationLiteral)theEObject;
				T result = caseEnumerationLiteral(enumerationLiteral);
				if (result == null) result = caseInstanceSpecification(enumerationLiteral);
				if (result == null) result = casePackageableElement(enumerationLiteral);
				if (result == null) result = caseDeploymentTarget(enumerationLiteral);
				if (result == null) result = caseDeployedArtifact(enumerationLiteral);
				if (result == null) result = caseNamedElement(enumerationLiteral);
				if (result == null) result = caseParameterableElement(enumerationLiteral);
				if (result == null) result = caseTemplateableElement(enumerationLiteral);
				if (result == null) result = caseElement(enumerationLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.PRIMITIVE_TYPE: {
				PrimitiveType primitiveType = (PrimitiveType)theEObject;
				T result = casePrimitiveType(primitiveType);
				if (result == null) result = caseDataType(primitiveType);
				if (result == null) result = caseClassifier(primitiveType);
				if (result == null) result = caseNamespace(primitiveType);
				if (result == null) result = caseType(primitiveType);
				if (result == null) result = caseRedefinableElement(primitiveType);
				if (result == null) result = casePackageableElement(primitiveType);
				if (result == null) result = caseNamedElement(primitiveType);
				if (result == null) result = caseTemplateableElement(primitiveType);
				if (result == null) result = caseParameterableElement(primitiveType);
				if (result == null) result = caseElement(primitiveType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.CLASSIFIER: {
				Classifier classifier = (Classifier)theEObject;
				T result = caseClassifier(classifier);
				if (result == null) result = caseNamespace(classifier);
				if (result == null) result = caseType(classifier);
				if (result == null) result = caseRedefinableElement(classifier);
				if (result == null) result = casePackageableElement(classifier);
				if (result == null) result = caseNamedElement(classifier);
				if (result == null) result = caseTemplateableElement(classifier);
				if (result == null) result = caseParameterableElement(classifier);
				if (result == null) result = caseElement(classifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.FEATURE: {
				Feature feature = (Feature)theEObject;
				T result = caseFeature(feature);
				if (result == null) result = caseRedefinableElement(feature);
				if (result == null) result = caseNamedElement(feature);
				if (result == null) result = caseTemplateableElement(feature);
				if (result == null) result = caseElement(feature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.CONSTRAINT: {
				Constraint constraint = (Constraint)theEObject;
				T result = caseConstraint(constraint);
				if (result == null) result = casePackageableElement(constraint);
				if (result == null) result = caseNamedElement(constraint);
				if (result == null) result = caseParameterableElement(constraint);
				if (result == null) result = caseTemplateableElement(constraint);
				if (result == null) result = caseElement(constraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.LITERAL_BOOLEAN: {
				LiteralBoolean literalBoolean = (LiteralBoolean)theEObject;
				T result = caseLiteralBoolean(literalBoolean);
				if (result == null) result = caseLiteralSpecification(literalBoolean);
				if (result == null) result = caseValueSpecification(literalBoolean);
				if (result == null) result = caseTypedElement(literalBoolean);
				if (result == null) result = caseParameterableElement(literalBoolean);
				if (result == null) result = caseNamedElement(literalBoolean);
				if (result == null) result = caseTemplateableElement(literalBoolean);
				if (result == null) result = caseElement(literalBoolean);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.LITERAL_SPECIFICATION: {
				LiteralSpecification literalSpecification = (LiteralSpecification)theEObject;
				T result = caseLiteralSpecification(literalSpecification);
				if (result == null) result = caseValueSpecification(literalSpecification);
				if (result == null) result = caseTypedElement(literalSpecification);
				if (result == null) result = caseParameterableElement(literalSpecification);
				if (result == null) result = caseNamedElement(literalSpecification);
				if (result == null) result = caseTemplateableElement(literalSpecification);
				if (result == null) result = caseElement(literalSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.LITERAL_STRING: {
				LiteralString literalString = (LiteralString)theEObject;
				T result = caseLiteralString(literalString);
				if (result == null) result = caseLiteralSpecification(literalString);
				if (result == null) result = caseValueSpecification(literalString);
				if (result == null) result = caseTypedElement(literalString);
				if (result == null) result = caseParameterableElement(literalString);
				if (result == null) result = caseNamedElement(literalString);
				if (result == null) result = caseTemplateableElement(literalString);
				if (result == null) result = caseElement(literalString);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.LITERAL_NULL: {
				LiteralNull literalNull = (LiteralNull)theEObject;
				T result = caseLiteralNull(literalNull);
				if (result == null) result = caseLiteralSpecification(literalNull);
				if (result == null) result = caseValueSpecification(literalNull);
				if (result == null) result = caseTypedElement(literalNull);
				if (result == null) result = caseParameterableElement(literalNull);
				if (result == null) result = caseNamedElement(literalNull);
				if (result == null) result = caseTemplateableElement(literalNull);
				if (result == null) result = caseElement(literalNull);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.LITERAL_INTEGER: {
				LiteralInteger literalInteger = (LiteralInteger)theEObject;
				T result = caseLiteralInteger(literalInteger);
				if (result == null) result = caseLiteralSpecification(literalInteger);
				if (result == null) result = caseValueSpecification(literalInteger);
				if (result == null) result = caseTypedElement(literalInteger);
				if (result == null) result = caseParameterableElement(literalInteger);
				if (result == null) result = caseNamedElement(literalInteger);
				if (result == null) result = caseTemplateableElement(literalInteger);
				if (result == null) result = caseElement(literalInteger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.LITERAL_UNLIMITED_NATURAL: {
				LiteralUnlimitedNatural literalUnlimitedNatural = (LiteralUnlimitedNatural)theEObject;
				T result = caseLiteralUnlimitedNatural(literalUnlimitedNatural);
				if (result == null) result = caseLiteralSpecification(literalUnlimitedNatural);
				if (result == null) result = caseValueSpecification(literalUnlimitedNatural);
				if (result == null) result = caseTypedElement(literalUnlimitedNatural);
				if (result == null) result = caseParameterableElement(literalUnlimitedNatural);
				if (result == null) result = caseNamedElement(literalUnlimitedNatural);
				if (result == null) result = caseTemplateableElement(literalUnlimitedNatural);
				if (result == null) result = caseElement(literalUnlimitedNatural);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.BEHAVIORAL_FEATURE: {
				BehavioralFeature behavioralFeature = (BehavioralFeature)theEObject;
				T result = caseBehavioralFeature(behavioralFeature);
				if (result == null) result = caseNamespace(behavioralFeature);
				if (result == null) result = caseFeature(behavioralFeature);
				if (result == null) result = caseRedefinableElement(behavioralFeature);
				if (result == null) result = caseNamedElement(behavioralFeature);
				if (result == null) result = caseTemplateableElement(behavioralFeature);
				if (result == null) result = caseElement(behavioralFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.STRUCTURAL_FEATURE: {
				StructuralFeature structuralFeature = (StructuralFeature)theEObject;
				T result = caseStructuralFeature(structuralFeature);
				if (result == null) result = caseFeature(structuralFeature);
				if (result == null) result = caseTypedElement(structuralFeature);
				if (result == null) result = caseMultiplicityElement(structuralFeature);
				if (result == null) result = caseRedefinableElement(structuralFeature);
				if (result == null) result = caseNamedElement(structuralFeature);
				if (result == null) result = caseTemplateableElement(structuralFeature);
				if (result == null) result = caseElement(structuralFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.INSTANCE_SPECIFICATION: {
				InstanceSpecification instanceSpecification = (InstanceSpecification)theEObject;
				T result = caseInstanceSpecification(instanceSpecification);
				if (result == null) result = casePackageableElement(instanceSpecification);
				if (result == null) result = caseDeploymentTarget(instanceSpecification);
				if (result == null) result = caseDeployedArtifact(instanceSpecification);
				if (result == null) result = caseNamedElement(instanceSpecification);
				if (result == null) result = caseParameterableElement(instanceSpecification);
				if (result == null) result = caseTemplateableElement(instanceSpecification);
				if (result == null) result = caseElement(instanceSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.SLOT: {
				Slot slot = (Slot)theEObject;
				T result = caseSlot(slot);
				if (result == null) result = caseElement(slot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.INSTANCE_VALUE: {
				InstanceValue instanceValue = (InstanceValue)theEObject;
				T result = caseInstanceValue(instanceValue);
				if (result == null) result = caseValueSpecification(instanceValue);
				if (result == null) result = caseTypedElement(instanceValue);
				if (result == null) result = caseParameterableElement(instanceValue);
				if (result == null) result = caseNamedElement(instanceValue);
				if (result == null) result = caseTemplateableElement(instanceValue);
				if (result == null) result = caseElement(instanceValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.REDEFINABLE_ELEMENT: {
				RedefinableElement redefinableElement = (RedefinableElement)theEObject;
				T result = caseRedefinableElement(redefinableElement);
				if (result == null) result = caseNamedElement(redefinableElement);
				if (result == null) result = caseTemplateableElement(redefinableElement);
				if (result == null) result = caseElement(redefinableElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.GENERALIZATION: {
				Generalization generalization = (Generalization)theEObject;
				T result = caseGeneralization(generalization);
				if (result == null) result = caseDirectedRelationship(generalization);
				if (result == null) result = caseRelationship(generalization);
				if (result == null) result = caseElement(generalization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.PACKAGEABLE_ELEMENT: {
				PackageableElement packageableElement = (PackageableElement)theEObject;
				T result = casePackageableElement(packageableElement);
				if (result == null) result = caseNamedElement(packageableElement);
				if (result == null) result = caseParameterableElement(packageableElement);
				if (result == null) result = caseTemplateableElement(packageableElement);
				if (result == null) result = caseElement(packageableElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.ELEMENT_IMPORT: {
				ElementImport elementImport = (ElementImport)theEObject;
				T result = caseElementImport(elementImport);
				if (result == null) result = caseDirectedRelationship(elementImport);
				if (result == null) result = caseRelationship(elementImport);
				if (result == null) result = caseElement(elementImport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.PACKAGE_IMPORT: {
				PackageImport packageImport = (PackageImport)theEObject;
				T result = casePackageImport(packageImport);
				if (result == null) result = caseDirectedRelationship(packageImport);
				if (result == null) result = caseRelationship(packageImport);
				if (result == null) result = caseElement(packageImport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.ASSOCIATION: {
				Association association = (Association)theEObject;
				T result = caseAssociation(association);
				if (result == null) result = caseClassifier(association);
				if (result == null) result = caseRelationship(association);
				if (result == null) result = caseNamespace(association);
				if (result == null) result = caseType(association);
				if (result == null) result = caseRedefinableElement(association);
				if (result == null) result = casePackageableElement(association);
				if (result == null) result = caseNamedElement(association);
				if (result == null) result = caseTemplateableElement(association);
				if (result == null) result = caseParameterableElement(association);
				if (result == null) result = caseElement(association);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.PACKAGE_MERGE: {
				PackageMerge packageMerge = (PackageMerge)theEObject;
				T result = casePackageMerge(packageMerge);
				if (result == null) result = caseDirectedRelationship(packageMerge);
				if (result == null) result = caseRelationship(packageMerge);
				if (result == null) result = caseElement(packageMerge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.STEREOTYPE: {
				Stereotype stereotype = (Stereotype)theEObject;
				T result = caseStereotype(stereotype);
				if (result == null) result = caseClass(stereotype);
				if (result == null) result = caseBehavioredClassifier(stereotype);
				if (result == null) result = caseEncapsulatedClassifier(stereotype);
				if (result == null) result = caseStructuredClassifier(stereotype);
				if (result == null) result = caseClassifier(stereotype);
				if (result == null) result = caseNamespace(stereotype);
				if (result == null) result = caseType(stereotype);
				if (result == null) result = caseRedefinableElement(stereotype);
				if (result == null) result = casePackageableElement(stereotype);
				if (result == null) result = caseNamedElement(stereotype);
				if (result == null) result = caseTemplateableElement(stereotype);
				if (result == null) result = caseParameterableElement(stereotype);
				if (result == null) result = caseElement(stereotype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.PROFILE: {
				Profile profile = (Profile)theEObject;
				T result = caseProfile(profile);
				if (result == null) result = casePackage(profile);
				if (result == null) result = caseNamespace(profile);
				if (result == null) result = casePackageableElement(profile);
				if (result == null) result = caseNamedElement(profile);
				if (result == null) result = caseParameterableElement(profile);
				if (result == null) result = caseTemplateableElement(profile);
				if (result == null) result = caseElement(profile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.PROFILE_APPLICATION: {
				ProfileApplication profileApplication = (ProfileApplication)theEObject;
				T result = caseProfileApplication(profileApplication);
				if (result == null) result = casePackageImport(profileApplication);
				if (result == null) result = caseDirectedRelationship(profileApplication);
				if (result == null) result = caseRelationship(profileApplication);
				if (result == null) result = caseElement(profileApplication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.EXTENSION: {
				Extension extension = (Extension)theEObject;
				T result = caseExtension(extension);
				if (result == null) result = caseAssociation(extension);
				if (result == null) result = caseClassifier(extension);
				if (result == null) result = caseRelationship(extension);
				if (result == null) result = caseNamespace(extension);
				if (result == null) result = caseType(extension);
				if (result == null) result = caseRedefinableElement(extension);
				if (result == null) result = casePackageableElement(extension);
				if (result == null) result = caseNamedElement(extension);
				if (result == null) result = caseTemplateableElement(extension);
				if (result == null) result = caseParameterableElement(extension);
				if (result == null) result = caseElement(extension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.EXTENSION_END: {
				ExtensionEnd extensionEnd = (ExtensionEnd)theEObject;
				T result = caseExtensionEnd(extensionEnd);
				if (result == null) result = caseProperty(extensionEnd);
				if (result == null) result = caseStructuralFeature(extensionEnd);
				if (result == null) result = caseConnectableElement(extensionEnd);
				if (result == null) result = caseDeploymentTarget(extensionEnd);
				if (result == null) result = caseFeature(extensionEnd);
				if (result == null) result = caseTypedElement(extensionEnd);
				if (result == null) result = caseMultiplicityElement(extensionEnd);
				if (result == null) result = caseParameterableElement(extensionEnd);
				if (result == null) result = caseRedefinableElement(extensionEnd);
				if (result == null) result = caseNamedElement(extensionEnd);
				if (result == null) result = caseTemplateableElement(extensionEnd);
				if (result == null) result = caseElement(extensionEnd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.BEHAVIOR: {
				Behavior behavior = (Behavior)theEObject;
				T result = caseBehavior(behavior);
				if (result == null) result = caseClass(behavior);
				if (result == null) result = caseBehavioredClassifier(behavior);
				if (result == null) result = caseEncapsulatedClassifier(behavior);
				if (result == null) result = caseStructuredClassifier(behavior);
				if (result == null) result = caseClassifier(behavior);
				if (result == null) result = caseNamespace(behavior);
				if (result == null) result = caseType(behavior);
				if (result == null) result = caseRedefinableElement(behavior);
				if (result == null) result = casePackageableElement(behavior);
				if (result == null) result = caseNamedElement(behavior);
				if (result == null) result = caseTemplateableElement(behavior);
				if (result == null) result = caseParameterableElement(behavior);
				if (result == null) result = caseElement(behavior);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.BEHAVIORED_CLASSIFIER: {
				BehavioredClassifier behavioredClassifier = (BehavioredClassifier)theEObject;
				T result = caseBehavioredClassifier(behavioredClassifier);
				if (result == null) result = caseClassifier(behavioredClassifier);
				if (result == null) result = caseNamespace(behavioredClassifier);
				if (result == null) result = caseType(behavioredClassifier);
				if (result == null) result = caseRedefinableElement(behavioredClassifier);
				if (result == null) result = casePackageableElement(behavioredClassifier);
				if (result == null) result = caseNamedElement(behavioredClassifier);
				if (result == null) result = caseTemplateableElement(behavioredClassifier);
				if (result == null) result = caseParameterableElement(behavioredClassifier);
				if (result == null) result = caseElement(behavioredClassifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.ACTIVITY: {
				Activity activity = (Activity)theEObject;
				T result = caseActivity(activity);
				if (result == null) result = caseBehavior(activity);
				if (result == null) result = caseClass(activity);
				if (result == null) result = caseBehavioredClassifier(activity);
				if (result == null) result = caseEncapsulatedClassifier(activity);
				if (result == null) result = caseStructuredClassifier(activity);
				if (result == null) result = caseClassifier(activity);
				if (result == null) result = caseNamespace(activity);
				if (result == null) result = caseType(activity);
				if (result == null) result = caseRedefinableElement(activity);
				if (result == null) result = casePackageableElement(activity);
				if (result == null) result = caseNamedElement(activity);
				if (result == null) result = caseTemplateableElement(activity);
				if (result == null) result = caseParameterableElement(activity);
				if (result == null) result = caseElement(activity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.PERMISSION: {
				Permission permission = (Permission)theEObject;
				T result = casePermission(permission);
				if (result == null) result = caseDependency(permission);
				if (result == null) result = casePackageableElement(permission);
				if (result == null) result = caseDirectedRelationship(permission);
				if (result == null) result = caseNamedElement(permission);
				if (result == null) result = caseParameterableElement(permission);
				if (result == null) result = caseRelationship(permission);
				if (result == null) result = caseTemplateableElement(permission);
				if (result == null) result = caseElement(permission);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.DEPENDENCY: {
				Dependency dependency = (Dependency)theEObject;
				T result = caseDependency(dependency);
				if (result == null) result = casePackageableElement(dependency);
				if (result == null) result = caseDirectedRelationship(dependency);
				if (result == null) result = caseNamedElement(dependency);
				if (result == null) result = caseParameterableElement(dependency);
				if (result == null) result = caseRelationship(dependency);
				if (result == null) result = caseTemplateableElement(dependency);
				if (result == null) result = caseElement(dependency);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.USAGE: {
				Usage usage = (Usage)theEObject;
				T result = caseUsage(usage);
				if (result == null) result = caseDependency(usage);
				if (result == null) result = casePackageableElement(usage);
				if (result == null) result = caseDirectedRelationship(usage);
				if (result == null) result = caseNamedElement(usage);
				if (result == null) result = caseParameterableElement(usage);
				if (result == null) result = caseRelationship(usage);
				if (result == null) result = caseTemplateableElement(usage);
				if (result == null) result = caseElement(usage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.ABSTRACTION: {
				Abstraction abstraction = (Abstraction)theEObject;
				T result = caseAbstraction(abstraction);
				if (result == null) result = caseDependency(abstraction);
				if (result == null) result = casePackageableElement(abstraction);
				if (result == null) result = caseDirectedRelationship(abstraction);
				if (result == null) result = caseNamedElement(abstraction);
				if (result == null) result = caseParameterableElement(abstraction);
				if (result == null) result = caseRelationship(abstraction);
				if (result == null) result = caseTemplateableElement(abstraction);
				if (result == null) result = caseElement(abstraction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.REALIZATION: {
				Realization realization = (Realization)theEObject;
				T result = caseRealization(realization);
				if (result == null) result = caseAbstraction(realization);
				if (result == null) result = caseDependency(realization);
				if (result == null) result = casePackageableElement(realization);
				if (result == null) result = caseDirectedRelationship(realization);
				if (result == null) result = caseNamedElement(realization);
				if (result == null) result = caseParameterableElement(realization);
				if (result == null) result = caseRelationship(realization);
				if (result == null) result = caseTemplateableElement(realization);
				if (result == null) result = caseElement(realization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.SUBSTITUTION: {
				Substitution substitution = (Substitution)theEObject;
				T result = caseSubstitution(substitution);
				if (result == null) result = caseRealization(substitution);
				if (result == null) result = caseAbstraction(substitution);
				if (result == null) result = caseDependency(substitution);
				if (result == null) result = casePackageableElement(substitution);
				if (result == null) result = caseDirectedRelationship(substitution);
				if (result == null) result = caseNamedElement(substitution);
				if (result == null) result = caseParameterableElement(substitution);
				if (result == null) result = caseRelationship(substitution);
				if (result == null) result = caseTemplateableElement(substitution);
				if (result == null) result = caseElement(substitution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.GENERALIZATION_SET: {
				GeneralizationSet generalizationSet = (GeneralizationSet)theEObject;
				T result = caseGeneralizationSet(generalizationSet);
				if (result == null) result = casePackageableElement(generalizationSet);
				if (result == null) result = caseNamedElement(generalizationSet);
				if (result == null) result = caseParameterableElement(generalizationSet);
				if (result == null) result = caseTemplateableElement(generalizationSet);
				if (result == null) result = caseElement(generalizationSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.ASSOCIATION_CLASS: {
				AssociationClass associationClass = (AssociationClass)theEObject;
				T result = caseAssociationClass(associationClass);
				if (result == null) result = caseClass(associationClass);
				if (result == null) result = caseAssociation(associationClass);
				if (result == null) result = caseBehavioredClassifier(associationClass);
				if (result == null) result = caseEncapsulatedClassifier(associationClass);
				if (result == null) result = caseRelationship(associationClass);
				if (result == null) result = caseStructuredClassifier(associationClass);
				if (result == null) result = caseClassifier(associationClass);
				if (result == null) result = caseNamespace(associationClass);
				if (result == null) result = caseType(associationClass);
				if (result == null) result = caseRedefinableElement(associationClass);
				if (result == null) result = casePackageableElement(associationClass);
				if (result == null) result = caseNamedElement(associationClass);
				if (result == null) result = caseTemplateableElement(associationClass);
				if (result == null) result = caseParameterableElement(associationClass);
				if (result == null) result = caseElement(associationClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.INFORMATION_ITEM: {
				InformationItem informationItem = (InformationItem)theEObject;
				T result = caseInformationItem(informationItem);
				if (result == null) result = caseClassifier(informationItem);
				if (result == null) result = caseNamespace(informationItem);
				if (result == null) result = caseType(informationItem);
				if (result == null) result = caseRedefinableElement(informationItem);
				if (result == null) result = casePackageableElement(informationItem);
				if (result == null) result = caseNamedElement(informationItem);
				if (result == null) result = caseTemplateableElement(informationItem);
				if (result == null) result = caseParameterableElement(informationItem);
				if (result == null) result = caseElement(informationItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.INFORMATION_FLOW: {
				InformationFlow informationFlow = (InformationFlow)theEObject;
				T result = caseInformationFlow(informationFlow);
				if (result == null) result = casePackageableElement(informationFlow);
				if (result == null) result = caseDirectedRelationship(informationFlow);
				if (result == null) result = caseNamedElement(informationFlow);
				if (result == null) result = caseParameterableElement(informationFlow);
				if (result == null) result = caseRelationship(informationFlow);
				if (result == null) result = caseTemplateableElement(informationFlow);
				if (result == null) result = caseElement(informationFlow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.MODEL: {
				Model model = (Model)theEObject;
				T result = caseModel(model);
				if (result == null) result = casePackage(model);
				if (result == null) result = caseNamespace(model);
				if (result == null) result = casePackageableElement(model);
				if (result == null) result = caseNamedElement(model);
				if (result == null) result = caseParameterableElement(model);
				if (result == null) result = caseTemplateableElement(model);
				if (result == null) result = caseElement(model);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.CONNECTOR_END: {
				ConnectorEnd connectorEnd = (ConnectorEnd)theEObject;
				T result = caseConnectorEnd(connectorEnd);
				if (result == null) result = caseMultiplicityElement(connectorEnd);
				if (result == null) result = caseElement(connectorEnd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.CONNECTABLE_ELEMENT: {
				ConnectableElement connectableElement = (ConnectableElement)theEObject;
				T result = caseConnectableElement(connectableElement);
				if (result == null) result = caseNamedElement(connectableElement);
				if (result == null) result = caseParameterableElement(connectableElement);
				if (result == null) result = caseTemplateableElement(connectableElement);
				if (result == null) result = caseElement(connectableElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.CONNECTOR: {
				Connector connector = (Connector)theEObject;
				T result = caseConnector(connector);
				if (result == null) result = caseFeature(connector);
				if (result == null) result = caseRedefinableElement(connector);
				if (result == null) result = caseNamedElement(connector);
				if (result == null) result = caseTemplateableElement(connector);
				if (result == null) result = caseElement(connector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.STRUCTURED_CLASSIFIER: {
				StructuredClassifier structuredClassifier = (StructuredClassifier)theEObject;
				T result = caseStructuredClassifier(structuredClassifier);
				if (result == null) result = caseClassifier(structuredClassifier);
				if (result == null) result = caseNamespace(structuredClassifier);
				if (result == null) result = caseType(structuredClassifier);
				if (result == null) result = caseRedefinableElement(structuredClassifier);
				if (result == null) result = casePackageableElement(structuredClassifier);
				if (result == null) result = caseNamedElement(structuredClassifier);
				if (result == null) result = caseTemplateableElement(structuredClassifier);
				if (result == null) result = caseParameterableElement(structuredClassifier);
				if (result == null) result = caseElement(structuredClassifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.ACTIVITY_EDGE: {
				ActivityEdge activityEdge = (ActivityEdge)theEObject;
				T result = caseActivityEdge(activityEdge);
				if (result == null) result = caseRedefinableElement(activityEdge);
				if (result == null) result = caseNamedElement(activityEdge);
				if (result == null) result = caseTemplateableElement(activityEdge);
				if (result == null) result = caseElement(activityEdge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.ACTIVITY_GROUP: {
				ActivityGroup activityGroup = (ActivityGroup)theEObject;
				T result = caseActivityGroup(activityGroup);
				if (result == null) result = caseElement(activityGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.ACTIVITY_NODE: {
				ActivityNode activityNode = (ActivityNode)theEObject;
				T result = caseActivityNode(activityNode);
				if (result == null) result = caseRedefinableElement(activityNode);
				if (result == null) result = caseNamedElement(activityNode);
				if (result == null) result = caseTemplateableElement(activityNode);
				if (result == null) result = caseElement(activityNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.ACTION: {
				Action action = (Action)theEObject;
				T result = caseAction(action);
				if (result == null) result = caseExecutableNode(action);
				if (result == null) result = caseActivityNode(action);
				if (result == null) result = caseRedefinableElement(action);
				if (result == null) result = caseNamedElement(action);
				if (result == null) result = caseTemplateableElement(action);
				if (result == null) result = caseElement(action);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.OBJECT_NODE: {
				ObjectNode objectNode = (ObjectNode)theEObject;
				T result = caseObjectNode(objectNode);
				if (result == null) result = caseActivityNode(objectNode);
				if (result == null) result = caseTypedElement(objectNode);
				if (result == null) result = caseRedefinableElement(objectNode);
				if (result == null) result = caseNamedElement(objectNode);
				if (result == null) result = caseTemplateableElement(objectNode);
				if (result == null) result = caseElement(objectNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.CONTROL_NODE: {
				ControlNode controlNode = (ControlNode)theEObject;
				T result = caseControlNode(controlNode);
				if (result == null) result = caseActivityNode(controlNode);
				if (result == null) result = caseRedefinableElement(controlNode);
				if (result == null) result = caseNamedElement(controlNode);
				if (result == null) result = caseTemplateableElement(controlNode);
				if (result == null) result = caseElement(controlNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.CONTROL_FLOW: {
				ControlFlow controlFlow = (ControlFlow)theEObject;
				T result = caseControlFlow(controlFlow);
				if (result == null) result = caseActivityEdge(controlFlow);
				if (result == null) result = caseRedefinableElement(controlFlow);
				if (result == null) result = caseNamedElement(controlFlow);
				if (result == null) result = caseTemplateableElement(controlFlow);
				if (result == null) result = caseElement(controlFlow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.OBJECT_FLOW: {
				ObjectFlow objectFlow = (ObjectFlow)theEObject;
				T result = caseObjectFlow(objectFlow);
				if (result == null) result = caseActivityEdge(objectFlow);
				if (result == null) result = caseRedefinableElement(objectFlow);
				if (result == null) result = caseNamedElement(objectFlow);
				if (result == null) result = caseTemplateableElement(objectFlow);
				if (result == null) result = caseElement(objectFlow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.INITIAL_NODE: {
				InitialNode initialNode = (InitialNode)theEObject;
				T result = caseInitialNode(initialNode);
				if (result == null) result = caseControlNode(initialNode);
				if (result == null) result = caseActivityNode(initialNode);
				if (result == null) result = caseRedefinableElement(initialNode);
				if (result == null) result = caseNamedElement(initialNode);
				if (result == null) result = caseTemplateableElement(initialNode);
				if (result == null) result = caseElement(initialNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.FINAL_NODE: {
				FinalNode finalNode = (FinalNode)theEObject;
				T result = caseFinalNode(finalNode);
				if (result == null) result = caseControlNode(finalNode);
				if (result == null) result = caseActivityNode(finalNode);
				if (result == null) result = caseRedefinableElement(finalNode);
				if (result == null) result = caseNamedElement(finalNode);
				if (result == null) result = caseTemplateableElement(finalNode);
				if (result == null) result = caseElement(finalNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.ACTIVITY_FINAL_NODE: {
				ActivityFinalNode activityFinalNode = (ActivityFinalNode)theEObject;
				T result = caseActivityFinalNode(activityFinalNode);
				if (result == null) result = caseFinalNode(activityFinalNode);
				if (result == null) result = caseControlNode(activityFinalNode);
				if (result == null) result = caseActivityNode(activityFinalNode);
				if (result == null) result = caseRedefinableElement(activityFinalNode);
				if (result == null) result = caseNamedElement(activityFinalNode);
				if (result == null) result = caseTemplateableElement(activityFinalNode);
				if (result == null) result = caseElement(activityFinalNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.DECISION_NODE: {
				DecisionNode decisionNode = (DecisionNode)theEObject;
				T result = caseDecisionNode(decisionNode);
				if (result == null) result = caseControlNode(decisionNode);
				if (result == null) result = caseActivityNode(decisionNode);
				if (result == null) result = caseRedefinableElement(decisionNode);
				if (result == null) result = caseNamedElement(decisionNode);
				if (result == null) result = caseTemplateableElement(decisionNode);
				if (result == null) result = caseElement(decisionNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.MERGE_NODE: {
				MergeNode mergeNode = (MergeNode)theEObject;
				T result = caseMergeNode(mergeNode);
				if (result == null) result = caseControlNode(mergeNode);
				if (result == null) result = caseActivityNode(mergeNode);
				if (result == null) result = caseRedefinableElement(mergeNode);
				if (result == null) result = caseNamedElement(mergeNode);
				if (result == null) result = caseTemplateableElement(mergeNode);
				if (result == null) result = caseElement(mergeNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.EXECUTABLE_NODE: {
				ExecutableNode executableNode = (ExecutableNode)theEObject;
				T result = caseExecutableNode(executableNode);
				if (result == null) result = caseActivityNode(executableNode);
				if (result == null) result = caseRedefinableElement(executableNode);
				if (result == null) result = caseNamedElement(executableNode);
				if (result == null) result = caseTemplateableElement(executableNode);
				if (result == null) result = caseElement(executableNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.OUTPUT_PIN: {
				OutputPin outputPin = (OutputPin)theEObject;
				T result = caseOutputPin(outputPin);
				if (result == null) result = casePin(outputPin);
				if (result == null) result = caseObjectNode(outputPin);
				if (result == null) result = caseMultiplicityElement(outputPin);
				if (result == null) result = caseActivityNode(outputPin);
				if (result == null) result = caseTypedElement(outputPin);
				if (result == null) result = caseRedefinableElement(outputPin);
				if (result == null) result = caseNamedElement(outputPin);
				if (result == null) result = caseTemplateableElement(outputPin);
				if (result == null) result = caseElement(outputPin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.INPUT_PIN: {
				InputPin inputPin = (InputPin)theEObject;
				T result = caseInputPin(inputPin);
				if (result == null) result = casePin(inputPin);
				if (result == null) result = caseObjectNode(inputPin);
				if (result == null) result = caseMultiplicityElement(inputPin);
				if (result == null) result = caseActivityNode(inputPin);
				if (result == null) result = caseTypedElement(inputPin);
				if (result == null) result = caseRedefinableElement(inputPin);
				if (result == null) result = caseNamedElement(inputPin);
				if (result == null) result = caseTemplateableElement(inputPin);
				if (result == null) result = caseElement(inputPin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.PIN: {
				Pin pin = (Pin)theEObject;
				T result = casePin(pin);
				if (result == null) result = caseObjectNode(pin);
				if (result == null) result = caseMultiplicityElement(pin);
				if (result == null) result = caseActivityNode(pin);
				if (result == null) result = caseTypedElement(pin);
				if (result == null) result = caseRedefinableElement(pin);
				if (result == null) result = caseNamedElement(pin);
				if (result == null) result = caseTemplateableElement(pin);
				if (result == null) result = caseElement(pin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.ACTIVITY_PARAMETER_NODE: {
				ActivityParameterNode activityParameterNode = (ActivityParameterNode)theEObject;
				T result = caseActivityParameterNode(activityParameterNode);
				if (result == null) result = caseObjectNode(activityParameterNode);
				if (result == null) result = caseActivityNode(activityParameterNode);
				if (result == null) result = caseTypedElement(activityParameterNode);
				if (result == null) result = caseRedefinableElement(activityParameterNode);
				if (result == null) result = caseNamedElement(activityParameterNode);
				if (result == null) result = caseTemplateableElement(activityParameterNode);
				if (result == null) result = caseElement(activityParameterNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.VALUE_PIN: {
				ValuePin valuePin = (ValuePin)theEObject;
				T result = caseValuePin(valuePin);
				if (result == null) result = caseInputPin(valuePin);
				if (result == null) result = casePin(valuePin);
				if (result == null) result = caseObjectNode(valuePin);
				if (result == null) result = caseMultiplicityElement(valuePin);
				if (result == null) result = caseActivityNode(valuePin);
				if (result == null) result = caseTypedElement(valuePin);
				if (result == null) result = caseRedefinableElement(valuePin);
				if (result == null) result = caseNamedElement(valuePin);
				if (result == null) result = caseTemplateableElement(valuePin);
				if (result == null) result = caseElement(valuePin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.INTERFACE: {
				Interface interface_ = (Interface)theEObject;
				T result = caseInterface(interface_);
				if (result == null) result = caseClassifier(interface_);
				if (result == null) result = caseNamespace(interface_);
				if (result == null) result = caseType(interface_);
				if (result == null) result = caseRedefinableElement(interface_);
				if (result == null) result = casePackageableElement(interface_);
				if (result == null) result = caseNamedElement(interface_);
				if (result == null) result = caseTemplateableElement(interface_);
				if (result == null) result = caseParameterableElement(interface_);
				if (result == null) result = caseElement(interface_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.IMPLEMENTATION: {
				Implementation implementation = (Implementation)theEObject;
				T result = caseImplementation(implementation);
				if (result == null) result = caseRealization(implementation);
				if (result == null) result = caseAbstraction(implementation);
				if (result == null) result = caseDependency(implementation);
				if (result == null) result = casePackageableElement(implementation);
				if (result == null) result = caseDirectedRelationship(implementation);
				if (result == null) result = caseNamedElement(implementation);
				if (result == null) result = caseParameterableElement(implementation);
				if (result == null) result = caseRelationship(implementation);
				if (result == null) result = caseTemplateableElement(implementation);
				if (result == null) result = caseElement(implementation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.ARTIFACT: {
				Artifact artifact = (Artifact)theEObject;
				T result = caseArtifact(artifact);
				if (result == null) result = caseClassifier(artifact);
				if (result == null) result = caseDeployedArtifact(artifact);
				if (result == null) result = caseNamespace(artifact);
				if (result == null) result = caseType(artifact);
				if (result == null) result = caseRedefinableElement(artifact);
				if (result == null) result = casePackageableElement(artifact);
				if (result == null) result = caseNamedElement(artifact);
				if (result == null) result = caseTemplateableElement(artifact);
				if (result == null) result = caseParameterableElement(artifact);
				if (result == null) result = caseElement(artifact);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.MANIFESTATION: {
				Manifestation manifestation = (Manifestation)theEObject;
				T result = caseManifestation(manifestation);
				if (result == null) result = caseAbstraction(manifestation);
				if (result == null) result = caseDependency(manifestation);
				if (result == null) result = casePackageableElement(manifestation);
				if (result == null) result = caseDirectedRelationship(manifestation);
				if (result == null) result = caseNamedElement(manifestation);
				if (result == null) result = caseParameterableElement(manifestation);
				if (result == null) result = caseRelationship(manifestation);
				if (result == null) result = caseTemplateableElement(manifestation);
				if (result == null) result = caseElement(manifestation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.ACTOR: {
				Actor actor = (Actor)theEObject;
				T result = caseActor(actor);
				if (result == null) result = caseClassifier(actor);
				if (result == null) result = caseNamespace(actor);
				if (result == null) result = caseType(actor);
				if (result == null) result = caseRedefinableElement(actor);
				if (result == null) result = casePackageableElement(actor);
				if (result == null) result = caseNamedElement(actor);
				if (result == null) result = caseTemplateableElement(actor);
				if (result == null) result = caseParameterableElement(actor);
				if (result == null) result = caseElement(actor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.EXTEND: {
				Extend extend = (Extend)theEObject;
				T result = caseExtend(extend);
				if (result == null) result = caseNamedElement(extend);
				if (result == null) result = caseDirectedRelationship(extend);
				if (result == null) result = caseTemplateableElement(extend);
				if (result == null) result = caseRelationship(extend);
				if (result == null) result = caseElement(extend);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.USE_CASE: {
				UseCase useCase = (UseCase)theEObject;
				T result = caseUseCase(useCase);
				if (result == null) result = caseBehavioredClassifier(useCase);
				if (result == null) result = caseClassifier(useCase);
				if (result == null) result = caseNamespace(useCase);
				if (result == null) result = caseType(useCase);
				if (result == null) result = caseRedefinableElement(useCase);
				if (result == null) result = casePackageableElement(useCase);
				if (result == null) result = caseNamedElement(useCase);
				if (result == null) result = caseTemplateableElement(useCase);
				if (result == null) result = caseParameterableElement(useCase);
				if (result == null) result = caseElement(useCase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.EXTENSION_POINT: {
				ExtensionPoint extensionPoint = (ExtensionPoint)theEObject;
				T result = caseExtensionPoint(extensionPoint);
				if (result == null) result = caseRedefinableElement(extensionPoint);
				if (result == null) result = caseNamedElement(extensionPoint);
				if (result == null) result = caseTemplateableElement(extensionPoint);
				if (result == null) result = caseElement(extensionPoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.INCLUDE: {
				Include include = (Include)theEObject;
				T result = caseInclude(include);
				if (result == null) result = caseNamedElement(include);
				if (result == null) result = caseDirectedRelationship(include);
				if (result == null) result = caseTemplateableElement(include);
				if (result == null) result = caseRelationship(include);
				if (result == null) result = caseElement(include);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.COLLABORATION_OCCURRENCE: {
				CollaborationOccurrence collaborationOccurrence = (CollaborationOccurrence)theEObject;
				T result = caseCollaborationOccurrence(collaborationOccurrence);
				if (result == null) result = caseNamedElement(collaborationOccurrence);
				if (result == null) result = caseTemplateableElement(collaborationOccurrence);
				if (result == null) result = caseElement(collaborationOccurrence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.COLLABORATION: {
				Collaboration collaboration = (Collaboration)theEObject;
				T result = caseCollaboration(collaboration);
				if (result == null) result = caseBehavioredClassifier(collaboration);
				if (result == null) result = caseStructuredClassifier(collaboration);
				if (result == null) result = caseClassifier(collaboration);
				if (result == null) result = caseNamespace(collaboration);
				if (result == null) result = caseType(collaboration);
				if (result == null) result = caseRedefinableElement(collaboration);
				if (result == null) result = casePackageableElement(collaboration);
				if (result == null) result = caseNamedElement(collaboration);
				if (result == null) result = caseTemplateableElement(collaboration);
				if (result == null) result = caseParameterableElement(collaboration);
				if (result == null) result = caseElement(collaboration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.PORT: {
				Port port = (Port)theEObject;
				T result = casePort(port);
				if (result == null) result = caseProperty(port);
				if (result == null) result = caseStructuralFeature(port);
				if (result == null) result = caseConnectableElement(port);
				if (result == null) result = caseDeploymentTarget(port);
				if (result == null) result = caseFeature(port);
				if (result == null) result = caseTypedElement(port);
				if (result == null) result = caseMultiplicityElement(port);
				if (result == null) result = caseParameterableElement(port);
				if (result == null) result = caseRedefinableElement(port);
				if (result == null) result = caseNamedElement(port);
				if (result == null) result = caseTemplateableElement(port);
				if (result == null) result = caseElement(port);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.ENCAPSULATED_CLASSIFIER: {
				EncapsulatedClassifier encapsulatedClassifier = (EncapsulatedClassifier)theEObject;
				T result = caseEncapsulatedClassifier(encapsulatedClassifier);
				if (result == null) result = caseStructuredClassifier(encapsulatedClassifier);
				if (result == null) result = caseClassifier(encapsulatedClassifier);
				if (result == null) result = caseNamespace(encapsulatedClassifier);
				if (result == null) result = caseType(encapsulatedClassifier);
				if (result == null) result = caseRedefinableElement(encapsulatedClassifier);
				if (result == null) result = casePackageableElement(encapsulatedClassifier);
				if (result == null) result = caseNamedElement(encapsulatedClassifier);
				if (result == null) result = caseTemplateableElement(encapsulatedClassifier);
				if (result == null) result = caseParameterableElement(encapsulatedClassifier);
				if (result == null) result = caseElement(encapsulatedClassifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.CALL_TRIGGER: {
				CallTrigger callTrigger = (CallTrigger)theEObject;
				T result = caseCallTrigger(callTrigger);
				if (result == null) result = caseMessageTrigger(callTrigger);
				if (result == null) result = caseTrigger(callTrigger);
				if (result == null) result = caseNamedElement(callTrigger);
				if (result == null) result = caseTemplateableElement(callTrigger);
				if (result == null) result = caseElement(callTrigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.MESSAGE_TRIGGER: {
				MessageTrigger messageTrigger = (MessageTrigger)theEObject;
				T result = caseMessageTrigger(messageTrigger);
				if (result == null) result = caseTrigger(messageTrigger);
				if (result == null) result = caseNamedElement(messageTrigger);
				if (result == null) result = caseTemplateableElement(messageTrigger);
				if (result == null) result = caseElement(messageTrigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.CHANGE_TRIGGER: {
				ChangeTrigger changeTrigger = (ChangeTrigger)theEObject;
				T result = caseChangeTrigger(changeTrigger);
				if (result == null) result = caseTrigger(changeTrigger);
				if (result == null) result = caseNamedElement(changeTrigger);
				if (result == null) result = caseTemplateableElement(changeTrigger);
				if (result == null) result = caseElement(changeTrigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.TRIGGER: {
				Trigger trigger = (Trigger)theEObject;
				T result = caseTrigger(trigger);
				if (result == null) result = caseNamedElement(trigger);
				if (result == null) result = caseTemplateableElement(trigger);
				if (result == null) result = caseElement(trigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.RECEPTION: {
				Reception reception = (Reception)theEObject;
				T result = caseReception(reception);
				if (result == null) result = caseBehavioralFeature(reception);
				if (result == null) result = caseNamespace(reception);
				if (result == null) result = caseFeature(reception);
				if (result == null) result = caseRedefinableElement(reception);
				if (result == null) result = caseNamedElement(reception);
				if (result == null) result = caseTemplateableElement(reception);
				if (result == null) result = caseElement(reception);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.SIGNAL: {
				Signal signal = (Signal)theEObject;
				T result = caseSignal(signal);
				if (result == null) result = caseClassifier(signal);
				if (result == null) result = caseNamespace(signal);
				if (result == null) result = caseType(signal);
				if (result == null) result = caseRedefinableElement(signal);
				if (result == null) result = casePackageableElement(signal);
				if (result == null) result = caseNamedElement(signal);
				if (result == null) result = caseTemplateableElement(signal);
				if (result == null) result = caseParameterableElement(signal);
				if (result == null) result = caseElement(signal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.SIGNAL_TRIGGER: {
				SignalTrigger signalTrigger = (SignalTrigger)theEObject;
				T result = caseSignalTrigger(signalTrigger);
				if (result == null) result = caseMessageTrigger(signalTrigger);
				if (result == null) result = caseTrigger(signalTrigger);
				if (result == null) result = caseNamedElement(signalTrigger);
				if (result == null) result = caseTemplateableElement(signalTrigger);
				if (result == null) result = caseElement(signalTrigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.TIME_TRIGGER: {
				TimeTrigger timeTrigger = (TimeTrigger)theEObject;
				T result = caseTimeTrigger(timeTrigger);
				if (result == null) result = caseTrigger(timeTrigger);
				if (result == null) result = caseNamedElement(timeTrigger);
				if (result == null) result = caseTemplateableElement(timeTrigger);
				if (result == null) result = caseElement(timeTrigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.ANY_TRIGGER: {
				AnyTrigger anyTrigger = (AnyTrigger)theEObject;
				T result = caseAnyTrigger(anyTrigger);
				if (result == null) result = caseMessageTrigger(anyTrigger);
				if (result == null) result = caseTrigger(anyTrigger);
				if (result == null) result = caseNamedElement(anyTrigger);
				if (result == null) result = caseTemplateableElement(anyTrigger);
				if (result == null) result = caseElement(anyTrigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.VARIABLE: {
				Variable variable = (Variable)theEObject;
				T result = caseVariable(variable);
				if (result == null) result = caseConnectableElement(variable);
				if (result == null) result = caseTypedElement(variable);
				if (result == null) result = caseMultiplicityElement(variable);
				if (result == null) result = caseNamedElement(variable);
				if (result == null) result = caseParameterableElement(variable);
				if (result == null) result = caseTemplateableElement(variable);
				if (result == null) result = caseElement(variable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.STRUCTURED_ACTIVITY_NODE: {
				StructuredActivityNode structuredActivityNode = (StructuredActivityNode)theEObject;
				T result = caseStructuredActivityNode(structuredActivityNode);
				if (result == null) result = caseAction(structuredActivityNode);
				if (result == null) result = caseNamespace(structuredActivityNode);
				if (result == null) result = caseActivityGroup(structuredActivityNode);
				if (result == null) result = caseExecutableNode(structuredActivityNode);
				if (result == null) result = caseActivityNode(structuredActivityNode);
				if (result == null) result = caseRedefinableElement(structuredActivityNode);
				if (result == null) result = caseNamedElement(structuredActivityNode);
				if (result == null) result = caseTemplateableElement(structuredActivityNode);
				if (result == null) result = caseElement(structuredActivityNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.CONDITIONAL_NODE: {
				ConditionalNode conditionalNode = (ConditionalNode)theEObject;
				T result = caseConditionalNode(conditionalNode);
				if (result == null) result = caseStructuredActivityNode(conditionalNode);
				if (result == null) result = caseAction(conditionalNode);
				if (result == null) result = caseNamespace(conditionalNode);
				if (result == null) result = caseActivityGroup(conditionalNode);
				if (result == null) result = caseExecutableNode(conditionalNode);
				if (result == null) result = caseActivityNode(conditionalNode);
				if (result == null) result = caseRedefinableElement(conditionalNode);
				if (result == null) result = caseNamedElement(conditionalNode);
				if (result == null) result = caseTemplateableElement(conditionalNode);
				if (result == null) result = caseElement(conditionalNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.CLAUSE: {
				Clause clause = (Clause)theEObject;
				T result = caseClause(clause);
				if (result == null) result = caseElement(clause);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.LOOP_NODE: {
				LoopNode loopNode = (LoopNode)theEObject;
				T result = caseLoopNode(loopNode);
				if (result == null) result = caseStructuredActivityNode(loopNode);
				if (result == null) result = caseAction(loopNode);
				if (result == null) result = caseNamespace(loopNode);
				if (result == null) result = caseActivityGroup(loopNode);
				if (result == null) result = caseExecutableNode(loopNode);
				if (result == null) result = caseActivityNode(loopNode);
				if (result == null) result = caseRedefinableElement(loopNode);
				if (result == null) result = caseNamedElement(loopNode);
				if (result == null) result = caseTemplateableElement(loopNode);
				if (result == null) result = caseElement(loopNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.INTERACTION: {
				Interaction interaction = (Interaction)theEObject;
				T result = caseInteraction(interaction);
				if (result == null) result = caseBehavior(interaction);
				if (result == null) result = caseInteractionFragment(interaction);
				if (result == null) result = caseClass(interaction);
				if (result == null) result = caseBehavioredClassifier(interaction);
				if (result == null) result = caseEncapsulatedClassifier(interaction);
				if (result == null) result = caseStructuredClassifier(interaction);
				if (result == null) result = caseClassifier(interaction);
				if (result == null) result = caseNamespace(interaction);
				if (result == null) result = caseType(interaction);
				if (result == null) result = caseRedefinableElement(interaction);
				if (result == null) result = casePackageableElement(interaction);
				if (result == null) result = caseNamedElement(interaction);
				if (result == null) result = caseTemplateableElement(interaction);
				if (result == null) result = caseParameterableElement(interaction);
				if (result == null) result = caseElement(interaction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.INTERACTION_FRAGMENT: {
				InteractionFragment interactionFragment = (InteractionFragment)theEObject;
				T result = caseInteractionFragment(interactionFragment);
				if (result == null) result = caseNamedElement(interactionFragment);
				if (result == null) result = caseTemplateableElement(interactionFragment);
				if (result == null) result = caseElement(interactionFragment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.LIFELINE: {
				Lifeline lifeline = (Lifeline)theEObject;
				T result = caseLifeline(lifeline);
				if (result == null) result = caseNamedElement(lifeline);
				if (result == null) result = caseTemplateableElement(lifeline);
				if (result == null) result = caseElement(lifeline);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.MESSAGE: {
				Message message = (Message)theEObject;
				T result = caseMessage(message);
				if (result == null) result = caseNamedElement(message);
				if (result == null) result = caseTemplateableElement(message);
				if (result == null) result = caseElement(message);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.GENERAL_ORDERING: {
				GeneralOrdering generalOrdering = (GeneralOrdering)theEObject;
				T result = caseGeneralOrdering(generalOrdering);
				if (result == null) result = caseNamedElement(generalOrdering);
				if (result == null) result = caseTemplateableElement(generalOrdering);
				if (result == null) result = caseElement(generalOrdering);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.MESSAGE_END: {
				MessageEnd messageEnd = (MessageEnd)theEObject;
				T result = caseMessageEnd(messageEnd);
				if (result == null) result = caseNamedElement(messageEnd);
				if (result == null) result = caseTemplateableElement(messageEnd);
				if (result == null) result = caseElement(messageEnd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.EVENT_OCCURRENCE: {
				EventOccurrence eventOccurrence = (EventOccurrence)theEObject;
				T result = caseEventOccurrence(eventOccurrence);
				if (result == null) result = caseInteractionFragment(eventOccurrence);
				if (result == null) result = caseMessageEnd(eventOccurrence);
				if (result == null) result = caseNamedElement(eventOccurrence);
				if (result == null) result = caseTemplateableElement(eventOccurrence);
				if (result == null) result = caseElement(eventOccurrence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.EXECUTION_OCCURRENCE: {
				ExecutionOccurrence executionOccurrence = (ExecutionOccurrence)theEObject;
				T result = caseExecutionOccurrence(executionOccurrence);
				if (result == null) result = caseInteractionFragment(executionOccurrence);
				if (result == null) result = caseNamedElement(executionOccurrence);
				if (result == null) result = caseTemplateableElement(executionOccurrence);
				if (result == null) result = caseElement(executionOccurrence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.STATE_INVARIANT: {
				StateInvariant stateInvariant = (StateInvariant)theEObject;
				T result = caseStateInvariant(stateInvariant);
				if (result == null) result = caseInteractionFragment(stateInvariant);
				if (result == null) result = caseNamedElement(stateInvariant);
				if (result == null) result = caseTemplateableElement(stateInvariant);
				if (result == null) result = caseElement(stateInvariant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.STOP: {
				Stop stop = (Stop)theEObject;
				T result = caseStop(stop);
				if (result == null) result = caseEventOccurrence(stop);
				if (result == null) result = caseInteractionFragment(stop);
				if (result == null) result = caseMessageEnd(stop);
				if (result == null) result = caseNamedElement(stop);
				if (result == null) result = caseTemplateableElement(stop);
				if (result == null) result = caseElement(stop);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.TEMPLATE_SIGNATURE: {
				TemplateSignature templateSignature = (TemplateSignature)theEObject;
				T result = caseTemplateSignature(templateSignature);
				if (result == null) result = caseElement(templateSignature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.TEMPLATE_PARAMETER: {
				TemplateParameter templateParameter = (TemplateParameter)theEObject;
				T result = caseTemplateParameter(templateParameter);
				if (result == null) result = caseElement(templateParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.TEMPLATEABLE_ELEMENT: {
				TemplateableElement templateableElement = (TemplateableElement)theEObject;
				T result = caseTemplateableElement(templateableElement);
				if (result == null) result = caseElement(templateableElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.STRING_EXPRESSION: {
				StringExpression stringExpression = (StringExpression)theEObject;
				T result = caseStringExpression(stringExpression);
				if (result == null) result = caseTemplateableElement(stringExpression);
				if (result == null) result = caseElement(stringExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.PARAMETERABLE_ELEMENT: {
				ParameterableElement parameterableElement = (ParameterableElement)theEObject;
				T result = caseParameterableElement(parameterableElement);
				if (result == null) result = caseElement(parameterableElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.TEMPLATE_BINDING: {
				TemplateBinding templateBinding = (TemplateBinding)theEObject;
				T result = caseTemplateBinding(templateBinding);
				if (result == null) result = caseDirectedRelationship(templateBinding);
				if (result == null) result = caseRelationship(templateBinding);
				if (result == null) result = caseElement(templateBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.TEMPLATE_PARAMETER_SUBSTITUTION: {
				TemplateParameterSubstitution templateParameterSubstitution = (TemplateParameterSubstitution)theEObject;
				T result = caseTemplateParameterSubstitution(templateParameterSubstitution);
				if (result == null) result = caseElement(templateParameterSubstitution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.OPERATION_TEMPLATE_PARAMETER: {
				OperationTemplateParameter operationTemplateParameter = (OperationTemplateParameter)theEObject;
				T result = caseOperationTemplateParameter(operationTemplateParameter);
				if (result == null) result = caseTemplateParameter(operationTemplateParameter);
				if (result == null) result = caseElement(operationTemplateParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.CLASSIFIER_TEMPLATE_PARAMETER: {
				ClassifierTemplateParameter classifierTemplateParameter = (ClassifierTemplateParameter)theEObject;
				T result = caseClassifierTemplateParameter(classifierTemplateParameter);
				if (result == null) result = caseTemplateParameter(classifierTemplateParameter);
				if (result == null) result = caseElement(classifierTemplateParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.PARAMETERABLE_CLASSIFIER: {
				ParameterableClassifier parameterableClassifier = (ParameterableClassifier)theEObject;
				T result = caseParameterableClassifier(parameterableClassifier);
				if (result == null) result = caseClassifier(parameterableClassifier);
				if (result == null) result = caseNamespace(parameterableClassifier);
				if (result == null) result = caseType(parameterableClassifier);
				if (result == null) result = caseRedefinableElement(parameterableClassifier);
				if (result == null) result = casePackageableElement(parameterableClassifier);
				if (result == null) result = caseNamedElement(parameterableClassifier);
				if (result == null) result = caseTemplateableElement(parameterableClassifier);
				if (result == null) result = caseParameterableElement(parameterableClassifier);
				if (result == null) result = caseElement(parameterableClassifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.REDEFINABLE_TEMPLATE_SIGNATURE: {
				RedefinableTemplateSignature redefinableTemplateSignature = (RedefinableTemplateSignature)theEObject;
				T result = caseRedefinableTemplateSignature(redefinableTemplateSignature);
				if (result == null) result = caseRedefinableElement(redefinableTemplateSignature);
				if (result == null) result = caseTemplateSignature(redefinableTemplateSignature);
				if (result == null) result = caseNamedElement(redefinableTemplateSignature);
				if (result == null) result = caseTemplateableElement(redefinableTemplateSignature);
				if (result == null) result = caseElement(redefinableTemplateSignature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.TEMPLATEABLE_CLASSIFIER: {
				TemplateableClassifier templateableClassifier = (TemplateableClassifier)theEObject;
				T result = caseTemplateableClassifier(templateableClassifier);
				if (result == null) result = caseClassifier(templateableClassifier);
				if (result == null) result = caseNamespace(templateableClassifier);
				if (result == null) result = caseType(templateableClassifier);
				if (result == null) result = caseRedefinableElement(templateableClassifier);
				if (result == null) result = casePackageableElement(templateableClassifier);
				if (result == null) result = caseNamedElement(templateableClassifier);
				if (result == null) result = caseTemplateableElement(templateableClassifier);
				if (result == null) result = caseParameterableElement(templateableClassifier);
				if (result == null) result = caseElement(templateableClassifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.CONNECTABLE_ELEMENT_TEMPLATE_PARAMETER: {
				ConnectableElementTemplateParameter connectableElementTemplateParameter = (ConnectableElementTemplateParameter)theEObject;
				T result = caseConnectableElementTemplateParameter(connectableElementTemplateParameter);
				if (result == null) result = caseTemplateParameter(connectableElementTemplateParameter);
				if (result == null) result = caseElement(connectableElementTemplateParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.FORK_NODE: {
				ForkNode forkNode = (ForkNode)theEObject;
				T result = caseForkNode(forkNode);
				if (result == null) result = caseControlNode(forkNode);
				if (result == null) result = caseActivityNode(forkNode);
				if (result == null) result = caseRedefinableElement(forkNode);
				if (result == null) result = caseNamedElement(forkNode);
				if (result == null) result = caseTemplateableElement(forkNode);
				if (result == null) result = caseElement(forkNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.JOIN_NODE: {
				JoinNode joinNode = (JoinNode)theEObject;
				T result = caseJoinNode(joinNode);
				if (result == null) result = caseControlNode(joinNode);
				if (result == null) result = caseActivityNode(joinNode);
				if (result == null) result = caseRedefinableElement(joinNode);
				if (result == null) result = caseNamedElement(joinNode);
				if (result == null) result = caseTemplateableElement(joinNode);
				if (result == null) result = caseElement(joinNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.FLOW_FINAL_NODE: {
				FlowFinalNode flowFinalNode = (FlowFinalNode)theEObject;
				T result = caseFlowFinalNode(flowFinalNode);
				if (result == null) result = caseFinalNode(flowFinalNode);
				if (result == null) result = caseControlNode(flowFinalNode);
				if (result == null) result = caseActivityNode(flowFinalNode);
				if (result == null) result = caseRedefinableElement(flowFinalNode);
				if (result == null) result = caseNamedElement(flowFinalNode);
				if (result == null) result = caseTemplateableElement(flowFinalNode);
				if (result == null) result = caseElement(flowFinalNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.CENTRAL_BUFFER_NODE: {
				CentralBufferNode centralBufferNode = (CentralBufferNode)theEObject;
				T result = caseCentralBufferNode(centralBufferNode);
				if (result == null) result = caseObjectNode(centralBufferNode);
				if (result == null) result = caseActivityNode(centralBufferNode);
				if (result == null) result = caseTypedElement(centralBufferNode);
				if (result == null) result = caseRedefinableElement(centralBufferNode);
				if (result == null) result = caseNamedElement(centralBufferNode);
				if (result == null) result = caseTemplateableElement(centralBufferNode);
				if (result == null) result = caseElement(centralBufferNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.ACTIVITY_PARTITION: {
				ActivityPartition activityPartition = (ActivityPartition)theEObject;
				T result = caseActivityPartition(activityPartition);
				if (result == null) result = caseNamedElement(activityPartition);
				if (result == null) result = caseActivityGroup(activityPartition);
				if (result == null) result = caseTemplateableElement(activityPartition);
				if (result == null) result = caseElement(activityPartition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.EXPANSION_NODE: {
				ExpansionNode expansionNode = (ExpansionNode)theEObject;
				T result = caseExpansionNode(expansionNode);
				if (result == null) result = caseObjectNode(expansionNode);
				if (result == null) result = caseActivityNode(expansionNode);
				if (result == null) result = caseTypedElement(expansionNode);
				if (result == null) result = caseRedefinableElement(expansionNode);
				if (result == null) result = caseNamedElement(expansionNode);
				if (result == null) result = caseTemplateableElement(expansionNode);
				if (result == null) result = caseElement(expansionNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.EXPANSION_REGION: {
				ExpansionRegion expansionRegion = (ExpansionRegion)theEObject;
				T result = caseExpansionRegion(expansionRegion);
				if (result == null) result = caseStructuredActivityNode(expansionRegion);
				if (result == null) result = caseAction(expansionRegion);
				if (result == null) result = caseNamespace(expansionRegion);
				if (result == null) result = caseActivityGroup(expansionRegion);
				if (result == null) result = caseExecutableNode(expansionRegion);
				if (result == null) result = caseActivityNode(expansionRegion);
				if (result == null) result = caseRedefinableElement(expansionRegion);
				if (result == null) result = caseNamedElement(expansionRegion);
				if (result == null) result = caseTemplateableElement(expansionRegion);
				if (result == null) result = caseElement(expansionRegion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.EXCEPTION_HANDLER: {
				ExceptionHandler exceptionHandler = (ExceptionHandler)theEObject;
				T result = caseExceptionHandler(exceptionHandler);
				if (result == null) result = caseElement(exceptionHandler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.INTERACTION_OCCURRENCE: {
				InteractionOccurrence interactionOccurrence = (InteractionOccurrence)theEObject;
				T result = caseInteractionOccurrence(interactionOccurrence);
				if (result == null) result = caseInteractionFragment(interactionOccurrence);
				if (result == null) result = caseNamedElement(interactionOccurrence);
				if (result == null) result = caseTemplateableElement(interactionOccurrence);
				if (result == null) result = caseElement(interactionOccurrence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.GATE: {
				Gate gate = (Gate)theEObject;
				T result = caseGate(gate);
				if (result == null) result = caseMessageEnd(gate);
				if (result == null) result = caseNamedElement(gate);
				if (result == null) result = caseTemplateableElement(gate);
				if (result == null) result = caseElement(gate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.PART_DECOMPOSITION: {
				PartDecomposition partDecomposition = (PartDecomposition)theEObject;
				T result = casePartDecomposition(partDecomposition);
				if (result == null) result = caseInteractionOccurrence(partDecomposition);
				if (result == null) result = caseInteractionFragment(partDecomposition);
				if (result == null) result = caseNamedElement(partDecomposition);
				if (result == null) result = caseTemplateableElement(partDecomposition);
				if (result == null) result = caseElement(partDecomposition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.INTERACTION_OPERAND: {
				InteractionOperand interactionOperand = (InteractionOperand)theEObject;
				T result = caseInteractionOperand(interactionOperand);
				if (result == null) result = caseNamespace(interactionOperand);
				if (result == null) result = caseInteractionFragment(interactionOperand);
				if (result == null) result = caseNamedElement(interactionOperand);
				if (result == null) result = caseTemplateableElement(interactionOperand);
				if (result == null) result = caseElement(interactionOperand);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.INTERACTION_CONSTRAINT: {
				InteractionConstraint interactionConstraint = (InteractionConstraint)theEObject;
				T result = caseInteractionConstraint(interactionConstraint);
				if (result == null) result = caseConstraint(interactionConstraint);
				if (result == null) result = casePackageableElement(interactionConstraint);
				if (result == null) result = caseNamedElement(interactionConstraint);
				if (result == null) result = caseParameterableElement(interactionConstraint);
				if (result == null) result = caseTemplateableElement(interactionConstraint);
				if (result == null) result = caseElement(interactionConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.COMBINED_FRAGMENT: {
				CombinedFragment combinedFragment = (CombinedFragment)theEObject;
				T result = caseCombinedFragment(combinedFragment);
				if (result == null) result = caseInteractionFragment(combinedFragment);
				if (result == null) result = caseNamedElement(combinedFragment);
				if (result == null) result = caseTemplateableElement(combinedFragment);
				if (result == null) result = caseElement(combinedFragment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.CONTINUATION: {
				Continuation continuation = (Continuation)theEObject;
				T result = caseContinuation(continuation);
				if (result == null) result = caseInteractionFragment(continuation);
				if (result == null) result = caseNamedElement(continuation);
				if (result == null) result = caseTemplateableElement(continuation);
				if (result == null) result = caseElement(continuation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.STATE_MACHINE: {
				StateMachine stateMachine = (StateMachine)theEObject;
				T result = caseStateMachine(stateMachine);
				if (result == null) result = caseBehavior(stateMachine);
				if (result == null) result = caseClass(stateMachine);
				if (result == null) result = caseBehavioredClassifier(stateMachine);
				if (result == null) result = caseEncapsulatedClassifier(stateMachine);
				if (result == null) result = caseStructuredClassifier(stateMachine);
				if (result == null) result = caseClassifier(stateMachine);
				if (result == null) result = caseNamespace(stateMachine);
				if (result == null) result = caseType(stateMachine);
				if (result == null) result = caseRedefinableElement(stateMachine);
				if (result == null) result = casePackageableElement(stateMachine);
				if (result == null) result = caseNamedElement(stateMachine);
				if (result == null) result = caseTemplateableElement(stateMachine);
				if (result == null) result = caseParameterableElement(stateMachine);
				if (result == null) result = caseElement(stateMachine);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.REGION: {
				Region region = (Region)theEObject;
				T result = caseRegion(region);
				if (result == null) result = caseNamespace(region);
				if (result == null) result = caseRedefinableElement(region);
				if (result == null) result = caseNamedElement(region);
				if (result == null) result = caseTemplateableElement(region);
				if (result == null) result = caseElement(region);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.PSEUDOSTATE: {
				Pseudostate pseudostate = (Pseudostate)theEObject;
				T result = casePseudostate(pseudostate);
				if (result == null) result = caseVertex(pseudostate);
				if (result == null) result = caseNamedElement(pseudostate);
				if (result == null) result = caseTemplateableElement(pseudostate);
				if (result == null) result = caseElement(pseudostate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.STATE: {
				State state = (State)theEObject;
				T result = caseState(state);
				if (result == null) result = caseNamespace(state);
				if (result == null) result = caseRedefinableElement(state);
				if (result == null) result = caseVertex(state);
				if (result == null) result = caseNamedElement(state);
				if (result == null) result = caseTemplateableElement(state);
				if (result == null) result = caseElement(state);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.VERTEX: {
				Vertex vertex = (Vertex)theEObject;
				T result = caseVertex(vertex);
				if (result == null) result = caseNamedElement(vertex);
				if (result == null) result = caseTemplateableElement(vertex);
				if (result == null) result = caseElement(vertex);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.CONNECTION_POINT_REFERENCE: {
				ConnectionPointReference connectionPointReference = (ConnectionPointReference)theEObject;
				T result = caseConnectionPointReference(connectionPointReference);
				if (result == null) result = caseVertex(connectionPointReference);
				if (result == null) result = caseNamedElement(connectionPointReference);
				if (result == null) result = caseTemplateableElement(connectionPointReference);
				if (result == null) result = caseElement(connectionPointReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.TRANSITION: {
				Transition transition = (Transition)theEObject;
				T result = caseTransition(transition);
				if (result == null) result = caseRedefinableElement(transition);
				if (result == null) result = caseNamedElement(transition);
				if (result == null) result = caseTemplateableElement(transition);
				if (result == null) result = caseElement(transition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.FINAL_STATE: {
				FinalState finalState = (FinalState)theEObject;
				T result = caseFinalState(finalState);
				if (result == null) result = caseState(finalState);
				if (result == null) result = caseNamespace(finalState);
				if (result == null) result = caseRedefinableElement(finalState);
				if (result == null) result = caseVertex(finalState);
				if (result == null) result = caseNamedElement(finalState);
				if (result == null) result = caseTemplateableElement(finalState);
				if (result == null) result = caseElement(finalState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.CREATE_OBJECT_ACTION: {
				CreateObjectAction createObjectAction = (CreateObjectAction)theEObject;
				T result = caseCreateObjectAction(createObjectAction);
				if (result == null) result = caseAction(createObjectAction);
				if (result == null) result = caseExecutableNode(createObjectAction);
				if (result == null) result = caseActivityNode(createObjectAction);
				if (result == null) result = caseRedefinableElement(createObjectAction);
				if (result == null) result = caseNamedElement(createObjectAction);
				if (result == null) result = caseTemplateableElement(createObjectAction);
				if (result == null) result = caseElement(createObjectAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.DESTROY_OBJECT_ACTION: {
				DestroyObjectAction destroyObjectAction = (DestroyObjectAction)theEObject;
				T result = caseDestroyObjectAction(destroyObjectAction);
				if (result == null) result = caseAction(destroyObjectAction);
				if (result == null) result = caseExecutableNode(destroyObjectAction);
				if (result == null) result = caseActivityNode(destroyObjectAction);
				if (result == null) result = caseRedefinableElement(destroyObjectAction);
				if (result == null) result = caseNamedElement(destroyObjectAction);
				if (result == null) result = caseTemplateableElement(destroyObjectAction);
				if (result == null) result = caseElement(destroyObjectAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.TEST_IDENTITY_ACTION: {
				TestIdentityAction testIdentityAction = (TestIdentityAction)theEObject;
				T result = caseTestIdentityAction(testIdentityAction);
				if (result == null) result = caseAction(testIdentityAction);
				if (result == null) result = caseExecutableNode(testIdentityAction);
				if (result == null) result = caseActivityNode(testIdentityAction);
				if (result == null) result = caseRedefinableElement(testIdentityAction);
				if (result == null) result = caseNamedElement(testIdentityAction);
				if (result == null) result = caseTemplateableElement(testIdentityAction);
				if (result == null) result = caseElement(testIdentityAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.READ_SELF_ACTION: {
				ReadSelfAction readSelfAction = (ReadSelfAction)theEObject;
				T result = caseReadSelfAction(readSelfAction);
				if (result == null) result = caseAction(readSelfAction);
				if (result == null) result = caseExecutableNode(readSelfAction);
				if (result == null) result = caseActivityNode(readSelfAction);
				if (result == null) result = caseRedefinableElement(readSelfAction);
				if (result == null) result = caseNamedElement(readSelfAction);
				if (result == null) result = caseTemplateableElement(readSelfAction);
				if (result == null) result = caseElement(readSelfAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.STRUCTURAL_FEATURE_ACTION: {
				StructuralFeatureAction structuralFeatureAction = (StructuralFeatureAction)theEObject;
				T result = caseStructuralFeatureAction(structuralFeatureAction);
				if (result == null) result = caseAction(structuralFeatureAction);
				if (result == null) result = caseExecutableNode(structuralFeatureAction);
				if (result == null) result = caseActivityNode(structuralFeatureAction);
				if (result == null) result = caseRedefinableElement(structuralFeatureAction);
				if (result == null) result = caseNamedElement(structuralFeatureAction);
				if (result == null) result = caseTemplateableElement(structuralFeatureAction);
				if (result == null) result = caseElement(structuralFeatureAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.READ_STRUCTURAL_FEATURE_ACTION: {
				ReadStructuralFeatureAction readStructuralFeatureAction = (ReadStructuralFeatureAction)theEObject;
				T result = caseReadStructuralFeatureAction(readStructuralFeatureAction);
				if (result == null) result = caseStructuralFeatureAction(readStructuralFeatureAction);
				if (result == null) result = caseAction(readStructuralFeatureAction);
				if (result == null) result = caseExecutableNode(readStructuralFeatureAction);
				if (result == null) result = caseActivityNode(readStructuralFeatureAction);
				if (result == null) result = caseRedefinableElement(readStructuralFeatureAction);
				if (result == null) result = caseNamedElement(readStructuralFeatureAction);
				if (result == null) result = caseTemplateableElement(readStructuralFeatureAction);
				if (result == null) result = caseElement(readStructuralFeatureAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION: {
				WriteStructuralFeatureAction writeStructuralFeatureAction = (WriteStructuralFeatureAction)theEObject;
				T result = caseWriteStructuralFeatureAction(writeStructuralFeatureAction);
				if (result == null) result = caseStructuralFeatureAction(writeStructuralFeatureAction);
				if (result == null) result = caseAction(writeStructuralFeatureAction);
				if (result == null) result = caseExecutableNode(writeStructuralFeatureAction);
				if (result == null) result = caseActivityNode(writeStructuralFeatureAction);
				if (result == null) result = caseRedefinableElement(writeStructuralFeatureAction);
				if (result == null) result = caseNamedElement(writeStructuralFeatureAction);
				if (result == null) result = caseTemplateableElement(writeStructuralFeatureAction);
				if (result == null) result = caseElement(writeStructuralFeatureAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.CLEAR_STRUCTURAL_FEATURE_ACTION: {
				ClearStructuralFeatureAction clearStructuralFeatureAction = (ClearStructuralFeatureAction)theEObject;
				T result = caseClearStructuralFeatureAction(clearStructuralFeatureAction);
				if (result == null) result = caseStructuralFeatureAction(clearStructuralFeatureAction);
				if (result == null) result = caseAction(clearStructuralFeatureAction);
				if (result == null) result = caseExecutableNode(clearStructuralFeatureAction);
				if (result == null) result = caseActivityNode(clearStructuralFeatureAction);
				if (result == null) result = caseRedefinableElement(clearStructuralFeatureAction);
				if (result == null) result = caseNamedElement(clearStructuralFeatureAction);
				if (result == null) result = caseTemplateableElement(clearStructuralFeatureAction);
				if (result == null) result = caseElement(clearStructuralFeatureAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION: {
				RemoveStructuralFeatureValueAction removeStructuralFeatureValueAction = (RemoveStructuralFeatureValueAction)theEObject;
				T result = caseRemoveStructuralFeatureValueAction(removeStructuralFeatureValueAction);
				if (result == null) result = caseWriteStructuralFeatureAction(removeStructuralFeatureValueAction);
				if (result == null) result = caseStructuralFeatureAction(removeStructuralFeatureValueAction);
				if (result == null) result = caseAction(removeStructuralFeatureValueAction);
				if (result == null) result = caseExecutableNode(removeStructuralFeatureValueAction);
				if (result == null) result = caseActivityNode(removeStructuralFeatureValueAction);
				if (result == null) result = caseRedefinableElement(removeStructuralFeatureValueAction);
				if (result == null) result = caseNamedElement(removeStructuralFeatureValueAction);
				if (result == null) result = caseTemplateableElement(removeStructuralFeatureValueAction);
				if (result == null) result = caseElement(removeStructuralFeatureValueAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION: {
				AddStructuralFeatureValueAction addStructuralFeatureValueAction = (AddStructuralFeatureValueAction)theEObject;
				T result = caseAddStructuralFeatureValueAction(addStructuralFeatureValueAction);
				if (result == null) result = caseWriteStructuralFeatureAction(addStructuralFeatureValueAction);
				if (result == null) result = caseStructuralFeatureAction(addStructuralFeatureValueAction);
				if (result == null) result = caseAction(addStructuralFeatureValueAction);
				if (result == null) result = caseExecutableNode(addStructuralFeatureValueAction);
				if (result == null) result = caseActivityNode(addStructuralFeatureValueAction);
				if (result == null) result = caseRedefinableElement(addStructuralFeatureValueAction);
				if (result == null) result = caseNamedElement(addStructuralFeatureValueAction);
				if (result == null) result = caseTemplateableElement(addStructuralFeatureValueAction);
				if (result == null) result = caseElement(addStructuralFeatureValueAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.LINK_ACTION: {
				LinkAction linkAction = (LinkAction)theEObject;
				T result = caseLinkAction(linkAction);
				if (result == null) result = caseAction(linkAction);
				if (result == null) result = caseExecutableNode(linkAction);
				if (result == null) result = caseActivityNode(linkAction);
				if (result == null) result = caseRedefinableElement(linkAction);
				if (result == null) result = caseNamedElement(linkAction);
				if (result == null) result = caseTemplateableElement(linkAction);
				if (result == null) result = caseElement(linkAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.LINK_END_DATA: {
				LinkEndData linkEndData = (LinkEndData)theEObject;
				T result = caseLinkEndData(linkEndData);
				if (result == null) result = caseElement(linkEndData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.READ_LINK_ACTION: {
				ReadLinkAction readLinkAction = (ReadLinkAction)theEObject;
				T result = caseReadLinkAction(readLinkAction);
				if (result == null) result = caseLinkAction(readLinkAction);
				if (result == null) result = caseAction(readLinkAction);
				if (result == null) result = caseExecutableNode(readLinkAction);
				if (result == null) result = caseActivityNode(readLinkAction);
				if (result == null) result = caseRedefinableElement(readLinkAction);
				if (result == null) result = caseNamedElement(readLinkAction);
				if (result == null) result = caseTemplateableElement(readLinkAction);
				if (result == null) result = caseElement(readLinkAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.LINK_END_CREATION_DATA: {
				LinkEndCreationData linkEndCreationData = (LinkEndCreationData)theEObject;
				T result = caseLinkEndCreationData(linkEndCreationData);
				if (result == null) result = caseLinkEndData(linkEndCreationData);
				if (result == null) result = caseElement(linkEndCreationData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.CREATE_LINK_ACTION: {
				CreateLinkAction createLinkAction = (CreateLinkAction)theEObject;
				T result = caseCreateLinkAction(createLinkAction);
				if (result == null) result = caseWriteLinkAction(createLinkAction);
				if (result == null) result = caseLinkAction(createLinkAction);
				if (result == null) result = caseAction(createLinkAction);
				if (result == null) result = caseExecutableNode(createLinkAction);
				if (result == null) result = caseActivityNode(createLinkAction);
				if (result == null) result = caseRedefinableElement(createLinkAction);
				if (result == null) result = caseNamedElement(createLinkAction);
				if (result == null) result = caseTemplateableElement(createLinkAction);
				if (result == null) result = caseElement(createLinkAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.WRITE_LINK_ACTION: {
				WriteLinkAction writeLinkAction = (WriteLinkAction)theEObject;
				T result = caseWriteLinkAction(writeLinkAction);
				if (result == null) result = caseLinkAction(writeLinkAction);
				if (result == null) result = caseAction(writeLinkAction);
				if (result == null) result = caseExecutableNode(writeLinkAction);
				if (result == null) result = caseActivityNode(writeLinkAction);
				if (result == null) result = caseRedefinableElement(writeLinkAction);
				if (result == null) result = caseNamedElement(writeLinkAction);
				if (result == null) result = caseTemplateableElement(writeLinkAction);
				if (result == null) result = caseElement(writeLinkAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.DESTROY_LINK_ACTION: {
				DestroyLinkAction destroyLinkAction = (DestroyLinkAction)theEObject;
				T result = caseDestroyLinkAction(destroyLinkAction);
				if (result == null) result = caseWriteLinkAction(destroyLinkAction);
				if (result == null) result = caseLinkAction(destroyLinkAction);
				if (result == null) result = caseAction(destroyLinkAction);
				if (result == null) result = caseExecutableNode(destroyLinkAction);
				if (result == null) result = caseActivityNode(destroyLinkAction);
				if (result == null) result = caseRedefinableElement(destroyLinkAction);
				if (result == null) result = caseNamedElement(destroyLinkAction);
				if (result == null) result = caseTemplateableElement(destroyLinkAction);
				if (result == null) result = caseElement(destroyLinkAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.CLEAR_ASSOCIATION_ACTION: {
				ClearAssociationAction clearAssociationAction = (ClearAssociationAction)theEObject;
				T result = caseClearAssociationAction(clearAssociationAction);
				if (result == null) result = caseAction(clearAssociationAction);
				if (result == null) result = caseExecutableNode(clearAssociationAction);
				if (result == null) result = caseActivityNode(clearAssociationAction);
				if (result == null) result = caseRedefinableElement(clearAssociationAction);
				if (result == null) result = caseNamedElement(clearAssociationAction);
				if (result == null) result = caseTemplateableElement(clearAssociationAction);
				if (result == null) result = caseElement(clearAssociationAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.VARIABLE_ACTION: {
				VariableAction variableAction = (VariableAction)theEObject;
				T result = caseVariableAction(variableAction);
				if (result == null) result = caseAction(variableAction);
				if (result == null) result = caseExecutableNode(variableAction);
				if (result == null) result = caseActivityNode(variableAction);
				if (result == null) result = caseRedefinableElement(variableAction);
				if (result == null) result = caseNamedElement(variableAction);
				if (result == null) result = caseTemplateableElement(variableAction);
				if (result == null) result = caseElement(variableAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.READ_VARIABLE_ACTION: {
				ReadVariableAction readVariableAction = (ReadVariableAction)theEObject;
				T result = caseReadVariableAction(readVariableAction);
				if (result == null) result = caseVariableAction(readVariableAction);
				if (result == null) result = caseAction(readVariableAction);
				if (result == null) result = caseExecutableNode(readVariableAction);
				if (result == null) result = caseActivityNode(readVariableAction);
				if (result == null) result = caseRedefinableElement(readVariableAction);
				if (result == null) result = caseNamedElement(readVariableAction);
				if (result == null) result = caseTemplateableElement(readVariableAction);
				if (result == null) result = caseElement(readVariableAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.WRITE_VARIABLE_ACTION: {
				WriteVariableAction writeVariableAction = (WriteVariableAction)theEObject;
				T result = caseWriteVariableAction(writeVariableAction);
				if (result == null) result = caseVariableAction(writeVariableAction);
				if (result == null) result = caseAction(writeVariableAction);
				if (result == null) result = caseExecutableNode(writeVariableAction);
				if (result == null) result = caseActivityNode(writeVariableAction);
				if (result == null) result = caseRedefinableElement(writeVariableAction);
				if (result == null) result = caseNamedElement(writeVariableAction);
				if (result == null) result = caseTemplateableElement(writeVariableAction);
				if (result == null) result = caseElement(writeVariableAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.CLEAR_VARIABLE_ACTION: {
				ClearVariableAction clearVariableAction = (ClearVariableAction)theEObject;
				T result = caseClearVariableAction(clearVariableAction);
				if (result == null) result = caseVariableAction(clearVariableAction);
				if (result == null) result = caseAction(clearVariableAction);
				if (result == null) result = caseExecutableNode(clearVariableAction);
				if (result == null) result = caseActivityNode(clearVariableAction);
				if (result == null) result = caseRedefinableElement(clearVariableAction);
				if (result == null) result = caseNamedElement(clearVariableAction);
				if (result == null) result = caseTemplateableElement(clearVariableAction);
				if (result == null) result = caseElement(clearVariableAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.ADD_VARIABLE_VALUE_ACTION: {
				AddVariableValueAction addVariableValueAction = (AddVariableValueAction)theEObject;
				T result = caseAddVariableValueAction(addVariableValueAction);
				if (result == null) result = caseWriteVariableAction(addVariableValueAction);
				if (result == null) result = caseVariableAction(addVariableValueAction);
				if (result == null) result = caseAction(addVariableValueAction);
				if (result == null) result = caseExecutableNode(addVariableValueAction);
				if (result == null) result = caseActivityNode(addVariableValueAction);
				if (result == null) result = caseRedefinableElement(addVariableValueAction);
				if (result == null) result = caseNamedElement(addVariableValueAction);
				if (result == null) result = caseTemplateableElement(addVariableValueAction);
				if (result == null) result = caseElement(addVariableValueAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.REMOVE_VARIABLE_VALUE_ACTION: {
				RemoveVariableValueAction removeVariableValueAction = (RemoveVariableValueAction)theEObject;
				T result = caseRemoveVariableValueAction(removeVariableValueAction);
				if (result == null) result = caseWriteVariableAction(removeVariableValueAction);
				if (result == null) result = caseVariableAction(removeVariableValueAction);
				if (result == null) result = caseAction(removeVariableValueAction);
				if (result == null) result = caseExecutableNode(removeVariableValueAction);
				if (result == null) result = caseActivityNode(removeVariableValueAction);
				if (result == null) result = caseRedefinableElement(removeVariableValueAction);
				if (result == null) result = caseNamedElement(removeVariableValueAction);
				if (result == null) result = caseTemplateableElement(removeVariableValueAction);
				if (result == null) result = caseElement(removeVariableValueAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.APPLY_FUNCTION_ACTION: {
				ApplyFunctionAction applyFunctionAction = (ApplyFunctionAction)theEObject;
				T result = caseApplyFunctionAction(applyFunctionAction);
				if (result == null) result = caseAction(applyFunctionAction);
				if (result == null) result = caseExecutableNode(applyFunctionAction);
				if (result == null) result = caseActivityNode(applyFunctionAction);
				if (result == null) result = caseRedefinableElement(applyFunctionAction);
				if (result == null) result = caseNamedElement(applyFunctionAction);
				if (result == null) result = caseTemplateableElement(applyFunctionAction);
				if (result == null) result = caseElement(applyFunctionAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.PRIMITIVE_FUNCTION: {
				PrimitiveFunction primitiveFunction = (PrimitiveFunction)theEObject;
				T result = casePrimitiveFunction(primitiveFunction);
				if (result == null) result = casePackageableElement(primitiveFunction);
				if (result == null) result = caseNamedElement(primitiveFunction);
				if (result == null) result = caseParameterableElement(primitiveFunction);
				if (result == null) result = caseTemplateableElement(primitiveFunction);
				if (result == null) result = caseElement(primitiveFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.CALL_ACTION: {
				CallAction callAction = (CallAction)theEObject;
				T result = caseCallAction(callAction);
				if (result == null) result = caseInvocationAction(callAction);
				if (result == null) result = caseAction(callAction);
				if (result == null) result = caseExecutableNode(callAction);
				if (result == null) result = caseActivityNode(callAction);
				if (result == null) result = caseRedefinableElement(callAction);
				if (result == null) result = caseNamedElement(callAction);
				if (result == null) result = caseTemplateableElement(callAction);
				if (result == null) result = caseElement(callAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.INVOCATION_ACTION: {
				InvocationAction invocationAction = (InvocationAction)theEObject;
				T result = caseInvocationAction(invocationAction);
				if (result == null) result = caseAction(invocationAction);
				if (result == null) result = caseExecutableNode(invocationAction);
				if (result == null) result = caseActivityNode(invocationAction);
				if (result == null) result = caseRedefinableElement(invocationAction);
				if (result == null) result = caseNamedElement(invocationAction);
				if (result == null) result = caseTemplateableElement(invocationAction);
				if (result == null) result = caseElement(invocationAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.SEND_SIGNAL_ACTION: {
				SendSignalAction sendSignalAction = (SendSignalAction)theEObject;
				T result = caseSendSignalAction(sendSignalAction);
				if (result == null) result = caseInvocationAction(sendSignalAction);
				if (result == null) result = caseAction(sendSignalAction);
				if (result == null) result = caseExecutableNode(sendSignalAction);
				if (result == null) result = caseActivityNode(sendSignalAction);
				if (result == null) result = caseRedefinableElement(sendSignalAction);
				if (result == null) result = caseNamedElement(sendSignalAction);
				if (result == null) result = caseTemplateableElement(sendSignalAction);
				if (result == null) result = caseElement(sendSignalAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.BROADCAST_SIGNAL_ACTION: {
				BroadcastSignalAction broadcastSignalAction = (BroadcastSignalAction)theEObject;
				T result = caseBroadcastSignalAction(broadcastSignalAction);
				if (result == null) result = caseInvocationAction(broadcastSignalAction);
				if (result == null) result = caseAction(broadcastSignalAction);
				if (result == null) result = caseExecutableNode(broadcastSignalAction);
				if (result == null) result = caseActivityNode(broadcastSignalAction);
				if (result == null) result = caseRedefinableElement(broadcastSignalAction);
				if (result == null) result = caseNamedElement(broadcastSignalAction);
				if (result == null) result = caseTemplateableElement(broadcastSignalAction);
				if (result == null) result = caseElement(broadcastSignalAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.SEND_OBJECT_ACTION: {
				SendObjectAction sendObjectAction = (SendObjectAction)theEObject;
				T result = caseSendObjectAction(sendObjectAction);
				if (result == null) result = caseInvocationAction(sendObjectAction);
				if (result == null) result = caseAction(sendObjectAction);
				if (result == null) result = caseExecutableNode(sendObjectAction);
				if (result == null) result = caseActivityNode(sendObjectAction);
				if (result == null) result = caseRedefinableElement(sendObjectAction);
				if (result == null) result = caseNamedElement(sendObjectAction);
				if (result == null) result = caseTemplateableElement(sendObjectAction);
				if (result == null) result = caseElement(sendObjectAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.CALL_OPERATION_ACTION: {
				CallOperationAction callOperationAction = (CallOperationAction)theEObject;
				T result = caseCallOperationAction(callOperationAction);
				if (result == null) result = caseCallAction(callOperationAction);
				if (result == null) result = caseInvocationAction(callOperationAction);
				if (result == null) result = caseAction(callOperationAction);
				if (result == null) result = caseExecutableNode(callOperationAction);
				if (result == null) result = caseActivityNode(callOperationAction);
				if (result == null) result = caseRedefinableElement(callOperationAction);
				if (result == null) result = caseNamedElement(callOperationAction);
				if (result == null) result = caseTemplateableElement(callOperationAction);
				if (result == null) result = caseElement(callOperationAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.CALL_BEHAVIOR_ACTION: {
				CallBehaviorAction callBehaviorAction = (CallBehaviorAction)theEObject;
				T result = caseCallBehaviorAction(callBehaviorAction);
				if (result == null) result = caseCallAction(callBehaviorAction);
				if (result == null) result = caseInvocationAction(callBehaviorAction);
				if (result == null) result = caseAction(callBehaviorAction);
				if (result == null) result = caseExecutableNode(callBehaviorAction);
				if (result == null) result = caseActivityNode(callBehaviorAction);
				if (result == null) result = caseRedefinableElement(callBehaviorAction);
				if (result == null) result = caseNamedElement(callBehaviorAction);
				if (result == null) result = caseTemplateableElement(callBehaviorAction);
				if (result == null) result = caseElement(callBehaviorAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.TIME_EXPRESSION: {
				TimeExpression timeExpression = (TimeExpression)theEObject;
				T result = caseTimeExpression(timeExpression);
				if (result == null) result = caseValueSpecification(timeExpression);
				if (result == null) result = caseTypedElement(timeExpression);
				if (result == null) result = caseParameterableElement(timeExpression);
				if (result == null) result = caseNamedElement(timeExpression);
				if (result == null) result = caseTemplateableElement(timeExpression);
				if (result == null) result = caseElement(timeExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.DURATION: {
				Duration duration = (Duration)theEObject;
				T result = caseDuration(duration);
				if (result == null) result = caseValueSpecification(duration);
				if (result == null) result = caseTypedElement(duration);
				if (result == null) result = caseParameterableElement(duration);
				if (result == null) result = caseNamedElement(duration);
				if (result == null) result = caseTemplateableElement(duration);
				if (result == null) result = caseElement(duration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.TIME_OBSERVATION_ACTION: {
				TimeObservationAction timeObservationAction = (TimeObservationAction)theEObject;
				T result = caseTimeObservationAction(timeObservationAction);
				if (result == null) result = caseWriteStructuralFeatureAction(timeObservationAction);
				if (result == null) result = caseStructuralFeatureAction(timeObservationAction);
				if (result == null) result = caseAction(timeObservationAction);
				if (result == null) result = caseExecutableNode(timeObservationAction);
				if (result == null) result = caseActivityNode(timeObservationAction);
				if (result == null) result = caseRedefinableElement(timeObservationAction);
				if (result == null) result = caseNamedElement(timeObservationAction);
				if (result == null) result = caseTemplateableElement(timeObservationAction);
				if (result == null) result = caseElement(timeObservationAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.DURATION_INTERVAL: {
				DurationInterval durationInterval = (DurationInterval)theEObject;
				T result = caseDurationInterval(durationInterval);
				if (result == null) result = caseInterval(durationInterval);
				if (result == null) result = caseValueSpecification(durationInterval);
				if (result == null) result = caseTypedElement(durationInterval);
				if (result == null) result = caseParameterableElement(durationInterval);
				if (result == null) result = caseNamedElement(durationInterval);
				if (result == null) result = caseTemplateableElement(durationInterval);
				if (result == null) result = caseElement(durationInterval);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.INTERVAL: {
				Interval interval = (Interval)theEObject;
				T result = caseInterval(interval);
				if (result == null) result = caseValueSpecification(interval);
				if (result == null) result = caseTypedElement(interval);
				if (result == null) result = caseParameterableElement(interval);
				if (result == null) result = caseNamedElement(interval);
				if (result == null) result = caseTemplateableElement(interval);
				if (result == null) result = caseElement(interval);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.TIME_CONSTRAINT: {
				TimeConstraint timeConstraint = (TimeConstraint)theEObject;
				T result = caseTimeConstraint(timeConstraint);
				if (result == null) result = caseIntervalConstraint(timeConstraint);
				if (result == null) result = caseConstraint(timeConstraint);
				if (result == null) result = casePackageableElement(timeConstraint);
				if (result == null) result = caseNamedElement(timeConstraint);
				if (result == null) result = caseParameterableElement(timeConstraint);
				if (result == null) result = caseTemplateableElement(timeConstraint);
				if (result == null) result = caseElement(timeConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.INTERVAL_CONSTRAINT: {
				IntervalConstraint intervalConstraint = (IntervalConstraint)theEObject;
				T result = caseIntervalConstraint(intervalConstraint);
				if (result == null) result = caseConstraint(intervalConstraint);
				if (result == null) result = casePackageableElement(intervalConstraint);
				if (result == null) result = caseNamedElement(intervalConstraint);
				if (result == null) result = caseParameterableElement(intervalConstraint);
				if (result == null) result = caseTemplateableElement(intervalConstraint);
				if (result == null) result = caseElement(intervalConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.TIME_INTERVAL: {
				TimeInterval timeInterval = (TimeInterval)theEObject;
				T result = caseTimeInterval(timeInterval);
				if (result == null) result = caseInterval(timeInterval);
				if (result == null) result = caseValueSpecification(timeInterval);
				if (result == null) result = caseTypedElement(timeInterval);
				if (result == null) result = caseParameterableElement(timeInterval);
				if (result == null) result = caseNamedElement(timeInterval);
				if (result == null) result = caseTemplateableElement(timeInterval);
				if (result == null) result = caseElement(timeInterval);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.DURATION_OBSERVATION_ACTION: {
				DurationObservationAction durationObservationAction = (DurationObservationAction)theEObject;
				T result = caseDurationObservationAction(durationObservationAction);
				if (result == null) result = caseWriteStructuralFeatureAction(durationObservationAction);
				if (result == null) result = caseStructuralFeatureAction(durationObservationAction);
				if (result == null) result = caseAction(durationObservationAction);
				if (result == null) result = caseExecutableNode(durationObservationAction);
				if (result == null) result = caseActivityNode(durationObservationAction);
				if (result == null) result = caseRedefinableElement(durationObservationAction);
				if (result == null) result = caseNamedElement(durationObservationAction);
				if (result == null) result = caseTemplateableElement(durationObservationAction);
				if (result == null) result = caseElement(durationObservationAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.DURATION_CONSTRAINT: {
				DurationConstraint durationConstraint = (DurationConstraint)theEObject;
				T result = caseDurationConstraint(durationConstraint);
				if (result == null) result = caseIntervalConstraint(durationConstraint);
				if (result == null) result = caseConstraint(durationConstraint);
				if (result == null) result = casePackageableElement(durationConstraint);
				if (result == null) result = caseNamedElement(durationConstraint);
				if (result == null) result = caseParameterableElement(durationConstraint);
				if (result == null) result = caseTemplateableElement(durationConstraint);
				if (result == null) result = caseElement(durationConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.DATA_STORE_NODE: {
				DataStoreNode dataStoreNode = (DataStoreNode)theEObject;
				T result = caseDataStoreNode(dataStoreNode);
				if (result == null) result = caseCentralBufferNode(dataStoreNode);
				if (result == null) result = caseObjectNode(dataStoreNode);
				if (result == null) result = caseActivityNode(dataStoreNode);
				if (result == null) result = caseTypedElement(dataStoreNode);
				if (result == null) result = caseRedefinableElement(dataStoreNode);
				if (result == null) result = caseNamedElement(dataStoreNode);
				if (result == null) result = caseTemplateableElement(dataStoreNode);
				if (result == null) result = caseElement(dataStoreNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.INTERRUPTIBLE_ACTIVITY_REGION: {
				InterruptibleActivityRegion interruptibleActivityRegion = (InterruptibleActivityRegion)theEObject;
				T result = caseInterruptibleActivityRegion(interruptibleActivityRegion);
				if (result == null) result = caseActivityGroup(interruptibleActivityRegion);
				if (result == null) result = caseElement(interruptibleActivityRegion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.PARAMETER_SET: {
				ParameterSet parameterSet = (ParameterSet)theEObject;
				T result = caseParameterSet(parameterSet);
				if (result == null) result = caseNamedElement(parameterSet);
				if (result == null) result = caseTemplateableElement(parameterSet);
				if (result == null) result = caseElement(parameterSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.COMPONENT: {
				Component component = (Component)theEObject;
				T result = caseComponent(component);
				if (result == null) result = caseClass(component);
				if (result == null) result = caseBehavioredClassifier(component);
				if (result == null) result = caseEncapsulatedClassifier(component);
				if (result == null) result = caseStructuredClassifier(component);
				if (result == null) result = caseClassifier(component);
				if (result == null) result = caseNamespace(component);
				if (result == null) result = caseType(component);
				if (result == null) result = caseRedefinableElement(component);
				if (result == null) result = casePackageableElement(component);
				if (result == null) result = caseNamedElement(component);
				if (result == null) result = caseTemplateableElement(component);
				if (result == null) result = caseParameterableElement(component);
				if (result == null) result = caseElement(component);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.DEPLOYMENT: {
				Deployment deployment = (Deployment)theEObject;
				T result = caseDeployment(deployment);
				if (result == null) result = caseDependency(deployment);
				if (result == null) result = casePackageableElement(deployment);
				if (result == null) result = caseDirectedRelationship(deployment);
				if (result == null) result = caseNamedElement(deployment);
				if (result == null) result = caseParameterableElement(deployment);
				if (result == null) result = caseRelationship(deployment);
				if (result == null) result = caseTemplateableElement(deployment);
				if (result == null) result = caseElement(deployment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.DEPLOYED_ARTIFACT: {
				DeployedArtifact deployedArtifact = (DeployedArtifact)theEObject;
				T result = caseDeployedArtifact(deployedArtifact);
				if (result == null) result = caseNamedElement(deployedArtifact);
				if (result == null) result = caseTemplateableElement(deployedArtifact);
				if (result == null) result = caseElement(deployedArtifact);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.DEPLOYMENT_TARGET: {
				DeploymentTarget deploymentTarget = (DeploymentTarget)theEObject;
				T result = caseDeploymentTarget(deploymentTarget);
				if (result == null) result = caseNamedElement(deploymentTarget);
				if (result == null) result = caseTemplateableElement(deploymentTarget);
				if (result == null) result = caseElement(deploymentTarget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.NODE: {
				Node node = (Node)theEObject;
				T result = caseNode(node);
				if (result == null) result = caseClass(node);
				if (result == null) result = caseDeploymentTarget(node);
				if (result == null) result = caseBehavioredClassifier(node);
				if (result == null) result = caseEncapsulatedClassifier(node);
				if (result == null) result = caseStructuredClassifier(node);
				if (result == null) result = caseClassifier(node);
				if (result == null) result = caseNamespace(node);
				if (result == null) result = caseType(node);
				if (result == null) result = caseRedefinableElement(node);
				if (result == null) result = casePackageableElement(node);
				if (result == null) result = caseNamedElement(node);
				if (result == null) result = caseTemplateableElement(node);
				if (result == null) result = caseParameterableElement(node);
				if (result == null) result = caseElement(node);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.DEVICE: {
				Device device = (Device)theEObject;
				T result = caseDevice(device);
				if (result == null) result = caseNode(device);
				if (result == null) result = caseClass(device);
				if (result == null) result = caseDeploymentTarget(device);
				if (result == null) result = caseBehavioredClassifier(device);
				if (result == null) result = caseEncapsulatedClassifier(device);
				if (result == null) result = caseStructuredClassifier(device);
				if (result == null) result = caseClassifier(device);
				if (result == null) result = caseNamespace(device);
				if (result == null) result = caseType(device);
				if (result == null) result = caseRedefinableElement(device);
				if (result == null) result = casePackageableElement(device);
				if (result == null) result = caseNamedElement(device);
				if (result == null) result = caseTemplateableElement(device);
				if (result == null) result = caseParameterableElement(device);
				if (result == null) result = caseElement(device);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.EXECUTION_ENVIRONMENT: {
				ExecutionEnvironment executionEnvironment = (ExecutionEnvironment)theEObject;
				T result = caseExecutionEnvironment(executionEnvironment);
				if (result == null) result = caseNode(executionEnvironment);
				if (result == null) result = caseClass(executionEnvironment);
				if (result == null) result = caseDeploymentTarget(executionEnvironment);
				if (result == null) result = caseBehavioredClassifier(executionEnvironment);
				if (result == null) result = caseEncapsulatedClassifier(executionEnvironment);
				if (result == null) result = caseStructuredClassifier(executionEnvironment);
				if (result == null) result = caseClassifier(executionEnvironment);
				if (result == null) result = caseNamespace(executionEnvironment);
				if (result == null) result = caseType(executionEnvironment);
				if (result == null) result = caseRedefinableElement(executionEnvironment);
				if (result == null) result = casePackageableElement(executionEnvironment);
				if (result == null) result = caseNamedElement(executionEnvironment);
				if (result == null) result = caseTemplateableElement(executionEnvironment);
				if (result == null) result = caseParameterableElement(executionEnvironment);
				if (result == null) result = caseElement(executionEnvironment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.COMMUNICATION_PATH: {
				CommunicationPath communicationPath = (CommunicationPath)theEObject;
				T result = caseCommunicationPath(communicationPath);
				if (result == null) result = caseAssociation(communicationPath);
				if (result == null) result = caseClassifier(communicationPath);
				if (result == null) result = caseRelationship(communicationPath);
				if (result == null) result = caseNamespace(communicationPath);
				if (result == null) result = caseType(communicationPath);
				if (result == null) result = caseRedefinableElement(communicationPath);
				if (result == null) result = casePackageableElement(communicationPath);
				if (result == null) result = caseNamedElement(communicationPath);
				if (result == null) result = caseTemplateableElement(communicationPath);
				if (result == null) result = caseParameterableElement(communicationPath);
				if (result == null) result = caseElement(communicationPath);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.PROTOCOL_CONFORMANCE: {
				ProtocolConformance protocolConformance = (ProtocolConformance)theEObject;
				T result = caseProtocolConformance(protocolConformance);
				if (result == null) result = caseDirectedRelationship(protocolConformance);
				if (result == null) result = caseRelationship(protocolConformance);
				if (result == null) result = caseElement(protocolConformance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.PROTOCOL_STATE_MACHINE: {
				ProtocolStateMachine protocolStateMachine = (ProtocolStateMachine)theEObject;
				T result = caseProtocolStateMachine(protocolStateMachine);
				if (result == null) result = caseStateMachine(protocolStateMachine);
				if (result == null) result = caseBehavior(protocolStateMachine);
				if (result == null) result = caseClass(protocolStateMachine);
				if (result == null) result = caseBehavioredClassifier(protocolStateMachine);
				if (result == null) result = caseEncapsulatedClassifier(protocolStateMachine);
				if (result == null) result = caseStructuredClassifier(protocolStateMachine);
				if (result == null) result = caseClassifier(protocolStateMachine);
				if (result == null) result = caseNamespace(protocolStateMachine);
				if (result == null) result = caseType(protocolStateMachine);
				if (result == null) result = caseRedefinableElement(protocolStateMachine);
				if (result == null) result = casePackageableElement(protocolStateMachine);
				if (result == null) result = caseNamedElement(protocolStateMachine);
				if (result == null) result = caseTemplateableElement(protocolStateMachine);
				if (result == null) result = caseParameterableElement(protocolStateMachine);
				if (result == null) result = caseElement(protocolStateMachine);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.PROTOCOL_TRANSITION: {
				ProtocolTransition protocolTransition = (ProtocolTransition)theEObject;
				T result = caseProtocolTransition(protocolTransition);
				if (result == null) result = caseTransition(protocolTransition);
				if (result == null) result = caseRedefinableElement(protocolTransition);
				if (result == null) result = caseNamedElement(protocolTransition);
				if (result == null) result = caseTemplateableElement(protocolTransition);
				if (result == null) result = caseElement(protocolTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.READ_EXTENT_ACTION: {
				ReadExtentAction readExtentAction = (ReadExtentAction)theEObject;
				T result = caseReadExtentAction(readExtentAction);
				if (result == null) result = caseAction(readExtentAction);
				if (result == null) result = caseExecutableNode(readExtentAction);
				if (result == null) result = caseActivityNode(readExtentAction);
				if (result == null) result = caseRedefinableElement(readExtentAction);
				if (result == null) result = caseNamedElement(readExtentAction);
				if (result == null) result = caseTemplateableElement(readExtentAction);
				if (result == null) result = caseElement(readExtentAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.RECLASSIFY_OBJECT_ACTION: {
				ReclassifyObjectAction reclassifyObjectAction = (ReclassifyObjectAction)theEObject;
				T result = caseReclassifyObjectAction(reclassifyObjectAction);
				if (result == null) result = caseAction(reclassifyObjectAction);
				if (result == null) result = caseExecutableNode(reclassifyObjectAction);
				if (result == null) result = caseActivityNode(reclassifyObjectAction);
				if (result == null) result = caseRedefinableElement(reclassifyObjectAction);
				if (result == null) result = caseNamedElement(reclassifyObjectAction);
				if (result == null) result = caseTemplateableElement(reclassifyObjectAction);
				if (result == null) result = caseElement(reclassifyObjectAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.READ_IS_CLASSIFIED_OBJECT_ACTION: {
				ReadIsClassifiedObjectAction readIsClassifiedObjectAction = (ReadIsClassifiedObjectAction)theEObject;
				T result = caseReadIsClassifiedObjectAction(readIsClassifiedObjectAction);
				if (result == null) result = caseAction(readIsClassifiedObjectAction);
				if (result == null) result = caseExecutableNode(readIsClassifiedObjectAction);
				if (result == null) result = caseActivityNode(readIsClassifiedObjectAction);
				if (result == null) result = caseRedefinableElement(readIsClassifiedObjectAction);
				if (result == null) result = caseNamedElement(readIsClassifiedObjectAction);
				if (result == null) result = caseTemplateableElement(readIsClassifiedObjectAction);
				if (result == null) result = caseElement(readIsClassifiedObjectAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.START_OWNED_BEHAVIOR_ACTION: {
				StartOwnedBehaviorAction startOwnedBehaviorAction = (StartOwnedBehaviorAction)theEObject;
				T result = caseStartOwnedBehaviorAction(startOwnedBehaviorAction);
				if (result == null) result = caseAction(startOwnedBehaviorAction);
				if (result == null) result = caseExecutableNode(startOwnedBehaviorAction);
				if (result == null) result = caseActivityNode(startOwnedBehaviorAction);
				if (result == null) result = caseRedefinableElement(startOwnedBehaviorAction);
				if (result == null) result = caseNamedElement(startOwnedBehaviorAction);
				if (result == null) result = caseTemplateableElement(startOwnedBehaviorAction);
				if (result == null) result = caseElement(startOwnedBehaviorAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.QUALIFIER_VALUE: {
				QualifierValue qualifierValue = (QualifierValue)theEObject;
				T result = caseQualifierValue(qualifierValue);
				if (result == null) result = caseElement(qualifierValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.READ_LINK_OBJECT_END_ACTION: {
				ReadLinkObjectEndAction readLinkObjectEndAction = (ReadLinkObjectEndAction)theEObject;
				T result = caseReadLinkObjectEndAction(readLinkObjectEndAction);
				if (result == null) result = caseAction(readLinkObjectEndAction);
				if (result == null) result = caseExecutableNode(readLinkObjectEndAction);
				if (result == null) result = caseActivityNode(readLinkObjectEndAction);
				if (result == null) result = caseRedefinableElement(readLinkObjectEndAction);
				if (result == null) result = caseNamedElement(readLinkObjectEndAction);
				if (result == null) result = caseTemplateableElement(readLinkObjectEndAction);
				if (result == null) result = caseElement(readLinkObjectEndAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.READ_LINK_OBJECT_END_QUALIFIER_ACTION: {
				ReadLinkObjectEndQualifierAction readLinkObjectEndQualifierAction = (ReadLinkObjectEndQualifierAction)theEObject;
				T result = caseReadLinkObjectEndQualifierAction(readLinkObjectEndQualifierAction);
				if (result == null) result = caseAction(readLinkObjectEndQualifierAction);
				if (result == null) result = caseExecutableNode(readLinkObjectEndQualifierAction);
				if (result == null) result = caseActivityNode(readLinkObjectEndQualifierAction);
				if (result == null) result = caseRedefinableElement(readLinkObjectEndQualifierAction);
				if (result == null) result = caseNamedElement(readLinkObjectEndQualifierAction);
				if (result == null) result = caseTemplateableElement(readLinkObjectEndQualifierAction);
				if (result == null) result = caseElement(readLinkObjectEndQualifierAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.CREATE_LINK_OBJECT_ACTION: {
				CreateLinkObjectAction createLinkObjectAction = (CreateLinkObjectAction)theEObject;
				T result = caseCreateLinkObjectAction(createLinkObjectAction);
				if (result == null) result = caseCreateLinkAction(createLinkObjectAction);
				if (result == null) result = caseWriteLinkAction(createLinkObjectAction);
				if (result == null) result = caseLinkAction(createLinkObjectAction);
				if (result == null) result = caseAction(createLinkObjectAction);
				if (result == null) result = caseExecutableNode(createLinkObjectAction);
				if (result == null) result = caseActivityNode(createLinkObjectAction);
				if (result == null) result = caseRedefinableElement(createLinkObjectAction);
				if (result == null) result = caseNamedElement(createLinkObjectAction);
				if (result == null) result = caseTemplateableElement(createLinkObjectAction);
				if (result == null) result = caseElement(createLinkObjectAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.ACCEPT_EVENT_ACTION: {
				AcceptEventAction acceptEventAction = (AcceptEventAction)theEObject;
				T result = caseAcceptEventAction(acceptEventAction);
				if (result == null) result = caseAction(acceptEventAction);
				if (result == null) result = caseExecutableNode(acceptEventAction);
				if (result == null) result = caseActivityNode(acceptEventAction);
				if (result == null) result = caseRedefinableElement(acceptEventAction);
				if (result == null) result = caseNamedElement(acceptEventAction);
				if (result == null) result = caseTemplateableElement(acceptEventAction);
				if (result == null) result = caseElement(acceptEventAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.ACCEPT_CALL_ACTION: {
				AcceptCallAction acceptCallAction = (AcceptCallAction)theEObject;
				T result = caseAcceptCallAction(acceptCallAction);
				if (result == null) result = caseAcceptEventAction(acceptCallAction);
				if (result == null) result = caseAction(acceptCallAction);
				if (result == null) result = caseExecutableNode(acceptCallAction);
				if (result == null) result = caseActivityNode(acceptCallAction);
				if (result == null) result = caseRedefinableElement(acceptCallAction);
				if (result == null) result = caseNamedElement(acceptCallAction);
				if (result == null) result = caseTemplateableElement(acceptCallAction);
				if (result == null) result = caseElement(acceptCallAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.REPLY_ACTION: {
				ReplyAction replyAction = (ReplyAction)theEObject;
				T result = caseReplyAction(replyAction);
				if (result == null) result = caseAction(replyAction);
				if (result == null) result = caseExecutableNode(replyAction);
				if (result == null) result = caseActivityNode(replyAction);
				if (result == null) result = caseRedefinableElement(replyAction);
				if (result == null) result = caseNamedElement(replyAction);
				if (result == null) result = caseTemplateableElement(replyAction);
				if (result == null) result = caseElement(replyAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.RAISE_EXCEPTION_ACTION: {
				RaiseExceptionAction raiseExceptionAction = (RaiseExceptionAction)theEObject;
				T result = caseRaiseExceptionAction(raiseExceptionAction);
				if (result == null) result = caseAction(raiseExceptionAction);
				if (result == null) result = caseExecutableNode(raiseExceptionAction);
				if (result == null) result = caseActivityNode(raiseExceptionAction);
				if (result == null) result = caseRedefinableElement(raiseExceptionAction);
				if (result == null) result = caseNamedElement(raiseExceptionAction);
				if (result == null) result = caseTemplateableElement(raiseExceptionAction);
				if (result == null) result = caseElement(raiseExceptionAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UML2Package.DEPLOYMENT_SPECIFICATION: {
				DeploymentSpecification deploymentSpecification = (DeploymentSpecification)theEObject;
				T result = caseDeploymentSpecification(deploymentSpecification);
				if (result == null) result = caseArtifact(deploymentSpecification);
				if (result == null) result = caseClassifier(deploymentSpecification);
				if (result == null) result = caseDeployedArtifact(deploymentSpecification);
				if (result == null) result = caseNamespace(deploymentSpecification);
				if (result == null) result = caseType(deploymentSpecification);
				if (result == null) result = caseRedefinableElement(deploymentSpecification);
				if (result == null) result = casePackageableElement(deploymentSpecification);
				if (result == null) result = caseNamedElement(deploymentSpecification);
				if (result == null) result = caseTemplateableElement(deploymentSpecification);
				if (result == null) result = caseParameterableElement(deploymentSpecification);
				if (result == null) result = caseElement(deploymentSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multiplicity Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multiplicity Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiplicityElement(MultiplicityElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Namespace</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Namespace</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamespace(Namespace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Opaque Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Opaque Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpaqueExpression(OpaqueExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueSpecification(ValueSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression(Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComment(Comment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Directed Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Directed Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDirectedRelationship(DirectedRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationship(Relationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClass(org.csu.slicing.UML2.Class object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseType(Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProperty(Property object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperation(Operation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Typed Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Typed Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypedElement(TypedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameter(Parameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackage(org.csu.slicing.UML2.Package object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumeration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumeration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumeration(Enumeration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataType(DataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumeration Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumeration Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumerationLiteral(EnumerationLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveType(PrimitiveType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Classifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassifier(Classifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeature(Feature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraint(Constraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal Boolean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteralBoolean(LiteralBoolean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteralSpecification(LiteralSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal String</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteralString(LiteralString object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal Null</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal Null</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteralNull(LiteralNull object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal Integer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal Integer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteralInteger(LiteralInteger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal Unlimited Natural</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal Unlimited Natural</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteralUnlimitedNatural(LiteralUnlimitedNatural object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Behavioral Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Behavioral Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBehavioralFeature(BehavioralFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structural Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structural Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructuralFeature(StructuralFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instance Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instance Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstanceSpecification(InstanceSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Slot</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Slot</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSlot(Slot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instance Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instance Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstanceValue(InstanceValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Redefinable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Redefinable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRedefinableElement(RedefinableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generalization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generalization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralization(Generalization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Packageable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Packageable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackageableElement(PackageableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Import</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Import</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementImport(ElementImport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package Import</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package Import</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackageImport(PackageImport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Association</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Association</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssociation(Association object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package Merge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package Merge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackageMerge(PackageMerge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stereotype</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stereotype</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStereotype(Stereotype object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Profile</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Profile</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProfile(Profile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Profile Application</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Profile Application</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProfileApplication(ProfileApplication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtension(Extension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extension End</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extension End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtensionEnd(ExtensionEnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Behavior</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBehavior(Behavior object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Behaviored Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Behaviored Classifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBehavioredClassifier(BehavioredClassifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivity(Activity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Permission</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Permission</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePermission(Permission object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dependency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDependency(Dependency object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Usage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Usage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUsage(Usage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstraction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstraction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstraction(Abstraction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Realization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Realization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRealization(Realization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Substitution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Substitution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubstitution(Substitution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generalization Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generalization Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralizationSet(GeneralizationSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Association Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Association Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssociationClass(AssociationClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Information Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Information Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInformationItem(InformationItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Information Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Information Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInformationFlow(InformationFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModel(Model object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connector End</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connector End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectorEnd(ConnectorEnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connectable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connectable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectableElement(ConnectableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnector(Connector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structured Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structured Classifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructuredClassifier(StructuredClassifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityEdge(ActivityEdge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityGroup(ActivityGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityNode(ActivityNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAction(Action object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectNode(ObjectNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlNode(ControlNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlFlow(ControlFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectFlow(ObjectFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Initial Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Initial Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInitialNode(InitialNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Final Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Final Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFinalNode(FinalNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Final Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Final Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityFinalNode(ActivityFinalNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decision Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decision Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDecisionNode(DecisionNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Merge Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Merge Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMergeNode(MergeNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Executable Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Executable Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecutableNode(ExecutableNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output Pin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output Pin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputPin(OutputPin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Pin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Pin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputPin(InputPin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePin(Pin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Parameter Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Parameter Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityParameterNode(ActivityParameterNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Pin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Pin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValuePin(ValuePin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterface(Interface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Implementation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImplementation(Implementation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Artifact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Artifact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArtifact(Artifact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Manifestation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Manifestation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseManifestation(Manifestation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActor(Actor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extend</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extend</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtend(Extend object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Use Case</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Use Case</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUseCase(UseCase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extension Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extension Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtensionPoint(ExtensionPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Include</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Include</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInclude(Include object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collaboration Occurrence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collaboration Occurrence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollaborationOccurrence(CollaborationOccurrence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collaboration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collaboration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollaboration(Collaboration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePort(Port object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Encapsulated Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Encapsulated Classifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEncapsulatedClassifier(EncapsulatedClassifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Call Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Call Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCallTrigger(CallTrigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageTrigger(MessageTrigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Change Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Change Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChangeTrigger(ChangeTrigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrigger(Trigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reception</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reception</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReception(Reception object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Signal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Signal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSignal(Signal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Signal Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Signal Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSignalTrigger(SignalTrigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeTrigger(TimeTrigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Any Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Any Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnyTrigger(AnyTrigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariable(Variable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structured Activity Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structured Activity Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructuredActivityNode(StructuredActivityNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conditional Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conditional Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionalNode(ConditionalNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clause</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clause</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClause(Clause object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Loop Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Loop Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoopNode(LoopNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interaction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interaction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteraction(Interaction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interaction Fragment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interaction Fragment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteractionFragment(InteractionFragment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lifeline</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lifeline</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLifeline(Lifeline object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessage(Message object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>General Ordering</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>General Ordering</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralOrdering(GeneralOrdering object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message End</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageEnd(MessageEnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Occurrence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Occurrence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventOccurrence(EventOccurrence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Execution Occurrence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Execution Occurrence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecutionOccurrence(ExecutionOccurrence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State Invariant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State Invariant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStateInvariant(StateInvariant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stop</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stop</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStop(Stop object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Template Signature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Template Signature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemplateSignature(TemplateSignature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Template Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Template Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemplateParameter(TemplateParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Templateable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Templateable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemplateableElement(TemplateableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringExpression(StringExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameterable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameterable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterableElement(ParameterableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Template Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Template Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemplateBinding(TemplateBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Template Parameter Substitution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Template Parameter Substitution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemplateParameterSubstitution(TemplateParameterSubstitution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation Template Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Template Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationTemplateParameter(OperationTemplateParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Classifier Template Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Classifier Template Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassifierTemplateParameter(ClassifierTemplateParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameterable Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameterable Classifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterableClassifier(ParameterableClassifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Redefinable Template Signature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Redefinable Template Signature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRedefinableTemplateSignature(RedefinableTemplateSignature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Templateable Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Templateable Classifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemplateableClassifier(TemplateableClassifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connectable Element Template Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connectable Element Template Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectableElementTemplateParameter(ConnectableElementTemplateParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fork Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fork Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForkNode(ForkNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Join Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Join Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJoinNode(JoinNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flow Final Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flow Final Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlowFinalNode(FlowFinalNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Central Buffer Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Central Buffer Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCentralBufferNode(CentralBufferNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Partition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Partition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityPartition(ActivityPartition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expansion Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expansion Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpansionNode(ExpansionNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expansion Region</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expansion Region</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpansionRegion(ExpansionRegion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exception Handler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exception Handler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExceptionHandler(ExceptionHandler object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interaction Occurrence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interaction Occurrence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteractionOccurrence(InteractionOccurrence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGate(Gate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Part Decomposition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Part Decomposition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePartDecomposition(PartDecomposition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interaction Operand</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interaction Operand</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteractionOperand(InteractionOperand object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interaction Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interaction Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteractionConstraint(InteractionConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Combined Fragment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Combined Fragment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCombinedFragment(CombinedFragment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Continuation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Continuation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContinuation(Continuation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State Machine</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State Machine</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStateMachine(StateMachine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Region</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Region</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegion(Region object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pseudostate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pseudostate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePseudostate(Pseudostate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseState(State object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vertex</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vertex</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVertex(Vertex object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection Point Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection Point Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectionPointReference(ConnectionPointReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransition(Transition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Final State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Final State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFinalState(FinalState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create Object Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create Object Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreateObjectAction(CreateObjectAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Destroy Object Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Destroy Object Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDestroyObjectAction(DestroyObjectAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Identity Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Identity Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestIdentityAction(TestIdentityAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Read Self Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Read Self Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReadSelfAction(ReadSelfAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structural Feature Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structural Feature Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructuralFeatureAction(StructuralFeatureAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Read Structural Feature Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Read Structural Feature Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReadStructuralFeatureAction(ReadStructuralFeatureAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Write Structural Feature Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Write Structural Feature Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWriteStructuralFeatureAction(WriteStructuralFeatureAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clear Structural Feature Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clear Structural Feature Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClearStructuralFeatureAction(ClearStructuralFeatureAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remove Structural Feature Value Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remove Structural Feature Value Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemoveStructuralFeatureValueAction(RemoveStructuralFeatureValueAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Structural Feature Value Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Structural Feature Value Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddStructuralFeatureValueAction(AddStructuralFeatureValueAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinkAction(LinkAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link End Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link End Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinkEndData(LinkEndData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Read Link Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Read Link Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReadLinkAction(ReadLinkAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link End Creation Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link End Creation Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinkEndCreationData(LinkEndCreationData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create Link Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create Link Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreateLinkAction(CreateLinkAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Write Link Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Write Link Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWriteLinkAction(WriteLinkAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Destroy Link Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Destroy Link Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDestroyLinkAction(DestroyLinkAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clear Association Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clear Association Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClearAssociationAction(ClearAssociationAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableAction(VariableAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Read Variable Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Read Variable Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReadVariableAction(ReadVariableAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Write Variable Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Write Variable Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWriteVariableAction(WriteVariableAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clear Variable Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clear Variable Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClearVariableAction(ClearVariableAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Variable Value Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Variable Value Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddVariableValueAction(AddVariableValueAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remove Variable Value Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remove Variable Value Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemoveVariableValueAction(RemoveVariableValueAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Apply Function Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Apply Function Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplyFunctionAction(ApplyFunctionAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveFunction(PrimitiveFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Call Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Call Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCallAction(CallAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Invocation Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Invocation Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInvocationAction(InvocationAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Send Signal Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Send Signal Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSendSignalAction(SendSignalAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Broadcast Signal Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Broadcast Signal Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBroadcastSignalAction(BroadcastSignalAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Send Object Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Send Object Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSendObjectAction(SendObjectAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Call Operation Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Call Operation Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCallOperationAction(CallOperationAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Call Behavior Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Call Behavior Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCallBehaviorAction(CallBehaviorAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeExpression(TimeExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Duration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Duration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDuration(Duration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Observation Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Observation Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeObservationAction(TimeObservationAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Duration Interval</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Duration Interval</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDurationInterval(DurationInterval object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interval</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interval</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterval(Interval object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeConstraint(TimeConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interval Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interval Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntervalConstraint(IntervalConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Interval</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Interval</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeInterval(TimeInterval object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Duration Observation Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Duration Observation Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDurationObservationAction(DurationObservationAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Duration Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Duration Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDurationConstraint(DurationConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Store Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Store Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataStoreNode(DataStoreNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interruptible Activity Region</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interruptible Activity Region</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterruptibleActivityRegion(InterruptibleActivityRegion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterSet(ParameterSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponent(Component object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deployment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deployment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeployment(Deployment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deployed Artifact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deployed Artifact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeployedArtifact(DeployedArtifact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deployment Target</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deployment Target</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeploymentTarget(DeploymentTarget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNode(Node object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDevice(Device object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Execution Environment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Execution Environment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecutionEnvironment(ExecutionEnvironment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Communication Path</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Communication Path</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommunicationPath(CommunicationPath object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Protocol Conformance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Protocol Conformance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProtocolConformance(ProtocolConformance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Protocol State Machine</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Protocol State Machine</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProtocolStateMachine(ProtocolStateMachine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Protocol Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Protocol Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProtocolTransition(ProtocolTransition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Read Extent Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Read Extent Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReadExtentAction(ReadExtentAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reclassify Object Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reclassify Object Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReclassifyObjectAction(ReclassifyObjectAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Read Is Classified Object Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Read Is Classified Object Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReadIsClassifiedObjectAction(ReadIsClassifiedObjectAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Start Owned Behavior Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Start Owned Behavior Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStartOwnedBehaviorAction(StartOwnedBehaviorAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Qualifier Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Qualifier Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQualifierValue(QualifierValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Read Link Object End Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Read Link Object End Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReadLinkObjectEndAction(ReadLinkObjectEndAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Read Link Object End Qualifier Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Read Link Object End Qualifier Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReadLinkObjectEndQualifierAction(ReadLinkObjectEndQualifierAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create Link Object Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create Link Object Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreateLinkObjectAction(CreateLinkObjectAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Accept Event Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Accept Event Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAcceptEventAction(AcceptEventAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Accept Call Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Accept Call Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAcceptCallAction(AcceptCallAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reply Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reply Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReplyAction(ReplyAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Raise Exception Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Raise Exception Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRaiseExceptionAction(RaiseExceptionAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deployment Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deployment Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeploymentSpecification(DeploymentSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //UML2Switch

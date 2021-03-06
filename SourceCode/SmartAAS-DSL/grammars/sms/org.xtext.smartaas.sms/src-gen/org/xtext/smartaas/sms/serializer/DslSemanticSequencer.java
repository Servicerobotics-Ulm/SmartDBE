/*
 * generated by Xtext 2.23.0
 */
package org.xtext.smartaas.sms.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.smartaas.sms.dsl.DslPackage;
import org.xtext.smartaas.sms.dsl.Model;
import org.xtext.smartaas.sms.dsl.SMSINType;
import org.xtext.smartaas.sms.dsl.SMSINTypeCommand;
import org.xtext.smartaas.sms.dsl.SMSINTypeNameplate;
import org.xtext.smartaas.sms.dsl.SMSINTypeTechnicalData;
import org.xtext.smartaas.sms.dsl.a1;
import org.xtext.smartaas.sms.dsl.a2;
import org.xtext.smartaas.sms.dsl.a3;
import org.xtext.smartaas.sms.dsl.a4;
import org.xtext.smartaas.sms.dsl.a5;
import org.xtext.smartaas.sms.dsl.any;
import org.xtext.smartaas.sms.dsl.b1;
import org.xtext.smartaas.sms.dsl.b2;
import org.xtext.smartaas.sms.dsl.b3;
import org.xtext.smartaas.sms.dsl.b4;
import org.xtext.smartaas.sms.dsl.b5;
import org.xtext.smartaas.sms.services.DslGrammarAccess;

@SuppressWarnings("all")
public class DslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private DslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == DslPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case DslPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case DslPackage.SMSIN_TYPE:
				sequence_SMSINType(context, (SMSINType) semanticObject); 
				return; 
			case DslPackage.SMSIN_TYPE_COMMAND:
				sequence_SMSINTypeCommand(context, (SMSINTypeCommand) semanticObject); 
				return; 
			case DslPackage.SMSIN_TYPE_NAMEPLATE:
				sequence_SMSINTypeNameplate(context, (SMSINTypeNameplate) semanticObject); 
				return; 
			case DslPackage.SMSIN_TYPE_TECHNICAL_DATA:
				sequence_SMSINTypeTechnicalData(context, (SMSINTypeTechnicalData) semanticObject); 
				return; 
			case DslPackage.A1:
				sequence_a1(context, (a1) semanticObject); 
				return; 
			case DslPackage.A2:
				sequence_a2(context, (a2) semanticObject); 
				return; 
			case DslPackage.A3:
				sequence_a3(context, (a3) semanticObject); 
				return; 
			case DslPackage.A4:
				sequence_a4(context, (a4) semanticObject); 
				return; 
			case DslPackage.A5:
				sequence_a5(context, (a5) semanticObject); 
				return; 
			case DslPackage.ANY:
				sequence_any(context, (any) semanticObject); 
				return; 
			case DslPackage.B1:
				sequence_b1(context, (b1) semanticObject); 
				return; 
			case DslPackage.B2:
				sequence_b2(context, (b2) semanticObject); 
				return; 
			case DslPackage.B3:
				sequence_b3(context, (b3) semanticObject); 
				return; 
			case DslPackage.B4:
				sequence_b4(context, (b4) semanticObject); 
				return; 
			case DslPackage.B5:
				sequence_b5(context, (b5) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     (SMSIN=SMSINType SMSINCommand=SMSINTypeCommand?)
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SMSINTypeCommand returns SMSINTypeCommand
	 *
	 * Constraint:
	 *     (name=STRING any+=any*)
	 */
	protected void sequence_SMSINTypeCommand(ISerializationContext context, SMSINTypeCommand semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SMSINTypeNameplate returns SMSINTypeNameplate
	 *
	 * Constraint:
	 *     (name=STRING any+=any*)
	 */
	protected void sequence_SMSINTypeNameplate(ISerializationContext context, SMSINTypeNameplate semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SMSINTypeTechnicalData returns SMSINTypeTechnicalData
	 *
	 * Constraint:
	 *     (name=STRING any+=any*)
	 */
	protected void sequence_SMSINTypeTechnicalData(ISerializationContext context, SMSINTypeTechnicalData semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SMSINType returns SMSINType
	 *
	 * Constraint:
	 *     (name=STRING any+=any*)
	 */
	protected void sequence_SMSINType(ISerializationContext context, SMSINType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     a1 returns a1
	 *
	 * Constraint:
	 *     name=STRING
	 */
	protected void sequence_a1(ISerializationContext context, a1 semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DslPackage.Literals.A1__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DslPackage.Literals.A1__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getA1Access().getNameSTRINGTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     a2 returns a2
	 *
	 * Constraint:
	 *     name=STRING
	 */
	protected void sequence_a2(ISerializationContext context, a2 semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DslPackage.Literals.A2__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DslPackage.Literals.A2__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getA2Access().getNameSTRINGTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     a3 returns a3
	 *
	 * Constraint:
	 *     name=STRING
	 */
	protected void sequence_a3(ISerializationContext context, a3 semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DslPackage.Literals.A3__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DslPackage.Literals.A3__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getA3Access().getNameSTRINGTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     a4 returns a4
	 *
	 * Constraint:
	 *     name=STRING
	 */
	protected void sequence_a4(ISerializationContext context, a4 semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DslPackage.Literals.A4__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DslPackage.Literals.A4__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getA4Access().getNameSTRINGTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     a5 returns a5
	 *
	 * Constraint:
	 *     name=STRING
	 */
	protected void sequence_a5(ISerializationContext context, a5 semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DslPackage.Literals.A5__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DslPackage.Literals.A5__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getA5Access().getNameSTRINGTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     any returns any
	 *
	 * Constraint:
	 *     (
	 *         name=a1 | 
	 *         name=a2 | 
	 *         name=a3 | 
	 *         name=a4 | 
	 *         name=a5 | 
	 *         name=b1 | 
	 *         name=b2 | 
	 *         name=b3 | 
	 *         name=b4 | 
	 *         name=b5
	 *     )
	 */
	protected void sequence_any(ISerializationContext context, any semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     b1 returns b1
	 *
	 * Constraint:
	 *     name=STRING
	 */
	protected void sequence_b1(ISerializationContext context, b1 semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DslPackage.Literals.B1__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DslPackage.Literals.B1__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getB1Access().getNameSTRINGTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     b2 returns b2
	 *
	 * Constraint:
	 *     name=STRING
	 */
	protected void sequence_b2(ISerializationContext context, b2 semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DslPackage.Literals.B2__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DslPackage.Literals.B2__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getB2Access().getNameSTRINGTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     b3 returns b3
	 *
	 * Constraint:
	 *     name=STRING
	 */
	protected void sequence_b3(ISerializationContext context, b3 semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DslPackage.Literals.B3__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DslPackage.Literals.B3__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getB3Access().getNameSTRINGTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     b4 returns b4
	 *
	 * Constraint:
	 *     name=STRING
	 */
	protected void sequence_b4(ISerializationContext context, b4 semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DslPackage.Literals.B4__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DslPackage.Literals.B4__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getB4Access().getNameSTRINGTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     b5 returns b5
	 *
	 * Constraint:
	 *     name=STRING
	 */
	protected void sequence_b5(ISerializationContext context, b5 semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DslPackage.Literals.B5__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DslPackage.Literals.B5__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getB5Access().getNameSTRINGTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
}

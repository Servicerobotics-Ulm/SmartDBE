/*
 * generated by Xtext 2.23.0
 */
package org.xtext.smartaas.sms.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.xtext.smartaas.sms.services.DslGrammarAccess;

@SuppressWarnings("all")
public class DslSyntacticSequencer extends AbstractSyntacticSequencer {

	protected DslGrammarAccess grammarAccess;
	protected AbstractElementAlias match_SMSINTypeCommand_SemicolonKeyword_5_1_a;
	protected AbstractElementAlias match_SMSINTypeCommand_SemicolonKeyword_5_1_p;
	protected AbstractElementAlias match_SMSINTypeNameplate_SemicolonKeyword_5_1_a;
	protected AbstractElementAlias match_SMSINTypeNameplate_SemicolonKeyword_5_1_p;
	protected AbstractElementAlias match_SMSINTypeTechnicalData_SemicolonKeyword_5_1_a;
	protected AbstractElementAlias match_SMSINTypeTechnicalData_SemicolonKeyword_5_1_p;
	protected AbstractElementAlias match_SMSINType_SemicolonKeyword_5_1_a;
	protected AbstractElementAlias match_SMSINType_SemicolonKeyword_5_1_p;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (DslGrammarAccess) access;
		match_SMSINTypeCommand_SemicolonKeyword_5_1_a = new TokenAlias(true, true, grammarAccess.getSMSINTypeCommandAccess().getSemicolonKeyword_5_1());
		match_SMSINTypeCommand_SemicolonKeyword_5_1_p = new TokenAlias(true, false, grammarAccess.getSMSINTypeCommandAccess().getSemicolonKeyword_5_1());
		match_SMSINTypeNameplate_SemicolonKeyword_5_1_a = new TokenAlias(true, true, grammarAccess.getSMSINTypeNameplateAccess().getSemicolonKeyword_5_1());
		match_SMSINTypeNameplate_SemicolonKeyword_5_1_p = new TokenAlias(true, false, grammarAccess.getSMSINTypeNameplateAccess().getSemicolonKeyword_5_1());
		match_SMSINTypeTechnicalData_SemicolonKeyword_5_1_a = new TokenAlias(true, true, grammarAccess.getSMSINTypeTechnicalDataAccess().getSemicolonKeyword_5_1());
		match_SMSINTypeTechnicalData_SemicolonKeyword_5_1_p = new TokenAlias(true, false, grammarAccess.getSMSINTypeTechnicalDataAccess().getSemicolonKeyword_5_1());
		match_SMSINType_SemicolonKeyword_5_1_a = new TokenAlias(true, true, grammarAccess.getSMSINTypeAccess().getSemicolonKeyword_5_1());
		match_SMSINType_SemicolonKeyword_5_1_p = new TokenAlias(true, false, grammarAccess.getSMSINTypeAccess().getSemicolonKeyword_5_1());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_SMSINTypeCommand_SemicolonKeyword_5_1_a.equals(syntax))
				emit_SMSINTypeCommand_SemicolonKeyword_5_1_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_SMSINTypeCommand_SemicolonKeyword_5_1_p.equals(syntax))
				emit_SMSINTypeCommand_SemicolonKeyword_5_1_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_SMSINTypeNameplate_SemicolonKeyword_5_1_a.equals(syntax))
				emit_SMSINTypeNameplate_SemicolonKeyword_5_1_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_SMSINTypeNameplate_SemicolonKeyword_5_1_p.equals(syntax))
				emit_SMSINTypeNameplate_SemicolonKeyword_5_1_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_SMSINTypeTechnicalData_SemicolonKeyword_5_1_a.equals(syntax))
				emit_SMSINTypeTechnicalData_SemicolonKeyword_5_1_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_SMSINTypeTechnicalData_SemicolonKeyword_5_1_p.equals(syntax))
				emit_SMSINTypeTechnicalData_SemicolonKeyword_5_1_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_SMSINType_SemicolonKeyword_5_1_a.equals(syntax))
				emit_SMSINType_SemicolonKeyword_5_1_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_SMSINType_SemicolonKeyword_5_1_p.equals(syntax))
				emit_SMSINType_SemicolonKeyword_5_1_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     ';'*
	 *
	 * This ambiguous syntax occurs at:
	 *     any+=any (ambiguity) any+=any
	 *     name=STRING '[[AASEntriesLOG_Command_START[[' (ambiguity) ']]AASEntriesLOG_Command_FINISH]]' (rule end)
	 *     name=STRING '[[AASEntriesLOG_Command_START[[' (ambiguity) any+=any
	 */
	protected void emit_SMSINTypeCommand_SemicolonKeyword_5_1_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';'+
	 *
	 * This ambiguous syntax occurs at:
	 *     any+=any (ambiguity) ']]AASEntriesLOG_Command_FINISH]]' (rule end)
	 */
	protected void emit_SMSINTypeCommand_SemicolonKeyword_5_1_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';'*
	 *
	 * This ambiguous syntax occurs at:
	 *     any+=any (ambiguity) any+=any
	 *     name=STRING '[[AASEntriesLOG_Nameplate_START[[' (ambiguity) ']]AASEntriesLOG_Nameplate_FINISH]]' (rule end)
	 *     name=STRING '[[AASEntriesLOG_Nameplate_START[[' (ambiguity) any+=any
	 */
	protected void emit_SMSINTypeNameplate_SemicolonKeyword_5_1_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';'+
	 *
	 * This ambiguous syntax occurs at:
	 *     any+=any (ambiguity) ']]AASEntriesLOG_Nameplate_FINISH]]' (rule end)
	 */
	protected void emit_SMSINTypeNameplate_SemicolonKeyword_5_1_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';'*
	 *
	 * This ambiguous syntax occurs at:
	 *     any+=any (ambiguity) any+=any
	 *     name=STRING '[[AASEntriesLOG_TechnicalData_START[[' (ambiguity) ']]AASEntriesLOG_TechnicalData_FINISH]]' (rule end)
	 *     name=STRING '[[AASEntriesLOG_TechnicalData_START[[' (ambiguity) any+=any
	 */
	protected void emit_SMSINTypeTechnicalData_SemicolonKeyword_5_1_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';'+
	 *
	 * This ambiguous syntax occurs at:
	 *     any+=any (ambiguity) ']]AASEntriesLOG_TechnicalData_FINISH]]' (rule end)
	 */
	protected void emit_SMSINTypeTechnicalData_SemicolonKeyword_5_1_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';'*
	 *
	 * This ambiguous syntax occurs at:
	 *     any+=any (ambiguity) any+=any
	 *     name=STRING '[[AASEntriesLOG_START[[' (ambiguity) ']]AASEntriesLOG_FINISH]]' (rule end)
	 *     name=STRING '[[AASEntriesLOG_START[[' (ambiguity) any+=any
	 */
	protected void emit_SMSINType_SemicolonKeyword_5_1_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';'+
	 *
	 * This ambiguous syntax occurs at:
	 *     any+=any (ambiguity) ']]AASEntriesLOG_FINISH]]' (rule end)
	 */
	protected void emit_SMSINType_SemicolonKeyword_5_1_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}

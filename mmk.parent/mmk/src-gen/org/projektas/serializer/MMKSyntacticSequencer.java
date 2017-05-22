/*
 * generated by Xtext 2.10.0
 */
package org.projektas.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.projektas.services.MMKGrammarAccess;

@SuppressWarnings("all")
public class MMKSyntacticSequencer extends AbstractSyntacticSequencer {

	protected MMKGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Condition___ElseKeyword_5_0_LessThanSignKeyword_5_1_GreaterThanSignKeyword_5_3__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (MMKGrammarAccess) access;
		match_Condition___ElseKeyword_5_0_LessThanSignKeyword_5_1_GreaterThanSignKeyword_5_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getConditionAccess().getElseKeyword_5_0()), new TokenAlias(false, false, grammarAccess.getConditionAccess().getLessThanSignKeyword_5_1()), new TokenAlias(false, false, grammarAccess.getConditionAccess().getGreaterThanSignKeyword_5_3()));
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
			if (match_Condition___ElseKeyword_5_0_LessThanSignKeyword_5_1_GreaterThanSignKeyword_5_3__q.equals(syntax))
				emit_Condition___ElseKeyword_5_0_LessThanSignKeyword_5_1_GreaterThanSignKeyword_5_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     ('else' '<' '>')?
	 *
	 * This ambiguous syntax occurs at:
	 *     cond=ConditionalExpr '<' '>' (ambiguity) (rule end)
	 *     then+=AbstractElement '>' (ambiguity) (rule end)
	 */
	protected void emit_Condition___ElseKeyword_5_0_LessThanSignKeyword_5_1_GreaterThanSignKeyword_5_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}

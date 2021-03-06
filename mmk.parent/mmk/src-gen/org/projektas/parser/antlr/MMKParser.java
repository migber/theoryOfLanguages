/*
 * generated by Xtext 2.12.0-SNAPSHOT
 */
package org.projektas.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.projektas.parser.antlr.internal.InternalMMKParser;
import org.projektas.services.MMKGrammarAccess;

public class MMKParser extends AbstractAntlrParser {

	@Inject
	private MMKGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalMMKParser createParser(XtextTokenStream stream) {
		return new InternalMMKParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}

	public MMKGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MMKGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}

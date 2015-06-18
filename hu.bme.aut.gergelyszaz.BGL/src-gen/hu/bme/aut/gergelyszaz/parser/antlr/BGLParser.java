/*
* generated by Xtext
*/
package hu.bme.aut.gergelyszaz.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import hu.bme.aut.gergelyszaz.services.BGLGrammarAccess;

public class BGLParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private BGLGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected hu.bme.aut.gergelyszaz.parser.antlr.internal.InternalBGLParser createParser(XtextTokenStream stream) {
		return new hu.bme.aut.gergelyszaz.parser.antlr.internal.InternalBGLParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}
	
	public BGLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(BGLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}

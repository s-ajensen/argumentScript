// Generated from ArgumentScript.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ArgumentScriptParser}.
 */
public interface ArgumentScriptListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ArgumentScriptParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(ArgumentScriptParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArgumentScriptParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(ArgumentScriptParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArgumentScriptParser#definition}.
	 * @param ctx the parse tree
	 */
	void enterDefinition(ArgumentScriptParser.DefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArgumentScriptParser#definition}.
	 * @param ctx the parse tree
	 */
	void exitDefinition(ArgumentScriptParser.DefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArgumentScriptParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(ArgumentScriptParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArgumentScriptParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(ArgumentScriptParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArgumentScriptParser#assertion}.
	 * @param ctx the parse tree
	 */
	void enterAssertion(ArgumentScriptParser.AssertionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArgumentScriptParser#assertion}.
	 * @param ctx the parse tree
	 */
	void exitAssertion(ArgumentScriptParser.AssertionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArgumentScriptParser#proposition}.
	 * @param ctx the parse tree
	 */
	void enterProposition(ArgumentScriptParser.PropositionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArgumentScriptParser#proposition}.
	 * @param ctx the parse tree
	 */
	void exitProposition(ArgumentScriptParser.PropositionContext ctx);
}
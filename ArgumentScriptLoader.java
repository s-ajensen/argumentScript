public class ArgumentScriptLoader extends ArgumentScriptBaseListener{
    @Override
    public void enterFile(ArgumentScriptParser.FileContext ctx) {
        System.out.println("Found a file: " + ctx.getText());
        super.enterFile(ctx);
    }

    @Override
    public void exitFile(ArgumentScriptParser.FileContext ctx) {
        super.exitFile(ctx);
    }

    @Override
    public void enterDefinition(ArgumentScriptParser.DefinitionContext ctx) {
        super.enterDefinition(ctx);
    }

    @Override
    public void exitDefinition(ArgumentScriptParser.DefinitionContext ctx) {
        super.exitDefinition(ctx);
    }

    @Override
    public void enterArgument(ArgumentScriptParser.ArgumentContext ctx) {
        super.enterArgument(ctx);
    }

    @Override
    public void exitArgument(ArgumentScriptParser.ArgumentContext ctx) {
        super.exitArgument(ctx);
    }

    @Override
    public void enterAssertion(ArgumentScriptParser.AssertionContext ctx) {
        super.enterAssertion(ctx);
    }

    @Override
    public void exitAssertion(ArgumentScriptParser.AssertionContext ctx) {
        super.exitAssertion(ctx);
    }

    @Override
    public void enterProposition(ArgumentScriptParser.PropositionContext ctx) {
        super.enterProposition(ctx);
    }

    @Override
    public void exitProposition(ArgumentScriptParser.PropositionContext ctx) {
        super.exitProposition(ctx);
    }
}

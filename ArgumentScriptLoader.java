import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;

public class ArgumentScriptLoader extends ArgumentScriptBaseListener{

    PrintWriter fileWriter = new PrintWriter("Out.java");

    public ArgumentScriptLoader() throws FileNotFoundException {
    }

    @Override
    public void enterFile(ArgumentScriptParser.FileContext ctx) {
        fileWriter.println("public class Out {\n" +
                           "    public static void main(String[] args) {\n");
    }

    @Override
    public void exitFile(ArgumentScriptParser.FileContext ctx) {
        fileWriter.println("}}");
        fileWriter.close();
    }

    @Override
    public void enterDefinition(ArgumentScriptParser.DefinitionContext ctx) {
        // Create ArrayList of each line in the definition
        ArrayList<String> defs = new ArrayList<String>(Arrays.asList(ctx.getText().split("\n")));
        // Remove definition header and footer
        defs.remove(defs.size() - 1);
        defs.remove(0);
        // Output a condensed version of each string to the file as a boolean
        for(String s:defs) {
            s = s.replaceAll("\\s","");
            s = s.replaceAll("\"","");
            char first = s.charAt(0);
            fileWriter.println("    boolean " + Character.toLowerCase(first) + s.substring(1,s.length()) + ";");
        }

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

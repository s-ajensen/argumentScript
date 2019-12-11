import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ArgumentScriptLoader extends ArgumentScriptBaseListener{

    PrintWriter fileWriter = new PrintWriter("Out.java");
    // Stores formatted terms after they've been parsed
    ArrayList<String> terms = new ArrayList<>();
    ArrayList<String> arguments = new ArrayList<>();

    public ArgumentScriptLoader() throws FileNotFoundException {
    }

    // Removes quotes and spaces from term
    public String condenseTerm(String term) {
        ArrayList<String> split = new ArrayList(Arrays.asList(term.split(" ")));
        term = "";
        for(int i=0;i<split.size();i++) {
            split.set(i, (Character.toUpperCase(split.get(i).charAt(0)) +
                    split.get(i).substring(1,split.get(i).length())));
            term += split.get(i);
        }

        term = term.replaceAll("\\s", "");
        term = term.replaceAll("\"","");
        char first = term.charAt(0);
        return(Character.toLowerCase(first) + term.substring(1,term.length()));
    }

    public String parseAnd(ArgumentScriptParser.PropositionContext proposition) {
        return(proposition.getText());
    }

    @Override
    public void enterFile(ArgumentScriptParser.FileContext ctx) {
        fileWriter.println("public class Out {\n" +
                           "    public static void main(String[] args) {\n");
    }

    @Override
    public void exitFile(ArgumentScriptParser.FileContext ctx) {
        for(String a:arguments) {
            fileWriter.println(a);
        }
        for(String t:terms) {
            fileWriter.println("    System.out.println(\"" + t + "\" + \" = \" + " + t + ");");
        }
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
            terms.add(this.condenseTerm(s));
            fileWriter.println("    String " + this.condenseTerm(s) + " = \"unknown\";");
        }
    }

    @Override
    public void exitDefinition(ArgumentScriptParser.DefinitionContext ctx) {
        fileWriter.println("\n");
    }

    public void parseImp(TerminalNodeImpl term) {

    }

    public ParseTree parseProp(ParseTree node) {
            /*try {
                if(node.getChild(0).getText().equals("~")) {
                    if(node.getChild(1).getChild(1).getText().equals("->")) {
                        System.out.println("Found an IF");
                        fileWriter.println("    if(!" +
                                this.condenseTerm(node.getChild(1).getChild(0).getText()) +
                                ") {");
                        fileWriter.println("    }");
                    }
                } else {
                    if(node.getChild(1).getText().equals("->")) {
                        System.out.println("Found an IF");
                        fileWriter.println("    if(" +
                                this.condenseTerm(node.getChild(0).getText()) +
                                ") {");

                        fileWriter.println("    }");
                    }
                }
            } catch(NullPointerException e) {
                System.out.println("Found a TERM");
            }*/
            //System.out.println(node.getChildCount());
            if(node.getChildCount() == 2) {
                parseProp(node.getChild(1));
            } else if(node.getChild(1).getText().equals("|")) {
                arguments.add("    if(" +
                        this.condenseTerm(node.getChild(0).getText()) +
                        ".equals(\"false\")) {" + this.condenseTerm(node.getChild(2).getText()) +
                        " = \"true\"; }\n");
                arguments.add("    if(" +
                        this.condenseTerm(node.getChild(2).getText()) +
                        ".equals(\"false\")) {" + this.condenseTerm(node.getChild(0).getText()) +
                        " = \"true\"; }\n");
            } else if(node.getChild(1).getText().equals("&")) {
                arguments.add("    " + this.condenseTerm(node.getChild(0).getText()) +
                        " = \"true\";\n");
                arguments.add("    " + this.condenseTerm(node.getChild(2).getText()) +
                        " = \"true\";\n");
            } else if(node.getChild(1).getText().equals("->")) {
                arguments.add("    if(" +
                        this.condenseTerm(node.getChild(0).getText()) +
                        ".equals(\"true\")) {" +
                        this.condenseTerm(node.getChild(2).getText()) +
                        " = \"true\";}");
                        //this.parseProp(node.getChild(2)) +
            } else if(node.getChildCount() == 0) {
                arguments.add(this.condenseTerm(node.getText() + " = \"true\""));
            }
            return(node);
    }

    @Override
    public void enterArgument(ArgumentScriptParser.ArgumentContext ctx) {
        for(ArgumentScriptParser.PropositionContext p:ctx.proposition()) {
            //System.out.println(this.parseProp(p.getPayload()).getText());
            this.parseProp(p.getPayload()).getText();
            //System.out.println("-------------");
            //fileWriter.println(parseProp(p));
        }
    }

    @Override
    public void exitArgument(ArgumentScriptParser.ArgumentContext ctx) {
        super.exitArgument(ctx);
    }

    public void parseAsrt(ParseTree node) {

    }

    @Override
    public void enterAssertion(ArgumentScriptParser.AssertionContext ctx) {
        for(int i=0;i<ctx.getPayload().getChildCount();i++) {
            //System.out.println(ctx.getPayload().getChild(i).getText());
            if(ctx.getPayload().getChild(i).getText().equals("~")) {
                fileWriter.println("    " +
                        this.condenseTerm(ctx.getPayload().getChild(i+1).getText()) +
                        " = \"false\";");
                i++;
            } else if(ctx.getPayload().getChild(i).getText().charAt(0) == '"'){
                fileWriter.println(this.condenseTerm(ctx.getPayload().getChild(i).getText()) +
                        " = \"true\";");
            }
            //System.out.println(ctx.getChild(i).getText());
        }
    }

    @Override
    public void exitAssertion(ArgumentScriptParser.AssertionContext ctx) {
        super.exitAssertion(ctx);
    }

    @Override
    public void enterProposition(ArgumentScriptParser.PropositionContext ctx) {

    }

    @Override
    public void exitProposition(ArgumentScriptParser.PropositionContext ctx) {
        super.exitProposition(ctx);
    }
}

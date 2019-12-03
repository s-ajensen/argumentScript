import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static String file = "socrates.ars";

    public static void main(String[] args) {
        try {
            ArgumentScriptLexer lexer = new ArgumentScriptLexer(CharStreams.fromFileName(file));
            ArgumentScriptParser parser = new ArgumentScriptParser(new CommonTokenStream(lexer));
            parser.setBuildParseTree(true);
            ParseTree tree = parser.file();
            ParseTreeWalker.DEFAULT.walk(new ArgumentScriptLoader(), tree);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

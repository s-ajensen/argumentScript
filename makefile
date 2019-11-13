antlr4 := /usr/local/lib/antlr-4.7.1-complete.jar

all: ArgumentScript.g4
	java -Xmx500m -cp "$(antlr4):$CLASSPATH" org.antlr.v4.Tool ArgumentScript.g4

#gui:
#    java -Xmx500m -cp "/usr/local/lib/antlr-4.7.1-complete.jar:$CLASSPATH" org.antlr.v4.gui.TestRig ArgumentScript file -gui
#

compile: all
	javac ArgumentScript*.java

clean:
	rm ArgumentScript.interp
	rm ArgumentScriptLexer.interp
	rm ArgumentScriptLexer.java
	rm ArgumentScriptLexer.tokens
	rm ArgumentScriptListener.java
	rm ArgumentScriptParser.java
	rm ArgumentScript.tokens
	rm ArgumentScriptBaseListener.java
	rm ArgumentScriptBaseListener.class
	rm ArgumentScriptLexer.class
	rm ArgumentScriptListener.class
	rm ArgumentScriptParser.class

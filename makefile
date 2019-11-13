all: ArgumentScript.g4
	antlr4

clean:
	rm ArgumentScript.interp
	rm ArgumentScriptLexer.interp
	rm ArgumentScriptLexer.py
	rm ArgumentScriptLexer.tokens
	rm ArgumentScriptListener.py
	rm ArgumentScriptParser.py
	rm ArgumentScript.tokens

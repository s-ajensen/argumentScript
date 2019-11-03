from antlr4 import *
from ArgumentScriptLexer import ArgumentScriptLexer
from ArgumentScriptListener import ArgumentScriptListener
from ArgumentScriptParser import ArgumentScriptParser
import sys

def main():
    input_stream = StdinStream()
    lexer = ArgumentScriptLexer
    stream = CommonTokenStream(lexer)
    parser = ArgumentScriptParser(stream)
    tree = parser.startRule()

if __name__ == '__main__':
    main()

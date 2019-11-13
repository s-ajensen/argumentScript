grammar ArgumentScript;

/*
 * Parser Rules
 */

file                : definition NEWLINE* argument NEWLINE* assertion NEWLINE*;
definition          : DEFHEADER (TERM NEWLINE)+ DEFFOOTER;
argument            : ARGHEADER (OPERATOR? proposition NEWLINE)+ ARGFOOTER;
assertion           : ASRTHEADER (OPERATOR? TERM NEWLINE)+ ASRTFOOTER;
proposition         : TERM
                    | proposition OPERATOR proposition?
                    | '(' proposition ')';

/*
 * Lexer Rules
 */

TERM                : '"' [a-zA-Z ]+ '"';
DEFHEADER           : '#DEF\n';
DEFFOOTER           : '#END_DEF\n';
ARGHEADER           : '#ARG\n';
ARGFOOTER           : '#END_ARG\n';
ASRTHEADER          : '#ASRT\n';
ASRTFOOTER          : '#END_ASRT';

NEWLINE             : ('\r'? '\n' | '\r');

OPERATOR            : ('~' | '&' | '|' | '->');

WS  :   (' '|'\t')+ { skip(); };

fragment POUND      : '#';
fragment UNDERSCORE : '_';
fragment D          : 'D';
fragment E          : 'E';
fragment F          : 'F';
fragment A          : 'A';
fragment R          : 'R';
fragment G          : 'G';
fragment S          : 'S';
fragment T          : 'T';
fragment N          : 'N';
fragment DQUOTE     : '"';
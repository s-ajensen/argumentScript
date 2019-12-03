grammar ArgumentScript;

/*
 * Parser Rules
 */

file                : definition NEWLINE* argument NEWLINE* assertion NEWLINE*;
definition          : DEFHEADER NEWLINE+ (TERM NEWLINE)* DEFFOOTER NEWLINE+;
argument            : ARGHEADER NEWLINE+ (OPERATOR? proposition NEWLINE)* ARGFOOTER NEWLINE+;
assertion           : ASRTHEADER NEWLINE+ (OPERATOR? TERM NEWLINE)* ASRTFOOTER NEWLINE*;
proposition         : TERM
                    | proposition OPERATOR proposition?
                    | '(' proposition ')';

/*
 * Lexer Rules
 */

TERM                : '"' [a-zA-Z ]+ '"';
DEFHEADER           : '#DEF';
DEFFOOTER           : '#END_DEF';
ARGHEADER           : '#ARG';
ARGFOOTER           : '#END_ARG';
ASRTHEADER          : '#ASRT';
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
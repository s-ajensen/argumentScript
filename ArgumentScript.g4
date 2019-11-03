grammar ArgumentScript;

/*
 * Parser Rules
 */

file                : definition NEWLINE+ argument NEWLINE+ assertion NEWLINE*;
definition          : DEFHEADER (TERM NEWLINE)+ DEFFOOTER;
argument            : ARGHEADER (proposition NEWLINE)+ ARGFOOTER;
assertion           : ASRTHEADER (OPERATOR TERM)+ ASRTFOOTER;
proposition         : TERM
                    | proposition OPERATOR proposition
                    | '(' proposition ')';

/*
 * Lexer Rules
 */

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

DEFHEADER           : POUND D E F;
DEFFOOTER           : POUND E N D UNDERSCORE D E F;
ARGHEADER           : POUND A R G;
ARGFOOTER           : POUND E N D UNDERSCORE A R G;
ASRTHEADER          : POUND A S R T;
ASRTFOOTER          : POUND E N D UNDERSCORE A S R T;

NEWLINE             : ('\r'? '\n' | '\r');

OPERATOR            : ('~' | '&' | '|' | '->');

TERM                : '"' [a-z]+ '"';

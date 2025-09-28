grammar LogoTEC;

// Reglas de la gramática
prog:   stat+ ;

stat:   expr NEWLINE
    |   ID '=' expr NEWLINE
    ;

expr:   expr ('*'|'/') expr
    |   expr ('+'|'-') expr
    |   INT
    |   ID
    |   '(' expr ')'
    ;

// Tokens
ID  :   [a-zA-Z_][a-zA-Z_0-9]* ;
INT :   [0-9]+ ;
NEWLINE : [\r\n]+ ;
WS  :   [ \t]+ -> skip ;
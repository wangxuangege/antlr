grammar Calculator;

/** The start rule; beginparsing here. */
prog:stat+;

stat: expr NEWLINE        # printExpr
| ID '=' expr NEWLINE    # assign
| NEWLINE                # blank
;
expr:expr op=('*'|'/') expr     # MulDiv
| expr op=('+'|'-') expr        # AddSub
| INT                           # int
| ID                            # id
| '(' expr ')'                  # parens
;
ID : [a-zA-Z]+ ;
INT : [0-9]+ ;
NEWLINE:';' ;
WS : [ \t]+ -> skip ;
MUL : '*' ;
DIV : '/' ;
ADD : '+' ;
SUB : '-' ;
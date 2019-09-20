grammar Json;

json    : object
        | array
        ;

object
        : '{' pair (',' pair)* '}'  # AnObject
        | '{' '}'                   # EmptyObject // 空对象
        ;

array : '[' value (',' value)* ']'  # ArrayOfValues
      | '[' ']'                     # EmptyArray // 空数组
      ;

pair    : STRING ':' value;

value   : STRING  # String
        | NUMBER  # Atom
        | object  # ObjectValue  // 对象递归调用
        | array   # ArrayValue  // 数组递归调用
        | 'true'  # Atom  // 关键字
        | 'false' # Atom
        | 'null'  # Atom
        ;

// JSON 字符串定义
STRING  : '"' (ESC | ~["\\])* '"';
fragment ESC     : '\\' (["\\/bfnrt] | UNICODE) ;
fragment UNICODE : 'u' HEX HEX HEX HEX ;
fragment HEX     : [0-9a-fA-F] ;
// JSON 数字定义
NUMBER  : '-'? INT '.' INT EXP?  // 1.35, 1.35E-9, 0.3, -4.5
        | '-'? INT EXP          // 1e10, -3e4
        | '-'? INT              // -3, 45
        ;
fragment INT : '0' | [1-9] [0-9]* ; // 除0外的数字不允许0开始
fragment EXP :  [Ee] [+\-]? INT ; // \-是对-的转义, 因为[...] 中的-用于表达"范围"语义
// JSON 空白字符定义
WS : [ \t\n\r]+ -> skip;
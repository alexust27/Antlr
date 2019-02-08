grammar FProgram;

@header {
import main.java.expression.*;
import main.java.expression.logical.*;
import main.java.expression.arithmetic.*;
import java.util.*;
}

start returns[FProgram p]
    : program {$p = new FProgram($program.f);}
    ;


program returns[List <Function> f]
    @init {
        List<Function> res = new ArrayList<>();
    }
    :   func    { res.add($func.f); }
        (func   { res.add($func.f); }
        )*
                { $f = res; }
    ;

func returns [Function f]
    @init {
            Function res;
            LogicExpression c = null;
            }
    :   NAME COLON2     { res = new Function($NAME.text); }
        TYPE            { List<String> types = new ArrayList<>(); }
                        { types.add(new String($TYPE.text)); }
        (ARROW TYPE     { types.add(new String($TYPE.text)); }
        )*              { res.addTypes(types); }
                        { $f = res; }
    |   NAME                { res = new Function($NAME.text);           }
                            { List<String> vars = new ArrayList<>();    }
        (var                { vars.add($var.v);     }
        )*                  { res.addVars(vars);        }
        (                   { c = null; }
            (PIPE or            { c = $or.v; }
                )?
            ASSIGN add_sub      { res.addFunc(c, $add_sub.v); }
        )+                  { $f = res; }
    ;

var returns [String v]
    :NUM        { $v = $NUM.text; }
    |NAME       { $v = $NAME.text; }
    ;

add_sub returns [ArithmeticExpression v]
    :   l = add_sub ADD r = mul_div   { $v = new BinaryArithmeticExpression("+", $l.v, $r.v); }
    |   l = add_sub SUB r = mul_div   { $v = new BinaryArithmeticExpression("-", $l.v, $r.v); }
    |   mul_div                       { $v = $mul_div.v; }
    ;

mul_div returns [ArithmeticExpression v]
    :   l = mul_div MUL unary_ar   { $v = new BinaryArithmeticExpression("*", $l.v, $unary_ar.v); }
    |   l = mul_div DIV unary_ar   { $v = new BinaryArithmeticExpression("/", $l.v, $unary_ar.v); }
    |   l = mul_div MOD unary_ar   { $v = new BinaryArithmeticExpression("%", $l.v, $unary_ar.v); }
    |   unary_ar                   { $v = $unary_ar.v; }
    ;

unary_ar returns [ArithmeticExpression v]
    :   LPAR add_sub RPAR          { $v = $add_sub.v; }
    |   NAME                       { $v = new Variable($NAME.text); }
    |   NAME                       { List<ArithmeticExpression> ae = new ArrayList(); }
    LPAR add_sub                   { ae.add($add_sub.v); }
    (COMMA add_sub                 { ae.add($add_sub.v); }
    )* RPAR                        { $v = new Func($NAME.text, ae); }
    |   NUM                        { $v = new Num($NUM.text); }
    ;


or returns [LogicExpression v]
    :   l = or OR and       { $v = new BinaryLogicExpression("||", $l.v, $and.v); }
    |   and                 { $v = $and.v; }
    ;

and returns [LogicExpression v]
    :   l = and AND unary_logic     { $v = new BinaryLogicExpression("&&", $l.v, $unary_logic.v); }
    |   unary_logic                 { $v = $unary_logic.v; }
    ;

unary_logic returns [LogicExpression v]
    :   NOT unary_logic         { $v = new Negation($unary_logic.v); }
    |   cmp                     { $v = $cmp.v; }
    |   LPAR or RPAR            { $v = $or.v; }
    ;

cmp returns [LogicExpression v]
    :   l = add_sub cmp_op r = add_sub {$v = new CmpExpression($cmp_op.v, $l.v, $r.v); }
    |   NAME                           {$v = new LogicVar($NAME.text); }
    ;

cmp_op returns [String v]
    :   EQ      { $v = "=="; }
    |   NEQ     { $v = "!="; }
    |   LESS    { $v = "<"; }
    |   GR      { $v = ">"; }
    |   LESSEQ  { $v = "<="; }
    |   GREQ    { $v = ">="; }
    ;


TYPE    : 'String' | 'Integer' | 'Char' | 'Boolean';
ASSIGN  : '=';
LPAR    : '(';
RPAR    : ')';
COLON2  : '::';
PIPE    : '|';
COMMA   : ',';

ADD : '+';
SUB : '-';
MUL : '*';
DIV : '/';
MOD : '%';

EQ : '==';
NEQ : '!=';
LESS : '<';
GR : '>';
LESSEQ : '<=';
GREQ : '>=';
ARROW : '->';


NOT : '!';
AND : '&&';
OR : '||';

NAME : ('a'..'z' | 'A'..'Z') ('a'..'z' | 'A'..'Z' | '0'..'9')*;
NUM : ('-'? ('1'..'9')('0'..'9')*) | '0';

NEWLINE
   : NL+ -> skip;

WS
   :  WhiteSpace+ -> skip;

WhiteSpace
    : '\t' | ' ';

NL
    : '\n' | '\r';

//COMMENT
//   :   '/*' .*? '*/' -> skip;
//
//LINE_COMMENT
//   :   '//' (~[\r\n])* -> skip;
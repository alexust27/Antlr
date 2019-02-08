Функциональный язык
---
Примитивный функциональный язык
программирования и его трансляция в императивный
язык, используя генератор нисходящих анализаторов ANTLR

Пример:
```
fac :: Integer -> Integer
fac 0 = 1
fac n | n > 0 = n * fac(n - 1)
```
Вывод:
```
int fac(int n) {
       if (n == 0) return 1;
       if (n > 0) {
          return (n * fac((n - 1)));
       }
   }
```

### Токены
Строка                  | Токен | Строка            | Токен |
:----:                  | :---: | ------            | ----- |
\[a-zA-Z\]\[a-zA-Z0-9\]*| VAR   | *                 | MUL   |
-?[1-9][0-9]*&#124;0    | NUM   | /                 | DIV   |
+                       | ADD   | -                 | SUB   |
->                      | ARROW | ::                | COLON2|
(                       | LPAR  | )                 | RPAR  |
==                      | EQ    | !=                | NEQ   |
<                       | LESS  |  \>               | GR    |
=                       | ASSIGN| <=                | LESSEQ|
\>=                     | GREQ  |!                  | NOT   | 
&&                      | AND   |  &#124;&#124;     | OR    |
&#124;                  | PIPE  | ,                 | COMMA |
String &#124; Integer &#124; Char &#124; Boolean    | TYPE


## Грамматика
    start -> program
    
    program -> func (func)*
    
    func -> NAME COLON2 TYPE (ARROW TYPE )*
        |   NAME (var)* ((PIPE or)? ASSIGN add_sub)+
        
    add_sub -> add_sub ADD mul_div
             | add_sub SUB mul_div
             | mul_div
             
    mul_div -> mul_div MUL unary_ar
             | mul_div DIV unary_ar
             | mul_div MOD unary_ar
             | unary_ar
    
    unary_ar -> VAR
              | NUM
              | NAME LPAR add_sub (COMMA add_sub)* RPAR
              | LPAR add_sub RPAR
              
    or -> or OR and
        | and
        
    and -> and AND unary_logic
         | unary_logic
         
    unary_logic -> NOT unary_logic
                 | cmp
                 | LPAR or RPAR
                 
    cmp -> add_sub cmp_op add_sub
         | NAME
    
    cmp_op -> EQ
            | NEQ
            | LESS
            | GR
            | LESSEQ
            | GREQ

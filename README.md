# Toy

a script language implemented by java.

## BNF

```
primary : "(" expr ")" | NUMBER | IDENTIFIER | STRING

factor  : "-" primary | primary

expr    : factor { OP factor }

block   : "{" [statement] { (";" | EOL) [ statement ] } "}"

simple  : expr

statement : "if" expr block [ "else" block ]
          | "while" expr block
          |simple

program : [ statement ] (";" | EOL )

```
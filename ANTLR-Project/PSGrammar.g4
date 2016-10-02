grammar PSGrammar;		
init:	(sp)* p;
//definicion de las funciones
sp: S U B P R O C E S O (ID TOKEN_ASIG)? ID(TOKEN_PAR_IZR (ID (TOKEN_COMA ID)*)? TOKEN_PAR_DER)? command end_sp;
end_sp: F I N S U B P R O C E S O| F I N F U N C I O N;
p: MAIN_BEGIN ID command MAIN_END ;
MAIN_BEGIN: P R O C E S O | A L G O R I T M O;
MAIN_END: F I N P R O C E S O | F I N A L G O R I T M O;
//definicion de los comandos
command:  definition TOKEN_PYC (command)*
		| ID (command_opt)? TOKEN_PYC (command)*;
		
command_opt: (array_pos)? TOKEN_ASIG exp|opt_args;
opt_args: TOKEN_PAR_IZR (args)? TOKEN_PAR_DER;
args: exp (TOKEN_COMA exp)*;
array_pos: TOKEN_COR_IZR exp_num (TOKEN_COMA exp_num)* TOKEN_COR_DER;
definition: D E F I N I R ID (TOKEN_COMA ID)* C O M O TIPO;


//definicion expresiones
exp: b_term (TOKEN_O b_term)*;
b_term: not_factor (TOKEN_Y not_factor)*;
not_factor: TOKEN_NEG b_factor | b_factor;
b_factor: exp_num (rel_opt exp_num)*;
rel_opt: TOKEN_IGUAL | TOKEN_DIF | TOKEN_MAYOR| TOKEN_MAYOR_IGUAL | TOKEN_MENOR | TOKEN_MENOR_IGUAL;
exp_num: term (TOKEN_MOD term)*;
term: mod_term (sum_opt mod_term)*;
sum_opt: TOKEN_MAS | TOKEN_MENOS;
mod_term: signed_factor (mul_opt signed_factor)*;
mul_opt: TOKEN_MUL | TOKEN_DIV;
signed_factor: sum_opt s_term | s_term;
s_term: factor (TOKEN_POT factor)*;
factor: TOKEN_CADENA | TOKEN_REAL | TOKEN_ENTERO | VERDADERO | FALSO | TOKEN_PAR_IZR exp TOKEN_PAR_DER
		| ID (opt_complement)?;
opt_complement: opt_args | array_pos;


/*
C -> READ token_pyc C
C -> WRITE token_pyc C
C -> DIM token_pyc C
C -> IF C
C -> FOR C
C -> WHILE C
C -> DOWHILE C
C -> SWITCH C
C -> WAIT token_pyc C
C -> CLEAR token_pyc C

IF -> si E entonces C END_IF
END_IF -> finsi
END_IF -> sino C finsi
FOR -> para id token_asig E hasta EXP_NUM OPT_FOR hacer C finpara
OPT_FOR -> con paso EXP_NUM
OPT_FOR -> epsilon
WHILE -> mientras E hacer C finmientras
DOWHILE -> repetir C hasta que E
SWITCH -> segun EXP_NUM hacer OPT_CASE OPT_DEFAULT finsegun
OPT_CASE -> caso EXP_NUM token_dosp C OPT_CASE
OPT_CASE -> epsilon
OPT_DEFAULT -> epsilon
OPT_DEFAULT -> de otro modo token_dosp C
WAIT -> esperar WAIT_TYPE
WAIT_TYPE -> tecla
WAIT_TYPE -> EXP_NUM UNITY
UNITY -> segundos
UNITY -> milisegundos
CLEAR -> borrar SCREEN
CLEAR -> limpiar SCREEN
SCREEN -> pantalla
DIM -> dimension DEF_DIM
DEF_DIM -> id ARRAY_PARAMS DEF_DIM_LIST
ARRAY_PARAMS -> token_cor_izq EXP_NUM EXP_NUM_LIST token_cor_der
DEF_DIM_LIST -> epsilon
DEF_DIM_LIST -> token_coma DEF_DIM DEF_DIM_LIST
EXP_NUM_LIST -> epsilon
EXP_NUM_LIST -> token_coma EXP_NUM EXP_NUM_LIST
READ -> leer id ARRAY_POS
WRITE -> escribir E E_LIST
E_LIST -> token_coma E E_LIST
E_LIST -> epsilon


*/

//tokens
TIPO: 'entero'|'real'|'numero'|'numerico'|'texto'|'cadena'|'caracter'|'logico';
ID: [a-zA-Z]+[_0-9a-zA-Z]*;
TOKEN_ASIG: '<-';
TOKEN_IGUAL: '=';
TOKEN_DIF: '<>';
TOKEN_MAYOR: '>';
TOKEN_MAYOR_IGUAL: '>=';
TOKEN_MENOR: '<';
TOKEN_MENOR_IGUAL: '<=';
TOKEN_PAR_IZR: '(';
TOKEN_PAR_DER: ')';
TOKEN_COR_IZR: '[';
TOKEN_COR_DER: ']';
TOKEN_COMA : ',';
TOKEN_PYC : ';';
TOKEN_MUL : '*';
TOKEN_DIV : '/';
TOKEN_MAS : '+';
TOKEN_MENOS : '-';
TOKEN_POT : '^';
TOKEN_MOD : '%';
TOKEN_Y : '&'|'y';
TOKEN_O : '|'|'o';
TOKEN_DOSP : ':';
TOKEN_NEG : '~'|'no';
TOKEN_CADENA : [\"\'].*[\"\'];
TOKEN_REAL : [0-9]+[.][0-9]+;
TOKEN_ENTERO : [0-9]+;
VERDADERO : 'verdadero';
FALSO: 'falso';
WS: [ \t\n\r]->skip;


//definion del abecedario
A:('a'|'A');
B:('b'|'B');
C:('c'|'C');
D:('d'|'D');
E:('e'|'E');
F:('f'|'F');
G:('g'|'G');
H:('h'|'H');
I:('i'|'I');
J:('j'|'J');
K:('k'|'K');
L:('l'|'L');
M:('m'|'M');
N:('n'|'N');
O:('o'|'O');
P:('p'|'P');
Q:('q'|'Q');
R:('r'|'R');
S:('s'|'S');
T:('t'|'T');
U:('u'|'U');
V:('v'|'V');
W:('w'|'W');
X:('x'|'X');
Y:('y'|'Y');
Z:('z'|'Z');
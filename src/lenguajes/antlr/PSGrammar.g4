grammar PSGrammar;		
init				: (sp)* p;

//definicion de las funciones
sp					: (SUBPROCESO | FUNCION) (ID TOKEN_ASIG)? ID(TOKEN_PAR_IZR (ID (TOKEN_COMA ID)*)? TOKEN_PAR_DER)? 
						command end_sp;
end_sp				: FINSUBPROCESO | FINFUNCION;
p					: main_begin ID command main_end ;
main_begin			: PROCESO | ALGORITMO;
main_end			: FINPROCESO | FINALGORITMO;

//definicion de los comandos
command				: definition TOKEN_PYC command 			#continue1
					| ID (command_opt)? TOKEN_PYC command   #continueID
					| read TOKEN_PYC command				#continue2
					| write TOKEN_PYC command				#continue3
					| dim TOKEN_PYC command					#continue4
					| if_sentence command					#continue5
					| for_sentence command					#continue6
					| while_sentence command				#continue7
					| dowhile_sentence command				#continue8
					| switch_sentence command				#continue9
					| wait_sentence TOKEN_PYC command		#continue10
					| clear TOKEN_PYC command				#continue11
					|										#continue12
					;
if_sentence			: SI exp ENTONCES command end_if;
end_if				: FINSI | SINO command FINSI;
for_sentence		: PARA ID TOKEN_ASIG exp HASTA exp_num (CON PASO exp_num)? HACER command FINPARA;
while_sentence		: MIENTRAS exp HACER command FINMIENTRAS;
dowhile_sentence	: REPETIR command HASTA QUE exp;
switch_sentence		: SEGUN exp_num HACER case_sentence default_case FINSEGUN;
case_sentence		: CASO exp_num TOKEN_DOSP command case_sentence |;
default_case		: DE OTRO MODO TOKEN_DOSP command |;
wait_sentence		: ESPERAR wait_type;
wait_type			: TECLA | exp_num unity;
unity				: SEGUNDOS | MILISEGUNDOS;
clear				: BORRAR PANTALLA | LIMPIAR PANTALLA;
dim					: DIMENSION def_dim;
def_dim				: ID (array_pos)+ def_dim_list;
def_dim_list		: TOKEN_COMA def_dim def_dim_list|;
read				: LEER ID array_pos;
write				: ESCRIBIR exp (TOKEN_COMA exp)*;
command_opt			: (array_pos)* TOKEN_ASIG exp 									#alloc
					| opt_args 														#functionCall;
opt_args			: TOKEN_PAR_IZR args TOKEN_PAR_DER;
args				: exp (TOKEN_COMA exp)* |;
array_pos			: TOKEN_COR_IZR exp_num (TOKEN_COMA exp_num)* TOKEN_COR_DER;
definition			: DEFINIR ID (TOKEN_COMA ID)* COMO tipo;


//definicion expresiones
exp					: exp token_o b_term 											#or_operation
					| b_term														#exp_single;
b_term				: b_term token_y eq_factor										#and_operation
					| eq_factor														#b_term_single;
eq_factor			: b_factor dif_opt b_factor										#equals_operation
					| b_factor 														#eq_factor_single;
dif_opt				: TOKEN_IGUAL | TOKEN_DIF;	
b_factor			: exp_num rel_opt exp_num										#rel_operation
					| exp_num														#b_factor_single;
rel_opt				: TOKEN_MAYOR| TOKEN_MAYOR_IGUAL | TOKEN_MENOR | TOKEN_MENOR_IGUAL;
exp_num				: exp_num sum_opt mod_term										#sum_operation
					| mod_term														#exp_num_single;
sum_opt				: TOKEN_MAS | TOKEN_MENOS;
mod_term			: mod_term mul_opt s_term										#mul_mod_operation
					| s_term														#mod_term_single;
mul_opt				: TOKEN_MUL | TOKEN_DIV | token_mod;
s_term				: s_term TOKEN_POT not_factor									#pot_operation
					| not_factor													#s_term_single;
not_factor			: token_neg not_factor 											#negation_operation
					| factor														#not_factor_single;
factor				: TOKEN_CADENA | TOKEN_REAL | TOKEN_ENTERO | VERDADERO | FALSO 
					| TOKEN_PAR_IZR exp TOKEN_PAR_DER | ID (opt_complement)?;
opt_complement		: opt_args #continue| (array_pos)+ #array_call;

//palabras reservadas
SUBPROCESO			: S U B P R O C E S O;
FINSUBPROCESO		: F I N S U B P R O C E S O;
FUNCION				: F U N C I O N;
FINFUNCION			: F I N F U N C I O N;
PROCESO				: P R O C E S O;
ALGORITMO			: A L G O R I T M O;
FINPROCESO			: F I N P R O C E S O;
FINALGORITMO		: F I N A L G O R I T M O;
SI					: S I;
ENTONCES			: E N T O N C E S;
FINSI				: F I N S I;
SINO				: S I N O;
PARA				: P A R A;
HASTA				: H A S T A;
CON					: C O N;
PASO				: P A S O;
FINPARA				: F I N P A R A;
HACER				: H A C E R;
MIENTRAS			: M I E N T R A S;
FINMIENTRAS			: F I N M I E N T R A S;
REPETIR				: R E P E T I R;
QUE					: Q U E;
SEGUN				: S E G U N;
CASO				: C A S O;
DE					: D E;
OTRO				: O T R O;
MODO				: M O D O;
ESPERAR				: E S P E R A R;
TECLA				: T E C L A;
SEGUNDOS			: S E G U N D O S;
MILISEGUNDOS		: M I L I S E G U N D O S;
BORRAR				: B O R R A R;
LIMPIAR				: L I M P I A R;
PANTALLA			: P A N T A L L A;
DIMENSION			: D I M E N S I O N;
LEER				: L E E R;
ESCRIBIR			: E S C R I B I R;
DEFINIR				: D E F I N I R;
COMO				: C O M O;
FINSEGUN			: F I N S E G U N;
VERDADERO			: V E R D A D E R O;
FALSO				: F A L S O;
ENTERO				: E N T E R O;
REAL				: R E A L;
NUMERO				: N U M E R O;
NUMERICO			: N U M E R I C O;
TEXTO				: T E X T O;
CADENA				: C A D E N A;
CARACTER			: C A R A C T E R;
LOGICO				: L O G I C O;

//tokens
tipo				: ENTERO | REAL | NUMERO | NUMERICO | TEXTO | CADENA | CARACTER | LOGICO;
ID					: [a-zA-Z]+[_0-9a-zA-Z]*;
TOKEN_ASIG			: '<-';
TOKEN_IGUAL			: '=';
TOKEN_DIF			: '<>';
TOKEN_MAYOR			: '>';
TOKEN_MAYOR_IGUAL	: '>=';
TOKEN_MENOR			: '<';
TOKEN_MENOR_IGUAL	: '<=';
TOKEN_PAR_IZR		: '(';
TOKEN_PAR_DER		: ')';
TOKEN_COR_IZR		: '[';
TOKEN_COR_DER		: ']';
TOKEN_COMA 			: ',';
TOKEN_PYC 			: ';';
TOKEN_MUL 			: '*';
TOKEN_DIV 			: '/';
TOKEN_MAS 			: '+';
TOKEN_MENOS 		: '-';
TOKEN_POT 			: '^';
token_mod 			: '%'|'mod';
token_y 			: '&'|'y';
token_o 			: '|'|'o';
TOKEN_DOSP 			: ':';
token_neg 			: '~'|'no';
TOKEN_CADENA 		: ('"'|'\'')~('\r'|'\n'|'"')*('"'|'\'');
TOKEN_REAL 			: [0-9]+[.][0-9]+;
TOKEN_ENTERO 		: [0-9]+;
WS					: [ \t\n\r]->skip;
LINE_COMMENT 		: '//' ~[\r\n]* -> skip ;


//definion del abecedario
fragment A:('a'|'A');
fragment B:('b'|'B');
fragment C:('c'|'C');
fragment D:('d'|'D');
fragment E:('e'|'E');
fragment F:('f'|'F');
fragment G:('g'|'G');
fragment H:('h'|'H');
fragment I:('i'|'I');
fragment J:('j'|'J');
fragment K:('k'|'K');
fragment L:('l'|'L');
fragment M:('m'|'M');
fragment N:('n'|'N');
fragment O:('o'|'O');
fragment P:('p'|'P');
fragment Q:('q'|'Q');
fragment R:('r'|'R');
fragment S:('s'|'S');
fragment T:('t'|'T');
fragment U:('u'|'U');
fragment V:('v'|'V');
fragment W:('w'|'W');
fragment X:('x'|'X');
fragment Y:('y'|'Y');
fragment Z:('z'|'Z');
grammar Neo4J;		
init				:  (create)*|(select_sentence)*;

select_sentence				: MATCH node_def opt_where RETURN exp (TOKEN_COMA exp)* (TOKEN_FIN_LINEA|);
opt_where					: WHERE exp (TOKEN_COMA exp)*
							|;
create                      : CREATE opt_create (TOKEN_FIN_LINEA|);
opt_create					: node_def (TOKEN_COMA node_def)*								#create_multiple
							| relation_def (TOKEN_COMA relation_def)*						#create_relation;
							//(n:Node{name:"mike"})-->(m:Node{name:"john"})
relation_def				: node_def relation_type node_def;
relation_type				: TOKEN_RELATION												#simple_relation //--
							| TOKEN_DIRECTED_RELATION										#directed_relation //-->
							| TOKEN_MENOS TOKEN_COR_IZR (TOKEN_DOSP LABEL)? TOKEN_COR_DER TOKEN_MENOS (TOKEN_MAYOR)+	#complex_relation;
							
							//(definition)
node_def					: TOKEN_PAR_IZR definition TOKEN_PAR_DER;
							//n : Nodo props_list
definition					: ID TOKEN_DOSP LABEL (props_list)?; 
							//{name : 15*3, year:"1993"}
props_list					: TOKEN_LLAVE_IZR prop (TOKEN_COMA prop)* TOKEN_LLAVE_DER;
prop						: ID TOKEN_DOSP exp												#property
							| ID rel_opt exp												#query_cond;

//definicion expresiones
exp							: exp token_o b_term 											#or_operation
							| exp TOKEN_XOR b_term 											#xor_operation
							| b_term														#exp_single;
b_term						: b_term token_y eq_factor										#and_operation
							| eq_factor														#b_term_single;
eq_factor					: b_factor dif_opt b_factor										#equals_operation
							| b_factor 														#eq_factor_single;
dif_opt						: TOKEN_IGUAL | TOKEN_DIF;	
b_factor					: exp_num rel_opt exp_num										#rel_operation
							| exp_num														#b_factor_single;
rel_opt						: TOKEN_MAYOR| TOKEN_MAYOR_IGUAL | TOKEN_MENOR | TOKEN_MENOR_IGUAL | TOKEN_IGUAL | TOKEN_REGEX;
exp_num						: exp_num sum_opt mod_term										#sum_operation
							| mod_term														#exp_num_single;
sum_opt						: TOKEN_MAS | TOKEN_MENOS;
mod_term					: mod_term mul_opt s_term										#mul_mod_operation
							| s_term														#mod_term_single;
mul_opt						: TOKEN_MUL | TOKEN_DIV | token_mod;
s_term						: s_term TOKEN_POT not_factor									#pot_operation
							| not_factor													#s_term_single;
not_factor					: token_neg not_factor 											#negation_operation
							| factor														#not_factor_single;
factor						: TOKEN_CADENA | TOKEN_REAL | TOKEN_ENTERO | TRUE | FALSE 
							| TOKEN_PAR_IZR exp TOKEN_PAR_DER | ID TOKEN_PUNTO ID| function_sentence TOKEN_PAR_IZR exp TOKEN_PAR_DER;
function_sentence			: AVG | COUNT | SUM | MAX | MIN | DISTINCT;
//palabras reservadas
MATCH						: M A T C H;
CREATE						: C R E A T E;
RETURN						: R E T U R N;
AVG							: A V G;
SUM							: S U M;
DISTINCT 					: D I S T I N C T;
MAX							: M A X;
MIN							: M I N;
WITH						: W I T H;
OPTIONAL					: O P T I O N A L;
OR							: O R;
NOT							: N O T;
EXISTS						: E X I S T S;
HAS							: H A S;
STARTS						: S T A R T S;
ENDS						: E N D S;
TRUE						: T R U E;
FALSE						: F A L S E;
CONTAINS					: C O N T A I N S;
WHERE						: W H E R E;
IN							: I N;
COUNT						: C O U N T;
relationship_rels			: RELATIONSHIP TOKEN_DOSP RELS;
RELS						: R E L S;
RELATIONSHIP			    : R E L A T I O N S H I P;
node_nodes					: NODE TOKEN_DOSP NODES;
NODE						: N O D E;
NODES						: N O D E S;
PROPS						: P R O P S;
INDEX						: I N D E X;
ON							: O N;
SET							: S E T;
DETACH						: D E T A C H;
DELETE						: D E L E T E;
REMOVE						: R E M O V E;
ORDER						: O R D E R;
BY							: B Y;
DESC						: D E S C;
ASC							: A S C;
LENGHT						: L E N G T H;
LIMIT						: L I M I T; 
SKIP_TOKEN					: S K I P;
RAND						: R A N D;
DROP						: D R O P;
//tokens
ID							: [a-z]+[_0-9a-zA-Z]*;
LABEL						: [A-Z]+[_0-9a-zA-Z]*;
TOKEN_IGUAL					: '=';
TOKEN_REGEX					: '~=';
TOKEN_AGREGAR				: '+=';
TOKEN_DIF					: '!=';
TOKEN_MAYOR					: '>';
TOKEN_MAYOR_IGUAL			: '>=';
TOKEN_MENOR					: '<';
TOKEN_MENOR_IGUAL			: '<=';
TOKEN_PAR_IZR				: '(';
TOKEN_PAR_DER				: ')';
TOKEN_COR_IZR				: '[';
TOKEN_COR_DER				: ']';
TOKEN_LLAVE_IZR				: '{';
TOKEN_LLAVE_DER				: '}';
TOKEN_COMA 					: ',';
TOKEN_PYC 					: ';';
TOKEN_FIN_LINEA				: '\n';
TOKEN_MUL 					: '*';
TOKEN_DIV 					: '/';
TOKEN_MAS 					: '+';
TOKEN_MENOS 				: '-';
TOKEN_RELATION 				: '--';
TOKEN_DIRECTED_RELATION 	: '-->';
TOKEN_POT 					: '^';
TOKEN_PUNTO					: '.';
token_mod 					: '%';
token_y 					: '&';
token_o 					: '|' | OR;
TOKEN_XOR 					: X O R;
TOKEN_DOSP 					: ':';
token_neg 					: '~' | NOT;
TOKEN_CADENA 				: ('"'|'\'')~('\r'|'\n'|'"')*('"'|'\'');
TOKEN_REAL 					: [0-9]+[.][0-9]+;
TOKEN_ENTERO 				: [0-9]+;
WS							: [ \t\r]->skip;
LINE_COMMENT 				: '//' ~[\r\n]* -> skip ;


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
lexer grammar gPseudocodigoLexer;

//KEYWORDS FUNCIONES
//Keywords prog
FIN: ('FinProceso'|'FinAlgoritmo') .*?;
INI: (('Proceso'|'Algoritmo')) ;
//Keywords definicion
DEFINIR:([Dd][Ee][Ff][Ii][Nn][Ii][Rr]);
COMO: ('Como'|'COMO'|'como') ;
//Keywords asignacion
FLECHA:'<-';
//Keywords Creacion de arrays
DIMENSION:([Dd][Ii][Mm][Ee][Nn][Ss][Ii][Oo][Nn]);
//Keywords leer
LEER:('Leer'|'LEER'|'leer');
//Keywords escribir
ESCRIBIR:('Escribir'|'ESCRIBIR'|'escribir');
//Keywords Condicionales
CIERRASI: ('Finsi'|'FINSI'|'finsi'|'FinSi'|'Fin Si');
SINO: ('Sino'|'SINO'|'sino'|'SiNo');
ENTONCES: ('Entonces'|'ENTONCES'|'entonces');
SI: ('Si'|'SI'|'si');
//Keywords switch
DEOTROMODO:'De Otro Modo'|'de otro modo'|'DE OTRO MODO';
FINSEGUN:('Finsegun'|'FINSEGUN'|'finsegun'|'FinSegun');
SEGUN:('Segun'|'segun'|'SEGUN');
HACER:('Hacer'|'hacer'|'HACER');
//Keywords mientras
FINMIENTRAS:('Finmientras'|'FINMIENTRAS'|'finmientras'|'FinMientras'|'Fin Mientras');
MIENTRAS:('Mientras'|'mientras'|'MIENTRAS');
//Keywords for
REPETIR:('Repetir'|'REPETIR'|'repetir');
HASTAQUE:('Hasta Que'|'HASTA QUE'|'hasta que');
//Keywords lazospara
FINPARA:('FinPara'|'FINPARA'|'finpara');
PARA:('Para'|'PARA'|'para');
HASTA:('Hasta'|'HASTA'|'hasta');
CONPASO: ('Con Paso'|'con paso'|'CON PASO'|'CON paso'|'con PASO') ;

//Keywords deffuncion
FUNCION:('Funcion'|'FUNCION'|'funcion');
FINFUNCION:('FinFuncion'|'FINFUNCION'|'finfuncion'|'Fin Funcion');


//Operadores:
//OPERADORREL  
MAYORQUE:'>';
MENORQUE:'<';
IGUALQUE:'=';
MENORIGUALQUE:'<=';
MAYORIGUALQUE:'>=';

//OPERADORLOG
CONJUNCION:'&'|'Y';
DISYUNCION:'|'|'O';
NEGACION:'~'|'NO';

//OPERADORALGE
 SUMA:'+';
 RESTA:'-';
 MULTIPLICACION:'*';
 DIVISION:'/';
 POTENCIACION:'^';
 MODULO:'%'|'MOD';

 //OPERADORSEPARADOR

COMA:',';
BARRABAJA:'_';

//KEYWORDS OPERADORES
//Keywords funciones
RC:('RC'|'rc');
ABS:('ABS'|'abs');
LN:('LN'|'ln');
EXP:('EXP'|'exp');
SEN:('SEN'|'sen');
COS:('COS'|'cos');
ATAN:('ATAN'|'atan');
TRUNC:('TRUNC'|'trunc');
REDON:('REDON'|'redon');
AZAR:('AZAR'|'azar');

//Tipos de variables
TIPO:'Entero'|'Real'|'Caracter'|'Logico'|'Cadena' ;
FLOAT:INT '.' INT;
INT:DIGITO+;
fragment DIGITO:[0-9];

BOOL:'TRUE'|'FALSE';
STRING: ('\''|'"') (ESC|.)*? ('\''|'"');
fragment ESC: '\\'[btnr"\\];    //escapar \b \t \n \r \" \\

PI:'(';
PD:')';
CI:'[';
CD:']';
DOSPUNTOS:':';
PUNTOCOMA:';';

//Simbolos terminales
ID:CHAR(CHAR|INT|[_])*;
fragment CHAR:[a-zA-Z];





//Comentarios
COMENTARIO_LINEA: '//' .*? '\n' ;
COMENTARIO_BLOQUE:'/*' .*? '*/' ;

//Espacios en blanco tabuladores.... 

//Siempre al final 
WS: [ \t\r\n]+ ->skip;
//Salto de Linea
NEWLINE : [\r\n];
//Adicionales
SPACE:' '+;
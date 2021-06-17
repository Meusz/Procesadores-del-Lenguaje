parser grammar gPseudocodigoParser;
options{
    tokenVocab = gPseudocodigoLexer;
    language = Java;
} 
//Regla principal

prog: 
    (main|comentario|deffuncion)*
;

main:kwinicio
    (instrucciones|comentario)* 
    kwfin;


//Funciones del sistema
instrucciones: (expr|condicional|asignacion|entrada|salidas|dimensionamiento|seleccionmultiple|mientras|repetir|lazospara|definir)puntoycoma?;
 
//Definir
definir: kwdefinir id(coma id)* kwcomo tipo;

//Asignacion
asignacion: id kwflecha expr |
    expr igual expr; 


//Entrada de datos
entrada: kwleer id;

//Salida de datos
salidas: kwescribir expr;

//Creacion de Arrays
dimensionamiento: kwdimension id array|
id ci expr cd kwflecha (id ci expr cd|string);


//Condicionales   
condicional:
    si (instrucciones|comentario)*
    (sino (instrucciones|comentario)*)*
    kwcierrasi;

sino:kwsino si?;
si:kwsi exprlogica kwentonces? ;

//seleccion multiple
seleccionmultiple:
    kwsegun id kwhacer
    instruccion+
    deotromodo
    kwfinsegun
;

instruccion: valor (instrucciones|comentario)* ;
valor:expr dospuntos;
deotromodo:kwdeotromodo  (instrucciones|comentario)*;

//Whiles
mientras: kwmientras (exprlogica)+ kwhacer? (instrucciones|comentario)* kwfinmientras;


//For
repetir: kwrepetir (instrucciones)* hastaque;

hastaque:kwhastaque exprlogica;

//Lazos Para
lazospara: kwpara id kwflecha entero kwhasta (entero|id) ( pi kwconpaso entero pd | kwconpaso entero )? kwhacer (instrucciones|comentario)* kwfinpara;


//Definir Funcion
deffuncion:kwfuncion retorno kwflecha cabecera (instrucciones| comentario)+ kwfinfuncion|
kwfuncion cabecera instrucciones+ kwfinfuncion;

cabecera: id pi (argumentos (coma argumentos)*)? pd;

//tipo de la variable de retorno
retorno: id;




exprlogica:
    pi exprlogica pd
    |   exprlogica operadorlog exprlogica 
    |   negacion exprlogica
    |	expr operadorrel expr
    ;

//expresiones
expr:	
    invocafuncion
    | expr operadoralge expr
    |   expr operadorseparador expr
    |   funciones pi expr pd
    |   array
    |   entero
    |   real
    |   bool
    |   string
    |   id
    |	pi expr pd
    ;











//KEYWORDS OPERADORES
//Keywords funciones







//Arrays
array: 
    id ci expr(coma expr)* cd
|    id pi expr(coma expr)* pd
|   pi expr(coma expr)* pd
|   ci expr(coma expr)* cd;
//KEYWORDS FUNCIONES
//Keywords prog

kwinicio: kwini id;
kwfin:FIN;
kwini:INI;
//Keywords definicion
kwdefinir:DEFINIR;
kwcomo:COMO;
//Keywords asignacion
kwflecha:FLECHA;
//Keywords Creacion de arrays
kwdimension:DIMENSION;
//Keywords leer
kwleer:LEER;
//Keywords escribir
kwescribir:ESCRIBIR;
//Keywords Condicionales
kwcierrasi:CIERRASI;
kwsino:SINO;
kwentonces:ENTONCES;
kwsi:SI;
//Keywords switch
kwdeotromodo:DEOTROMODO dospuntos;
kwfinsegun: FINSEGUN;
kwsegun:SEGUN;
kwhacer:HACER;
//Keywords mientras
kwfinmientras:FINMIENTRAS;
kwmientras:MIENTRAS;
//Keywords for
kwrepetir:REPETIR;
kwhastaque:HASTAQUE;
//Keywords lazospara
kwfinpara:FINPARA;
kwpara:PARA;
kwhasta:HASTA;
kwconpaso: CONPASO;
//keywords funcion
kwfuncion:FUNCION;
invocafuncion:id pi (argumentos (coma argumentos)*)? pd;
argumentos:id|invocafuncion|expr;
kwfinfuncion:FINFUNCION;
//Operadores:
operadorrel:MAYORQUE
    |   MENORQUE
    |   IGUALQUE
    |   MENORIGUALQUE
    |   MAYORIGUALQUE;


operadorlog:
    conjuncion
    |   disyuncion
    ;
conjuncion:CONJUNCION;
disyuncion:DISYUNCION;
negacion:NEGACION;

operadoralge:
    suma
    |   resta
    |   multiplicacion
    |   division
    |   potenciacion
    |   modulo
    ;
igual:IGUALQUE;
suma:SUMA;
resta:RESTA;
multiplicacion:MULTIPLICACION;
division:DIVISION;
potenciacion:POTENCIACION;
modulo:MODULO;

operadorseparador:
    coma
    |   barrabaja;

coma:COMA;
barrabaja:BARRABAJA;

//Keywords funciones
funciones:
    rc
    |   abs
    |   ln
    |   exp
    |   sen
    |   cos
    |   atan
    |   trunc
    |   redon
    |   azar
    ;
rc:RC;
abs:ABS;
ln:LN;
exp:EXP;
sen:SEN;
cos:COS;
atan:ATAN;
trunc:TRUNC;
redon:REDON;
azar:AZAR;

//Tipos de variables
tipo:TIPO;
real:FLOAT;
entero:INT;
bool:BOOL;
string:STRING;
id:ID;

comentario:COMENTARIO_BLOQUE|COMENTARIO_LINEA;

dospuntos: DOSPUNTOS;
pi:PI;
pd:PD;
ci:CI;
cd:CD;
puntoycoma:PUNTOCOMA;
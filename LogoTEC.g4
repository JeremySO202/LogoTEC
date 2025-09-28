grammar LogoTEC;

// ============================================
// REGLAS DEL PARSER (Parser Rules)
// ============================================

// Regla principal
program: (estructura_comentario) (procedimientos | ordenes)* EOF;

// ----------------------------------------
// Estructura de comentarios
// ----------------------------------------
estructura_comentario: '//' ESPACIO* BRACKET_OPEN (ID | NUMERO | ESPACIO)* GUION (ID | NUMERO | ESPACIO)* BRACKET_CLOSE SALTO_LINEA;

comentario: '//' (ID | DIGITO | ESPACIO)* SALTO_LINEA+;

// ----------------------------------------
// Procedimientos
// ----------------------------------------
procedimientos: (SALTO_LINEA* procedimiento SALTO_LINEA*)+;
procedimiento: PARA ESPACIO ID ESPACIO SQUARE_OPEN parametros SQUARE_CLOSE ordenes SALTO_LINEA* FIN;

parametros: (ESPACIO*ID (ESPACIO ID)*ESPACIO*)? ;

ordenes: orden+ ;
orden:(SALTO_LINEA* ESPACIO* instruccion SALTO_LINEA* ESPACIO* );

// ----------------------------------------
// Instrucciones
// ----------------------------------------
instruccion:
      haz
    | inic
    | inc
    | avanza
    | retrocede
    | giraderecha
    | giraizquierda
    | ocultatortuga
    | ponpos
    | ponxy
    | ponrumbo
    | ponx
    | pony
    | bajalapiz
    | subelapiz
    | poncolor
    | centro
    | espera
    | ejecuta
    | repite
    | si
    | haz_hasta
    | hasta
    | haz_mientras
    | mientras
    | comentario
    ;

// ----------------------------------------
// Definición específica de instrucciones
// ----------------------------------------

// Instrucciones básicas
haz: HAZ ESPACIO ID ESPACIO* (numeric_val | STRING | boolean_val) SEMICOLON ;
inic: INIC ESPACIO ID ESPACIO IGUAL ESPACIO (numeric_val | STRING | boolean_val | operacion) SEMICOLON ;
inc: INC ESPACIO SQUARE_OPEN numeric_val (ESPACIO numeric_val)? SQUARE_CLOSE SEMICOLON ;

// Instrucciones de movimiento
avanza: AVANZA ESPACIO numeric_val SEMICOLON ;
retrocede: RETROCEDE ESPACIO numeric_val SEMICOLON ;
giraderecha: GIRADERECHA ESPACIO numeric_val SEMICOLON ;
giraizquierda: GIRAIZQUIERDA ESPACIO numeric_val SEMICOLON ;

// Instrucciones de posicionamiento
ponpos: PONPOS ESPACIO SQUARE_OPEN numeric_val ESPACIO numeric_val SQUARE_CLOSE SEMICOLON ;
ponxy: PONXY ESPACIO numeric_val ESPACIO numeric_val SEMICOLON ;
ponrumbo: PONRUMBO ESPACIO numeric_val SEMICOLON ;
ponx: PONX ESPACIO numeric_val SEMICOLON ;
pony: PONY ESPACIO numeric_val SEMICOLON ;
centro: CENTRO SEMICOLON ;

// Instrucciones de lápiz
bajalapiz: BAJALAPIZ SEMICOLON ;
subelapiz: SUBELAPIZ SEMICOLON ;
poncolor: PONCOLORLAPIZ ESPACIO COLOR SEMICOLON ;

// Otras instrucciones
ocultatortuga: OCULTATORTUGA SEMICOLON ;
espera: ESPERA ESPACIO numeric_val SEMICOLON ;

// ----------------------------------------
// Instrucciones de control de flujo
// ----------------------------------------
ejecuta: EJECUTA ESPACIO SQUARE_OPEN ordenes SQUARE_CLOSE SEMICOLON ;
repite: REPITE ESPACIO numeric_val ESPACIO SQUARE_OPEN ordenes SQUARE_CLOSE SEMICOLON ;
si: SI ESPACIO PAR_OPEN boolean_val PAR_CLOSE ESPACIO SQUARE_OPEN ordenes SQUARE_CLOSE (ESPACIO SQUARE_OPEN ordenes SQUARE_CLOSE)? SEMICOLON ;

// Bucles
haz_hasta: HAZ_HASTA ESPACIO SQUARE_OPEN ordenes SQUARE_CLOSE ESPACIO PAR_OPEN boolean_val PAR_CLOSE SEMICOLON ;
hasta: HASTA ESPACIO PAR_OPEN boolean_val PAR_CLOSE ESPACIO SQUARE_OPEN ordenes SQUARE_CLOSE SEMICOLON ;
haz_mientras: HAZ_MIENTRAS ESPACIO SQUARE_OPEN ordenes SQUARE_CLOSE ESPACIO PAR_OPEN boolean_val PAR_CLOSE SEMICOLON ;
mientras: MIENTRAS ESPACIO PAR_OPEN boolean_val PAR_CLOSE ESPACIO SQUARE_OPEN ordenes SQUARE_CLOSE SEMICOLON ;

// ----------------------------------------
// Operaciones lógicas
// ----------------------------------------
op_logica: y | o ;

y: Y ESPACIO boolean_val ESPACIO boolean_val ;
o: O ESPACIO boolean_val ESPACIO boolean_val ;

// ----------------------------------------
// Valores booleanos
// ----------------------------------------
boolean_val:
      ID
    | BOOLEAN
    | op_logica
    | op_comparativa
    ;

// ----------------------------------------
// Operaciones comparativas
// ----------------------------------------
op_comparativa: iguales | mayorque | menorque ;

iguales: IGUALES ESPACIO numeric_val ESPACIO numeric_val ;
mayorque: MAYORQUE ESPACIO numeric_val ESPACIO numeric_val ;
menorque: MENORQUE ESPACIO numeric_val ESPACIO numeric_val ;

// ----------------------------------------
// Operaciones matemáticas
// ----------------------------------------
operacion: op_algebraicas ;
op_algebraicas: diferencia | azar | producto | potencia | division | suma ;

// Valores numéricos
numeric_val:
      ID
    | NUMERO
    | DIGITO
    | rumbo
    | PAR_OPEN operacion PAR_CLOSE
    ;

// Operaciones específicas
diferencia: DIFERENCIA ESPACIO numeric_val (ESPACIO numeric_val)+;
azar: AZAR ESPACIO numeric_val ;
producto: PRODUCTO ESPACIO numeric_val (ESPACIO numeric_val)+ ;
potencia: POTENCIA ESPACIO numeric_val ESPACIO numeric_val ;
division: DIVISION ESPACIO numeric_val ESPACIO numeric_val ;
suma: SUMA ESPACIO numeric_val (ESPACIO numeric_val)+ ;
rumbo: RUMBO;

// ============================================
// TOKENS (Lexer Rules)
// ============================================

// ----------------------------------------
// Palabras reservadas - Instrucciones básicas
// ----------------------------------------
HAZ: 'HAZ' ;
INIC: 'INIC' ;
INC: 'INC' ;

// ----------------------------------------
// Palabras reservadas - Movimiento
// ----------------------------------------
AVANZA: 'AVANZA' | 'AV' ;
RETROCEDE: 'RETROCEDE' | 'RE' ;
GIRADERECHA: 'GIRADERECHA' | 'GD' ;
GIRAIZQUIERDA: 'GIRAIZQUIERDA' | 'GI' ;

// ----------------------------------------
// Palabras reservadas - Posicionamiento
// ----------------------------------------
PONPOS: 'PONPOS' ;
PONXY: 'PONXY' ;
PONRUMBO: 'PONRUMBO' ;
RUMBO: 'RUMBO' ;
PONX: 'PONX' ;
PONY: 'PONY' ;
CENTRO: 'CENTRO' ;

// ----------------------------------------
// Palabras reservadas - Control del lápiz
// ----------------------------------------
BAJALAPIZ: 'BAJALAPIZ' | 'BL' ;
SUBELAPIZ: 'SUBELAPIZ' | 'SB' ;
PONCOLORLAPIZ: 'PONCOLORLAPIZ' | 'PONCL' ;

// ----------------------------------------
// Palabras reservadas - Otras instrucciones
// ----------------------------------------
OCULTATORTUGA: 'OCULTATORTUGA' | 'OT' ;
ESPERA: 'ESPERA' ;

// ----------------------------------------
// Palabras reservadas - Control de flujo
// ----------------------------------------
EJECUTA: 'EJECUTA' ;
REPITE: 'REPITE' ;
SI: 'SI' ;
HAZ_HASTA: 'HAZ.HASTA' ;
HASTA: 'HASTA' ;
HAZ_MIENTRAS: 'HAZ.MIENTRAS' ;
MIENTRAS: 'MIENTRAS' ;

// ----------------------------------------
// Palabras reservadas - Operadores lógicos
// ----------------------------------------
Y: 'Y' ;
O: 'O' ;

// ----------------------------------------
// Palabras reservadas - Operadores comparativos
// ----------------------------------------
IGUALES: 'IGUALES?' ;
MAYORQUE: 'MAYORQUE?' ;
MENORQUE: 'MENORQUE?' ;

// ----------------------------------------
// Palabras reservadas - Operadores matemáticos
// ----------------------------------------
DIFERENCIA: 'DIFERENCIA' ;
AZAR: 'AZAR' ;
PRODUCTO: 'PRODUCTO' ;
POTENCIA: 'POTENCIA' ;
DIVISION: 'DIVISION' ;
SUMA: 'SUMA' ;

// ----------------------------------------
// Palabras reservadas - Procedimientos
// ----------------------------------------
PARA: 'PARA' ;
FIN: 'FIN' ;

// ----------------------------------------
// Valores constantes
// ----------------------------------------
BOOLEAN: 'TRUE' | 'FALSE' ;
COLOR: 'NEGRO' | 'AZUL' | 'ROJO' ;

// ----------------------------------------
// Símbolos y delimitadores
// ----------------------------------------
IGUAL: '=' ;
SEMICOLON: ';' ;
SQUARE_OPEN: '[' ;
SQUARE_CLOSE: ']' ;
BRACKET_OPEN: '{' ;
BRACKET_CLOSE: '}' ;
PAR_OPEN: '(' ;
PAR_CLOSE: ')' ;
GUION: '-' ;
COMILLA: '"' ;

// ----------------------------------------
// Identificadores y literales
// ----------------------------------------
STRING: COMILLA (LETRAS | NUMERO | GUION_BAJO)+ COMILLA ;
ID: (LETRAS | GUION_BAJO) (LETRAS | GUION_BAJO | NUMERO)* ;
NUMERO: DIGITO+ ;

// ----------------------------------------
// Componentes básicos
// ----------------------------------------
LETRAS: [a-zA-Z]+ ;
GUION_BAJO: '_' ;
DIGITO: [0-9] ;
ESPACIO: ' ' ;
SALTO_LINEA: '\n' ;

// ----------------------------------------
// Whitespace (ignorado)
// ----------------------------------------
WS: [\t\r]+ -> skip ;
# PECL2 Procesadores del Lenguaje 
### Mateusz Roman Kolakowski 2020-2021

## ANTLRv4
La herramienta a utilizar ha sido antlrv4. Disponible en la pagina [antlr](https://www.antlr.org/)

Deberemos seguir los pasos pertienentes para el SSOO de nuestra maquina.
En windows, deberemos [descargar](https://www.antlr.org/download/antlr-4.9-complete.ja) el .jar de antlr.
Posteriormente, deberemos añadir variables al CLASSPATH. Para ello buscaremos la configuracion de variables del sistema. 
Cliquearemos en variables de entorno. Crearemos una nueva variable del sistema llamada CLASSPATH, que tendra el valor .;C:\Javalib\antlr4-complete.jar; .
Ademas, añadiremos a nuestra variable del sistema path, las direcciones de nuesra carpeta antlr (creada anteriormente) y la carpeta bin de nuestro jdk (ubicado en C:\Program Files\Java\ )

En este lenguaje nos basaremos en el lenguaje de [PSeint](http://pseint.sourceforge.net/index.php?page=pseudocodigo.php) que es un leguaje parecido al Pseudocodigo.

Con esto podremos acceder desde el terminal de windows hasta nuestra carpeta de antlr. En especifico a la de gramaticas. Aqui deberemos tener creadas nuestras gramaticas de parser y lexer.
Ademas, en mi caso, tengo el Ejemplo.prog, donde se ubica un codigo de ejemplo. Y, un ListenerPL1.java y in VisitorPl1.java . Estos dos ultimos seran los encargados de darme una salida del arbol AST en forma de directorios como:

/prog/main/kwinicio/kwini/INI
/prog/main/kwinicio/id/ID
/prog/main/comentario/COMENTARIO_LINEA
/prog/main/instrucciones/Definir/kwdefinir/DEFINIR
/prog/main/instrucciones/Definir/id/ID
/prog/main/instrucciones/Definir/kwcomo/COMO      
/prog/main/instrucciones/Definir/tipo/TIPO        
/prog/main/instrucciones/puntoycoma/PUNTOCOMA     
/prog/main/comentario/COMENTARIO_LINEA

## Pasos a realizar
Para poder obtener esto en el terminal. Deberemos cambiar de directorio a \gramaticas\ ubicado en la carpeta antlr. Aqui, sguiremos los siguientes pasos:

**1 antlr gPseudocodigoLexer.g4**
**2 antlr gPseudocodigoParser.g4**

Con esto, antlr compilara las gramaticas, y generara los ficheros .java necesarios.

**4 javac \*.java**

Para compilar todos los ficheros java que se vayan a utilizar. Siempre que se compile antlr ha de hacerse.

**5 java VisitorPL1 Ejemplo.prog**

De esta forma, ejecutaremos el programa que dara lugar a la salida del AST en forma de directorios.

**OPCIONAL**

antlr da la opcion de ver e larbol usando la opcion grun. Ejecutnado _grun gPseudocodigo prog -gui Ejemplo.prog_ podremos visualizarlo. Ademas, con la opcion -tokens podremos ademas visualizar los tokens por la consola.

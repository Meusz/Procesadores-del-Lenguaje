# Procedimiento para ejecutar el programa


Para poder obtener la salida en el terminal. Deberemos cambiar de directorio a \gramaticas\ ubicado en la carpeta antlr. Aqui, seguiremos los siguientes pasos:

**1** antlr gPseudocodigoLexer.g4 **2** antlr gPseudocodigoParser.g4

Con esto, antlr compilara las gramaticas, y generara los ficheros .java, .class, etc necesarios.

**4** javac *.java

Para compilar todos los ficheros java que se vayan a utilizar. Siempre que se compile antlr ha de hacerse.

**5** java VisitorPL1 .\Ejemplos\Ejemplo.prog De esta forma, ejecutaremos el programa que dara lugar a la salida del AST en forma de directorios.

Como se aprecia los ficheros de ejemplo estan en ejemplos.

**OPCIONAL** antlr da la opcion de ver el arbol usando la opcion grun. Ejecutando grun gPseudocodigo prog -gui .\Ejemplos\Ejemplo.prog podremos visualizarlo. Ademas, con la opcion -tokens podremos ademas visualizar los tokens por la consola.


El repositorio de github es https://github.com/Meusz/PdL_ANTLRv4_Pseudocode
  
# PECL3 Procesadores del Lenguaje 
### Mateusz Roman Kolakowski 2020-2021

# PECL3
Continuacion de la [PECL2](https://github.com/Meusz/PdL_ANTLRv4_Pseudocode). En esta practica, trataremos de evaluar
la complejidad de las funciones y demas elementos del programa. Para ello, cada funcion se evaluara de la siguiente forma:
    -Complejidad ciclomática, generando una puntuación y un diagrama de nodos (grafo).
    -Puntos función teniendo en cuenta la siguiente métrica:
        *Cada parámetro recibido: 2 puntos
        *Cada variable declarada: 1 punto
        *Cada función llamada: 2 puntos, +1 punto por cada parámetro pasado.
        *Cada operación simple: 1 punto por cada operador.
        *Cada nivel de bucle o bifurcación de código: Eleva al cuadrado los puntos interiores.
    -Resumen de número de llamadas a función y número de variables declaradas.
    -Resumen de líneas de código efectivas (aquellas que ejecutan algo).

Por otro lado, para el programa en su totalidad deberemos obtener:
    *Resumen de complejidad ciclomática completa del fichero.
    *Resumen de puntos de función.
    *Resumen de líneas de código efectivas.
    *Diagrama de llamadas a funciones como un diagrama de nodos (grafo), comenzando por una función que se pasa por parámetro al analizador del lenguaje.
## Graphviz
La herramienta a utilizar ha sido Graphviz. Disponible en la pagina [Graphviz](https://www.graphviz.org/)

# PECL1 de Procesadores del Lenguaje
### Mateusz Roman Kolakowski 2020-2021

## Objetivo

Adquirir un buen manejo de la mecánica de uso y transformación de expresiones regulares aplicando los conocimientos de la asignatura para extraer y programar un sistema que permita evaluarlas.

## Enunciado 

Dada una expresión natural, en esta práctica se realizarán las siguientes tareas:

• Traducción de la ER a formato JFLAP

• Transformación de la ER a un Autómata Finito No Determinista

• Análisis del Autómata Finito No Determinista para comprobar su validez

• Transformación del AFND a un Autómata Finito Determinista

• Comprobación de validez con cadenas de entrada.

• Transformación del AFD a un matriz de transición de estados para su implementación en una máquina de estados.

• Implementación de un programa que, dada una matriz de transición de estados, implemente una máquina que permita realizar las siguientes dos operaciones:

	1. Dada una cadena de texto de entrada, analizarla para determinar si esa cadena de texto cumple con la ER original.
	
	2. Dar todas las posibles cadenas de texto de entradas válidas, hasta un número máximo determinado configurable (p.ej.100), que no sobrepasen una longitud máxima configurable (p.ej.10 caracteres).

## Defensa

La defensa de la práctica constará de 4 ejercicios.
En cada ejercicio se aportará una ER, que el alumno deberá tratar e integrar en su programa, junto con un conjunto de cadenas que el alumno debe ser capaz de probar para la funcionalidad 1 del programa, indicando si cumplen o no con la ER establecida, y además debe aportar las cadenas de la opción 2 hasta el límite establecido en cada ejercicio.
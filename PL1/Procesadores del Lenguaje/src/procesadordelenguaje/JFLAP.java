/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package procesadordelenguaje;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Meusz
 */
public class JFLAP {

    String[] alfabeto = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

    public JFLAP() {
    }

    public String ValidarER(String cadena) {
        String[] ER = cadena.split("");
        int i = 0;
        boolean centinela = true, centinela2, open, close;
        String salida = "Correcto";
        while (i < ER.length && centinela) {

            switch (ER[i]) {
                case "(":
                    close = false;
                    int e = i;
                    centinela2 = true;
                    while (e < ER.length && centinela2) {
                        if (ER[e].equals(")")) {
                            close = true;
                            centinela2 = false;
                        }
                        e++;
                    }
                    if (!close) {
                        salida = "ERROR: Existe un parentesis ( en la posicion " + (i + 1) + " que no se cierra";
                    }
                    break;
                case "[":
                    close = false;
                    int u = i;
                    centinela2 = true;
                    while (u < ER.length && centinela2) {
                        if (ER[u].equals("]")) {
                            close = true;
                            centinela2 = false;
                        }
                        u++;
                    }
                    if (!close) {
                        salida = "ERROR: Existe un corchete [ en la posicion " + (i + 1) + " que no se cierra";
                    }
                    break;
                case "|":
                    try {
                        if (!(esLetra(ER[i - 1]) && esLetra(ER[i + 1]))) {
                            salida = "ERROR: Posicion " + (i + 1) + " a ambos lados del simbolo | ha de existir una letra";
                            centinela = false;
                        }
                    } catch (Exception ex) {
                        salida = "ERROR: Posicion " + (i + 1) + " a ambos lados del simbolo | ha de existir una letra";
                        centinela = false;
                    }
                    break;

                case "*":
                    try {
                        if (!(esLetra(ER[i - 1]) || (ER[i - 1].equals(")")))) {
                            salida = "ERROR: Posicion " + (i + 1) + " al lado izquierdo del simbolo * ha de existir una letra o una expresion";
                            centinela = false;
                        }
                    } catch (Exception ex) {
                        salida = "ERROR: Posicion " + (i + 1) + " al lado izquierdo del simbolo * ha de existir una letra o una expresion";
                        centinela = false;
                    }
                    break;
                case "+":
                    try {
                        if (!(esLetra(ER[i - 1]) || ER[i - 1].equals(")"))) {
                            salida = "ERROR: Posicion " + (i + 1) + " al lado izquierdo del simbolo + ha de existir una letra o una expresion";
                            centinela = false;
                        }
                    } catch (Exception ex) {
                        salida = "ERROR: Posicion " + (i + 1) + " al lado izquierdo del simbolo + ha de existir una letra o una expresion";
                        centinela = false;
                    }
                    break;
                case "?":
                    try {
                        if (!(esLetra(ER[i - 1]) || ER[i - 1].equals(")"))) {
                            salida = "ERROR: Posicion " + (i + 1) + " al lado izquierdo del simbolo ? ha de existir una letra o una expresion";
                            centinela = false;
                        }
                    } catch (Exception ex) {
                        salida = "ERROR: Posicion " + (i + 1) + " al lado izquierdo del simbolo ? ha de existir una letra o una expresion";
                        centinela = false;
                    }
                    break;
                case "-":

                    try {
                        if (!(ER[i - 2].equals("[") && esLetra(ER[i - 1]) && ER[i + 2].equals("]") && esLetra(ER[i + 1]))) {
                            salida = "ERROR: Posicion " + (i + 1) + " al usar el simbolo - la notacion ha de ser [letra-letra]";
                            centinela = false;
                        }
                    } catch (Exception ex) {
                        salida = "ERROR: Posicion " + (i + 1) + " al usar el simbolo - la notacion ha de ser [letra-letra]";
                        centinela = false;
                    }
                    break;
                case ")":
                    open = false;
                    int a = i;
                    centinela2 = true;
                    while (a >= 0 && centinela2) {
                        if (ER[a].equals("(")) {
                            open = true;
                            centinela2 = false;
                        }
                        a--;
                    }
                    if (!open) {
                        salida = "ERROR: Existe un parentesis ) en la posicion " + (i + 1) + " que no se abre anteriormente";
                        centinela = false;
                    }
                    break;
                case "]":
                    open = false;
                    int j = i;
                    centinela2 = true;
                    while (j >= 0 && centinela2) {
                        if (ER[j].equals("[")) {
                            open = true;
                            centinela2 = false;
                        }
                        j--;
                    }
                    if (!open) {
                        salida = "ERROR: Existe un corchete ] en la posicion " + (i + 1) + " que no se abre anteriormente";
                        centinela = false;
                    }
                    break;
                default:
                    if (!esLetra(ER[i])) {
                        salida = "ERROR: Se espera una letra en la pos " + (i + 1) + " pero hay un simbolo desconocido";
                        centinela = false;
                    }
                    break;

            }
            i++;
        }
        return salida;
    }

    public List<Character> ObtenerAlfabeto(String cadena) {
        String[] simbolos = cadena.split("");
        String letras = "";
        int i = 0;
        while (i < cadena.length()) {
            if (esLetra(simbolos[i]) && !letras.contains(simbolos[i])) {
                letras = letras + simbolos[i];
            }
            i++;
        }
        simbolos = letras.split("");
        List<Character> alfabeto = new ArrayList<>();
        for (i = 0; i < letras.length(); i++) {
            alfabeto.add(simbolos[i].charAt(0));
        }
        return alfabeto;
    }

    public boolean esLetra(String cadena) {
        if (cadena.length() == 1) {
            char letra = cadena.charAt(0);

            return Character.isLetter(letra);
        } else {
            return false;
        }

    }

    public boolean LetraMenor(String letra1, String letra2) {
        return letra1.charAt(0) <= letra2.charAt(0);
    }

    public boolean LetraMayor(String letra1, String letra2) {
        return letra1.charAt(0) > letra2.charAt(0);
    }

    public String ArrayToString(String[] cadena) {
        String salida = "";
        for (int i = 0; i < cadena.length; i++) {
            salida = salida + cadena[i];
        }
        return salida;
    }

    public String[] Copyarray(String[] cadena, int firstpos, int lastpos) {
        String[] Array = new String[lastpos - firstpos + 1];
        int a = 0;
        for (int i = firstpos; i <= lastpos; i++) {
            Array[a] = cadena[i];
            a++;
        }
        return Array;
    }

    public int PosAperturaParentesis(String[] cadena, int pos) {
        System.out.println(ArrayToString(cadena) + " " + pos);
        if (cadena[pos].equals("(")) {
            System.out.println("Se abre");
            return pos;
        } else {
            pos--;
            if (cadena[pos].equals(")")) {
                System.out.println("LLamadaRecursiva");
                pos = PosAperturaParentesis(cadena, pos) - 1;
            }
            return PosAperturaParentesis(cadena, pos);
        }
    }

    public String TraducirERJFLAP(String cadena) {
        String[] ER = cadena.split("");
        int i = 0, lastpos, e, a;
        boolean centinela = true, letras;
        while (i < ER.length) {
            String[] precadena = null, poscadena = null, intermedio = null;
            String intermedia = "";
            switch (ER[i]) {
                case "|":
                    ER[i] = "+";
                    cadena = ArrayToString(ER);
                    break;
                case "+":
                    if (esLetra(ER[i - 1])) {
                        precadena = Copyarray(ER, 0, i - 2);
                        poscadena = Copyarray(ER, i + 1, ER.length - 1);
                        cadena = ArrayToString(precadena) + ER[i - 1] + "(!+" + ER[i - 1] + ")*" + ArrayToString(poscadena);
                        i = i + 5;
                    } else {

                        e = PosAperturaParentesis(ER, i - 1);

                        precadena = Copyarray(ER, 0, e - 1);
                        poscadena = Copyarray(ER, i + 1, ER.length - 1);
                        intermedia = ArrayToString(Copyarray(ER, e + 1, i - 2));
                        cadena = ArrayToString(precadena) + "(" + intermedia + ")" + "(!+(" + intermedia + ")*)" + ArrayToString(poscadena);

                        i = i + 6 + intermedia.length() - 1;
                    }
                    break;

                case "?":
                    if (esLetra(ER[i - 1])) {
                        precadena = Copyarray(ER, 0, i - 2);
                        poscadena = Copyarray(ER, i + 1, ER.length - 1);
                        cadena = ArrayToString(precadena) + "(!+" + ER[i - 1] + ")" + ArrayToString(poscadena);
                        i = i + 3;
                    } else {

                        e = PosAperturaParentesis(ER, i - 1);

                        precadena = Copyarray(ER, 0, e - 1);
                        poscadena = Copyarray(ER, i + 1, ER.length - 1);
                        intermedia = ArrayToString(Copyarray(ER, e + 1, i - 2));
                        cadena = ArrayToString(precadena) + "(!+" + intermedia + ")" + ArrayToString(poscadena);

                        i = i + 3;
                    }

                    break;

                case "[":
                    precadena = Copyarray(ER, 0, i - 1);
                    lastpos = i + 1;
                    letras = true;
                    while (!ER[lastpos].equals("]")) {
                        letras = letras && esLetra(ER[lastpos]);
                        lastpos++;
                    }
                    poscadena = Copyarray(ER, lastpos + 1, ER.length - 1);
                    if (letras) {
                        intermedia = "";
                        e = i + 1;
                        while (e < lastpos - 1) {
                            intermedia = intermedia + ER[e] + "+";
                            i = i + 2;
                            e++;
                        }
                        intermedia = intermedia + ER[e];

                    } else if (ER[i + 2].equals("-")) {
                        String[] tokens = ArrayToString(Copyarray(ER, i + 1, lastpos - 1)).split("-");
                        a = 0;
                        while (a < tokens.length - 1 && LetraMenor(tokens[a], tokens[a + 1])) {
                            a++;
                        }
                        if (LetraMenor(tokens[a - 1], tokens[a])) {
                            intermedia = "";
                            for (a = 0; a < alfabeto.length - 1; a++) {
                                System.out.println(LetraMenor(alfabeto[a], tokens[tokens.length - 1]) + "  " + alfabeto[a] + "  " + tokens[tokens.length - 1]);
                                if (LetraMenor(tokens[0], alfabeto[a]) && LetraMenor(alfabeto[a], tokens[tokens.length - 1])) {

                                    intermedia = intermedia + alfabeto[a];
                                    if( !alfabeto[a].equals(tokens[tokens.length - 1]) ){
                                        intermedia = intermedia + "+";
                                        i = i + 2;
                                    }else{
                                        i++;
                                    }
                                    
                                }

                            }
                        }

                    }
                    cadena = ArrayToString(precadena) + "(" + intermedia + ")" + ArrayToString(poscadena);
                    i = i + 2;
                    break;
                case "(":
                    break;
                default:
                    break;

            }
            ER = cadena.split("");
            i++;
        }

        return ArrayToString(ER);
    }

}

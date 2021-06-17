/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package procesadordelenguaje;

import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Meusz
 */
public final class AFD {

    private final List<Character> Alfabeto;
    private List<Integer> Estados;
    private final List<Integer> estadosfinales;
    private final int estadoinicial;
    //private final int numeroestados;
    private final HashMap<Integer, HashMap<Character, Integer>> Matriz;

    public AFD(int estadoinicial, List<Integer> Estados, List<Character> Alfabeto, List<Integer> estadosfinales, HashMap<Integer, HashMap<Character, Integer>> Matriz) {
        this.estadoinicial = estadoinicial;
        this.Estados = Estados;
        this.Alfabeto = Alfabeto;
        this.estadosfinales = estadosfinales;
        this.Matriz = Matriz;

    }

    /*public void cargarAlfabeto() { //rellenar con todos los caracteres de la cadena
        Alfabeto.add(new Character('a'));
    }*/
 /*public void cargarEstados() { //rellenar con todos los estados del automata
        for (int i = 0; i < numeroestados; ++i) {
            Estados.add(i);
        }
    }*/

 /*public void establecerInicial(int estado) { //rellenar con todos los estados fian(les del automata
        estadoinicial = estado;
    }*/

 /*public void establecerFinales() { //rellenar con todos los estados fian(les del automata
        estadosfinales.add(2);
    }*/

 /*public void inicializaMatriz() {
        for (int i = 0; i < numeroestados; ++i) {
            Matriz.put(Estados.get(i), new HashMap<>());
        }

    }*/

 /*public void cargarMatriz() {//metodo para inicializar los datos de la mtatriz
        Matriz.get(0).put('a', 3);      //El estado 0, se enlaza en la matriz mediante a al estado 3
        Matriz.get(0).put('a', 3);
        Matriz.get(0).put('a', 3);
        Matriz.get(0).put('a', 3);
        Matriz.get(0).put('a', 3);
        Matriz.get(0).put('a', 3);
        Matriz.get(0).put('a', 3);
        Matriz.get(0).put('a', 3);
        Matriz.get(0).put('a', 3);
        Matriz.get(0).put('a', 3);
        Matriz.get(0).put('a', 3);
    }*/
    public int getsiguienteestado(int estado, char caracter) {
        try {
            return (int) Matriz.get(estado).get(caracter);
        } catch (Exception e) {
            return -1;
        }

    }

    public boolean isfinal(int estado) {
        return estadosfinales.contains(estado);
    }

    public int getEstadoinicial() {
        return estadoinicial;
    }

    public List<Character> getAlfabeto() {
        return Alfabeto;
    }

    public HashMap<Integer, HashMap<Character, Integer>> getMatriz() {
        return Matriz;
    }
    
}

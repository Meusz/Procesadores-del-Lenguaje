/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package procesadordelenguaje;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Meusz
 */
public class MaquinaEstados {

    private int EstadoActual;
    private final AFD Afd;
    private File archivo = new File("Resultado.txt");
    private FileWriter writer;
    private BufferedWriter salida;
    private int CadenasCreadas = 0;
    private int Numeromaximo;
    private int Longitudmaxima;
    private String ER;

    public MaquinaEstados(AFD Afd, int Numeromaximo, int Longitudmaxima, String ER) {
        this.Afd = Afd;
        this.Numeromaximo = Numeromaximo;
        this.Longitudmaxima = Longitudmaxima;
        this.ER = ER;
        this.EstadoActual = Afd.getEstadoinicial();
        try {
            crearFichero(archivo);
            writer = new FileWriter(archivo);
            salida = new BufferedWriter(writer);
        } catch (IOException ex) {
            Logger.getLogger(MaquinaEstados.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void Acepta(Character character) {
        int estadotmp = Afd.getsiguienteestado(EstadoActual, character);
        if (estadotmp != -1) {
            EstadoActual = estadotmp;
        }else{
            EstadoActual = -1;
        }

    }

    public boolean isFinal() {
        return Afd.isfinal(EstadoActual);
    }

    public void ValidarCadenas(String[] cadenas) {
        try {
            salida.write("ER: " + ER);
            salida.newLine();
            salida.newLine();
        } catch (IOException ex) {
            Logger.getLogger(MaquinaEstados.class.getName()).log(Level.SEVERE, null, ex);
        }

        for (int i = 0; i < cadenas.length; i++) {
            try {
                EstadoActual = Afd.getEstadoinicial();
                salida.write("Cadena " + i + ": \"" + cadenas[i] + "\" --> ");
                if (compruebaCadena(cadenas[i])) {
                    salida.write("Válida");
                } else {
                    salida.write("No Válida");
                }
                salida.newLine();
                salida.newLine();
            } catch (IOException ex) {
                Logger.getLogger(MaquinaEstados.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

    public boolean compruebaCadena(String cadena) {//ewfvafvb
        //Para cada caracter en cadena 
        String[] Array = cadena.split("");
        for (int i = 0; i < Array.length; i++) {
            try {
                Acepta(Array[i].charAt(0));
                if (cadena.length() - 1 == i && isFinal()) {
                    return true;
                }
            } catch (Exception e) {
                return false;
            }
        }
        return false;
    }

    public int SiguienteEstado(int estado, Character character) {
        int estadotmp = Afd.getsiguienteestado(estado, character);
        if (estadotmp != -1) {
            return estadotmp;
        } else {
            return -1;
        }

    }

    public void CrearCadenas(String cadena, int estadoactual) {
        
        for (int i = 0; i < Afd.getAlfabeto().size() && cadena.length() < Longitudmaxima && CadenasCreadas < Numeromaximo; i++) {
            if (SiguienteEstado(estadoactual, Afd.getAlfabeto().get(i)) != -1) {
                CrearCadenas((cadena + Character.toString(Afd.getAlfabeto().get(i))), SiguienteEstado(estadoactual, Afd.getAlfabeto().get(i)));
            }
        }
        if (Afd.isfinal(estadoactual) && CadenasCreadas < Numeromaximo && cadena.length() <= Longitudmaxima ) {
            try {
                CadenasCreadas++;
                salida.write(CadenasCreadas + "- \"" + cadena + "\"");
                salida.newLine();
            } catch (IOException ex) {
                Logger.getLogger(MaquinaEstados.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println(CadenasCreadas);
        }

    }

    public static void crearFichero(File fichero) throws IOException {
        if (fichero.exists()) {
            fichero.delete();
            fichero.createNewFile();
        } else {
            fichero.createNewFile();
        }

    }

    public void Cerrar() throws IOException {
        salida.close();
        writer.close();

    }
}

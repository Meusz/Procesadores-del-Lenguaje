import java.util.*;
import java.io.*;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class WriteDOT {

    private FileWriter archivo = null;
    private ArrayList<String> textDot;
    private String nombre;

    public WriteDOT(String nombre) {
		this.nombre = nombre;
		this.textDot = new ArrayList<String>();
	}

    public ArrayList<String> getTextDot() {
        return textDot;
    }

    public void writeTextDot(String textDot) {
        this.textDot.add(textDot);
    }

    public void escribirFicheroDot() {
        try {
			archivo = new FileWriter(System.getProperty("user.dir") + "\\" + this.nombre + ".dot");

			for (String str: textDot) {
				archivo.write(str);
			}
		} catch (Exception e) {
			Logger.getLogger(WriteDOT.class.getName()).log(Level.SEVERE, null, e);
		} finally {
			try {
				if (null != archivo)
					archivo.close();
			} catch (Exception e) {
				Logger.getLogger(WriteDOT.class.getName()).log(Level.SEVERE, null, e);
			}
		}
    }
}
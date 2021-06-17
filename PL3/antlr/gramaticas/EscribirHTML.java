import java.util.*;
import java.io.*;

public class EscribirHTML {

    private FileWriter archivo = null;
    private ArrayList<String> textHTML = new ArrayList<String>();

    public EscribirHTML() {}

    public ArrayList<String> getTextHTML() {
        return textHTML;
    }

    public void setTextHTML(ArrayList<String> textHTML) {
        this.textHTML = textHTML;
    }

    public void escribirFicheroHTML(String nombreFichero) {
        try {
			archivo = new FileWriter(System.getProperty("user.dir") + "\\" + nombreFichero);

			for (String str: textHTML) {
				archivo.write(str);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (null != archivo)
					archivo.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
    }
}
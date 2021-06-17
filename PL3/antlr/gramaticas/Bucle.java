public class Bucle {

    private int lineaBucleArriba = -1;
    private int lineaInicio;
    private int lineaFinal;

    public Bucle() {}

    public int getLineaBucleArriba() {
        return lineaBucleArriba;
    }

    public void setLineaBucleArriba(int lineaBucleArriba) {
        this.lineaBucleArriba = lineaBucleArriba;
    }

    public int getlineaInicio() {
        return lineaInicio;
    }

    public void setlineaInicio(int lineaInicio) {
        this.lineaInicio = lineaInicio;
    }

    public int getLineaFinal() {
        return lineaFinal;
    }

    public void setLineaFinal(int lineaFinal) {
        this.lineaFinal = lineaFinal;
    }

    public String inicioToArriba() {
        return "    linea" + lineaInicio + " -> linea" + lineaBucleArriba + ";\n";
    }

    public String finalToInicio() {
        return "    linea" + lineaFinal + " -> linea" + lineaInicio + ";\n";
    }

    public String noEntraBucle() {
        String temp = "";
        if (lineaBucleArriba == -1) {
            temp = "    linea" + lineaInicio + " -> linea" + (lineaFinal + 1) + ";\n";
        }
        return temp;
    }
}
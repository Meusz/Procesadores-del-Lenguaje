import java.util.*;

public class Function {
    private String nombreFuncion, retorno="void";
    private ArrayList<String> tiposParametros = new ArrayList<String>();
    private int primeraLinea;
    private int ultimaLinea;
    private int numberVariables=0;
    private int numberFunctionCalls;
    private int numberLinesOfCode;
    private int numberParameters;
    private int headerPoints;
    private int variablePoints;
    private int functionCallsPoints;
    private int parameterCallsPoints;
    private int operationPoints;
    private int ciclomatica=0;
    private int argumentos=0;
    private long loopPoints;
    // 

    public String getNombreFuncion() {
        return nombreFuncion;
    }
    public void setRetorno(String retorno) {
        this.retorno=retorno;
    }
    public String getRetorno() {
        return this.retorno;
    }

    public void AumentarCiclomatica(){
        this.ciclomatica++;
    }
    public int getCiclomatica(){
        return this.ciclomatica+1;
    }

    public void setNumArgumentos(int num){
        this.argumentos= num;
    }
    public int getArgumentos(){
        return this.argumentos;
        
        
    }

    public void setNombreFuncion(String nombreFuncion) {
        this.nombreFuncion = nombreFuncion;
    }

    public ArrayList<String> getTiposParametros() {
        return tiposParametros;
    }

    public void setTiposParametros(ArrayList<String> tiposParametros) {
        this.tiposParametros = tiposParametros;
    }

    public int getPrimeraLinea() {
        return primeraLinea;
    }

    public void setPrimeraLinea(int primeraLinea) {
        this.primeraLinea = primeraLinea;
    }

    public int getUltimaLinea() {
        return ultimaLinea;
    }

    public void setUltimaLinea(int ultimaLinea) {
        this.ultimaLinea = ultimaLinea;
    }

    public int getNumberVariables() {
        return numberVariables;
    }

    public void AumentarNumberVariables() {
        this.numberVariables++;
    }

    public int getNumberFunctionCalls() {
        return numberFunctionCalls;
    }

    public void AumentarFunctionCalls() {
        this.numberFunctionCalls ++;
    }

    public int getNumberLinesOfCode() {
        return numberLinesOfCode;
    }

    public void setNumberLinesOfCode(int numberLinesOfCode) {
        this.numberLinesOfCode = numberLinesOfCode;
    }

    public int getNumberParameters() {
        return numberParameters;
    }

    public void setNumberParameters(int numberParameters) {
        this.numberParameters = numberParameters;
    }

    public int getHeaderPoints() {
        return headerPoints;
    }

    public void setHeaderPoints(int headerPoints) {
        this.headerPoints = headerPoints;
    }

    public int getVariablePoints() {
        return numberVariables;
    }

    public void setVariablePoints(int variablePoints) {
        this.variablePoints = variablePoints;
    }

    public int getFunctionCallsPoints() {
        return functionCallsPoints;
    }

    public void setFunctionCallsPoints(int functionCallsPoints) {
        this.functionCallsPoints = functionCallsPoints;
    }

    public int getParemeterCallsPoints() {
        return argumentos *2 ;
    }

    public void setParameterCallsPoints(int parameterCallsPoints) {
        this.parameterCallsPoints = parameterCallsPoints;
    }

    public int getOperationPoints() {
        return operationPoints;
    }

    public void setOperationPoints(int operationPoints) {
        this.operationPoints = operationPoints;
    }

    public long getLoopPoints() {
        return loopPoints;
    }

    public void setLoopPoints(long loopPoints) {
        this.loopPoints = loopPoints;
    }

    public long getTotalPoints() {
        
        return headerPoints + variablePoints + functionCallsPoints + argumentos *2 + operationPoints + loopPoints;
    }
}
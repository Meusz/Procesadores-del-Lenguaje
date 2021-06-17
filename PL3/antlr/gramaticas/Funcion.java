import java.util.*;

public class Funcion {
    private String nombreFuncion,adicional="",info="",nodoini,nodofin,end="";
    private ArrayList<Instruccion> instruccion; 
    private ArrayList<ArrayList<String>> funciones; 
    boolean llamafunciones;
    private int numeroinstrucciones;
    private int numberParameters;
    private WriteDOT dotFuncion;   // Dot para el grafo de la funcion
    private boolean existebloque;

    private int contador; //Contador de instrucciones global

    public Funcion(String nombreFuncion,int numberParameters,int contador) {
        this.nombreFuncion = nombreFuncion;
        this.numberParameters = numberParameters;
        this.instruccion = new ArrayList<Instruccion>();
        this.funciones = new ArrayList<ArrayList<String>>();
        this.llamafunciones=false;
        this.numeroinstrucciones = 0;
        this.dotFuncion = new WriteDOT("\\Salidas\\"+nombreFuncion);
        this.contador=contador;
        this.existebloque=false;
    }
    public int getContador(){
        return contador;
    }

    public String getnodoINI(){
        return this.nodoini;
    }

    public String getnodoFIN(){
        return this.nodofin;
    }
    
    public String Getnombre(){
        return this.nombreFuncion;
    }

    public void addInstruccion(Instruccion instruccion){
        
         this.instruccion.add(instruccion);
         this.numeroinstrucciones++;
    }
    


    public int getNumUltimaInstruccion(){
        return this.numeroinstrucciones-1;
    }

    /* ------------------------------------------------------------------------------
    ---------------------------------------------------------------------------------
    -------------Metodos para llamadas a funciones---------------------------
    ---------------------------------------------------------------------------------
    ---------------------------------------------------------------------------------*/
    private void AddFunciones(String textofuns){
        if(!textofuns.equals("") ){
            this.llamafunciones=true;
            String[] funnodos=textofuns.split(",");
            String[] nodos;
            ArrayList<String> dentro;
            for(int i =0;i<funnodos.length;i++){
                dentro = new ArrayList<String>();
                
                nodos = funnodos[i].split("_");
                
                dentro.add(nodos[0]);
                dentro.add(nodos[1]);
                this.funciones.add(dentro);
            }
        }
    }
    public boolean LlamaFunciones(){
        return this.llamafunciones;
    }
    public ArrayList<ArrayList<String>> Funciones(){
        return this.funciones;
    }

    /* ------------------------------------------------------------------------------
    ---------------------------------------------------------------------------------
    -------------Metodos para instrucciones complejas---------------------------
    ---------------------------------------------------------------------------------
    ---------------------------------------------------------------------------------*/
    public void addInstruccionaInstruccion(int indice,Instruccion instruccion){
        
        this.instruccion.get(indice).addInstruccion(instruccion);
        
    }
    public boolean CerrarInstruccionCompleja(int indice){
        boolean salida= this.instruccion.get(indice).TieneInstruccionDentro();
        this.instruccion.get(indice).closeInstruction();
        return salida;

    }
    public void annadirBifurcacion(int indice,String nombre){
        this.instruccion.get(indice).addBifurcacion(nombre);
    }

    //Escribir el fichero.dot
    private void writeDOT(String nombre){
        this.dotFuncion.writeTextDot(nombre);
    }

    private void infoDot(){
        this.info = this.info+"\t\tlabel = \"" + this.nombreFuncion + "\";\n";
        String siguiente;
        ArrayList<String> toString;
        for (int i=0;i<this.instruccion.size()-1;i++) {
            if(this.instruccion.get(i).GetTipo()=="Simple" || this.instruccion.get(i).GetTipo()=="Invocacion"){
                
                if(!this.existebloque){
                    
                    this.info = this.info + "Bloque" +this.contador+ "->";
                    if(i==0) {this.nodoini = "Bloque" +this.contador;}
                    this.contador++;
                    this.existebloque=true;
                }
            }else if(this.instruccion.get(i).GetTipo()=="Bifurcacion"){
                if(this.existebloque){this.existebloque=false;}
                if(i==0) {this.nodoini =this.instruccion.get(i).GetIninode();}

                toString = this.instruccion.get(i).toStringBifurcacion(contador);
                
                contador = Integer.parseInt(toString.get(toString.size()-1));
                this.info = this.info +toString.get(toString.size()-2) ;
                if(this.instruccion.get(i+1).GetTipo()=="Bifurcacion"){
                    siguiente=this.instruccion.get(i+1).GetIninode();
                }else if(this.instruccion.get(i+1).GetTipo()=="Bucle"){
                    siguiente=this.instruccion.get(i+1).GetIninode();
                }else{
                    siguiente="Bloque"+(contador);}
                
                for(int a = 0; a<toString.size()-2;a++){
                       if(!toString.get(a).contains(";\n") ){
                            this.adicional = this.adicional + toString.get(a) + siguiente  + ";\n";
                       }
                        
                    }
            
                    
                    
            
            }else if(this.instruccion.get(i).GetTipo()=="Bucle"){
                if(this.existebloque){this.existebloque=false;}
                if(i==0) {this.nodoini =this.instruccion.get(i).GetIninode();}
                toString = this.instruccion.get(i).toStringBucle(contador);
                contador = Integer.parseInt(toString.get(toString.size()-1));
                this.info = this.info + toString.get(toString.size()-2) ;
                if(this.instruccion.get(i+1).GetTipo()=="Bifurcacion"){
                    siguiente=this.instruccion.get(i+1).GetIninode();
                }else if(this.instruccion.get(i+1).GetTipo()=="Bucle"){
                    siguiente=this.instruccion.get(i+1).GetIninode();
                }else{
                    siguiente="Bloque"+(contador);}
                
                for(int a = 0; a<toString.size()-2;a++){
                        if(!toString.get(a).contains(";\n")){
                            this.adicional = this.adicional + toString.get(a) + siguiente  + ";\n";
                       }else{
                           this.adicional = this.adicional + toString.get(a);
                       }
                    }
            }  
            
        }
        //Cuando salimos del bucle metemos la ultima instruccion
        
        if( (this.instruccion.get(this.instruccion.size()-1).GetTipo()=="Simple") || (this.instruccion.get(this.instruccion.size()-1).GetTipo()=="Invocacion") ){
            if(this.nodoini==null){this.nodoini= "Bloque" +this.contador;
            this.info = this.info + "Bloque" +this.contador +"-> end"+";\n" ;}
            else{this.contador--;
            this.info = this.info +"end"+";\n";
            }
            
            
            this.nodofin= "Bloque" +this.contador ;
            
            this.contador++;
        }else if(this.instruccion.get(this.instruccion.size()-1).GetTipo()=="Bifurcacion"){
                toString = this.instruccion.get(this.instruccion.size()-1).toStringBifurcacion(contador);
                System.out.println(toString);
                if(this.nodoini==null){this.nodoini=this.instruccion.get(this.instruccion.size()-1).GetIninode();}

                else if(this.existebloque){this.existebloque=false;}

                contador = Integer.parseInt(toString.get(toString.size()-1));
                
                siguiente="end";
                this.info = this.info + toString.get(toString.size()-2)+siguiente  + ";\n";
                for(int a = 0; a<toString.size()-2;a++){
                       if(!toString.get(a).contains(";\n")){
                            this.adicional = this.adicional + toString.get(a) + siguiente  + ";\n";
                       }else{
                           this.adicional = this.adicional + toString.get(a);
                       }
                    }

                
        }else if(this.instruccion.get(this.instruccion.size()-1).GetTipo()=="Bucle"){
            
                toString = this.instruccion.get(this.instruccion.size()-1).toStringBucle(contador);
                contador = Integer.parseInt(toString.get(toString.size()-1));
                
                siguiente ="end";
                this.info = this.info + toString.get(toString.size()-2) + siguiente  + ";\n";
                for(int a = 0; a<toString.size()-2;a++){
                        if(!toString.get(a).contains(";\n")){
                            this.adicional = this.adicional + toString.get(a) + siguiente  + ";\n";
                       }else{
                           this.adicional = this.adicional + toString.get(a);
                       }
                       
                    }
        }
        
        this.info = this.info + this.end+"\n";
        this.info = this.info + "\tstart -> "+this.nodoini +";\n";
        /*if(this.nodofin !="end"){
            this.info = this.info + "\t"+this.nodofin +" -> end;\n";
        }*/
        this.info = this.info + this.adicional;
        this.info = this.info + "\tstart [style=filled, color=red];\n";
        this.info = this.info + "\tend [style=filled, color=blue];\n";
        

    
    }

    public String getinfoDOT(){
        return this.info;
    }

    public void EndFun(){

        writeDOT("digraph {\n\n");

        infoDot();
        
        writeDOT(this.info+"\n}");
        this.dotFuncion.escribirFicheroDot();
    }

    


 }
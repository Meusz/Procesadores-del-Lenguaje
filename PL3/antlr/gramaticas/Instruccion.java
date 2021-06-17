import java.util.*;

public class Instruccion {
    //Para instrucciones simples
    private String tipo;
    private String nombre;
    //Para instrucciones Complejas
    private boolean InstruccionDentro=false;
    private String additional="",funs="", lastkey, ininode ,finnode;
    //Para instrucciones de Bifurcacion
    private HashMap<String, ArrayList<Instruccion>> Bifurcaciones;
    //Para instrucciones de Bucle
    ArrayList<Instruccion> instrucciones = new ArrayList<Instruccion>();
    private boolean existebloque;

    //Metodos para instrucciones simples
    public Instruccion(String tipo,String nombre){
        this.tipo=tipo;
        this.nombre=nombre;
        this.InstruccionDentro=false;
        this.existebloque=false;
    }

    public String GetTipo(){
        return this.tipo;
    }

    public String Getnombre(){
        return this.nombre;
    }

    @Override
    public String toString() {
        return this.nombre;
    }


    /* ------------------------------------------------------------------------------
    ---------------------------------------------------------------------------------
    -------------Metodos para instrucciones complejas---------------------------
    ---------------------------------------------------------------------------------
    ---------------------------------------------------------------------------------*/

    public String GetIninode(){
        return this.ininode;
    }
    public String GetFinnode(){
        return this.finnode;
    }
    public boolean TieneInstruccionDentro(){
        return this.InstruccionDentro;
    }

    public void addInstruccion(Instruccion instruccion){
         /* Funcion para añadir una nueva instruccion, este metodo es para funciones complejas.
         *  Si la funcion compleja, tiene otra dentro, es decir, es un bucle, y dentro tiene otro bucle
         *  que no esta cerrado, la instruccion debera introducirse en el blucle mas interior
         */
         
        if(this.InstruccionDentro){
            if(this.GetTipo()=="Bifurcacion"){
                
                this.Bifurcaciones.get(this.lastkey).get(this.Bifurcaciones.get(this.lastkey).size()-1).addInstruccion(instruccion);    
            }else if(this.GetTipo()=="Bucle"){
                
                this.instrucciones.get(this.instrucciones.size()-1).addInstruccion(instruccion);
            }
            
        }else{
                 
            if(instruccion.GetTipo() == "Simple" || instruccion.GetTipo() == "Invocacion"){
                if(this.GetTipo()=="Bifurcacion"){
                    
                    this.Bifurcaciones.get(this.lastkey).add(instruccion);
                }else if(this.GetTipo()=="Bucle"){
                    this.instrucciones.add(instruccion);}
                
            }else{
               
                this.InstruccionDentro=true; 
                    
                if(this.GetTipo()=="Bifurcacion"){
                    this.Bifurcaciones.get(this.lastkey).add(instruccion);
                }else if(this.GetTipo()=="Bucle"){
                    this.instrucciones.add(instruccion);
                }

            }
        }       
    }
    public void closeInstruction(){
        /** Metodo para cerrar una instruccion compleja, si la instruccion compleja, tiene otra instruccion compleja dentro
        *   se debera cerrar la instruccion que tiene dentro. Sabemos que tiene una instruccion compleja dentro porque la
        *   variable this.InstruccionDentro posee valor true.*/
        if(this.GetTipo()=="Bifurcacion" && this.Bifurcaciones.get(this.lastkey).size()>0 &&  this.Bifurcaciones.get(this.lastkey).get(this.Bifurcaciones.get(this.lastkey).size()-1).TieneInstruccionDentro() ){
            this.Bifurcaciones.get(this.lastkey).get(this.Bifurcaciones.get(this.lastkey).size()-1).closeInstruction();
        }else if( this.GetTipo()=="Bucle" && this.instrucciones.size()>0 && this.instrucciones.get(this.instrucciones.size()-1).TieneInstruccionDentro() ) {
            this.instrucciones.get(this.instrucciones.size()-1).closeInstruction();
        }else{
            this.InstruccionDentro=false; 
            
        }
    }

    /* ------------------------------------------------------------------------------
    ---------------------------------------------------------------------------------
    -------------Metodos para instrucciones de bucles---------------------------
    ---------------------------------------------------------------------------------
    ---------------------------------------------------------------------------------*/
    public void DeclararBucle(String ininode,String finnode){
        this.ininode = ininode;
        this.finnode = finnode;
        this.instrucciones = new ArrayList<Instruccion>();
    }

    public ArrayList<String> toStringBucle(int contador) {
        //Funcion para escribir el .dot si la instruccion es una bifurcacion
        ArrayList<String> salida = new ArrayList<String>();
        String gaps="",siguiente="";
        this.existebloque=false;
        boolean modificado = false;
        gaps = gaps + this.ininode + " -> ";
        
        for (int i=0;i<this.instrucciones.size()-1;i++){
            if( this.instrucciones.get(i).GetTipo()=="Simple" || this.instrucciones.get(i).GetTipo()=="Invocacion"){
                if(!this.existebloque){
                    gaps = gaps + "Bloque" +contador +"->";
                    
                    contador++;
                    this.existebloque=true;
                }
            }else if( this.instrucciones.get(i).GetTipo()=="Bifurcacion" ){
                if(this.existebloque){this.existebloque=false;}
                
                
                    ArrayList<String> toString=this.instrucciones.get(i).toStringBifurcacion(contador);
                    if(this.instrucciones.get(i+1).GetTipo()=="Bifurcacion"){
                        siguiente=this.instrucciones.get(i+1).GetIninode();
                    }else if(this.instrucciones.get(i+1).GetTipo()=="Bucle"){
                        siguiente=this.instrucciones.get(i+1).GetIninode();
                    }else{
                        siguiente="Bloque"+(contador);}
                    for(int a = 0; a<toString.size()-2;a++){
                            if(!toString.get(a).contains(";\n")){
                                salida.add(toString.get(a) + siguiente  + ";\n");
                            }else{
                                salida.add( toString.get(a));
                            }
                        }
                    gaps = gaps + toString.get(toString.size()-2) ;
                    contador = Integer.parseInt(toString.get(toString.size()-1));
            }else if(this.instrucciones.get(i).GetTipo()=="Bucle" ){
                
                if(this.existebloque){this.existebloque=false;}
                
                    ArrayList<String> toString=this.instrucciones.get(i).toStringBucle(contador);
                    if(this.instrucciones.get(i+1).GetTipo()=="Bifurcacion"){
                        siguiente=this.instrucciones.get(i+1).GetIninode();
                    }else if(this.instrucciones.get(i+1).GetTipo()=="Bucle"){
                        siguiente=this.instrucciones.get(i+1).GetIninode();
                    }else{
                        siguiente="Bloque"+(contador);}
                    for(int a = 0; a<toString.size()-2;a++){
                                if(!toString.get(a).contains(";\n")){
                                    
                                    salida.add(toString.get(a) + siguiente  + ";\n");
                            }else{
                                salida.add( toString.get(a));
                            }
                        }
                       
                    gaps = gaps + toString.get(toString.size()-2) ;
                    
                    contador = Integer.parseInt(toString.get(toString.size()-1));
                    
                }
        }
        /**/
        if( this.instrucciones.get(this.instrucciones.size()-1).GetTipo()=="Simple" || this.instrucciones.get(this.instrucciones.size()-1).GetTipo()=="Invocacion"){
                
                if(!this.existebloque){
                    if(this.nombre!="Repetir"){this.finnode= "Bloque" +contador;modificado=true;}
                    gaps = gaps + "Bloque" +contador +"->";
                    
                    
                    contador++;
                    this.existebloque=true;
                }else{
                    if(this.nombre!="Repetir"){this.finnode= "Bloque" +(contador-1 );modificado=true;}
                }
            }else if( this.instrucciones.get(this.instrucciones.size()-1).GetTipo()=="Bifurcacion" ){
                if(this.existebloque){this.existebloque=false;}
                
                
                    ArrayList<String> toString=this.instrucciones.get(this.instrucciones.size()-1).toStringBifurcacion(contador);
                    siguiente=this.finnode;
                    for(int a = 0; a<toString.size()-2;a++){
                                if(!toString.get(a).contains(";\n")){
                                    salida.add(toString.get(a) + siguiente  + ";\n");
                                }else{
                                    salida.add( toString.get(a));
                                }
                        }
                    gaps = gaps + toString.get(toString.size()-2) ;
                    contador = Integer.parseInt(toString.get(toString.size()-1));
            }else if(this.instrucciones.get(this.instrucciones.size()-1).GetTipo()=="Bucle" ){
                if(this.existebloque){this.existebloque=false;}
                
                    ArrayList<String> toString=this.instrucciones.get(this.instrucciones.size()-1).toStringBucle(contador);
                    siguiente=this.finnode;
                    for(int a = 0; a<toString.size()-2;a++){
                            if(!toString.get(a).contains(";\n")){
                                salida.add(toString.get(a) + siguiente  + ";\n");
                            }else{
                                salida.add( toString.get(a));
                            }
                        }
                    gaps = gaps + toString.get(toString.size()-2) ;
                    contador = Integer.parseInt(toString.get(toString.size()-1));
                }
        /**/
        if(!modificado){
            gaps = gaps + this.finnode+ "->";
        }
        salida.add(this.finnode + " -> " + this.ininode + ";\n");
        salida.add(gaps);
        salida.add(contador+"");
        //System.out.println(salida);
        return salida;

    }

    /* ------------------------------------------------------------------------------
    ---------------------------------------------------------------------------------
    -------------Metodos para instrucciones de bifurcacion---------------------------
    ---------------------------------------------------------------------------------
    ---------------------------------------------------------------------------------*/
    public void DeclararBifurcacion(String ininode,String finnode){
        this.ininode = ininode;
        this.Bifurcaciones = new HashMap<String,  ArrayList<Instruccion>>();
        
    }

    
    
    //Añadir una nueva bifurcacion
    public void addBifurcacion(String nombre){
            if(this.InstruccionDentro){
                if(this.GetTipo()=="Bifurcacion"){
                    this.Bifurcaciones.get(this.lastkey).get(this.Bifurcaciones.get(this.lastkey).size()-1).addBifurcacion(nombre);
                }else if(this.GetTipo()=="Bucle"){
                    this.instrucciones.get(this.instrucciones.size()-1).addBifurcacion(nombre);
                }      
            }else{
                this.Bifurcaciones.put(nombre,new ArrayList<Instruccion>() );
                this.lastkey = nombre;
            }
    }


    
    public ArrayList<String> toStringBifurcacion(int contador) {
       
        
        //Funcion para escribir el .dot si la instruccion es una bifurcacion
        ArrayList<String> salida = new ArrayList<String>();
        String gaps="";
        for (String clave : this.Bifurcaciones.keySet()) {
            this.existebloque=false;
            gaps="";
            if(this.Bifurcaciones.get(clave).size() == 0){
                //Ninguna instruccion dentro
                gaps = gaps + this.ininode + "->";
            }else if(this.Bifurcaciones.get(clave).size() == 1){
                
                //Una instruccion dentro
                gaps = gaps + this.ininode + "->";
                if(this.Bifurcaciones.get(clave).get(0).GetTipo()=="Simple" ||this.Bifurcaciones.get(clave).get(0).GetTipo()=="Invocacion" ){
                    gaps = gaps + "Bloque" + contador + "->" ;
                    contador++;
                }else if(this.Bifurcaciones.get(clave).get(0).GetTipo()=="Bifurcacion" ){
                    ArrayList<String> toString=this.Bifurcaciones.get(clave).get(0).toStringBifurcacion(contador);
                    
                    for(int a = 0; a<toString.size()-2;a++){
                        salida.add(toString.get(a));
                            
                        }
                     gaps = gaps + toString.get(toString.size()-2) ;
                     
                     
                    contador = Integer.parseInt(toString.get(toString.size()-1));
                
                }else if(this.Bifurcaciones.get(clave).get(0).GetTipo()=="Bucle" ){
                    ArrayList<String> toString = this.Bifurcaciones.get(clave).get(0).toStringBucle(contador);
                    for(int a = 0; a<toString.size()-2;a++){
                           salida.add(toString.get(a));
                        }
                     gaps = gaps + toString.get(toString.size()-2) ;
                    contador = Integer.parseInt(toString.get(toString.size()-1));
                }
            }else{
                
                //Hay mas de una instruccion
                gaps = gaps + this.ininode + "->";
                for(int i = 0 ;i < this.Bifurcaciones.get(clave).size(); i++){
                    if(this.Bifurcaciones.get(clave).get(i).GetTipo()=="Simple" ||this.Bifurcaciones.get(clave).get(i).GetTipo()=="Invocacion" ){
                            if(!this.existebloque){
                                gaps = gaps + "Bloque" + contador + "->" ;
                                contador++;
                                this.existebloque=true;
                            }
                    }else if(this.Bifurcaciones.get(clave).get(i).GetTipo()=="Bifurcacion" ){
                        if(this.existebloque){this.existebloque=false;}
                        ArrayList<String> toString=this.Bifurcaciones.get(clave).get(i).toStringBifurcacion(contador);
                        for(int a = 0; a<toString.size()-2;a++){
                                salida.add(toString.get(a));
                            }
                            gaps = gaps + toString.get(toString.size()-2) ;
                            contador = Integer.parseInt(toString.get(toString.size()-1));
                    }else if(this.Bifurcaciones.get(clave).get(0).GetTipo()=="Bucle" ){
                        ArrayList<String> toString = this.Bifurcaciones.get(clave).get(i).toStringBucle(contador);
                        for(int a = 0; a<toString.size()-2;a++){
                           salida.add(toString.get(a));
                        }
                     gaps = gaps + toString.get(toString.size()-2) ;
                    contador = Integer.parseInt(toString.get(toString.size()-1));
                    }
                }
            }
            salida.add(gaps);
        }
            //System.out.println(contador);            
        
        salida.add(contador+"");
        //System.out.println(salida);
            //System.out.println("clave "+clave);
            //System.out.println("ini gap " +gaps+" fin gaps");
            //System.out.println("ini addd " +this.additional+" fin add");
        return salida;
        }
       
}
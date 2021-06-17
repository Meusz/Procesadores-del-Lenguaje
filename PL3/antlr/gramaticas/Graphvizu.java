import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.*;
import java.io.*;

/**
* Esta clase permitira crear un Fichero .dot
* y, en base a ese fichero, generar un grafo,
* haciendo uso de Graphviz
**/

public class Graphvizu extends gPseudocodigoParserBaseListener {
    private String nombreFichero, nombreFicheroHTML, nombrePrograma = "";
    private WriteDOT dotPrograma = new WriteDOT("\\Salidas\\PROGRAMAPRINCIPAL");  //DOT para el grafo del programa completo


	private String name,nombreFuncion;
	private int contador=0,contadorFunciones=-1,contadorInstruccionesComplejas=-1;
	
	private boolean funcionPrincipal=false,funcionNueva=false,cabecera=false,nombrefun=false;
    
	private ArrayList<Funcion> funciones = new ArrayList<Funcion>();//Arraylist para meter funciones
	private ArrayList<Integer> instruccionesactivas = new ArrayList<Integer>();//Arraylist para las instrucciones actualmente activas


	//Metodos de la TABLA para generar DOT
	@Override public void enterProg(gPseudocodigoParser.ProgContext ctx) {
		//escribios las primeras lineas del DOT del programa principal
		stringToDotPrograma("digraph {\n");
	}
	@Override public void exitProg(gPseudocodigoParser.ProgContext ctx) { 
		//Vamos a conectar las funciones
		int pos;
		/*		//Se conectan las funciones
		for(int i = 0;i<this.funciones.size();i++){
			if(this.funciones.get(i).LlamaFunciones() ){
				for(int a = 0;a<this.funciones.get(i).Funciones().size();a++){
					pos = PosicionFuncion(this.funciones.get(i).Funciones().get(a).get(1) );
					
					if(pos!=-1){
						
						dotPrograma.writeTextDot(this.funciones.get(i).Funciones().get(a).get(0) +" -> " +this.funciones.get(pos).getnodoINI() +";\n" );
						dotPrograma.writeTextDot(this.funciones.get(pos).getnodoFIN() +" -> " +this.funciones.get(i).Funciones().get(a).get(0) +";\n" );
					}
				}
			}
		}*/
		dotPrograma.writeTextDot("}");
		dotPrograma.escribirFicheroDot();
	}

	//Funcion principal
	@Override public void enterMain(gPseudocodigoParser.MainContext ctx) {
		//Entramos en la funcion principal
		funcionPrincipal = true;
		contadorFunciones++;
		stringToDotPrograma("    subgraph cluster_" + contadorFunciones + " {\n");
		
	 }
	@Override public void exitMain(gPseudocodigoParser.MainContext ctx) { 
		//salimos en la funcion principal
		funcionPrincipal = false;
		funciones.get(contadorFunciones).EndFun();
		stringToDotPrograma(funciones.get(contadorFunciones).getinfoDOT()+"\n}");
		this.contador = funciones.get(contadorFunciones).getContador() ;
		
	}


	@Override public void enterKwinicio(gPseudocodigoParser.KwinicioContext ctx) {cabecera = true;nombrefun=true; }

	@Override public void exitKwinicio(gPseudocodigoParser.KwinicioContext ctx) {
		this.funciones.add(new Funcion(nombreFuncion, 0, contador));
		cabecera = false; }

	//funciones auxiliares
	@Override public void enterDeffuncion(gPseudocodigoParser.DeffuncionContext ctx) {
		//Entramos en la funcion auxiliar
		funcionNueva = true;
		
		contadorFunciones++;
		stringToDotPrograma("\tsubgraph cluster_" + contadorFunciones + " {\n");
	 }

	@Override public void exitDeffuncion(gPseudocodigoParser.DeffuncionContext ctx) {
		funcionNueva = false;
		funciones.get(contadorFunciones).EndFun();
		stringToDotPrograma(funciones.get(contadorFunciones).getinfoDOT()+"\n}");
		this.contador = funciones.get(contadorFunciones).getContador() ;
	 }
	@Override public void enterCabecera(gPseudocodigoParser.CabeceraContext ctx) {
		cabecera = true;nombrefun=true; 
	}

	@Override public void exitCabecera(gPseudocodigoParser.CabeceraContext ctx) { 
		this.funciones.add(new Funcion(nombreFuncion, 0, contador));
		cabecera = false;
	}
	
	
	
	//NOMBRE DE LA FUNCION
	//Enlazar funciones
	@Override public void enterInvocafuncion(gPseudocodigoParser.InvocafuncionContext ctx) {
		 nombrefun=true;	 
	  }
	@Override public void exitInvocafuncion(gPseudocodigoParser.InvocafuncionContext ctx) {
		if(this.instruccionesactivas.size()>0){
			
			int ultimainsactiva = this.instruccionesactivas.get(this.instruccionesactivas.size()-1);
			funciones.get(contadorFunciones).addInstruccionaInstruccion(ultimainsactiva,new Instruccion("Invocacion",nombreFuncion ));
		}else{
			
			funciones.get(contadorFunciones).addInstruccion(new Instruccion("Invocacion",nombreFuncion)); 
		}	
		
	 }

	@Override public void enterId(gPseudocodigoParser.IdContext ctx) {
		if(nombrefun){
		this.name = ctx.getText();
		this.nombreFuncion = ctx.getText();
		
		nombrefun=false;
		}
	 }

	
	/* ------------------------------------------------------------------------------
    ---------------------------------------------------------------------------------
    -------------Metodos para instrucciones simples---------------------------
    ---------------------------------------------------------------------------------
    ---------------------------------------------------------------------------------*/

	@Override public void enterEntrada(gPseudocodigoParser.EntradaContext ctx) {
		if(this.instruccionesactivas.size()>0){
			int ultimainsactiva = this.instruccionesactivas.get(this.instruccionesactivas.size()-1);
			funciones.get(contadorFunciones).addInstruccionaInstruccion(ultimainsactiva,new Instruccion("Simple","Entrada"));
		}else{
			funciones.get(contadorFunciones).addInstruccion(new Instruccion("Simple","Entrada")); }

		}

	@Override public void enterSalidas(gPseudocodigoParser.SalidasContext ctx) {
		if(this.instruccionesactivas.size()>0){
			
			int ultimainsactiva = this.instruccionesactivas.get(this.instruccionesactivas.size()-1);
			funciones.get(contadorFunciones).addInstruccionaInstruccion(ultimainsactiva,new Instruccion("Simple","Salidas"));
		}else{
			funciones.get(contadorFunciones).addInstruccion(new Instruccion("Simple","Salidas")); }

		}

	@Override public void enterDimensionamiento(gPseudocodigoParser.DimensionamientoContext ctx) {
		if(this.instruccionesactivas.size()>0){
			int ultimainsactiva = this.instruccionesactivas.get(this.instruccionesactivas.size()-1);
			funciones.get(contadorFunciones).addInstruccionaInstruccion(ultimainsactiva,new Instruccion("Simple","Dimensionamiento"));
		}else{
			funciones.get(contadorFunciones).addInstruccion(new Instruccion("Simple","Dimensionamiento")); }

		}

	@Override public void enterDefinir(gPseudocodigoParser.DefinirContext ctx) {
		if(this.instruccionesactivas.size()>0){
			int ultimainsactiva = this.instruccionesactivas.get(this.instruccionesactivas.size()-1);
			funciones.get(contadorFunciones).addInstruccionaInstruccion(ultimainsactiva,new Instruccion("Simple","Definir"));
		}else{
			funciones.get(contadorFunciones).addInstruccion(new Instruccion("Simple","Definir")); }

		}
		

	@Override public void enterAsignacion(gPseudocodigoParser.AsignacionContext ctx) {
		if(this.instruccionesactivas.size()>0){
			int ultimainsactiva = this.instruccionesactivas.get(this.instruccionesactivas.size()-1);
			funciones.get(contadorFunciones).addInstruccionaInstruccion(ultimainsactiva,new Instruccion("Simple","Asignacion"));
		}else{
			funciones.get(contadorFunciones).addInstruccion(new Instruccion("Simple","Asignacion")); }

	}

	


	/* ------------------------------------------------------------------------------
    ---------------------------------------------------------------------------------
    -------------Metodos para instrucciones de bifurcacion---------------------------
    ---------------------------------------------------------------------------------
    ---------------------------------------------------------------------------------*/
    
	//INTRUCCIONES DE CONDICIONAL SI
	@Override public void enterCondicional(gPseudocodigoParser.CondicionalContext ctx) {
		this.contadorInstruccionesComplejas++;
		Instruccion Instru = new Instruccion("Bifurcacion", "Condicional");
		Instru.DeclararBifurcacion("Condicionalsi"+contadorInstruccionesComplejas,"Finsi"+contadorInstruccionesComplejas);
		if(this.instruccionesactivas.size()>0){
			
			int ultimainsactiva = this.instruccionesactivas.get(this.instruccionesactivas.size()-1);
			funciones.get(contadorFunciones).addInstruccionaInstruccion(ultimainsactiva,Instru);
		}else{
			funciones.get(contadorFunciones).addInstruccion(Instru); 
			this.instruccionesactivas.add(funciones.get(contadorFunciones).getNumUltimaInstruccion());
		
			}
		}
	@Override public void exitCondicional(gPseudocodigoParser.CondicionalContext ctx) { 
		int ultimainsactiva = this.instruccionesactivas.get(this.instruccionesactivas.size()-1);
			if(!funciones.get(contadorFunciones).CerrarInstruccionCompleja(ultimainsactiva)){
				this.instruccionesactivas.remove(this.instruccionesactivas.size()-1);
			}
	}


	@Override public void enterSino(gPseudocodigoParser.SinoContext ctx) { 
		int ultimainsactiva = this.instruccionesactivas.get(this.instruccionesactivas.size()-1);
		
		funciones.get(contadorFunciones).annadirBifurcacion(ultimainsactiva,ctx.getText() );
	}

	@Override public void enterSi(gPseudocodigoParser.SiContext ctx) { 
		int ultimainsactiva = this.instruccionesactivas.get(this.instruccionesactivas.size()-1);
		funciones.get(contadorFunciones).annadirBifurcacion(ultimainsactiva,ctx.getText() );
	}
	//SELECCION MULTIPLE SEGUN
	@Override public void enterSeleccionmultiple(gPseudocodigoParser.SeleccionmultipleContext ctx) {
		
		this.contadorInstruccionesComplejas++;
		Instruccion Instru = new Instruccion("Bifurcacion", "SeleccionMultiple");
		Instru.DeclararBifurcacion("Segun"+contadorInstruccionesComplejas,"FinSegun"+contadorInstruccionesComplejas);
		if(this.instruccionesactivas.size()>0){
			
			int ultimainsactiva = this.instruccionesactivas.get(this.instruccionesactivas.size()-1);
			funciones.get(contadorFunciones).addInstruccionaInstruccion(ultimainsactiva,Instru);
		}else{
			funciones.get(contadorFunciones).addInstruccion(Instru); 
			this.instruccionesactivas.add(funciones.get(contadorFunciones).getNumUltimaInstruccion());
			}
	 }
	
	@Override public void exitSeleccionmultiple(gPseudocodigoParser.SeleccionmultipleContext ctx) {
		
		int ultimainsactiva = this.instruccionesactivas.get(this.instruccionesactivas.size()-1);
			if(!funciones.get(contadorFunciones).CerrarInstruccionCompleja(ultimainsactiva)){
				this.instruccionesactivas.remove(this.instruccionesactivas.size()-1);
			}
	 }

	 @Override public void enterValor(gPseudocodigoParser.ValorContext ctx) {
		 
		 int ultimainsactiva = this.instruccionesactivas.get(this.instruccionesactivas.size()-1);
		funciones.get(contadorFunciones).annadirBifurcacion(ultimainsactiva,ctx.getText() );
	  }

	 @Override public void enterKwdeotromodo(gPseudocodigoParser.KwdeotromodoContext ctx){
		 int ultimainsactiva = this.instruccionesactivas.get(this.instruccionesactivas.size()-1);
		funciones.get(contadorFunciones).annadirBifurcacion(ultimainsactiva,ctx.getText() );
	  }

	/* ------------------------------------------------------------------------------
    ---------------------------------------------------------------------------------
    -------------Metodos para instrucciones de bucles---------------------------
    ---------------------------------------------------------------------------------
    ---------------------------------------------------------------------------------*/
    //LAZOS PARA
	@Override public void enterLazospara(gPseudocodigoParser.LazosparaContext ctx) { 
		this.contadorInstruccionesComplejas++;
		Instruccion Instru = new Instruccion("Bucle", "LazosPara");
		Instru.DeclararBucle("Para"+contadorInstruccionesComplejas,"FinPara"+contadorInstruccionesComplejas);
		if(this.instruccionesactivas.size()>0){
			
			int ultimainsactiva = this.instruccionesactivas.get(this.instruccionesactivas.size()-1);
			funciones.get(contadorFunciones).addInstruccionaInstruccion(ultimainsactiva,Instru);
		}else{
			funciones.get(contadorFunciones).addInstruccion(Instru); 
			this.instruccionesactivas.add(funciones.get(contadorFunciones).getNumUltimaInstruccion());
			}

	}
	
	@Override public void exitLazospara(gPseudocodigoParser.LazosparaContext ctx) { 
		int ultimainsactiva = this.instruccionesactivas.get(this.instruccionesactivas.size()-1);
			if(!funciones.get(contadorFunciones).CerrarInstruccionCompleja(ultimainsactiva)){
				this.instruccionesactivas.remove(this.instruccionesactivas.size()-1);
			}
	}

	//FOR
	@Override public void enterRepetir(gPseudocodigoParser.RepetirContext ctx) {
		this.contadorInstruccionesComplejas++;
		Instruccion Instru = new Instruccion("Bucle", "Repetir");
		Instru.DeclararBucle("Repetir"+contadorInstruccionesComplejas,"HastaQue"+contadorInstruccionesComplejas);
		if(this.instruccionesactivas.size()>0){
			
			int ultimainsactiva = this.instruccionesactivas.get(this.instruccionesactivas.size()-1);
			funciones.get(contadorFunciones).addInstruccionaInstruccion(ultimainsactiva,Instru);
		}else{
			funciones.get(contadorFunciones).addInstruccion(Instru); 
			this.instruccionesactivas.add(funciones.get(contadorFunciones).getNumUltimaInstruccion());
			}
	 }
	
	@Override public void exitRepetir(gPseudocodigoParser.RepetirContext ctx) {
		int ultimainsactiva = this.instruccionesactivas.get(this.instruccionesactivas.size()-1);
			if(!funciones.get(contadorFunciones).CerrarInstruccionCompleja(ultimainsactiva)){
				this.instruccionesactivas.remove(this.instruccionesactivas.size()-1);
			}
	 }
	
	//WHILE
	@Override public void enterMientras(gPseudocodigoParser.MientrasContext ctx) {
		this.contadorInstruccionesComplejas++;
		Instruccion Instru = new Instruccion("Bucle", "Mientras");
		Instru.DeclararBucle("Mientras"+contadorInstruccionesComplejas,"FinMientras"+contadorInstruccionesComplejas);
		if(this.instruccionesactivas.size()>0){
			
			int ultimainsactiva = this.instruccionesactivas.get(this.instruccionesactivas.size()-1);
			funciones.get(contadorFunciones).addInstruccionaInstruccion(ultimainsactiva,Instru);
		}else{
			funciones.get(contadorFunciones).addInstruccion(Instru); 
			this.instruccionesactivas.add(funciones.get(contadorFunciones).getNumUltimaInstruccion());
			}
	 }
	
	@Override public void exitMientras(gPseudocodigoParser.MientrasContext ctx) {
		int ultimainsactiva = this.instruccionesactivas.get(this.instruccionesactivas.size()-1);
			if(!funciones.get(contadorFunciones).CerrarInstruccionCompleja(ultimainsactiva)){
				this.instruccionesactivas.remove(this.instruccionesactivas.size()-1);
			}
	 }



	/** METODOS PARA GENERAR DOT */


	private void stringToDotPrograma(String cadena) {
        /*Metodo para escribir en el DOT del programa*/
		dotPrograma.writeTextDot(cadena);
	}

	private void crearLineaGrafo(String nombre) {
		stringToDotPrograma("linea" + nombre + " -> ");
	}	 

	//Metodos auxiliares

	private int PosicionFuncion(String nombre){
		
		for(int i = 0;i<this.funciones.size();i++){
			if(this.funciones.get(i).Getnombre().equals(nombre)  ){
				return i;
			}
		}
		return -1;
	}
}
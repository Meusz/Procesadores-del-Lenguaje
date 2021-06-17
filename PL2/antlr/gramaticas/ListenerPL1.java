//Esta clase viene dada por gPseudocodigoParserBaseListener.java
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

//File outputs import 
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;


public class ListenerPL1 extends gPseudocodigoParserBaseListener{
    private String ListaDirectorios="/";
	private int Linea = 0;
	private File archivo = new File("Resultado.txt");
	private FileWriter writer;
	private BufferedWriter salida;

	public ListenerPL1(){
		//Inicializamos el Fichero
		try {
            crearFichero(archivo);
            writer = new FileWriter(archivo);
            salida = new BufferedWriter(writer);
        } catch (IOException ex) {
            Logger.getLogger(ListenerPL1.class.getName()).log(Level.SEVERE, null, ex);
        }
	}
	//Funciones relacionadas con el fichero
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
	
    private void avanzardirectorio(String directorio) {
		if (!directorio.equals("") && !directorio.equals(" ") && directorio!=null ){
			//System.out.println("Avanzo con : \""+directorio+"\" ");
			this.ListaDirectorios=this.ListaDirectorios+directorio+"/";
		}
        
    }
    private void retrocederdirectorio(){
        String[] directorios=ListaDirectorios.split("/");
		this.ListaDirectorios="/";
		//System.out.println("volviendo   ");
        for(int i = 0 ; i<directorios.length -1;i++){
            avanzardirectorio(directorios[i]);
		}
    }


    @Override public void enterProg(gPseudocodigoParser.ProgContext ctx) {avanzardirectorio("prog");}
	
	@Override public void enterMain(gPseudocodigoParser.MainContext ctx) {avanzardirectorio("main"); }
 
     @Override public void enterInstrucciones(gPseudocodigoParser.InstruccionesContext ctx) {avanzardirectorio("instrucciones"); }

     @Override public void enterDefinir(gPseudocodigoParser.DefinirContext ctx) {avanzardirectorio("definir"); }
     
     @Override public void enterAsignacion(gPseudocodigoParser.AsignacionContext ctx) { avanzardirectorio("asignacion");}
     
     @Override public void enterEntrada(gPseudocodigoParser.EntradaContext ctx) { avanzardirectorio("entrada");}
     
     @Override public void enterSalidas(gPseudocodigoParser.SalidasContext ctx) { avanzardirectorio("salidas");}
     
     @Override public void enterDimensionamiento(gPseudocodigoParser.DimensionamientoContext ctx) { avanzardirectorio("dimensionamiento");}
     
     @Override public void enterCondicional(gPseudocodigoParser.CondicionalContext ctx) { avanzardirectorio("condicional");}
     
     @Override public void enterSino(gPseudocodigoParser.SinoContext ctx) {avanzardirectorio("prog"); }
     
     @Override public void enterSi(gPseudocodigoParser.SiContext ctx) {avanzardirectorio("si"); }
     
     @Override public void enterSeleccionmultiple(gPseudocodigoParser.SeleccionmultipleContext ctx) {avanzardirectorio("seleccionmultiple"); }
     
     @Override public void enterInstruccion(gPseudocodigoParser.InstruccionContext ctx) {avanzardirectorio("instruccion"); }
     
     @Override public void enterDeotromodo(gPseudocodigoParser.DeotromodoContext ctx) {avanzardirectorio("deotromodo"); }
     
     @Override public void enterMientras(gPseudocodigoParser.MientrasContext ctx) {avanzardirectorio("mientras"); }
     
     @Override public void enterRepetir(gPseudocodigoParser.RepetirContext ctx) {avanzardirectorio("repetir"); }
     
     @Override public void enterHastaque(gPseudocodigoParser.HastaqueContext ctx) { avanzardirectorio("hastaque");}
     
	 @Override public void enterLazospara(gPseudocodigoParser.LazosparaContext ctx) {avanzardirectorio("lazospara"); }
	 
	 @Override public void enterDeffuncion(gPseudocodigoParser.DeffuncionContext ctx) {avanzardirectorio("deffuncion"); }
     
    @Override public void enterExprlogica(gPseudocodigoParser.ExprlogicaContext ctx) {avanzardirectorio("exprlogical"); }

     @Override public void enterExpr(gPseudocodigoParser.ExprContext ctx) {avanzardirectorio("expr"); }
    
     @Override public void enterArray(gPseudocodigoParser.ArrayContext ctx) {avanzardirectorio("array"); }

     @Override public void enterKwinicio(gPseudocodigoParser.KwinicioContext ctx) {avanzardirectorio("kwinicio"); }
	
	@Override public void enterKwfin(gPseudocodigoParser.KwfinContext ctx) {avanzardirectorio("kwfin"); }
	
	@Override public void enterKwini(gPseudocodigoParser.KwiniContext ctx) {avanzardirectorio("kwini"); }
	
	@Override public void enterKwdefinir(gPseudocodigoParser.KwdefinirContext ctx) {avanzardirectorio("kwdefinir"); }
	
	@Override public void enterKwcomo(gPseudocodigoParser.KwcomoContext ctx) {avanzardirectorio("kwcomo"); }
	
	@Override public void enterKwflecha(gPseudocodigoParser.KwflechaContext ctx) {avanzardirectorio("kwflecha"); }
	
	@Override public void enterKwdimension(gPseudocodigoParser.KwdimensionContext ctx) {avanzardirectorio("kwdimension"); }
	
	@Override public void enterKwleer(gPseudocodigoParser.KwleerContext ctx) {avanzardirectorio("kwleer"); }
	
	@Override public void enterKwescribir(gPseudocodigoParser.KwescribirContext ctx) { avanzardirectorio("kwescribir");}
	
	@Override public void enterKwcierrasi(gPseudocodigoParser.KwcierrasiContext ctx) {avanzardirectorio("kwcierrasi"); }
	
	@Override public void enterKwsino(gPseudocodigoParser.KwsinoContext ctx) {avanzardirectorio("kwsino"); }
	
	@Override public void enterKwentonces(gPseudocodigoParser.KwentoncesContext ctx) {avanzardirectorio("kwentonces"); }
	
	@Override public void enterKwsi(gPseudocodigoParser.KwsiContext ctx) {avanzardirectorio("kwsi"); }
	
	@Override public void enterKwdeotromodo(gPseudocodigoParser.KwdeotromodoContext ctx) {avanzardirectorio("kwdeotromodo"); }
	
	@Override public void enterKwfinsegun(gPseudocodigoParser.KwfinsegunContext ctx) {avanzardirectorio("kwfinsegun"); }
	
	@Override public void enterKwsegun(gPseudocodigoParser.KwsegunContext ctx) {avanzardirectorio("kwsegun"); }
	
	@Override public void enterKwhacer(gPseudocodigoParser.KwhacerContext ctx) {avanzardirectorio("kwhacer"); }
	
	@Override public void enterKwfinmientras(gPseudocodigoParser.KwfinmientrasContext ctx) {avanzardirectorio("kwfinmientras"); }
	
	@Override public void enterKwmientras(gPseudocodigoParser.KwmientrasContext ctx) {avanzardirectorio("kwmientras"); }
	
	@Override public void enterKwrepetir(gPseudocodigoParser.KwrepetirContext ctx) {avanzardirectorio("kwrepetir"); }
	
	@Override public void enterKwhastaque(gPseudocodigoParser.KwhastaqueContext ctx) {avanzardirectorio("kwhastaque"); }
	
	@Override public void enterKwfinpara(gPseudocodigoParser.KwfinparaContext ctx) {avanzardirectorio("kwfinpara"); }
	
	@Override public void enterKwpara(gPseudocodigoParser.KwparaContext ctx) {avanzardirectorio("kwpara"); }
	
	@Override public void enterKwhasta(gPseudocodigoParser.KwhastaContext ctx) {avanzardirectorio("kwhasta"); }
	
	@Override public void enterKwconpaso(gPseudocodigoParser.KwconpasoContext ctx) {avanzardirectorio("kwconpaso"); }

	@Override public void enterKwfuncion(gPseudocodigoParser.KwfuncionContext ctx) {avanzardirectorio("kwconpaso"); }

	@Override public void enterInvocafuncion(gPseudocodigoParser.InvocafuncionContext ctx) {avanzardirectorio("invocafuncion"); }

	@Override public void enterKwfinfuncion(gPseudocodigoParser.KwfinfuncionContext ctx) {avanzardirectorio("kwfinfuncion"); }
	
	@Override public void enterOperadorrel(gPseudocodigoParser.OperadorrelContext ctx) {avanzardirectorio("operadorrel"); }
	
	@Override public void enterOperadorlog(gPseudocodigoParser.OperadorlogContext ctx) {avanzardirectorio("operadorlog"); }
	
	@Override public void enterConjuncion(gPseudocodigoParser.ConjuncionContext ctx) {avanzardirectorio("conjuncion"); }
	
	@Override public void enterDisyuncion(gPseudocodigoParser.DisyuncionContext ctx) {avanzardirectorio("disyuncion"); }
	
	@Override public void enterNegacion(gPseudocodigoParser.NegacionContext ctx) {avanzardirectorio("negacion"); }
	
	@Override public void enterOperadoralge(gPseudocodigoParser.OperadoralgeContext ctx) {avanzardirectorio("operadoralge"); }
	
	@Override public void enterSuma(gPseudocodigoParser.SumaContext ctx) {avanzardirectorio("suma"); }
	
	@Override public void enterResta(gPseudocodigoParser.RestaContext ctx) {avanzardirectorio("resta"); }
	
	@Override public void enterMultiplicacion(gPseudocodigoParser.MultiplicacionContext ctx) {avanzardirectorio("multiplicacion"); }
	
	@Override public void enterDivision(gPseudocodigoParser.DivisionContext ctx) {avanzardirectorio("division"); }
	
	@Override public void enterPotenciacion(gPseudocodigoParser.PotenciacionContext ctx) {avanzardirectorio("potenciacion"); }
	
	@Override public void enterModulo(gPseudocodigoParser.ModuloContext ctx) {avanzardirectorio("modulo"); }
	
	@Override public void enterOperadorseparador(gPseudocodigoParser.OperadorseparadorContext ctx) {avanzardirectorio("operadorseparador"); }
	
	@Override public void enterComa(gPseudocodigoParser.ComaContext ctx) {avanzardirectorio("coma"); }
	
	@Override public void enterBarrabaja(gPseudocodigoParser.BarrabajaContext ctx) {avanzardirectorio("barrabaja"); }
	
	@Override public void enterFunciones(gPseudocodigoParser.FuncionesContext ctx) {avanzardirectorio("funciones"); }
	
	@Override public void enterRc(gPseudocodigoParser.RcContext ctx) {avanzardirectorio("rc"); }
	
	@Override public void enterAbs(gPseudocodigoParser.AbsContext ctx) {avanzardirectorio("abs"); }
	
	@Override public void enterLn(gPseudocodigoParser.LnContext ctx) {avanzardirectorio("ln"); }
	
	@Override public void enterExp(gPseudocodigoParser.ExpContext ctx) {avanzardirectorio("exp"); }
	
	@Override public void enterSen(gPseudocodigoParser.SenContext ctx) {avanzardirectorio("sen"); }
	
	@Override public void enterCos(gPseudocodigoParser.CosContext ctx) {avanzardirectorio("cos"); }
	
	@Override public void enterAtan(gPseudocodigoParser.AtanContext ctx) {avanzardirectorio("atan"); }
	
	@Override public void enterTrunc(gPseudocodigoParser.TruncContext ctx) { avanzardirectorio("trunc");}
	
	@Override public void enterRedon(gPseudocodigoParser.RedonContext ctx) {avanzardirectorio("redon"); }
	
	@Override public void enterAzar(gPseudocodigoParser.AzarContext ctx) {avanzardirectorio("azar"); }
	
	@Override public void enterTipo(gPseudocodigoParser.TipoContext ctx) {avanzardirectorio("tipo"); }
	
	@Override public void enterReal(gPseudocodigoParser.RealContext ctx) {avanzardirectorio("real"); }
	
	@Override public void enterEntero(gPseudocodigoParser.EnteroContext ctx) {avanzardirectorio("entero"); }
	
	@Override public void enterBool(gPseudocodigoParser.BoolContext ctx) {avanzardirectorio("bool"); }
	
	@Override public void enterString(gPseudocodigoParser.StringContext ctx) {avanzardirectorio("string"); }
	
	@Override public void enterId(gPseudocodigoParser.IdContext ctx) {avanzardirectorio("id"); }

	@Override public void enterComentario(gPseudocodigoParser.ComentarioContext ctx) {avanzardirectorio("comentario"); }
	
	@Override public void enterDospuntos(gPseudocodigoParser.DospuntosContext ctx) {avanzardirectorio("dospuntos"); }
	
	@Override public void enterPi(gPseudocodigoParser.PiContext ctx) {avanzardirectorio("pi"); }
	
	@Override public void enterPd(gPseudocodigoParser.PdContext ctx) {avanzardirectorio("pd"); }
	
	@Override public void enterCi(gPseudocodigoParser.CiContext ctx) { avanzardirectorio("ci");}
	
	@Override public void enterCd(gPseudocodigoParser.CdContext ctx) {avanzardirectorio("cd"); }
	
	@Override public void enterPuntoycoma(gPseudocodigoParser.PuntoycomaContext ctx) {avanzardirectorio("puntoycoma"); }
	

	@Override public void exitEveryRule(ParserRuleContext ctx)  {retrocederdirectorio(); }
	
	@Override public void visitErrorNode(ErrorNode node) { 
		try{
			salida.write(ListaDirectorios + node.getSymbol().getText());
			salida.write("\tError en la linea "+Linea+" se esperaba otro token en vez de \'");
			salida.write(node.getSymbol().getText() +"\'");
			salida.newLine();
		} catch (IOException ex) {
            Logger.getLogger(ListenerPL1.class.getName()).log(Level.SEVERE, null, ex);
        }
		this.Linea++;
	}


    @Override
    public void visitTerminal(TerminalNode node) { 
		ANTLRInputStream input = new ANTLRInputStream(node.getSymbol().getText() );
		gPseudocodigoLexer lexer = new gPseudocodigoLexer(input );
		//CommonTokenStream tokens = new CommonTokenStream(lexer);
		try{
		salida.write( ListaDirectorios + lexer.getVocabulary().getSymbolicName( node.getSymbol().getType()) );
		salida.newLine();
		} catch (IOException ex) {
            Logger.getLogger(ListenerPL1.class.getName()).log(Level.SEVERE, null, ex);
        }
		this.Linea++;
    }


}
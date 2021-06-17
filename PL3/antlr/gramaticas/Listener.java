import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

//import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;

import java.util.*;
import java.io.*;

/**
* Esta clase permitira crear un Fichero .dot
* y, en base a ese fichero, generar un grafo,
* haciendo uso de Graphviz
**/

public class Listener extends gPseudocodigoParserBaseListener {
    private String nombreFichero, nombreFicheroHTML, nombrePrograma = "", funcionPrincipal,retorno="void";
	private EscribirHTML html = new EscribirHTML();
	private long sumLines,sum=0;
	private int CiclomaticaTotal=0,argumentos=0;
	private Stack<String> pila = new Stack<String>();
	private ArrayList<String> pilaimprimir = new ArrayList<String>();

	private Tabla tabla = new Tabla();
	private String name, nombreFuncion;
	private String parametros = "";
	private boolean cabecera=false,nombrefun=false, definiendo=false;
	private HashMap<String, ArrayList<Integer>> lineasLlamadas = new HashMap<String, ArrayList<Integer>>();

	private boolean funcionNueva = false, esParametroFuncion = false, esLlamadaFuncion = false, esDeclaracion = false,
			tieneParametros = false;
	private int contadorLineas = 0, contadorParametros = 0;

	private ArrayList<Long> listaPuntosBucleBifurcacion = new ArrayList<Long>();

    private ArrayList<Integer> lineasCabecerasBucles = new ArrayList<Integer>();
	private ArrayList<Bucle> listaBucles = new ArrayList<Bucle>();
	private ArrayList<Bucle> listaBuclesFuncion = new ArrayList<Bucle>();
	private ArrayList<String> dotBucles = new ArrayList<String>();

    /** METODOS PARA LA PILA */
	@Override
	public void enterEveryRule(final ParserRuleContext ctx) {
		pila.push(gPseudocodigoParser.ruleNames[ctx.getRuleIndex()]);
		for (int i = 0; i < pila.size(); i++) {
			pilaimprimir.add('/' + pila.get(i));
		}
        pilaimprimir.add("\n");
    }
    
	@Override public void exitProg(gPseudocodigoParser.ProgContext ctx) {
		obtenerHTML();
		html.escribirFicheroHTML(nombreFicheroHTML);
	 }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterMain(gPseudocodigoParser.MainContext ctx) {
		funcionNueva = true;
		int contador = tabla.countKeys(); 
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitMain(gPseudocodigoParser.MainContext ctx) {
		tabla.getTablaFunciones().get(name).setUltimaLinea(contadorLineas - 1);
	 }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterInstrucciones(gPseudocodigoParser.InstruccionesContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitInstrucciones(gPseudocodigoParser.InstruccionesContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterDefinir(gPseudocodigoParser.DefinirContext ctx) {
		if (!listaPuntosBucleBifurcacion.isEmpty()) {
			sumValorBucleBifurcacion();
		} /*else {
			if (!funcionNueva) {
				Function temp = tabla.getTablaFunciones().get(name);
				temp.AumentarNumberVariables();
				temp.setVariablePoints(temp.getVariablePoints() + 1);
				tabla.setFunction(name, temp);
			}
		}*/
	definiendo = true;
	
		
	 }


	@Override public void exitDefinir(gPseudocodigoParser.DefinirContext ctx) { 
		if (esLlamadaFuncion) {
			esDeclaracion = false;
		}
		definiendo = false;
	}

	@Override public void enterAsignacion(gPseudocodigoParser.AsignacionContext ctx) {
		
		sumarPuntoLineaEfectiva();
	 }

	@Override public void exitAsignacion(gPseudocodigoParser.AsignacionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterEntrada(gPseudocodigoParser.EntradaContext ctx) {
		sumarPuntoLineaEfectiva();
	 }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitEntrada(gPseudocodigoParser.EntradaContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterSalidas(gPseudocodigoParser.SalidasContext ctx) {
		sumarPuntoLineaEfectiva();
	 }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitSalidas(gPseudocodigoParser.SalidasContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterDimensionamiento(gPseudocodigoParser.DimensionamientoContext ctx) { 
		sumarPuntoLineaEfectiva();
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitDimensionamiento(gPseudocodigoParser.DimensionamientoContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterCondicional(gPseudocodigoParser.CondicionalContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitCondicional(gPseudocodigoParser.CondicionalContext ctx) { 
		terminarBucleBifurcacion();
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterSino(gPseudocodigoParser.SinoContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitSino(gPseudocodigoParser.SinoContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterSi(gPseudocodigoParser.SiContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitSi(gPseudocodigoParser.SiContext ctx) {
		sumarPuntoLineaEfectiva();
	 }

	
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitSeleccionmultiple(gPseudocodigoParser.SeleccionmultipleContext ctx) { 
		terminarBucleBifurcacion();
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterInstruccion(gPseudocodigoParser.InstruccionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitInstruccion(gPseudocodigoParser.InstruccionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterValor(gPseudocodigoParser.ValorContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitValor(gPseudocodigoParser.ValorContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterDeotromodo(gPseudocodigoParser.DeotromodoContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitDeotromodo(gPseudocodigoParser.DeotromodoContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterMientras(gPseudocodigoParser.MientrasContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitMientras(gPseudocodigoParser.MientrasContext ctx) { 
		Bucle temp = listaBucles.get(listaBucles.size() - 1);
		Bucle temp2 = listaBuclesFuncion.get(listaBuclesFuncion.size() - 1);
		temp.setLineaFinal(contadorLineas - 1);
		temp2.setLineaFinal(contadorLineas - 1);
		listaBucles.set(listaBucles.size() - 1, temp);
		listaBuclesFuncion.set(listaBuclesFuncion.size() - 1, temp2);
		dotBucles.add(listaBucles.get(listaBucles.size() - 1).finalToInicio());
		dotBucles.add(listaBucles.get(listaBucles.size() - 1).noEntraBucle());
		listaBucles.remove(listaBucles.size() - 1);
		lineasCabecerasBucles.remove(lineasCabecerasBucles.size() - 1);
		terminarBucleBifurcacion();
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterRepetir(gPseudocodigoParser.RepetirContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitRepetir(gPseudocodigoParser.RepetirContext ctx) { 
		Bucle temp = listaBucles.get(listaBucles.size() - 1);
		Bucle temp2 = listaBuclesFuncion.get(listaBuclesFuncion.size() - 1);
		temp.setLineaFinal(contadorLineas - 1);
		temp2.setLineaFinal(contadorLineas - 1);
		//listaBucles.remove(listaBucles.size() - 1);
		//listaBucles.add(temp);
		listaBucles.set(listaBucles.size() - 1, temp);
		listaBuclesFuncion.set(listaBuclesFuncion.size() - 1, temp2);
		dotBucles.add(listaBucles.get(listaBucles.size() - 1).finalToInicio());
		dotBucles.add(listaBucles.get(listaBucles.size() - 1).noEntraBucle());
		listaBucles.remove(listaBucles.size() - 1);
		lineasCabecerasBucles.remove(lineasCabecerasBucles.size() - 1);
		terminarBucleBifurcacion();
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterHastaque(gPseudocodigoParser.HastaqueContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitHastaque(gPseudocodigoParser.HastaqueContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterLazospara(gPseudocodigoParser.LazosparaContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitLazospara(gPseudocodigoParser.LazosparaContext ctx) { 
		Bucle temp = listaBucles.get(listaBucles.size() - 1);
		Bucle temp2 = listaBuclesFuncion.get(listaBuclesFuncion.size() - 1);
		temp.setLineaFinal(contadorLineas - 1);
		temp2.setLineaFinal(contadorLineas - 1);
		listaBucles.set(listaBucles.size() - 1, temp);
		listaBuclesFuncion.set(listaBuclesFuncion.size() - 1, temp2);
		dotBucles.add(listaBucles.get(listaBucles.size() - 1).finalToInicio());
		dotBucles.add(listaBucles.get(listaBucles.size() - 1).noEntraBucle());
		listaBucles.remove(listaBucles.size() - 1);
		lineasCabecerasBucles.remove(lineasCabecerasBucles.size() - 1);
		terminarBucleBifurcacion();
	}


	@Override public void enterDeffuncion(gPseudocodigoParser.DeffuncionContext ctx) {
		funcionNueva = true;
		int contador = tabla.countKeys();
	 }

	@Override public void exitDeffuncion(gPseudocodigoParser.DeffuncionContext ctx) { 
		tabla.getTablaFunciones().get(name).setUltimaLinea(contadorLineas - 1);
	}



	@Override public void enterCabecera(gPseudocodigoParser.CabeceraContext ctx) { 
		cabecera = true;nombrefun=true; 

	}

	@Override public void exitCabecera(gPseudocodigoParser.CabeceraContext ctx) {
		Function temp = new Function();
		temp.setVariablePoints(temp.getVariablePoints() + contadorParametros);
		temp.setParameterCallsPoints(temp.getParemeterCallsPoints() + (contadorParametros * 2));
		temp.setNumberParameters(temp.getNumberParameters() + contadorParametros);
		temp.setNombreFuncion(nombreFuncion);
		temp.setRetorno(retorno);
		temp.setNumArgumentos(argumentos);
		this.argumentos=0;
		tabla.addFunction(name, temp);

		parametros = "";
		contadorParametros = 0;

		esParametroFuncion = false;

		tabla.getTablaFunciones().get(name).setPrimeraLinea(contadorLineas);

		if (tieneParametros) {
			sumarPuntoLineaEfectiva();
			tieneParametros = false;
		}
		cabecera = false;
	 }

	
	@Override public void enterExprlogica(gPseudocodigoParser.ExprlogicaContext ctx) { 
		tabla.getTablaFunciones().get(name).AumentarCiclomatica();
		CiclomaticaTotal++;
	}
	@Override public void enterSeleccionmultiple(gPseudocodigoParser.SeleccionmultipleContext ctx) {
		tabla.getTablaFunciones().get(name).AumentarCiclomatica();
		CiclomaticaTotal++;
	 }
	

	@Override public void enterExpr(gPseudocodigoParser.ExprContext ctx) {
		if (funcionNueva && esParametroFuncion) {
			contadorParametros++;
			parametros += ctx.getText() + ", ";

			esParametroFuncion = false;
			tieneParametros = true;
		}
		if (!listaPuntosBucleBifurcacion.isEmpty()) {
			if (esLlamadaFuncion) {
				sumValorBucleBifurcacion();
			}
		} else {
			if (esLlamadaFuncion && !esDeclaracion) {
				Function temp = tabla.getTablaFunciones().get(name);
				temp.setFunctionCallsPoints(temp.getFunctionCallsPoints() + 1);
				tabla.setFunction(name, temp);
			}
		}
	 }

	@Override public void exitExpr(gPseudocodigoParser.ExprContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterArray(gPseudocodigoParser.ArrayContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitArray(gPseudocodigoParser.ArrayContext ctx) { }


	@Override public void enterKwinicio(gPseudocodigoParser.KwinicioContext ctx) { 
		cabecera = true;nombrefun=true;
		
		
		
	}

	@Override public void enterRetorno(gPseudocodigoParser.RetornoContext ctx) {
		retorno=ctx.getText();
	 }

	@Override public void exitRetorno(gPseudocodigoParser.RetornoContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */


	@Override public void exitKwinicio(gPseudocodigoParser.KwinicioContext ctx) { 
		cabecera = false;
		Function temp = new Function();
		//temp.AumentarNumberVariables();
		temp.setVariablePoints(temp.getVariablePoints() + contadorParametros);
		temp.setParameterCallsPoints(temp.getParemeterCallsPoints() + (contadorParametros * 2));
		temp.setNumberParameters(temp.getNumberParameters() + contadorParametros);
		temp.setNombreFuncion(nombreFuncion);
		tabla.addFunction(name, temp);

		parametros = "";
		contadorParametros = 0;

		esParametroFuncion = false;

		tabla.getTablaFunciones().get(name).setPrimeraLinea(contadorLineas);

		if (tieneParametros) {
			sumarPuntoLineaEfectiva();
			tieneParametros = false;
		}
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterKwfin(gPseudocodigoParser.KwfinContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitKwfin(gPseudocodigoParser.KwfinContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterKwini(gPseudocodigoParser.KwiniContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitKwini(gPseudocodigoParser.KwiniContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterKwdefinir(gPseudocodigoParser.KwdefinirContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitKwdefinir(gPseudocodigoParser.KwdefinirContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterKwcomo(gPseudocodigoParser.KwcomoContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitKwcomo(gPseudocodigoParser.KwcomoContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterKwflecha(gPseudocodigoParser.KwflechaContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitKwflecha(gPseudocodigoParser.KwflechaContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterKwdimension(gPseudocodigoParser.KwdimensionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitKwdimension(gPseudocodigoParser.KwdimensionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterKwleer(gPseudocodigoParser.KwleerContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitKwleer(gPseudocodigoParser.KwleerContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterKwescribir(gPseudocodigoParser.KwescribirContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitKwescribir(gPseudocodigoParser.KwescribirContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterKwcierrasi(gPseudocodigoParser.KwcierrasiContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitKwcierrasi(gPseudocodigoParser.KwcierrasiContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterKwsino(gPseudocodigoParser.KwsinoContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitKwsino(gPseudocodigoParser.KwsinoContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterKwentonces(gPseudocodigoParser.KwentoncesContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitKwentonces(gPseudocodigoParser.KwentoncesContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterKwsi(gPseudocodigoParser.KwsiContext ctx) {
		addValorBucleBifurcacion();
	 }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitKwsi(gPseudocodigoParser.KwsiContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterKwdeotromodo(gPseudocodigoParser.KwdeotromodoContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitKwdeotromodo(gPseudocodigoParser.KwdeotromodoContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterKwfinsegun(gPseudocodigoParser.KwfinsegunContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitKwfinsegun(gPseudocodigoParser.KwfinsegunContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterKwsegun(gPseudocodigoParser.KwsegunContext ctx) { 
		addValorBucleBifurcacion();
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitKwsegun(gPseudocodigoParser.KwsegunContext ctx) { 
		sumarPuntoLineaEfectiva();
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterKwhacer(gPseudocodigoParser.KwhacerContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitKwhacer(gPseudocodigoParser.KwhacerContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterKwfinmientras(gPseudocodigoParser.KwfinmientrasContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitKwfinmientras(gPseudocodigoParser.KwfinmientrasContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterKwmientras(gPseudocodigoParser.KwmientrasContext ctx) { 
		addValorBucleBifurcacion();
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitKwmientras(gPseudocodigoParser.KwmientrasContext ctx) { 
		sumarPuntoLineaEfectiva();
		sumarPuntosOperacionSimple();

		/*int[] temp = {contadorLineas, 0};
		bucles.add(temp);*/

		Bucle temp2 = new Bucle();
		if(!lineasCabecerasBucles.isEmpty()) {
			temp2.setLineaBucleArriba(lineasCabecerasBucles.get(lineasCabecerasBucles.size() - 1));
		}
		temp2.setlineaInicio(contadorLineas);
		listaBucles.add(temp2);
		listaBuclesFuncion.add(temp2);

		lineasCabecerasBucles.add(contadorLineas);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterKwrepetir(gPseudocodigoParser.KwrepetirContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitKwrepetir(gPseudocodigoParser.KwrepetirContext ctx) { 
		sumarPuntoLineaEfectiva();
		sumarPuntosOperacionSimple();
		sumarPuntosOperacionSimple();

		/*int[] temp = {contadorLineas, 0};
		bucles.add(temp);*/

		Bucle temp2 = new Bucle();
		if(!lineasCabecerasBucles.isEmpty()) {
			temp2.setLineaBucleArriba(lineasCabecerasBucles.get(lineasCabecerasBucles.size() - 1));
		}
		temp2.setlineaInicio(contadorLineas);
		listaBucles.add(temp2);
		listaBuclesFuncion.add(temp2);

		lineasCabecerasBucles.add(contadorLineas);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterKwhastaque(gPseudocodigoParser.KwhastaqueContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitKwhastaque(gPseudocodigoParser.KwhastaqueContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterKwfinpara(gPseudocodigoParser.KwfinparaContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitKwfinpara(gPseudocodigoParser.KwfinparaContext ctx) { 
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterKwpara(gPseudocodigoParser.KwparaContext ctx) { 
		addValorBucleBifurcacion();
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitKwpara(gPseudocodigoParser.KwparaContext ctx) { 
		sumarPuntoLineaEfectiva();
		sumarPuntosOperacionSimple();

		/*int[] temp = {contadorLineas, 0};
		bucles.add(temp);*/

		Bucle temp2 = new Bucle();
		if(!lineasCabecerasBucles.isEmpty()) {
			temp2.setLineaBucleArriba(lineasCabecerasBucles.get(lineasCabecerasBucles.size() - 1));
		}
		temp2.setlineaInicio(contadorLineas);
		listaBucles.add(temp2);
		listaBuclesFuncion.add(temp2);

		lineasCabecerasBucles.add(contadorLineas);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterKwhasta(gPseudocodigoParser.KwhastaContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitKwhasta(gPseudocodigoParser.KwhastaContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterKwconpaso(gPseudocodigoParser.KwconpasoContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitKwconpaso(gPseudocodigoParser.KwconpasoContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterKwfuncion(gPseudocodigoParser.KwfuncionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitKwfuncion(gPseudocodigoParser.KwfuncionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterInvocafuncion(gPseudocodigoParser.InvocafuncionContext ctx) {
		System.out.println("HOLA                       "+ctx.getText());
		sumarPuntoLineaEfectiva();
		if (!listaPuntosBucleBifurcacion.isEmpty()) {
			sum2ValorBucleBifurcacion();
			Function temp = tabla.getTablaFunciones().get(name);
			temp.AumentarFunctionCalls();
			tabla.setFunction(name, temp);
			esLlamadaFuncion = true;
		} else {
			Function temp = tabla.getTablaFunciones().get(name);
			temp.AumentarFunctionCalls();
			tabla.setFunction(name, temp);
			esLlamadaFuncion = true;
		}

		if (lineasLlamadas.containsKey(ctx.getText().split("\\(")[0])) {
			ArrayList<Integer> temp = lineasLlamadas.get(ctx.getText().split("\\(")[0]);
			temp.add(contadorLineas - 1);
			lineasLlamadas.put(ctx.getText().split("\\(")[0], temp);
		} else {
			lineasLlamadas.put(ctx.getText().split("\\(")[0], new ArrayList<Integer>(Arrays.asList(contadorLineas - 1)));
		}
	 }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitInvocafuncion(gPseudocodigoParser.InvocafuncionContext ctx) {
		esLlamadaFuncion = false;
	 }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterArgumentos(gPseudocodigoParser.ArgumentosContext ctx) {
		this.argumentos++;
	 }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitArgumentos(gPseudocodigoParser.ArgumentosContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterKwfinfuncion(gPseudocodigoParser.KwfinfuncionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitKwfinfuncion(gPseudocodigoParser.KwfinfuncionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterOperadorrel(gPseudocodigoParser.OperadorrelContext ctx) { 
		sumarPuntosOperacionSimple();
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitOperadorrel(gPseudocodigoParser.OperadorrelContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterOperadorlog(gPseudocodigoParser.OperadorlogContext ctx) { 
		sumarPuntosOperacionSimple();
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitOperadorlog(gPseudocodigoParser.OperadorlogContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterConjuncion(gPseudocodigoParser.ConjuncionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitConjuncion(gPseudocodigoParser.ConjuncionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterDisyuncion(gPseudocodigoParser.DisyuncionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitDisyuncion(gPseudocodigoParser.DisyuncionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterNegacion(gPseudocodigoParser.NegacionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitNegacion(gPseudocodigoParser.NegacionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterOperadoralge(gPseudocodigoParser.OperadoralgeContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitOperadoralge(gPseudocodigoParser.OperadoralgeContext ctx) { 
		sumarPuntosOperacionSimple();
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterIgual(gPseudocodigoParser.IgualContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitIgual(gPseudocodigoParser.IgualContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterSuma(gPseudocodigoParser.SumaContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitSuma(gPseudocodigoParser.SumaContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterResta(gPseudocodigoParser.RestaContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitResta(gPseudocodigoParser.RestaContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterMultiplicacion(gPseudocodigoParser.MultiplicacionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitMultiplicacion(gPseudocodigoParser.MultiplicacionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterDivision(gPseudocodigoParser.DivisionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitDivision(gPseudocodigoParser.DivisionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterPotenciacion(gPseudocodigoParser.PotenciacionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitPotenciacion(gPseudocodigoParser.PotenciacionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterModulo(gPseudocodigoParser.ModuloContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitModulo(gPseudocodigoParser.ModuloContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterOperadorseparador(gPseudocodigoParser.OperadorseparadorContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitOperadorseparador(gPseudocodigoParser.OperadorseparadorContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterComa(gPseudocodigoParser.ComaContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitComa(gPseudocodigoParser.ComaContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterBarrabaja(gPseudocodigoParser.BarrabajaContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitBarrabaja(gPseudocodigoParser.BarrabajaContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterFunciones(gPseudocodigoParser.FuncionesContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitFunciones(gPseudocodigoParser.FuncionesContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterRc(gPseudocodigoParser.RcContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitRc(gPseudocodigoParser.RcContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterAbs(gPseudocodigoParser.AbsContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitAbs(gPseudocodigoParser.AbsContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterLn(gPseudocodigoParser.LnContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitLn(gPseudocodigoParser.LnContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterExp(gPseudocodigoParser.ExpContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitExp(gPseudocodigoParser.ExpContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterSen(gPseudocodigoParser.SenContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitSen(gPseudocodigoParser.SenContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterCos(gPseudocodigoParser.CosContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitCos(gPseudocodigoParser.CosContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterAtan(gPseudocodigoParser.AtanContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitAtan(gPseudocodigoParser.AtanContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterTrunc(gPseudocodigoParser.TruncContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitTrunc(gPseudocodigoParser.TruncContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterRedon(gPseudocodigoParser.RedonContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitRedon(gPseudocodigoParser.RedonContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterAzar(gPseudocodigoParser.AzarContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitAzar(gPseudocodigoParser.AzarContext ctx) { }



	@Override public void enterTipo(gPseudocodigoParser.TipoContext ctx) { 
		if (funcionNueva) {
			esParametroFuncion = true;
			parametros += ctx.getText() + " ";
		}
	}



	@Override public void exitTipo(gPseudocodigoParser.TipoContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterReal(gPseudocodigoParser.RealContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitReal(gPseudocodigoParser.RealContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterEntero(gPseudocodigoParser.EnteroContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitEntero(gPseudocodigoParser.EnteroContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterBool(gPseudocodigoParser.BoolContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitBool(gPseudocodigoParser.BoolContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterString(gPseudocodigoParser.StringContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitString(gPseudocodigoParser.StringContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterId(gPseudocodigoParser.IdContext ctx) {
		if(nombrefun){
		this.name = ctx.getText();
		this.nombreFuncion = ctx.getText();
		
		nombrefun=false;
		}else if(definiendo){
			tabla.getTablaFunciones().get(name).AumentarNumberVariables();
		}
	 }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitId(gPseudocodigoParser.IdContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterComentario(gPseudocodigoParser.ComentarioContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitComentario(gPseudocodigoParser.ComentarioContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterDospuntos(gPseudocodigoParser.DospuntosContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitDospuntos(gPseudocodigoParser.DospuntosContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterPi(gPseudocodigoParser.PiContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitPi(gPseudocodigoParser.PiContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterPd(gPseudocodigoParser.PdContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitPd(gPseudocodigoParser.PdContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterCi(gPseudocodigoParser.CiContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitCi(gPseudocodigoParser.CiContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterCd(gPseudocodigoParser.CdContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitCd(gPseudocodigoParser.CdContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterPuntoycoma(gPseudocodigoParser.PuntoycomaContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitPuntoycoma(gPseudocodigoParser.PuntoycomaContext ctx) { }


	@Override public void exitEveryRule(ParserRuleContext ctx) {	pila.pop(); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override
	public void visitTerminal(final TerminalNode node) {
		pila.push((node.getSymbol().getType()) + ":" + node.getText());
		for (int i = 0; i < pila.size(); i++) {
			pilaimprimir.add('/' + pila.get(i));
		}
		pilaimprimir.add("\n");
		pila.pop();
	}

	private void terminarBucleBifurcacion() {
		if (listaPuntosBucleBifurcacion.size() != 1) {
			long temp = (long) Math.pow(listaPuntosBucleBifurcacion.get(listaPuntosBucleBifurcacion.size() - 1), 2);
			long temp2 = listaPuntosBucleBifurcacion.get(listaPuntosBucleBifurcacion.size() - 2);
			listaPuntosBucleBifurcacion.set(listaPuntosBucleBifurcacion.size() - 2, temp + temp2);
			listaPuntosBucleBifurcacion.remove(listaPuntosBucleBifurcacion.size() - 1);
		} else {
			long aux = (long) Math.pow(listaPuntosBucleBifurcacion.get(0), 2);
			Function temp = tabla.getTablaFunciones().get(name);
			temp.setLoopPoints(temp.getLoopPoints() + aux);
			listaPuntosBucleBifurcacion.remove(0);
			tabla.setFunction(name, temp);
		}
	}

	private void sumValorBucleBifurcacion() {
		if (!listaPuntosBucleBifurcacion.isEmpty()) {
			listaPuntosBucleBifurcacion.set(listaPuntosBucleBifurcacion.size() - 1,
					(listaPuntosBucleBifurcacion.get(listaPuntosBucleBifurcacion.size() - 1)) + 1);
		}
	}

	private void sum2ValorBucleBifurcacion() {
		if (!listaPuntosBucleBifurcacion.isEmpty()) {
			listaPuntosBucleBifurcacion.set(listaPuntosBucleBifurcacion.size() - 1,
					(listaPuntosBucleBifurcacion.get(listaPuntosBucleBifurcacion.size() - 1)) + 2);
		}
	}

	private void addValorBucleBifurcacion() {
		listaPuntosBucleBifurcacion.add(0L);
	}

	private void sumarPuntoLineaEfectiva() {
		Function temp = tabla.getTablaFunciones().get(name);
		temp.setNumberLinesOfCode(temp.getNumberLinesOfCode() + 1);
		tabla.setFunction(name, temp);
	}

	private void sumarPuntosOperacionSimple() {
		if (!listaPuntosBucleBifurcacion.isEmpty()) {
			sumValorBucleBifurcacion();
		} else {
			Function temp = tabla.getTablaFunciones().get(name);
			temp.setOperationPoints(temp.getOperationPoints() + 1);
			tabla.setFunction(name, temp);
		}
	}
	private long sumarPuntosFunciones(){
		HashMap<String, Function> funciones = tabla.getTablaFunciones();
		funciones.forEach((k, v) ->
		sum+=v.getTotalPoints());
		return sum;
	}
	private long sumarPuntosEfectivas(){
		HashMap<String, Function> funciones = tabla.getTablaFunciones();
		funciones.forEach((k, v) ->
		sumLines+=v.getNumberLinesOfCode());
		return sumLines;
	}

	public void setNombreFicheroHTML(String nombreFicheroHTML) {
		this.nombreFicheroHTML = nombreFicheroHTML;
	}

	public void setNombreFichero(String nombreFichero) {
		this.nombreFichero = nombreFichero;
		String[] temp = nombreFichero.split("\\.");
		if (temp.length == 1) {
			nombrePrograma = nombreFichero;
		} else {
			for (int i = 0; i < temp.length - 1; i++) {
				nombrePrograma += temp[i];
			}
		}
	}

	public void setFuncionPrincipal(String funcionPrincipal) {
		this.funcionPrincipal = funcionPrincipal;
	}

	private void obtenerHTML() {
		ArrayList<String> text = html.getTextHTML();
		HashMap<String, Function> funciones = tabla.getTablaFunciones();
		long puntosTotales=sumarPuntosFunciones();
		long puntosLineas= sumarPuntosEfectivas();
		CiclomaticaTotal++;
		text.add("<html>\n<head>\n<title>" + nombreFichero+ "</title>\n</head>\n<body>\n<h1>Resumen del programa "
				+ nombreFichero + "</h1>\n");
		funciones.forEach((k, v) -> text.add("<h2>Funcion " + k +":"+v.getRetorno() 
				+ "</h2>\n<ul>\n    <li>Complejidad ciclomatica V(G): <strong>" + v.getCiclomatica()
				+ "</strong></li>\n    <li>Puntos funcion: <strong>" + v.getTotalPoints()
				+ "</strong></li>\n    <li>Resumen: "
				+ "\n        <ul>\n        <li>Numero de variables declaradas: <strong>" + v.getNumberVariables()
				+ "</strong></li>\n        <li>Numero de llamadas a funciones: <strong>" + v.getNumberFunctionCalls()
				+ "</strong></li>\n        <li>Numero de lineas de codigo efectivas: <strong>"
				+ v.getNumberLinesOfCode() + "</strong></li>\n        <li>Numero de parametros esperados: <strong>"
				+ v.getArgumentos() + "</strong></li>\n<br>\n        <li>Puntos de declaraciones: <strong>"
				+ v.getVariablePoints() + "</strong></li>\n        <li>Puntos de parametros: <strong>"
				+ v.getParemeterCallsPoints() + "</strong></li>\n        <li>Puntos de llamada de funciones: <strong>"
				+ v.getFunctionCallsPoints() + "</strong></li>\n        <li>Puntos de operacion simple: <strong>"
				+ v.getOperationPoints() + "</strong></li>\n        <li>Puntos de bucle/bifurcacion: <strong>"
				+ v.getLoopPoints()
				+ "</strong></li>\n</ul>\n    <li>Grafico de complejidad ciclomatica: <br><img src= ./SVG/"
				+ v.getNombreFuncion() + ".SVG width=\"25%\"></li>\n</ul>\n<hr>\n"));

		text.add("<h2>Programa " + nombreFichero + "</h2>\n<ul>\n<li>Complejidad ciclomatica total: <strong>"+CiclomaticaTotal
				+ "</strong></li>\n<li>Suma de puntos de funciones: <strong>" + puntosTotales
				+ "</strong></li>\n<li>Suma de lineas de codigo efectivas: <strong>"+ puntosLineas
				+ "</strong></li>\n<li>Grafico del programa: <br><img src=\"" + "./SVG/PROGRAMAPRINCIPAL"
				+ ".SVG\" width=\"40%\"></li>\n</ul>");
		text.add("\n</body>\n</html>");
		html.setTextHTML(text);
	}



	
}




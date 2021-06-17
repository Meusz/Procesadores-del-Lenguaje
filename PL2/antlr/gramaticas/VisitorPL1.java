import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.FileInputStream;
import java.io.InputStream;

public class VisitorPL1{
    //Metodo entreda por defecto

    public static void main(String[] args)  throws Exception{
        /*Para entender que se va a hacer debemos tener muy clara la practica.
        Debemos proporcionar un fichero escrito en pseudocodigo. Hecho esto,
        Deberemos generar tokes que llegaran al lexer, y posteriormente seran
        tratados por el parser. De esta forma obtendremos un Arbol AST. Este,
        Debera visualizarse por pantalla en forma de directorios, y no un arbol
        dibujado. Procedemos a identifcar el fichero, y ha manipularlo para 
        obtener el AST. */
        //Inicializamos la entrada de datos para leer el fichero
        String inputFile = null;
        if(args.length>0) inputFile = args[0];

        //inicializamos los strings de datos
        InputStream is = System.in;
        if(inputFile!=null) is =new FileInputStream(inputFile);

        //Inicializo ANTLR
        ANTLRInputStream input = new ANTLRInputStream(is);

        //Conectamos con el lexer para analizar los datos del fichero
        gPseudocodigoLexer lexer = new gPseudocodigoLexer(input);

        //Inicializamos canal de tokens para transmitir los datos del lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        //Preparamos el parser que recibira el Stream de tokens
        gPseudocodigoParser parser = new gPseudocodigoParser(tokens);


        //Generar arbol a partir del axioma(Regla Principal) de la gramatica
        //En mi caso sera prog
        ParseTree tree = parser.prog();

        //Mostrar el arbol por consola:
        //System.out.println(tree.toStringTree(parser));

        //Recorrer arbol
        //1º Analizar un recorredor o visitor
        //2ºInicializar un escuchador
        //3º Recorrer arbol

        //1º
        ParseTreeWalker walker = new ParseTreeWalker();
        //2º
        ListenerPL1 escuchador = new ListenerPL1();
        //3º
        walker.walk(escuchador,tree);

        //cerramos el fichero del escuchador para que todo se escriba
        escuchador.Cerrar();
    }
}
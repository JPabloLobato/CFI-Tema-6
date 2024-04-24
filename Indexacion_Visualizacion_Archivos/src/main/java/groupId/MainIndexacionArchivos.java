package groupId;

import java.io.File;

public class MainIndexacionArchivos {
    public static void main(String[] args) {
        IndexadorArchivos indexador = new IndexadorArchivos();
        indexador.setIndiceDeArchivos(new File("CarpetaDocumentos"));
        VisualizadorArchivos visualizador = new VisualizadorArchivos();
        visualizador.mostrarArchivo(indexador.getIndicceDeArchivos());
    }
}

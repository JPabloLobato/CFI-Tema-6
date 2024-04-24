package groupId;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class IndexadorArchivos {
    private final Map<String, String> indiceDeArchivos;

    public IndexadorArchivos() {
        indiceDeArchivos = new HashMap<>();
    }

    public void setIndiceDeArchivos(File raiz) {
        if (raiz.isFile()) {
            indiceDeArchivos.put(raiz.getName(), raiz.getAbsolutePath());
        } else if (raiz.isDirectory()) {
            File[] archivos = raiz.listFiles();
            if (archivos != null) {
                for (File archivo : archivos) {
                    setIndiceDeArchivos(archivo);
                }
            }
        }
    }

    public Map<String, String> getIndicceDeArchivos() {
        return indiceDeArchivos;
    }
}

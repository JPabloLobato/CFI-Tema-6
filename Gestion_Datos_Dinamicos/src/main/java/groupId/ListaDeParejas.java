package groupId;

import java.util.ArrayList;
import java.util.List;

public class ListaDeParejas<T, U> {
    private final List<Pareja<T, U>> lista;

    public ListaDeParejas() {
        this.lista = new ArrayList<>();
    }

    public void agregarPareja(Pareja<T, U> pareja) {
        lista.add(pareja);
    }

    public void eliminarPareja(int indice) {
        if (indice >= 0 && indice < lista.size()) {
            lista.remove(indice);
        }
    }

    public List<Pareja<T, U>> getLista() {
        return lista;
    }
}

package groupId;

import java.util.ArrayList;
import java.util.List;

// Clase que se utiliza para manejar una lista de objetos Pareja.
public class ListaDePares {
    // Atributos que representa la lista de objetos Pareja.
    private List<Pareja> lista;

    // Constructor que inicializa la lista como un nuevo ArrayList.
    public ListaDePares() {
        this.lista = new ArrayList<>();
    }

    // Método para agregar un objeto Pareja a la lista.
    public void agregarPareja(Pareja pareja) {
        this.lista.add(pareja);
    }

    // Getters para obtener la lista de objetos Pareja.
    public List<Pareja> getLista() {
        return lista;
    }
}

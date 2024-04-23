package groupId;

import java.util.ArrayList;
import java.util.List;

// Clase que representa una lista de números reales.
public class ListaDeReales {

    // Lista privada que almacena los números reales.
    private List<Double> lista;

    // Constructor de la clase. Inicializa la lista como un nuevo ArrayList.
    public ListaDeReales() {
        this.lista = new ArrayList<>();
    }

    // Método que agrega un número real a la lista.
    public void agregarReal(double real){
        this.lista.add(real);
    }

    // Método para obterner la lista de números reales.
    public List<Double> getLista() {
        return lista;
    }
}

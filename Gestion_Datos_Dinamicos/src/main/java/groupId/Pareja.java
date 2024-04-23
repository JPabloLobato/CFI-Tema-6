package groupId;

// Clase que representa un par de enteros.
public class Pareja {
    // Atributos que representan los dos elementos de la pareja.
    private int primerElemento;
    private int segundoElemento;

    // Constructor que inicializa los dos elementos de la pareja.
    public Pareja(int primerElemento, int segundoElemento) {
        this.primerElemento = primerElemento;
        this.segundoElemento = segundoElemento;
    }

    // Getters para el primer elemento de la pareja.
    public int getPrimerElemento() {
        return primerElemento;
    }

    // Getters para el segundo elemento de la pareja.
    public int getSegundoElemento() {
        return segundoElemento;
    }
}

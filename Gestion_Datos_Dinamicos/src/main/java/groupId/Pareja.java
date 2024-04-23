package groupId;

public class Pareja<T, U> {
    private final T primero;
    private final U segundo;

    public Pareja(T primero, U segundo) {
        this.primero = primero;
        this.segundo = segundo;
    }

    @Override
    public String toString() {
        return "(" + primero + ", " + segundo + ")";
    }

}

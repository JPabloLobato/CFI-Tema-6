package groupId;

import java.util.Scanner;
import java.util.TreeSet;

public class OrdenacionYBusqueda {
    public static void ordenarNombres() {
        TreeSet<String> nombres = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce nombres (introduce 'fin' para terminar):");

        String nombre;
        while (!(nombre = scanner.nextLine()).equalsIgnoreCase("fin")) {
            nombres.add(nombre);
        }

        System.out.println("Nombres ordenados: ");
        for (String nombreOrdenado : nombres) {
            System.out.println(nombreOrdenado);
        }

        scanner.close();
    }
}

import java.util.Scanner;

public class MenuOpciones {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("=== MENÚ ===");
            System.out.println("1. Opción 1");
            System.out.println("2. Opción 2");
            System.out.println("3. Salir");
            System.out.print("Elija una opción: ");
            opcion = leer.nextInt();

        } while (opcion != 3);

        System.out.println("Programa finalizado.");
    }
}
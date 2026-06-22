import java.util.Scanner;

public class ProcesarDatos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String dato;

        do {
            System.out.print("Ingrese un dato (o escriba 'salir' para terminar): ");
            dato = sc.nextLine();

            if (dato.equalsIgnoreCase("salir")) {
                break; // Finaliza el ciclo
            }

            System.out.println("Dato procesado: " + dato);

        } while (true);

        System.out.println("Programa finalizado.");
        sc.close();
    }
}
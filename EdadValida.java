import java.util.Scanner;

public class EdadValida {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int edad;

        do {
            System.out.print("Ingrese una edad (0-120): ");
            edad = leer.nextInt();
        } while (edad < 0 || edad > 120);

        System.out.println("Edad válida: " + edad);
    }
}
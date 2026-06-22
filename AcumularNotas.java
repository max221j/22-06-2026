import java.util.Scanner;

public class AcumularNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nota, suma = 0;
        int cantidad = 0;
        char continuar;

        do {
            System.out.print("Ingrese una nota: ");
            nota = sc.nextDouble();

            suma += nota;
            cantidad++;

            System.out.print("¿Desea ingresar otra nota? (s/n): ");
            continuar = sc.next().charAt(0);

        } while (continuar == 's' || continuar == 'S');

        System.out.println("Cantidad de notas: " + cantidad);
        System.out.println("Suma de notas: " + suma);

        if (cantidad > 0) {
            System.out.println("Promedio: " + (suma / cantidad));
        }

        sc.close();
    }
}
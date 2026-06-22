import java.util.Scanner;

public class SumaNumeros {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int numero;
        int suma = 0;

        do {
            System.out.print("Ingrese un número (0 para terminar): ");
            numero = leer.nextInt();
            suma += numero;
        } while (numero != 0);

        System.out.println("La suma total es: " + suma);
    }
}
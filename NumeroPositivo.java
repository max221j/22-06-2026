import java.util.Scanner;

public class NumeroPositivo {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Ingrese un número positivo: ");
            numero = leer.nextInt();
        } while (numero <= 0);

        System.out.println("Número válido: " + numero);
    }
}
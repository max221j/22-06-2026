import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int num = leer.nextInt();

        int divisores = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                divisores++;
            }
        }

        if (divisores == 2) {
            System.out.println("El número es primo");
        } else {
            System.out.println("El número no es primo");
        }
    }
}
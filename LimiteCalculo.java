import java.util.Scanner;

public class LimiteCalculo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero;
        int suma = 0;
        int limite = 100;

        do {
            System.out.print("Ingrese un número: ");
            numero = sc.nextInt();

            suma += numero;

            System.out.println("Suma actual: " + suma);

            if (suma > limite) {
                System.out.println("Límite superado. Se detiene el cálculo.");
                break; // Detiene el ciclo
            }

        } while (true);

        sc.close();
    }
}
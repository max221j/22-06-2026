import java.util.Scanner;

public class CelsiusAFahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double celsius, fahrenheit;
        char continuar;

        do {
            System.out.print("Ingrese la temperatura en Celsius: ");
            celsius = sc.nextDouble();

            fahrenheit = (celsius * 9 / 5) + 32;

            System.out.println("Temperatura en Fahrenheit: " + fahrenheit);

            System.out.print("¿Desea realizar otra conversión? (s/n): ");
            continuar = sc.next().charAt(0);

        } while (continuar == 's' || continuar == 'S');

        System.out.println("Programa finalizado.");
        sc.close();
    }
}
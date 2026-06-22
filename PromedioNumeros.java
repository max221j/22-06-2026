import java.util.Scanner;

public class PromedioNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuántos números vas a ingresar?: ");
        int N = sc.nextInt();

        double suma = 0;

        for (int i = 1; i <= N; i++) {
            System.out.print("Ingresa el número " + i + ": ");
            double numero = sc.nextDouble();

            suma = suma + numero;
        }

        double promedio = suma / N;

        System.out.println("El promedio es: " + promedio);

        sc.close();
    }
}
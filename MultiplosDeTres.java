import java.util.Scanner;

public class MultiplosDeTres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa un número N: ");
        int N = sc.nextInt();

        int contador = 0;

        for (int i = 1; i <= N; i++) {
            if (i % 3 == 0) {
                contador = contador + 1;
            }
        }

        System.out.println("Cantidad de múltiplos de 3 entre 1 y " + N + " es: " + contador);

        sc.close();
    }
}
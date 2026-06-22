import java.util.Scanner;

public class InvertirNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa un número entero: ");
        int numero = sc.nextInt();

        int invertido = 0;

        for (; numero != 0; numero = numero / 10) {
            int digito = numero % 10;
            invertido = invertido * 10 + digito;
        }

        System.out.println("Número invertido: " + invertido);

        sc.close();
    }
}
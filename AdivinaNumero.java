import java.util.Scanner;

public class AdivinaNumero {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int numeroSecreto = (int)(Math.random() * 10) + 1;
        int intento;

        do {
            System.out.print("Adivina el número (1 al 10): ");
            intento = leer.nextInt();

            if (intento != numeroSecreto) {
                System.out.println("Incorrecto. Intenta de nuevo.");
            }

        } while (intento != numeroSecreto);

        System.out.println("¡Correcto! Adivinaste el número.");
    }
}
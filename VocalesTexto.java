import java.util.Scanner;

public class VocalesTexto {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese un texto: ");
        String texto = leer.nextLine();

        for (int i = 0; i < texto.length(); i++) {
            char letra = Character.toLowerCase(texto.charAt(i));

            if (letra == 'a' || letra == 'e' || letra == 'i' ||
                letra == 'o' || letra == 'u') {
                System.out.print(letra + " ");
            }
        }
    }
}
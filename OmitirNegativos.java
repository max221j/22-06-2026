public class OmitirNegativos {
    public static void main(String[] args) {

        int[] numeros = {10, -5, 20, -8, 15, -3, 30};

        int i = 0;

        do {
            if (numeros[i] < 0) {
                i++;
                continue; // Omite los números negativos
            }

            System.out.println(numeros[i]);
            i++;

        } while (i < numeros.length);
    }
}
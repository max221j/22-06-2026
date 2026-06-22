public class BreakDoWhile {
    public static void main(String[] args) {

        int numero = 1;

        do {
            System.out.println(numero);

            if (numero == 30) {
                break; // Detiene el ciclo al llegar a 30
            }

            numero++;

        } while (numero <= 50);
    }
}
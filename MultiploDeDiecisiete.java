public class MultiploDeDiecisiete {
    public static void main(String[] args) {

        int numero = 1;

        do {
            if (numero % 17 == 0 && numero != 0) {
                System.out.println("Múltiplo de 17 encontrado: " + numero);
                break; // Detiene el ciclo
            }

            System.out.println(numero);
            numero++;

        } while (numero <= 100);
    }
}
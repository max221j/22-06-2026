public class MultiplosDeCinco {
    public static void main(String[] args) {

        int numero = 1;

        do {
            if (numero % 5 != 0) {
                numero++;
                continue; // Ignora los que no son múltiplos de 5
            }

            System.out.println(numero);
            numero++;

        } while (numero <= 100);
    }
}
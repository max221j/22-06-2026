public class NumerosPares {
    public static void main(String[] args) {

        int numero = 1;

        do {
            if (numero % 2 != 0) { // Si es impar
                numero++;
                continue;
            }

            System.out.println(numero);
            numero++;

        } while (numero <= 100);
    }
}
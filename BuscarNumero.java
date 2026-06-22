public class BuscarNumero {
    public static void main(String[] args) {

        int[] numeros = {5, 12, 8, 20, 15, 30};
        int buscado = 20;
        int i = 0;

        do {
            if (numeros[i] == buscado) {
                System.out.println("Número encontrado en la posición: " + i);
                break; // Detiene el ciclo al encontrar el número
            }

            i++;

        } while (i < numeros.length);
    }
}
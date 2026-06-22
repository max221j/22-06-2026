public class OmitirEspacios {
    public static void main(String[] args) {

        String texto = "Hola mundo Java";
        int i = 0;

        do {
            char c = texto.charAt(i);

            if (c == ' ') {
                i++;
                continue; // Omite los espacios
            }

            System.out.print(c);
            i++;

        } while (i < texto.length());
    }
}
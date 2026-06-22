public class OmitirPalabrasCortas {
    public static void main(String[] args) {

        String texto = "Yo estudio Java en la universidad";
        String[] palabras = texto.split(" ");

        int i = 0;

        do {
            if (palabras[i].length() < 3) {
                i++;
                continue; // Omite palabras cortas
            }

            System.out.println(palabras[i]);
            i++;

        } while (i < palabras.length);
    }
}
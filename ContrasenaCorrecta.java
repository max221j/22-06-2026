import java.util.Scanner;

public class ContrasenaCorrecta {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String contrasena;

        do {
            System.out.print("Ingrese la contraseña: ");
            contrasena = leer.nextLine();
        } while (!contrasena.equals("1234"));

        System.out.println("Acceso permitido");
    }
}
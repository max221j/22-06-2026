import java.util.Scanner;

public class SimularCompras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double precio, total = 0;
        char continuar;

        do {
            System.out.print("Ingrese el precio del producto: ");
            precio = sc.nextDouble();

            total += precio;

            System.out.print("¿Desea ingresar otro producto? (s/n): ");
            continuar = sc.next().charAt(0);

        } while (continuar == 's' || continuar == 'S');

        System.out.println("Total de la compra: S/ " + total);

        sc.close();
    }
}
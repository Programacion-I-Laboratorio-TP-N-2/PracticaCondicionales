import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto: ");
        int precioOriginal = scanner.nextInt();

        System.out.print("Ingrese la categoría del cliente (estudiante, adulto, jubilado): ");
        String categoria = scanner.next().toLowerCase();

        double descuento = 0;
        switch (categoria) {
            case "estudiante":
                descuento = 0.1;
                break;
            case "adulto":
                descuento = 0.05;
                break;
            case "jubilado":
                descuento = 0.15;
                break;
            default:
                System.out.println("Categoría no válida.");
                return;
        }

        double precioFinal = precioOriginal * (1 - descuento);
        System.out.println("El precio final con descuento es: $" + precioFinal);
    }
}


import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¡Bienvenido al recomendador de libros!");
        System.out.print("¿Cuál es tu género de libro favorito? (fantasía, misterio, romance, ciencia ficción): ");
        String genero = scanner.nextLine().toLowerCase();

        switch (genero) {
            case "fantasía":
                System.out.println("Te recomendamos: El Señor de los Anillos");
                break;
            case "misterio":
                System.out.println("Te recomendamos: Crimen y Castigo");
                break;
            case "romance":
                System.out.println("Te recomendamos: Orgullo y Prejuicio");
                break;
            case "ciencia ficción":
                System.out.println("Te recomendamos: Dune");
                break;
            default:
                System.out.println("Género no válido. Por favor, elige entre fantasía, misterio, romance o ciencia ficción.");
        }
    }
}

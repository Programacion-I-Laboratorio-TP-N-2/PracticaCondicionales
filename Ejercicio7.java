import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cómo te sientes hoy? (feliz, triste, enérgico, relajado): ");
        String estadoAnimo = scanner.nextLine().toLowerCase();

        switch (estadoAnimo) {
            case "feliz":
                System.out.println("¡Qué bueno que estés feliz! Puedes salir a caminar, escuchar música o pasar tiempo con amigos.");
                break;
            case "triste":
                System.out.println("¡Ánimo! Prueba con actividades relajantes como leer un libro, tomar un baño caliente o practicar yoga.");
                break;
            case "enérgico":
                System.out.println("¡Aprovecha tu energía! Puedes hacer ejercicio, salir a bailar o trabajar en un proyecto creativo.");
                break;
            case "relajado":
                System.out.println("Disfruta de tu momento de calma. Puedes meditar, tomar una siesta o ver una película.");
                break;
            default:
                System.out.println("Estado de ánimo no válido. Por favor, elige entre feliz, triste, enérgico o relajado.");
        }
    }
}

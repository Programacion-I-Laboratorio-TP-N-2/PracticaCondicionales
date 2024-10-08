import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cuántas horas duermes al día? ");
        int horasSueño = scanner.nextInt();

        System.out.print("¿Cuántas horas haces ejercicio al día? ");
        int horasEjercicio = scanner.nextInt();

        System.out.print("¿Cuántas comidas saludables consumes al día? ");
        int comidasSaludables = scanner.nextInt();


        if (horasSueño >= 7 && horasEjercicio >= 3 && comidasSaludables >= 2) {
            System.out.println("¡Felicitaciones! Tienes unos hábitos muy saludables.");
        } else {
            System.out.println("Puedes mejorar tus hábitos saludables.");
            if (horasSueño < 7) {
                System.out.println("Intenta dormir más.");
            }
            if (horasEjercicio < 3) {
                System.out.println("Incorpora más ejercicio a tu rutina.");
            }
            if (comidasSaludables < 2) {
                System.out.println("Aumenta el consumo de comidas saludables.");
            }
        }
    }
}

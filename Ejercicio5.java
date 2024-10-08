import java.util.Random;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("¡Vamos a jugar a Piedra, Papel o Tijera!");
        System.out.print("Elige: piedra, papel o tijera: ");
        String jugador = scanner.nextLine().toLowerCase();

        int eleccionComputadora = random.nextInt(3);
        String opciones[] = {"piedra", "papel", "tijera"};
        String computadora = opciones[eleccionComputadora];

        System.out.println("La computadora eligió: " + computadora);

        if (jugador.equals(computadora)) {
            System.out.println("¡Empate!");
        } else if ((jugador.equals("piedra") && computadora.equals("tijera")) ||
                (jugador.equals("papel") && computadora.equals("piedra")) ||
                (jugador.equals("tijera") && computadora.equals("papel"))) {
            System.out.println("¡Ganaste!");
        } else {
            System.out.println("¡Perdiste!");
        }
    }
}

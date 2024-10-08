import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su peso en kilogramos: ");
        double peso = scanner.nextDouble();

        System.out.print("Ingrese su altura en metros: ");
        double altura = scanner.nextDouble();

        // Calcular el IMC
        double imc = peso / (altura * altura);

        System.out.printf("Tu IMC es: %.2f\n", imc);

        if (imc < 18.5) {
            System.out.println("Tienes bajo peso.");
        } else if (imc >= 18.5 && imc < 25) {
            System.out.println("Tienes un peso normal.");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("Tienes sobrepeso.");
        } else {
            System.out.println("Tienes obesidad.");
        }
    }
}

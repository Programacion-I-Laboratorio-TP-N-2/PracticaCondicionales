import java.util.Scanner;

public class Ejercicio1 {
        public static void main(String[] args) {
            Scanner lectura = new Scanner(System.in);

            System.out.println("¡Bienvenido al recomendador de películas!");
            System.out.print("¿Cuál es tu género de película favorito? (acción, comedia, drama, ciencia ficción): ");
            String genero = lectura.nextLine().toLowerCase();

            switch (genero) {
                case "acción":
                    System.out.println("Te recomendamos: John Wick");
                    break;
                case "comedia":
                    System.out.println("Te recomendamos: Y Donde Estan Las Rubias");
                    break;
                case "drama":
                    System.out.println("Te recomendamos: El Niño Con el Pijama de Rayas");
                    break;
                case "ciencia ficción":
                    System.out.println("Te recomendamos: Interstellar");
                    break;
                default:
                    System.out.println("Género no válido. Por favor, elige entre acción, comedia, drama o ciencia ficción.");
            }
        }
    }

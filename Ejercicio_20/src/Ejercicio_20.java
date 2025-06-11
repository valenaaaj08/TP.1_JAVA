import java.util.Scanner;
import java.util.Random;

public class Ejercicio_20 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int longitud;
        int indice;

        String caracteres = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

        System.out.print("Ingresa la longitud de la contraseña: ");
        longitud = scanner.nextInt();

        String contrasena = "";

        for (int i = 0; i < longitud; i++) {
            indice = random.nextInt(caracteres.length()); // Genera un indice aleatorio dentro de caracteres
            contrasena += caracteres.charAt(indice); // Extra el valor de ese indice y lo suma a la contraseña
        }

        System.out.println("Contraseña generada: " + contrasena);

        scanner.close();
	}

}

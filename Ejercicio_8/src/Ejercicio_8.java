import java.util.Scanner;
import java.util.Random; // Importar libreria para generar numero random

public class Ejercicio_8 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        Random random = new Random(); // Se declara random

	        // Generar número aleatorio entre 1 y 100
	        int numero = random.nextInt(100) + 1;

	        int intento;
	        int intentos = 0;

	        System.out.println("¡Adivina el numero entre 1 y 100!");

	        // Bucle hasta que el usuario adivine
	        do {
	            System.out.print("Ingresa tu numero: ");
	            intento = scanner.nextInt();
	            intentos++;

	            if (intento < numero) {
	                System.out.println("El numero es mayor.");
	            } 
	            else if (intento > numero) {
	                System.out.println("El numero es menor.");
	            } 
	            else {
	                System.out.println("¡Correcto! El numero era " + numero);
	                System.out.println("Lo adivinaste en " + intentos + " intentos.");
	            }

	        } while (intento != numero);

	        scanner.close();
	    }
	}



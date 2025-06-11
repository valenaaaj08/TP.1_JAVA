import java.util.Scanner;

public class Ejercicio_10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un numero entero no negativo: ");
        int numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("El numero debe ser no negativo.");
        } else {
            int factorial = 1;

            for (int i = 1; i <= numero; i++) {
                factorial *= i;
            }

            System.out.println("El factorial de " + numero + " es: " + factorial);
        }

        scanner.close();

	}

}

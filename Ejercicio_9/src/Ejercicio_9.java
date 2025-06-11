import java.util.Scanner;

public class Ejercicio_9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el primer numero: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingresa el segundo numero: ");
        int num2 = scanner.nextInt();

        System.out.print("Ingresa el tercer numero: ");
        int num3 = scanner.nextInt();

        int mayor;

        if (num1 >= num2 && num1 >= num3) {
            mayor = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            mayor = num2;
        } else {
            mayor = num3;
        }

        System.out.println("El numero mayor es: " + mayor);

        scanner.close();
	}

}

import java.util.Scanner;

public class Ejercicio_13 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int opc;
		double temperatura;
		double resultado = 0;
		
		System.out.println("Ingrese una opcion: ");
		System.out.println("1. Celsius a Fahrenheit.");
		System.out.println("2. Fahrenheit a Celsius.");
		System.out.println();
		opc = scanner.nextInt();
		
		if(opc == 1) {
			System.out.print("Ingrese temperatura celsius: ");
			temperatura = scanner.nextDouble();
			
			resultado = (temperatura * 1.8) + 32;  
			System.out.print("El resultado en Fahrenheit es: " + resultado);
		}
		if(opc == 2) {
			System.out.print("Ingrese temperatura en Fahrenheit: ");
			temperatura = scanner.nextDouble();
			
			resultado = (temperatura - 32) * 5/9;
			System.out.print("El resultado en Celsius es: " + resultado);
		}
		
		
		scanner.close();
	}

}

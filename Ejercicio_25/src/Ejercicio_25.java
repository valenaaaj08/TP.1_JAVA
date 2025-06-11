import java.util.Scanner;

public class Ejercicio_25 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int opc;
		float num1, num2;
		float resultado;
		
		do {
			System.out.println("\nSelecciona una opcion:");
			System.out.println("1. Suma.");
			System.out.println("2. Resta.");
			System.out.println("3. Multiplicacion");
			System.out.println("4. Division");
			System.out.println("5. Salir de la calculadora.");
			opc = scanner.nextInt();
			
			switch(opc) {
			case 1:
				System.out.println("Ingresar primer numero: ");
				num1 = scanner.nextFloat();
				
				System.out.println("Ingresar segundo numero: ");
				num2 = scanner.nextFloat();
				
				resultado = num1 + num2;
				
				System.out.println(num1 + " + " + num2 + " = " + resultado);
				
			break;
			
			case 2:
				System.out.println("Ingresar primer numero: ");
				num1 = scanner.nextFloat();
				
				System.out.println("Ingresar segundo numero: ");
				num2 = scanner.nextFloat();
				
				resultado = num1 - num2;
				
				System.out.println(num1 + " - " + num2 + " = " + resultado);
			break;
			
			case 3:
				System.out.println("Ingresar primer numero: ");
				num1 = scanner.nextFloat();
				
				System.out.println("Ingresar segundo numero: ");
				num2 = scanner.nextFloat();
				
				resultado = num1 * num2;
				
				System.out.println(num1 + " * " + num2 + " = " + resultado);
			break;
			
			case 4:
				System.out.println("Ingresar dividendo: ");
				num1 = scanner.nextFloat();
				
				System.out.println("Ingresar divisor: ");
				num2 = scanner.nextFloat();
				
				resultado = num1 / num2;
				
				System.out.println(num1 + " / " + num2 + " = " + resultado);
			break;
			
			case 5:
				System.out.println("Saliendo de calculadora...");
			break;
			
			default:
				System.out.println("Opcion invalida.");
			break;

			}
			
		} while(opc != 5);
		
		scanner.close();
	}

}

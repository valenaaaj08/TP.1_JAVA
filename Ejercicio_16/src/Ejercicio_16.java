import java.util.Scanner;

public class Ejercicio_16 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		float lado1, lado2, lado3;
		
		System.out.println("Ingresar longitud del lado 1: ");
		lado1 = scanner.nextFloat();
		
		System.out.println("Ingresar longitud del lado 2: ");
		lado2 = scanner.nextFloat();
	
		System.out.println("Ingresar longitud del lado 3: ");
		lado3 = scanner.nextFloat();
		
		if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("El triangulo es equilatero.");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("El triangulo es isosceles.");
            } else {
                System.out.println("El triangulo es escaleno.");
            }
        } else {
            System.out.println("Los lados no forman un triangulo valido.");
        }
		
		scanner.close();
	}

}

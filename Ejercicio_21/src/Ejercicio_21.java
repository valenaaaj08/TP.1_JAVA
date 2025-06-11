import java.util.Scanner;

public class Ejercicio_21 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] numeros = new int[10];
		int x;
		int mayores = 0;
		
		System.out.println("Ingresar 10 numeros");
		for(int i = 0; i < 10; i++) {
			System.out.print("Ingresar numero " + (i + 1) + ": ");
			numeros[i] = scanner.nextInt();
		}
		
		System.out.println("Ingresar numero X: ");
		x = scanner.nextInt();
		
		for(int numero : numeros) { // Ciclo for-each para recorrer array numeros.
			if(numero > x) {
				mayores++;
			}
		}
		
		System.out.println("La cantidad de numeros mayores a " + x + " son: " + mayores);
		
		scanner.close();
	}

}

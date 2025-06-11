import java.util.Scanner;

public class Ejercicio_18 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero;
		
		System.out.println("Ingresar un numero: ");
		numero = scanner.nextInt();
		
		for(int i = 1; i <= numero; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		scanner.close();
	}

}

import java.util.Scanner;

public class Ejercicio_5 {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		int numero = 0;
		
		System.out.println("Ingresar numero del 1 al 10: ");
		numero = scanner.nextInt();
		
		if(numero > 10) {
			System.out.println("El numero no es valido.");
		}
		else {
			for(int i = 1; i <= 10; i++) {
				System.out.println(numero + " x " + i + " = " + (numero * i));
			}
		}
		scanner.close();
	}

}

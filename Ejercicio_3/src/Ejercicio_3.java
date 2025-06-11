import java.util.Scanner; // Importacion de clase Scanner para leer datos

public class Ejercicio_3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //Declaramos el scanner
		int numero = 0;
		boolean esPrimo;
		
		do {
			
			System.out.println("Ingresar numero: ");
			numero = scanner.nextInt(); //leemos el dato con scanner
			
			esPrimo = true;
			
			if(numero < 2) {
			esPrimo = false;	
			}
			else {
				for(int i = 2; i < numero; i++) {
					if(numero % i == 0) {
						esPrimo = false;
						break;
					}
				}
			}
			
		} while(!(numero > 100 && esPrimo));
		System.out.println("El numero " + numero + " Es primo y mayor a 100");
		
		scanner.close(); // Se cierra el scanner
	}

}

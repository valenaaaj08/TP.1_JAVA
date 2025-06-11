import java.util.Scanner;

public class Ejercicio_23 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] jugadores = {"Messi", "Vardy", "Quaresma", "Ozil", "Cherki"};
		String jugadorBuscado;
		boolean encontrado = false;
		
		System.out.println("Ingrese apellido del jugador a buscar: ");
		jugadorBuscado = scanner.nextLine();
		
		for(String jugador : jugadores) {
			if(jugadorBuscado.equalsIgnoreCase(jugador)) { // La funcion equalsIgnoreCase compara el contendio de dos strings, en este caso jugadorBuscado en jugadores.
				encontrado = true;
				break;
			}
		}
		
		if(encontrado) {
			System.out.println("El jugador se encuentra en la lista!!!");
		}
		else {
			System.out.println("El jugador no se encuentra en la lista.");
		}
	
	scanner.close();
	}

}

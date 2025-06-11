import java.util.Scanner;

public class Ejercicio_17 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String frase;
		int palabras = 0;
		
		System.out.println("Ingrese una frase: ");
		frase = scanner.nextLine();
		
		for(int i = 0; i < frase.length(); i++) {
			if(frase.charAt(i) == ' ') {
				palabras++;
			}
		}
		palabras++;
		
		System.out.println("La frase tiene " + palabras + " palabras.");
		
		scanner.close();
	}

}

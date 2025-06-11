import java.util.Scanner;

public class Ejercicio_12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero;
		int suma = 0;
		
		System.out.println("Ingresar numero: ");
		numero = scanner.nextInt();
		
		String numeroString = Integer.toString(numero); //Funcion para converir un int en string
		for(int i = 0; i < numeroString.length(); i++) {
			int digito = Character.getNumericValue(numeroString.charAt(i)); //Funcion para convertir los caracteres en los valores numericos correspondientes
			suma += digito;
		}
		
		System.out.println("La suma de los digitos es: " + suma);
		scanner.close();
	}

}

import java.util.Scanner;

public class Ejercicio_6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String texto;
		
        System.out.print("Ingresa una palabra o frase: ");
        texto = scanner.nextLine();

        String textoInvertido = "";

        for (int i = texto.length() - 1; i >= 0; i--) { // length() devuelve la cantidad de caracteres que contiene el string texto
            textoInvertido += texto.charAt(i); //charAt() devuelve el caracter que hay en la posicion i del string texto
        }

        System.out.println("Texto invertido: " + textoInvertido);

        scanner.close();
	}

}

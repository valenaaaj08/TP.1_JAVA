import java.util.Scanner;

public class Ejercicio_7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa una frase o palabra: ");
        String texto = scanner.nextLine();

        texto = texto.toLowerCase();

        int vocales = 0;
        int consonantes = 0;

        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);

            if (letra >= 'a' && letra <= 'z') {
                if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                    vocales++;
                } else {
                    consonantes++;
                }
            }
        }

        System.out.println("Numero de vocales: " + vocales);
        System.out.println("Numero de consonantes: " + consonantes);

        scanner.close();
	}

}

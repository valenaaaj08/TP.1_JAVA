import java.util.Scanner;

public class Ejercicio_4 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        
        System.out.print("Introduce un numero entero positivo: ");
        numero = scanner.nextInt();
        
        int sumaPares = 0;
        int sumaImpares = 0;
        
        // Recorrer desde 1 hasta N
        for (int i = 1; i <= numero; i++) {
            if (i % 2 == 0) {
                sumaPares += i; // Si es par, lo sumamos a sumaPares
            } else {
                sumaImpares += i; // Si es impar, lo sumamos a sumaImpares
            }
        }
 
        System.out.println("La suma de los números pares desde 1 hasta " + numero + " es: " + sumaPares);
        System.out.println("La suma de los números impares desde 1 hasta " + numero + " es: " + sumaImpares);
        
        scanner.close();
	}

}

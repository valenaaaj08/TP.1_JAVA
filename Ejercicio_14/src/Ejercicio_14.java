import java.util.Scanner;

public class Ejercicio_14 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero;
		int a = 0; 
		int b = 1; 
		int siguiente = 0;
		
		System.out.println("Ingresa cuantos terminos de la secuencia Fibonacci desea ver: ");
		numero = scanner.nextInt();
		
		
	    System.out.print("Secuencia Fibonacci: ");
	    for (int i = 1; i <= numero; i++) {
	    	System.out.print(a + " ");
	    	
	    	siguiente = a + b;
	        a = b;
	        b = siguiente;
	    }
	    
	scanner.close();

	}

}

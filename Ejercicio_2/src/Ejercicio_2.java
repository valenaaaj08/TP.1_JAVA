
public class Ejercicio_2 {

	public static void main(String[] args) {
		for(int i = 50; i <= 100; i++) { // Ciclo For para recorrer los nuemros de 50 a 100
			boolean esPrimo = true;
			for(int j = 2; j < i; j++) { // Ciclo For para verificar si el numero tiene divisores que no sean ni uno, ni el mismo numero
				if(i % j == 0) { // If para verificar si tiene divisores
					esPrimo = false;
					break;
				}
			}
			if(esPrimo){
				System.out.println(i + " Primo"); // Imprimir numeros primos
			}
			else{
				System.out.println(i + " Divisores: ");
				for(int k = 1; k <= i; k++) { // CIclo For para que al no ser primo imprimir sus divisores
					if(i % k == 0) { // Condicion para verificar los divisores
						System.out.print(k + " "); // Imprimir numeros no primos con sus divisores
					}
				}
				System.out.println();
			}	
		}	
	}
}


public class Ejercicio_1 { // Se define la clase publica del ejercicio

	public static void main(String[] args) { // Metodo principal donde comienza la ejecucion del programa
		for(int i = 0; i <= 100; i++){ // Ciclo For para recorrer los numeros de 0 a 100
			if(i % 2 == 0) { // If para determinar si son pares o no
				System.out.println(i + " Par\n"); // Si es par lo imprime con la aclaracion "Par"
			}
			else {
				System.out.println(i + "\n"); // Si es impar solo imprime el numero
			}
		}
	}
}

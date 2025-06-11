
public class Ejercicio_24 {

	public static void main(String[] args) {
		String[] corredores = {"Bottas", "Leclrec", "Vettel", "Räikkönen", "Reutemann"}; // Declaramos un arreglo String de 5 posiciones, en este caso con corredores de Formula 1
		int iteracion = 1;
		
		for(String corredor : corredores) { // Hacemos un for-each para recorrer el array corredores
			System.out.println("Iteracion " + iteracion);
			System.out.println("Corredor: " + corredor); // En la primera iteracion 'corredor' toma el valor de la primera posicion de 'corredores' (Bottas), en la segunda iteracion tomara la segunda posicion de 'corredores' (Leclrec), y asi sucesivamente
			System.out.println();
			iteracion++;
		}
	}

}

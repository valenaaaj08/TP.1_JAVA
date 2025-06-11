import java.util.Scanner;

public class Ejercicio_22 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double[] calificaciones = new double[5];
		double totalCalificaciones = 0;
		double promedio;
		
		System.out.println("Ingresar calificaciones: ");
		for(int i = 0; i < 5; i++) {
			System.out.print("Ingresar calificacion " + (i + 1) + ": ");
			calificaciones[i] = scanner.nextDouble();
		}
		
		for(double calificacion : calificaciones) {
			totalCalificaciones += calificacion; 
		}
		
		promedio = totalCalificaciones / 5;
		
		System.out.println("El promedio de las calificaiones es: " + promedio);
		
		scanner.close();
	}

}

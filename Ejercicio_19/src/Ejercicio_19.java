import java.util.Random;

public class Ejercicio_19 {

	public static void main(String[] args) {
		Random random = new Random();
		int dado1, dado2;
		int suma;
		
		dado1 = random.nextInt(6) + 1;
		dado2 = random.nextInt(6) + 1;
		
		suma = dado1 + dado2;
		
		System.out.println("Valor dado 1: " + dado1);
		System.out.println("Valor dado 2: " + dado2);
		System.out.println("Suma total: " + suma);
		
	}

}

import java.util.Scanner;

public class Ejercicio_15 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		float saldo = 1000;
		int opc;
		float monto;
		
		System.out.println("Saldo inicial: $1000");
		
		do {
			System.out.println("\nSeleccione una opcion: ");
			System.out.println("1. Deposito.");
			System.out.println("2. Retiro.");
			System.out.println("3. Consultar saldo.");
			System.out.println("4. Salir del cajero.");
			opc = scanner.nextInt();
			
			switch(opc) {
				
			case 1:
				System.out.print("Ingrese monto de deposito: ");
				monto = scanner.nextFloat();
				
				if(monto < 0) {
					System.out.println("El monto debe ser positivo");
				}
				else {
					saldo += monto;	
					System.out.println("Deposito exitoso!!!");
				}
				
			break;
			
			case 2:
				System.out.print("Ingrese monto de retiro: ");
				monto = scanner.nextFloat();
				
				if(monto > saldo) {
					System.out.println("El saldo no es suficiente.");
				}
				else if(monto < 0) {
					System.out.println("El monto debe ser positivo.");
				}
				else {
					saldo -= monto;
					System.out.println("Retiro exitoso!!!");
				}
				
			break;
			
			case 3:
				System.out.println("Saldo actual: $" + saldo);
			break;
			
			case 4:
				System.out.println("Saliendo del programa...");
			break;
			
			default:
				System.out.println("Opcion invalida.");
			break;
			}
			
			
		}while(opc != 4);
		
		scanner.close();
	}

}

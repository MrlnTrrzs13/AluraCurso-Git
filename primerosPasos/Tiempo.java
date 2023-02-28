package ejemplo;

import java.util.Scanner;

public class Tiempo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int tiempo, opcion, operacionMinutos, operacionSegundos, condicion = 2;

		int i = 0;

		do {
			i = 0;
			System.out.print("Dame la cantidad en horas: ");
			tiempo = in.nextInt();
			operacionMinutos = 60 * tiempo;
			operacionSegundos = 60 * operacionMinutos;
			System.out.println();
			System.out.println("La(s) hora(s) " + tiempo + "hrs contiene " + operacionMinutos + " minutos y "
					+ operacionSegundos + " segundos.");
			System.out.println();
			System.out.print("Desea continuar: Si(1) / No(2): ");
			opcion = in.nextInt();
			if (opcion == condicion) {
				System.out.println("Muchas gracias hasta luego.");
				i = opcion;
			}
			i++;
		} while (i <= condicion);

	}
}

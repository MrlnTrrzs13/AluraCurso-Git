package ejemplo;

import java.util.Scanner;

public class Salarios {
	public static void main(String[] args) {
		String nombre1 = "Brandon Garcia", nombre2 = "Fabiola Contreras", nombre3 = "Ricardo Montreal", nombre4 = "Martha Salinas", nombre5 = "Rodrigo Hernandez";
		double aumento1 = 16, aumento2 = 12, aumento3 = 14, aumento4 = 15, aumento5 = 16;
		double salario1 = 2000, salario2 = 2500, salario3 = 3000, salario4 = 3500, salario5 = 4000;
		Scanner in = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			System.out.print("Dame el número de empleado: ");
			int numeroEmpleado = in.nextInt();

			if (numeroEmpleado == 1) {
				double operacion = (salario1 * (aumento1 / 100));
				double persepcion = salario1 + operacion;
				System.out.println("El empleado de nombre: " + nombre1 + ", con número de empleado: " + numeroEmpleado
						+ ", persive un salario de $" + salario1 + ", más un aúmento del " + aumento1
						+ "%. Recibe un total de: $" + persepcion);
			} else if (numeroEmpleado == 2) {
				double operacion = salario2 * (aumento2 / 100);
				double persepcion = salario2 + operacion;
				System.out.println("El empleado de nombre: " + nombre2 + ", con número de empleado: " + numeroEmpleado
						+ ", persive un salario de $" + salario2 + ", más un aúmento del " + aumento2
						+ "%. Recibe un total de: $" + persepcion);
			} else if (numeroEmpleado == 3) {
				double operacion = salario3 * (aumento3 / 100);
				double persepcion = salario3 + operacion;
				System.out.println("El empleado de nombre: " + nombre3 + ", con número de empleado: " + numeroEmpleado
						+ ", persive un salario de $" + salario3 + ", más un aúmento del " + aumento3
						+ "%. Recibe un total de: $" + persepcion);
			} else if (numeroEmpleado == 4) {
				double operacion = salario4 * (aumento4 / 100);
				double persepcion = salario4 + operacion;
				System.out.println("El empleado de nombre: " + nombre4 + ", con número de empleado: " + numeroEmpleado
						+ ", persive un salario de $" + salario4 + ", más un aúmento del " + aumento4
						+ "%. Recibe un total de: $" + persepcion);
			} else if (numeroEmpleado == 5) {
				double operacion = salario5 * (aumento5 / 100);
				double persepcion = salario5 + operacion;
				System.out.println("El empleado de nombre: " + nombre5 + ", con número de empleado: " + numeroEmpleado
						+ ", persive un salario de $" + salario5 + ", más un aúmento del " + aumento5
						+ "%. Recibe un total de: " + persepcion);
			} else {
				System.out.println("La opcion que elegiste no exixte");
			}
			System.out.println();
		}
	}
}

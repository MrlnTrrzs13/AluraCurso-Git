package ejemplo;

import java.util.Scanner;

public class Temperatura {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double operacion;
		float c, f, k;

		System.out
				.println("(1)Farenheit a Celsius, (2)Celsius a Farenheit, (3)kelvin a Celsius, (4)kelvin a Farenheit.");
		System.out.println();
		System.out.print("Eliga una Opción: ");
		float opcion = in.nextFloat();
		System.out.println();

		if (opcion == 1) {
			System.out.print("Ingrese los Grados Farenheit que desea convertir: ");
			f = in.nextFloat();
			operacion = (5 * (f - 32) / 9);
			System.out.println("La conversión de " + f + "°F a Celsius es: " + (double)Math.round(operacion*100d)/100 + "°C.");
		} else if (opcion == 2) {
			System.out.print("Ingrese los Grados Celsius que desea convertir: ");
			c = in.nextFloat();
			operacion = (((9 * c) / 5) + 32);
			System.out.println("La conversión de " + c + "°C a Farenheit es: " + (double)Math.round(operacion*100d)/100 + "°F.");
		} else if (opcion == 3) {
			System.out.print("Ingrese los Grados Kelvin que desea convertir: ");
			k = in.nextFloat();
			operacion = (k - 273.15);
			System.out.println("La conversión de " + k + "°K a Celsius es: " + (double)Math.round(operacion*100d)/100 + "°C.");
		} else if (opcion == 4) {
			System.out.print("Ingrese los Grados Celsius que desea convertir: ");
			k = in.nextFloat();
			operacion = ((9 * (k - 273.15) / 5) + 32);
			System.out.println("La conversión de " + k + "°K a Farenheit es: " + (double)Math.round(operacion*100d)/100 + "°F.");
		}
	}
}

package ejemplo;

import java.util.Scanner;

public class MayorYMenor {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Scanner entrada = new Scanner(System.in);
		String nombre1 = "", nombre2 = "", nombre3 = "", nombre4 = "", nombre5 = "";
		int edad = 0, edad1 = 0, edad2 = 0, edad3 = 0, edad4 = 0, edad5 = 0;

		int i = 1;
		do {
			System.out.print("Dame tú nombre: ");
			String nombre = in.nextLine();
			System.out.print(nombre + " ¿Cual es tú edad?: ");
			edad = entrada.nextInt();
			if (i == 1) {
				nombre1 = nombre;
				edad1 = edad;
			} else if (i == 2) {
				nombre2 = nombre;
				edad2 = edad;
			} else if (i == 3) {
				nombre3 = nombre;
				edad3 = edad;
			} else if (i == 4) {
				nombre4 = nombre;
				edad4 = edad;
			} else if (i == 5) {
				nombre5 = nombre;
				edad5 = edad;
			}
			i++;
		} while (i <= 5);

		if (edad1 > edad2 && edad1 > edad3 && edad1 > edad4 && edad1 > edad5) {
			System.out.println(nombre1 + " es mayor que todos.");

			if (edad1 < edad2 && edad1 < edad3 && edad1 < edad4 && edad1 < edad5) {
				System.out.println(nombre1 + " es menor que todos.");

			} else if (edad2 < edad1 && edad2 < edad3 && edad2 < edad4 && edad2 < edad5) {
				System.out.println(nombre2 + " es menor que todos.");

			} else if (edad3 < edad1 && edad3 < edad2 && edad3 < edad4 && edad3 < edad5) {
				System.out.println(nombre3 + " es menor que todos.");

			} else if (edad4 < edad1 && edad4 < edad2 && edad4 < edad3 && edad4 < edad5) {
				System.out.println(nombre4 + " es menor que todos.");
			} else if (edad5 < edad1 && edad5 < edad2 && edad5 < edad3 && edad5 < edad4) {
				System.out.println(nombre5 + " es menor que todos.");
			}

		} else if (edad2 > edad1 && edad2 > edad3 && edad2 > edad4 && edad2 > edad5) {
			System.out.println(nombre2 + " es mayor que todos.");

			if (edad1 < edad2 && edad1 < edad3 && edad1 < edad4 && edad1 < edad5) {
				System.out.println(nombre1 + " es menor que todos.");

			} else if (edad2 < edad1 && edad2 < edad3 && edad2 < edad4 && edad2 < edad5) {
				System.out.println(nombre2 + " es menor que todos.");

			} else if (edad3 < edad1 && edad3 < edad2 && edad3 < edad4 && edad3 < edad5) {
				System.out.println(nombre3 + " es menor que todos.");

			} else if (edad4 < edad1 && edad4 < edad2 && edad4 < edad3 && edad4 < edad5) {
				System.out.println(nombre4 + " es menor que todos.");
			} else if (edad5 < edad1 && edad5 < edad2 && edad5 < edad3 && edad5 < edad4) {
				System.out.println(nombre5 + " es menor que todos.");
			}

		} else if (edad3 > edad1 && edad3 > edad2 && edad3 > edad4 && edad3 > edad5) {
			System.out.println(nombre3 + " es mayor que todos.");

			if (edad1 < edad2 && edad1 < edad3 && edad1 < edad4 && edad1 < edad5) {
				System.out.println(nombre1 + " es menor que todos.");

			} else if (edad2 < edad1 && edad2 < edad3 && edad2 < edad4 && edad2 < edad5) {
				System.out.println(nombre2 + " es menor que todos.");

			} else if (edad3 < edad1 && edad3 < edad2 && edad3 < edad4 && edad3 < edad5) {
				System.out.println(nombre3 + " es menor que todos.");

			} else if (edad4 < edad1 && edad4 < edad2 && edad4 < edad3 && edad4 < edad5) {
				System.out.println(nombre4 + " es menor que todos.");
			} else if (edad5 < edad1 && edad5 < edad2 && edad5 < edad3 && edad5 < edad4) {
				System.out.println(nombre5 + " es menor que todos.");
			}

		} else if (edad4 > edad1 && edad4 > edad2 && edad4 > edad3 && edad4 > edad5) {
			System.out.println(nombre4 + " es mayor que todos.");

			if (edad1 < edad2 && edad1 < edad3 && edad1 < edad4 && edad1 < edad5) {
				System.out.println(nombre1 + " es menor que todos.");

			} else if (edad2 < edad1 && edad2 < edad3 && edad2 < edad4 && edad2 < edad5) {
				System.out.println(nombre2 + " es menor que todos.");

			} else if (edad3 < edad1 && edad3 < edad2 && edad3 < edad4 && edad3 < edad5) {
				System.out.println(nombre3 + " es menor que todos.");

			} else if (edad4 < edad1 && edad4 < edad2 && edad4 < edad3 && edad4 < edad5) {
				System.out.println(nombre4 + " es menor que todos.");
			} else if (edad5 < edad1 && edad5 < edad2 && edad5 < edad3 && edad5 < edad4) {
				System.out.println(nombre5 + " es menor que todos.");
			}

		} else if (edad5 > edad1 && edad5 > edad2 && edad5 > edad3 && edad5 > edad4) {
			System.out.println(nombre5 + " es mayor que todos.");

			if (edad1 < edad2 && edad1 < edad3 && edad1 < edad4 && edad1 < edad5) {
				System.out.println(nombre1 + " es menor que todos.");

			} else if (edad2 < edad1 && edad2 < edad3 && edad2 < edad4 && edad2 < edad5) {
				System.out.println(nombre2 + " es menor que todos.");

			} else if (edad3 < edad1 && edad3 < edad2 && edad3 < edad4 && edad3 < edad5) {
				System.out.println(nombre3 + " es menor que todos.");

			} else if (edad4 < edad1 && edad4 < edad2 && edad4 < edad3 && edad4 < edad5) {
				System.out.println(nombre4 + " es menor que todos.");
			} else if (edad5 < edad1 && edad5 < edad2 && edad5 < edad3 && edad5 < edad4) {
				System.out.println(nombre5 + " es menor que todos.");
			}
		}
	}
}

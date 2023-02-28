package ejemplo;

import java.util.Scanner;

public class Cadena {
	public static void main(String[] args) {
		String cadenaOriginal = "", cadenaSubstraccion = "";
		int numeroCaracteres = 0, desde = 0, hasta = 0;
		Scanner entrada = new Scanner(System.in);

		System.out.print("Introduce una cadena de caracteres: ");
		cadenaOriginal = entrada.nextLine();

		numeroCaracteres = cadenaOriginal.length();

		System.out.println(
				"La cadena de caracteres: <<" + cadenaOriginal + ">> posee " + numeroCaracteres + " caracteres.");

		System.out.print("¿Desde qué carácter deseas obtener la nueva cádena?: ");
		desde = entrada.nextInt();
		System.out.print("¿Hasta qué carácter deseas obtener la nueva cádena?: ");
		hasta = entrada.nextInt();

		cadenaSubstraccion = cadenaOriginal.substring(desde, hasta);
		System.out.println("La nueva cadena de carácteres es: " + cadenaSubstraccion);
	}
}

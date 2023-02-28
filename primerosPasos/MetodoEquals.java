package ejemplo;

import java.util.Scanner;

public class MetodoEquals {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String usuario = "", password = "";

		System.out.print("Nombre de Usuario: ");
		usuario = in.nextLine();
		System.out.println();
		System.out.print("Contraseña: ");
		password = in.nextLine();
		System.out.println();

		if (usuario.equals("marlon") && password.equals("1234")) {
			System.out.println("Inicio de sesion correcto.");
		} else {
			System.out.println("Inicio de sesion incorrecto.");
		}
	}
}

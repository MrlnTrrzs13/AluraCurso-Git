package ejemplo;

public class TestCondicional2 {
	public static void main(String[] args) {
		System.out.println("Probando condicionales");
		System.out.println("");

		int edad = 15, cantidadPersonas = 3;
		boolean acompañado = cantidadPersonas >= 2;

		if (edad >= 18 && acompañado) {
			System.out.println("Bienvenido");
		} else {
			System.out.println("Lo siento no puedes ingresar.");
		}
	}
}

package ejemplo;

public class EjemploCondicionales {
	public static void main(String[] args) {
		System.out.println("Hello world");

		int edad = 18;
		int operaciones = 3, numero1 = 6, numero2 = 3, resultado = 0;

		if (edad >= 18) {
			System.out.println("Puedes pasar");
		} else {
			System.out.println("Lo siento no puedes pasar");
		}

		if (operaciones == 1) {
			resultado = numero1 + numero2;
			System.out.println("El resultado de la suma (" + numero1 + " + " + numero2 + ") es: " + resultado);
		} else if (operaciones == 2) {
			resultado = numero1 - numero2;
			System.out.println("El resultado de la resta (" + numero1 + " - " + numero2 + ") es: " + resultado);
		} else if (operaciones == 3) {
			resultado = numero1 * numero2;
			System.out.println("El resultado de la multiplicación (" + numero1 + " x " + numero2 + ") es: " + resultado);
		} else if (operaciones == 4) {
			resultado = numero1 / numero2;
			System.out.println("El resultado de la división (" + numero1 + " + " + numero2 + ") es: " + resultado);
		} else {
			System.out.println("La operación que elegiste no existe.");
		}
	}
}

package ejemplo;

public class Sintaxis {
	public static void main(String[] args) {
		int numero1 = 4;
		int numero2 = 6;
		int resultado = 0;

		resultado = numero1 + numero2 / 2;

		System.out.println("El resultado incorrecto por sintaxis es: " + resultado);

		resultado = (numero1 + numero2) / 2;

		System.out.println("El resultado correcto es: " + resultado);
	}
}

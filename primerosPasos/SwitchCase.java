package ejemplo;

public class SwitchCase {
	public static void main(String[] args) {
		int numero1 = 6, numero2 = 3, resultado = 0, parametro = 4;

		switch (parametro) {
		case 1:
			resultado = numero1 + numero2;
			System.out.println("El resultado de la suma es: " + resultado);
			break;
		case 2:
			resultado = numero1 - numero2;
			System.out.println("El resultado de la resta es: " + resultado);
			break;
		case 3:
			resultado = numero1 * numero2;
			System.out.println("El resultado de la multiplicaion es: " + resultado);
			break;
		case 4:
			resultado = numero1 / numero2;
			System.out.println("El resultado de la division es: " + resultado);
			break;
		}
	}
}

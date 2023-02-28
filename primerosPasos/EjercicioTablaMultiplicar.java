package ejemplo;

public class EjercicioTablaMultiplicar {
	public static void main(String[] args) {
		int resultado = 0;

		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				resultado = i * j;
				System.out.println(i + " x " + j + " = " + resultado);
			}
			System.out.println("");
		}
	}
}

package ejemplo;

public class Factorial {
	public static void main(String[] args) {
		int factorial = 1;

		for (int i = 1; i <= 8; i++) {
			for (int j = 1; j <= i; j++) {
				factorial *= i;
				System.out.println("El factorial de " + i + " es = " + factorial);

			}
		}
	}
}

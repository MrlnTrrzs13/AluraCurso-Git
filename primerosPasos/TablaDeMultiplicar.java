package ejemplo;

import java.util.Scanner;

public class TablaDeMultiplicar {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int resultado = 0, numero;

		System.out.print("Dame un número para multiplicarlo: ");
		numero = in.nextInt();
		System.out.println();

		for (int j = 1; j <= 10; j++) {
			resultado = numero * j;
			System.out.println(numero + " x " + j + " = " + resultado);
		}
		System.out.println("");
	}
}

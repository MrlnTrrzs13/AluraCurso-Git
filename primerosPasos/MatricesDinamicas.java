package ejemplo;

import java.util.Scanner;

public class MatricesDinamicas {
	public static void main(String[] args) {
		int filas = 0, columnas = 0, contador = 1;
		Scanner in = new Scanner(System.in);

		System.out.print("¿Cuántas filas deseas?:");
		filas = in.nextInt();

		System.out.print("¿Cuántas columnas deseas?:");
		columnas = in.nextInt();

		int numeros[][] = new int[filas][columnas];

		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				numeros[i][j] = contador;
				contador++;
				System.out.print("[" + numeros[i][j] + "]");
			}
			System.out.println();
		}
		System.out.println();

		for (int fila = 0; fila <= 10; fila++) {
			for (int columna = 0; columna < fila; columna++) {
				System.out.print(" * ");
			}
			System.out.println("");
		}
	}
}

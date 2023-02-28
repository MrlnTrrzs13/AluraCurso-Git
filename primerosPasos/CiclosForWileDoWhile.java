package ejemplo;

public class CiclosForWileDoWhile {
	public static void main(String[] args) {

		int contador = 0, i = 1, j = 99;

		// Ciclo While
		System.out.println("Este es un ciclo While:");

		while (contador <= 10) {
			System.out.print(contador + ", ");
			contador++;
		}
		System.out.println("");

		System.out.println("Serie con While");
		while (i <= 5) {
			if (i < 5) {
				System.out.print(i + ", ");
				System.out.print(j + ", ");
			} else {
				System.out.print(i + ", ");
				System.out.print(j);
			}
			i++;
			j--;
		}
		System.out.println("");
		
		i = 1;
		j = 99;
		
		System.out.println("");
		System.out.println("Este es un ciclo for:");

		for (i = 0; i <= 10; i++) {
			System.out.print(i + ", ");
		}
		
		System.out.println("");
		System.out.println("Serie con For.");

		for (i = 1; i < 5; i++) {
			if (i < 5) {
				System.out.print(i + ", ");
				System.out.print(j + ", ");
			} else {
				System.out.print(i + ", ");
				System.out.print(j);
			}
			j--;
		}
		System.out.println("");
		System.out.println("");
		System.out.println("Este es un cilo Do-Wile:");
		
		contador = 0;
		
		do {
			System.out.print(contador + ", ");
			contador ++;
		} while (contador <= 10);

		i = 1;
		j = 99;
		
		System.out.println("");
		System.out.println("Serie con Do-while");

		do {
			if (i < 5) {
				System.out.print(i + ", ");
				System.out.print(j + ", ");
			} else {
				System.out.print(i + ", ");
				System.out.print(j);
			}
			i++;
			j--;
		} while (i <= 5);
	}
}

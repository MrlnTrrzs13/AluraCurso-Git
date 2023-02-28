package ejemplo;

public class EjemploCicloWhile {
	public static void main(String[] args) {
		int contador = 0, i = 1, total = 0;

		while (i < 10) {
			System.out.print(i + ", ");
			i += 2;
		}

		while (contador <= 10) {// mientras que (CONTADOR) ejecuta!
			System.out.println(contador);
			contador++;

		}

		while (contador <= 10) {
			total = total + contador;
			contador++;
		}
		System.out.println(total);
	}
}

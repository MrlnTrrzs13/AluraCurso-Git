package ejemplo;

public class Fibonacci {
	public static void main(String[] args) {
		int a = 0, b = 1, c = 0, i = 0;
		System.out.println("Serie con For:");
		for (i = 0; i < 10; i++) {
			if (i < 9) {
				System.out.print(a + ", ");
				c = a + b;
				a = b;
				b = c;
			} else {
				System.out.println(a);
			}
		}
		System.out.println();

		a = 0;
		b = 1;
		c = 0;
		i = 0;

		System.out.println("Serie con While;");
		while (i < 10) {
			if (i < 9) {
				System.out.print(a + ", ");
				c = a + b;
				a = b;
				b = c;
			} else {
				System.out.println(a);
			}
			i++;
		}
		System.out.println();

		a = 0;
		b = 1;
		c = 0;
		i = 0;

		System.out.println("Serie con Do-While:");
		do {
			if (i < 9) {
				System.out.print(a + ", ");
				c = a + b;
				a = b;
				b = c;
			} else {
				System.out.println(a);
			}
			i++;
		} while (i < 10);
	}
}

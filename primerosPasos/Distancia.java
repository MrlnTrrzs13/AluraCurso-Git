package ejemplo;

import java.util.Scanner;

public class Distancia {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double x1 = 0, x2 = 0,y1 = 0,y2 = 0;
		
		System.out.print("Dame la coordenada X1: ");
		x1 = in.nextDouble();
		System.out.println();
		System.out.print("Dame la coordenada Y1: ");
		y1 = in.nextDouble();
		System.out.println();
		System.out.print("Dame la coordenada X2: ");
		x2 = in.nextDouble();
		System.out.println();
		System.out.print("Dame la coordenada Y2: ");
		y2 = in.nextDouble();
		System.out.println();
		
		double operacion = ((x1 - x2) * (x1 - x2)) + ((y1 - y2) * (y1 - y2));
		double resultado = Math.sqrt(operacion);
		
		System.out.println("La distancia dada es de: " + (double)Math.round(resultado * 100d)/100);
		
	}
}

package ejemplo;

public class Promedio {
	public static void main(String[] args) {
		int matematicas = 5, biologia = 6, quimica = 6, promedio = 0;
		
		promedio = (matematicas + biologia + quimica) / 3;
		
		if (promedio >= 6) {
			System.out.println("El alumno aprobó con: " + promedio);
		} else {
			System.out.println("El alumno reprobó con: " + promedio);
		}
	}
}

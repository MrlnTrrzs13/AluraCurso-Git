package ejemplo;

public class TestCondicional {
	public static void main(String[] args) {
		System.out.println("Probando condicionales");
		System.out.println("");
		
		int edad = 18;
		int cantidadDePersonas = 2;
		
		if(edad >= 18 || cantidadDePersonas >= 2) {
			System.out.println("Tienes más de 18 años.");
			System.out.println("Bienvenido.");
		}
		else {
			System.out.println("Lamentablemente no puedes Ingresar.");
		}
	}
}

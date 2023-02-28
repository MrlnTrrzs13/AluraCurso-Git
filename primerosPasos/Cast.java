package ejemplo;

public class Cast {
	public static void main(String[] args) {
		double variable = 230.89;
		int variableEntero = (int) variable; //cast
		int resultado = 500 + variableEntero;
		
		System.out.println(resultado);
		
		long prueba = 122222222222222L;//Números largos
		short num = 13555;//Número pequeño
		byte numero = 15;//Número hasta 8 by
		
		//FLOAT. Es igual que double pero soporta menos caracteres
		float numeroDecimalPequeño= 2.5F;
		
		System.out.println(prueba + " " + num + " " + numero + " " + numeroDecimalPequeño);
	}
}

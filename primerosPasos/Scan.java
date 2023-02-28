import java.util.Scanner;

public class Scan {
  public static void main(String args[]){
    Scanner in = new Scanner(System.in);
    String nombre = "";
    int numero1 = 0, numero2 = 0, resultado = 0;

    System.out.println("¿Cuál es tú nombre?");
    nombre = in.nextLine();
    System.out.println("Dame el primer valor de tú suma:");
    numero1 = in.nextInt();
    System.out.println("Dame el segundo valor de tú suma:");
    numero2 = in.nextInt();

    resultado = numero1 + numero2;

    System.out.println("Hola " + nombre + " el resultado de tú suma es: " + resultado);
  }
}

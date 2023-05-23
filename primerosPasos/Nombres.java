import java.util.Scanner;

public class Nombres {
  public static void main (String args[]){

    String nombre1 = "", nombre2 = "";
    Scanner entrada = new Scanner(System.in);

    System.out.print("Porfavor ingresa el primer nombre: ");
    nombre1 = entrada.nextLine();

    System.out.print("Porfavor ingresa el segundo nombre: ");
    nombre2 = entrada.nextLine();

    if (nombre1.equalsIgnoreCase(nombre2)){
      System.out.println("Los nombres son iguales.");
    }
    else {
      System.out.print("Los nombres son diferentes.");
    }
  }
}

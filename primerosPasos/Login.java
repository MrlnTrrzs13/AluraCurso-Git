import java.util.Scanner;

public class Login {
  public static void main (String args[]){
    String usuario = "", password = "";
    Scanner entrada = new Scanner(System.in);

    System.out.print("Ingresa tú nombre de usuario: ");
    usuario = entrada.nextLine();
    
    System.out.print("Ingresa tú contraseña: ");
    password = entrada.nextLine();

    if(usuario.equals("ernesto") && password.equals("1234")){
      System.out.println("Inicio de sesión correcto");
    }
    else {
      System.out.println("Inicio de sesion incorrecto");
    }
  }
}

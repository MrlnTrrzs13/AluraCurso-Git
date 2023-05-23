public class Operacion {
  public static void main (String Args[]){
    int operacion = 5;
    int numero1 = 6;
    int numero2 = 3;
    int resultado = 0;

    if(operacion == 1) {
      resultado = numero1 + numero2;
      System.out.println("El resultado de la suma es: " + resultado);
    }
    else if (operacion == 2){
      resultado = numero1 - numero2;
      System.out.println("El resultado de la resta es: " + resultado);
    }
    else if (operacion == 3){
      resultado = numero1 * numero2;
      System.out.println("El resultado de la multiplicación es: " + resultado);
    }
    else if (operacion == 4){
      resultado = numero1 / numero2;
      System.out.println("El resultado de la división es: " + resultado);
    }
    else {
      System.out.println("La opción que elegiste no existe.");
    }
  }
}

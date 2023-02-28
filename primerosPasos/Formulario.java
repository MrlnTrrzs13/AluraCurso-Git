import javax.swing.*;

public class Formulario extends JFrame {
  private JLabel label1;
  private JLabel label2;
  private JLabel label3;

  public Formulario(){
    setLayout(null);
    label1 = new JLabel("Interfaz Gráfica.");
    label1.setBounds(10,20,300,30);
    add (label1);
    label2 = new JLabel("La Geekipedia de Ernesto");
    label2.setBounds (10,70,200,30);
    add (label2);
    label3 = new JLabel("Versión 1.0");
    label3.setBounds(10,120,100,30);
    add (label3);
  }

  public static void main(String args[]){
    Formulario formulario1 = new Formulario();
    formulario1.setBounds(0,0,400,300);
    formulario1.setVisible(true);
    formulario1.setResizable(false);
    formulario1.setLocationRelativeTo(null);
  }
}

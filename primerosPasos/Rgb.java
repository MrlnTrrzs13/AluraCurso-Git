import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rgb extends JFrame implements ActionListener {

  private JComboBox combo1, combo2, combo3;
  private JLabel rojo, verde, azul;
  private JButton boton1, boton2;

  public Rgb(){
    setLayout(null);
    rojo = new JLabel("Red:");
    rojo.setBounds(10,10,100,10);
    add(rojo);

    combo1 = new JComboBox();
    combo1.setBounds(120,10,50,30);
      for (int i = 0; i <=255; i ++) {
        combo1.addItem(String.valueOf(i));
      }
    add(combo1);

    verde = new JLabel("Green:");
    verde.setBounds(10,50,100,10);
    add(verde);

    combo2 = new JComboBox();
    combo2.setBounds(120,50,50,30);
      for (int i = 0; i <=255; i ++) {
        combo2.addItem(String.valueOf(i));
      }
    add(combo2);

    azul = new JLabel("Blue:");
    azul.setBounds(10,90,100,10);
    add(azul);

    combo3 = new JComboBox();
    combo3.setBounds(120,90,50,30);
      for (int i = 0; i <=255; i ++) {
        combo3.addItem(String.valueOf(i));
      }
    add(combo3);

    boton1 = new JButton ("Fijar Boton");
    boton1.setBounds(10,130,100,30);
    add (boton1);
    boton1.addActionListener(this);

    boton2 = new JButton("Cerrar");
    boton2.setBounds(120,130,100,30);
    add (boton2);
    boton2.addActionListener(this);
  }

  public void actionPerformed (ActionEvent e) {
    if(e.getSource() == boton1) {
      String cadena1 = combo1.getSelectedItem().toString();
      String cadena2 = combo2.getSelectedItem().toString();
      String cadena3 = combo3.getSelectedItem().toString();

      int red = Integer.parseInt(cadena1);
      int green = Integer.parseInt(cadena2);
      int blue = Integer.parseInt(cadena3);

      Color color1 = new Color(red,green,blue);
      boton1.setBackground(color1);
    }
    if(e.getSource() == boton2){
      System.exit(0);
    }
  }

  public static void main(String args[]){
    Rgb formulario = new Rgb();
    formulario.setBounds(0,0,240,220);
    formulario.setVisible(true);
    formulario.setResizable(false);
    formulario.setLocationRelativeTo(null);
  }
}

import javax.swing.*;
import java.awt.event.*;

public class InterfazSuma extends JFrame implements ActionListener{

  private JLabel etiqueta1, etiqueta2, etiqueta3;
  private JTextField campoTexto1, campoTexto2;
  private JButton boton1, boton2;

  public InterfazSuma(){
    setLayout(null);
    etiqueta1 = new JLabel("Valor 1:");
    etiqueta1.setBounds(50,5,100,30);
    add (etiqueta1);

    etiqueta2 = new JLabel("Valor 2:");
    etiqueta2.setBounds(50,35,100,30);
    add (etiqueta2);

    etiqueta3 = new JLabel("Resultado:");
    etiqueta3.setBounds(120,80,100,30);
    add(etiqueta3);

    campoTexto1 = new JTextField();
    campoTexto1.setBounds(120,10,150,20);
    add (campoTexto1);

    campoTexto2 = new JTextField();
    campoTexto2.setBounds(120,40,150,20);
    add(campoTexto2);
    
    boton1 = new JButton("Sumar");
    boton1.setBounds(10,80,100,30);
    add(boton1);
    boton1.addActionListener(this);

    boton2 = new JButton("Cerrar");
    boton2.setBounds(240,80,100,30);
    add (boton2);
    boton2.addActionListener(this);
  }
  public void actionPerformed(ActionEvent e){
    if(e.getSource() == boton1){
      int valor1 = 0, valor2 = 0, resultado = 0;
      
      valor1 = Integer.parseInt(campoTexto1.getText());
      valor2 = Integer.parseInt(campoTexto2.getText());
      resultado = valor1 + valor2;

      etiqueta3.setText("Resultado: " + resultado);
    }
    if(e.getSource() == boton2){
      System.exit(0);
    }
  }
  public static void main(String args[]){
    InterfazSuma formulario = new InterfazSuma();
    formulario.setBounds(0,0,350,150);
    formulario.setVisible(true);
    formulario.setResizable(false);
    formulario.setLocationRelativeTo(null);
  }
}

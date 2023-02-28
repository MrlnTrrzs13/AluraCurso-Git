import javax.swing.*;
import java.awt.event.*;

public class Botones extends JFrame implements ActionListener{
  private JButton boton1, boton2, boton3, boton4;
  private JLabel texto;

  public Botones(){
    setLayout(null);
    boton1 = new JButton("1");
    boton1.setBounds(10,100,90,30);
    add(boton1);
    boton1.addActionListener(this);

    boton2 = new JButton("2");
    boton2.setBounds(110,100,90,30);
    add(boton2);
    boton2.addActionListener(this);

    boton3 = new JButton("3");
    boton3.setBounds(210,100,90,30);
    add(boton3);
    boton3.addActionListener(this);

    boton4 = new JButton("Cerrar");
    boton4.setBounds(310,100,90,30);
    add(boton4);
    boton4.addActionListener(this);

    texto = new JLabel("En espera...");
    texto.setBounds(10,10,300,30);
    add(texto);
  }

  public void actionPerformed(ActionEvent e){
    if(e.getSource() == boton1) {
      texto.setText("Has presionado el Botón 1.");
    }
    if(e.getSource() == boton2) {
      texto.setText("Has presionado el Botón 2.");
    }
    if(e.getSource() == boton3) {
      texto.setText("Has presionado el Botón 3.");
    }
    if(e.getSource() == boton4) {
      System.exit(0);
    }
  }

  public static void main(String args[]){
    Botones formulario = new Botones();
    formulario.setBounds(0,0,410,200);
    formulario.setVisible(true);
    formulario.setResizable(false);
    formulario.setLocationRelativeTo(null);
  }
}

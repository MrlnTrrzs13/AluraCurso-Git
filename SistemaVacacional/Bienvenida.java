import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Bienvenida extends JFrame implements ActionListener{
  
  private JLabel logo, mensaje, nombre, copy;
  private JTextField texto;
  private JButton ingresar;
  public static String text = "";
  
  public Bienvenida(){
    setLayout(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setTitle("Bienvedido");
    getContentPane().setBackground(new Color(255,0,0));
    setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());

    ImageIcon imagen = new ImageIcon("images/logo-coca.png");
    logo = new JLabel(imagen);
    logo.setBounds(25,15,300,150);
    add(logo);

    mensaje = new JLabel("Sistema de Control Vacacional");
    mensaje.setBounds(35,135,300,30);
    mensaje.setFont(new Font("Cantarell", 3, 18));
    mensaje.setForeground(new Color(255,255,255));
    add(mensaje);

    nombre = new JLabel("Ingrese su nombre");
    nombre.setBounds(45,212,200,30);
    nombre.setFont(new Font("Cantarell", 1, 12));
    nombre.setForeground(new Color(255,255,255));
    add(nombre);

    copy = new JLabel("©2023 The Coca-Cola Company");
    copy.setBounds(85,375,300,30);
    copy.setFont(new Font("Cantarell", 1, 12));
    copy.setForeground(new Color(255,255,255));
    add(copy);

    texto = new JTextField();
    texto.setBounds(45,240,255,25);
    texto.setBackground(new Color(224,224,224));
    texto.setFont(new Font("Cantarell", 1, 14));
    texto.setForeground(new Color(255,0,0));
    add(texto);

    ingresar = new JButton("ingresar");
    ingresar.setBounds(125,280,100,30);
    ingresar.setBackground(new Color(255,255,255));
    ingresar.setFont(new Font("Cantarell", 1, 14));
    ingresar.setForeground(new Color(255,0,0));
    add(ingresar);
    ingresar.addActionListener(this);
  }

  public void actionPerformed(ActionEvent e){
    if(e.getSource() == ingresar){
      text = texto.getText().trim();
      if(text.equals("")){
        JOptionPane.showMessageDialog(null, "Debes ingresar tu nombre.");
      }
      else {
        Licencia ventanaLicencia = new Licencia();
        ventanaLicencia.setBounds(0,0,600,360);
        ventanaLicencia.setVisible(true);
        ventanaLicencia.setResizable(false);
        ventanaLicencia.setLocationRelativeTo(null);
        this.setVisible(false);
      }
    }
  }

  public static void main(String args[]){
    Bienvenida ventanaBienvenida = new Bienvenida();
    ventanaBienvenida.setBounds(0,0,350,450);
    ventanaBienvenida.setVisible(true);
    ventanaBienvenida.setResizable(false);
    ventanaBienvenida.setLocationRelativeTo(null);
  }
}

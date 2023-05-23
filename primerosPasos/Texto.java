import javax.swing.*;
import java.awt.event.*;

public class Texto extends JFrame implements ActionListener{
  
  private JButton boton, boton1;
  private JLabel titulo;
  private JTextField campoTexto;

  public Texto(){
    setLayout(null);
    boton = new JButton("Aceptar");
    boton.setBounds(10,80,100,30);
    add (boton);
    boton.addActionListener(this);
    
    boton1 = new JButton("Cerrar");
    boton1.setBounds(190,80,100,30);
    add (boton1);
    boton1.addActionListener(this);

    titulo = new JLabel("Usuario: ");
    titulo.setBounds(10,10,100,30);
    add (titulo);

    campoTexto = new JTextField();
    campoTexto.setBounds(120,17,150,20);
    add (campoTexto);
  }
  
  public void actionPerformed(ActionEvent e){
    if(e.getSource() == boton){
      String texto = campoTexto.getText();
      setTitle(texto);
    }
    if(e.getSource() == boton1){
      System.exit(0);
    }
  }

  public static void main(String args[]){
    Texto formulario = new Texto();
    formulario.setBounds(0,0,300,150);
    formulario.setVisible(true);
    formulario.setResizable(false);
    formulario.setLocationRelativeTo(null);
  }
}

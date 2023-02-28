import javax.swing.*;
import java.awt.event.*;

public class Scroll extends JFrame implements ActionListener {

  private JTextField campoTexto;
  private JScrollPane scrollPanel;
  private JTextArea textoArea;
  private JButton boton, boton1;
  String texto = "";

  public Scroll(){
    setLayout(null);
    campoTexto = new JTextField();
    campoTexto.setBounds(10,10,200,30);
    add (campoTexto);

    boton = new JButton("Agregar");
    boton.setBounds(220,10,100,30);
    add (boton);
    boton.addActionListener(this);

    boton1 = new JButton("Cerrar");
    boton1.setBounds(330,10,100,30);
    add (boton1);
    boton1.addActionListener(this);

    textoArea = new JTextArea();
    scrollPanel = new JScrollPane(textoArea);
    scrollPanel.setBounds(10,50,420,300);
    add(scrollPanel);
  }

  public void actionPerformed(ActionEvent e) {
    if(e.getSource() == boton){
      texto += campoTexto.getText() + "\n";
      textoArea.setText(texto);
      campoTexto.setText("");
    }
    if(e.getSource() == boton1){
      System.exit(0);
    }
  }

  public static void main(String args[]){
    Scroll formulario = new Scroll();
    formulario.setBounds(0,0,540,400);
    formulario.setVisible(true);
    formulario.setResizable(false);
    formulario.setLocationRelativeTo(null);
  }
}

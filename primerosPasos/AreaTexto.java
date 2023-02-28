import javax.swing.*;

public class AreaTexto extends JFrame {

  private JTextField texto;
  private JTextArea textoArea;

  public AreaTexto() {
    setLayout(null);
    texto = new JTextField();
    texto.setBounds(10,10,200,30);
    add (texto);

    textoArea = new JTextArea();
    textoArea.setBounds(50,50,400,300);
    add (textoArea);
  }

  public static void main(String args[]){
    AreaTexto formulario = new AreaTexto();
    formulario.setBounds(0,0,540,400);
    formulario.setVisible(true);
    formulario.setResizable(false);
    formulario.setLocationRelativeTo(null);
  }
}

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class Licencia extends JFrame implements ActionListener, ChangeListener {
  
  private JLabel logo, mensaje;
  private JTextArea textoArea;
  private JButton aceptar, noAceptar;
  private JCheckBox terminos;
  private JScrollPane scroll;
  String nombre = "";
  
  public Licencia(){
    setLayout(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setTitle("Licencia de uso");
    setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
    Bienvenida ventanaBienvenida = new Bienvenida();
    nombre = ventanaBienvenida.text;

    mensaje = new JLabel("TERMINOS Y CONDICIONES");
    mensaje.setBounds(215,5,200,30);
    mensaje.setFont(new Font("Cantarell", 1, 14));
    mensaje.setForeground(new Color(0,0,0));
    add(mensaje);

    textoArea = new JTextArea();
    textoArea.setEditable(false);
    textoArea.setFont(new Font("Cantarell", 1, 9));   
    textoArea.setText("\n\n          TÉRMINOS Y CONDICIONES" +
                    "\n\n            A.  PROHIBIDA SU VENTA O DISTRIBUCIÓN SIN AUTORIZACIÓN DE LA GEEKIPEDIA DE ERNESTO." +
                    "\n            B.  PROHIBIDA LA ALTERACIÓN DEL CÓDIGO FUENTE O DISEÑO DE LAS INTERFACES GRÁFICAS." +
                    "\n            C.  LA GEEKIPEDIA DE ERNESTO NO SE HACE RESPONSABLE DEL MAL USO DE ESTE SOFTWARE." +
                    "\n\n          LOS ACUERDOS LEGALES EXPUESTOS ACONTINUACIÓN RIGEN EL USO QUE USTED HAGA DE ESTE SOFTWARE" +
                    "\n          (LA GEEKIPEDIA DE ERNESTO Y EL AUTOR ERNESTO), NO SE RESPONSABILIZAN DEL USO QUE USTED" + 
                    "\n          HAGA CON ESTE SOFTWARE Y SUS SERVICIOS. PARA ACEPTAR ESTOS TERMINOS HAGA CLIC EN (ACEPTO)" +
                    "\n          SI USTED NO ACEPTA ESTOS TERMINOS, HAGA CLIC EN (NO ACEPTO) Y NO UTILICE ESTE SOFTWARE." + 
                    "\n\n          PARA MAYOR INFORMACIÓN SOBRE NUESTROS PRODUCTOS O SERVICIOS, POR FAVOR VISITE" + 
                    "\n          http://www.youtube.com/ernestoperezm");
    scroll = new JScrollPane(textoArea);
    scroll.setBounds(10,40,575,200);
    add(scroll);

    terminos = new JCheckBox("Yo " + nombre + " acepto");
    terminos.setBounds(10,250,300,30);
    terminos.addChangeListener(this);
    add(terminos);

    aceptar = new JButton("Continuar");
    aceptar.setBounds(10,290,100,30);
    aceptar.addActionListener(this);
    aceptar.setEnabled(false);
    add(aceptar);

    noAceptar = new JButton("No Acepto");
    noAceptar.setBounds(120,290,100,30);
    noAceptar.addActionListener(this);
    noAceptar.setEnabled(true);
    add(noAceptar);

    ImageIcon imagen = new ImageIcon("images/coca-cola.png");
    logo = new JLabel(imagen);
    logo.setBounds(315,135,300,300);
    add(logo);
  }

  public void stateChanged(ChangeEvent e){
    if(terminos.isSelected() == true){
      aceptar.setEnabled(true);
      noAceptar.setEnabled(false);
    }
    else {
      aceptar.setEnabled(false);
      noAceptar.setEnabled(true);
    }
  }

  public void actionPerformed(ActionEvent e){
    if(e.getSource() == aceptar){
      Principal ventanaPrincipal = new Principal();
      ventanaPrincipal.setBounds(0,0,640,535);
      ventanaPrincipal.setVisible(true);
      ventanaPrincipal.setResizable(false);
      ventanaPrincipal.setLocationRelativeTo(null);
      this.setVisible(false);
    }
    else if(e.getSource() == noAceptar){
      Bienvenida ventanaBienvenida = new Bienvenida();
      ventanaBienvenida.setBounds(0,0,350,450);
      ventanaBienvenida.setVisible(true);
      ventanaBienvenida.setResizable(false);
      ventanaBienvenida.setLocationRelativeTo(null);
      this.setVisible(false);
    }
  }

  public static void main(String args[]){
    Licencia ventanaLicencia = new Licencia();
    ventanaLicencia.setBounds(0,0,600,360);
    ventanaLicencia.setVisible(true);
    ventanaLicencia.setResizable(false);
    ventanaLicencia.setLocationRelativeTo(null);
  }
}
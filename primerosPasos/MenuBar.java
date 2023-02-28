import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MenuBar extends JFrame implements ActionListener {
  private JMenuBar menuBar;
  private JMenu menu;
  private JMenuItem option1, option2, option3;

  public MenuBar() {
    setLayout(null);
    menuBar = new JMenuBar();
    setJMenuBar(menuBar);

    menu = new JMenu ("Opciones");
    menuBar.add(menu);

    option1 = new JMenuItem ("Rojo");
    option1.addActionListener(this);
    menu.add(option1);

    option2 = new JMenuItem ("Verde");
    option2.addActionListener(this);
    menu.add(option2);

    option3 = new JMenuItem ("Azul");
    option3.addActionListener(this);
    menu.add(option3);
  }

  public void actionPerformed(ActionEvent e) {
    Container fondo = this.getContentPane();

    if(e.getSource() == option1){
       fondo.setBackground(new Color(255,0,0));
    }
    if(e.getSource() == option2){
      fondo.setBackground(new Color(0,255,0));
    }
    if(e.getSource() == option3){
      fondo.setBackground(new Color(0,0,255));
    }
  }

  public static void main(String args[]){
    MenuBar formulario = new MenuBar();
    formulario.setBounds(0,0,400,300);
    formulario.setVisible(true);
    formulario.setLocationRelativeTo(null);
  }
}

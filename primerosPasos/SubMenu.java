import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SubMenu extends JFrame implements ActionListener {
  private JMenuBar menuBar;
  private JMenu menu, menu1, menu2;
  private JMenuItem option1, option2, option3, option4, menu3;

  public SubMenu(){
    setLayout(null);
    menuBar = new JMenuBar();
    setJMenuBar(menuBar);

    menu = new JMenu("Opciones");
    menuBar.add(menu);

    menu1 = new JMenu("Tamaño de la ventana");
    menu.add(menu1);

    menu2 = new JMenu("Color de fondo");
    menu.add(menu2);

    menu3 = new JMenuItem("Cerrar");
    menu.add(menu3);
    menu3.addActionListener(this);

    option1 = new JMenuItem("300x200");
    menu1.add(option1);
    option1.addActionListener(this);

    option2 = new JMenuItem("640x480");
    menu1.add(option2);
    option2.addActionListener(this);

    option3 = new JMenuItem("Rojo");
    menu2.add(option3);
    option3.addActionListener(this);

    option4 = new JMenuItem("Verde");
    menu2.add(option4);
    option4.addActionListener(this);
  }
  public void actionPerformed(ActionEvent e) {
    if(e.getSource() == option1){
      setSize(300,200);
    }
    if(e.getSource() == option2){
      setSize(640,480);
    }
    if(e.getSource() == option3){
      getContentPane().setBackground(new Color(255,0,0));
    }
    if(e.getSource() == option4){
      getContentPane().setBackground(new Color(0,255,0));
    }
    if (e.getSource() == menu3){
      System.exit(0);
    }
  }

  public static void main(String args[]){
    SubMenu formulario = new SubMenu();
    formulario.setBounds(0,0,300,200);
    formulario.setVisible(true);
    formulario.setResizable(false);
    formulario.setLocationRelativeTo(null);
  }
}

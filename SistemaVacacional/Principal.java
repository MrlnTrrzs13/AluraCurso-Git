import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Principal extends JFrame implements ActionListener {

  private JMenuBar menuBar;
  private JMenu opciones, calcular, acercaDe, colorFondo;
  private JMenuItem calculo, rojo, negro, morado, elCreador, salir, nuevo;
  private JLabel logo, bienvenido, titulo, lNombre, lAPaterno, lAMaterno, lDepartamento, lAntiguedad, lResultado, lFooter;
  private JTextField tNombre, tAPaterno, tAMaterno;
  private JComboBox cDepartamento, cAntiguedad;
  private JScrollPane scroll;
  private JTextArea textArea;
  String nombreAdministrador = "";

  public Principal(){
    setLayout(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setTitle("Pantalla Principal");
    getContentPane().setBackground(new Color(255,0,0));
    setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
    Bienvenida ventanaBienvenida= new Bienvenida();
    nombreAdministrador = ventanaBienvenida.text;

    menuBar = new JMenuBar();
    menuBar.setBackground(new Color(255,0,0));
    setJMenuBar(menuBar);

    opciones = new JMenu("Opciones");
    opciones.setBackground(new Color(255,0,0));
    opciones.setFont(new Font("Cantarell", 1, 14));
    opciones.setForeground(new Color(255,255,255));
    menuBar.add(opciones);

    calcular = new JMenu("Calcular");
    calcular.setBackground(new Color(255,0,0));
    calcular.setFont(new Font("Cantarell", 1, 14));
    calcular.setForeground(new Color(255,255,255));
    menuBar.add(calcular);

    acercaDe = new JMenu("AcercaDe");
    acercaDe.setBackground(new Color(255,0,0));
    acercaDe.setFont(new Font("Cantarell", 1, 14));
    acercaDe.setForeground(new Color(255,255,255));
    menuBar.add(acercaDe);

    colorFondo = new JMenu("Color de fondo");
    colorFondo.setFont(new Font("Cantarell", 1, 14));
    colorFondo.setForeground(new Color(255, 0, 0));
    opciones.add(colorFondo);

    calculo = new JMenuItem("Vacaciones");
    calculo.setFont(new Font("Cantarell", 1, 14));
    calculo.setForeground(new Color(255, 0, 0));
    calcular.add(calculo);
    calculo.addActionListener(this);

    rojo = new JMenuItem("Rojo");
    rojo.setFont(new Font("Cantarell", 1, 14));
    rojo.setForeground(new Color(255, 0, 0));
    colorFondo.add(rojo);
    rojo.addActionListener(this);

    negro = new JMenuItem("Negro");
    negro.setFont(new Font("Cantarell", 1, 14));
    negro.setForeground(new Color(255, 0, 0));
    colorFondo.add(negro);
    negro.addActionListener(this);

    morado = new JMenuItem("Morado");
    morado.setFont(new Font("Cantarell", 1, 14));
    morado.setForeground(new Color(255, 0, 0));
    colorFondo.add(morado);
    morado.addActionListener(this);

    nuevo = new JMenuItem("Nuevo");
    nuevo.setFont(new Font("Cantarell", 1, 14));
    nuevo.setForeground(new Color(255, 0, 0));
    opciones.add(nuevo);
    nuevo.addActionListener(this);

    elCreador = new JMenuItem("El creador");
    elCreador.setFont(new Font("Cantarell", 1, 14));
    elCreador.setForeground(new Color(255, 0, 0));
    acercaDe.add(elCreador);
    elCreador.addActionListener(this);

    salir = new JMenuItem("Salir");
    salir.setFont(new Font("Cantarell", 1, 14));
    salir.setForeground(new Color(255, 0, 0));
    opciones.add(salir);
    salir.addActionListener(this);

    ImageIcon imagen = new ImageIcon("images/logo-coca.png");
    logo = new JLabel(imagen);  
    logo.setBounds(5,5,250,100);
    add(logo);

    bienvenido = new JLabel("Bienvenido " + nombreAdministrador);
    bienvenido.setBounds(280,30,300,50);
    bienvenido.setFont(new Font("Cantarell", 1, 32));
    bienvenido.setForeground(new Color(255, 255, 255));
    add(bienvenido);

    titulo = new JLabel("Datos del trabajador para el calculo de vacaciones");
    titulo.setBounds(45,140,900,25);
    titulo.setFont(new Font("Cantarell", 0, 24));
    titulo.setForeground(new Color(255, 255, 255));
    add(titulo);

    lNombre = new JLabel("Nombre completo:");
    lNombre.setBounds(25,188,180,25);
    lNombre.setFont(new Font("Cantarell", 1, 12));
    lNombre.setForeground(new Color(255, 255, 255));
    add(lNombre);

    tNombre = new JTextField();
    tNombre.setBounds(25,213,150,25);
    tNombre.setBackground(new java.awt.Color(224, 224, 224));
    tNombre.setFont(new java.awt.Font("Cantarell", 1, 14));
    tNombre.setForeground(new java.awt.Color(255, 0, 0));
    add(tNombre);

    lAPaterno = new JLabel("Apellido Paterno:");
    lAPaterno.setBounds(25,248,180,25);
    lAPaterno.setFont(new Font("Cantarell", 1, 12));
    lAPaterno.setForeground(new Color(255, 255, 255));
    add(lAPaterno);

    tAPaterno = new JTextField();
    tAPaterno.setBounds(25,273,150,25);
    tAPaterno.setBackground(new java.awt.Color(224, 224, 224));
    tAPaterno.setFont(new java.awt.Font("Cantarell", 1, 14));
    tAPaterno.setForeground(new java.awt.Color(255, 0, 0));
    add(tAPaterno);

    lAMaterno = new JLabel("Apellido Materno:");
    lAMaterno.setBounds(25,308,180,25);
    lAMaterno.setFont(new Font("Cantarell", 1, 12));
    lAMaterno.setForeground(new Color(255, 255, 255));
    add(lAMaterno);

    tAMaterno = new JTextField();
    tAMaterno.setBounds(25,334,150,25);
    tAMaterno.setBackground(new java.awt.Color(224, 224, 224));
    tAMaterno.setFont(new java.awt.Font("Cantarell", 1, 14));
    tAMaterno.setForeground(new java.awt.Color(255, 0, 0));
    add(tAMaterno);

    lDepartamento = new JLabel("Selecciona el Departamento:");
    lDepartamento.setBounds(220,188,180,25);
    lDepartamento.setFont(new Font("Cantarell", 1, 12));
    lDepartamento.setForeground(new Color(255, 255, 255));
    add(lDepartamento);

    cDepartamento = new JComboBox();
    cDepartamento.setBounds(220,213,220,25);
    cDepartamento.setBackground(new java.awt.Color(224, 224, 224));
    cDepartamento.setFont(new java.awt.Font("Cantarell", 1, 14));
    cDepartamento.setForeground(new java.awt.Color(255, 0, 0));
    add(cDepartamento);
    cDepartamento.addItem("");
    cDepartamento.addItem("Atencion al Cliente");
    cDepartamento.addItem("Departamento de Logistica");
    cDepartamento.addItem("Departamento de Gerencia");

    lAntiguedad = new JLabel("Selecciona la Antigüedad:");
    lAntiguedad.setBounds(220,248,180,25);
    lAntiguedad.setFont(new Font("Cantarell", 1, 12));
    lAntiguedad.setForeground(new Color(255, 255, 255));
    add(lAntiguedad);

    cAntiguedad = new JComboBox();
    cAntiguedad.setBounds(220,273,220,25);
    cAntiguedad.setBackground(new java.awt.Color(224, 224, 224));
    cAntiguedad.setFont(new java.awt.Font("Cantarell", 1, 14));
    cAntiguedad.setForeground(new java.awt.Color(255, 0, 0));
    add(cAntiguedad);
    cAntiguedad.addItem("");
    cAntiguedad.addItem("1 año de servicio");
    cAntiguedad.addItem("2 a 6 años de servicio");
    cAntiguedad.addItem("7 años o más de servicio");

    lResultado = new JLabel("Resultado del Calculo:");
    lResultado.setBounds(220,307,180,25);
    lResultado.setFont(new Font("Cantarell", 1, 12));
    lResultado.setForeground(new Color(255, 255, 255));
    add(lResultado);

    textArea = new JTextArea();
    textArea.setEditable(false);
    textArea.setBackground(new Color(224, 224, 224));
    textArea.setFont(new Font("Cantarell", 1, 11));
    textArea.setForeground(new Color(255, 0, 0));
    textArea.setText("\n   Aquí aparece el resultado del calculo de las vacaciones.");
    scroll = new JScrollPane(textArea);
    scroll.setBounds(220,333,385,90);
    add(scroll); 

    lFooter = new JLabel("©2017 The Coca-Cola Company | Todos los derechos reservados");
    lFooter.setBounds(135,445,500,30);
    lFooter.setFont(new java.awt.Font("Cantarell", 1, 12));
    lFooter.setForeground(new java.awt.Color(255, 255, 255));
    add(lFooter);
  }
  public void actionPerformed(ActionEvent e) {
    if(e.getSource() == calculo){
      String nombreTrabajador = tNombre.getText();
      String AP = tAPaterno.getText();
      String AM = tAMaterno.getText();
      String Depto = cDepartamento.getSelectedItem().toString();
      String Antiguedad = cAntiguedad.getSelectedItem().toString();

      if(nombreTrabajador.equals("") || AP.equals("") || AM.equals("") || Depto.equals("") || Antiguedad.equals("")){
        JOptionPane.showMessageDialog(null,"Debes de llenar todos los campos.");
      }
      else {
        if(Depto.equals("Atencion al Cliente")){
          if(Antiguedad.equals("1 año de servicio")){
            textArea.setText("\n   El trabajador " + nombreTrabajador + " " + AP + " " + AM +
                         "\n   quien labora en " + Depto + " con " + Antiguedad + 
                         "\n   recibe 6 días de vecaciones.");
          }
          if(Antiguedad.equals("2 a 6 años de servicio")){
            textArea.setText("\n   El trabajador " + nombreTrabajador + " " + AP + " " + AM +
                         "\n   quien labora en " + Depto + " con " + Antiguedad + 
                         "\n   recibe 14 días de vecaciones.");
          }
          if(Antiguedad.equals("7 años o más de servicio")){
            textArea.setText("\n   El trabajador " + nombreTrabajador + " " + AP + " " + AM +
                         "\n   quien labora en " + Depto + " con " + Antiguedad + 
                         "\n   recibe 20 días de vecaciones.");
          }
        }
        if(Depto.equals("Departamento de Logistica")){
          if(Antiguedad.equals("1 año de servicio")){
            textArea.setText("\n   El trabajador " + nombreTrabajador + " " + AP + " " + AM +
                         "\n   quien labora en " + Depto + " con " + Antiguedad + 
                         "\n   recibe 7 días de vecaciones.");
          }
          if(Antiguedad.equals("2 a 6 años de servicio")){
            textArea.setText("\n   El trabajador " + nombreTrabajador + " " + AP + " " + AM +
                         "\n   quien labora en " + Depto + " con " + Antiguedad + 
                         "\n   recibe 15 días de vecaciones.");
          }
          if(Antiguedad.equals("7 años o más de servicio")){
            textArea.setText("\n   El trabajador " + nombreTrabajador + " " + AP + " " + AM +
                         "\n   quien labora en " + Depto + " con " + Antiguedad + 
                         "\n   recibe 22 días de vecaciones.");
          }
        }
        if(Depto.equals("Departamento de Gerencia")){
          if(Antiguedad.equals("1 año de servicio")){
            textArea.setText("\n   El trabajador " + nombreTrabajador + " " + AP + " " + AM +
                         "\n   quien labora en " + Depto + " con " + Antiguedad + 
                         "\n   recibe 10 días de vecaciones.");
          }
          if(Antiguedad.equals("2 a 6 años de servicio")){
            textArea.setText("\n   El trabajador " + nombreTrabajador + " " + AP + " " + AM +
                         "\n   quien labora en " + Depto + " con " + Antiguedad + 
                         "\n   recibe 20 días de vecaciones.");
          }
          if(Antiguedad.equals("7 años o más de servicio")){
            textArea.setText("\n   El trabajador " + nombreTrabajador + " " + AP + " " + AM +
                         "\n   quien labora en " + Depto + " con " + Antiguedad + 
                         "\n   recibe 30 días de vecaciones.");
          }
        }
      }
    }
    if(e.getSource() == rojo){
      getContentPane().setBackground(new Color(255,0,0));
    }
    if(e.getSource() == negro){
      getContentPane().setBackground(new Color(0,0,0));
    }
    if(e.getSource() == morado){
      getContentPane().setBackground(new Color(51,0,51));
    }
    if(e.getSource() == nuevo){
      tNombre.setText("");
      tAPaterno.setText("");
      tAMaterno.setText("");
      cDepartamento.setSelectedIndex(0);
      cAntiguedad.setSelectedIndex(0);
      textArea.setText("\n Aqui aparece el resultado del calculo de las vacaciones.");
    }
    if(e.getSource() == salir){
      Bienvenida ventanaBienvenida = new Bienvenida();
      ventanaBienvenida.setBounds(0,0,350,450);
      ventanaBienvenida.setVisible(true);
      ventanaBienvenida.setResizable(false);
      ventanaBienvenida.setLocationRelativeTo(null);
      this.setVisible(false);
    }
    if(e.getSource() == elCreador){
      JOptionPane.showMessageDialog(null, "Desarrolado por la Geekipedia de Ernesto\n" + "Creado por MrlnTorres13.");
    }
  }
  public static void main(String args[]) {
    Principal ventanaPrincipal = new Principal();
    ventanaPrincipal.setBounds(0,0,640,535);
    ventanaPrincipal.setVisible(true);
    ventanaPrincipal.setResizable(false);
    ventanaPrincipal.setLocationRelativeTo(null);
    }
}

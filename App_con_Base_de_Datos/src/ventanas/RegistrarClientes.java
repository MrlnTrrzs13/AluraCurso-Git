/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventanas;
import java.sql.*;
import clases.Conexion;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
/**
 *
 * @author mrln
 */
public class RegistrarClientes extends javax.swing.JFrame {

    String user;
    
    /**
     * Creates new form RegistrarClientes
     */
    public RegistrarClientes() {
        initComponents();
        user = Login.user;
        
        setTitle("Registrar nuevo Cliente - Sesión de " + user);
        setSize(530,350);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        
        ImageIcon wallpaper = new ImageIcon("src/images/wallpaperPrincipal.jpg");
        Icon icon = new ImageIcon(wallpaper.getImage().getScaledInstance(label_wallpaper.getWidth(),
                label_wallpaper.getHeight(), Image.SCALE_DEFAULT));
        label_wallpaper.setIcon(icon);
        this.repaint();
        
        
    }
    
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("images/icon.png"));
        return retValue;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label_titleCustomerRecord = new javax.swing.JLabel();
        label_name = new javax.swing.JLabel();
        txt_name = new javax.swing.JTextField();
        label_email = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        label_phone = new javax.swing.JLabel();
        txt_phone = new javax.swing.JTextField();
        label_addres = new javax.swing.JLabel();
        txt_addres = new javax.swing.JTextField();
        label_register = new javax.swing.JLabel();
        btn_add = new javax.swing.JButton();
        label_footer = new javax.swing.JLabel();
        label_wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_titleCustomerRecord.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        label_titleCustomerRecord.setForeground(new java.awt.Color(255, 255, 255));
        label_titleCustomerRecord.setText("Registro de Clientes");
        getContentPane().add(label_titleCustomerRecord, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, -1, -1));

        label_name.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        label_name.setForeground(new java.awt.Color(255, 255, 255));
        label_name.setText("Nombre:");
        getContentPane().add(label_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        txt_name.setBackground(new java.awt.Color(153, 153, 255));
        txt_name.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        txt_name.setForeground(new java.awt.Color(255, 255, 255));
        txt_name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_name.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 210, -1));

        label_email.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        label_email.setForeground(new java.awt.Color(255, 255, 255));
        label_email.setText("email:");
        getContentPane().add(label_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        txt_email.setBackground(new java.awt.Color(153, 153, 255));
        txt_email.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        txt_email.setForeground(new java.awt.Color(255, 255, 255));
        txt_email.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_email.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 210, -1));

        label_phone.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        label_phone.setForeground(new java.awt.Color(255, 255, 255));
        label_phone.setText("Telefono:");
        getContentPane().add(label_phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        txt_phone.setBackground(new java.awt.Color(153, 153, 255));
        txt_phone.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        txt_phone.setForeground(new java.awt.Color(255, 255, 255));
        txt_phone.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_phone.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 210, -1));

        label_addres.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        label_addres.setForeground(new java.awt.Color(255, 255, 255));
        label_addres.setText("Direccion:");
        getContentPane().add(label_addres, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        txt_addres.setBackground(new java.awt.Color(153, 153, 255));
        txt_addres.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        txt_addres.setForeground(new java.awt.Color(255, 255, 255));
        txt_addres.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_addres.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_addres, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 210, -1));

        label_register.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        label_register.setForeground(new java.awt.Color(255, 255, 255));
        label_register.setText("Registrar Cliente:");
        getContentPane().add(label_register, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, -1, -1));

        btn_add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });
        getContentPane().add(btn_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 120, 100));

        label_footer.setText("Creado por MrlnTrrzs13");
        getContentPane().add(label_footer, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, -1, -1));
        getContentPane().add(label_wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        int validation = 0;
        String name, mail, phone, addres;

        name = txt_name.getText().trim();
        mail = txt_email.getText().trim();
        phone = txt_phone.getText().trim();
        addres = txt_addres.getText().trim();
        
        if (name.equals("")) {
            txt_name.setBackground(Color.red);
            validation++;
        }
        if (mail.equals("")) {
            txt_email.setBackground(Color.red);
            validation++;
        }
        if (phone.equals("")) {
            txt_phone.setBackground(Color.red);
            validation++;
        }
        if (addres.equals("")) {
            txt_addres.setBackground(Color.red);
            validation++;
        }
        
        if (validation == 0) {
            try {
            Connection cn = Conexion.conect();
            PreparedStatement pst = cn.prepareStatement(
                "insert into clientes values (?,?,?,?,?,?)");

            pst.setInt(1, 0);
            pst.setString(2, name);
            pst.setString(3, mail);
            pst.setString(4, phone);
            pst.setString(5, addres);
            pst.setString(6, user);

            pst.executeUpdate();
            cn.close();
            Clear();

            txt_name.setBackground(Color.GREEN);
            txt_email.setBackground(Color.GREEN);
            txt_phone.setBackground(Color.GREEN);
            txt_addres.setBackground(Color.GREEN);
            
            JOptionPane.showMessageDialog(null, "Registro exitoso.");
            this.dispose();
            
            } catch (SQLException e) {
                System.err.println("ERROR en Registrar cliente. " + e);
                JOptionPane.showMessageDialog(null, "¡¡ERROR al registrar cliente!!, contacte al administrador.");
            }
           
        } else {
            JOptionPane.showMessageDialog(null, "Debe de llenar todos los campos.");
        }
        
        
    }//GEN-LAST:event_btn_addActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegistrarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JLabel label_addres;
    private javax.swing.JLabel label_email;
    private javax.swing.JLabel label_footer;
    private javax.swing.JLabel label_name;
    private javax.swing.JLabel label_phone;
    private javax.swing.JLabel label_register;
    private javax.swing.JLabel label_titleCustomerRecord;
    private javax.swing.JLabel label_wallpaper;
    private javax.swing.JTextField txt_addres;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_phone;
    // End of variables declaration//GEN-END:variables

    public void Clear() {
        txt_name.setText("");
        txt_email.setText("");
        txt_addres.setText("");
    }
}

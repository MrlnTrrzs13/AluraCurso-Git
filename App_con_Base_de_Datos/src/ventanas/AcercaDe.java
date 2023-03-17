/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventanas;

import java.sql.*;
import clases.Conexion;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

/**
 *
 * @author ma
 */
public class AcercaDe extends javax.swing.JFrame {

    String user, name_user;
    int session_user;

    /**
     * Creates new form Capturista
     */
    public AcercaDe() {
        initComponents();
        user = Login.user;
        session_user = Administrador.session_user;

        setSize(400, 300);
        setResizable(false);
        setTitle("Acerca de - Sesión de " + user);
        setLocationRelativeTo(null);

        ImageIcon wallpaper = new ImageIcon("src/images/wallpaperPrincipal.jpg");
        Icon icon = new ImageIcon(wallpaper.getImage().getScaledInstance(label_wallpaper.getWidth(),
                label_wallpaper.getHeight(), Image.SCALE_DEFAULT));
        label_wallpaper.setIcon(icon);
        this.repaint();

        if (session_user == 1) {
            setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        } else {
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        }

        
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

        label_userName = new javax.swing.JLabel();
        label_userName1 = new javax.swing.JLabel();
        label_userName2 = new javax.swing.JLabel();
        label_userName3 = new javax.swing.JLabel();
        label_wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_userName.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        label_userName.setForeground(new java.awt.Color(255, 255, 255));
        label_userName.setText("Sistema creaado por el canal de youtube");
        getContentPane().add(label_userName, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, -1));

        label_userName1.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        label_userName1.setForeground(new java.awt.Color(255, 255, 255));
        label_userName1.setText("La Geekipedia de Ernesto");
        getContentPane().add(label_userName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, -1, -1));

        label_userName2.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        label_userName2.setForeground(new java.awt.Color(255, 255, 255));
        label_userName2.setText("YouTube: La Geekipedia de Ernesto");
        getContentPane().add(label_userName2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, -1, -1));

        label_userName3.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        label_userName3.setForeground(new java.awt.Color(255, 255, 255));
        label_userName3.setText("Desarrollado por MrlnTrrzs13");
        getContentPane().add(label_userName3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, -1, -1));
        getContentPane().add(label_wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(AcercaDe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AcercaDe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AcercaDe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AcercaDe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AcercaDe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel label_userName;
    private javax.swing.JLabel label_userName1;
    private javax.swing.JLabel label_userName2;
    private javax.swing.JLabel label_userName3;
    private javax.swing.JLabel label_wallpaper;
    // End of variables declaration//GEN-END:variables
}

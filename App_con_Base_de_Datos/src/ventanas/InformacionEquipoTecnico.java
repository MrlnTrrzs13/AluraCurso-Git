/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventanas;

import java.sql.*;
import clases.Conexion;
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
public class InformacionEquipoTecnico extends javax.swing.JFrame {

    int id_equipo = 0;
    String user = "";

    /**
     * Creates new form InformacionEquipo
     */
    public InformacionEquipoTecnico() {
        initComponents();
        user = Login.user;
        id_equipo = GestionarEquipos.id_teamUp;

        try {
            Connection cn = Conexion.conect();
            PreparedStatement pst = cn.prepareStatement(
                    "select * from equipos where id_equipo = '" + id_equipo + "'");
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                cmb_equipmentType.setSelectedItem(rs.getString("tipo_equipo"));
                cmb_make.setSelectedItem(rs.getString("marca"));
                cmb_status.setSelectedItem(rs.getString("status"));
                txt_model.setText(rs.getString("modelo"));
                txt_serialNumber.setText(rs.getString("num_serie"));
                txt_modifiedBy.setText(rs.getString("ultima_modificacion"));

                String day = "", mounth = "", year = "";
                day = rs.getString("dia_ingreso");
                mounth = rs.getString("mes_ingreso");
                year = rs.getString("anio_ingreso");

                txt_date.setText(day + " del " + mounth + " del " + year);

                pane_observations.setText(rs.getString("observaciones"));
                pane_comments.setText(rs.getString("comentarios_tecnicos"));
                label_Comments.setText("Comentarios y actualizacion del tecnico: " + rs.getString("revision_tecnica_de"));
            }

        } catch (SQLException e) {
            System.err.println("ERROR al consultar la informacion del equipo.");
        }

        setTitle("Equipo registrado con el Id " + id_equipo + " - Sesión de " + user);
        setSize(670, 530);
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

        label_title = new javax.swing.JLabel();
        label_name = new javax.swing.JLabel();
        txt_name = new javax.swing.JTextField();
        label_equipmentType = new javax.swing.JLabel();
        cmb_equipmentType = new javax.swing.JComboBox<>();
        label_make = new javax.swing.JLabel();
        cmb_make = new javax.swing.JComboBox<>();
        label_model = new javax.swing.JLabel();
        txt_model = new javax.swing.JTextField();
        label_serialNumber = new javax.swing.JLabel();
        txt_serialNumber = new javax.swing.JTextField();
        label_modifiedBy = new javax.swing.JLabel();
        txt_modifiedBy = new javax.swing.JTextField();
        label_date = new javax.swing.JLabel();
        txt_date = new javax.swing.JTextField();
        label_status = new javax.swing.JLabel();
        cmb_status = new javax.swing.JComboBox<>();
        label_Observations = new javax.swing.JLabel();
        scroll_Observations = new javax.swing.JScrollPane();
        pane_observations = new javax.swing.JTextPane();
        label_Comments = new javax.swing.JLabel();
        scroll_comments = new javax.swing.JScrollPane();
        pane_comments = new javax.swing.JTextPane();
        btn_update = new javax.swing.JButton();
        label_footer = new javax.swing.JLabel();
        label_wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_title.setFont(new java.awt.Font("DejaVuSansMono Nerd Font", 1, 24)); // NOI18N
        label_title.setForeground(new java.awt.Color(255, 255, 255));
        label_title.setText("Información de equipo");
        getContentPane().add(label_title, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, -1, -1));

        label_name.setFont(new java.awt.Font("DejaVuSansMono Nerd Font", 0, 12)); // NOI18N
        label_name.setForeground(new java.awt.Color(255, 255, 255));
        label_name.setText("Nombre del Cliente:");
        getContentPane().add(label_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        txt_name.setBackground(new java.awt.Color(153, 153, 255));
        txt_name.setFont(new java.awt.Font("DejaVuSansMono Nerd Font", 1, 16)); // NOI18N
        txt_name.setForeground(new java.awt.Color(255, 255, 255));
        txt_name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_name.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_name.setEnabled(false);
        getContentPane().add(txt_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 210, -1));

        label_equipmentType.setFont(new java.awt.Font("DejaVuSansMono Nerd Font", 0, 12)); // NOI18N
        label_equipmentType.setForeground(new java.awt.Color(255, 255, 255));
        label_equipmentType.setText("Tipo de equipo:");
        getContentPane().add(label_equipmentType, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        cmb_equipmentType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laptop", "Desktop", "Impresora", "Multifuncional" }));
        getContentPane().add(cmb_equipmentType, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        label_make.setFont(new java.awt.Font("DejaVuSansMono Nerd Font", 0, 12)); // NOI18N
        label_make.setForeground(new java.awt.Color(255, 255, 255));
        label_make.setText("Marca:");
        getContentPane().add(label_make, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        cmb_make.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Acer", "Alienware", "Apple", "Asus", "Brother", "Dell", "Hp", "Lenovo", "Samsung", "Toshiba", "Xerox" }));
        getContentPane().add(cmb_make, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        label_model.setFont(new java.awt.Font("DejaVuSansMono Nerd Font", 0, 12)); // NOI18N
        label_model.setForeground(new java.awt.Color(255, 255, 255));
        label_model.setText("Modelo:");
        getContentPane().add(label_model, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        txt_model.setBackground(new java.awt.Color(153, 153, 255));
        txt_model.setFont(new java.awt.Font("DejaVuSansMono Nerd Font", 1, 16)); // NOI18N
        txt_model.setForeground(new java.awt.Color(255, 255, 255));
        txt_model.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_model.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_model, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 210, -1));

        label_serialNumber.setFont(new java.awt.Font("DejaVuSansMono Nerd Font", 0, 12)); // NOI18N
        label_serialNumber.setForeground(new java.awt.Color(255, 255, 255));
        label_serialNumber.setText("Numero de serie:");
        getContentPane().add(label_serialNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, -1));

        txt_serialNumber.setBackground(new java.awt.Color(153, 153, 255));
        txt_serialNumber.setFont(new java.awt.Font("DejaVuSansMono Nerd Font", 1, 16)); // NOI18N
        txt_serialNumber.setForeground(new java.awt.Color(255, 255, 255));
        txt_serialNumber.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_serialNumber.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_serialNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 210, -1));

        label_modifiedBy.setFont(new java.awt.Font("DejaVuSansMono Nerd Font", 0, 12)); // NOI18N
        label_modifiedBy.setForeground(new java.awt.Color(255, 255, 255));
        label_modifiedBy.setText("Ultima Modificacion:");
        getContentPane().add(label_modifiedBy, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, -1));

        txt_modifiedBy.setBackground(new java.awt.Color(153, 153, 255));
        txt_modifiedBy.setFont(new java.awt.Font("DejaVuSansMono Nerd Font", 1, 16)); // NOI18N
        txt_modifiedBy.setForeground(new java.awt.Color(255, 255, 255));
        txt_modifiedBy.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_modifiedBy.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_modifiedBy.setEnabled(false);
        getContentPane().add(txt_modifiedBy, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 210, -1));

        label_date.setFont(new java.awt.Font("DejaVuSansMono Nerd Font", 0, 12)); // NOI18N
        label_date.setForeground(new java.awt.Color(255, 255, 255));
        label_date.setText("Fecha de Ingreso:");
        getContentPane().add(label_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, -1, -1));

        txt_date.setBackground(new java.awt.Color(153, 153, 255));
        txt_date.setFont(new java.awt.Font("DejaVuSansMono Nerd Font", 1, 16)); // NOI18N
        txt_date.setForeground(new java.awt.Color(255, 255, 255));
        txt_date.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_date.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_date.setEnabled(false);
        getContentPane().add(txt_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, 180, -1));

        label_status.setFont(new java.awt.Font("DejaVuSansMono Nerd Font", 0, 12)); // NOI18N
        label_status.setForeground(new java.awt.Color(255, 255, 255));
        label_status.setText("Fecha de Ingreso:");
        getContentPane().add(label_status, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 60, -1, -1));

        cmb_status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nuevo ingreso", "No reparado", "En revision", "Reparado", "Entregado" }));
        getContentPane().add(cmb_status, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 80, -1, -1));

        label_Observations.setFont(new java.awt.Font("DejaVuSansMono Nerd Font", 0, 12)); // NOI18N
        label_Observations.setForeground(new java.awt.Color(255, 255, 255));
        label_Observations.setText("Daño reportado y observaciones:");
        getContentPane().add(label_Observations, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, -1, -1));

        pane_observations.setEditable(false);
        scroll_Observations.setViewportView(pane_observations);

        getContentPane().add(scroll_Observations, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 330, 120));

        label_Comments.setFont(new java.awt.Font("DejaVuSansMono Nerd Font", 0, 12)); // NOI18N
        label_Comments.setForeground(new java.awt.Color(255, 255, 255));
        label_Comments.setText("Comentarios y Actualización del Tecnico:");
        getContentPane().add(label_Comments, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, -1, -1));

        scroll_comments.setViewportView(pane_comments);

        getContentPane().add(scroll_comments, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 280, 330, 120));

        btn_update.setBackground(new java.awt.Color(153, 153, 255));
        btn_update.setFont(new java.awt.Font("Montserrat", 1, 16)); // NOI18N
        btn_update.setForeground(new java.awt.Color(255, 255, 255));
        btn_update.setText("Comentar y Actualizar");
        btn_update.setBorder(null);
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });
        getContentPane().add(btn_update, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 400, 210, 35));

        label_footer.setText("Creado por MrlnTrrzs13");
        getContentPane().add(label_footer, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 460, -1, -1));
        getContentPane().add(label_wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        String status, comments, technical;

        status = cmb_status.getSelectedItem().toString();
        comments = pane_comments.getText();
        technical = user;

        try {
            Connection cn = Conexion.conect();
            PreparedStatement pst = cn.prepareStatement(
                    "update equipos set status=?, comentarios_tecnicos=?, revision_tecnica_de=? where id_equipo = '" + id_equipo + "'");

            pst.setString(1, status);
            pst.setString(2, comments);
            pst.setString(3, technical);
            pst.executeUpdate();
            cn.close();

            JOptionPane.showMessageDialog(null, "Actualización exitosa");
            this.dispose();

        } catch (SQLException e) {
            System.err.println("ERROR en actualizar equipo.");
            JOptionPane.showMessageDialog(null, "¡¡ERROR al actualizar equipo!!, contacte al Administrador.");
        }
    }//GEN-LAST:event_btn_updateActionPerformed

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
            java.util.logging.Logger.getLogger(InformacionEquipoTecnico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InformacionEquipoTecnico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InformacionEquipoTecnico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InformacionEquipoTecnico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InformacionEquipoTecnico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_update;
    private javax.swing.JComboBox<String> cmb_equipmentType;
    private javax.swing.JComboBox<String> cmb_make;
    private javax.swing.JComboBox<String> cmb_status;
    private javax.swing.JLabel label_Comments;
    private javax.swing.JLabel label_Observations;
    private javax.swing.JLabel label_date;
    private javax.swing.JLabel label_equipmentType;
    private javax.swing.JLabel label_footer;
    private javax.swing.JLabel label_make;
    private javax.swing.JLabel label_model;
    private javax.swing.JLabel label_modifiedBy;
    private javax.swing.JLabel label_name;
    private javax.swing.JLabel label_serialNumber;
    private javax.swing.JLabel label_status;
    private javax.swing.JLabel label_title;
    private javax.swing.JLabel label_wallpaper;
    private javax.swing.JTextPane pane_comments;
    private javax.swing.JTextPane pane_observations;
    private javax.swing.JScrollPane scroll_Observations;
    private javax.swing.JScrollPane scroll_comments;
    private javax.swing.JTextField txt_date;
    private javax.swing.JTextField txt_model;
    private javax.swing.JTextField txt_modifiedBy;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_serialNumber;
    // End of variables declaration//GEN-END:variables

    public void Clear() {
        txt_name.setText("");
        txt_date.setText("");
        txt_model.setText("");
        txt_serialNumber.setText("");
        pane_observations.setText("");
    }
}

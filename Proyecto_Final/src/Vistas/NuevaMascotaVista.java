package Vistas;

import Entidades.*;
import conexion.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.time.*;
import java.util.*;
import javax.swing.ComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class NuevaMascotaVista extends javax.swing.JInternalFrame {
    Color azul = new Color(0, 107, 247);
    Color azulClaro = new Color(0, 173, 255);
    ClienteData cd = new ClienteData();
    MascotaData md = new MascotaData();
    
    public NuevaMascotaVista() {
        initComponents();
        cargarCombo();
        trans();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        ImageIcon imagen =new ImageIcon(getClass().getResource("/fondos/mascota.jpg"));
        Image icono= imagen.getImage();
        jDesktopPane1 = new javax.swing.JDesktopPane(){
            public void paintComponent (Graphics g){
                g.drawImage(icono, 0, 0, getWidth() ,getHeight(), this);
            }
        };
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jbRegMascota = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTpeso = new javax.swing.JTextField();
        jTalias = new javax.swing.JTextField();
        jTsexo = new javax.swing.JTextField();
        jTespecie = new javax.swing.JTextField();
        jTraza = new javax.swing.JTextField();
        jTcolor = new javax.swing.JTextField();
        jDnac = new com.toedter.calendar.JDateChooser();
        jCBduenio = new javax.swing.JComboBox<>();

        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/icons8-mascota-64.png"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(0, 0, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/icons8-perro-64.png"))); // NOI18N
        jLabel1.setText("REGISTRO DE MASCOTAS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 390, 70));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 237, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 340, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(0, 0, 204));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(0, 0, 204));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 191, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );

        jPanel6.setBackground(new java.awt.Color(0, 0, 204));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );

        jPanel7.setBackground(new java.awt.Color(0, 0, 204));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 191, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 270, 580));

        jbRegMascota.setBackground(new java.awt.Color(51, 51, 255));
        jbRegMascota.setFont(new java.awt.Font("Roboto", 1, 30)); // NOI18N
        jbRegMascota.setForeground(new java.awt.Color(255, 255, 255));
        jbRegMascota.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/espacio-para-gatos.png"))); // NOI18N
        jbRegMascota.setText("   Registrar Mascota");
        jbRegMascota.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        jbRegMascota.setBorderPainted(false);
        jbRegMascota.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbRegMascota.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jbRegMascota.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbRegMascotaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbRegMascotaMouseExited(evt);
            }
        });
        jbRegMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRegMascotaActionPerformed(evt);
            }
        });
        jPanel1.add(jbRegMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 510, 360, -1));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("DUEÑO:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 410, 110, 30));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ALIAS:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, 110, 30));

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("SEXO:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, 110, 30));

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("ESPECIE:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, 140, 30));

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("RAZA:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 240, 110, 30));

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("COLOR:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, 110, 30));

        jLabel8.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Fecha de Nacimiento:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 320, 250, 30));

        jLabel9.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("PESO:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 370, 110, 30));
        jPanel1.add(jTpeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 370, 260, -1));
        jPanel1.add(jTalias, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 120, 260, -1));
        jPanel1.add(jTsexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 160, 260, -1));
        jPanel1.add(jTespecie, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 200, 260, -1));
        jPanel1.add(jTraza, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 240, 260, -1));
        jPanel1.add(jTcolor, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 280, 260, -1));
        jPanel1.add(jDnac, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 320, 140, -1));

        jCBduenio.setModel(new javax.swing.DefaultComboBoxModel<>(new Cliente[] {}));
        jPanel1.add(jCBduenio, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 410, 260, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbRegMascotaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbRegMascotaMouseEntered
        jbRegMascota.setOpaque(true);
        jbRegMascota.setBackground(azulClaro);
    }//GEN-LAST:event_jbRegMascotaMouseEntered

    private void jbRegMascotaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbRegMascotaMouseExited
        jbRegMascota.setOpaque(false);
    }//GEN-LAST:event_jbRegMascotaMouseExited

    private void jbRegMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRegMascotaActionPerformed
        // TODO add your handling code here:
        try {
            String nom = jTalias.getText();
            String sex/*epa*/ = jTsexo.getText();
            String especie = jTespecie.getText();
            String raza = jTraza.getText();
            String colo = jTcolor.getText();
            LocalDate nac = jDnac.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            double peso = Double.parseDouble(jTpeso.getText());
            Cliente id = (Cliente) jCBduenio.getSelectedItem();
            Mascota masc = new Mascota(nom, sex, especie, raza, colo, nac, peso, peso, id);
            md.registrarMascota(masc, id);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Campos vacios o incorrectos");
            jTalias.requestFocus();
        }
        
    }//GEN-LAST:event_jbRegMascotaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Cliente> jCBduenio;
    private javax.swing.JDesktopPane jDesktopPane1;
    private com.toedter.calendar.JDateChooser jDnac;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTextField jTalias;
    private javax.swing.JTextField jTcolor;
    private javax.swing.JTextField jTespecie;
    private javax.swing.JTextField jTpeso;
    private javax.swing.JTextField jTraza;
    private javax.swing.JTextField jTsexo;
    private javax.swing.JButton jbRegMascota;
    // End of variables declaration//GEN-END:variables

    private void cargarCombo() {
        jCBduenio.removeAllItems();
        Cliente ct = new Cliente();
        jCBduenio.addItem(ct);
        for (Cliente clie : cd.listarClientes()) {
            jCBduenio.addItem(clie);
        }
    }

    public void trans() {
        jbRegMascota.setContentAreaFilled(false);
        jbRegMascota.setBorderPainted(false);
        jbRegMascota.setOpaque(false);
    }
}

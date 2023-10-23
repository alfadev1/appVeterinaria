package vistas;

import Entidades.*;
import conexion.*;
import java.awt.Graphics;
import java.awt.Image;
import java.time.*;
import java.util.*;
import javax.swing.ComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;




public class Visita extends javax.swing.JInternalFrame {

    MascotaData md = new MascotaData();
    TratamientoData td = new TratamientoData();
    VisitaData vd = new VisitaData();

    public Visita() {
        //transparenciaButton();
        initComponents();
        cargarMascota();
        cargarTratamiento();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        botonGuardar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        calendario = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cboxMascota = new javax.swing.JComboBox<>()
        ;
        jLabel6 = new javax.swing.JLabel();
        cboxTratamiento = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tfDetalle = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTpeso = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        ImageIcon imagen =new ImageIcon(getClass().getResource("/fondos/foto2.jpg"));
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

        setBackground(new java.awt.Color(0, 0, 204));
        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setPreferredSize(new java.awt.Dimension(900, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(901, 214, -1, -1));

        jPanel1.setBackground(new java.awt.Color(0, 0, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonGuardar.setBackground(new java.awt.Color(0, 0, 255));
        botonGuardar.setForeground(new java.awt.Color(255, 255, 255));
        botonGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/boton1.png"))); // NOI18N
        botonGuardar.setText("Guardar");
        botonGuardar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(botonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 510, 210, 50));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/icons8-perro-64.png"))); // NOI18N
        jLabel1.setText("VETERINARIA ABMS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, 360, 70));
        jPanel1.add(calendario, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 120, 280, -1));

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("FECHA DE VISITA:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 127, 120, 10));

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("MASCOTA:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, 100, -1));

        cboxMascota.setModel(new javax.swing.DefaultComboBoxModel<>(new Mascota[] {  }));
        cboxMascota.setBorder(null);
        jPanel1.add(cboxMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 180, 350, -1));

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("TRATAMIENTO:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, -1, -1));

        cboxTratamiento.setModel(new javax.swing.DefaultComboBoxModel<>(new Tratamiento[] {}));
        jPanel1.add(cboxTratamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 230, 350, -1));

        tfDetalle.setColumns(20);
        tfDetalle.setRows(5);
        tfDetalle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfDetalleMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tfDetalle);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 293, 360, 120));

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("DETALLE:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, -1, -1));

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("PESO:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 460, 56, 22));

        jTpeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTpesoActionPerformed(evt);
            }
        });
        jPanel1.add(jTpeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 460, 110, -1));

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

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 900, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
        // TODO add your handling code here:
        try {
            Mascota idM = (Mascota) cboxMascota.getSelectedItem();
            int id = idM.getIdMascota();
            System.out.println(id + "ola");

            Tratamiento idT = (Tratamiento) cboxTratamiento.getSelectedItem();
            idT.getIdTratamiento();

            LocalDate fechaVisita = calendario.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            String detalle = tfDetalle.getText();
            double peso = Double.parseDouble(jTpeso.getText());

            Visitas visita = new Visitas();

            visita.setFechaVisita(fechaVisita);
            visita.setDetalle(detalle);
            visita.setPesoActual(peso);
            vd.registrarVisita(idM, idT, visita);
            limpiar();

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "CAMPOS INCORRECTOS : " + e.getMessage());

        } catch (NullPointerException e) {

            JOptionPane.showMessageDialog(null, "CAMPOS VACIOS : " + e.getMessage());
        }

    }//GEN-LAST:event_botonGuardarActionPerformed

    private void jTpesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTpesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTpesoActionPerformed

    private void tfDetalleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfDetalleMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_tfDetalleMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonGuardar;
    private com.toedter.calendar.JDateChooser calendario;
    private javax.swing.JComboBox<Mascota> cboxMascota;
    private javax.swing.JComboBox<Tratamiento> cboxTratamiento;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTpeso;
    private javax.swing.JTextArea tfDetalle;
    // End of variables declaration//GEN-END:variables

//    private void cargarMascota() {
//        for (Mascota item : md.listarMascotas()) {
//            cboxMascota.addItem(item);
//        }
//    }
  
    private void cargarMascota() {
        cboxMascota.removeAllItems();
        Mascota elementoI = new Mascota();
        cboxMascota.addItem(elementoI);
        for (Mascota item : md.listarMascotas()) {
            cboxMascota.addItem(item);
        }
    }
 

    private void cargarTratamiento() {
        Tratamiento elementoI = new Tratamiento();
        cboxTratamiento.addItem(elementoI);
        for (Tratamiento item : td.listarTratamiento()) {
            cboxTratamiento.addItem(item);
        }
    }

    private void limpiar() {
        calendario.setDate(null);
        tfDetalle.setText("");
        jTpeso.setText("");
    }
// private void transparenciaButton()
// {
//     botonGuardar.setOpaque(false);
//     botonGuardar.setContentAreaFilled(false);
//     botonGuardar.setBorderPainted(false);
// }
}



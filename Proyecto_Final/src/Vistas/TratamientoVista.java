
package Vistas;

import Entidades.*;
import conexion.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author cyka
 */
public class TratamientoVista extends javax.swing.JInternalFrame {
    Color azulClaro = new Color(0, 173, 255);    
    MascotaData md = new MascotaData();
    TratamientoData td = new TratamientoData();
    VisitaData vd = new VisitaData();

    /**
     * Creates new form TratamientoVista
     */
    public TratamientoVista() {
        initComponents();
        transparencias();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        ImageIcon fondo =new ImageIcon(getClass().getResource("/fondos/fondo3.jpg"));
        Image bg= fondo.getImage();
        jDesktopPane3 = new javax.swing.JDesktopPane(){
            public void paintComponent (Graphics g){
                g.drawImage(bg, 0, 0, getWidth() ,getHeight(), this);
            }
        };
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jCBEstado = new javax.swing.JCheckBox();
        jTFImporte = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTDescripcion = new javax.swing.JTextArea();
        jTTipo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jBActualizar = new javax.swing.JButton();
        jBGuardar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/clinica.png"))); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 0, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jDesktopPane3Layout = new javax.swing.GroupLayout(jDesktopPane3);
        jDesktopPane3.setLayout(jDesktopPane3Layout);
        jDesktopPane3Layout.setHorizontalGroup(
            jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 237, Short.MAX_VALUE)
        );
        jDesktopPane3Layout.setVerticalGroup(
            jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 340, Short.MAX_VALUE)
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

        jPanel8.setBackground(new java.awt.Color(0, 0, 204));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );

        jPanel9.setBackground(new java.awt.Color(0, 0, 204));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 191, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jDesktopPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jDesktopPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, -1, -1));

        jCBEstado.setBackground(new java.awt.Color(0, 0, 204));
        jCBEstado.setForeground(new java.awt.Color(255, 255, 255));
        jCBEstado.setText("Activado/Desactivado");
        jPanel3.add(jCBEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 400, 344, -1));
        jPanel3.add(jTFImporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 350, 344, -1));

        jTDescripcion.setColumns(20);
        jTDescripcion.setRows(5);
        jScrollPane1.setViewportView(jTDescripcion);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 170, 346, 156));
        jPanel3.add(jTTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 130, 344, -1));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/clinica.png"))); // NOI18N
        jLabel1.setText("    TRATAMIENTOS");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 30, 390, 70));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("TIPO: ");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, 140, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("DETALLE:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, 130, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("IMPORTE:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 360, 130, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("ESTADO:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 410, 100, -1));

        jBActualizar.setBackground(new java.awt.Color(51, 51, 255));
        jBActualizar.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jBActualizar.setForeground(new java.awt.Color(255, 255, 255));
        jBActualizar.setText("   ACTUALIZAR");
        jBActualizar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        jBActualizar.setBorderPainted(false);
        jBActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBActualizar.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jBActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBActualizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBActualizarMouseExited(evt);
            }
        });
        jBActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBActualizarActionPerformed(evt);
            }
        });
        jPanel3.add(jBActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 460, 150, 50));

        jBGuardar.setBackground(new java.awt.Color(51, 51, 255));
        jBGuardar.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jBGuardar.setForeground(new java.awt.Color(255, 255, 255));
        jBGuardar.setText("   REGISTRAR");
        jBGuardar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        jBGuardar.setBorderPainted(false);
        jBGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBGuardar.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jBGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBGuardarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBGuardarMouseExited(evt);
            }
        });
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });
        jPanel3.add(jBGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 530, 150, 50));

        jButton2.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("VER TRATAMIENTOS");
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setOpaque(false);
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton2MouseExited(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 470, 190, 50));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 900, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBActualizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBActualizarMouseEntered
        // TODO add your handling code here:
        jBActualizar.setOpaque(true);
        jBActualizar.setBackground(azulClaro);
    }//GEN-LAST:event_jBActualizarMouseEntered

    private void jBActualizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBActualizarMouseExited
        // TODO add your handling code here:
        jBActualizar.setOpaque(false);
    }//GEN-LAST:event_jBActualizarMouseExited

    private void jBActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBActualizarActionPerformed
        // TODO add your handling code here:
        
        try {
            String tipo = jTTipo.getText();
            int importe = Integer.parseInt(jTFImporte.getText());
            String descripcion = jTDescripcion.getText();
            boolean estado = jCBEstado.isSelected();

            Tratamiento t = new Tratamiento(tipo, descripcion, importe, estado);

            td.modificarTratamiento(t);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Campos vacios o incorrectos");
            jTTipo.requestFocus();
        }
    }//GEN-LAST:event_jBActualizarActionPerformed

    private void jBGuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBGuardarMouseEntered
        // TODO add your handling code here:
        jBGuardar.setOpaque(true);
        jBGuardar.setBackground(azulClaro);
    }//GEN-LAST:event_jBGuardarMouseEntered

    private void jBGuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBGuardarMouseExited
        // TODO add your handling code here:
        jBGuardar.setOpaque(false);
    }//GEN-LAST:event_jBGuardarMouseExited

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
        // TODO add your handling code here:
        try {
            String tipo = jTTipo.getText();
            int importe = Integer.parseInt(jTFImporte.getText());
            String descripcion = jTDescripcion.getText();
            boolean estado = jCBEstado.isSelected();

            Tratamiento t = new Tratamiento(tipo, descripcion, importe, estado);
            
            if (tipo.equals("") || descripcion.equals("")) {
                JOptionPane.showMessageDialog(null, "Campos vacios o incorrectos");
            } else {
                td.guardarTratamiento(t);
            }
            

            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Campos vacios o incorrectos");
            jTTipo.requestFocus();
        }
    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
//        tratamienTodosVista ttv = new tratamienTodosVista();
//        
//        TratamientoVista tv = new TratamientoVista();
//        tv.toBack();
//        ttv.toFront();
//        ttv.setVisible(true);
     // Crear una instancia de tratamienTodosVista
    tratamienTodosVista ttv = new tratamienTodosVista();
    
    // Obtener el JDesktopPane del InternalFrame actual (this.getParent())
    JDesktopPane desktopPane = (JDesktopPane) this.getParent();
    
    // Obtener una referencia al TratamientoVista InternalFrame
    TratamientoVista tv = obtenerTratamientoVistaInternalFrame(desktopPane);
    
    // Configurar la posición del tratamienTodosVista InternalFrame
    ttv.setLocation(tv.getX() + 50, tv.getY() + 50); // Ajusta la posición como desees
    
    // Añadir tratamienTodosVista al JDesktopPane y hacerlo visible
    desktopPane.add(ttv);
    ttv.setVisible(true);
    
    // Hacer que tratamienTodosVista esté en frente del TratamientoVista
    

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        // TODO add your handling code here:
        jButton2.setOpaque(true);
        jButton2.setBackground(azulClaro);
        
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
        // TODO add your handling code here:
        jButton2.setOpaque(false);
    }//GEN-LAST:event_jButton2MouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBActualizar;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCBEstado;
    private javax.swing.JDesktopPane jDesktopPane3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTDescripcion;
    private javax.swing.JTextField jTFImporte;
    private javax.swing.JTextField jTTipo;
    // End of variables declaration//GEN-END:variables
    public void transparencias() {
    
        jBGuardar.setContentAreaFilled(false);
        jBGuardar.setBorderPainted(false);
        jBGuardar.setOpaque(false);
        jBActualizar.setContentAreaFilled(false);
        jBActualizar.setBorderPainted(false);
        jBActualizar.setOpaque(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setBorderPainted(false);
        jButton2.setOpaque(false);
    }
    private TratamientoVista obtenerTratamientoVistaInternalFrame(JDesktopPane desktopPane) {
    JInternalFrame[] frames = desktopPane.getAllFrames();
    for (JInternalFrame frame : frames) {
        if (frame instanceof TratamientoVista) {
            return (TratamientoVista) frame;
        }
    }
    return null; // Devuelve null si no se encuentra TratamientoVista
}

}

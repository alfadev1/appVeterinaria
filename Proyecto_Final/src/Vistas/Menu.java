package Vistas;

import vistas.Visita;
import java.awt.Color;

public class Menu extends javax.swing.JFrame {

    Color azul = new Color(0, 107, 247);
    Color azulClaro = new Color(0, 173, 255);

    public Menu() {
        initComponents();
        transparenciaButton();
        this.setSize(1250, 850);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpFondo = new javax.swing.JPanel();
        menuLateral = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jbClientes = new javax.swing.JButton();
        jbVisita = new javax.swing.JButton();
        jbTratamiento = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        escritorio = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpFondo.setBackground(new java.awt.Color(255, 255, 255));

        menuLateral.setBackground(new java.awt.Color(0, 107, 247));
        menuLateral.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 32)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/icons8-perro-64.png"))); // NOI18N
        jLabel2.setText("iVet");

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator1.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        jSeparator1.setPreferredSize(new java.awt.Dimension(50, 15));
        jSeparator1.setRequestFocusEnabled(false);

        jbClientes.setBackground(new java.awt.Color(51, 51, 255));
        jbClientes.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jbClientes.setForeground(new java.awt.Color(255, 255, 255));
        jbClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/icons8-cabaña-64.png"))); // NOI18N
        jbClientes.setText("Clientes");
        jbClientes.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        jbClientes.setBorderPainted(false);
        jbClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbClientes.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jbClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbClientesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbClientesMouseExited(evt);
            }
        });
        jbClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbClientesActionPerformed(evt);
            }
        });

        jbVisita.setBackground(new java.awt.Color(51, 51, 255));
        jbVisita.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jbVisita.setForeground(new java.awt.Color(255, 255, 255));
        jbVisita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/icons8-board-64.png"))); // NOI18N
        jbVisita.setText("Visita");
        jbVisita.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        jbVisita.setBorderPainted(false);
        jbVisita.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbVisita.setHideActionText(true);
        jbVisita.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jbVisita.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbVisitaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbVisitaMouseExited(evt);
            }
        });
        jbVisita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVisitaActionPerformed(evt);
            }
        });

        jbTratamiento.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jbTratamiento.setForeground(new java.awt.Color(255, 255, 255));
        jbTratamiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/clinica.png"))); // NOI18N
        jbTratamiento.setText("Tratamiento");
        jbTratamiento.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        jbTratamiento.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbTratamiento.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jbTratamiento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbTratamientoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbTratamientoMouseExited(evt);
            }
        });
        jbTratamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbTratamientoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuLateralLayout = new javax.swing.GroupLayout(menuLateral);
        menuLateral.setLayout(menuLateralLayout);
        menuLateralLayout.setHorizontalGroup(
            menuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLateralLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(menuLateralLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jbVisita, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jbClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jbTratamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        menuLateralLayout.setVerticalGroup(
            menuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLateralLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(menuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuLateralLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jbVisita, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jbClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jbTratamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.setBackground(new java.awt.Color(0, 173, 255));

        jLabel1.setFont(new java.awt.Font("Roboto Black", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/icons8-plan-de-tratamiento-48.png"))); // NOI18N
        jLabel1.setText("Administración Veterinaria");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 964, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 810, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpFondoLayout = new javax.swing.GroupLayout(jpFondo);
        jpFondo.setLayout(jpFondoLayout);
        jpFondoLayout.setHorizontalGroup(
            jpFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFondoLayout.createSequentialGroup()
                .addComponent(menuLateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jpFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(escritorio)))
        );
        jpFondoLayout.setVerticalGroup(
            jpFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuLateral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jpFondoLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbClientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbClientesActionPerformed

    private void jbVisitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVisitaActionPerformed
        // TODO add your handling code here:
       escritorio.removeAll();
       escritorio.repaint();
       Visita v = new Visita();
       v.setVisible(true);
       escritorio.add(v);
                


    }//GEN-LAST:event_jbVisitaActionPerformed

    private void jbClientesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbClientesMouseEntered
        jbClientes.setOpaque(true);
        jbClientes.setBackground(azulClaro);
    }//GEN-LAST:event_jbClientesMouseEntered

    private void jbClientesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbClientesMouseExited
        jbClientes.setOpaque(false);
    }//GEN-LAST:event_jbClientesMouseExited

    private void jbVisitaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbVisitaMouseEntered
        jbVisita.setOpaque(true);
        jbVisita.setBackground(azulClaro);
    }//GEN-LAST:event_jbVisitaMouseEntered

    private void jbVisitaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbVisitaMouseExited
        jbVisita.setOpaque(false);
    }//GEN-LAST:event_jbVisitaMouseExited

    private void jbTratamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbTratamientoActionPerformed
       escritorio.removeAll();
       escritorio.repaint();
//       pruebaFondo pf=new pruebaFondo();
       TratamientoVista tv = new TratamientoVista();

       tv.setVisible(true);
       escritorio.add(tv);
       escritorio.moveToFront(tv);
       
    }//GEN-LAST:event_jbTratamientoActionPerformed

    private void jbTratamientoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbTratamientoMouseEntered
        jbTratamiento.setOpaque(true);
        jbTratamiento.setBackground(azulClaro);
    }//GEN-LAST:event_jbTratamientoMouseEntered

    private void jbTratamientoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbTratamientoMouseExited
        jbTratamiento.setOpaque(false);
    }//GEN-LAST:event_jbTratamientoMouseExited

    public void transparenciaButton() {
        jbClientes.setOpaque(false);
        jbClientes.setContentAreaFilled(false);
        jbClientes.setBorderPainted(false);
        jbVisita.setOpaque(false);
        jbVisita.setContentAreaFilled(false);
        jbVisita.setBorderPainted(false);
        jbTratamiento.setOpaque(false);
        jbTratamiento.setContentAreaFilled(false);
        jbTratamiento.setBorderPainted(false);
    }

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbClientes;
    private javax.swing.JButton jbTratamiento;
    private javax.swing.JButton jbVisita;
    private javax.swing.JPanel jpFondo;
    private javax.swing.JPanel menuLateral;
    // End of variables declaration//GEN-END:variables
}

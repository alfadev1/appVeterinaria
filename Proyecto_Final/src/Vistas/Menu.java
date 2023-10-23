package Vistas;

import vistas.Visita;
import java.awt.Color;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class Menu extends javax.swing.JFrame {

    Color azul = new Color(0, 107, 247);
    Color azulClaro = new Color(0, 173, 255);

    public Menu() {
        initComponents();
        transparenciaButton();
        this.setSize(1250, 900);
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
        jbSalir = new javax.swing.JButton();
        jbListaMascotas = new javax.swing.JButton();
        jbMascotas = new javax.swing.JButton();
        jbFactura = new javax.swing.JButton();
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
        jbClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        jbVisita.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        jbTratamiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/icons8-plan-de-tratamiento-64.png"))); // NOI18N
        jbTratamiento.setText("Tratamiento");
        jbTratamiento.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        jbTratamiento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        jbSalir.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jbSalir.setForeground(new java.awt.Color(255, 255, 255));
        jbSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/icons8-ventana-abierta-64.png"))); // NOI18N
        jbSalir.setText("Salir");
        jbSalir.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        jbSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbSalir.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jbSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbSalirMouseExited(evt);
            }
        });
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jbListaMascotas.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jbListaMascotas.setForeground(new java.awt.Color(255, 255, 255));
        jbListaMascotas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/icons8-mascota-64.png"))); // NOI18N
        jbListaMascotas.setText("Lista de Mascotas");
        jbListaMascotas.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        jbListaMascotas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbListaMascotas.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jbListaMascotas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbListaMascotasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbListaMascotasMouseExited(evt);
            }
        });
        jbListaMascotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbListaMascotasActionPerformed(evt);
            }
        });

        jbMascotas.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jbMascotas.setForeground(new java.awt.Color(255, 255, 255));
        jbMascotas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/icons8-mascota-64.png"))); // NOI18N
        jbMascotas.setText("Mascotas");
        jbMascotas.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        jbMascotas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbMascotas.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jbMascotas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbMascotasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbMascotasMouseExited(evt);
            }
        });
        jbMascotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMascotasActionPerformed(evt);
            }
        });

        jbFactura.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jbFactura.setForeground(new java.awt.Color(255, 255, 255));
        jbFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/icons8-board-64.png"))); // NOI18N
        jbFactura.setText("Facturación");
        jbFactura.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        jbFactura.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbFactura.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jbFactura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbFacturaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbFacturaMouseExited(evt);
            }
        });
        jbFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFacturaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuLateralLayout = new javax.swing.GroupLayout(menuLateral);
        menuLateral.setLayout(menuLateralLayout);
        menuLateralLayout.setHorizontalGroup(
            menuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLateralLayout.createSequentialGroup()
                .addGroup(menuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuLateralLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(menuLateralLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jbClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbVisita, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbTratamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbListaMascotas, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbMascotas, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );
        menuLateralLayout.setVerticalGroup(
            menuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLateralLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbMascotas, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jbListaMascotas, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbTratamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbVisita, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110)
                .addComponent(jbFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 952, Short.MAX_VALUE))
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
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpFondoLayout = new javax.swing.GroupLayout(jpFondo);
        jpFondo.setLayout(jpFondoLayout);
        jpFondoLayout.setHorizontalGroup(
            jpFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFondoLayout.createSequentialGroup()
                .addComponent(menuLateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jpFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jpFondoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(escritorio)
                        .addContainerGap())))
        );
        jpFondoLayout.setVerticalGroup(
            jpFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuLateral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpFondoLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(escritorio))
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
//        escritorio.removeAll();
//        escritorio.repaint();
//        ClienteVista c = new ClienteVista();
//        c.setBounds(0, 0, escritorio.getWidth(), escritorio.getHeight());
//        c.setResizable(false);
//        c.setClosable(false);
//        c.setMaximizable(false);
//        escritorio.add(c);
//        escritorio.addComponentListener(new ComponentAdapter() {
//            @Override
//            public void componentResized(ComponentEvent e) {
//                c.setBounds(0, 0, escritorio.getWidth(), escritorio.getHeight());
//            }
//        });
//        c.setVisible(true);
        escritorio.removeAll();
        escritorio.repaint();
        ClienteVista cv = new ClienteVista();
        cv.setVisible(true);
        escritorio.add(cv);
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
        //escritorio.moveToFront(tv);

    }//GEN-LAST:event_jbTratamientoActionPerformed

    private void jbTratamientoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbTratamientoMouseEntered
        jbTratamiento.setOpaque(true);
        jbTratamiento.setBackground(azulClaro);
    }//GEN-LAST:event_jbTratamientoMouseEntered

    private void jbTratamientoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbTratamientoMouseExited
        jbTratamiento.setOpaque(false);
    }//GEN-LAST:event_jbTratamientoMouseExited

    private void jbSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbSalirMouseEntered
        jbSalir.setOpaque(true);
        jbSalir.setBackground(azulClaro);
    }//GEN-LAST:event_jbSalirMouseEntered

    private void jbSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbSalirMouseExited
        jbSalir.setOpaque(false);
    }//GEN-LAST:event_jbSalirMouseExited

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbListaMascotasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbListaMascotasMouseEntered
        jbListaMascotas.setOpaque(true);
        jbListaMascotas.setBackground(azulClaro);
    }//GEN-LAST:event_jbListaMascotasMouseEntered

    private void jbListaMascotasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbListaMascotasMouseExited
        jbListaMascotas.setOpaque(false);
    }//GEN-LAST:event_jbListaMascotasMouseExited

    private void jbListaMascotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbListaMascotasActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        MascotaVista mv = new MascotaVista();
        mv.setBounds(0, 0, escritorio.getWidth(), escritorio.getHeight());
        mv.setResizable(false);
        mv.setClosable(false);
        mv.setMaximizable(false);
        escritorio.add(mv);
        escritorio.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                mv.setBounds(0, 0, escritorio.getWidth(), escritorio.getHeight());
            }
        });
        mv.setVisible(true);

    }//GEN-LAST:event_jbListaMascotasActionPerformed

    private void jbMascotasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbMascotasMouseEntered
        // TODO add your handling code here:
        jbMascotas.setOpaque(true);
        jbMascotas.setBackground(azulClaro);
    }//GEN-LAST:event_jbMascotasMouseEntered

    private void jbMascotasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbMascotasMouseExited
        // TODO add your handling code here:
        jbMascotas.setOpaque(false);
    }//GEN-LAST:event_jbMascotasMouseExited

    private void jbMascotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMascotasActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        NuevaMascotaVista nm = new NuevaMascotaVista();
        nm.setVisible(true);
        escritorio.add(nm);
    }//GEN-LAST:event_jbMascotasActionPerformed

    private void jbFacturaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbFacturaMouseEntered
        // TODO add your handling code here:
        jbFactura.setOpaque(true);
        jbFactura.setBackground(azulClaro);
    }//GEN-LAST:event_jbFacturaMouseEntered

    private void jbFacturaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbFacturaMouseExited
        // TODO add your handling code here:
        jbFactura.setOpaque(false);
    }//GEN-LAST:event_jbFacturaMouseExited

    private void jbFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFacturaActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        FacturaVista fv= new FacturaVista();
        fv.setVisible(true);
        escritorio.add(fv);
    }//GEN-LAST:event_jbFacturaActionPerformed

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
        jbSalir.setOpaque(false);
        jbSalir.setContentAreaFilled(false);
        jbSalir.setBorderPainted(false);
        jbMascotas.setOpaque(false);
        jbMascotas.setContentAreaFilled(false);
        jbMascotas.setBorderPainted(false);
        jbListaMascotas.setOpaque(false);
        jbListaMascotas.setContentAreaFilled(false);
        jbListaMascotas.setBorderPainted(false);
        jbFactura.setOpaque(false);
        jbFactura.setContentAreaFilled(false);
        jbFactura.setBorderPainted(false);
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
    private javax.swing.JButton jbFactura;
    private javax.swing.JButton jbListaMascotas;
    private javax.swing.JButton jbMascotas;
    private javax.swing.JButton jbSalir;
    private javax.swing.JButton jbTratamiento;
    private javax.swing.JButton jbVisita;
    private javax.swing.JPanel jpFondo;
    private javax.swing.JPanel menuLateral;
    // End of variables declaration//GEN-END:variables
}

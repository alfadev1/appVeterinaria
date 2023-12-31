package Vistas;

import Entidades.*;
import conexion.*;
import conexion.ClienteData;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FacturaVista extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo = new DefaultTableModel(){
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };
    private DefaultTableModel modelo2 = new DefaultTableModel(){
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };
    ClienteData cd = new ClienteData();
    VisitaData vd = new VisitaData();

    public FacturaVista() {
        initComponents();
        //cabeceras de las tablas
        cabeceraTablaVisita();
        cabeceraTablamascota();
        //carga de combos
        cargaTipoPago();
        comboCientes();
        //cargar tablas
        cargaTMascota();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTvisitas = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtMascota = new javax.swing.JTable();
        cboxPagos = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jbGuardar = new javax.swing.JButton();
        cboxClientes = new javax.swing.JComboBox<>();

        setBorder(null);
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/icons8-factura-64.png"))); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 204));
        jPanel1.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        jPanel1.setPreferredSize(new java.awt.Dimension(30, 40));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("VISITAS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 110, 60, 20));

        jLabel3.setFont(new java.awt.Font("Roboto Black", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ABMS ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 34, 120, 50));

        jLabel4.setFont(new java.awt.Font("Roboto", 2, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Clínica Veterinaria ");
        jLabel4.setToolTipText("");
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 220, 44));

        jLabel8.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("CLIENTE: ");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, 20));

        jTvisitas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTvisitas);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 140, 390, 130));

        jLabel11.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/3225179_app_logo_media_popular_social_icon.png"))); // NOI18N
        jLabel11.setText("098-445566");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 530, 100, -1));

        jLabel13.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/7089161_google_maps_icon.png"))); // NOI18N
        jLabel13.setText("  Distrito x");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 500, 90, -1));

        jLabel14.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/3225191_app_instagram_logo_media_popular_icon.png"))); // NOI18N
        jLabel14.setText("@veterinaria_abms");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 500, 150, 20));

        jLabel15.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/3225179_app_logo_media_popular_social_icon.png"))); // NOI18N
        jLabel15.setText("098-112233");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 500, -1, -1));

        jtMascota.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jtMascota.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jtMascota.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtMascotaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtMascota);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 340, 130));

        cboxPagos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxPagosActionPerformed(evt);
            }
        });
        jPanel1.add(cboxPagos, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 300, 270, 30));

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("MASCOTAS:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, 20));

        jLabel16.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("MEDIO DE PAGO:");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 300, -1, 30));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 204));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/marker.png"))); // NOI18N
        jLabel10.setText("Ubicación");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, -1, 20));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 460, 150, 20));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 255));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/instagram.png"))); // NOI18N
        jLabel12.setText("Redes");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, -1, 20));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 460, 150, 20));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 204));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/bell.png"))); // NOI18N
        jLabel7.setText("Contacto");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, -1, 20));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 460, 150, 20));

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/7123031_mail_google_gmail_icon.png"))); // NOI18N
        jLabel2.setText("abms_vet@gmail.com");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(718, 530, 170, -1));

        jbGuardar.setText("GUARDAR");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(jbGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(714, 360, 190, -1));

        cboxClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxClientesActionPerformed(evt);
            }
        });
        jPanel1.add(cboxClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 340, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-14, 0, 960, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtMascotaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtMascotaMouseClicked
        // TODO add your handling code here:
        borrarFilas2();
        int indexFila = jtMascota.getSelectedRow(), i;
        Cliente clienteSelected = (Cliente) cboxClientes.getSelectedItem();
        int idClienteSelected = clienteSelected.getIdCliente();
        int columnasIndex = jtMascota.getColumnCount();
        String[] mascotaSelected = new String[columnasIndex];
        if (indexFila != -1) {           
            for(i=0; i < columnasIndex; i++) {
                mascotaSelected[i]= jtMascota.getValueAt(indexFila,i).toString();                
            }
        }
        List<String[]> listaO = vd.listarVisitasXIdmascota(Integer.parseInt(mascotaSelected[0]));
        for (String[] strings : listaO) {
            modelo.addRow(new Object[] {strings[0],strings[1],strings[2]});
        }  
    }//GEN-LAST:event_jtMascotaMouseClicked

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        // TODO add your handling code here
        //boolean PAGO = jrPago.isSelected();
        //se verifica que el usuario haya seleccionado un medio de pago que no sea 
        //el que está vacío
        String Tpago;
        if (cboxPagos.getSelectedIndex() != 0) {
            Tpago = String.valueOf(cboxPagos.getSelectedItem());
            JOptionPane.showMessageDialog(null, "Pago realizado con éxito con " + Tpago);
        } else {
            JOptionPane.showMessageDialog(null, "FALTA SELECCIONAR UN MEDIO DE PAGO ");
        }
        
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void cboxPagosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxPagosActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_cboxPagosActionPerformed

    private void cboxClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxClientesActionPerformed
        // TODO add your handling code here:
        cargaTMascota();
        
//        borrarFilas();
//        Cliente cliente = (Cliente) cboxClientes.getSelectedItem();
//        List<Mascota> mascotaLista = md.buscarMascotaXCliente(cliente.getIdCliente());
//
//        for (Mascota mascota : mascotaLista) {
//            try {
//                modelo.addRow(new Object[]{
//                    mascota.getIdMascota(),
//                    mascota.getAlias(),
//                    mascota.getSexo(),
//                    mascota.getEspecie(),
//                    mascota.getRaza(),
//                    mascota.getfNac(),
//                    mascota.getPesoActual(),
//                    mascota.getPesoMedio()
//                });
//
//            } catch (NullPointerException e) {
//
//            }
//        }

    }//GEN-LAST:event_cboxClientesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Cliente> cboxClientes;
    private javax.swing.JComboBox<String> cboxPagos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTvisitas;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JTable jtMascota;
    // End of variables declaration//GEN-END:variables

    private void cabeceraTablaVisita() {
        //nombres de las columnas
        modelo.addColumn("Fecha");
        modelo.addColumn("Tipo");
        modelo.addColumn("Precio");
        //Se pasa el modelo a la tabla
        jTvisitas.setModel(modelo);
    }

    private void cabeceraTablamascota() {
        modelo2.addColumn("ID");
        modelo2.addColumn("NOMBRE");
        jtMascota.setModel(modelo2);

    }

    private void cargaTipoPago() {
        cboxPagos.removeAllItems();
        cboxPagos.addItem("");
        cboxPagos.addItem("DEBITO");
        cboxPagos.addItem("CREDITO");
    }

    private void comboCientes() {
        cboxClientes.removeAllItems();
        for (Cliente object : cd.listarClientes()) {
            cboxClientes.addItem(object);
        }
    }

    private void cargaTMascota() {
        borrarFilas();
        Cliente cli = (Cliente) cboxClientes.getSelectedItem();
        int id = cli.getIdCliente();

        List<Mascota> reg = cd.mascotaXCliente(id);
        for (Mascota masc : reg) {

            modelo2.addRow(new Object[]{
                masc.getIdMascota(),
                masc.getAlias(),});
        }
    }
    private void borrarFilas() {
        int filas = modelo2.getRowCount() - 1;
        for (; filas >= 0; filas--) {
            modelo2.removeRow(filas);
        }
    }
    private void borrarFilas2() {
        int filas = modelo.getRowCount() - 1;
        for (; filas >= 0; filas--) {
            modelo.removeRow(filas);
        }
    }
}

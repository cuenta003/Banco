/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package banco;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import static java.lang.Integer.parseInt;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author macbookpro
 */
public class Movimiento extends javax.swing.JFrame {

    banco.DatosCliente[] _clientes;
    banco.DatosCuenta[] _cuentas;
    private banco.Menu mainFrame;

    /**
     * Creates new form Movimiento
     */
    public Movimiento() {
        initComponents();
    }

    public Movimiento(banco.Menu padre, DatosCliente[] clientes, DatosCuenta[] cuentas) {
        initComponents();

        //FORMULARIO PADRE
        this.mainFrame = padre;

        //DATOS CLIENTE
        this._clientes = clientes;

        //CUENTAS BANCARIAS 
        this._cuentas = cuentas;

        //HABILITA LA CONFIGURACION DE DESTRUIR EL FORMULARIO AL CERRARLO Y NO CERRAR LA APP
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        //LLENA EL COMBO CON LOS DATOS DE LAS CUENTAS
        for (DatosCuenta cuenta : _cuentas) {
            if (cuenta != null) {
                String NombreCompleto = "";
                for (DatosCliente cliente : _clientes) {
                    if (cliente != null) {
                        if (cliente.CUI.trim().equals(cuenta.CUI.trim())) {
                            NombreCompleto = cliente.Nombre + " " + cliente.Apellido;
                        }
                    }
                }
                this.cmbCuentasOrigen.addItem(cuenta.Id + " - " + cuenta.NumeroCuenta + " - Cuenta de " + NombreCompleto);
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cmbOperacionbancaria = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        cmbCuentasOrigen = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtMonto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaObservaciones = new javax.swing.JTextArea();
        btnRegistrar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        cmbCuentasDestino = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        cmbServicios = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Movimientos Bancarias");
        setAlwaysOnTop(true);
        addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                formPropertyChange(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Tipo Operacion Bancaria");

        cmbOperacionbancaria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Deposito", "Transferencia", "Pago Servicios" }));
        cmbOperacionbancaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbOperacionbancariaActionPerformed(evt);
            }
        });

        jLabel2.setText("Cuenta Bancaria Orig.");

        cmbCuentasOrigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCuentasOrigenActionPerformed(evt);
            }
        });

        jLabel3.setText("Monto");

        jLabel4.setText("Observaciones");

        txtaObservaciones.setColumns(20);
        txtaObservaciones.setRows(5);
        jScrollPane1.setViewportView(txtaObservaciones);

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel5.setText("Cuenta Bancaria Dest.");
        jLabel5.setEnabled(false);

        cmbCuentasDestino.setEnabled(false);

        jLabel6.setText("Servicio");
        jLabel6.setEnabled(false);

        cmbServicios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Luz electrica", "Agua", "Servicio telefonico" }));
        cmbServicios.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbCuentasOrigen, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbOperacionbancaria, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbCuentasDestino, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbServicios, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancelar)))
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmbOperacionbancaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmbCuentasOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cmbCuentasDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbServicios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:

        // VALIDA NUMEROS Y UN PUNTO DECIMAL
        txtMonto.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();
                if (((caracter < '0') || (caracter > '9')) && (caracter != KeyEvent.VK_BACK_SPACE) && (caracter != '.' || txtMonto.getText().contains("."))) {
                    e.consume();
                    getToolkit().beep();
                }
            }
        });


    }//GEN-LAST:event_formWindowActivated

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        this.mainFrame.setEnabled(true);
        this.mainFrame.setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        this.mainFrame.setEnabled(false);
        this.mainFrame.setVisible(false);
    }//GEN-LAST:event_formWindowOpened

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        this.mainFrame.setEnabled(true);
        this.mainFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:

        boolean montoMayorCero = false;

        // Seleccion de Tipo
        Object otipo = this.cmbOperacionbancaria.getSelectedItem();
        String stipo = otipo.toString().trim();

        // Seleccion de Cuenta Origen para operaciones
        Object ocliente = this.cmbCuentasOrigen.getSelectedItem();
        String[] parts = ocliente.toString().split("-");
        String id = parts[0].trim();
        int icuentaorigen = parseInt(id);

        if (this.txtMonto.getText().length() > 0) {
            if (Double.parseDouble(this.txtMonto.getText()) > 0) {
                montoMayorCero = true;
            }
        }

        //Saldo cuenta origen
        double dSaldoO = this.mainFrame.SaldoCuenta(icuentaorigen);

        if (cmbOperacionbancaria.getSelectedItem() == "Transferencia") {

            // Seleccion de Cuenta Destino para operaciones
            Object oDestino = this.cmbCuentasDestino.getSelectedItem();
            String[] splitDestino = oDestino.toString().split("-");
            String sId = splitDestino[0].trim();
            int icuentadestino = parseInt(sId);

            //Saldo cuenta destino
            double dSaldoD = this.mainFrame.SaldoCuenta(icuentadestino);

            if (montoMayorCero) {

                // Monto a Transferir
                double dMonto = Double.parseDouble(this.txtMonto.getText());

                // Determina saldo cuenta de origen mayor al monto a transferir
                if (dSaldoO >= dMonto) {
                    // Graba Historial de Movimiento
                    boolean segrabo1 = this.mainFrame.AgregarMovimiento(icuentaorigen, stipo, dMonto, "Debito", "", txtaObservaciones.getText());
                    boolean segrabo2 = this.mainFrame.AgregarMovimiento(icuentadestino, stipo, dMonto, "Credito", "", txtaObservaciones.getText());

                    if (segrabo1) {

                        // Nuevo saldo  de la cuenta origen tras transferencia
                        double nuevoSaldoO = dSaldoO - dMonto;
                        this.mainFrame.CambiaSaldo(nuevoSaldoO, icuentaorigen);

                        // Nuevo saldo de la cuenta destino tras transferencia
                        double nuevoSaldoD = dSaldoD + dMonto;
                        this.mainFrame.CambiaSaldo(nuevoSaldoD, icuentadestino);

                        JOptionPane.showMessageDialog(null, "Transferencia realizada exitosamente.", "Informacion", JOptionPane.INFORMATION_MESSAGE);

                    } else {
                        JOptionPane.showMessageDialog(null, "Error al grabar transferencia.", "Informacion", JOptionPane.INFORMATION_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "La cuenta de origen no tiene suficientes fondos.", "Informacion", JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "El monto de la transferencia deber ser mayor a 0.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            }

        } else if (cmbOperacionbancaria.getSelectedItem() == "Deposito") {
            if (montoMayorCero) {

                // Monto a Depositar
                double dMonto = Double.parseDouble(this.txtMonto.getText());

                // Graba movimiento de deposito
                boolean segrabo1 = this.mainFrame.AgregarMovimiento(icuentaorigen, stipo, dMonto, "Credito", "", txtaObservaciones.getText());

                if (segrabo1) {
                    // Nuevo saldo  de la cuenta origen tras transferencia
                    double nuevoSaldoO = dSaldoO + dMonto;
                    this.mainFrame.CambiaSaldo(nuevoSaldoO, icuentaorigen);

                    JOptionPane.showMessageDialog(null, "Deposito realizado exitosamente.", "Informacion", JOptionPane.INFORMATION_MESSAGE);
                }

            } else {
                JOptionPane.showMessageDialog(null, "El monto del deposito deber ser mayor a 0.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            }

        } else if (cmbOperacionbancaria.getSelectedItem() == "Pago Servicios") {
            
            // Determina si hay fondos suficientes
            if(montoMayorCero){
                
                // Monto a Pagar
                double dMonto = Double.parseDouble(this.txtMonto.getText());
                
                if(dSaldoO < dMonto ){
                     JOptionPane.showMessageDialog(null, "La cuenta de origen no tiene suficientes fondos.", "Advertencia", JOptionPane.WARNING_MESSAGE);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Pago realizado exitosamente.", "Informacion", JOptionPane.INFORMATION_MESSAGE);
                }
                
                
            }
            else {
                JOptionPane.showMessageDialog(null, "El monto del pago debe ser mayor a 0.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            }

        }


    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void formPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_formPropertyChange
        // TODO add your handling code here:

    }//GEN-LAST:event_formPropertyChange

    private void cmbOperacionbancariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbOperacionbancariaActionPerformed
        // TODO add your handling code here:
        if (cmbOperacionbancaria.getSelectedItem() == "Transferencia") {
            jLabel5.setEnabled(true);
            cmbCuentasDestino.setEnabled(true);
            jLabel5.setEnabled(false);
            cmbServicios.setEnabled(false);
        } else if (cmbOperacionbancaria.getSelectedItem() == "Pago Servicios") {
            jLabel5.setEnabled(true);
            cmbServicios.setEnabled(true);
            jLabel5.setEnabled(false);
            cmbCuentasDestino.setEnabled(false);
        } else {
            jLabel5.setEnabled(false);
            cmbCuentasDestino.setEnabled(false);
            jLabel5.setEnabled(false);
            cmbServicios.setEnabled(false);
        }
    }//GEN-LAST:event_cmbOperacionbancariaActionPerformed

    private void cmbCuentasOrigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCuentasOrigenActionPerformed
        // TODO add your handling code here:
        //LLENA EL COMBO CON LOS DATOS DE LAS CUENTAS

        // Seleccion de cuenta origen
        Object ocliente = this.cmbCuentasOrigen.getSelectedItem();
        String[] parts = ocliente.toString().split("-");
        String id = parts[0].trim();
        int icuentaorigen = parseInt(id);

        // Borra contenido de combo de cuentas destino
        this.cmbCuentasDestino.removeAllItems();

        // Llena combo cuentas destino con nuevas cuentas expeto la de origen
        for (DatosCuenta cuenta : _cuentas) {
            if (cuenta != null) {
                if (cuenta.Id == icuentaorigen) {
                } else {
                    String NombreCompleto = "";
                    for (DatosCliente cliente : _clientes) {
                        if (cliente != null) {
                            if (cliente.CUI.trim().equals(cuenta.CUI.trim())) {
                                NombreCompleto = cliente.Nombre + " " + cliente.Apellido;
                            }
                        }
                    }
                    this.cmbCuentasDestino.addItem(cuenta.Id + " - " + cuenta.NumeroCuenta + " - Cuenta de " + NombreCompleto);
                }
            }
        }
    }//GEN-LAST:event_cmbCuentasOrigenActionPerformed

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
            java.util.logging.Logger.getLogger(Movimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Movimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Movimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Movimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Movimiento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> cmbCuentasDestino;
    private javax.swing.JComboBox<String> cmbCuentasOrigen;
    private javax.swing.JComboBox<String> cmbOperacionbancaria;
    private javax.swing.JComboBox<String> cmbServicios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtMonto;
    private javax.swing.JTextArea txtaObservaciones;
    // End of variables declaration//GEN-END:variables
}

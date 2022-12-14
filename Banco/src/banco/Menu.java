/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package banco;

import java.util.Date;
import javax.swing.JOptionPane;
import sun.security.util.Debug;

/**
 *
 * @author adriangarcia
 */
public class Menu extends javax.swing.JFrame {

    private banco.DatosCliente[] _clientes;
    private banco.DatosCuenta[] _cuentas;
    private banco.DatosMovimientos[] _movimientos;

    //Contador de Clientes
    public int iContadorCliente = 1;

    //Contador de Clientes
    public int iContadorMov = 1000;

    //Identificador Unico para Cuentas Bancarias
    public int iCuentaBancoId = 1;

    //numero maximo clientes
    private final int iMaxClientes = 5;

    //numero maximo cuentas por cliente
    private final int iMaxCuentasCliente = 5;

    //numero maximo cuentas por cliente
    private final int iMaxMovCuentas = 10;

    //formulario padre
    Login _padre;

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        // Como un vector de array.
        _clientes = new banco.DatosCliente[iMaxClientes];
        _cuentas = new banco.DatosCuenta[iMaxClientes * iMaxCuentasCliente];
        _movimientos = new banco.DatosMovimientos[iMaxClientes * iMaxCuentasCliente * iMaxMovCuentas];

        // Como un array multidimencional 0,1,2,3,4 (cinco registros) y 0,1,2 (tres columnas [cui,nombre,apellido]) 
        //aclientes = new String[5][3];
    }

    public Menu(Login padre) {
        initComponents();
        // Como un vector de array.
        _clientes = new banco.DatosCliente[iMaxClientes];
        _cuentas = new banco.DatosCuenta[iMaxClientes * iMaxCuentasCliente];
        _movimientos = new banco.DatosMovimientos[iMaxClientes * iMaxCuentasCliente * iMaxMovCuentas];
        _padre = padre;

        // Como un array multidimencional 0,1,2,3,4 (cinco registros) y 0,1,2 (tres columnas [cui,nombre,apellido]) 
        //aclientes = new String[5][3];
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCrearCliente = new javax.swing.JButton();
        btnCrearCuenta = new javax.swing.JButton();
        btnVisualizar = new javax.swing.JButton();
        btnMovimiento = new javax.swing.JButton();
        btnHistorial = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Menu");
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

        btnCrearCliente.setText("Registrar Clientes");
        btnCrearCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearClienteActionPerformed(evt);
            }
        });

        btnCrearCuenta.setText("Crear Cuenta");
        btnCrearCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearCuentaActionPerformed(evt);
            }
        });

        btnVisualizar.setText("Visualizar Info Clientes");
        btnVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizarActionPerformed(evt);
            }
        });

        btnMovimiento.setText("Movimiento Bancario");
        btnMovimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMovimientoActionPerformed(evt);
            }
        });

        btnHistorial.setText("Historial  de Trans");
        btnHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistorialActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnVisualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCrearCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCrearCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMovimiento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnHistorial, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(108, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(btnCrearCliente)
                .addGap(18, 18, 18)
                .addComponent(btnCrearCuenta)
                .addGap(18, 18, 18)
                .addComponent(btnVisualizar)
                .addGap(18, 18, 18)
                .addComponent(btnMovimiento)
                .addGap(18, 18, 18)
                .addComponent(btnHistorial)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearClienteActionPerformed
        // TODO add your handling code here:
        // Verifica la cantidad de clientes creados
        if (iContadorCliente > iMaxClientes) {
            JOptionPane.showMessageDialog(null, "No es posible crear mas clientes", "Advertencia", JOptionPane.INFORMATION_MESSAGE);

        } else {
            banco.Cliente creaCliente = new banco.Cliente(this, iContadorCliente);
            creaCliente.setAlwaysOnTop(true);
            creaCliente.setVisible(true);
        }
        //this.setVisible(false);
    }//GEN-LAST:event_btnCrearClienteActionPerformed

    private void btnVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizarActionPerformed
        // TODO add your handling code here:

        banco.Informacion Info = new banco.Informacion(this, this._clientes, this._cuentas);
        Info.setAlwaysOnTop(true);
        Info.setVisible(true);

    }//GEN-LAST:event_btnVisualizarActionPerformed

    private void btnCrearCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearCuentaActionPerformed
        // TODO add your handling code here:
        banco.Cuenta crearCuenta = new banco.Cuenta(this, this._clientes);
        crearCuenta.setAlwaysOnTop(true);
        crearCuenta.setVisible(true);
    }//GEN-LAST:event_btnCrearCuentaActionPerformed

    private void btnMovimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMovimientoActionPerformed
        // TODO add your handling code here:
        banco.Movimiento crearMovimiento = new banco.Movimiento(this, this._clientes, this._cuentas);
        crearMovimiento.setAlwaysOnTop(true);
        crearMovimiento.setVisible(true);
    }//GEN-LAST:event_btnMovimientoActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        DatosPrueba();
    }//GEN-LAST:event_formWindowActivated

    private void btnHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistorialActionPerformed
        // TODO add your handling code here:
        banco.Historial creaHistorial = new banco.Historial(this, this._clientes, this._cuentas, this._movimientos);
        creaHistorial.setAlwaysOnTop(true);
        creaHistorial.setVisible(true);
    }//GEN-LAST:event_btnHistorialActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        this._padre.setEnabled(false);
        this._padre.setVisible(false);
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        this._padre.setEnabled(true);
        this._padre.setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    public int CantidadCuentasPorCui(String cui) {
        int Cantidad = 0;
        for (int x = 0; x <= (iMaxClientes * iMaxCuentasCliente) - 1; x++) {
            // que el registro no sea nulo
            if (_cuentas[x] != null) {
                //si el cui es igual determina cuantas cuentas lleva registradas
                if (cui.equals(_cuentas[x].CUI)) {
                    Cantidad++;
                }
            }

        }
        return Cantidad;
    }

    public double SaldoCuenta(int cuenta) {
        double dMonto = 0;
        for (int x = 0; x <= (iMaxClientes * iMaxCuentasCliente) - 1; x++) {
            // que el registro no sea nulo
            if (_cuentas[x] != null) {
                //si el cui es igual determina el saldo de la cuenta
                if (cuenta == _cuentas[x].Id) {
                    dMonto = _cuentas[x].Saldo;
                }
            }
        }
        return dMonto;
    }

    public void CambiaSaldo(double saldo, int cuenta) {
        for (int x = 0; x <= (iMaxClientes * iMaxCuentasCliente) - 1; x++) {
            // que el registro no sea nulo
            if (_cuentas[x] != null) {
                //si el cui es igual determina el saldo de la cuenta
                if (cuenta == _cuentas[x].Id) {
                    _cuentas[x].Saldo = saldo;
                }
            }
        }
    }

    public boolean AgregarMovimiento(int iCuenta, String tipo, double monto, String operacion,
            String servicio, String observaciones) {
        boolean grabado = false;
        if ((iContadorMov - 1000) <= 1250) {
            _movimientos[this.iContadorMov - 1000] = new DatosMovimientos(iContadorMov,
                    iCuenta,
                    tipo,
                    monto,
                    operacion,
                    servicio,
                    observaciones);
            grabado = true;

            System.out.println(iContadorMov + "-" + iCuenta + "-" + tipo + "-" + monto + "-" + operacion + "-" + servicio);
            iContadorMov++;
        }

        return grabado;
    }

    public boolean AgregarNuevaCuenta(String numerocuenta, String tipo, String cui) {
        boolean existe = false;

        for (int x = 0; x <= (iMaxClientes * iMaxCuentasCliente) - 1; x++) {
            if (_cuentas[x] != null) {

                // que no existan cuentas duplicadas
                if (numerocuenta.equals(_cuentas[x].NumeroCuenta)) {
                    existe = true;
                    break;
                }
            }
        }

        if (!existe) {
            _cuentas[this.iCuentaBancoId] = new banco.DatosCuenta(numerocuenta, tipo, cui, iCuentaBancoId);
            iCuentaBancoId++;
        }

        return existe;
    }

    public boolean AgregarNuevoCliente(String Nombre, String Apellido, String CUI) {
        boolean existe = false;

        //valida que no hayan duplicados
        for (int x = 0; x <= iMaxClientes - 1; x++) {
            if (_clientes[x] != null) {
                if (CUI.equals(_clientes[x].CUI)) {
                    existe = true;
                }
            }
        }

        if (!existe) {
            _clientes[iContadorCliente - 1] = new DatosCliente(CUI, Nombre, Apellido);
            iContadorCliente++;
        }

        return existe;
    }

    private void DatosPrueba() {
        _clientes[0] = new DatosCliente("2553803990101", "Adrian Renato", "Garccia");
        _clientes[1] = new DatosCliente("2553814000101", "Ann", "Jefferson");
        this.iContadorCliente = 3;

        _cuentas[0] = new DatosCuenta("56460101", "Depositos", "2553803990101", 1);
        _cuentas[1] = new DatosCuenta("36180101", "Ahorros", "2553803990101", 2);
        _cuentas[2] = new DatosCuenta("44440101", "Depositos", "2553814000101", 3);
        _cuentas[3] = new DatosCuenta("39440101", "Ahorros", "2553814000101", 4);
        _cuentas[4] = new DatosCuenta("14500101", "Ahorros", "2553803990101", 5);
        _cuentas[5] = new DatosCuenta("09500101", "Ahorros", "2553803990101", 6);
        this.iCuentaBancoId = 7;

        _movimientos[0] = new DatosMovimientos(this.iContadorMov, 1, "Deposito", 500.45, "Credito", "", "");
        this.CambiaSaldo(500.45, 1);
        _movimientos[1] = new DatosMovimientos(this.iContadorMov+=1, 1, "Transferencia", 99.0, "Debito", "", "A cuenta - 44440101 Ann Jefferson");
        this.CambiaSaldo(500.45 - 99, 1);
        _movimientos[2] = new DatosMovimientos(this.iContadorMov+=1, 3, "Transferencia", 99.45, "Credito", "", "De cuenta - 56460101 Adrian Renato Garccia");
        this.CambiaSaldo(99, 3);
        _movimientos[3] = new DatosMovimientos(this.iContadorMov+=1, 1, "Pago Servicios", 250.85, "Debito", "Servicio telefonico", "");
        this.CambiaSaldo(150, 1);
        _movimientos[4] = new DatosMovimientos(this.iContadorMov+=1, 1, "Deposito", 109.55, "Credito", "", "");
        this.CambiaSaldo(260.15, 1);
        this.iContadorMov = 1005;

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
    private javax.swing.JButton btnCrearCliente;
    private javax.swing.JButton btnCrearCuenta;
    private javax.swing.JButton btnHistorial;
    private javax.swing.JButton btnMovimiento;
    private javax.swing.JButton btnVisualizar;
    // End of variables declaration//GEN-END:variables
}

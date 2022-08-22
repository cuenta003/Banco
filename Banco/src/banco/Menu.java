/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package banco;

import javax.swing.JOptionPane;
import sun.security.util.Debug;

/**
 *
 * @author adriangarcia
 */
public class Menu extends javax.swing.JFrame {

    private banco.DatosCliente[] _clientes;
    private banco.DatosCuenta[] _cuentas;
    //private String[][] aclientes;
    
    //Contador de Clientes
    public int iContadorCliente = 1;
    
    //Identificador Unico para Cuentas Bancarias
    public int iCuentaBancoId = 1;
    
    //numero maximo clientes
    private final int iMaxClientes = 5;
    
    //numero maximo cuentas por cliente
    private final int iMaxCuentasCliente = 5;

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        // Como un vector de array.
        _clientes = new banco.DatosCliente[iMaxClientes];
        _cuentas = new banco.DatosCuenta[iMaxClientes * iMaxCuentasCliente];
        
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnVisualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCrearCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCrearCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addContainerGap(145, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearClienteActionPerformed
        // TODO add your handling code here:
        // Verifica la cantidad de clientes creados
        if (iContadorCliente > iMaxClientes) {
            JOptionPane.showMessageDialog(null, "No es posible crear mas clientes","Advertencia", JOptionPane.INFORMATION_MESSAGE);            
        
        } else {
            banco.Cliente creaCliente = new banco.Cliente(this, iContadorCliente);
            creaCliente.setAlwaysOnTop(true);
            creaCliente.setVisible(true);
        }
        //this.setVisible(false);
    }//GEN-LAST:event_btnCrearClienteActionPerformed

    private void btnVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizarActionPerformed
        // TODO add your handling code here:
        
        banco.Informacion Info = new banco.Informacion(this, this._clientes);
        Info.setAlwaysOnTop(true);
        Info.setVisible(true);
        // Visualiza informacion de Clientes Array Multidimencional
//        for(int x=0; x<=4; x++){
//            for(int y=0; y<=2; y++){
//                System.out.print(aclientes[x][y] + "; "); //imprime tres columnas
//            }
//            System.out.println(""); // salto de linea
//        }
        
        //Visualiza Vector Array
//        for(int x=0; x<=4; x++)
//        {
//            if( _clientes[x] != null ){
//                System.out.println( _clientes[x].CUI + "; " +
//                        _clientes[x].Nombre + "; " +
//                        _clientes[x].Apellido );
//            }
//            else
//            {
//                System.out.println("nulo");
//            }
//        }
    }//GEN-LAST:event_btnVisualizarActionPerformed

    private void btnCrearCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearCuentaActionPerformed
        // TODO add your handling code here:
        banco.Cuenta crearCuenta = new banco.Cuenta(this, this._clientes);
        crearCuenta.setAlwaysOnTop(true);
        crearCuenta.setVisible(true);
    }//GEN-LAST:event_btnCrearCuentaActionPerformed

    
    public int CantidadCuentasPorCui( String cui )
    {
        int Cantidad = 0;
        for(int x=0; x<=(iMaxClientes * iMaxCuentasCliente)-1; x++)
        {
            // que el registro no sea nulo
            if( _cuentas[x] != null )
            {
                //si el cui es igual determina cuantas cuentas lleva registradas
                if(cui.equals(_cuentas[x].CUI))
                {
                    Cantidad++;
                }
            }
            
        }
        return Cantidad;
    }
    
    public boolean AgregarNuevaCuenta( String numerocuenta, String tipo, String cui)
    {
        boolean existe = false;
        
        
        for(int x=0; x<=(iMaxClientes * iMaxCuentasCliente)-1; x++)
        {
            if( _cuentas[x] != null )
            {
                
                // que no existan cuentas duplicadas
                if( numerocuenta.equals(_cuentas[x].NumeroCuenta) )
                {
                    existe = true;
                }
            }
        }
        
        if(!existe)
        {
            _cuentas[this.iCuentaBancoId] = new banco.DatosCuenta(numerocuenta, tipo, cui, iCuentaBancoId);
            iCuentaBancoId++;
        }
        
        return existe;
    }
    
    public boolean AgregarNuevoCliente( String Nombre, String Apellido, String CUI )
    {
        boolean existe = false;
//        System.out.println("--- Nombre    " + Nombre);
//        System.out.println("--- Apellidos " + Apellido);
//        System.out.println("--- CUI       " + CUI);
//        System.out.println("------------- Dimension aclientes[][]");
//        System.out.println(aclientes.length);
//        System.out.println("------------- Contador Actual");
//        System.out.println(iContadorCliente);
//        System.out.println("------------- Asigna Array Multi");
//        aclientes[iContadorCliente][0] = CUI;
//        aclientes[iContadorCliente][1] = Nombre;
//        aclientes[iContadorCliente][2] = Apellido;
//        System.out.println("------------- Despliga");        
//        System.out.println(aclientes[iContadorCliente][0]);
//        System.out.println(aclientes[iContadorCliente][1]);
//        System.out.println(aclientes[iContadorCliente][2]);
//        System.out.println("------------- Asigna Vector Array");
        
        //valida que no hayan duplicados
        for(int x=0; x<=iMaxClientes-1; x++)
        {
            if( _clientes[x] != null )
            {
                if( CUI.equals(_clientes[x].CUI) )
                {
                    existe = true;
                }
            }
        }
        
        if(!existe)
        {
            _clientes[iContadorCliente-1] = new DatosCliente(CUI, Nombre, Apellido);
            iContadorCliente++;
        }
                
        return existe;
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
    private javax.swing.JButton btnVisualizar;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

import java.util.Date;

/**
 *
 * @author macbookpro
 */
public class DatosMovimientos {
    
    public int    Correlativo; //Llave
    public String NumeroCuenta;
    public String Tipo; //Deposito, Transferencia, Servicio
    public double Monto;
    public String Operacion; //Debito, Credito
    public Date Fecha;
    public String Observaciones;

}

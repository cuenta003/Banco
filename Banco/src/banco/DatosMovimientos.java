/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author macbookpro
 */
public class DatosMovimientos {

    public int Correlativo; //Llave
    public int NumeroCuenta;
    public String Tipo; //Deposito, Transferencia?, Servicio
    public double Monto;
    public String Operacion; //Debito, Credito
    public String Servicio; //Luz, Agua, Telefono
    public Date Fecha;
    public String Observaciones;

    
    public DatosMovimientos(int correlativo, int cuenta, String tipo, double monto,
            String operacion, String servicio, String observaciones) {

        Calendar today = Calendar.getInstance();
        today.clear(Calendar.HOUR);
        today.clear(Calendar.MINUTE);
        today.clear(Calendar.SECOND);

        Correlativo = correlativo;
        NumeroCuenta = cuenta;
        Tipo = tipo;
        Monto = monto;
        Operacion = operacion;
        Servicio = servicio;
        Fecha = today.getTime();
        Observaciones = observaciones;
    }

}

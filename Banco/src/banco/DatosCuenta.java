/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

/**
 *
 * @author macbookpro
 */
public class DatosCuenta {
    
    public String NumeroCuenta;
    public String Tipo;
    public String CUI;
    public double Saldo = 0;
    public int Id;
    
    DatosCuenta( String numerocuenta, String tipo, String Cui, int id)
    {
        this.NumeroCuenta = numerocuenta;
        this.Tipo = tipo;
        this.CUI = Cui;
        this.Id = id;
    }
}

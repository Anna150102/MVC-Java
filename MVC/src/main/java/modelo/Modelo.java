/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.text.DecimalFormat;

/**
 *
 * @author 33010
 */
public class Modelo {
   private double cantidad;
   private String divisaEntrante;
   private String divisaSaliente;
   private double resultado;

   //Dolares/Euros
    public double [] COR = {0.027,0.025};
    //Cordobas/Euros
    public double [] DOL = {37.11,0.91};
    //Cordobas/Dolares
    public double [] EUR = {40.77,1.10};
    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public String getDivisaEntrante() {
        return divisaEntrante;
    }

    public void setDivisaEntrante(String divisaEntrante) {
        this.divisaEntrante = divisaEntrante;
    }

    public String getDivisaSaliente() {
        return divisaSaliente;
    }

    public void setDivisaSaliente(String divisaSaliente) {
        this.divisaSaliente = divisaSaliente;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
   //Metodos de conversion
   public String aMoneda(double monto, String moneda) {
    DecimalFormat formatoImporte = new DecimalFormat("#,###.##");
    String signo="";
    switch (moneda){
        case "COR":
            signo="$";
            break;
        case "DOL":
            signo="$";
            break;
        case "EUR":
            signo="$";
            break;
            
    }
   return signo+" "+formatoImporte.format(monto)+""+moneda ;
    }
    
    public double conversion (double cantidad, double equivalente){
        return cantidad * equivalente;
    }
}

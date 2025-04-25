/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio.Entidades;

/**
 *
 * @author valer
 */
class Pago {
    private String idPago;
    private String monto;
    private String metodoPago;
    private String fechaPago;

    public Pago(String idPago, String monto, String metodoPago, String fechaPago) {
        this.idPago = idPago;
        this.monto = monto;
        this.metodoPago = metodoPago;
        this.fechaPago = fechaPago;
    }
    
 
    public String getIdPago() { 
        return idPago; 
    }
    public String getMonto() { 
        return monto; 
    }
    public String getMetodoPago() {
        return metodoPago; 
    }
    public String getFechaPago() { 
        return fechaPago; 
    }


    public void setIdPago(String idPago) {
        this.idPago = idPago; 
    }
    public void setMonto(String monto) { 
        this.monto = monto;
    }
    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago; 
    }
    public void setFechaPago(String fechaPago) {
        this.fechaPago = fechaPago; 
    }
    
}

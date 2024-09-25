/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinal;

/**
 *
 * @author cliente
 */
public class Pago {
private BigDecimal monto;
private Date fechapago;
private String metodoPago;

public Pago(BigDecimal monto, Date fechapago, String metodoPago){
    this.monto = monto;
    this.fechapago = fechapago;
    this.metodoPago = metodoPago;
}

public void procesarPago() {
    System.out.println("Procesando el pago de " + monto + " mediante " + metodoPago + " en la fecha " + fechapago);
}

public void generarFactura() {
    System.out.println("Generando factura por el pago de  " + monto + " realizado en la fecha " + fechapago);
}

public void reembolsarPago() {
    System.out.println("Reembolsando el pago de " + monto + " realizado en la fecha " + fechapago);
    }

   @Override
    public void mostrarInformacion() {
        System.out.println("Pago: Monto: " + monto + ", Fecha de pago: " + fechaPago + ", Método de pago: " + metodoPago);
    }

    public BigDecimal getMonto() {
        return monto;
    }

    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }

    public Date getFechapago() {
        return fechapago;
    }

    public void setFechapago(Date fechapago) {
        this.fechapago = fechapago;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }
}

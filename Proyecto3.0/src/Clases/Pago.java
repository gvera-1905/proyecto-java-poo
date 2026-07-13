/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Lenovo
 */
public class Pago {
    private Reserva reserva;
    private double monto;
    private String metodoPago;
    private String fecha;

    public Pago(Reserva reserva, double monto, String metodoPago, String fecha) {
        this.reserva = reserva;
        this.monto = monto;
        this.metodoPago = metodoPago;
        this.fecha = fecha;
       
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
   public boolean validacion (){
       return monto > 0;
   }
}

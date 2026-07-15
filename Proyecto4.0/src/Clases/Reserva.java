/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author np192
 */
public class Reserva {
    private String codigoReserva;
    private Cliente [] clientes;
    private int totalClientes;
    private PaqueteTuristico paquete;
    private int pasajerosAdultos;
    private int pasajerosMenores;
    private double descMenores;
    private double precioTotal;
    private String estadoReserva;
    private Pago [] pagos;
    private int totalPagos;

    public Reserva(String codigoReserva, PaqueteTuristico paquete, int pasajerosAdultos, 
                   int pasajerosMenores, double descMenores) {
        this.codigoReserva = codigoReserva;
        this.paquete = paquete;
        this.pasajerosAdultos = pasajerosAdultos;
        this.pasajerosMenores = pasajerosMenores;
        this.descMenores = descMenores;
        clientes = new Cliente[calcularPasajeros()];
        this.totalClientes = 0;
        pagos = new Pago[4];
        this.totalPagos = 0;
        cupo();
       
    }

    public String getCodigoReserva() {
        return codigoReserva;
    }

    public void setCodigoReserva(String codigoReserva) {
        this.codigoReserva = codigoReserva;
    }

    public Cliente[] getClientes() {
        return clientes;
    }

    public void setClientes(Cliente[] clientes) {
        this.clientes = clientes;
    }

    public int getTotalClientes() {
        return totalClientes;
    }

    public void setTotalClientes(int totalClientes) {
        this.totalClientes = totalClientes;
    }

    public PaqueteTuristico getPaquete() {
        return paquete;
    }

    public void setPaquete(PaqueteTuristico paquete) {
        this.paquete = paquete;
    }

    public int getPasajerosAdultos() {
        return pasajerosAdultos;
    }

    public void setPasajerosAdultos(int pasajerosAdultos) {
        this.pasajerosAdultos = pasajerosAdultos;
    }

    public int getPasajerosMenores() {
        return pasajerosMenores;
    }

    public void setPasajerosMenores(int pasajerosMenores) {
        this.pasajerosMenores = pasajerosMenores;
    }

    public double getDescMenores() {
        return descMenores;
    }

    public void setDescMenores(double descMenores) {
        this.descMenores = descMenores;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public String getEstadoReserva() {
        return estadoReserva;
    }

    public void setEstadoReserva(String estadoReserva) {
        this.estadoReserva = estadoReserva;
    }

    public Pago[] getPagos() {
        return pagos;
    }

    public void setPagos(Pago[] pagos) {
        this.pagos = pagos;
    }

    public int getTotalPagos() {
        return totalPagos;
    }

    public void setTotalPagos(int totalPagos) {
        this.totalPagos = totalPagos;
    }

    

   
    public int calcularPasajeros(){
        return pasajerosAdultos + pasajerosMenores;
    }
    public double calcularPrecioTotal(){
        double precioAdulto = paquete.getPrecioPorPersona();
        double precioMenores = precioAdulto - (precioAdulto * descMenores);
        return (precioAdulto * pasajerosAdultos) + (precioMenores * pasajerosMenores);
    }
    public boolean agregarClientes (Cliente c){
        if(totalClientes >= clientes.length){
            return false;
        }
        clientes[totalClientes] = c;
        totalClientes ++;
        return true;
    }
    private void cupo(){
        if(paquete.getCuposDisponibles() >= calcularPasajeros()){
            precioTotal = calcularPrecioTotal();
            estadoReserva = "Pendiente";
            paquete.setCuposDisponibles(paquete.getCuposDisponibles() - calcularPasajeros());
        }else{
            precioTotal = 0;
            estadoReserva = "Sin cupo";
        }
    }
    public boolean registro(){
        return estadoReserva.equals("Pendiente");
    }
    public boolean agregarPago(Pago p){
        if(totalPagos >= pagos.length){
            return false;
        }
        pagos[totalPagos] = p;
        totalPagos ++;
        confirmacion();
        return true;
    }
    public double pagoHecho(){
        double total = 0;
        for (int i = 0; i < totalPagos; i++) {
            total += pagos[i].getMonto();
        }
        return total;
    }
    public double saldoPendiente(){
        return precioTotal - pagoHecho();
    }
    private void confirmacion(){
        if(pagoHecho() >= precioTotal * 0.3){
            estadoReserva = "Confirmado";
        }
    }
}

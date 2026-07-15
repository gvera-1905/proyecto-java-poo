/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author np192
 */
public class PaqueteTuristico {
    private String codigo;
    private String nombre;
    private String destino;
    private int duracionDias;
    private String tipo; 
    private double precioPorPersona;
    private int cupoMaximo;
    private int cuposDisponibles;
    private String fechaSalida;   
    private String fechaRetorno; 
    private String estado; 

    public PaqueteTuristico(String codigo, String nombre, String destino, int duracionDias, 
                            String tipo, double precioPorPersona, int cupoMaximo, 
                            String fechaSalida, String fechaRetorno, String estado) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.destino = destino;
        this.duracionDias = duracionDias;
        this.tipo = tipo;
        this.precioPorPersona = precioPorPersona;
        this.cupoMaximo = cupoMaximo;
        this.cuposDisponibles = cupoMaximo; 
        this.fechaSalida = fechaSalida;     
        this.fechaRetorno = fechaRetorno;  
        this.estado = estado;
    }    

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getDuracionDias() {
        return duracionDias;
    }

    public void setDuracionDias(int duracionDias) {
        this.duracionDias = duracionDias;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecioPorPersona() {
        return precioPorPersona;
    }

    public void setPrecioPorPersona(double precioPorPersona) {
        this.precioPorPersona = precioPorPersona;
    }

    public int getCupoMaximo() {
        return cupoMaximo;
    }

    public void setCupoMaximo(int cupoMaximo) {
        this.cupoMaximo = cupoMaximo;
    }

    public int getCuposDisponibles() {
        return cuposDisponibles;
    }

    public void setCuposDisponibles(int cuposDisponibles) {
        this.cuposDisponibles = cuposDisponibles;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getFechaRetorno() {
        return fechaRetorno;
    }

    public void setFechaRetorno(String fechaRetorno) {
        this.fechaRetorno = fechaRetorno;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    private String serviciosIncluidos = "";
    private String itinerarioDias = "";

    public String getServiciosIncluidos() { return serviciosIncluidos; }
    public void setServiciosIncluidos(String serviciosIncluidos) { this.serviciosIncluidos = serviciosIncluidos; }
    public String getItinerarioDias() { return itinerarioDias; }
    public void setItinerarioDias(String itinerarioDias) { this.itinerarioDias = itinerarioDias; }
    
}
    

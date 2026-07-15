/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion;

import Clases.Reserva;
import Clases.Pago;
import Clases.PaqueteTuristico;
/**
 *
 * @author np192
 */
public class GestionReserva {
    
    private Reserva[] reservas;
    private int totalReservas;

    public GestionReserva() {
        reservas = new Reserva[100];
        totalReservas = 0;
        
       
    }

    public Reserva buscarPorCodigo(String codigo) {
        for (int i = 0; i < totalReservas; i++) {
            if (reservas[i].getCodigoReserva().equalsIgnoreCase(codigo)) {
                return reservas[i];
            }
        }
        return null;
    }

    public boolean registrar(Reserva re) {
        if (totalReservas == reservas.length) {
            return false;
        }
       
        
        if (buscarPorCodigo(re.getCodigoReserva()) != null) { 
            return false;
        }
        
        reservas[totalReservas] = re;
        totalReservas++;
        return true;
    }
    
    public boolean registrarNuevoPago(String codigoReserva, Pago nuevoPago) {
        // Buscamos la reserva
        Reserva res = buscarPorCodigo(codigoReserva);
        
        if (res != null) {
            
            return res.agregarPago(nuevoPago); 
        }
        
        return false;
    }

    public Reserva[] obtenerReservas() {
        return reservas;
    }

    public int obtenerTotalReservas() {
        return totalReservas;
    }
    
    public Reserva obtenerReserva(int index) {
        if (index >= 0 && index < totalReservas) {
            return reservas[index];
        }
        return null;
    }
}
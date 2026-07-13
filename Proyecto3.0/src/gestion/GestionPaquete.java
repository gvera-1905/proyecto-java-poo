/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion;

import Clases.PaqueteTuristico;

/**
 *
 * @author np192
 */
public class GestionPaquete {
    private PaqueteTuristico[] paquetes;
    private int totalPaquetes;

    public GestionPaquete() {
        paquetes = new PaqueteTuristico[50];
        totalPaquetes = 0;

        registrar(new PaqueteTuristico("P001", "Cusco", "Perú", 4, "Cultural", 450.00, 20, "15/08/2026", "19/08/2026", "Activo"));
        registrar(new PaqueteTuristico("P002", "Ica", "Perú", 3, "Relax", 320.00, 15, "10/09/2026", "13/09/2026", "Activo"));
    }

    public PaqueteTuristico buscarPorCodigo(String codigo) {
        for (int i = 0; i < totalPaquetes; i++) {
            if (paquetes[i].getCodigo().equalsIgnoreCase(codigo)) {
                return paquetes[i];
            }
        }
        return null;
    }

    public boolean registrar(PaqueteTuristico paquete) {
        if (totalPaquetes == paquetes.length){ 
            return false;
        }
        if (buscarPorCodigo(paquete.getCodigo()) != null){
            return false;
        }

        paquetes[totalPaquetes] = paquete;
        totalPaquetes++;
        return true;
    }

    public boolean actualizar(PaqueteTuristico paquete) {
        for (int i = 0; i < totalPaquetes; i++) {
            if (paquetes[i].getCodigo().equalsIgnoreCase(paquete.getCodigo())) {
                paquetes[i].setNombre(paquete.getNombre());
                paquetes[i].setDestino(paquete.getDestino());
                paquetes[i].setDuracionDias(paquete.getDuracionDias());
                paquetes[i].setTipo(paquete.getTipo());
                paquetes[i].setPrecioPorPersona(paquete.getPrecioPorPersona());
                paquetes[i].setCupoMaximo(paquete.getCupoMaximo());
                paquetes[i].setFechaSalida(paquete.getFechaSalida());   // Mapeo de actualización añadido
                paquetes[i].setFechaRetorno(paquete.getFechaRetorno()); // Mapeo de actualización añadido
                paquetes[i].setEstado(paquete.getEstado());
                return true;
            }
        }
        return false;
    }

    public boolean eliminar(String codigo) {
        for (int i = 0; i < totalPaquetes; i++) {
            if (paquetes[i].getCodigo().equalsIgnoreCase(codigo)) {
                for (int j = i; j < totalPaquetes - 1; j++) {
                    paquetes[j] = paquetes[j + 1];
                }
                paquetes[totalPaquetes - 1] = null;
                totalPaquetes--;
                return true;
            }
        }
        return false;
    }

    public PaqueteTuristico[] obtenerPaquetes() { return paquetes; }
    public int obtenerTotalPaquetes() { return totalPaquetes; }
    
    
    public PaqueteTuristico obtenerPaquete(int index) {
        if (index >= 0 && index < totalPaquetes) {
            return paquetes[index];
        }
        return null;
    }
    
}


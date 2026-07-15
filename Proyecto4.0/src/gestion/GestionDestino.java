/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion;

import Clases.DestinoTuristico;

/**
 *
 * @author np192
 */
public class GestionDestino {
    private DestinoTuristico[] destinos;
    private int totalDestinos;

    public GestionDestino() {
        destinos = new DestinoTuristico[30];
        totalDestinos = 0;
        
        registrar(new DestinoTuristico("Playa Maldivas", "Maldivas", "Male", "Hermosas playas con opcion a hospedarse en un maravilloso lugar acompañado de hermosas vistas", "Tropical", "Maldivo",""));
        registrar(new DestinoTuristico("Monterrey", "Mexico", "Monterrey", "Una agradable ciudad con un clima excelente para estas vacaciones", "Caluroso", "Español",""));
        registrar(new DestinoTuristico("Sao Paulo", "Brasil", "Sao Paulo", "Emblematica ciudad conocida por su extravagante carnaval, oportunidad perfecta pra disfrutarlo", "Tropical", "Portuguese",""));
    }
    
    public DestinoTuristico buscarPorNombre(String nombre) {
        for (int i = 0; i < totalDestinos; i++) {
            if (destinos[i].getNombre().equalsIgnoreCase(nombre)) {
                return destinos[i];
            }
        }
        return null;
    }

    public boolean registrar(DestinoTuristico destino) {
        if (totalDestinos == destinos.length) return false;
        if (buscarPorNombre(destino.getNombre()) != null) return false;

        destinos[totalDestinos] = destino;
        totalDestinos++;
        return true;
    }

    public boolean actualizar(DestinoTuristico destino) {
        for (int i = 0; i < totalDestinos; i++) {
            if (destinos[i].getNombre().equalsIgnoreCase(destino.getNombre())) {
                destinos[i].setPais(destino.getPais());
                destinos[i].setCiudad(destino.getCiudad());
                destinos[i].setDescripcion(destino.getDescripcion());
                destinos[i].setClima(destino.getClima());
                destinos[i].setIdiomaPrincipal(destino.getIdiomaPrincipal());
                destinos[i].setRutaImagen(destino.getRutaImagen());
                return true;
            }
        }
        return false;
    }

    public boolean eliminar(String nombre) {
        for (int i = 0; i < totalDestinos; i++) {
            if (destinos[i].getNombre().equalsIgnoreCase(nombre)) {
                for (int j = i; j < totalDestinos - 1; j++) {
                    destinos[j] = destinos[j + 1];
                }
                destinos[totalDestinos - 1] = null;
                totalDestinos--;
                return true;
            }
        }
        return false;
    }
      
    
    public int obtenerTotalDestinos() {
        return totalDestinos;
    }

    public DestinoTuristico obtenerDestino(int index) {
        if (index >= 0 && index < totalDestinos) {
            return destinos[index];
        }
        return null;
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion;
import Clases.Promocion;

/**
 *
 * @author CRISTOPHER
 */
public class GestionPromocion {
    private Promocion[] promociones;
    private int totalPromociones;

    public GestionPromocion() {
        promociones = new Promocion[100];
        totalPromociones = 0;
    }

    public int obtenerTotalPromociones() { 
        return totalPromociones; 
    }
    
    public Promocion obtenerPromocion(int index) {
        if (index >= 0 && index < totalPromociones) {
            return promociones[index];
        }
        return null;
    }

    public Promocion buscarPorPaquete(String codigoPaquete) {
        for (int i = 0; i < totalPromociones; i++) {
            if (promociones[i].getCodigoPaquete().equalsIgnoreCase(codigoPaquete)) {
                return promociones[i];
            }
        }
        return null;
    }

    public boolean registrar(Promocion promo) {
        if (totalPromociones == promociones.length) return false;
        if (buscarPorPaquete(promo.getCodigoPaquete()) != null) return false;

        promociones[totalPromociones] = promo;
        totalPromociones++;
        return true;
    }

    public boolean eliminar(String codigoPaquete) {
        for (int i = 0; i < totalPromociones; i++) {
            if (promociones[i].getCodigoPaquete().equalsIgnoreCase(codigoPaquete)) {
                for (int j = i; j < totalPromociones - 1; j++) {
                    promociones[j] = promociones[j + 1];
                }
                promociones[totalPromociones - 1] = null;
                totalPromociones--;
                return true;
            }
        }
        return false;
    }
}

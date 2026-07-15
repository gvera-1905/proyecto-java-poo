/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author np192
 */
public class Promocion {
    private String codigoPaquete;
    private String tipoDescuento;
    private double valorDescuento;
    private String periodoVigencia;

    public Promocion(String codigoPaquete, String tipoDescuento, double valorDescuento, String periodoVigencia) {
        this.codigoPaquete = codigoPaquete;
        this.tipoDescuento = tipoDescuento;
        this.valorDescuento = valorDescuento;
        this.periodoVigencia = periodoVigencia;
    }

    public String getCodigoPaquete() {
        return codigoPaquete;
    }

    public void setCodigoPaquete(String codigoPaquete) {
        this.codigoPaquete = codigoPaquete;
    }

    public String getTipoDescuento() {
        return tipoDescuento;
    }

    public void setTipoDescuento(String tipoDescuento) {
        this.tipoDescuento = tipoDescuento;
    }

    public double getValorDescuento() {
        return valorDescuento;
    }

    public void setValorDescuento(double valorDescuento) {
        this.valorDescuento = valorDescuento;
    }

    public String getPeriodoVigencia() {
        return periodoVigencia;
    }

    public void setPeriodoVigencia(String periodoVigencia) {
        this.periodoVigencia = periodoVigencia;
    }
}

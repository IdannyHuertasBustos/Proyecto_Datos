/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package una.cr.informatica.Proyecto_Fractales.Modelo;

/**
 *
 * @author Asus
 */
public class Rama {
    private int tamano;
    private int angulo;
    private int inclinacion;
    private Tronco tronco;

    public Rama(int tamano, int angulo, int inclinacion, Tronco tronco) {
        this.tamano = tamano;
        this.angulo = angulo;
        this.inclinacion = inclinacion;
        this.tronco = tronco;
    }

    public Rama() {
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public int getAngulo() {
        return angulo;
    }

    public void setAngulo(int angulo) {
        this.angulo = angulo;
    }

    public int getInclinacion() {
        return inclinacion;
    }

    public void setInclinacion(int inclinacion) {
        this.inclinacion = inclinacion;
    }

    public Tronco getTronco() {
        return tronco;
    }

    public void setTronco(Tronco tronco) {
        this.tronco = tronco;
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package una.cr.informatica.Proyecto_Fractales.Modelo;

/**
 *
 * @author Asus
 */
public class Nodo {
    private Rama rama;
    private Nodo izquierdo;
    private Nodo derecho;
    private int nivel;

    public Rama getRama() {
        return rama;
    }

    public void setRama(Rama rama) {
        this.rama = rama;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    public Nodo(Nodo padre){
        int posx = padre.getRama().getTronco().getX();
        int posy = padre.getRama().getTronco().getY();
        int dif = posx - posy;
        double x = (double) (dif * 0.40);
        
    }
    public Nodo(Rama rama, Nodo izquierdo, Nodo derecho, int nivel) {
        this.rama = rama;
        this.izquierdo = izquierdo;
        this.derecho = derecho;
        this.nivel = nivel;
    }
    public Nodo() {
        this.rama = new Rama();
    }

    public Nodo(Rama tronco, Nodo izquierdo, Nodo derecho) {
        this.rama = tronco;
        this.izquierdo = izquierdo;
        this.derecho = derecho;
    }
    public Nodo getIzquierdo() {
        return izquierdo;
    }

    public void setIzquierdo(Nodo izquierdo) {
        this.izquierdo = izquierdo;
    }

    public Nodo getDerecho() {
        return derecho;
    }

    public void setDerecho(Nodo derecho) {
        this.derecho = derecho;
    }
}

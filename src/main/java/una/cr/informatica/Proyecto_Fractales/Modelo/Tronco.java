/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package una.cr.informatica.Proyecto_Fractales.Modelo;

/**
 *
 * @author Asus
 */
public class Tronco {

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }
    private int x;
    private int y;
    private int x1;
    private int y2;

    public Tronco(int x, int y,int x1, int y2) {
        this.x = x;
        this.y = y;
        this.x1= x1;
        this.y2=y2;
    }

    public Tronco() {
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
}

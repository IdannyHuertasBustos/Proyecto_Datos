/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package una.cr.informatica.Proyecto_Fractales.Modelo;

/**
 *
 * @author Asus
 */
public class Arbol {
    private Nodo primero;

    public Arbol(Nodo primero) {
        this.primero = primero;
    }

    public Arbol() {
        insertar(new Nodo(new Rama(0,0,0,new Tronco(700,500,700,500)),null,null));
    }

    public Nodo getPrimero() {
        return primero;
    }

    public void setPrimero(Nodo primero) {
        this.primero = primero;
    }
    public void insertar(Nodo nuevaRama){
        if(this.primero == null){
            this.primero = nuevaRama;
        }
//        else
//            insertar(nuevaRama,this.primero);
    }
    public void insertar(int cantRamas,int nivel,Nodo raiz){
        if(cantRamas > 0)
            raiz.setDerecho(new Nodo());
            raiz.setIzquierdo(raiz);
            insertar(cantRamas--,nivel++,raiz.getIzquierdo());
            insertar(cantRamas--,nivel++,raiz.getDerecho());
    }
//    public void insertar(Nodo nuevaRama,Nodo root){
//        if(root == null)
//            root = nuevaRama;
//        else{
//            if(root.getIzquierdo() == null){
//                root.setIzquierdo(nuevaRama);
//            }
//            else{
//                if(root.getDerecho() == null){
//                    root.setDerecho(nuevaRama);
//                }
//                else{
//                    insertar(nuevaRama,root.getIzquierdo().getIzquierdo());
//                }
//            }
//        }
//    }
}

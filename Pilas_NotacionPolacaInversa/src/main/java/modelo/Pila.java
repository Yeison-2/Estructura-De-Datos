/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Yeison Romero
 */
public class Pila {
    private Nodo cima;
    
    public Pila (){
        this.cima = null;
    }
    
    
    public void apilar(int dato){
        Nodo nuevoNodo= new Nodo(dato);
        nuevoNodo.siguiente = cima;
        cima= nuevoNodo;
    }
    
    public int desapilar(){
        if (esVacia()) {
            throw new RuntimeException("La pila está vacía");
        }

        int dato = cima.dato;
        cima = cima.siguiente;
        return dato;
    }
    
    public boolean esVacia(){
        return cima == null;
    }
}

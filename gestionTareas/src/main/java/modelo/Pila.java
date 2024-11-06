/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author programador
 */
public class Pila {
    Nodo cima;
    public Pila() {
        this.cima = cima;
    }
    public void apilar(String descripcion, int nivel) {
        Nodo nuevoNodo = new Nodo(descripcion, nivel);
        nuevoNodo.siguiente = cima;
        cima = nuevoNodo;
    }
    public Nodo desapilar(){
        if (esVacia()) {
            return null;
        } 
        Nodo tarea = cima;
        cima =cima.siguiente;
        return tarea; 
    }
    public boolean esVacia(){
        return cima == null;
    }
    public void mostrar() {
        Nodo actual = cima;
        while (actual != null) {
            System.out.println(actual.getDescripcion());
            actual = actual.getSiguiente();
        }
    }
}

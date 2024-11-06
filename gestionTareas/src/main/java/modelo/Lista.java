/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author programador
 */
public class Lista {
    Nodo cabeza;
    public Lista() {
        this.cabeza = null;
    }
    public void agregarTareaLista(String descripcion, int nivel) {
        Nodo nuevoNodo = new Nodo(descripcion, nivel);

        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            Nodo actual = cabeza;
            while (actual.siguiente == null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevoNodo;
        }
    }
    
    
    public Nodo getCabeza() {
        return cabeza;
    }
}

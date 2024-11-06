/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author programador
 */
public class Cola {
    private Nodo frente;
    private Nodo fondo;

    public Cola() {
        this.frente = null;
        this.fondo = null;
    }

    public void encolar(String descripcion, int nivel) {
        Nodo nuevoNodo = n
        if (fondo == null) {
            frente = fondo = nuevoNodo;
        } else {
            fondo.setSiguiente(nuevoNodo);
            fondo = nuevoNodo;
        }
    }

    public Tarea desencolar() {
        if (frente == null) {
            return null;
        }
        Tarea tarea = frente.getTarea();
        frente = frente.getSiguiente();
        if (frente == null) {
            fondo = null;
        }
        return tarea;
    }

    public void mostrar() {
        Nodo actual = frente;
        while (actual != null) {
            System.out.println(actual.getTarea().getDescripcion());
            actual = actual.getSiguiente();
        }
    }

}

/**
 * Universidad juan de castellanos
 * Asignatura: Estructura de Datos
 * Descripción:
 * Fecha: //
 * Autor: Yeison Stiven Romero Salinas
 */

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Yeison Romero Salinas
 */
// variable generica
public class lista_Enlazada<T> {

    private Nodo<T> cabeza;
    private Nodo<T> cola;
    private int tamano;

    public lista_Enlazada() {
        this.cabeza = null;
        this.cola = null;
        this.tamano = 0;
    }

    public void agregarAlFinal(T dato) {
        Nodo<T> nuevoNodo = new Nodo<>(dato);
        if (cabeza == null) {
            cabeza = cola = nuevoNodo;

        } else {
            cola.siguiente = nuevoNodo;
            nuevoNodo.anterior = cola;
            cola = nuevoNodo;

        }
        tamano++;
    }

    public void agregarAlInicio(T dato) {
        Nodo<T> actual = cabeza;
        Nodo<T> nuevoNodo = new Nodo<>(dato);

        if (cabeza == null) {
            cabeza = cola = nuevoNodo;
        } else {
            nuevoNodo.siguiente = cabeza;
            cabeza.anterior = nuevoNodo;
            cabeza = nuevoNodo;
        }
        tamano++;
    }

    public void eliminar(T dato) {
        Nodo<T> actual = cabeza;
        Nodo<T> anterior = null;
        while (actual != null) {
            if (actual.dato.equals(dato)) {
                if (actual.anterior == null) {
                    cabeza = actual.siguiente;
                    if (cabeza != null) {
                        cabeza.anterior = null;
                    } else if (actual.siguiente == null) {
                        cola = actual.anterior;
                        cola.siguiente = null;
                    } else {
                        actual.anterior.siguiente = actual.siguiente;
                        actual.siguiente.anterior = actual.anterior;
                    }
                    tamano--;
                    return;
                }
                actual = actual.siguiente;

            }

        }
    }

    public boolean buscar(T dato) {
        Nodo<T> actual = cabeza;
        while (actual != null) {
            if (actual.dato.equals(dato)) {
                return true;
            } else {
                actual = actual.siguiente;

            }

        }
        return false;
    }

    public void invertir() {
    Nodo<T> actual = cabeza;
    Nodo<T> temp = null;


    while (actual != null) {
        temp = actual.anterior;
        actual.anterior = actual.siguiente;
        actual.siguiente = temp;
        actual = actual.anterior;
    }


    if (temp != null) {
        cabeza = temp.anterior;
    }
}
    
    

}

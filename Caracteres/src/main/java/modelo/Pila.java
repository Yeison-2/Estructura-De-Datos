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
public class Pila {

    private Nodo cima;

    public Pila() {
        this.cima = null;
    }

    //ingreses pila
    public void apilar(char valor) {
        Nodo nuevoNodo = new Nodo(valor);
        nuevoNodo.siguiente = cima;

        cima = nuevoNodo;
    }

    //metodo desapilar
    public char desapilar() {
        if (esVacia()) {
            System.out.println("la pila esta vacia");
        }
        char valor = cima.dato;
        cima = cima.siguiente;
        return valor;
    }

    public char verCima() {
        if (esVacia()) {
            System.out.println("la pila esta vacia");

        }
        return cima.dato;
    }

    public boolean esVacia() {
        return cima == null;
    }

}

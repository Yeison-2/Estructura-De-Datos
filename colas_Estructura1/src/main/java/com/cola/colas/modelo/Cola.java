/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cola.colas.modelo;

/**
 *
 * @author programador
 */
public class Cola {
    private Nodo frente;
    private Nodo fondo;

    public Cola(){
        this.frente = null;
        this.fondo = null;

    }

    public boolean esVacia(){
        return this.frente == null;
    }

    public void encolar(int dato){
        Nodo nuevoNodo = new Nodo(dato);
        if (esVacia()) {
            frente = fondo = nuevoNodo;
            fondo = nuevoNodo;
            
        }
    }
    
    public int desencolar(){
        if (esVacia()) {
            System.out.println("La cola esta vacia");
            return -1;
        } else {
            int dato = frente.dato;
            if (frente == null) {
                fondo = null;
                
            }
            return dato;
        }

    }

    public void mostraCola(){
        if(esVacia()){
            System.out.println("la cola esta vacia");
            return;
        }
        Nodo actual = frente;
        while(actual != null){
            System.out.println(actual.dato+ " ");
            actual = actual.siguiente;
        }
        System.out.println();
    }
        
}

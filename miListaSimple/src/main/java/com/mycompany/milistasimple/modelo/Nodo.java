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

package com.mycompany.milistasimple.modelo;

/**
 *
 * @author Yeison Romero Salinas
 */
public class Nodo {
    int dato;
    Nodo siguiente;
    
    public Nodo(int dato){
        this.dato = dato;
        this.siguiente = null;
    }
    
    public int getDato(){
        return dato;
    }
    
    public void setDato(int dato){
        this.dato =dato;
    }
    
    public Nodo getSiguiente(){
        return siguiente;
    }
    
    public void setSiguiente(Nodo siguiente){
        this.siguiente = siguiente;
    }
}

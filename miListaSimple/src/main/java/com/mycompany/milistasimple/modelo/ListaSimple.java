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
public class ListaSimple {
    private Nodo cabeza;
   
    public ListaSimple(){
        this.cabeza = null;
    }
    
    public void agregar(int dato){
        Nodo nuevoNodo = new Nodo(dato);
        if (cabeza == null){
            cabeza = nuevoNodo;
        } else {
            Nodo temp = cabeza;
            while(temp.getSiguiente() != null){
                temp = temp.getSiguiente();
            }
            
            temp.setSiguiente(nuevoNodo);
        }
        
    }
    
    public void Eliminar(){
        if (cabeza != null) {
            cabeza = cabeza.getSiguiente();
        }else {
            System.out.println("Lista vacia");
            
        }
    }
    
    public Nodo getCabeza(){
        return cabeza;
    }
}

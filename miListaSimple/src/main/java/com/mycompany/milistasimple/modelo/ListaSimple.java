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
    private int tamano;
   
    public ListaSimple(){
        this.cabeza = null;
        this.tamano = 0;
    }
    
    public void agregar(int dato){
        Nodo nuevoNodo = new Nodo(dato);
        if (cabeza == null){
            cabeza = nuevoNodo;
        } else {
            Nodo temp = cabeza;
            while(temp.getSiguiente() != null){
                temp = temp.getSiguiente();
                tamano++;
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
    
    public int buscar(int dato){
        Nodo actual = cabeza;
        while(actual.getSiguiente() != null ){
            if (actual.getDato() == dato) {
                return actual.getDato();
            }
            actual = actual.getSiguiente();
        }
        return -1;
    }
    
    public void eliminarUltimo(){
        if(cabeza != null){
            if (tamano ==1) {
                cabeza = null;
   
            }else{
                Nodo temp = cabeza;
                for (int i = 0; i < tamano -1; i++) {
                    temp = temp.getSiguiente();
                }
                temp.setSiguiente(null);
                
            }
        }
    }
    
    public Nodo getCabeza(){
        return cabeza;
    }
}

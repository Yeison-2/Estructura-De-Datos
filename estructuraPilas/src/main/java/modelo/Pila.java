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

//Pila nodo 
public class Pila {
    Nodo cima;
    int size;
    
    public Pila(){
        this.cima= null;
        this.size =0;
    }
    
    public boolean pilaVacia(){
        return cima == null;
    }
    
    
    
    // metodo para ingresar nodos a la pila
    
    public void apilar(int dato){
        Nodo nuevoNodo = new Nodo(dato);
        if(pilaVacia()){
            cima = nuevoNodo;
        } else {
            nuevoNodo.siguiente = cima;
            cima = nuevoNodo;
        }
        size++;
    }
    
    public int desaPilar(){
        if(pilaVacia()){
            throw new RuntimeException("La pila esta vacia");
            
        } else {
            int dato = cima.dato;
            cima = cima.siguiente;
            return dato;
        }
    }
    
    // metodo para imprimir la pila
    
    public void mostrarPila(){
        if (pilaVacia()) {
            System.out.println("La pila esta vacia");
            
        } else {
            Nodo actual = cima;
            while(actual != null){
                System.out.println(actual.dato);
                actual= actual.siguiente;
            }
        }
    }
    
    
    // mostrar el cima de la pila
    public int ultimoAgregado(){
        if (pilaVacia()) {
            throw new RuntimeException("La pila esta vacia");
        } else {
            return cima.dato;
        }
    }
    
    
    
    
    
    
}

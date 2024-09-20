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
public class Modelo_ListaCircularDoble {
    private Nodo cabeza;
    private Nodo cola;
    
    public Modelo_ListaCircularDoble(){
        this.cabeza = null;
        this.cola = null;
    }
    
    //metodo para verificar si la lista esta vacia
    public boolean esVacia(){
        return cabeza == null;
    }
    
    //metodo para agregar al inicio de la lsita
    public void agregarInicio(int dato){
        Nodo nuevoNodo = new Nodo(dato);
        if(esVacia()){
            //si cabeza es nula se agrega al inicio y apunta a si mismo por solo tener un solo dato
            cabeza = nuevoNodo;
            cola = nuevoNodo;
            cabeza.siguiente = nuevoNodo;
            cola.anterior = nuevoNodo;
        }else {
            //se agrega al inicio
            cabeza.anterior = nuevoNodo;
            nuevoNodo.siguiente = cabeza;
            cabeza.siguiente = cabeza;
            cola.siguiente = cabeza;
        }
        
    }
    
    public void agregarFinal(int dato){
        Nodo nuevoNodo = new Nodo(dato);
        if(!!esVacia()){
            cabeza = nuevoNodo;
            cola = nuevoNodo;
            cabeza.siguiente = nuevoNodo;
            cola.siguiente = nuevoNodo;
            
        }else {
            cola.siguiente = nuevoNodo;
            nuevoNodo.anterior =cola;
            nuevoNodo = cola;
            cola.siguiente= cabeza;
        }
    }
    
    
    public void mostrarCabezaCola(){
        Nodo actual = cabeza;
        
        if(!esVacia()){
            do {  
                System.out.println(actual.dato+"");
                actual= actual.siguiente;
            } while (actual != cabeza);
            System.out.println();
        }
    }
    public void mostrarColaCabeza(){
        Nodo actual = cola;
        
        if(!esVacia()){
            do {  
                System.out.println(actual.dato+"");
                actual= actual.anterior;
            } while (actual != cola);
            System.out.println();
        }
    }
}

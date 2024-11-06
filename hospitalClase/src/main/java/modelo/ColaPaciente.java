/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author programador
 */
public class ColaPaciente {
    private Nodo primero,ultimo;
    
    public ColaPaciente(){
        this.primero = null;
        this.ultimo = null;
        
        
    }
    
    public void esvacia(){
        
    }
    
    public void encolarPaciente(String nombre, int nivel){
        Nodo nuevoNodo = new Nodo(nombre, nivel);
        
        if(ultimo == null){
            primero = ultimo = nuevoNodo;
        }else {
            ultimo.siguiente = nuevoNodo;
            ultimo = nuevoNodo;
        }
    }
    
    public Nodo desencolarPaciente(){
        if (ultimo == null) {
            return null;
        }
        Nodo auxiliar = primero;
        
        if (primero == null) {
            ultimo = null;
        }
        return auxiliar;
    }
    
    public Nodo verPrimero(){
        return primero;
    }
    
    public boolean esVacia(){
        return primero == null;
    }
    
    public int contarCola(){
        int contador = 0;
        Nodo auxiliar = primero;
        while(auxiliar != null){
            contador++;
            auxiliar = auxiliar.siguiente;
        }
        return contador;
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author programador
 */
public class Nodo {
    String nombre;
    int nivel;
    Nodo siguiente;
    
    public Nodo (String nombre, int nivel){
        this.nivel = nivel;
        this.nombre = nombre;
        this.siguiente = null;
    }
    
    
}

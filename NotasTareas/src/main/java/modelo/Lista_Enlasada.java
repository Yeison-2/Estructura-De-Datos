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
public class Lista_Enlasada {
    private Tarea cabeza;
    
    public Lista_Enlasada(){
        this.cabeza = null;
    }
    
    public void anadirTarea(Tarea tarea){
        if( cabeza == null){
            cabeza = tarea;
        } else {
            Tarea actual = cabeza;
            
            while(actual.getSiguiente() != null){
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(tarea);
        }
    }
    
    public Tarea getCabeza(){
        return cabeza;
    }
}

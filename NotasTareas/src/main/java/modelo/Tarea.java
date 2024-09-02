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
public abstract class Tarea {
    protected String nombre;
    protected String descripcion;
    protected Tarea siguiente;
    
    
    public Tarea(String nombre, String descripcion){
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.siguiente = null;
    }
    
    public abstract String obtenerTipoTarea();
    
    public String getNombre(){
        return nombre;
    }
    
    public String getDescripcion(){
        return descripcion;
    }
    
    public Tarea getSiguiente(){
        return siguiente;
    }
    
    public void setSiguiente(Tarea siguiente){
        this.siguiente = siguiente;
    }
    
}

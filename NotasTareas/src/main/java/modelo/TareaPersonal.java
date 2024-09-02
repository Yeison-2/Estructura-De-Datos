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
public class TareaPersonal extends Tarea implements Prioridad{
    private int prioridad;
    
    public TareaPersonal(String nombre, String descripcion){
        super(nombre,descripcion);
        this.prioridad = 0;
    }
    
    @Override 
    public void establecerPrioridad(int prioridad){
        this.prioridad = prioridad;
    }
    
    @Override
    public int obtenerPrioridad(){
        return prioridad;
    }

    @Override
    public String obtenerTipoTarea(){
        return "Tarea terminada";
    }

    
    

    
    
        
    
    
    
    
    
    
}

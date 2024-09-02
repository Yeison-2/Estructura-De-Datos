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
public class Tarea_Trabajo extends Tarea implements Prioridad {
    private int prioridad;
    private String proyectoAsosiado;
    
    public Tarea_Trabajo(String nombre, String descripcion, String ProyectoAsociado){
        super(nombre,descripcion);
        this.proyectoAsosiado = ProyectoAsociado;
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
        return "Tarea de trabajo: "+proyectoAsosiado;
    }
    
}

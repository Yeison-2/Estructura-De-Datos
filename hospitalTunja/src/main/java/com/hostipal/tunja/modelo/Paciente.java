/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hostipal.tunja.modelo;

/**
 *
 * @author programador
 */
public class Paciente {
     String nombre;
     int prioridad;
     Paciente siguiente;

    public Paciente(String nombre, int prioridad){
        this.nombre = nombre;
        this.prioridad = prioridad;
        this.siguiente = null;
    }
    
    public int getPrioridad(){
        return prioridad;
    }


}

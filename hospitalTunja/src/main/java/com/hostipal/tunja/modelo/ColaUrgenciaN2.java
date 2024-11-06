/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hostipal.tunja.modelo;

/**
 *
 * @author programador
 */
public class ColaUrgenciaN2 {
   private Paciente frente;
    private Paciente fondo;
    private int tamano;
    

    public ColaUrgenciaN2(){
        this.frente = null;
        this.fondo = null;
        this.tamano = 0;

    }
    public boolean esVacia() {
        return this.frente == null;
    }

    public void encolarPaciente(Paciente paciente) {
        if (esVacia()) {
            frente = fondo = paciente;
            
        } else {
            fondo.siguiente = paciente;
            fondo = paciente;
            
        }
        tamano++;
    }

    public Paciente desencolarPaciente() {
        if (esVacia()) {
            System.out.println("La cola está vacía");
            return null;
        } else {
            Paciente paciente = frente;
            frente = frente.siguiente;
            if (frente == null) {
                fondo = null;
            }
            tamano--;
            return paciente;
            
        }
    }

    public void mostrarCola() {
        if (esVacia()) {
            System.out.println("La cola está vacía");
            return;
        }
        Paciente actual = frente;
        while (actual != null) {
            System.out.println(actual.nombre + " ");
            actual = actual.siguiente;
        }
        System.out.println();
    }
    
    public int tamanoCola(){
        return tamano;
    }
}

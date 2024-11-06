/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hostipal.tunja.controlador;

import com.hostipal.tunja.modelo.ColaEmergenciaN1;
import com.hostipal.tunja.modelo.ColaNoUrgenteN3;
import com.hostipal.tunja.modelo.ColaUrgenciaN2;
import com.hostipal.tunja.modelo.Paciente;

/**
 *
 * @author programador
 */
public class Controlador_GestionColas {

    private ColaEmergenciaN1 colaEmergenciaN1;
    private ColaUrgenciaN2 colaUrgenciaN2;
    private ColaNoUrgenteN3 colaNoUrgenteN3;

    public Controlador_GestionColas(ColaEmergenciaN1 colaEmergenciaN1, ColaUrgenciaN2 colaUrgenciaN2, ColaNoUrgenteN3 colaNoUrgenteN3) {
        this.colaEmergenciaN1 = colaEmergenciaN1;
        this.colaUrgenciaN2 = colaUrgenciaN2;
        this.colaNoUrgenteN3 = colaNoUrgenteN3;
    }

    public void agregarPaciente(Paciente paciente){

        switch (paciente.getPrioridad()){
            case 1:
                colaEmergenciaN1.encolarPaciente(paciente);
                break;
            case 2:
                colaUrgenciaN2.encolarPaciente(paciente);
                break;
            case 3:
                colaNoUrgenteN3.encolarPaciente(paciente);
                break;
            default:
                System.out.println("Prioridad no establecida");

        }


    }

    public Paciente obtenerSiguientePaciente(){
        if (!colaEmergenciaN1.esVacia()){
            return colaEmergenciaN1.desencolarPaciente();
        } else if (!colaUrgenciaN2.esVacia()){
            return colaUrgenciaN2.desencolarPaciente();
        } else {
            return colaNoUrgenteN3.desencolarPaciente();
        }
    }
    
    
    public String generarInforme(){
        return "Pacientes en cola de Emergencias: " + colaEmergenciaN1.tamanoCola() + "\n" +
               "Pacientes en cola de Urgencias: " + colaUrgenciaN2.tamanoCola() + "\n" +
               "Pacientes en cola No Urgentes: " + colaNoUrgenteN3.tamanoCola();
    }
    
    
    
    
    
}

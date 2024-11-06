/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.ColaPaciente;

/**
 *
 * @author programador
 */
public class ControladorHospital {

    private ColaPaciente colaEmergencia, colaUrgencias, colaNoUrgente;

    public ControladorHospital() {
        colaEmergencia = new ColaPaciente();
        colaUrgencias = new ColaPaciente();
        colaNoUrgente = new ColaPaciente();

    }

    public void registrarPaciente(String nombre, int nivel) {
        switch (nivel) {
            case 1:
                colaEmergencia.encolarPaciente(nombre, nivel);
                System.out.println("Paciente" + nombre + " redistador en emergencias");
                break;
            case 2:
                colaUrgencias.encolarPaciente(nombre, nivel);
                System.out.println("Paciente" + nombre + " registrador en urgencias");
                break;
            case 3:
                colaNoUrgente.encolarPaciente(nombre, nivel);
                System.out.println("Paciente" + nombre + " registrado en no urgenete");
                break;
            default:
                System.out.println("opcion invalida");
        }
    }
    
    public Nodo pacienteSiguiente(){
        
    }
}

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

package controlador;

import modelo.Alumno;
import modelo.Lista_Doble;
import modelo.Lista_Numeros;
import vista.Vista_AmigoSecreto;

/**
 *
 * @author Yeison Romero Salinas
 */
public class Controlador_AmigoSecreto {
    private Lista_Numeros listaNumeros;
    private  Vista_AmigoSecreto view;
    private Lista_Doble listaDouble;
    public Controlador_AmigoSecreto(Lista_Numeros listaNumeros, Vista_AmigoSecreto view, Lista_Doble listaDoble){
        this.listaNumeros = listaNumeros;
        this.listaDouble = listaDoble;
        this.view = view;
    }
    
    
    public void iniciar(){
        
        

        //asignar numero a cada persona
        
        Alumno actual = listaDouble.obtenerCabeza();
        while(actual != null){
            int numeroAsignado = listaNumeros.sacarAleatorio();
            actual.setNumeroAsignado(numeroAsignado);
            view.mostrarAsignacion(actual.getNombre(), actual.getNumeroAsignado());
            actual= actual.getSiguiente();
        }
        
        actual = listaDouble.obtenerCabeza();
        while(actual != null){
            Alumno amigoSecreto = listaDouble.obtenerAlumnoPosicion(actual.getNumeroAsignado());
            actual = actual.getSiguiente();
        }
        
        
    }
    
    
}

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

package vista;

import modelo.Lista_Doble;

/**
 *
 * @author Yeison Romero Salinas
 */
public class Vista_AmigoSecreto {
    public void mostraListaAlumnos(Lista_Doble listaAlumnos){
        System.out.println("Listado de Alumnos");
        listaAlumnos.mostraLista();
        
    }
    
    public void mostrarAsignacion(String nombre, int numeroAsignado){
        System.out.println(nombre+" Su numero asignado es: "+numeroAsignado);
        
    }
    
    public void mostraAsignacion(){
        
    }
}

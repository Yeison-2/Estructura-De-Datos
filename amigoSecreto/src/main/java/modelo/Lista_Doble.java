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
public class Lista_Doble {
    private Alumno cabeza;
    private Alumno cola;
    
    public Lista_Doble (){
        this.cabeza = null;
        this.cola = null;
    }
    
    public void agregarAlumno(String nombre){
        Alumno nuevo = new Alumno(nombre);
        if (cabeza == null) {
            cabeza= nuevo;
        }else{
            cola.setSiguiente(nuevo);
            nuevo.setAnterior(nuevo);
            cola = nuevo;
        }
    }
    
    public Alumno obtenerCabeza(){
        return cabeza;
    }
    
    public Alumno obtenerAlumnoPosicion(int posicion){
        Alumno actual = cabeza;
        int index = 1;
        while(actual != null && index <posicion){
            actual = actual.getSiguiente();
            index++;
        }
        return actual; 
    }
    
    
    public void mostraLista(){
        Alumno actual = cabeza;
        
        while(actual != null){
            System.out.print(actual.getNombre());
            actual.getSiguiente();
        }
    }
}

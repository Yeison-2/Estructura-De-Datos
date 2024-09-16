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
public class Modelo_Lista_CircularSimple {

    Nodo cabeza = null;
    Nodo cola = null;

    /*metodo para agregar un jugador al final de la lista*/
    public void agregarJugador(String nombre) {
        Nodo nuevo = new Nodo(nombre);
        if (cabeza == null) {
            cabeza = nuevo;
            cola = nuevo;

            nuevo.siguiente = cabeza;// asigna el apuntador a siguiente

        } else {
            cola.siguiente = nuevo;
            nuevo.siguiente = cabeza;
            cola = nuevo;
        }

    }

    public String mostrarJugadores() {
        if (cabeza == null) {
            return "La lista no tiene ningun jugador";
        } 
            StringBuilder resultado = new StringBuilder();// que crea esto?
            Nodo actual = cabeza;
            do {        
                resultado.append(actual.nombre).append("->");
                actual = actual.siguiente;
                
                
            } while (actual!= cabeza);
            
            resultado.append("volver al principio");
            return resultado.toString();
        
    }
    
    public boolean eliminarJugador(String nombre){
        if(cabeza == null){
            return false;
        }else{
            Nodo actual = cabeza;
            Nodo anterior = cola;
            do{
                if(actual.nombre.equals(nombre)){
                    if(actual == cabeza){
                        cabeza = cabeza.siguiente;
                        cola.siguiente = cabeza;
                    }else if(actual == cola){
                        anterior.siguiente = cabeza;
                        cola = anterior;
                    }else{
                        anterior.siguiente = actual.siguiente;
                    }
                    return true;
                }
                anterior = actual;
                actual = actual.siguiente;
            }while(actual != cabeza);
            return false;
        }
    }
    
    /*Hace el movimiento del jugador primero pasa al final  despues de jugar*/
    public String jugar(){
        if(cabeza == null){
            return "La lista esta vacia";
        }else {
            String jugadorActual = cabeza.nombre;
            cabeza = cabeza.siguiente;
            cola = cola.siguiente;
            return "Turno de jugador "+jugadorActual;
        }
    }
}

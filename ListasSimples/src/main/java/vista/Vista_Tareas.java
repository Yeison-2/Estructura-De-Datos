/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import modelo.Nodo;

/**
 *
 * @author programador
 */
public class Vista_Tareas {
    
    public void mostraLista(Nodo cabeza) {
        Nodo temp = cabeza;
        while (temp != null) {
            System.out.print(temp. + " -> ");
            temp = temp.getSiguiente();
        }
        System.out.println("null");
    }
    
    public void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }
}

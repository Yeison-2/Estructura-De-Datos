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
package com.mycompany.milistasimple.vista;

import com.mycompany.milistasimple.modelo.Nodo;

/**
 *
 * @author Yeison Romero Salinas
 */
public class Vista_VistaUsuario {

    public void mostraLista(Nodo cabeza) {
        Nodo temp = cabeza;
        while (temp != null) {
            System.out.print(temp.getDato() + " -> ");
            temp = temp.getSiguiente();
        }
        System.out.println("null");
    }
    
    public void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }

}

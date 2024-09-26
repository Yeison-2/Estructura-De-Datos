/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estructurapilas;

import controlador.Controlador_Pila;
import modelo.Pila;
import vista.Vista_Pila;

/**
 *
 * @author Yeison Romero Salinas
 */
public class EstructuraPilas {

    public static void main(String[] args) {
        Pila model = new Pila();
        Vista_Pila view = new Vista_Pila();
        Controlador_Pila ctrl = new Controlador_Pila(model, view);
        
        ctrl.iniciar();
    }
}

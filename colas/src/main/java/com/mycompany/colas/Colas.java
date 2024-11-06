/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.colas;

import controlador.Controlador;
import modelo.Cola;
import vista.Vista;

/**
 *
 * @author programador
 */
public class Colas {

    public static void main(String[] args) {
        Cola cola = new Cola();
        Vista view = new Vista();
        Controlador ctrl = new Controlador(cola, view);
        ctrl.iniciar();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.cola.colas;

import com.cola.colas.controlador.Controlador_Colas;
import com.cola.colas.modelo.Cola;
import com.cola.colas.vista.Vista_Colas;

/**
 *
 * @author programador
 */
public class Colas_Estructura1 {

    public static void main(String[] args) {
        Cola cola = new Cola();
        Vista_Colas view = new Vista_Colas();
        Controlador_Colas ctrl = new Controlador_Colas(cola, view);
        view.miMenu();
        
    }
}

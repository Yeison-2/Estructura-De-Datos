/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arbolbinario01;

import controlador.Controlador_ArbolBinario;
import vista.Vista;
import modelo.ArbolBinario;

/**
 *
 * @author programador
 */
public class ArbolBinario01 {

    public static void main(String[] args) {
        ArbolBinario model = new ArbolBinario();
        Vista view = new Vista();
        
        Controlador_ArbolBinario ctrl = new Controlador_ArbolBinario(model, view);
        ctrl.agregar(27);
        ctrl.agregar(14);
        ctrl.agregar(7);
        ctrl.agregar(11);
        ctrl.agregar(47);
        ctrl.agregar(32);
        ctrl.agregar(59);
        
        ctrl.mostrar();
    }
}

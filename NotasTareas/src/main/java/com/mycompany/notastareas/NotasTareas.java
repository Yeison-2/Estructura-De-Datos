/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.notastareas;

import controlador.Controlador_ListaTareas;
import modelo.Lista_Enlasada;
import vista.Vista_NewTarea;

/**
 *
 * @author Yeison Romero Salinas
 */
public class NotasTareas {

    public static void main(String[] args) {
        Lista_Enlasada model = new Lista_Enlasada();
        Vista_NewTarea view = new Vista_NewTarea();
        Controlador_ListaTareas ctrl = new Controlador_ListaTareas(model, view);
        
        ctrl.iniciar();
    }
}

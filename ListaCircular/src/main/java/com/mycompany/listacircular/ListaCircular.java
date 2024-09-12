/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.listacircular;

import controlador.Controlador_ListaCircular;
import modelo.Modelo_ListaCircular;
import vista.Vista_ListaCircular;

/**
 *
 * @author Yeison Romero Salinas
 */
public class ListaCircular {

    public static void main(String[] args) {
        Modelo_ListaCircular model = new Modelo_ListaCircular();
        Vista_ListaCircular view = new Vista_ListaCircular();
        Controlador_ListaCircular ctrl = new Controlador_ListaCircular(model, view);
        ctrl.iniciar();
                
    }
}

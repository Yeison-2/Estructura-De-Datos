/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clase19_09_2024;

import controlador.Controlador_ListaCircularDoble;
import modelo.Modelo_ListaCircularDoble;
import vista.Vista_ListaCircularDoble;

/**
 *
 * @author Yeison Romero Salinas
 */
public class Clase19_09_2024 {

    public static void main(String[] args) {
        Modelo_ListaCircularDoble model = new Modelo_ListaCircularDoble();
        Vista_ListaCircularDoble view = new Vista_ListaCircularDoble();
        Controlador_ListaCircularDoble ctrl = new Controlador_ListaCircularDoble(model, view);
        
        ctrl.iniciar();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cprincipal;

import controlador.Controlador_Juego;
import modelo.Modelo_Lista_CircularSimple;
import vista.Vista_Juego;

/**
 *
 * @author Yeison Romero Salinas
 */
public class Cprincipal {

    public static void main(String[] args) {
        Modelo_Lista_CircularSimple model = new Modelo_Lista_CircularSimple();
        Vista_Juego view = new Vista_Juego();
        Controlador_Juego ctrl = new Controlador_Juego(model, view);
        ctrl.iniciar();
    }
}

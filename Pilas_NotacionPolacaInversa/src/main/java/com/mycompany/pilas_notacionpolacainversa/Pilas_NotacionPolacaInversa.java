/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pilas_notacionpolacainversa;

import controlador.Controlador_NotacionPolacaInversa;
import modelo.Operar;
import vista.Vista_EjercicioNotacionPolaca;

/**
 *
 * @author Yeison Romero
 */
public class Pilas_NotacionPolacaInversa {

    public static void main(String[] args) {
        Operar model = new Operar();
        Vista_EjercicioNotacionPolaca view = new Vista_EjercicioNotacionPolaca();
        Controlador_NotacionPolacaInversa ctrl = new Controlador_NotacionPolacaInversa(model, view);
        ctrl.iniciar();
        
    }
}

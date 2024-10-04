/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.caracteres;

import controlador.Controlador_PilaCaracteres;
import modelo.Validar;
import vista.VistaPila;

/**
 *
 * @author Yeison Romero Salinas
 */
public class Caracteres {

    public static void main(String[] args) {
        Validar model = new Validar();
        VistaPila view = new VistaPila();
        Controlador_PilaCaracteres ctrl = new Controlador_PilaCaracteres(model, view);
        ctrl.iniciar();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.listadoble;

import controlador.Controlador_ElementoGnerico;
import modelo.lista_Enlazada;
import vista.Vista_UsuarioDato;

/**
 *
 * @author Yeison Romero Salinas
 */
public class ListaDoble {

    public static void main(String[] args) {
        lista_Enlazada model = new lista_Enlazada();
        Vista_UsuarioDato view = new Vista_UsuarioDato();
        Controlador_ElementoGnerico ctrl = new Controlador_ElementoGnerico(model, view);
        ctrl.iniciar();
                
    }
}

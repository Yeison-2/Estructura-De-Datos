/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.milistasimple;

import com.mycompany.milistasimple.controlador.Controlador_Lista;
import com.mycompany.milistasimple.modelo.ListaSimple;
import com.mycompany.milistasimple.vista.Vista_VistaUsuario;

/**
 *
 * @author Yeison Romero Salinas
 */
public class MiListaSimple {

    public static void main(String[] args) {
        ListaSimple model = new ListaSimple();
        Vista_VistaUsuario view = new Vista_VistaUsuario();
        Controlador_Lista ctrl = new Controlador_Lista(model, view);

        ctrl.agregarElemento(2);
        ctrl.agregarElemento(5);
        ctrl.agregarElemento(10);
        ctrl.agregarElemento(3);

        view.mostrarMensaje("vista despues de guardar los elemetos");
        ctrl.mostraLista();

        view.mostrarMensaje("Lista despues de eliminar un elemento");
        ctrl.eliminarElemento();
        ctrl.mostraLista();

    }
}

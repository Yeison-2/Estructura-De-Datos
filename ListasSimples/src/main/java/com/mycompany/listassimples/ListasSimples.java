/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.listassimples;

import modelo.ListaSimple;

/**
 *
 * @author Yeison Romero Salinas
 */
public class ListasSimples {

    public static void main(String[] args) {
        ListaSimple lista = new ListaSimple();
        lista.agregar(2);
        lista.agregar(5);
        lista.agregar(10);
        System.out.println("lista despues de agregar elementos");
        
        
        lista.mostraLista();
        
        lista.eliminar();
        System.out.println("lista despues de eliminar elementos");
        lista.mostraLista();

    }
}

package com.mycompany.milistasimple.controlador;


import com.mycompany.milistasimple.modelo.ListaSimple;
import com.mycompany.milistasimple.vista.Vista_VistaUsuario;

/**
 * Universidad juan de castellanos
 * Asignatura: Estructura de Datos
 * Descripción: 
 * Fecha: //
 * Autor: Yeison Stiven Romero Salinas
 */

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Yeison Romero Salinas
 */
public class Controlador_Lista {
    private ListaSimple model;
    private Vista_VistaUsuario view;
    
    public Controlador_Lista(ListaSimple model, Vista_VistaUsuario view){
        this.model = model;
        this.view = view;
        
    }

    public void agregarElemento(int valot){
        model.agregar(valot);
    }
    
    public void eliminarElemento(){
        model.Eliminar();
    }
    
    public void mostraLista(){
        view.mostraLista(model.getCabeza());
    }
    
    public void BuscarElemento(){
        model.buscar(0);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.Cola;
import vista.Vista;

/**
 *
 * @author programador
 */
public class Controlador {
    private Cola model;
    private Vista view;

    public Controlador(Cola model, Vista view){
        this.model = model;
        this.view = view;
    }

    public void encolar(int dato){
        model.encolar(dato);
    }

    public int desencolar(){
        return model.desencolar();
    }

    public void mostrarColar(){
        model.mostraCola();
    }
    
    public void iniciar(){
        view.miMenu();
    }
}

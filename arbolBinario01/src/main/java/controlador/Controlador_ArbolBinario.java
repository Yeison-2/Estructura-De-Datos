/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.ArbolBinario;
import vista.Vista;

/**
 *
 * @author programador
 */
public class Controlador_ArbolBinario {
    private ArbolBinario model;
    private Vista view;
    
    public Controlador_ArbolBinario(ArbolBinario model, Vista view){
        this.model = model;
        this.view = view;
    }
    
    
    public void agregar(int valor){
        model.agregar(valor);
        view.mostrarMensaje("valor "+ valor + " agregado al arbol");
        
    }
    public void eliminar(int valor){
        model.eliminar( valor);
        view.mostrarMensaje("valor "+ valor + " eliminado del arbol");
    }
    
    public void mostrar(){
        view.mostrarMensaje("PreOrden:");
        model.preOrden(model.getRaiz());
    }
    
}

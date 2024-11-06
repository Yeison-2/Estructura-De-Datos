/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.Operar;
import vista.Vista_EjercicioNotacionPolaca;

/**
 *
 * @author Yeison Romero
 */
public class Controlador_NotacionPolacaInversa {
    private Operar model;
    private Vista_EjercicioNotacionPolaca view;
    
    public Controlador_NotacionPolacaInversa(Operar model, Vista_EjercicioNotacionPolaca view){
        this.model = model;
        this.view = view;
        
        
    }
    
    public void iniciar(){
        String expresion = view.pedirExpresion();
        int resultado = model.evaluarExpresion(expresion);
        view.mostrarMensaje("El resultado es "+resultado);
    }
}

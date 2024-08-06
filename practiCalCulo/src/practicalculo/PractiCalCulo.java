/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicalculo;

import controlador.Controladador_Calculadora;
import modelo.Modelo_Calculadora;
import vista.Vista_Calculadora;

/**
 *
 * @author Yeison Romero Salinas
 */
public class PractiCalCulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Modelo_Calculadora model = new Modelo_Calculadora();
        Vista_Calculadora view = new Vista_Calculadora();
        Controladador_Calculadora ctrl = new Controladador_Calculadora(model, view);
        
        view.setVisible(true);
    }
    
}

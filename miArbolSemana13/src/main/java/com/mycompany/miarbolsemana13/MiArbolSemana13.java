/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.miarbolsemana13;

import controlador.ContadorControlador;
import modelo.ContadorModelo;
import vista.ContadorVista;

/**
 *
 * @author programador
 */
public class MiArbolSemana13 {

    public static void main(String[] args) {
        //ContadorModelo model = new ContadorModelo();
        //ContadorVista view = new ContadorVista();
        //ContadorControlador ctrl = new ContadorControlador(model, view);
        
        javax.swing.SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run() {
                ContadorModelo model = new ContadorModelo();
                ContadorVista view = new ContadorVista();
                new ContadorControlador(model, view);
            }
            
        });
        
    }
}

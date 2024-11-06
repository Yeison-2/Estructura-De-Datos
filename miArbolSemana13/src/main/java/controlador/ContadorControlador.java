/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.ContadorModelo;
import vista.ContadorVista;

/**
 *
 * @author programador
 */
public class ContadorControlador {
    private ContadorModelo model;
    private ContadorVista view;

    public ContadorControlador(ContadorModelo model, ContadorVista view) {
        this.model = model;
        this.view = view;
        
        this.view.agregarBoton(new Escuchar());
        
        this.view.agregarBoton2(new Escuchar2());
    }
    
    class Escuchar implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            view.desabilitar();
            Thread hiloCotador = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 100; i++) {
                        model.incrementar();
                        view.establecerTexto("Contador "+ model.obtenerContador());
                        try {
                            Thread.sleep(100);
                            
                        }catch (InterruptedException ex){
                            ex.printStackTrace();
                        }
                    }
                }
            });
            hiloCotador.start();
        
        }

        
        
    }
    
    class Escuchar2 implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ex) {
            view.desabilitar2();
            Thread hiloCotador2 = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 100; i++) {
                        model.incrementar();
                        view.establecerTexto2("Contador "+ model.obtenerContador());
                        try {
                            Thread.sleep(100);
                            
                        }catch (InterruptedException e){
                            e.printStackTrace();
                        }
                    }
                }
            });
            hiloCotador2.start();
        
        }

        
        
    }
    
    
    
}

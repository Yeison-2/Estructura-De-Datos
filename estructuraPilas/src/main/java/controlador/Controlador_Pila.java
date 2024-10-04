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

package controlador;

import modelo.Pila;
import vista.Vista_Pila;

/**
 *
 * @author Yeison Romero Salinas
 */
public class Controlador_Pila {
    private Vista_Pila view;
    private Pila model;
    
    public Controlador_Pila(Pila model, Vista_Pila view){
        this.model = model;
        this.view = view;
    }
    
    public void iniciar(){
        boolean continuar = true;
         while(continuar){
             int opcion = view.mostraMenu();
             
             
             switch (opcion){
                 case 1:
                     int numero = view.pedirDatoInt();
                     model.apilar(numero);
                     
                     break;
                 case 2:
                     int quitar = model.desaPilar();
                     view.mostarMensajes("numero desapilado "+quitar);
                     break;
                 case 3:
                     int cima = model.ultimoAgregado();
                     view.mostarMensajes("ultimo dato en la pila es "+cima);
                     break;
                 case 4:
                     model.mostrarPila();
                     break;
                 case 5:
                     continuar = false;
                     view.mostarMensajes("----------saliendo -------");
                     break;
                 default:
                     System.out.println("opcion no valida");
             }
         }
        
    }
    
}

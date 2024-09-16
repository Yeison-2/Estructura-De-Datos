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

import modelo.Modelo_Lista_CircularSimple;
import vista.Vista_Juego;

/**
 *
 * @author Yeison Romero Salinas
 */
public class Controlador_Juego {
    private Modelo_Lista_CircularSimple model;
    private Vista_Juego view;
    
    public Controlador_Juego(Modelo_Lista_CircularSimple model, Vista_Juego view){
        this.model = model;
        this.view = view;
    }
    
    public void iniciar(){
        int opcion;
        
        do {            
            view.mostraMenu();
            opcion = view.leerOpcion();
            prosesarOpcion(opcion);
        } while (opcion != 0);
    }
    public void prosesarOpcion(int opcion){
        switch (opcion){
            case 1:
                agregarJugador();
                break;
            case 2:
                mostrarJugadores();
                break;
            case 3: 
                eliminarJugador();
                break;
            case 4:
                jugarTurno();
                break;
            case 0:
                System.out.println("<-----saliendo del programa--------->");
                break;
            default:
                view.mostraMnesaje("..X.X.X...opcion invalida...X.X.X..");
        }
    }
    
    public void agregarJugador(){
        model.agregarJugador(view.nombreJugador());
    }
    
    public void mostrarJugadores(){
        view.mostraMnesaje(model.mostrarJugadores());
    }
    
    public void eliminarJugador(){
        String nombre =view.nombreJugador();
        if (model.eliminarJugador(nombre)) {
            view.mostraMnesaje(nombre+" jugador encontrado y eliminado");
        } else {
            view.mostraMnesaje("no se encontro jugador con el nombsxce de "+nombre);
        }
    }
    
    public void jugarTurno(){
        view.mostraMnesaje(model.jugar());
    }
}

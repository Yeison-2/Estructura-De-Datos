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

import modelo.lista_Enlazada;
import vista.Vista_UsuarioDato;

/**
 *
 * @author Yeison Romero Salinas
 */
public class Controlador_ElementoGnerico <T> {

    private lista_Enlazada<T> model;
    private Vista_UsuarioDato view;

    public Controlador_ElementoGnerico(lista_Enlazada model, Vista_UsuarioDato view) {
        this.model = model;
        this.view = view;
    }

    public void iniciar() {
        int opcion;

        do {
            view.mostraMenu();
            opcion = view.obtenerOpcion();
            prosesar(opcion);

        } while (opcion != 0);
    }

    public void prosesar(int opcion) {
        switch (opcion) {
            case 1:
                agregarAlFinal();
                break;
            case 2:
                agregarAlInicio();
                break;
            case 3:
                eliminar();
                break;
            case 4:
                buscar();
                break;
            case 5:
                invertir();
                break;
            case 0:
                System.out.println("saliendo del programad");
                break;
            default:
                view.mostrarMensaje("Opcion invalida");
        }
    }

    private void agregarAlFinal() {
        T elemento = (T) Integer.valueOf(view.obtenerNumero("Ingrese el elemento ha agregar en la lista"));
        model.agregarAlFinal(elemento);
        view.mostrarMensaje(elemento + " se agrego al final");
    }

    private void agregarAlInicio() {
        T elemento = (T) Integer.valueOf(view.obtenerNumero("Ingrese el numero para agregar al inicio"));
        model.agregarAlInicio(elemento);
        view.mostrarMensaje("elemento agregado al inicio");
    }

    private void eliminar() {
        T elemento = (T) Integer.valueOf(view.obtenerNumero("Ingrese el elemento a eliminar"));
        model.eliminar(elemento);
        view.mostrarMensaje("elemento eliminado");
    }
    
    private void buscar(){
        T elemento =(T) Integer.valueOf(view.obtenerNumero("Ingrese el numero ha buscar"));
        if(model.buscar(elemento) == true){
            System.out.println("Encontrado "+elemento);
        } else {
            System.out.println("No encontrado "+elemento);
        }
        
        
    }
    
    private void invertir(){
        model.invertir();
    }
    
    
}

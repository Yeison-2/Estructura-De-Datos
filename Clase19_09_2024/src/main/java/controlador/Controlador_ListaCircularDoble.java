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

import java.util.ResourceBundle;
import modelo.Modelo_ListaCircularDoble;
import vista.Vista_ListaCircularDoble;

/**
 *
 * @author Yeison Romero Salinas
 */
public class Controlador_ListaCircularDoble {

    private Modelo_ListaCircularDoble model;
    Vista_ListaCircularDoble view;

    public Controlador_ListaCircularDoble(Modelo_ListaCircularDoble model, Vista_ListaCircularDoble view) {
        this.model = model;
        this.view = view;
    }

    public void iniciar() {
        int opcion;
        do {
            view.mostraMenu();
            opcion = view.recibirOpcionMenu();
            prosesarOpcion(opcion);
        } while (opcion != 0);
    }

    public void prosesarOpcion(int opcion) {
        switch (opcion) {
            case 1:
                agregarAlinicio(view.ingreseDato());
                break;

            case 2:
                agregarAlFinal(view.ingreseDato());
                break;
            case 3:
                mostrarCabezaCola();
                break;
            case 4:
                mostraColaCabeza();
                break;
            case 0:
                System.out.println("****Saliendo del iistemas *****");
                break;
            default:
                System.out.println("XXXX ___ingrese una opcion valida __XXXX");

        }
    }

    public void agregarAlinicio(int valor) {
        model.agregarInicio(valor);
    }

    public void agregarAlFinal(int valor) {
        model.agregarFinal(valor);
    }

    public void mostrarCabezaCola() {
        model.mostrarCabezaCola();
    }

    public void mostraColaCabeza() {
        model.mostrarColaCabeza();
    }
}

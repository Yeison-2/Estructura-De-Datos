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

import modelo.Validar;
import vista.VistaPila;

/**
 *
 * @author Yeison Romero Salinas
 */
public class Controlador_PilaCaracteres {

    private VistaPila view;

    private Validar model;

    public Controlador_PilaCaracteres(Validar model, VistaPila view) {
        this.model = model;
        this.view = view;
    }

    public void iniciar() {
        String exprecion = view.pedirExpresion();
        boolean respuesta = model.esBalanceado(exprecion);

        view.resultados(model.esBalanceado(exprecion));
        
    }

}

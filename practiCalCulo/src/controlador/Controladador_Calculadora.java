/**
 * Docente: Magda Pineda
 * Universidad juan de castellanos
 * Asignatura: POO
 * Descripción:
 * Fecha: //
 * Autor: Yeison Stiven Romero Salinas
 */

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Modelo_Calculadora;
import vista.Vista_Calculadora;

/**
 *
 * @author Yeison Romero Salinas
 */
public class Controladador_Calculadora implements ActionListener {

    Modelo_Calculadora model;
    Vista_Calculadora view;

    public Controladador_Calculadora(Modelo_Calculadora model, Vista_Calculadora view) {
        this.model = model;
        this.view = view;
        this.view.addListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            int num1 = Integer.parseInt(view.getNumero1());
            int num2 = Integer.parseInt(view.getNumero2());
            model.setNumero1(num1);
            model.setNumero2(num2);

            switch (e.getActionCommand()) {
                case "mult":
                    int resutadoMult = model.multiplicar();
                    view.setResultado(String.valueOf(resutadoMult));
                    break;

                case "div":
                    try {
                    int resultadoDiv = model.dividir();
                    view.setResultado(String.valueOf(resultadoDiv));
                } catch (Exception ex) {
                    view.showError("no divida entre 0");
                }

                break;

                case "sumar":
                    int resultadoSumar = model.sumar();
                    view.setResultado(String.valueOf(resultadoSumar));
                    break;

                case "resta":
                    int resultadoRestar = model.restar();
                    view.setResultado(String.valueOf(resultadoRestar));
                    break;
                    
                    default:
                    throw new AssertionError("Comando no reconocido: " + e.getActionCommand());
            }

        } catch (Exception ex) {
            view.showError("Digite datos correctos");
        }
    }

    /*@Override
    public void actionPerformed(ActionEvent e) {

        try {
            int num1 = Integer.parseInt(view.getNumero1());
            int num2 = Integer.parseInt(view.getNumero2());
            model.setNumero1(num1);
            model.setNumero2(num2);

            switch (e.getActionCommand()) {

                case "multiplicar":
                    int resultado = model.multiplicar();
                    view.setResultado(String.valueOf(resultado));
                    break;

                case "dividir":
                    
                    try {
                    int resultado2 = model.dividir();
                    view.setResultado(String.valueOf(resultado2));

                } catch (Exception el) {
                    view.showError("Error divicion 0");
                }
                break;
                case "sumar":
                    int resultado3 = model.sumar();
                    view.setResultado(String.valueOf(resultado3));
                    break;

                case "restar":
                    int resultado4 = model.restar();
                    view.setResultado(String.valueOf(resultado4));
                    break;

                default:
                    throw new AssertionError("Comando no reconocido: " + e.getActionCommand());
            }

        } catch (Exception ex) {
            view.showError("ingrese un numero valido");
        }
        
    }*/
}

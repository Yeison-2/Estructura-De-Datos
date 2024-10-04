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
package modelo;

/**
 *
 * @author Yeison Romero Salinas
 */
public class Validar {

    private Pila pila;

    public Validar() {
        pila = new Pila();
    }

    /* metodo validar si la exprecion es valancada*/
    public boolean esBalanceado(String exprecion) {
        for (int i = 0; i < exprecion.length(); i++) {
            char caracter = exprecion.charAt(i);

            if (caracter == '(' || caracter == '{' || caracter == '[') {
                pila.apilar(caracter);
            }

            if (caracter == ')' || caracter == '}' || caracter == ']') {
                if (pila.esVacia()) {
                    return false;
                }
                char cima = pila.desapilar();
                if (!iguales(cima, caracter)) {
                    return false;
                }
            }

        }
        return pila.esVacia();
    }

    /*mttodo parecntesis son iguaes*/
    public boolean iguales(char apertura, char cierre) {
        return (apertura == '(' && cierre == ')')
                || (apertura == '{' && cierre == '}')
                || (apertura == '[' && cierre == ']');
    }
}

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

import modelo.Modelo_BuscaMinas;
import vista.Vista_BuscaMinas;

/**
 *
 * @author Yeison Romero Salinas
 */


public class Controlador_BuscaMinas {

    private final Modelo_BuscaMinas modelo;
    private final Vista_BuscaMinas vista;

    public Controlador_BuscaMinas(Modelo_BuscaMinas modelo, Vista_BuscaMinas vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void iniciarJuego() {
        vista.mostrarTablero(modelo.getTablero());

        while (!modelo.esJuegoTerminado()) {
            int[] coordenadas = vista.pedirCoordenadas();

            int fila = coordenadas[0];
            int columna = coordenadas[1];

            if (!modelo.descubrirCasilla(fila, columna)) {
                vista.mostrarMensaje("¡Has perdido! Has descubierto una mina.");
                break;
            }

            vista.mostrarTablero(modelo.getTablero());

            if (modelo.esVictoria()) {
                vista.mostrarMensaje("¡Felicidades! Has ganado.");
                break;
            }
        }

        vista.mostrarTableroConMinas(modelo.getMinas());
    }
}


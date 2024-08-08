/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package buscaminas;

import controlador.Controlador_BuscaMinas;
import modelo.Modelo_BuscaMinas;
import vista.Vista_BuscaMinas;

/**
 *
 * @author Yeison Romero Salinas
 */
public class BuscaMinas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Definir las dimensiones del tablero y la cantidad de minas
        int filas = 5;
        int columnas = 5;
        int minas = 5;

        Modelo_BuscaMinas modelo = new Modelo_BuscaMinas(filas, columnas, minas);

        Vista_BuscaMinas vista = new Vista_BuscaMinas();

        Controlador_BuscaMinas ctrl = new Controlador_BuscaMinas(modelo, vista);

        ctrl.iniciarJuego();
    }
}

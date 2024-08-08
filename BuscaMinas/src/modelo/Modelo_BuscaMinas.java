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

package modelo;

import java.util.Random;

/**
 *
 * @author Yeison Romero Salinas
 */
public class Modelo_BuscaMinas {
    private final int FILAS;
    private final int COLUMNAS;
    private final int MINAS;
    private char[][] tablero;
    private boolean[][] minas;
    private boolean juegoTerminado;

    public Modelo_BuscaMinas(int filas, int columnas, int minas) {
        this.FILAS = filas;
        this.COLUMNAS = columnas;
        this.MINAS = minas;
        this.tablero = new char[FILAS][COLUMNAS];
        this.minas = new boolean[FILAS][COLUMNAS];
        this.juegoTerminado = false;
        inicializarTablero();
        colocarMinas();
    }

    private void inicializarTablero() {
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                tablero[i][j] = '-';
                minas[i][j] = false;
            }
        }
    }

    private void colocarMinas() {
        Random random = new Random();
        int minasColocadas = 0;

        while (minasColocadas < MINAS) {
            int fila = random.nextInt(FILAS);
            int columna = random.nextInt(COLUMNAS);

            if (!minas[fila][columna]) {
                minas[fila][columna] = true;
                minasColocadas++;
            }
        }
    }

    public boolean descubrirCasilla(int fila, int columna) {
        if (juegoTerminado || fueraDeLimites(fila, columna) || tablero[fila][columna] != '-') {
            return false;
        }

        if (minas[fila][columna]) {
            juegoTerminado = true;
            return false;
        }

        int minasCercanas = contarMinasCercanas(fila, columna);
        tablero[fila][columna] = (char) (minasCercanas + '0');

        if (minasCercanas == 0) {
            for (int i = fila - 1; i <= fila + 1; i++) {
                for (int j = columna - 1; j <= columna + 1; j++) {
                    if (!fueraDeLimites(i, j)) {
                        descubrirCasilla(i, j);
                    }
                }
            }
        }

        return true;
    }

    private int contarMinasCercanas(int fila, int columna) {
        int contador = 0;
        for (int i = fila - 1; i <= fila + 1; i++) {
            for (int j = columna - 1; j <= columna + 1; j++) {
                if (!fueraDeLimites(i, j) && minas[i][j]) {
                    contador++;
                }
            }
        }
        return contador;
    }

    private boolean fueraDeLimites(int fila, int columna) {
        return fila < 0 || fila >= FILAS || columna < 0 || columna >= COLUMNAS;
    }

    public boolean esJuegoTerminado() {
        return juegoTerminado;
    }

    public boolean esVictoria() {
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                if (tablero[i][j] == '-' && !minas[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public char[][] getTablero() {
        return tablero;
    }

    public boolean[][] getMinas() {
        return minas;
    }
}


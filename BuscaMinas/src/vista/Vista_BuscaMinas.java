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
package vista;

/**
 *
 * @author Yeison Romero Salinas
 */
import java.util.Scanner;

public class Vista_BuscaMinas {

    private final Scanner scanner;

    public Vista_BuscaMinas() {
        this.scanner = new Scanner(System.in);
    }

    public void mostrarTablero(char[][] tablero) {
        System.out.println("Tablero:");
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void mostrarTableroConMinas(boolean[][] minas) {
        System.out.println("Tablero final (con minas):");
        for (int i = 0; i < minas.length; i++) {
            for (int j = 0; j < minas[i].length; j++) {
                if (minas[i][j]) {
                    System.out.print("* ");
                } else {
                    System.out.print("- ");
                }
            }
            System.out.println();
        }
    }

    public int[] pedirCoordenadas() {
        System.out.print("Introduce fila y columna (ej: 1 2): ");
        int fila = scanner.nextInt() - 1;
        int columna = scanner.nextInt() - 1;
        return new int[]{fila, columna};
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}

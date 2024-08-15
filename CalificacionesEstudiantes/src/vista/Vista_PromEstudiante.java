/**
 * Docente: Magda Pineda
 * Universidad juan de castellanos
 * Descripción:
 * Fecha: 12/08/2024
 * Autor: Yeison Stiven Romero Salinas
 */

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.util.Scanner;

/**
 *
 * @author Yeison Romero Salinas
 */
public class Vista_PromEstudiante {

    private Scanner scanner;

    public Vista_PromEstudiante() {
        scanner = new Scanner(System.in);
    }

    public int solicitarNumero(String Mensaje) {
        System.out.println(Mensaje);
        return scanner.nextInt(10);
    }

    public void mostrarMenzaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void mostraCalificaciones(int[][] calificaciones) {
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.print("Estudiante " + (i + 1) + ":");
            for (int j = 0; j < calificaciones[i].length; j++) {
                System.out.print(calificaciones[i][j] + "  ");
            }
        }

        System.out.println();
    }

    public void mostrarPromedioEstudiante(int estudiante, double promedio) {
        System.out.print("Promedio del estudinate " + (estudiante + 1) + ":  " + promedio);
        System.out.println();
    }
    

    public void mostrarPromedioMaterias(int materia, double promedio) {
        System.out.print("Promedio de materia " + (materia + 1) + ":  " + promedio);
        System.out.println();
    }
}

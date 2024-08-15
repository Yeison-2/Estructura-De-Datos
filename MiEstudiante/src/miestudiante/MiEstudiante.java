/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package miestudiante;

import miestudiante.Estudiante;

/**
 *
 * @author Yeison Romero Salinas
 */
public class MiEstudiante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estudiante[] estudiante = {
            new Estudiante("Yeison", "Camargo", "sistemas", 24),
            new Estudiante("Carlos", "Ramirez", "civil", 23),
            new Estudiante("Jhon", "Leon", "civil", 20)
        };

        for (Estudiante estudiantes : estudiante) {
            System.out.println(estudiantes);
        }
    }

}

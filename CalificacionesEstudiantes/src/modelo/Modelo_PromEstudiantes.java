/**
 * Universidad juan de castellanos
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
public class Modelo_PromEstudiantes {

    private int[][] calificaciones;
    private int numeroEstudiantes;
    private int numeroMaterias;

    public Modelo_PromEstudiantes(int numeroEstudiantes, int numeroMaterias) {
        this.numeroEstudiantes = numeroEstudiantes;
        this.numeroMaterias = numeroMaterias;
        calificaciones = new int[numeroEstudiantes][numeroMaterias];
    }

    public int[][] getCalificaciones() {
        return calificaciones;
    }

    public void setCalificacion(int estudiante, int materia, int calificacion) {
        calificaciones[estudiante][materia] = calificacion;
    }

    public double calPromedioEstudiante(int estudiante) {
        int suma = 0;
        for (int calificacion : calificaciones[estudiante]) {
            suma += calificacion;
        }

        return (double) suma / numeroMaterias;
    }

    public double calPromedioMateria(int materia) {
        int suma = 0;
        for (int[] estudiante : calificaciones) {
            suma += estudiante[materia];
        }
        return (double) suma / numeroEstudiantes;
    }

    public int estudianteMayorPromedio() {
        int estudianteMayor = 0;
        double mayorPromedio = calPromedioEstudiante(0);

        for (int i = 1; i < numeroEstudiantes; i++) {
            double promedio = calPromedioEstudiante(i);
            if (promedio > mayorPromedio) {
                mayorPromedio = promedio;
                estudianteMayor = i;
            }
        }
        return estudianteMayor;
    }

    public int estudianteMenorPromedio() {
        int estudianteMenor = 0;
        double menorPromedio = calPromedioEstudiante(0);

        for (int i = 1; i < numeroEstudiantes; i++) {
            double promedio = calPromedioEstudiante(i);
            if (promedio < menorPromedio) {
                menorPromedio = promedio;
                estudianteMenor = i;
            }
        }
        return estudianteMenor;
    }

}

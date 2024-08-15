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
public class Modelo3 {

    private int[][] calificaciones;
    private int numerorEstudiantes;
    private int numeroMaterias;

    public Modelo3(int numeroEstudiantes, int numeroMaterias) {
        this.numerorEstudiantes = numeroEstudiantes;
        this.numeroMaterias = numeroMaterias;
        calificaciones = new int[numeroEstudiantes][numeroMaterias];
    }

    public int[][] getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(int estudiantes, int materias, int calificacion) {
        calificaciones[estudiantes][materias] = calificacion;
    }

    public double promedioEstudiantes(int estudiante) {
        int suma = 0;
        for (int calificaciones : calificaciones[estudiante]) {
            suma += calificaciones;
        }
        return (double)suma/numeroMaterias;
    }
    
    public double promedioMaterias(int materia){
        int suma =0;
        for(int[] calificaciones: calificaciones){
            suma += calificaciones[materia];
        }
        return (double) suma/numerorEstudiantes;
    }
}

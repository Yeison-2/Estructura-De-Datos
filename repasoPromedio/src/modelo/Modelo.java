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

/**
 *
 * @author Yeison Romero Salinas
 */
public class Modelo {

    //matriz bidimencional
    private int[][] calificaciones;
    private int numeroEstudiantes;
    private int numeroMaterias;

    //crear el contructor para iniciacializar es decir editar lo anteriormente creado los va a recivir
    public Modelo(int numeroEstudiantes, int numeroMaterias) {
        this.numeroEstudiantes = numeroEstudiantes;
        this.numeroMaterias = numeroMaterias;
        calificaciones = new int[numeroEstudiantes][numeroMaterias];
    }

    public int[][] getCalificaciones() {
        return calificaciones;
    }

    /**
     * Este metod permite modicar la el arreglo bidimencional en las coordenasda
     * y guarda la calificacion
     *
     * @param estudiante coordednada fila del estudaniante correspondiente
     * @param materia coordena columna de ma materia correspondiente
     * @param calificacion lo que se guarda en esa coordenada
     */
    public void setCalificacion(int estudiante, int materia, int calificacion) {
        calificaciones[estudiante][materia] = calificacion;
    }

    //promadioEstudiante double
    /**
     * Este metodo calcula el promedio de un estudiante recibiendo un indice
     *
     * @param estudiante indice del estudiante a calcular su promedio por
     * estdante
     * @return promedio convertido a double
     */
    public double promEstudiante(int estudiante) {
        int suma = 0;

        for (int calificaciones : calificaciones[estudiante]) {
            suma += calificaciones;
        }

        return (double) suma / numeroMaterias;
    }

    /**
     * Este metodo cal promdio por materia es decir que primero en el foreach
     * crea un arreglo unidimencional que recorre y guarda fila por fila las
     * calificaione s de los estudantes pero con la operacion suma aculmulativa
     * solo tendra encuenta el indice que le pasemas de la materia y solo sumara
     * los elemnetos de ese indice y luego los dividira entre el numero total de
     * estudiantes
     *
     * @param materia
     * @return
     */
    public double promMateria(int materia) {
        int suma = 0;
        for (int[] calificaciones : calificaciones) {
            suma += calificaciones[materia];
        }

        return (double) suma / numeroEstudiantes;
    }

}

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
public class Model2 {
    //crar la matris bimencional
    //crar la filas= estudiantes= coordenadas
    //craera columnas = materias = coordenadas
    //crear constructor inicializar la matriz filas columnas
    //crear getCalificaciones y set
    //promedio estudiantes
    //promedio por materia
    
    private int [][] calificaciones;
    private int numeroEstudiantes;
    private int numeroMaterias;
    
    public Model2(int numeroEstudiantes, int numeroMaterias){
        this.numeroEstudiantes = numeroEstudiantes;
        this.numeroMaterias = numeroMaterias;
        
        calificaciones = new int [numeroEstudiantes][numeroMaterias];
    }
    
    public int[][] getCalificaciones(){
        return calificaciones;
    }
    
    public void setCalificacion(int estudiante, int materia, int calificacion){
        calificaciones[estudiante][materia] = calificacion;
    }
    
    public double promEstudiante(int estudiante){
        int suma = 0;
        
        for(int calificaciones: calificaciones[estudiante]){
            suma += calificaciones;
        }
        return (double) suma/numeroMaterias;
    }
    
    public double promMaterias(int materia){
        int suma = 0;
        for(int []calificaciones: calificaciones){
            suma += calificaciones[materia];
        }
        return (double) suma/numeroEstudiantes;
    }
    
}

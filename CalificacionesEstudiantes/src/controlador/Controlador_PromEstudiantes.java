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

import modelo.Modelo_PromEstudiantes;
import vista.Vista_PromEstudiante;

/**
 *
 * @author Yeison Romero Salinas
 */
public class Controlador_PromEstudiantes {

    private Modelo_PromEstudiantes model;
    private Vista_PromEstudiante view;

    public Controlador_PromEstudiantes(Modelo_PromEstudiantes model, Vista_PromEstudiante view) {
        this.model = model;
        this.view = view;
    }

    public void iniciar() {
        int numeroEstudiante = view.solicitarNumero("Numero del estduante");
        int numeroMaterias = view.solicitarNumero("Ingrese numero de Materias");
        model = new Modelo_PromEstudiantes(numeroEstudiante, numeroMaterias);

        for (int i = 0; i < numeroEstudiante; i++) {
            for (int j = 0; j < numeroMaterias; j++) {
                int calificacion = view.solicitarNumero("Ingrese la calificacion del estudiante " + (i + 1)
                        + " la materia " + (j + 1) + ":");
                model.setCalificacion(i, j, calificacion);
            }

        }

        view.mostraCalificaciones(model.getCalificaciones());

        for (int i = 0; i < numeroEstudiante; i++) {
            double promedioEstudiante = model.calPromedioEstudiante(i);
            view.mostrarPromedioEstudiante(i, promedioEstudiante);

        }

        for (int i = 0; i < numeroMaterias; i++) {
            double promedioMateria = model.calPromedioMateria(i);
            view.mostrarPromedioMaterias(i, promedioMateria);
        }

        int estudianteMayor = model.estudianteMayorPromedio();
        int estudianteMenor = model.estudianteMenorPromedio();

        view.mostrarMenzaje("El estudiante con el mayor promedio es el estudiante " + (estudianteMayor + 1) + " con un promedio de " + model.calPromedioEstudiante(estudianteMayor));
        view.mostrarMenzaje("El estudiante con el menor promedio es el estudiante " + (estudianteMenor + 1) + " con un promedio de " + model.calPromedioEstudiante(estudianteMenor));
        
        

    }

}

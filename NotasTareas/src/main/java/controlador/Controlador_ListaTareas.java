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
package controlador;

import modelo.Lista_Enlasada;
import modelo.Prioridad;
import modelo.Tarea;
import modelo.TareaPersonal;
import modelo.Tarea_Trabajo;
import vista.Vista_NewTarea;

/**
 *
 * @author Yeison Romero Salinas
 */
public class Controlador_ListaTareas {

    private Lista_Enlasada model;
    private Vista_NewTarea view;

    public Controlador_ListaTareas(Lista_Enlasada model, Vista_NewTarea view) {
        this.model = model;
        this.view = view;
    }

    public void iniciar() {
        int opcion;

        do {
            opcion = view.mostraMenu();

            switch (opcion) {
                case 1:
                    String nombre = view.pedirNombreTarea();
                    String descripcion = view.pedirDescripcion();

                    TareaPersonal tareaP = new TareaPersonal(nombre, descripcion);
                    model.anadirTarea(tareaP);

                    System.out.println("Tarea gurdada tarea personal");
                    break;

                case 2:
                    String nombre1 = view.pedirNombreTarea();
                    String descripcion1 = view.pedirDescripcion();
                    String proyecto = view.pedirProyectoAsosiado();

                    Tarea_Trabajo tareaT = new Tarea_Trabajo(nombre1, descripcion1, proyecto);
                    model.anadirTarea(tareaT);

                    System.out.println("Tarea gurdada tarea de trabajo");
                    break;

                case 3:
                    view.mostraListaDeTareas(model.getCabeza());
                    int posicion = view.pedirPosision();
                    Tarea actual = model.getCabeza();

                    for (int i = 0; i < posicion && actual != null; i++) {
                        actual = actual.getSiguiente();
                        
                    }
                    if(actual instanceof Prioridad){
                        int prioridad3 = view.pedirPrioridad();
                        ((Prioridad)actual).establecerPrioridad(prioridad3);
                        System.out.println("Prioridad asignada ");
                    }else{
                        System.out.println("La tarea seleccionada no tiene prioridad asignada");
                    }

                    break;
                case 4:
                    view.mostraListaDeTareas(model.getCabeza());
                    break;
                case 5:
                    System.out.println("----------------Saliendo del sistema-----------------------------");
                    break;
                default:
                    System.out.println("opcion no valida intente nuevamente");
                    
            }
        } while(opcion != 5);
    }
}

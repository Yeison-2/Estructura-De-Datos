/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import controlador.Controlador_Tareas;
import java.util.Scanner;
import modelo.Nodo;

/**
 *
 * @author programador
 */
public class Vista_Tareas {

    public void mostraLista(Nodo cabeza) {
        Nodo temp = cabeza;
        while (temp != null) {
            System.out.print(temp.getDescripcion() + " -> ");
            temp = temp.getSiguiente();
        }
        System.out.println("null");
    }

    private Controlador_Tareas controlador;
    private Scanner scanner;

    public Vista_Tareas() {
        this.controlador = new Controlador_Tareas();
        this.scanner = new Scanner(System.in);
    }

    public void iniciar() {
        boolean continuar = true;
        while (continuar) {
            System.out.println("1. Agregar Tarea General");
            System.out.println("2. Agregar Tarea Urgente");
            System.out.println("3. Agregar Tarea Comun");
            System.out.println("4. Mostrar Tareas");
            System.out.println("5. Salir");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese la descripción de la tarea general:");
                    String descripcionGeneral = scanner.nextLine();
                    controlador.agregarTareaGeneral(descripcionGeneral, opcion);
                    break;
                case 2:
                    System.out.println("Ingrese la descripción de la tarea urgente:");
                    String descripcionUrgente = scanner.nextLine();
                    controlador.agregarTareaUrgente(descripcionUrgente, opcion);
                    break;
                case 3:
                    System.out.println("Ingrese la descripción de la tarea común:");
                    String descripcionComun = scanner.nextLine();
                    controlador.agregarTareaComun(descripcionComun, opcion);
                    break;
                case 4:
                    System.out.println("Tareas Generales:");
                    Nodo cabeza = controlador.getCabeza();
                    this.mostraLista(cabeza);
                    controlador.mostrarTareas();

                    
                    break;
                case 5:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        }
    }

}

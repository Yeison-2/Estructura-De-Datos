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

package vista;

import java.util.Scanner;
import modelo.Prioridad;
import modelo.Tarea;

/**
 *
 * @author Yeison Romero Salinas
 */
public class Vista_NewTarea {
    private Scanner scanner;
    public Vista_NewTarea(){
        this.scanner = new Scanner(System.in);
    }
    
    public int mostraMenu(){
        System.out.println("\n Gestio Tareas");
        System.out.println("1. añadir tarea Personal");
        System.out.println("2. añadir Tarea de trabajo");
        System.out.println("3. asignar prioridad");
        System.out.println("4. mostra lista de tareas");
        System.out.println("5. salir");
        System.out.println("Seleccione una opcion");
        
        
        
        return scanner.nextInt();
    }
    
    
    public String pedirNombreTarea(){
        System.out.println("Ingrese el nombre de la tarea");
        scanner.nextLine();
        
        return scanner.nextLine();
    }
    
    public String pedirDescripcion(){
        System.out.println("Ingrese ela descripcion de la tarea");
        scanner.nextLine();
        
        return scanner.nextLine();
    }
    
    public int pedirPrioridad(){
        System.out.println("Ingrese la prioridad de la tarea de 1 a 5");
        
        
        return scanner.nextInt();
    }
    
    public String pedirProyectoAsosiado(){
        System.out.println("Ingrese el nombre del proyecto");
        scanner.nextLine();
        
        return scanner.nextLine();
    }
    
    public void mostraListaDeTareas(Tarea cabeza){
        if(cabeza == null){
            
            System.out.println("Lista de tareas vacia");
        } else {
            Tarea actual = cabeza;
            
            while(actual.getSiguiente() != null){
                String tipoTarea= actual.obtenerTipoTarea();
                System.out.println("Nombre tarea: "+actual.getNombre()+" Descripcion :"+actual.getDescripcion()+" Tipo: "+tipoTarea);
                
                if(actual instanceof  Prioridad){
                    System.out.println("Prioridad :"+((Prioridad) actual).obtenerPrioridad());
                }
                actual = actual.getSiguiente();
            }
        }
    }
    
    
    public int pedirPosision(){
        System.out.println("Ingrese la prioridad de la tarea que va ha asignar");
        return scanner.nextInt();
    }
    
    
}



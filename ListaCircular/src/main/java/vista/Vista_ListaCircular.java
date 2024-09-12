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

/**
 *
 * @author Yeison Romero Salinas
 */
public class Vista_ListaCircular {
    private Scanner scanner;
    
    public Vista_ListaCircular(){
        scanner = new Scanner(System.in);
    }
    
    
    public void mostraMenu(){
        
        System.out.println("\n -------------Menu------------------------");
        System.out.println("1: agregar");
        System.out.println("2: eliminar");
        System.out.println("3: imprimir");
        System.out.println("4: Es vacia");
        System.out.println("0: salir del programa");
        System.out.println("-------------Seleccione una opcion--------");
    }
    
    public int obtenerOpcion(){
        return scanner.nextInt();
    }
    
    public int obtenerNumero(String mensaje){
        System.out.print(mensaje);
        return scanner.nextInt();
    }
    
    public void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }
}

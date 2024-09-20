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
public class Vista_ListaCircularDoble {
    private Scanner scanner;
    
    public Vista_ListaCircularDoble(){
        scanner = new Scanner (System.in);
    }
    
    public void mostraMenu(){
        System.out.println("---------Menu de lista circular doble ----------------");
        System.out.println("1. agregar al inicio ");
        System.out.println("2. agregar al final");
        System.out.println("3. mostra de cabeza a cola");
        System.out.println("4. mostra de cola a cabeza");
        System.out.println("0. salir");
        System.out.println("seleccione una opcione");
    }
    
    public int recibirOpcionMenu(){
        return scanner.nextInt();
    }
    
    public int ingreseDato(){
        System.out.println("Ingrese el dato que se va a guardar");
        return scanner.nextInt();
    }
    
    public void mostrarMnesaje(String mensaje){
        System.out.println(mensaje);
    }
}

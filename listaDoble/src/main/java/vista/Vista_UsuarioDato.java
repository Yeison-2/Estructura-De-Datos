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
public class Vista_UsuarioDato {
    private Scanner scanner;
    
    public Vista_UsuarioDato(){
        this.scanner = new Scanner(System.in);
    }
    
    public void mostraMenu(){
        System.out.println("Menu");
        System.out.println("1. Agregar elemento al final");
        System.out.println("2. Agregar elemento al inicio");
        System.out.println("3. Eliminar elemento");
        System.out.println("4. Buscar elemento");
        System.out.println("5. Invertir lista");
        System.out.println("0. Salir");
        System.out.println("Seleccione una opcion");
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

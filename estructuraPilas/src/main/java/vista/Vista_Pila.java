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
public class Vista_Pila {
    private Scanner scanner;
    
    public Vista_Pila(){
        scanner = new Scanner(System.in);
    }
            
    public int mostraMenu(){
        System.out.println("----------Menu-----------");
        System.out.println("1. apliar");
        System.out.println("2. desapilar");
        System.out.println("3. ver cima");
        System.out.println("4. ver pila");
        System.out.println("5. salir");
        System.out.println("---------seleccione una opcion----------");
        return scanner.nextInt();
    }
    
    public int pedirDatoInt(){
        System.out.println("Ingrese el dato a agregar");
        
        return scanner.nextInt();
    }
    
    public void mostarMensajes(String mensaje){
        System.out.println(mensaje);
    }
    
    public void mostrarNumero(int numero){
        System.out.println("El numero que esta en la cima es " +numero);
    }
    
    
    
    
    
}

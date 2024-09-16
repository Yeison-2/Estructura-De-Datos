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
public class Vista_Juego {
    private Scanner scanner;
    
    public Vista_Juego(){
        scanner = new Scanner (System.in);
    }
    public void mostraMenu(){
        System.out.println("---- Menu parque juegos------------");
        System.out.println("1. agregar jugadores");
        System.out.println("2. mostrar jugadores de la lista");
        System.out.println("3. eliminar jugador de la lista");
        System.out.println("4. Jugar un turno");
        System.out.println("0. Salir");
        System.out.println("----Seleccione una opcion------");
    }
    // leer la opcion ingresada
    public int leerOpcion(){
        return scanner.nextInt();
    }
    
    //ingresar nombre del jugador
    public String nombreJugador(){
        System.out.println("Ingrese nombre de jugador");
        scanner.nextLine();
        return scanner.nextLine();
    }
    
    public void mostraMnesaje(String mensaje){
        System.out.println(mensaje);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.util.Scanner;

/**
 *
 * @author Yeison Romero
 */
public class Vista_EjercicioNotacionPolaca {
    private Scanner scanner;
    
    public Vista_EjercicioNotacionPolaca(){
        scanner = new Scanner(System.in);
    }
    
    public void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }
    
    public String pedirExpresion(){
        System.out.println("Ingrese la expresion en notacion polaca inversa ejemplo 3 4 + 5 * ");
        return scanner.nextLine();
    }
}

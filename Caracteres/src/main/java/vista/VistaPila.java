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
public class VistaPila {
    private Scanner scanner;
    
    public VistaPila(){
        scanner = new Scanner(System.in);
    }
    
    public String pedirExpresion(){
        System.out.println("Ingrese la expresion a validar");
        return scanner.nextLine();
    }
    
    public void resultados(boolean balanceado){
        if (balanceado) {
            System.out.println("ls exprecion esta balanceada");
        }else {
            System.out.println("No es balanceada");
        }
    }

}

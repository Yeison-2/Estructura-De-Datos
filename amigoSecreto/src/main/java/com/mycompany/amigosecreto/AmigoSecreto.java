/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.amigosecreto;

import controlador.Controlador_AmigoSecreto;
import java.util.Scanner;
import modelo.Lista_Doble;
import modelo.Lista_Numeros;
import vista.Vista_AmigoSecreto;

/**
 *
 * @author Yeison Romero Salinas
 */
public class AmigoSecreto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese numero de alumnos");
        int numAlumnos = scanner.nextInt();
        scanner.nextLine();

        Lista_Doble listaAlumno = new Lista_Doble();

        for (int i = 0; i < numAlumnos; i++) {
            System.out.print("Ingrese el nombre del alumno " + (i+1) + ": ");
            String nombre = scanner.nextLine();
            listaAlumno.agregarAlumno(nombre);
        }

        Lista_Numeros listaNumero = new Lista_Numeros();
        for (int i = 0; i < numAlumnos; i++) {

            listaNumero.agregarNumero(i);
        }

        Vista_AmigoSecreto view = new Vista_AmigoSecreto();

        Controlador_AmigoSecreto ctrl = new Controlador_AmigoSecreto(listaNumero, view, listaAlumno);
        ctrl.iniciar();
    }
}

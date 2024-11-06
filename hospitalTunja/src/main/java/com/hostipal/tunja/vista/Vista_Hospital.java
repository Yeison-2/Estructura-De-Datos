/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hostipal.tunja.vista;

import com.hostipal.tunja.controlador.Controlador_GestionColas;

import java.util.Scanner;

/**
 *
 * @author programador
 */
public class Vista_Hospital {
    private Controlador_GestionColas gestorColas;
    private Scanner scanner;


    public Vista_Hospital(){
        this.scanner = new Scanner(System.in);
    }

    public void setVisible(){
        boolean valido = true;
        do {
            System.out.println("Bienvenido al Hospital de Tunja");
            System.out.println("1. Registrar Paciente");
            System.out.println("2. Atender Siguiente Paciente");
            System.out.println("3. Generar Informe");
            System.out.println("4. Salir");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

            }


            
        } while (valido != false);
    }



}

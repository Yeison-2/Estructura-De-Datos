/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.util.Scanner;

/**
 *
 * @author programador
 */
public class Vista {
     private controlador.Controlador controlador;
    private Scanner scanner;

    public Vista(){
        scanner = new Scanner(System.in);
    }

    public void miMenu(){
        int opcion;
        
        do {
            System.out.println("---------Menu--------------");
            System.out.println("1. Encolar");
            System.out.println("2. Desencolar");
            System.out.println("3. Mostrar cola");
            System.out.println("4. salir");;
            System.out.println("Ingrese una opcion: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    int valor = pedirDato();
                    controlador.encolar(valor);
                    break;
                case 2:
                    int dato = controlador.desencolar();
                    if (dato != -1) {
                        mostrarMensaje("El dato desencolado es: "+dato);
                    }else {
                        mostrarMensaje("No se pudo desencolar");
                    }
                    break;
                case 3:
                    controlador.mostrarColar();
                    break;
                case 4:
                    mostrarMensaje("---------saliendo -------- ");
                    break;
                default:
                    mostrarMensaje("Opcion no valida");
            }


            
        } while (opcion != 4);
    }

    public int pedirDato(){
        System.out.println("Ingrese un dato: ");
        return scanner.nextInt();
    }

    public void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }
}

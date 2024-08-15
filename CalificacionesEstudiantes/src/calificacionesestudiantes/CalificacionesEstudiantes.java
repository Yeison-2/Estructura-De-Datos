/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calificacionesestudiantes;

import controlador.Controlador_PromEstudiantes;
import java.util.Scanner;
import modelo.Modelo_PromEstudiantes;
import vista.Vista_PromEstudiante;

/**
 *
 * @author Yeison Romero Salinas
 */
public class CalificacionesEstudiantes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Modelo_PromEstudiantes model = new Modelo_PromEstudiantes(0, 0);
        Vista_PromEstudiante view = new Vista_PromEstudiante();
        Controlador_PromEstudiantes ctrl = new Controlador_PromEstudiantes(model, view);
        ctrl.iniciar();
    }
    
}

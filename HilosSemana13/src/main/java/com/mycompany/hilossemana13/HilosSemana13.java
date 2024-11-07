package com.mycompany.hilossemana13;

import controlador.ControladorHilo;
import modelo.ModeloHilo;
import vista.VistaEjecucion;
import vista.VistaHilo;

public class HilosSemana13 {
    public static void main(String[] args) {
        VistaHilo vistaHilo = new VistaHilo();
        VistaEjecucion vistaEjecucion = new VistaEjecucion();
        ModeloHilo modeloHilo = new ModeloHilo();
        new ControladorHilo(vistaHilo, vistaEjecucion, modeloHilo);
    }
}

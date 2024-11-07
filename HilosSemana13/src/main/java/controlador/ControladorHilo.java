package controlador;

import modelo.ModeloHilo;
import vista.VistaEjecucion;
import vista.VistaHilo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorHilo {
    private VistaHilo vistaHilo;
    private VistaEjecucion vistaEjecucion;
    private ModeloHilo modeloHilo;

    public ControladorHilo(VistaHilo vistaHilo, VistaEjecucion vistaEjecucion, ModeloHilo modeloHilo) {
        this.vistaHilo = vistaHilo;
        this.vistaEjecucion = vistaEjecucion;
        this.modeloHilo = modeloHilo;

        this.vistaHilo.getBotonIniciar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                iniciarSimulacion();
            }
        });
    }

    private void iniciarSimulacion() {
        try {
            int duracionHilo1 = Integer.parseInt(vistaHilo.getCampoHilo1().getText());
            int duracionHilo2 = Integer.parseInt(vistaHilo.getCampoHilo2().getText());
            int duracionHilo3 = Integer.parseInt(vistaHilo.getCampoHilo3().getText());

            modeloHilo.ejecucionHilo(duracionHilo1, "Hilo 1", () -> vistaEjecucion.actualizarContador(duracionHilo1));
            modeloHilo.ejecucionHilo(duracionHilo2, "Hilo 2", () -> vistaEjecucion.actualizarContador(duracionHilo2));
            modeloHilo.ejecucionHilo(duracionHilo3, "Hilo 3", () -> vistaEjecucion.actualizarContador(duracionHilo3));
        } catch (NumberFormatException ex) {
            ex.printStackTrace();
        }
    }
}
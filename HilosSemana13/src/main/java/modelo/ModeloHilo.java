/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author programador
 */
public class ModeloHilo {

    public void ejecucionHilo(int duracion, String nombreHilo, Runnable actualizar) {
        new Thread(() -> {
            try {
                for (int i = 0; i < duracion; i++) {
                    Thread.sleep(1000);
                    actualizar.run();
                }
                System.out.println(nombreHilo + " FINALIZADO");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}

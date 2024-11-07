/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;

/**
 *
 * @author programador
 */
public class VistaEjecucion extends JFrame{
    private JLabel etiquetaContador;
    private JPanel panelAnimacion;
    private int post = 0;

    public VistaEjecucion() {
        setTitle("Ejecucion de hilos animaciones");
        setSize(900, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new BorderLayout());

        etiquetaContador = new JLabel("tiempo: 0");
        etiquetaContador.setHorizontalAlignment(SwingConstants.CENTER);
        add(etiquetaContador, BorderLayout.NORTH);

        panelAnimacion = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(Color.blue);
                g.fillOval(post, getHeight() / 2, 30, 30);
            }
        };

        add(panelAnimacion, BorderLayout.CENTER);
        setVisible(true);
    }

    public void actualizarContador(int segundos) {
        etiquetaContador.setText("Tiempo " + segundos + "s");
        post += 10;
        if (post >= panelAnimacion.getWidth()) {
            post = 0;
        }
        panelAnimacion.repaint();
    }
}

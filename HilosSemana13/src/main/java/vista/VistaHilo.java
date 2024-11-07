/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.PageAttributes;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author programador
 */
public class VistaHilo extends JFrame{
    private JTextField campoHilo1;
    private JTextField campoHilo2;
    private JTextField campoHilo3;
    
    private JButton botonInicial;
    
    public VistaHilo(){
        setTitle("Simulacion Hilos");
        setSize(400,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4,2));
        
        add(new JLabel("Duracion Hilo1 segundos"));
        campoHilo1 = new JTextField();
        add(campoHilo1);
        
        
        add(new JLabel("Duracion Hilo2 segundos"));
        campoHilo2 = new JTextField();
        add(campoHilo2);
        
        
        add(new JLabel("Duracion Hilo3 segundos"));
        campoHilo3 = new JTextField();
        add(campoHilo3);
        
        botonInicial = new JButton("IniciarSimulacion");
        add(botonInicial);
        
        setVisible(true);
        
    }
    
    public JTextField getCampoHilo1(){
        return campoHilo1;
    }
    
    public JTextField getCampoHilo2(){
        return campoHilo2;
    }
    
    public JTextField getCampoHilo3(){
        return campoHilo3;
    }
    
    public JButton getBotonIniciar(){
        return botonInicial;
    }
    
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author programador
 */
public class ContadorVista {
    private JFrame marco;
    private JButton  BotonInicial;
    private JButton BotonInicial2;
    private JLabel etiqueta;
    private JLabel etiqueta2;
    
    public ContadorVista(){
        marco = new JFrame("contador de hilos");
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setSize(300,200);
        marco.setLayout(new FlowLayout());
        //boton 1
        etiqueta = new JLabel("Contador: 0");
        BotonInicial = new JButton("iniciar");
        marco.add(etiqueta);
        marco.add(BotonInicial);
        marco.setVisible(true);
        
        //boton 2
        etiqueta2 = new JLabel("Contador: 0");
        BotonInicial2 = new JButton("iniciar2");
        marco.add(etiqueta2);
        marco.add(BotonInicial2);
        
    }
    
    public void establecerTexto(String texto){
        etiqueta.setText(texto);
    }
    
    public void agregarBoton(ActionListener escuchar){
        BotonInicial.addActionListener(escuchar);
    }
    
    public void desabilitar(){
        BotonInicial.setEnabled(false);
    }
    
    public void establecerTexto2(String texto){
        etiqueta2.setText(texto);
    }
    
    public void agregarBoton2(ActionListener escuchar){
        BotonInicial2.addActionListener(escuchar);
    }
    
    public void desabilitar2(){
        BotonInicial2.setEnabled(false);
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.Cola;
import modelo.Lista;
import modelo.Nodo;
import modelo.Pila;

/**
 *
 * @author programador
 */
public class Controlador_Tareas {
    private Lista tareasGenerales;
    private Pila tareasUrgentes;
    private Cola tareasComunes;
    
    
    public Controlador_Tareas(){
        this.tareasGenerales = new Lista();
        this.tareasUrgentes = new Pila();
        this.tareasComunes = new Cola();
    }
    
    public void agregarTareaGeneral(String descripcion, int nivel) {
        tareasGenerales.agregarTareaLista(descripcion,nivel);
    }

    public void agregarTareaUrgente(String descripcion, int nivel) {
        tareasUrgentes.apilar(descripcion,nivel);
    }

    public void agregarTareaComun(String descripcion, int nivel) {
        tareasComunes.encolar(descripcion,nivel);
    }

    public void mostrarTareas() {
        System.out.println("Tareas Urgentes:");
        tareasUrgentes.mostrar();
        System.out.println("Tareas Comunes:");
        tareasComunes.mostrar();
    }
    
    public Nodo getCabeza(){
        return tareasGenerales.getCabeza();
    }
}

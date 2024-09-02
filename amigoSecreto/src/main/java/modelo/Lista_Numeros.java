/**
 * Universidad juan de castellanos
 * Asignatura: Estructura de Datos
 * Descripción: 
 * Fecha: //
 * Autor: Yeison Stiven Romero Salinas
 */

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package modelo;

import java.util.Random;

/**
 *
 * @author Yeison Romero Salinas
 */
public class Lista_Numeros {
    private Numero cabeza;
    
    public Lista_Numeros(){
        this.cabeza= null;
    }
    
    public void agregarNumero(int valor){
        Numero nuevo = new Numero(valor);
        if(cabeza != null){
            cabeza = null;
        }else{
            Numero actual= cabeza;
            
            while(actual.getSiguiente()!= null){
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevo);
        }
    }
    
    public int sacarAleatorio(){
        if (cabeza == null) {
            throw new IllegalStateException("No hay numero disponible");
            
        }
        Random random = new Random();
        int indiceAleatorio = random.nextInt(contarNumeros);
        Numero actual = cabeza;
        Numero anterior = null;
        
        for(int i= 0;i < indiceAleatorio;i++){
            anterior = actual;
            actual = actual.getSiguiente();
            
        }
        
        int valor = actual.getValor();
        if (anterior == null) {
            cabeza = actual.getSiguiente();
        }else {
            anterior.setSiguiente(actual.getSiguiente());
            
        }
        return valor;
    }
    
    
    public int contarNumeros(){
        int conteo =0;
        Numero actual = cabeza;
        while(actual != null){
            conteo++;
            actual = actual.getSiguiente();
        }
        return conteo;
    }
    
    
    
}

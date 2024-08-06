/**
 * Docente: Magda Pineda
 * Universidad juan de castellanos
 * Asignatura: POO
 * Descripción: 
 * Fecha: //
 * Autor: Yeison Stiven Romero Salinas
 */

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package modelo;

/**
 *
 * @author Yeison Romero Salinas
 */
public class Modelo_Calculadora {
    private int numero1;
    private int numero2;

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    //mul ,div, sum, rest
    //mult
    public int multiplicar(){
        return this.numero1 * this.numero2;
    }
    //div
    public int dividir(){
        return this.numero1 / this.numero2;
    }
    
    //sum
    public int sumar(){
        return this.numero1 + this.numero2;
    }
    
    //rest
    public int restar(){
        return this.numero1 - this.numero2;
    }
    
}

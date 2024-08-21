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

/**
 *
 * @author Yeison Romero Salinas
 */
public class ListaSimple {
 private Nodo cabeza;
 
 public ListaSimple(){
     this.cabeza = null;
 }
 
 
 public void agregar(int dato){
     Nodo newNodo = new Nodo(dato);
     
     if(cabeza == null){
         cabeza = newNodo;
     }else {
         Nodo temp = cabeza;
         while(temp.siguiente != null){
                temp = temp.siguiente;
         }
         temp.siguiente = newNodo;
     }
 }
 
 public void eliminar(){
     if (cabeza != null){
         cabeza = cabeza.siguiente;
     }else {
         System.out.println("la lista esta vasia ");
     }
     
 }
 
 public void mostraLista(){
     Nodo temp = cabeza;
     while(temp != null){
         System.out.println(temp.dato + " -> ");
         temp = temp.siguiente;
     }
     System.out.println("null");
 }
 
 public Nodo getCabeza(){
     return cabeza;
 }
}

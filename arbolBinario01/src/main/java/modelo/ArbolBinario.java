/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author programador
 */
public class ArbolBinario {
    private Nodo raiz;
    
    public ArbolBinario(){
        this.raiz = null;
    }
    public void agregar(int valor){
        raiz = agregarNodo(raiz, valor);
    }
    
    public void eliminar(int valor){
        raiz = eliminarR(raiz, valor);
    }
    
    public Nodo agregarNodo(Nodo actual, int valor){
        if (actual == null) {
            return new Nodo(valor);
        }
        if (valor < actual.valor) {
            actual.izquierda = agregarNodo(actual.izquierda, valor);
        } else if (valor > actual.valor) {
            actual.derecha = agregarNodo(actual.derecha, valor);
        }
        return actual;
    }
    
    public Nodo eliminarR(Nodo actual, int valor){
        if (actual == null) {
            return null;
        }
        if (valor == actual.valor) {
            if (actual.izquierda == null && actual.derecha == null) {
                return null;
            }
            if (actual.izquierda == null) {
                return actual.derecha;
            }
            if (actual.derecha == null) {
                return actual.izquierda;
            }
            //validadcion de nodo de dos hijos
            int valorMenor = encontrarValor(actual.derecha);
            actual.valor = valorMenor;
            actual.derecha = eliminarR(actual.derecha,valorMenor);
            return actual;
            }
            if (valor < actual.valor) {
                actual.izquierda = eliminarR(actual.izquierda, valor);
                return actual;
            
        }
            return actual;
    }
    
    private int encontrarValor(Nodo raiz){
        return (raiz.izquierda == null) ? raiz.valor: encontrarValor(raiz.izquierda);
    }
    //hacer metodo para incorporar inorden
    //preorden 
    //posorden
    
    public Nodo getRaiz(){
        return raiz;
    }
    
    public void inOrden(Nodo nodo) {
        if (nodo != null) {//esta
            inOrden(nodo.izquierda);
            System.out.print(nodo.valor + " ");
            inOrden(nodo.derecha);
        }
    }

    public void preOrden(Nodo nodo) {
        if (nodo != null) {
            System.out.print(nodo.valor + " ");
            preOrden(nodo.izquierda);
            preOrden(nodo.derecha);
        }
    }

    public void postOrden(Nodo nodo) {
        if (nodo != null) {
            postOrden(nodo.izquierda);
            postOrden(nodo.derecha);
            System.out.print(nodo.valor + " ");
        }
    }
    
    
}




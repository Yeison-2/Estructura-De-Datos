/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Admin
 */
public class ListaDinamica {
    private int[] lista;

    private int longitud;
    
    
    
    public ListaDinamica() {
        lista = new int[10];
        longitud = 0;
    }

    public int[] getLista() {
        return lista;
    }

    public void setLista(int[] lista) {
        this.lista = lista;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
    
    

    public String agregarElemento(int elemento) {
        if (longitud == lista.length) {
            redimencionarArreglo();
        }

        lista[longitud++] = elemento;
        
        return "Elemento " + elemento + " agregado";
    }

    public String eliminarElemento(int elemento) {
        int indice = buscarElemento(elemento);
        if (indice != -1) {
            for (int i = indice; i < longitud - 1; i++) {
                lista[i] = lista[i + 1];
            }

            longitud--;
            
           return  "Elemento " + elemento + " eliminado";

        } else {
            return "Elemento " + elemento + " no encontrado";
        }
    }

    public void mostrarElementos() {
        if (longitud == 0) {
            System.out.println("Lista vacia");
        } else {
            for (int i = 0; i < lista.length; i++) {
                System.out.println(lista[i] + " ");
            }
        }

    }

    public void redimencionarArreglo() {
        int[] nuevoArreglo = new int[lista.length * 2];
        System.arraycopy(lista, 0, nuevoArreglo, 0, lista.length);
        lista=nuevoArreglo;
    }
    
    public int buscarElemento(int elemento){
        for (int i = 0; i < longitud; i++) {
            return i;
                
            }
        return -1;
    }
}

package controlador;

import modelo.Modelo_ListaCircular;
import vista.Vista_ListaCircular;

public class Controlador_ListaCircular {
    private Modelo_ListaCircular model;
    private Vista_ListaCircular view;
    

    public Controlador_ListaCircular(Modelo_ListaCircular model, Vista_ListaCircular view){
        this.model = model;
        this.view = view;
        
    }

    public void iniciar(){
        int opcion;
        
        do{
            view.mostraMenu();
            opcion = view.obtenerOpcion();
            prosesar(opcion);
        }while(opcion != 0);
    }
    
    public void prosesar(int opcion) {
        switch (opcion) {
            case 1:
                agregar();
                break;
            case 2:
                eliminar();
                break;
            case 3:
                imprimir();
                break;
            case 4:
                esVacia();
                break;
            case 0:
                System.out.println("saliendo del programad");
                break;
            default:
                view.mostrarMensaje("Opcion invalida");
        }
    }

    public void agregar(){
        int dato = view.obtenerNumero("Ingrese el dato a agregar");
        model.agregar(dato);
        view.mostrarMensaje(dato+" se agrego a la lista circular");
    }

    public void eliminar(){
        int dato = view.obtenerNumero("Ingrese el dato a eliminar");
        model.eliminar(dato);
        view.mostrarMensaje(dato+" se elimino a la lista circular");
    }
    
    public void imprimir(){
        model.imprimir();
    }

    public void esVacia(){
        
        if (model.esVacia()) {
            System.out.println("esta vacia");
        }else{
            System.out.println("no esta vacia");
        }
    }
}

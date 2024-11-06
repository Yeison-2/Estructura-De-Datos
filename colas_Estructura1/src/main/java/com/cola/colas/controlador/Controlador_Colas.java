package com.cola.colas.controlador;

import com.cola.colas.modelo.Cola;
import com.cola.colas.vista.Vista_Colas;

public class Controlador_Colas {
    private Cola model;
    private Vista_Colas view;

    public Controlador_Colas(Cola model, Vista_Colas view){
        this.model = model;
        this.view = view;
    }

    public void encolar(int dato){
        model.encolar(dato);
    }

    public int desencolar(){
        return model.desencolar();
    }

    public void mostrarColar(){
        model.mostraCola();
    }
    
   

   
    
}

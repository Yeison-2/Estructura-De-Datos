/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.Lista_Vista;
import modelo.ListaDinamica;

/**
 *
 * @author Admin
 */
public class Lista_Controlador implements ActionListener {

    Lista_Vista view;
    ListaDinamica model;

    public Lista_Controlador(Lista_Vista view, ListaDinamica model) {
        this.view = view;
        this.model = model;
        this.view.addListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        try {
            int elemento = Integer.parseInt(view.getNumero());

            switch (ae.getActionCommand()) {
                case "agregar":
                    {
                        String respuesta = model.agregarElemento(elemento);
                        view.setResultado(respuesta);
                        break;
                    }
                case "eliminar":
                    {
                        String respuesta = model.eliminarElemento(elemento);
                        view.setResultado(respuesta);
                        break;
                    }
                case "buscar":
                    {
                        int respuesta = model.buscarElemento(elemento);
                        break;
                    }
                case "mostrar":
                    model.mostrarElementos();
                    view.setResultado("Error controlador _ metodo mostra datos");
                    break;
                default:
                    break;
            }

        } catch (Exception e) {
            view.showError("La accion no se puede realizar");
        }
    }

}
